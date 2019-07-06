/*
 Navicat MySQL Data Transfer

 Source Server         : 数据库
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : cinema

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 07/07/2019 03:28:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Arrange
-- ----------------------------
DROP TABLE IF EXISTS `Arrange`;
CREATE TABLE `Arrange` (
  `Aud_id` int(11) NOT NULL,
  `Hall_id` int(11) NOT NULL,
  `Movie_id` int(11) NOT NULL,
  `Line` varchar(255) DEFAULT NULL,
  `Row` varchar(255) DEFAULT NULL,
  `Arrange_time` datetime NOT NULL,
  PRIMARY KEY (`Aud_id`,`Hall_id`,`Arrange_time`,`Movie_id`) USING BTREE,
  KEY `Hall_id` (`Hall_id`),
  KEY `Movie_id` (`Movie_id`),
  KEY `Arrange_time` (`Arrange_time`),
  CONSTRAINT `arrange_ibfk_1` FOREIGN KEY (`Aud_id`) REFERENCES `audience` (`Aud_id`),
  CONSTRAINT `arrange_ibfk_2` FOREIGN KEY (`Hall_id`) REFERENCES `moviehall` (`Hall_id`),
  CONSTRAINT `arrange_ibfk_3` FOREIGN KEY (`Movie_id`) REFERENCES `movie` (`Movie_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `arrange_ibfk_4` FOREIGN KEY (`Arrange_time`) REFERENCES `show` (`Show_time`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for audience
-- ----------------------------
DROP TABLE IF EXISTS `audience`;
CREATE TABLE `audience` (
  `Aud_id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Tel` varchar(30) DEFAULT NULL,
  `Type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Aud_id`,`Name`) USING BTREE,
  KEY `Aud_id` (`Aud_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for Movie
-- ----------------------------
DROP TABLE IF EXISTS `Movie`;
CREATE TABLE `Movie` (
  `Movie_id` int(11) NOT NULL,
  `Movie_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Base_price` float(11,0) DEFAULT NULL,
  `Category` varchar(10) DEFAULT NULL,
  `Loc` varchar(10) DEFAULT NULL,
  `Director` varchar(10) DEFAULT NULL,
  `Start_time` datetime DEFAULT NULL,
  `End_time` datetime DEFAULT NULL,
  `Last_time` int(11) DEFAULT NULL,
  PRIMARY KEY (`Movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for MovieHall
-- ----------------------------
DROP TABLE IF EXISTS `MovieHall`;
CREATE TABLE `MovieHall` (
  `Hall_id` int(11) NOT NULL,
  `Type` varchar(30) DEFAULT NULL,
  `Row_sum` int(11) DEFAULT NULL,
  `Line_sum` int(11) DEFAULT NULL,
  `Add_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`Hall_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for Show
-- ----------------------------
DROP TABLE IF EXISTS `Show`;
CREATE TABLE `Show` (
  `Hall_id` int(11) NOT NULL,
  `Movid_id` int(11) NOT NULL,
  `Show_time` datetime NOT NULL,
  PRIMARY KEY (`Hall_id`,`Movid_id`,`Show_time`) USING BTREE,
  KEY `Movie_id` (`Movid_id`),
  KEY `Show_time` (`Show_time`),
  CONSTRAINT `Hall_id` FOREIGN KEY (`Hall_id`) REFERENCES `moviehall` (`Hall_id`),
  CONSTRAINT `Movie_id` FOREIGN KEY (`Movid_id`) REFERENCES `movie` (`Movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SET FOREIGN_KEY_CHECKS = 1;
