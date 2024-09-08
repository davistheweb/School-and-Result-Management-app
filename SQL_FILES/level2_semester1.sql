SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `level2_semester1` (
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
  `csc101_score` int(11) NOT NULL,
  `csc101_grade` text NOT NULL,
  `mat101_score` int(11) NOT NULL,
  `mat101_grade` text NOT NULL,
  `phy101_score` int(11) NOT NULL,
  `phy101_grade` text NOT NULL,
  `sta111_score` int(11) NOT NULL,
  `sta111_grade` text NOT NULL,
  `phy105_score` int(11) NOT NULL,
  `phy105_grade` text NOT NULL,
  `bio101_score` int(11) NOT NULL,
  `bio101_grade` text NOT NULL,
  `gst105_score` int(11) NOT NULL,
  `gst105_grade` text NOT NULL,
  `mgt101_score` int(11) NOT NULL,
  `mgt101_grade` text NOT NULL,
  `gpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `level2_semester1`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `level2_semester1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
