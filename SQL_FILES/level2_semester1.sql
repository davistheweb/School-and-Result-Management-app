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
  `csc231_score` int(11) NOT NULL,
  `csc231_grade` text NOT NULL,
  `mat211_score` int(11) NOT NULL,
  `mat211_grade` text NOT NULL,
  `csc241_score` int(11) NOT NULL,
  `csc241_grade` text NOT NULL,
  `acc203_score` int(11) NOT NULL,
  `acc203_grade` text NOT NULL,
  `gst223_score` int(11) NOT NULL,
  `gst223_grade` text NOT NULL,
  `csc205_score` int(11) NOT NULL,
  `csc205_grade` text NOT NULL,
  `sta201_score` int(11) NOT NULL,
  `sta201_grade` text NOT NULL,
  `csc207_score` int(11) NOT NULL,
  `csc207_grade` text NOT NULL,
  `gpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `level2_semester1`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `level2_semester1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
