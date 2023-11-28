/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.fbr;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CodeGenerator {
    public static void main(String[] args) {
        // Example usage
        String generatedCode = generateCode(2021, "IT", "HQ");
        System.out.println("Generated Code: " + generatedCode);
    }

    public static String generateCode(int enrollmentYear, String departmentCode, String qualityCode) {
        Map<String, String> switchedTrainingSystemCodes = new HashMap<>();
        switchedTrainingSystemCodes.put("RU", "0");
        switchedTrainingSystemCodes.put("JP", "F");
        switchedTrainingSystemCodes.put("HQ", "H");

        Map<String, String> switchedDepartmentCodes = new HashMap<>();
        switchedDepartmentCodes.put("FL", "0");
        switchedDepartmentCodes.put("ID", "1");
        switchedDepartmentCodes.put("AC", "2");
        switchedDepartmentCodes.put("SSH", "3");
        switchedDepartmentCodes.put("EE", "4");
        switchedDepartmentCodes.put("IT", "5");
        switchedDepartmentCodes.put("AS", "6");
        switchedDepartmentCodes.put("BA", "7");
        switchedDepartmentCodes.put("CE", "8");
        switchedDepartmentCodes.put("EHS", "9");
        switchedDepartmentCodes.put("LC", "A");
        switchedDepartmentCodes.put("FB", "B");
        switchedDepartmentCodes.put("MT", "C");
        switchedDepartmentCodes.put("SS", "D");
        switchedDepartmentCodes.put("LW", "E");
        switchedDepartmentCodes.put("DP", "H");
        // Extract the last two digits of the enrollment year
        int lastTwoDigitsOfYear = enrollmentYear % 100;

        // Ensure the last two digits are in the range 0-99
        lastTwoDigitsOfYear = Math.floorMod(lastTwoDigitsOfYear, 100);

        // Convert the last two digits to a string
        String yearCode = String.format("%02d", lastTwoDigitsOfYear);

        // Ensure the department code is uppercase
        departmentCode = switchedDepartmentCodes.get(departmentCode.toUpperCase()) ;

        // Ensure the quality code is uppercase
        qualityCode = switchedTrainingSystemCodes.get(qualityCode.toUpperCase());

        // Generate a random 4-digit number
        String randomNumbers = String.format("%04d", new Random().nextInt(10000));

        // Combine the components to form the final code
        return  departmentCode +yearCode  + qualityCode + randomNumbers;
    }
}
