-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04-Maio-2018 às 11:54
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bd_cafe`
--
CREATE DATABASE IF NOT EXISTS `bd_cafe` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bd_cafe`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_fornecedor`
--

CREATE TABLE `tb_fornecedor` (
  `CNPJ` int(18) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  `CEP` varchar(9) NOT NULL,
  `endereco` varchar(40) NOT NULL,
  `cidade` varchar(40) NOT NULL,
  `descricao` varchar(60) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_funcionario`
--

CREATE TABLE `tb_funcionario` (
  `cod_funcionario` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `RG` varchar(12) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `endereco` varchar(40) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  `celular` varchar(10) NOT NULL,
  `email` varchar(40) NOT NULL,
  `CEP` varchar(9) NOT NULL,
  `cidade` varchar(10) NOT NULL,
  `funcao` varchar(30) NOT NULL,
  `num_dep` varchar(2) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `senha` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_ingredientes`
--

CREATE TABLE `tb_ingredientes` (
  `cod_ingred` int(11) NOT NULL,
  `CNPJ` int(18) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `descricao` varchar(60) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_ingredientes`
--

INSERT INTO `tb_ingredientes` (`cod_ingred`, `CNPJ`, `nome`, `quantidade`, `descricao`) VALUES
(1, 2, 'wsrgdtswtsw', 23, 'fadgbregrfegter'),
(4, 12, 'rtgrftgwser4e', 12, 'dsgrazrwerfrffre'),
(5, 1, 'Açucar', 500, 'gramas'),
(6, 3, 'yhrftg', 125, 'fgzrdfg'),
(7, 1, 'rggr', 3, 'eafe'),
(8, 1, 'rggr', 3, 'eafe'),
(9, 1, 'rggr', 3, 'eafe'),
(10, 1, 'htedtg', 4, 'gfrsxg'),
(11, 1, 'sgrf', 878, 'gear'),
(12, 1, 'rgega', 14, 'rwehrfg'),
(13, 1, 'gsdre', 14, 'rwehrfg'),
(14, 1, 'argee', 31, 'geehe');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_listaingredientes`
--

CREATE TABLE `tb_listaingredientes` (
  `cod_listai` int(11) NOT NULL,
  `cod_ingred` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_listapratos`
--

CREATE TABLE `tb_listapratos` (
  `cod_listap` int(11) NOT NULL,
  `cod_prato` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_pedido`
--

CREATE TABLE `tb_pedido` (
  `cod_ped` int(11) NOT NULL,
  `cod_funcionario` int(11) NOT NULL,
  `cod_listap` int(11) NOT NULL,
  `cliente` varchar(20) NOT NULL,
  `horario` varchar(5) NOT NULL,
  `mesa` varchar(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_pratos`
--

CREATE TABLE `tb_pratos` (
  `cod_prato` int(11) NOT NULL,
  `cod_listai` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(60) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `tempo_prep` varchar(5) NOT NULL,
  `preco` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_fornecedor`
--
ALTER TABLE `tb_fornecedor`
  ADD PRIMARY KEY (`CNPJ`);

--
-- Indexes for table `tb_funcionario`
--
ALTER TABLE `tb_funcionario`
  ADD PRIMARY KEY (`cod_funcionario`);

--
-- Indexes for table `tb_ingredientes`
--
ALTER TABLE `tb_ingredientes`
  ADD PRIMARY KEY (`cod_ingred`);

--
-- Indexes for table `tb_listaingredientes`
--
ALTER TABLE `tb_listaingredientes`
  ADD PRIMARY KEY (`cod_listai`);

--
-- Indexes for table `tb_listapratos`
--
ALTER TABLE `tb_listapratos`
  ADD PRIMARY KEY (`cod_listap`);

--
-- Indexes for table `tb_pedido`
--
ALTER TABLE `tb_pedido`
  ADD PRIMARY KEY (`cod_ped`);

--
-- Indexes for table `tb_pratos`
--
ALTER TABLE `tb_pratos`
  ADD PRIMARY KEY (`cod_prato`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_funcionario`
--
ALTER TABLE `tb_funcionario`
  MODIFY `cod_funcionario` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_ingredientes`
--
ALTER TABLE `tb_ingredientes`
  MODIFY `cod_ingred` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `tb_listaingredientes`
--
ALTER TABLE `tb_listaingredientes`
  MODIFY `cod_listai` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_listapratos`
--
ALTER TABLE `tb_listapratos`
  MODIFY `cod_listap` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_pedido`
--
ALTER TABLE `tb_pedido`
  MODIFY `cod_ped` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_pratos`
--
ALTER TABLE `tb_pratos`
  MODIFY `cod_prato` int(11) NOT NULL AUTO_INCREMENT;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
