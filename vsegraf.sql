-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 06, 2015 at 06:35 PM
-- Server version: 5.6.15-log
-- PHP Version: 5.5.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `vsegraf`
--

-- --------------------------------------------------------

--
-- Table structure for table `dbuser`
--

CREATE TABLE IF NOT EXISTS `dbuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xname` varchar(7) COLLATE utf8_czech_ci NOT NULL,
  `pass` varchar(40) COLLATE utf8_czech_ci NOT NULL,
  `name` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=3 ;

--
-- Dumping data for table `dbuser`
--

INSERT INTO `dbuser` (`id`, `xname`, `pass`, `name`) VALUES
(1, 'xseca00', '6e017b5464f820a6c1bb5e9f6d711a667a80d8ea', 'Alois Sečkár'),
(2, 'xtesj25', '8cb2237d0679ca88db6464eac60da96345513964', 'Josef Tester');

-- --------------------------------------------------------

--
-- Table structure for table `kbentry`
--

CREATE TABLE IF NOT EXISTS `kbentry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) COLLATE utf8_czech_ci DEFAULT NULL,
  `cat` varchar(50) COLLATE utf8_czech_ci DEFAULT NULL,
  `body` longtext COLLATE utf8_czech_ci,
  `author` int(11) NOT NULL,
  `editor` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=10 ;

--
-- Dumping data for table `kbentry`
--

INSERT INTO `kbentry` (`id`, `title`, `cat`, `body`, `author`, `editor`) VALUES
(1, 'Index', 'General', ' Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ut ligula ac tellus pellentesque mattis. Suspendisse venenatis diam quis mauris scelerisque semper. Pellentesque elit ex, ullamcorper eu ligula a, cursus porta odio. Ut condimentum leo euismod, imperdiet felis at, cursus sem. Sed vel vulputate justo. Donec eleifend vitae orci et varius. Sed ultricies maximus mauris nec maximus. Sed non augue tellus.\r Lorelei.\n\r\nEtiam elementum, lacus sit amet placerat suscipit, lorem orci viverra justo, ut cursus purus elit at urna. Nulla non congue sem, id ultricies mi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. In dui justo, pulvinar in arcu sit amet, pellentesque accumsan mi. Vivamus massa metus, rutrum sed lacus quis, scelerisque ultricies risus. Aenean interdum augue diam, rutrum mattis mi molestie quis. Curabitur facilisis sapien eros, eu mattis metus laoreet a. Phasellus rutrum quam at nibh tincidunt ultricies. \n\nLorem ispum dolor amet quis.', 1, 1),
(2, 'About', 'General', ' Morbi tempor finibus ullamcorper. Maecenas imperdiet massa nibh, id mollis nulla congue eu. Aenean id vehicula libero. Praesent ut feugiat ex, in tristique nulla. Mauris consequat in eros in auctor. Sed justo tellus, vestibulum eget nunc vitae, condimentum elementum ex. Donec id dui imperdiet, egestas massa et, facilisis magna. Aliquam ullamcorper imperdiet pellentesque. Nunc hendrerit efficitur ultricies. Mauris nunc quam, laoreet rutrum maximus vestibulum, egestas id diam. Aliquam euismod ullamcorper lobortis. Proin vitae mauris felis. Phasellus gravida massa enim, id varius eros varius in. Ut iaculis urna auctor lectus vestibulum consectetur. Morbi id tortor sed ligula euismod maximus nec non lorem. Maecenas malesuada ex id elit rhoncus viverra.\r\n\r\nDonec convallis auctor suscipit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras eget tortor in nunc scelerisque molestie. Mauris maximus bibendum enim, in rutrum sapien vestibulum lobortis. Vestibulum at ornare nisi, egestas egestas dui. Suspendisse posuere eget diam id luctus. Duis iaculis imperdiet eleifend. ', 2, 2);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
