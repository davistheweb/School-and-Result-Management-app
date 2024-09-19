-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 19, 2024 at 12:18 PM
-- Server version: 8.3.0
-- PHP Version: 8.1.2-1ubuntu2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `imsu_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `school_registration`
--

CREATE TABLE `school_registration` (
  `id` int NOT NULL,
  `regNum` text COLLATE utf8mb4_general_ci NOT NULL,
  `Name` text COLLATE utf8mb4_general_ci NOT NULL,
  `dob` text COLLATE utf8mb4_general_ci NOT NULL,
  `nationality` text COLLATE utf8mb4_general_ci NOT NULL,
  `date_on_entry` text COLLATE utf8mb4_general_ci NOT NULL,
  `class_on_entry` varchar(127) COLLATE utf8mb4_general_ci NOT NULL,
  `age` int NOT NULL,
  `state` text COLLATE utf8mb4_general_ci NOT NULL,
  `gender` text COLLATE utf8mb4_general_ci NOT NULL,
  `date_on_leaving` varchar(127) COLLATE utf8mb4_general_ci NOT NULL,
  `last_class_completed` text COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `school_registration`
--
ALTER TABLE `school_registration`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `school_registration`
--
ALTER TABLE `school_registration`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
