SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `level3_semester1` (
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
  `csc361_score` int(11) NOT NULL,
  `csc361_grade` text NOT NULL,
  `csc341_score` int(11) NOT NULL,
  `csc341_grade` text NOT NULL,
  `csc351_score` int(11) NOT NULL,
  `csc351_grade` text NOT NULL,
  `csc367_score` int(11) NOT NULL,
  `csc367_grade` text NOT NULL,
  `csc371_score` int(11) NOT NULL,
  `csc371_grade` text NOT NULL,
  `csc381_score` int(11) NOT NULL,
  `csc381_grade` text NOT NULL,
  `csc315_score` int(11) NOT NULL,
  `csc315_grade` text NOT NULL,
  `csc323_score` int(11) NOT NULL,
  `csc323_grade` text NOT NULL,
  `gpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `level3_semester1`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `level3_semester1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
