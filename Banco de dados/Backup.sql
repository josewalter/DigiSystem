-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.7.28-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para db_pessoas
CREATE DATABASE IF NOT EXISTS `db_pessoas` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_pessoas`;

-- Copiando estrutura para tabela db_pessoas.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_pessoas.hibernate_sequence: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(2);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Copiando estrutura para tabela db_pessoas.tbl_pessoa
CREATE TABLE IF NOT EXISTS `tbl_pessoa` (
  `fu_codigo` bigint(20) NOT NULL,
  `fu_idade` varchar(3) NOT NULL,
  `fu_nome` varchar(35) NOT NULL,
  `fu_salario` varchar(6) NOT NULL,
  PRIMARY KEY (`fu_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_pessoas.tbl_pessoa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_pessoa` DISABLE KEYS */;
INSERT INTO `tbl_pessoa` (`fu_codigo`, `fu_idade`, `fu_nome`, `fu_salario`) VALUES
	(1, '40', 'João', '2.500');
/*!40000 ALTER TABLE `tbl_pessoa` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
