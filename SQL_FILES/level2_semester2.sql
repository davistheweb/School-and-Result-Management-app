SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `level2_semester2` (
  `id` int(11) NOT NULL,
  `session` int(127) NOT NULL,
  `semester` text NOT NULL,
  `level` int(255) NOT NULL,
  `reg_number` text NOT NULL,
  `name_of_student` text NOT NULL,
  `fee` varchar(127) NOT NULL,
  `passport` longblob NOT NULL,
  `course1` text NOT NULL,
  `course2` text NOT NULL,
  `course3` text NOT NULL,
  `course4` text NOT NULL,
  `course5` text NOT NULL,
  `course6` text NOT NULL,
  `course7` text NOT NULL,
  `course8` text NOT NULL,
  `csc206_score` int(11) NOT NULL,
  `csc206_grade` text NOT NULL,
  `csc202_score` int(11) NOT NULL,
  `csc202_grade` text NOT NULL,
  `csc242_score` int(11) NOT NULL,
  `csc242_grade` text NOT NULL,
  `csc262_score` int(11) NOT NULL,
  `csc262_grade` text NOT NULL,
  `csc232_score` int(11) NOT NULL,
  `csc232_grade` text NOT NULL,
  `mat232_score` int(11) NOT NULL,
  `mat232_grade` text NOT NULL,
  `eco202_score` int(11) NOT NULL,
  `eco202_grade` text NOT NULL,
  `csc204_score` int(11) NOT NULL,
  `csc204_grade` text NOT NULL,
  `gpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `level2_semester2`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `level2_semester2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
