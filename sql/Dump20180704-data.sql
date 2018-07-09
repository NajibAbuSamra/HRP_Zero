CREATE DATABASE  IF NOT EXISTS `hrpdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `hrpdb`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hrpdb
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `countries`
--

DROP TABLE IF EXISTS `countries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `countries` (
  `country_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`country_id`),
  UNIQUE KEY `id_UNIQUE` (`country_id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries`
--

LOCK TABLES `countries` WRITE;
/*!40000 ALTER TABLE `countries` DISABLE KEYS */;
INSERT INTO `countries` VALUES (1,'Israel'),(2,'USA'),(3,'Zulu');
/*!40000 ALTER TABLE `countries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `customer_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `id_UNIQUE` (`customer_id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (2,'Amazon'),(1,'AT&T'),(3,'Google');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organizations`
--

DROP TABLE IF EXISTS `organizations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organizations` (
  `organization_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`organization_id`),
  UNIQUE KEY `id_UNIQUE` (`organization_id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organizations`
--

LOCK TABLES `organizations` WRITE;
/*!40000 ALTER TABLE `organizations` DISABLE KEYS */;
INSERT INTO `organizations` VALUES (1,'Billing'),(2,'DevOps'),(3,'Zozo');
/*!40000 ALTER TABLE `organizations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orgcon`
--

DROP TABLE IF EXISTS `orgcon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orgcon` (
  `orgcon_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `org_id` int(10) unsigned NOT NULL,
  `count_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`orgcon_id`),
  UNIQUE KEY `id_UNIQUE` (`orgcon_id`),
  KEY `id_org_idx` (`org_id`),
  KEY `id_count_idx` (`count_id`),
  CONSTRAINT `oc_id_count` FOREIGN KEY (`count_id`) REFERENCES `countries` (`country_id`),
  CONSTRAINT `oc_id_org` FOREIGN KEY (`org_id`) REFERENCES `organizations` (`organization_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orgcon`
--

LOCK TABLES `orgcon` WRITE;
/*!40000 ALTER TABLE `orgcon` DISABLE KEYS */;
INSERT INTO `orgcon` VALUES (1,1,1),(2,2,2),(3,3,3);
/*!40000 ALTER TABLE `orgcon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prediction_info`
--

DROP TABLE IF EXISTS `prediction_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prediction_info` (
  `prediction_info_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `project_update_id` int(10) unsigned NOT NULL,
  `project_orgcon_id` int(10) unsigned NOT NULL,
  `pm_demand_0` int(10) unsigned NOT NULL,
  `dm_demand_0` int(10) unsigned NOT NULL,
  `actual_0` int(10) unsigned NOT NULL,
  `prediction_0` int(10) unsigned NOT NULL,
  `pm_demand_1` int(10) unsigned NOT NULL,
  `dm_demand_1` int(10) unsigned NOT NULL,
  `prediction_1` int(10) unsigned NOT NULL,
  `pm_demand_2` int(10) unsigned NOT NULL,
  `dm_demand_2` int(10) unsigned NOT NULL,
  `prediction_2` int(10) unsigned NOT NULL,
  `pm_demand_3` int(10) unsigned NOT NULL,
  `dm_demand_3` int(10) unsigned NOT NULL,
  `prediction_3` int(10) unsigned NOT NULL,
  `pm_demand_4` int(10) unsigned NOT NULL,
  `dm_demand_4` int(10) unsigned NOT NULL,
  `prediction_4` int(10) unsigned NOT NULL,
  `pm_demand_5` int(10) unsigned NOT NULL,
  `dm_demand_5` int(10) unsigned NOT NULL,
  `prediction_5` int(10) unsigned NOT NULL,
  `pm_demand_6` int(10) unsigned NOT NULL,
  `dm_demand_6` int(10) unsigned NOT NULL,
  `prediction_6` int(10) unsigned NOT NULL,
  PRIMARY KEY (`prediction_info_id`),
  KEY `project_update_id_prediction_idx` (`project_update_id`),
  KEY `project_orgcon_id_prediction_idx` (`project_orgcon_id`),
  CONSTRAINT `project_orgcon_id_prediction` FOREIGN KEY (`project_orgcon_id`) REFERENCES `project_orgcon` (`project_orgcon_id`),
  CONSTRAINT `project_update_id_prediction` FOREIGN KEY (`project_update_id`) REFERENCES `project_update` (`project_update_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prediction_info`
--

LOCK TABLES `prediction_info` WRITE;
/*!40000 ALTER TABLE `prediction_info` DISABLE KEYS */;
INSERT INTO `prediction_info` VALUES (1,1,1,4,5,3,5,3,5,4,5,5,5,3,5,4,4,4,4,3,3,3,2,6,4),(2,1,2,3,5,4,4,5,5,5,3,5,4,4,4,4,3,3,3,2,6,4,3,3,3),(3,1,4,2,2,3,2,4,5,4,6,6,6,3,4,3,4,4,4,5,5,5,3,4,3),(4,2,1,5,5,0,5,5,5,5,3,5,4,4,4,4,3,3,3,2,6,4,0,0,0),(5,2,2,4,5,0,4,3,5,4,4,4,4,3,3,3,2,6,4,4,3,3,0,0,0),(6,2,4,5,5,5,3,5,4,4,4,4,4,3,3,3,2,6,4,4,4,4,0,0,0);
/*!40000 ALTER TABLE `prediction_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_orgcon`
--

DROP TABLE IF EXISTS `project_orgcon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project_orgcon` (
  `project_orgcon_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `orgcon_id` int(10) unsigned NOT NULL,
  `project_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`project_orgcon_id`),
  UNIQUE KEY `project_orgcon_id_UNIQUE` (`project_orgcon_id`),
  KEY `orgcon_id_project_idx` (`orgcon_id`),
  KEY `project_id_project_idx` (`project_id`),
  CONSTRAINT `orgcon_id_project` FOREIGN KEY (`orgcon_id`) REFERENCES `orgcon` (`orgcon_id`),
  CONSTRAINT `project_id_project` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_orgcon`
--

LOCK TABLES `project_orgcon` WRITE;
/*!40000 ALTER TABLE `project_orgcon` DISABLE KEYS */;
INSERT INTO `project_orgcon` VALUES (1,1,1),(2,2,1),(3,1,2),(4,3,1);
/*!40000 ALTER TABLE `project_orgcon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_update`
--

DROP TABLE IF EXISTS `project_update`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project_update` (
  `project_update_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `update_month` date NOT NULL,
  `current_due_date` date NOT NULL,
  `project_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`project_update_id`),
  UNIQUE KEY `project_update_id_UNIQUE` (`project_update_id`),
  KEY `project_id_update_idx` (`project_id`),
  CONSTRAINT `project_id_update` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_update`
--

LOCK TABLES `project_update` WRITE;
/*!40000 ALTER TABLE `project_update` DISABLE KEYS */;
INSERT INTO `project_update` VALUES (1,'2001-01-20','2009-09-20',1),(2,'2001-02-20','2009-09-20',1),(3,'2002-02-20','2008-08-20',2);
/*!40000 ALTER TABLE `project_update` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `projects` (
  `project_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `customer_id` int(10) unsigned NOT NULL,
  `name` varchar(45) NOT NULL,
  `start_date` date NOT NULL,
  `due_date` date NOT NULL,
  PRIMARY KEY (`project_id`),
  UNIQUE KEY `project_id_UNIQUE` (`project_id`),
  KEY `customer_id_project_idx` (`customer_id`),
  CONSTRAINT `customer_id_project` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projects`
--

LOCK TABLES `projects` WRITE;
/*!40000 ALTER TABLE `projects` DISABLE KEYS */;
INSERT INTO `projects` VALUES (1,1,'UpdateEmails','2001-01-20','2009-09-20'),(2,1,'Buy Drinks','2002-02-20','2008-08-20'),(3,2,'Check Phone','2001-01-20','2008-08-20');
/*!40000 ALTER TABLE `projects` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-04 19:52:10
