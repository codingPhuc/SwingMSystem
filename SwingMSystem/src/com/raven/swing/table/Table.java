package com.raven.swing.table;

//import com.raven.swing.scrollbar.ScrollBarCustom;
import com.model.ModelActionStudent;
import com.model.ModelProfile;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import com.model.ModelActionUser;

public class Table extends JTable {

        public Table() {
        setOpaque(false);
        getTableHeader().setBackground(new Color(255, 255, 255));
        setBackground(new Color(0, 0, 0, 0));
        setShowHorizontalLines(true);
        setGridColor(new Color(30, 30, 30, 50));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 ==  6) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) {
                if (o instanceof ModelProfile) {
                    ModelProfile data = (ModelProfile) o;
                    Profile cell = new Profile(data);
                    if (selected) {
                        cell.setBackground(new Color(239, 244, 255));
                    } else {
                        cell.setBackground(Color.WHITE);
                    }
                    return cell;

                } else if (o instanceof ModelActionUser) {
                    ModelActionUser data = (ModelActionUser) o;
                    Action cell = new Action(data);
                    if (selected) {
                        cell.setBackground(new Color(239, 244, 255));
                    } else {
                        cell.setBackground(Color.WHITE);
                    }
                    return cell;
                } 
//                else if (o instanceof ModelActionStudent) {
//                    ModelActionStudent data = (ModelActionStudent) o;
//                    Action cell = new Action(data);
//                    if (selected) {
//                        cell.setBackground(new Color(239, 244, 255));
//                    } else {
//                        cell.setBackground(Color.WHITE);
//                    }
//                    return cell;
//                } 
                else {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);
                    setBorder(noFocusBorder);
                    com.setForeground(new Color(0, 0, 0, 0));
                    JLabel label = new JLabel(o + "");
                    label.setForeground(new Color(102, 102, 102));
                    return label;
                }
            }
        });
    }


    @Override
    public TableCellEditor getCellEditor(int row, int col) {
        if (col == 6) {
            return new TableCellAction();
        } else {
            return super.getCellEditor(row, col);
        }
    }

    public void addRow(Object[] row) {
        
        DefaultTableModel mod = (DefaultTableModel) getModel();
        System.out.print(mod);
        mod.addRow(row);
    }
    public void removeLastColumn() {
    DefaultTableModel tableModel = (DefaultTableModel) getModel();
    
    int lastColumnIndex = getColumnCount() - 1;
    
    // Check if there is at least one column in the table
    if (lastColumnIndex >= 0) {
        // Remove the last column from the table model
        tableModel.addColumn(getColumnName(lastColumnIndex), new Object[0]);
        tableModel.setColumnCount(lastColumnIndex);
    }
}

     public void ClearTable() {
        DefaultTableModel mod = (DefaultTableModel) getModel();
    while (mod.getRowCount() > 0) {
        mod.removeRow(0);
    }
    // Notify the table that the data has changed
    mod.fireTableDataChanged();
    }
}

//    public void fixTable(JScrollPane scroll) {
//        scroll.getViewport().setOpaque(false);
//        scroll.setViewportBorder(null);
//        scroll.setVerticalScrollBar(new ScrollBarCustom());
//        JPanel p = new JPanel();
//        p.setOpaque(false);
//        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
//        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
//    }

