-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 28, 2024 at 02:52 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `govt_school`
--

-- --------------------------------------------------------

--
-- Table structure for table `school_registration`
--

CREATE TABLE `school_registration` (
  `regNum` text NOT NULL,
  `Name` text NOT NULL,
  `dob` text NOT NULL,
  `nationality` text NOT NULL,
  `date_on_entry` varchar(127) NOT NULL,
  `class_on_entry` text NOT NULL,
  `age` int(127) NOT NULL,
  `state` text NOT NULL,
  `sex` text NOT NULL,
  `date on leaving` varchar(127) NOT NULL,
  `last_class_completed` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `school_registration`
--

INSERT INTO `school_registration` (`regNum`, `Name`, `dob`, `nationality`, `date_on_entry`, `class_on_entry`, `age`, `state`, `sex`, `date on leaving`, `last_class_completed`) VALUES
('e', 'EFS', 'efs', 'fes', 'ef', '100 LEVEL', 22, 'ABIA', 'MALE', 'eda', '100 LEVEL');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
