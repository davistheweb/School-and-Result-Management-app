-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 17, 2024 at 02:53 AM
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
-- Table structure for table `department_registration`
--

CREATE TABLE `department_registration` (
  `id` int NOT NULL,
  `session` int NOT NULL,
  `semester` text COLLATE utf8mb4_general_ci NOT NULL,
  `reg_number` text COLLATE utf8mb4_general_ci NOT NULL,
  `name_of_student` text COLLATE utf8mb4_general_ci NOT NULL,
  `number_in_level` int NOT NULL,
  `lvl` int NOT NULL,
  `fee` varchar(127) COLLATE utf8mb4_general_ci NOT NULL,
  `passport` longblob
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department_registration`
--

INSERT INTO `department_registration` (`id`, `session`, `semester`, `reg_number`, `name_of_student`, `number_in_level`, `lvl`, `fee`, `passport`) VALUES
(9, 2022, '1ST', '202110848885EG', 'JOSIAH DAVIS', 200, 200, 'PAID', NULL),
(10, 2022, '1ST', '202110848885EH', 'JOSIAH ', 200, 200, 'PAID', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department_registration`
--
ALTER TABLE `department_registration`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department_registration`
--
ALTER TABLE `department_registration`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
