import java.io.*;
import java.util.List;

import org.apache.poi.xssf.usermodel.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.model.ModelStudent;
public class ExcelExporter {

    public static void exportToExcel(List<ModelStudent> studentList) {
        XSSFWorkbook excelJTableExporter = new XSSFWorkbook();
        XSSFSheet excelSheet = excelJTableExporter.createSheet("Student Data");

        // Create header row
        XSSFRow headerRow = excelSheet.createRow(0);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Beginning Year");
        headerRow.createCell(3).setCellValue("End Year");
        headerRow.createCell(4).setCellValue("Major");
        headerRow.createCell(5).setCellValue("Education Quality");
        headerRow.createCell(6).setCellValue("Phone");

        // Populate data rows
        for (int i = 0; i < studentList.size(); i++) {
            ModelStudent student = studentList.get(i);
            XSSFRow dataRow = excelSheet.createRow(i + 1);

            dataRow.createCell(0).setCellValue(student.getID());
            dataRow.createCell(1).setCellValue(student.getName());
            dataRow.createCell(2).setCellValue(student.getBeginningYear());
            dataRow.createCell(3).setCellValue(student.getEndYear());
            dataRow.createCell(4).setCellValue(student.getMajor());
            dataRow.createCell(5).setCellValue(student.getEducationQuality());
            dataRow.createCell(6).setCellValue(student.getPhone());
        }

        // Save the workbook to a file
        try {
            JFileChooser excelFileChooser = new JFileChooser();
            excelFileChooser.setDialogTitle("Save As");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xlsx");
            excelFileChooser.setFileFilter(fnef);

            int excelChooser = excelFileChooser.showSaveDialog(null);

            if (excelChooser == JFileChooser.APPROVE_OPTION) {
                FileOutputStream excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                BufferedOutputStream excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null, "Exported Successfully !!!........");

                excelBOU.close();
                excelFOU.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Assuming you have a List of ModelStudent objects
        List<ModelStudent> studentList = getStudentList();

        exportToExcel(studentList);
    }

    private static List<ModelStudent> getStudentList() {
        // Implement your logic to fetch the List<ModelStudent> from your application
        // For example, you might retrieve it from a database or generate it in some way
        // For the sake of this example, I'll create a dummy list.
        return List.of(
                new ModelStudent("1", "John Doe", 2020, 2024, "Computer Science", "Good", "123-456-7890"),
                new ModelStudent("2", "Jane Doe", 2019, 2023, "Mathematics", "Excellent", "987-654-3210")
        );
    }
}
