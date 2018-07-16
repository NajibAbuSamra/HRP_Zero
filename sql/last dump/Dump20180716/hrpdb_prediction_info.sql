-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: hrpdb
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
-- Table structure for table `prediction_info`
--

DROP TABLE IF EXISTS `prediction_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prediction_info` (
  `prediction_info_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `project_update_id` int(10) unsigned DEFAULT NULL,
  `project_orgcon_id` int(10) unsigned DEFAULT NULL,
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
  CONSTRAINT `project_orgcon_id_prediction` FOREIGN KEY (`project_orgcon_id`) REFERENCES `project_orgcon` (`project_orgcon_id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `project_update_id_prediction` FOREIGN KEY (`project_update_id`) REFERENCES `project_update` (`project_update_id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-16 17:57:57
