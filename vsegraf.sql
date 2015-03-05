-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2015 at 07:50 PM
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
-- Table structure for table `dbstats`
--

CREATE TABLE IF NOT EXISTS `dbstats` (
  `stats` varchar(25) COLLATE utf8_czech_ci NOT NULL,
  `value` int(11) NOT NULL,
  PRIMARY KEY (`stats`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

--
-- Dumping data for table `dbstats`
--

INSERT INTO `dbstats` (`stats`, `value`) VALUES
('orig_entries', 3),
('kb_cats', 4);

-- --------------------------------------------------------

--
-- Table structure for table `dbuser`
--

CREATE TABLE IF NOT EXISTS `dbuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xname` varchar(7) COLLATE utf8_czech_ci NOT NULL,
  `pass` varchar(40) COLLATE utf8_czech_ci NOT NULL,
  `level` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=4 ;

--
-- Dumping data for table `dbuser`
--

INSERT INTO `dbuser` (`id`, `xname`, `pass`, `level`, `name`) VALUES
(3, 'xseca00', '6e017b5464f820a6c1bb5e9f6d711a667a80d8ea', 2, 'Alois Sečkár'),
(2, 'xtesj25', '8cb2237d0679ca88db6464eac60da96345513964', 1, 'Josef Tester'),
(1, 'root', '435b41068e8665513a20070c033b08b9c66e4332', 3, 'Root');

-- --------------------------------------------------------

--
-- Table structure for table `kbcat`
--

CREATE TABLE IF NOT EXISTS `kbcat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ord` int(11) NOT NULL,
  `name` varchar(25) COLLATE utf8_czech_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=5 ;

--
-- Dumping data for table `kbcat`
--

INSERT INTO `kbcat` (`id`, `ord`, `name`) VALUES
(1, 1, 'General'),
(2, 2, 'Help'),
(3, 3, '4IT215'),
(4, 4, '4IT450');

-- --------------------------------------------------------

--
-- Table structure for table `kbentry`
--

CREATE TABLE IF NOT EXISTS `kbentry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orig_id` int(11) NOT NULL,
  `title` varchar(50) COLLATE utf8_czech_ci DEFAULT NULL,
  `cat` int(11) DEFAULT NULL,
  `body` longtext COLLATE utf8_czech_ci,
  `author` int(11) NOT NULL,
  `valid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=12 ;

--
-- Dumping data for table `kbentry`
--

INSERT INTO `kbentry` (`id`, `orig_id`, `title`, `cat`, `body`, `author`, `valid`) VALUES
(1, 1, 'Index', 1, ' Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ut ligula ac tellus pellentesque mattis. Suspendisse venenatis diam quis mauris scelerisque semper. Pellentesque elit ex, ullamcorper eu ligula a, cursus porta odio. Ut condimentum leo euismod, imperdiet felis at, cursus sem. Sed vel vulputate justo. Donec eleifend vitae orci et varius. Sed ultricies maximus mauris nec maximus. Sed non augue tellus.\r Lorelei.\n\r\nEtiam elementum, lacus sit amet placerat suscipit, lorem orci viverra justo, ut cursus purus elit at urna. Nulla non congue sem, id ultricies mi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. In dui justo, pulvinar in arcu sit amet, pellentesque accumsan mi. Vivamus massa metus, rutrum sed lacus quis, scelerisque ultricies risus. Aenean interdum augue diam, rutrum mattis mi molestie quis. Curabitur facilisis sapien eros, eu mattis metus laoreet a. Phasellus rutrum quam at nibh tincidunt ultricies. \n\nLorem ispum dolor amet quis.', 1, 1),
(2, 2, 'About', 2, ' Morbi tempor finibus ullamcorper. Maecenas imperdiet massa nibh, id mollis nulla congue eu. Aenean id vehicula libero. Praesent ut feugiat ex, in tristique nulla. Mauris consequat in eros in auctor. Sed justo tellus, vestibulum eget nunc vitae, condimentum elementum ex. Donec id dui imperdiet, egestas massa et, facilisis magna. Aliquam ullamcorper imperdiet pellentesque. Nunc hendrerit efficitur ultricies. Mauris nunc quam, laoreet rutrum maximus vestibulum, egestas id diam. Aliquam euismod ullamcorper lobortis. Proin vitae mauris felis. Phasellus gravida massa enim, id varius eros varius in. Ut iaculis urna auctor lectus vestibulum consectetur. Morbi id tortor sed ligula euismod maximus nec non lorem. Maecenas malesuada ex id elit rhoncus viverra.\r\n\r\nDonec convallis auctor suscipit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras eget tortor in nunc scelerisque molestie. Mauris maximus bibendum enim, in rutrum sapien vestibulum lobortis. Vestibulum at ornare nisi, egestas egestas dui. Suspendisse posuere eget diam id luctus. Duis iaculis imperdiet eleifend. \n\nText na zkousku editace.', 2, 1),
(10, 3, 'Test page 1', 1, 'Mumble mumble mumble mumble...', 2, 1),
(11, 3, 'Old test page', 1, 'Not enough mumbles...', 1, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
