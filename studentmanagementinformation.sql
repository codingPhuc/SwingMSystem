-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2023 at 06:42 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentmanagementinformation`
--

-- --------------------------------------------------------

--
-- Table structure for table `certificatemanagement`
--

CREATE TABLE `certificatemanagement` (
  `CertificateID` int(11) NOT NULL,
  `StudentID` varchar(10) DEFAULT NULL,
  `CertificateName` varchar(250) DEFAULT NULL,
  `IssueDate` date DEFAULT NULL,
  `ExpiryDate` date DEFAULT NULL,
  `Grade` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `certificatemanagement`
--

INSERT INTO `certificatemanagement` (`CertificateID`, `StudentID`, `CertificateName`, `IssueDate`, `ExpiryDate`, `Grade`) VALUES
(86, '520F8650', 'python', '2023-12-01', '2023-12-20', 8.5),
(87, '700H2039', 'java', '2023-12-18', '2023-12-20', 10),
(88, '720F9746', 'javasrcipt', '2023-12-01', '2023-12-20', 8.5),
(89, '720F9911', 'C#', '2023-12-01', '2023-12-20', 8.5);

-- --------------------------------------------------------

--
-- Table structure for table `loginhistory`
--

CREATE TABLE `loginhistory` (
  `LoginHistoryID` int(11) NOT NULL,
  `UserID` int(11) DEFAULT NULL,
  `TimeLogin` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loginhistory`
--

INSERT INTO `loginhistory` (`LoginHistoryID`, `UserID`, `TimeLogin`) VALUES
(78, 2, '2023-12-15 12:35:20');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID` varchar(10) NOT NULL,
  `Name` varchar(250) DEFAULT NULL,
  `BeginningYear` int(11) DEFAULT NULL,
  `EndYear` int(11) DEFAULT NULL,
  `Major` varchar(250) DEFAULT NULL,
  `EducationQuality` varchar(10) DEFAULT NULL,
  `Phone` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `Name`, `BeginningYear`, `EndYear`, `Major`, `EducationQuality`, `Phone`) VALUES
('520F8650', 'Alice Johnson', 2020, 2024, 'IT', 'JP', '123-456-78'),
('700H2039', 'phuc', 2000, 2013, 'BA', 'HQ', '+123213213'),
('72001891', 'Alice Johnson', 2020, 2024, 'BA', 'RU', '123-456-78'),
('720F9746', 'Phuc Doe', 2020, 2024, 'BA', 'JP', '123-456-78'),
('720F9911', 'Jane Doe', 2020, 2024, 'BA', 'JP', '123-456-78');

-- --------------------------------------------------------

--
-- Table structure for table `usermanagement`
--

CREATE TABLE `usermanagement` (
  `UserID` int(11) NOT NULL,
  `UserName` varchar(250) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `ProfilePicture` mediumtext DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `PhoneNumber` varchar(10) DEFAULT NULL,
  `Status` int(11) DEFAULT NULL CHECK (`Status` in (0,1)),
  `UserRole` int(11) DEFAULT NULL CHECK (`UserRole` in (0,1,2))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usermanagement`
--

INSERT INTO `usermanagement` (`UserID`, `UserName`, `Password`, `ProfilePicture`, `Age`, `PhoneNumber`, `Status`, `UserRole`) VALUES
(2, 'admin', 'admin', '\\src\\main\\resources\\com\\Icon\\DefaultUserImage.png', 30, '1234567890', 0, 2),
(8, 'manager', '12345', '\\src\\main\\resources\\com\\Icon\\DefaultUserImage.png', 18, '+123213232', 0, 0),
(9, 'employee', '12345', '\\src\\main\\resources\\com\\Icon\\DefaultUserImage.png', 19, '+123123213', 0, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `certificatemanagement`
--
ALTER TABLE `certificatemanagement`
  ADD PRIMARY KEY (`CertificateID`),
  ADD KEY `StudentID` (`StudentID`);

--
-- Indexes for table `loginhistory`
--
ALTER TABLE `loginhistory`
  ADD PRIMARY KEY (`LoginHistoryID`),
  ADD KEY `FK_LoginHistory_UserID` (`UserID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `usermanagement`
--
ALTER TABLE `usermanagement`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `certificatemanagement`
--
ALTER TABLE `certificatemanagement`
  MODIFY `CertificateID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=90;

--
-- AUTO_INCREMENT for table `loginhistory`
--
ALTER TABLE `loginhistory`
  MODIFY `LoginHistoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT for table `usermanagement`
--
ALTER TABLE `usermanagement`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `certificatemanagement`
--
ALTER TABLE `certificatemanagement`
  ADD CONSTRAINT `certificatemanagement_ibfk_1` FOREIGN KEY (`StudentID`) REFERENCES `student` (`ID`) ON DELETE CASCADE;

--
-- Constraints for table `loginhistory`
--
ALTER TABLE `loginhistory`
  ADD CONSTRAINT `FK_LoginHistory_UserID` FOREIGN KEY (`UserID`) REFERENCES `usermanagement` (`UserID`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
