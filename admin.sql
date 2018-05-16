/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : system

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-16 22:49:49
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
INSERT INTO `admin` VALUES ('2', 'aaa', 'aaa', '是', '否', '李四');

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
INSERT INTO `admin_popedom` VALUES ('6', '1', '2');

-- ----------------------------
-- Table structure for attendance_record
-- ----------------------------
DROP TABLE IF EXISTS `attendance_record`;
CREATE TABLE `attendance_record` (
  `Attendance_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_ID` int(11) NOT NULL,
  `Card_Number` varchar(50) NOT NULL,
  `Attendance_Date` varchar(20) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COMMENT='考勤记录表';

-- ----------------------------
-- Records of attendance_record
-- ----------------------------
INSERT INTO `attendance_record` VALUES ('43', '24', '122222222222222222', '2018-05-13 15:59:00', '1', null, '1', '3', null);
INSERT INTO `attendance_record` VALUES ('44', '25', '122222333333333333', '2018-05-13 15:59:00', '1', null, '1', '2', null);
INSERT INTO `attendance_record` VALUES ('45', '27', '122222222222222222', '2018-05-13 15:59:00', '4', '', '1', '5', null);
INSERT INTO `attendance_record` VALUES ('46', '28', '122222333333333333', '2018-05-13 15:59:00', '1', null, '1', '1', null);
INSERT INTO `attendance_record` VALUES ('47', '28', '122222333333333333', '2018-05-13 16:05:00', '1', null, '2', '1', null);

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='考勤状态表';

-- ----------------------------
-- Records of attendance_type
-- ----------------------------
INSERT INTO `attendance_type` VALUES ('1', '出勤', '0');
INSERT INTO `attendance_type` VALUES ('2', '休假', '0');
INSERT INTO `attendance_type` VALUES ('3', '迟到', '0');
INSERT INTO `attendance_type` VALUES ('4', '旷工', '2');
INSERT INTO `attendance_type` VALUES ('5', '请假', '2');
INSERT INTO `attendance_type` VALUES ('6', '半天', '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '门市部', '1231212', '2', '');
INSERT INTO `department` VALUES ('2', '化妆部', '17826855606', '1', '');
INSERT INTO `department` VALUES ('3', '摄影部', '123213', '1', null);
INSERT INTO `department` VALUES ('5', '看样部', '1231231', '1', '');
INSERT INTO `department` VALUES ('7', '数码部', '12321321', '0', '');

-- ----------------------------
-- Table structure for emp_test
-- ----------------------------
DROP TABLE IF EXISTS `emp_test`;
CREATE TABLE `emp_test` (
  `Test_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Emp_ID` int(11) NOT NULL,
  `Base_Salary` double(10,0) DEFAULT NULL,
  `Position_Salary` double(10,1) DEFAULT NULL,
  `Up_Salary` double(10,1) DEFAULT NULL,
  `JX_Salary` double DEFAULT NULL,
  `All_Salary` double(10,1) DEFAULT NULL,
  `Test_Score` double(4,1) DEFAULT NULL,
  `Test_Date` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Test_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp_test
-- ----------------------------
INSERT INTO `emp_test` VALUES ('45', '28', '100', '0.0', '2.0', '-100', '2.0', '90.0', '2018-05');

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
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='员工表';

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('24', '张飞', '男', '6', '3', '122222222222222222', '1', '11231231', '', '');
INSERT INTO `employees` VALUES ('25', '貂蝉', '女', '9', '2', '122222333333333333', '1', '2123213213', '重庆', '');
INSERT INTO `employees` VALUES ('27', '赵云', '男', '14', '5', '122222222222222222', '1', '2123213213', '', '');
INSERT INTO `employees` VALUES ('28', '吕布', '男', '3', '1', '122222333333333333', '1', '11231231', '', '');
INSERT INTO `employees` VALUES ('29', 'zhang', '男', '3', '1', '12321321', '1', '2131231', '123', '');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='职位表';

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('3', '门市人员', '');
INSERT INTO `position` VALUES ('4', '门市主管', '');
INSERT INTO `position` VALUES ('6', '摄影师', '');
INSERT INTO `position` VALUES ('7', '摄影主管', '');
INSERT INTO `position` VALUES ('8', '摄影助理', '');
INSERT INTO `position` VALUES ('9', '化妆师', '');
INSERT INTO `position` VALUES ('10', '化妆主管', '');
INSERT INTO `position` VALUES ('11', '化妆助理', '');
INSERT INTO `position` VALUES ('12', '数码师', '');
INSERT INTO `position` VALUES ('13', '数码主管', '');
INSERT INTO `position` VALUES ('14', '看样师', '');
INSERT INTO `position` VALUES ('15', '看样主管', '');

-- ----------------------------
-- Table structure for salary_rule
-- ----------------------------
DROP TABLE IF EXISTS `salary_rule`;
CREATE TABLE `salary_rule` (
  `Salary_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Position_ID` int(11) NOT NULL,
  `Base_Salary` double DEFAULT NULL,
  `Position_Salary` double DEFAULT NULL,
  `Target_Money` double DEFAULT NULL,
  `Up_Percent` double DEFAULT NULL,
  `Jx_Percent` double DEFAULT NULL,
  `Score_money` double DEFAULT NULL,
  PRIMARY KEY (`Salary_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary_rule
-- ----------------------------
INSERT INTO `salary_rule` VALUES ('2', '1', '10000', '1000', '20000', '0.1', '0.1', '10');
INSERT INTO `salary_rule` VALUES ('3', '2', '12', '0', '123', '0.1', '0.1', '1');
INSERT INTO `salary_rule` VALUES ('6', '3', '1500', '0', '300', '0.01', '0.01', '10');

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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of target
-- ----------------------------
INSERT INTO `target` VALUES ('3', '迟到', '2', '');
INSERT INTO `target` VALUES ('4', '旷工', '2', '');
INSERT INTO `target` VALUES ('5', '穿着', '2', '');
INSERT INTO `target` VALUES ('11', '门市部', '1', '');
INSERT INTO `target` VALUES ('12', '化妆部', '1', '');
INSERT INTO `target` VALUES ('13', '摄影部', '1', '');
INSERT INTO `target` VALUES ('14', '看样部', '1', '');
INSERT INTO `target` VALUES ('15', '数码部', '1', '');
INSERT INTO `target` VALUES ('16', '吃蛋', '2', '');

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
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of target_record
-- ----------------------------
INSERT INTO `target_record` VALUES ('33', '3', '11', '30', '30', '');
INSERT INTO `target_record` VALUES ('34', '4', '11', '40', '40', '');
INSERT INTO `target_record` VALUES ('35', '5', '11', '30', '30', '');
INSERT INTO `target_record` VALUES ('36', '3', '12', null, null, '');
INSERT INTO `target_record` VALUES ('37', '4', '12', null, null, '');
INSERT INTO `target_record` VALUES ('38', '5', '12', null, null, '');
