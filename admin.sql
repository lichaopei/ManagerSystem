/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : guigu

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-03-01 16:14:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `AdminID` int(11) NOT NULL AUTO_INCREMENT,
  `AdminAccount` varchar(50) NOT NULL,
  `AdminPwd` varchar(50) NOT NULL,
  `AdminState` char(2) NOT NULL,
  `AdminRight` char(2) NOT NULL,
  `AdminName` varchar(50) NOT NULL,
  PRIMARY KEY (`AdminID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('2', 'qwe', 'qwe', '是', '是', '李四');
INSERT INTO `admin` VALUES ('3', '123', '123', '否', '否', '王五');

-- ----------------------------
-- Table structure for adminpopedom
-- ----------------------------
DROP TABLE IF EXISTS `adminpopedom`;
CREATE TABLE `adminpopedom` (
  `PopedomID` int(11) NOT NULL AUTO_INCREMENT,
  `DepartmentID` int(11) NOT NULL,
  `AdminID` int(11) NOT NULL,
  PRIMARY KEY (`PopedomID`),
  KEY `AdminID` (`AdminID`),
  KEY `DepartmentID` (`DepartmentID`),
  CONSTRAINT `adminpopedom_ibfk_1` FOREIGN KEY (`AdminID`) REFERENCES `admin` (`AdminID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `adminpopedom_ibfk_2` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户权限表; ';

-- ----------------------------
-- Records of adminpopedom
-- ----------------------------

-- ----------------------------
-- Table structure for attendancerecord
-- ----------------------------
DROP TABLE IF EXISTS `attendancerecord`;
CREATE TABLE `attendancerecord` (
  `AttendanceID` int(11) NOT NULL AUTO_INCREMENT,
  `EmployeeID` int(11) NOT NULL,
  `CardNumber` varchar(50) NOT NULL,
  `AttendanceDate` datetime NOT NULL,
  `AttendanceType` int(11) NOT NULL,
  `AttendanceMemo` varchar(255) DEFAULT NULL,
  `AdminID` int(11) NOT NULL,
  `TempDepartmentID` int(11) NOT NULL,
  `NodeID` int(11) NOT NULL,
  PRIMARY KEY (`AttendanceID`),
  KEY `EmployeeID` (`EmployeeID`),
  KEY `att_attendancerecord_ibfk_2` (`AttendanceType`),
  KEY `AdminID` (`AdminID`),
  KEY `TempDepartmentID` (`TempDepartmentID`),
  KEY `NodeID` (`NodeID`),
  CONSTRAINT `attendancerecord_ibfk_1` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `attendancerecord_ibfk_2` FOREIGN KEY (`AttendanceType`) REFERENCES `attendancetype` (`TypeID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `attendancerecord_ibfk_3` FOREIGN KEY (`AdminID`) REFERENCES `admin` (`AdminID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `attendancerecord_ibfk_4` FOREIGN KEY (`TempDepartmentID`) REFERENCES `department` (`DepartmentID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `attendancerecord_ibfk_5` FOREIGN KEY (`NodeID`) REFERENCES `notes` (`NoteID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='考勤记录表';

-- ----------------------------
-- Records of attendancerecord
-- ----------------------------
INSERT INTO `attendancerecord` VALUES ('1', '1', '0', '2018-02-14 00:00:00', '1', '', '2', '2', '1');

-- ----------------------------
-- Table structure for attendancetype
-- ----------------------------
DROP TABLE IF EXISTS `attendancetype`;
CREATE TABLE `attendancetype` (
  `TypeID` int(11) NOT NULL AUTO_INCREMENT,
  `TypeName` varchar(20) NOT NULL,
  `TypeCategory` int(11) NOT NULL,
  PRIMARY KEY (`TypeID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='考勤状态表';

-- ----------------------------
-- Records of attendancetype
-- ----------------------------
INSERT INTO `attendancetype` VALUES ('1', '出勤', '0');
INSERT INTO `attendancetype` VALUES ('2', '公休', '0');
INSERT INTO `attendancetype` VALUES ('3', '迟到', '0');
INSERT INTO `attendancetype` VALUES ('4', '旷工', '0');
INSERT INTO `attendancetype` VALUES ('5', '外出', '0');
INSERT INTO `attendancetype` VALUES ('6', '出差', '0');
INSERT INTO `attendancetype` VALUES ('7', '加班', '0');
INSERT INTO `attendancetype` VALUES ('8', '倒休', '0');
INSERT INTO `attendancetype` VALUES ('9', '事假', '1');
INSERT INTO `attendancetype` VALUES ('10', '病假', '1');
INSERT INTO `attendancetype` VALUES ('11', '婚假', '1');
INSERT INTO `attendancetype` VALUES ('12', '丧假', '1');
INSERT INTO `attendancetype` VALUES ('13', '产假', '1');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `DepartmentID` int(11) NOT NULL AUTO_INCREMENT,
  `DepartmentName` varchar(100) NOT NULL,
  `StartTimeAM` time NOT NULL,
  `EndTimeAM` time NOT NULL,
  `StartTimePM` time NOT NULL,
  `EndTimePM` time NOT NULL,
  PRIMARY KEY (`DepartmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '清洁部', '10:00:00', '06:00:00', '10:05:00', '05:00:00');
INSERT INTO `department` VALUES ('2', '保安部', '09:45:00', '11:00:00', '18:30:00', '21:45:00');
INSERT INTO `department` VALUES ('4', '美女部', '00:00:00', '00:00:00', '00:00:00', '00:00:00');

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `EmployeeID` int(11) NOT NULL AUTO_INCREMENT,
  `EmployeeName` varchar(100) NOT NULL,
  `EmployeeGender` varchar(2) NOT NULL,
  `Position` int(11) NOT NULL,
  `Department` int(11) NOT NULL,
  `CardNumber` varchar(50) NOT NULL,
  `EmployeeState` char(1) NOT NULL,
  `EmployeeMemo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`),
  KEY `att_employees_ibfk_2` (`Department`),
  KEY `att_employees_ibfk_1` (`Position`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`Position`) REFERENCES `position` (`PositionId`) ON UPDATE CASCADE,
  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`Department`) REFERENCES `department` (`DepartmentID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='员工表';

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('1', '王麻子', '男', '3', '1', '0', '1', '');
INSERT INTO `employees` VALUES ('2', '张三', '男', '3', '2', '', '1', '');
INSERT INTO `employees` VALUES ('3', '李四', '女', '3', '4', '', '0', '');

-- ----------------------------
-- Table structure for notes
-- ----------------------------
DROP TABLE IF EXISTS `notes`;
CREATE TABLE `notes` (
  `NoteID` int(11) NOT NULL AUTO_INCREMENT,
  `DepartmentID` int(11) NOT NULL,
  `EmployeeID` int(11) NOT NULL,
  `NodeType` int(11) NOT NULL,
  `EmployeeIDs` varchar(1000) NOT NULL,
  `Cause` varchar(1000) NOT NULL,
  `FillInTime` datetime NOT NULL,
  `DirectorSign` varchar(200) DEFAULT NULL,
  `AdminnistrationSign` varchar(200) DEFAULT NULL,
  `PresidentSign` varchar(200) DEFAULT NULL,
  `StartDate` datetime NOT NULL,
  `StartTime` datetime DEFAULT NULL,
  `EndDate` datetime NOT NULL,
  `EndTime` datetime DEFAULT NULL,
  `OverTimeIDS` varchar(200) DEFAULT NULL,
  `Vehicle` varchar(50) DEFAULT NULL,
  `AdminID` int(11) NOT NULL,
  `NoteMemo` varchar(500) DEFAULT NULL,
  `OperatorID` int(11) NOT NULL,
  `IsVerify` bit(1) NOT NULL,
  PRIMARY KEY (`NoteID`),
  KEY `att_notes_ibfk_2` (`EmployeeID`),
  KEY `att_notes_ibfk_4` (`AdminID`),
  KEY `att_notes_ibfk_1` (`DepartmentID`),
  KEY `att_notes_ibfk_3` (`NodeType`),
  KEY `OperatorID` (`OperatorID`),
  CONSTRAINT `notes_ibfk_1` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`) ON UPDATE CASCADE,
  CONSTRAINT `notes_ibfk_2` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON UPDATE CASCADE,
  CONSTRAINT `notes_ibfk_3` FOREIGN KEY (`NodeType`) REFERENCES `attendancetype` (`TypeID`) ON UPDATE CASCADE,
  CONSTRAINT `notes_ibfk_4` FOREIGN KEY (`AdminID`) REFERENCES `admin` (`AdminID`) ON UPDATE CASCADE,
  CONSTRAINT `notes_ibfk_5` FOREIGN KEY (`OperatorID`) REFERENCES `employees` (`EmployeeID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='单据表';

-- ----------------------------
-- Records of notes
-- ----------------------------
INSERT INTO `notes` VALUES ('1', '2', '1', '1', '1,2', '就好几百', '2018-02-20 11:37:32', null, null, null, '2018-02-05 11:37:58', '2018-02-27 11:38:03', '2018-02-13 11:38:07', '2018-02-12 11:38:10', null, null, '2', null, '3', '\0');

-- ----------------------------
-- Table structure for overtimerecord
-- ----------------------------
DROP TABLE IF EXISTS `overtimerecord`;
CREATE TABLE `overtimerecord` (
  `OverTimeID` int(11) NOT NULL AUTO_INCREMENT,
  `EmployeeID` int(100) NOT NULL,
  `OvertimeDate` datetime NOT NULL,
  `OvertimeFlag` char(255) NOT NULL,
  `OvertimeState` char(255) NOT NULL,
  `IsVerify` bit(1) NOT NULL,
  `OvertimeMemo` varchar(1000) DEFAULT NULL,
  `OperatorID` int(11) NOT NULL,
  `NoteID` int(11) NOT NULL,
  PRIMARY KEY (`OverTimeID`),
  KEY `att_overtimerecord_ibfk_1` (`OperatorID`),
  KEY `EmployeeID` (`EmployeeID`),
  KEY `NoteID` (`NoteID`),
  CONSTRAINT `overtimerecord_ibfk_1` FOREIGN KEY (`OperatorID`) REFERENCES `employees` (`EmployeeID`) ON UPDATE CASCADE,
  CONSTRAINT `overtimerecord_ibfk_2` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `overtimerecord_ibfk_3` FOREIGN KEY (`NoteID`) REFERENCES `notes` (`NoteID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='加班明细表';

-- ----------------------------
-- Records of overtimerecord
-- ----------------------------

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `PositionId` int(11) NOT NULL AUTO_INCREMENT,
  `PositionName` varchar(50) NOT NULL,
  `PositionMemo` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`PositionId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='职位表';

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('3', 'SDSAD', 'dsadas');
