SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `level4_semester2` (
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
  `csc412_score` int(11) NOT NULL,
  `csc412_grade` text NOT NULL,
  `csc424_score` int(11) NOT NULL,
  `csc424_grade` text NOT NULL,
  `csc442_score` int(11) NOT NULL,
  `csc442_grade` text NOT NULL,
  `csc426_score` int(11) NOT NULL,
  `csc426_grade` text NOT NULL,
  `csc446_score` int(11) NOT NULL,
  `csc446_grade` text NOT NULL,
  `csc482_score` int(11) NOT NULL,
  `csc482_grade` text NOT NULL,
  `csc428_score` int(11) NOT NULL,
  `csc428_grade` text NOT NULL,
  `csc464_score` int(11) NOT NULL,
  `csc464_grade` text NOT NULL,
  `gpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `level4_semester2`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `level4_semester2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
