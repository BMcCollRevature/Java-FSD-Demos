-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: bank
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `name` char(20) DEFAULT NULL,
  `username` char(20) DEFAULT NULL,
  `password` char(20) DEFAULT NULL,
  `account_type` char(20) DEFAULT NULL,
  `balance` double(10,2) DEFAULT NULL,
  `account_status` char(20) DEFAULT NULL,
  `transaction_id` int DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `transaction_id` (`transaction_id`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`transaction_id`) REFERENCES `transaction` (`transaction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'John','John123','Pizza',NULL,NULL,'aprrove',NULL),(2,'Bob','Bob123','Burger',NULL,NULL,NULL,NULL),(3,'Tom','Tom123','Tommy',NULL,NULL,NULL,NULL),(4,NULL,NULL,NULL,'Savings',500.00,'active',NULL),(5,'Bobby','bob123','garfield',NULL,NULL,'approve',NULL),(11,'Paul','Pauly','Paulina','checking',0.00,'active',NULL),(12,'Sandra','Sandy','Freckles','savings',300.00,'active',NULL),(13,'Danial','DanM','Sallie','savings',400.00,'active',NULL),(14,'Mike','Mickey','McDonalds','savings',300.00,'active',NULL),(15,'Rachel','Rae','Rachel123','checking',700.00,'active',NULL),(16,'Lily','Lilychu','Temie','savings',NULL,'active',NULL),(17,'Thomas','Tommy','Train','savings',NULL,'active',NULL),(18,'Monique','momo','RosaryGirl','savings',0.00,'active',NULL),(19,'','Thomas','tommy',NULL,NULL,NULL,NULL),(20,'Mark','mmmmark','',NULL,NULL,NULL,NULL),(21,'Mark','mmmmark','',NULL,NULL,NULL,NULL),(22,'Mark','mmmmark','hello123','savings',400.00,'active',NULL),(23,'Paul','Paully','market','checking',400.00,'active',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-12 14:57:22
