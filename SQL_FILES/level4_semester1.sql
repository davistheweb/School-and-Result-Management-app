SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `level4_semester1` (
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
  `csc401_score` int(11) NOT NULL,
  `csc401_grade` text NOT NULL,
  `csc421_score` int(11) NOT NULL,
  `csc421_grade` text NOT NULL,
  `csc429_score` int(11) NOT NULL,
  `csc429_grade` text NOT NULL,
  `csc461_score` int(11) NOT NULL,
  `csc461_grade` text NOT NULL,
  `csc467_score` int(11) NOT NULL,
  `csc467_grade` text NOT NULL,
  `csc415_score` int(11) NOT NULL,
  `csc415_grade` text NOT NULL,
  `csc473_score` int(11) NOT NULL,
  `csc473_grade` text NOT NULL,
  `csc411_score` int(11) NOT NULL,
  `csc411_grade` text NOT NULL,
  `gpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `level4_semester1`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `level4_semester1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
