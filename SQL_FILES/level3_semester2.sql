-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 12, 2024 at 05:40 AM
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
-- Database: `imo_state_university`
--

-- --------------------------------------------------------

--
-- Table structure for table `level3_semester2`
--

CREATE TABLE `level3_semester2` (
  `id` int(11) NOT NULL,
  `session` int(127) NOT NULL,
  `semester` text NOT NULL,
  `level` int(255) NOT NULL,
  `reg_number` text NOT NULL,
  `name_of_student` text NOT NULL,
  `fee` varchar(127) NOT NULL,
  `passport` longblob NOT NULL,
  `course` text NOT NULL,
  `grade` text NOT NULL,
  `total` int(127) NOT NULL,
  `gpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `level3_semester2`
--


--
-- Indexes for dumped tables
--

--
-- Indexes for table `level3_semester2`
--
ALTER TABLE `level3_semester2`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `level3_semester2`
--
ALTER TABLE `level3_semester2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
