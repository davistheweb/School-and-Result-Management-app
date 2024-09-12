SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `level1_semester2` (
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
  `csc102_score` int(11) NOT NULL,
  `csc102_grade` text NOT NULL,
  `mat102_score` int(11) NOT NULL,
  `mat102_grade` text NOT NULL,
  `phy102_score` int(11) NOT NULL,
  `phy102_grade` text NOT NULL,
  `sta112_score` int(11) NOT NULL,
  `sta112_grade` text NOT NULL,
  `phy152_score` int(11) NOT NULL,
  `phy152_grade` text NOT NULL,
  `gst108_score` int(11) NOT NULL,
  `gst108_grade` text NOT NULL,
  `che102_score` int(11) NOT NULL,
  `che102_grade` text NOT NULL,
  `gst104_score` int(11) NOT NULL,
  `gst104_grade` text NOT NULL,
  `gpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `level1_semester2`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `level1_semester2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
