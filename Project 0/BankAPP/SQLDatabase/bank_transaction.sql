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
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `transaction_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `transaction_type` char(20) DEFAULT NULL,
  `transaction_amount` double(10,2) DEFAULT NULL,
  `transaction_status` char(20) DEFAULT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `fk_user` (`user_id`),
  CONSTRAINT `fk_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1,17,'withdrawal',100.00,'approve'),(2,17,'withdrawal',100.00,'approve'),(3,16,'withdrawal',100.00,NULL),(4,18,'withdrawal',100.00,NULL),(5,18,'withdrawal',100.00,NULL),(6,22,'withdrawal',100.00,'approve'),(7,22,'deposit',200.00,'approve'),(8,22,'transfer',200.00,'approve'),(9,23,'transfer',200.00,'approve'),(10,18,'transfer',100.00,NULL),(11,23,'transfer',100.00,'approve'),(12,11,'transfer',100.00,NULL),(13,23,'transfer',100.00,'approve'),(14,12,'transfer',100.00,NULL),(15,23,'transfer',100.00,'approve'),(16,13,'transfer',100.00,NULL),(17,13,'transfer',100.00,NULL),(18,13,'transfer',100.00,NULL),(19,13,'withdrawal',100.00,NULL),(20,12,'transfer',200.00,NULL),(21,23,'transfer',200.00,'approve'),(22,14,'transfer',200.00,NULL),(23,23,'transfer',200.00,'approve'),(24,15,'transfer',200.00,'approve'),(25,22,'transfer',200.00,'approve'),(26,22,'transfer',300.00,'approve'),(27,15,'transfer',300.00,'approve'),(28,13,'deposit',100.00,NULL),(29,13,'transfer',100.00,'pending'),(30,15,'transfer',100.00,'approve');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-12 14:57:23
