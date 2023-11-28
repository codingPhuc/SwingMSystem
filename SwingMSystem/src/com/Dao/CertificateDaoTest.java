package com.Dao;

import com.model.ModelCertificate;
import java.util.List;

public class CertificateDaoTest {
    public static void main(String[] args) {
        // Create an instance of CertificateDao
        CertificateDao certificateDao = new CertificateDao();

        // Test addCertificate
        // Note: You should replace the StudentID with an actual student ID from the database

        // Adding multiple certificates
        certificateDao.addCertificate("200H7038", "Java Certification", "2023-01-01", "2024-02-01", 95.5f);
        certificateDao.addCertificate("200H7038", "Python Certification", "2023-02-01", "2024-02-01", 98.0f);
        certificateDao.addCertificate("200H7038", "Web Development Certification", "2023-03-01", "2024-03-01", 92.5f);

        // Test getAllCertificates
        System.out.println("All Certificates:");
        List<ModelCertificate> allCertificates = certificateDao.getAllCertificates();
        for (ModelCertificate certificate : allCertificates) {
            System.out.println(certificate);
        }

        // Test updateCertificate
        // Note: You should replace the CertificateID with an actual certificate ID from the database
        certificateDao.updateCertificate(1, "200H7038", "Updated Java Certification", "2023-02-01", "2024-02-01", 98.0f);

        // Test deleteCertificate
        // Note: You should replace the CertificateID with an actual certificate ID from the database
        certificateDao.deleteCertificate(1);
    }
}
