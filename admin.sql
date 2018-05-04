/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-26 19:27:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `Admin_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Admin_Account` varchar(50) NOT NULL,
  `Admin_Pwd` varchar(50) NOT NULL,
  `Admin_State` char(2) NOT NULL,
  `Admin_Right` char(2) NOT NULL,
  `Admin_Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Admin_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户表';

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'qwe', 'qwe', '是', '是', '王五');
INSERT INTO `admin` VALUES ('2', 'aaa', 'aaa', '否', '否', '李四');

-- ----------------------------
-- Table structure for admin_popedom
-- ----------------------------
DROP TABLE IF EXISTS `admin_popedom`;
CREATE TABLE `admin_popedom` (
  `Popedom_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Department_ID` int(11) NOT NULL,
  `Admin_ID` int(11) NOT NULL,
  PRIMARY KEY (`Popedom_ID`),
  KEY `AdminID` (`Admin_ID`),
  KEY `DepartmentID` (`Department_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户权限表; ';

-- ----------------------------
-- Records of admin_popedom
-- ----------------------------
INSERT INTO `admin_popedom` VALUES ('3', '2', '1');
INSERT INTO `admin_popedom` VALUES ('6', '1', '2');

-- ----------------------------
-- Table structure for attendance_record
-- ----------------------------
DROP TABLE IF EXISTS `attendance_record`;
CREATE TABLE `attendance_record` (
  `Attendance_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_ID` int(11) NOT NULL,
  `Card_Number` varchar(50) NOT NULL,
  `Attendance_Date` datetime DEFAULT NULL,
  `Attendance_Type` int(11) DEFAULT NULL,
  `Attendance_Memo` varchar(255) DEFAULT NULL,
  `Admin_ID` int(11) NOT NULL,
  `Temp_Department_ID` int(11) NOT NULL,
  `Node_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Attendance_ID`),
  KEY `EmployeeID` (`Employee_ID`),
  KEY `att_attendancerecord_ibfk_2` (`Attendance_Type`),
  KEY `AdminID` (`Admin_ID`),
  KEY `TempDepartmentID` (`Temp_Department_ID`),
  KEY `NodeID` (`Node_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='考勤记录表';

-- ----------------------------
-- Records of attendance_record
-- ----------------------------
INSERT INTO `attendance_record` VALUES ('20', '9', '', null, '3', null, '1', '2', null);
INSERT INTO `attendance_record` VALUES ('21', '2', '1212', null, '1', null, '1', '2', null);
INSERT INTO `attendance_record` VALUES ('22', '7', '', null, '1', null, '1', '2', null);
INSERT INTO `attendance_record` VALUES ('23', '2', '1212', null, '1', null, '1', '2', null);
INSERT INTO `attendance_record` VALUES ('24', '7', '', null, '1', null, '1', '2', null);

-- ----------------------------
-- Table structure for attendance_rule
-- ----------------------------
DROP TABLE IF EXISTS `attendance_rule`;
CREATE TABLE `attendance_rule` (
  `Rule_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Department_ID` int(11) NOT NULL,
  `Start_Time_AM` time NOT NULL,
  `End_Time_AM` time NOT NULL,
  `Start_Time_PM` time NOT NULL,
  `End_Time_PM` time NOT NULL,
  PRIMARY KEY (`Rule_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of attendance_rule
-- ----------------------------
INSERT INTO `attendance_rule` VALUES ('1', '2', '00:00:00', '00:00:01', '00:00:00', '00:00:00');
INSERT INTO `attendance_rule` VALUES ('2', '1', '12:03:02', '00:00:00', '00:00:00', '00:00:00');

-- ----------------------------
-- Table structure for attendance_type
-- ----------------------------
DROP TABLE IF EXISTS `attendance_type`;
CREATE TABLE `attendance_type` (
  `Type_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Type_Name` varchar(20) NOT NULL,
  `Type_Category` int(11) NOT NULL,
  PRIMARY KEY (`Type_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='考勤状态表';

-- ----------------------------
-- Records of attendance_type
-- ----------------------------
INSERT INTO `attendance_type` VALUES ('1', '出勤', '0');
INSERT INTO `attendance_type` VALUES ('2', '公休', '0');
INSERT INTO `attendance_type` VALUES ('3', '迟到', '0');
INSERT INTO `attendance_type` VALUES ('4', '旷工', '0');
INSERT INTO `attendance_type` VALUES ('5', '事假', '0');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `Department_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Department_Name` varchar(100) NOT NULL,
  `Phone` varchar(11) NOT NULL,
  `Emp_Number` int(10) NOT NULL,
  `Remarks` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Department_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '门市', '1231212', '2', '');
INSERT INTO `department` VALUES ('2', '化妆', '17826855606', '2', '');
INSERT INTO `department` VALUES ('3', '摄影', '123213', '2', null);
INSERT INTO `department` VALUES ('4', '数码', '121313', '0', null);
INSERT INTO `department` VALUES ('5', '选片', '123421', '-1', null);

-- ----------------------------
-- Table structure for emp_salary
-- ----------------------------
DROP TABLE IF EXISTS `emp_salary`;
CREATE TABLE `emp_salary` (
  `salary_id` int(20) NOT NULL AUTO_INCREMENT,
  `emp_Id` varchar(20) NOT NULL,
  `base_Salary` double NOT NULL,
  `test_Salary` double NOT NULL,
  `benefits` double NOT NULL,
  `scottare` double NOT NULL,
  `real_salary` double NOT NULL,
  `year_month` varchar(20) NOT NULL,
  PRIMARY KEY (`salary_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp_salary
-- ----------------------------

-- ----------------------------
-- Table structure for emp_test
-- ----------------------------
DROP TABLE IF EXISTS `emp_test`;
CREATE TABLE `emp_test` (
  `Test_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Emp_ID` int(11) NOT NULL,
  `Test_Score` double(3,0) DEFAULT NULL,
  `Test_Date` date DEFAULT NULL,
  PRIMARY KEY (`Test_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp_test
-- ----------------------------

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `Employee_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_Name` varchar(100) NOT NULL,
  `Employee_Gender` varchar(2) NOT NULL,
  `Position` int(11) NOT NULL,
  `Department` int(11) NOT NULL,
  `Card_Number` varchar(50) NOT NULL,
  `Employee_State` char(1) NOT NULL,
  `Phone` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Employee_Memo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Employee_ID`),
  KEY `att_employees_ibfk_2` (`Department`),
  KEY `att_employees_ibfk_1` (`Position`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='员工表';

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('1', '赵六', '男', '1', '1', '123', '1', '', '', '');
INSERT INTO `employees` VALUES ('2', '网w', '男', '1', '2', '1212', '1', null, null, null);
INSERT INTO `employees` VALUES ('3', 'sdsf', '男', '1', '3', '121', '1', null, null, null);
INSERT INTO `employees` VALUES ('4', 'haha', '女', '1', '4', '12331', '1', null, null, null);
INSERT INTO `employees` VALUES ('7', '明小莉', '女', '1', '2', '', '1', null, null, '');
INSERT INTO `employees` VALUES ('8', '明大莉', '男', '1', '1', '', '1', '', '', '');
INSERT INTO `employees` VALUES ('9', '张三', '男', '1', '1', '', '0', null, null, '');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_id` int(11) NOT NULL,
  `customer` varchar(255) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `date` datetime NOT NULL,
  `front_cost` double NOT NULL,
  `second_cost` double DEFAULT NULL,
  `flag` varchar(255) NOT NULL,
  `floor` int(11) DEFAULT NULL,
  `make_up` int(11) DEFAULT NULL,
  `photo` int(11) DEFAULT NULL,
  `ps` int(11) DEFAULT NULL,
  `choose` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '6', '里', '23242', '2018-04-10 19:40:42', '3000', '1000', '是', '1', '2', '3', '4', '5');
INSERT INTO `orders` VALUES ('3', '6', '李朝培', '123213', '2018-04-12 19:45:48', '200', null, '否', '4', null, null, null, null);
INSERT INTO `orders` VALUES ('4', '6', '莉', '123213', '2018-04-12 20:29:40', '200', null, '否', '5', null, null, null, null);

-- ----------------------------
-- Table structure for photo_type
-- ----------------------------
DROP TABLE IF EXISTS `photo_type`;
CREATE TABLE `photo_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) NOT NULL,
  `cost` double NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of photo_type
-- ----------------------------
INSERT INTO `photo_type` VALUES ('6', '亲子照', '200');
INSERT INTO `photo_type` VALUES ('7', '情侣照', '3000');

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `Position_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Position_Name` varchar(50) NOT NULL,
  `Position_Memo` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`Position_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='职位表';

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '扫地', '1232');
INSERT INTO `position` VALUES ('2', '会计', '计算');

-- ----------------------------
-- Table structure for salary_rule
-- ----------------------------
DROP TABLE IF EXISTS `salary_rule`;
CREATE TABLE `salary_rule` (
  `Salary_ID` int(11) NOT NULL,
  `Position_ID` int(11) NOT NULL,
  `PV` double NOT NULL,
  `Skill_Wage` double NOT NULL,
  `Auxiliary_Wage` varchar(255) NOT NULL,
  PRIMARY KEY (`Salary_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary_rule
-- ----------------------------

-- ----------------------------
-- Table structure for target
-- ----------------------------
DROP TABLE IF EXISTS `target`;
CREATE TABLE `target` (
  `target_id` int(11) NOT NULL AUTO_INCREMENT,
  `target_name` varchar(13) NOT NULL,
  `target_level` int(11) NOT NULL,
  `Remarks` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`target_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of target
-- ----------------------------
INSERT INTO `target` VALUES ('1', '化妆部', '1', '第一级');
INSERT INTO `target` VALUES ('2', '门市部', '1', '');
INSERT INTO `target` VALUES ('3', '迟到', '2', '');
INSERT INTO `target` VALUES ('4', '旷工', '2', '');
INSERT INTO `target` VALUES ('5', '穿着', '2', '');
INSERT INTO `target` VALUES ('6', '化妆', '2', '');
INSERT INTO `target` VALUES ('7', '投诉', '2', '');
INSERT INTO `target` VALUES ('8', '业绩', '2', '是否完成每月业绩');
INSERT INTO `target` VALUES ('9', '工作主动性', '2', '');

-- ----------------------------
-- Table structure for target_level
-- ----------------------------
DROP TABLE IF EXISTS `target_level`;
CREATE TABLE `target_level` (
  `Level_Id` int(11) NOT NULL AUTO_INCREMENT,
  `level_index` int(11) NOT NULL,
  `remarks` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Level_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of target_level
-- ----------------------------
INSERT INTO `target_level` VALUES ('4', '1', '');
INSERT INTO `target_level` VALUES ('12', '2', '');

-- ----------------------------
-- Table structure for target_record
-- ----------------------------
DROP TABLE IF EXISTS `target_record`;
CREATE TABLE `target_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `target_id` int(11) NOT NULL,
  `parent_target` int(3) NOT NULL,
  `weight` double DEFAULT NULL,
  `score` double DEFAULT NULL,
  `Remarks` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of target_record
-- ----------------------------
INSERT INTO `target_record` VALUES ('14', '4', '1', null, null, '');
INSERT INTO `target_record` VALUES ('15', '6', '1', null, null, '');
INSERT INTO `target_record` VALUES ('19', '8', '1', null, null, '是否完成每月业绩');
INSERT INTO `target_record` VALUES ('22', '3', '2', '30', '30', '');

-- ----------------------------
-- Table structure for temp
-- ----------------------------
DROP TABLE IF EXISTS `temp`;
CREATE TABLE `temp` (
  `Temp_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_Id` int(11) NOT NULL,
  `Card_Number` varchar(20) NOT NULL,
  `Temp_Department_ID` int(11) NOT NULL,
  PRIMARY KEY (`Temp_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of temp
-- ----------------------------
INSERT INTO `temp` VALUES ('9', '8', '', '1');
INSERT INTO `temp` VALUES ('10', '9', '', '2');
