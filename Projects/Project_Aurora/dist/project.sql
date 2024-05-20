-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 06, 2023 at 12:11 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `beauty`
--

CREATE TABLE `beauty` (
  `id` int(11) NOT NULL,
  `Facemask` varchar(50) NOT NULL,
  `Hairoil` varchar(50) NOT NULL,
  `Sambok` varchar(50) NOT NULL,
  `Facial` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `beauty`
--

INSERT INTO `beauty` (`id`, `Facemask`, `Hairoil`, `Sambok`, `Facial`) VALUES
(35, '150', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `coffee`
--

CREATE TABLE `coffee` (
  `id` int(11) NOT NULL,
  `Pods` varchar(50) NOT NULL,
  `Achillea` varchar(50) NOT NULL,
  `Beans` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ctransactions`
--

CREATE TABLE `ctransactions` (
  `id` int(11) NOT NULL,
  `Customer` varchar(50) NOT NULL,
  `Received` varchar(50) NOT NULL,
  `Date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ctransactions`
--

INSERT INTO `ctransactions` (`id`, `Customer`, `Received`, `Date`) VALUES
(1, 'tokollo@12', '2000', '4 November 2023'),
(2, 'Ogotlhe', '4000', '2 November 2023'),
(3, 'Katlego', '4500', '6 November 2023'),
(4, 'Mike', '1600', '4 November 2023'),
(5, 'Mbali', '2300', '1 November 2023');

-- --------------------------------------------------------

--
-- Table structure for table `customer_ratings`
--

CREATE TABLE `customer_ratings` (
  `id` int(11) NOT NULL,
  `Question_1` varchar(50) NOT NULL,
  `Question_2` varchar(50) NOT NULL,
  `Question_3` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer_ratings`
--

INSERT INTO `customer_ratings` (`id`, `Question_1`, `Question_2`, `Question_3`) VALUES
(1, 'Nowhere everything seems to be in order', 'None I wasable to understand the system', 'None everything was okay'),
(2, 'Help customers understand what the product is', 'it took too long', 'I could not track the delivery'),
(3, 'Nothing everything is working properly', 'It needs more validation', 'None '),
(4, 'Update us on new products', 'It took too long', 'I could not track it');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `Employee` varchar(50) NOT NULL,
  `Paid` varchar(50) NOT NULL,
  `Date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `fitness`
--

CREATE TABLE `fitness` (
  `id` int(11) NOT NULL,
  `sportmassage` varchar(50) NOT NULL,
  `lipbalm` varchar(50) NOT NULL,
  `Marvellousman` varchar(50) NOT NULL,
  `Wheatgrass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(50) NOT NULL,
  `UserName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `CPassword` varchar(50) NOT NULL,
  `Gender` varchar(5) NOT NULL,
  `userType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `UserName`, `LastName`, `Email`, `Phone`, `Password`, `CPassword`, `Gender`, `userType`) VALUES
(1, 'Ogotlhe', 'Tsheko', 'tsheko@gmail.com', '0606554297', '2002', '2002', 'male', 'Customer'),
(2, 'tokollo@12', 'melanie', 'toko@gmail.com', '0663947776', '12345', '12345', 'Male', 'Customer'),
(3, 'Mike', 'Water', 'mike@gmail.com', '0733944393', 'Mike123', 'Mike123', 'male', 'Customer'),
(4, 'Mbali', 'Moroka', 'Mbali23@spu.ac.za', '0849385934', '3456', '3456', 'femal', 'Customer'),
(6, 'Katlego', 'Moroka', 'moroka@gmail.com', '0837473782', '2003', '2003', 'male', 'Customer'),
(8, 'Mark', 'test me', 'test@mail.com', '0733944393', 'test123', 'test123', 'male', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `manageorder`
--

CREATE TABLE `manageorder` (
  `id` int(11) NOT NULL,
  `OrderNo` varchar(50) NOT NULL,
  `OrderDate` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Pick_Up` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `oil`
--

CREATE TABLE `oil` (
  `id` int(11) NOT NULL,
  `CBDoil` varchar(50) NOT NULL,
  `Nervetonic` varchar(50) NOT NULL,
  `Hcream` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `oil`
--

INSERT INTO `oil` (`id`, `CBDoil`, `Nervetonic`, `Hcream`) VALUES
(0, '4254', '224', '2324');

-- --------------------------------------------------------

--
-- Table structure for table `oil2`
--

CREATE TABLE `oil2` (
  `id` int(11) NOT NULL,
  `CBDoil` varchar(50) NOT NULL,
  `Nervetonic` varchar(50) NOT NULL,
  `Hcream` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orderdetails`
--

CREATE TABLE `orderdetails` (
  `id` int(11) NOT NULL,
  `OrderNo` varchar(50) NOT NULL,
  `OrderDate` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Pick_Up` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orderdetails`
--

INSERT INTO `orderdetails` (`id`, `OrderNo`, `OrderDate`, `Address`, `Pick_Up`) VALUES
(25, '23A', '6 November 2023', '78393', '');

-- --------------------------------------------------------

--
-- Table structure for table `receipt`
--

CREATE TABLE `receipt` (
  `id` int(11) NOT NULL,
  `Items` varchar(50) NOT NULL,
  `Total` varchar(50) NOT NULL,
  `Delivery` varchar(50) NOT NULL,
  `Pick_Up` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `receipt`
--

INSERT INTO `receipt` (`id`, `Items`, `Total`, `Delivery`, `Pick_Up`) VALUES
(1, 'item', '200', 'waterworks', '7frnfj');

-- --------------------------------------------------------

--
-- Table structure for table `soap`
--

CREATE TABLE `soap` (
  `id` int(11) NOT NULL,
  `Asoap` varchar(50) NOT NULL,
  `Afungal` varchar(50) NOT NULL,
  `Csoap` varchar(50) NOT NULL,
  `Hsoap` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `id` int(11) NOT NULL,
  `beauty` varchar(50) NOT NULL,
  `oil` varchar(50) NOT NULL,
  `Fitness` varchar(50) NOT NULL,
  `Soap` varchar(50) NOT NULL,
  `Coffee` varchar(50) NOT NULL,
  `GrandTotal` varchar(50) NOT NULL,
  `ordernr` varchar(5) NOT NULL,
  `orderdate` varchar(50) NOT NULL,
  `ordertype` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`id`, `beauty`, `oil`, `Fitness`, `Soap`, `Coffee`, `GrandTotal`, `ordernr`, `orderdate`, `ordertype`) VALUES
(20, '150.0', '0', '0', '80.0', '0', '230.0', '23A', '6 November 2023', 'Backorder'),
(21, '0', '0', '0', '0', '0', '0.0', '23A', '6 November 2023', 'Backorder'),
(22, '150.0', '0', '0', '0', '0', '150.0', '23A', '6 November 2023', 'Backorder'),
(23, '150.0', '0', '0', '0', '0', '150.0', '23A', '6 November 2023', 'Backorder');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id` int(11) NOT NULL,
  `Supplier` varchar(50) NOT NULL,
  `ProductID` varchar(50) NOT NULL,
  `Quantity` varchar(50) NOT NULL,
  `DateReceived` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `Supplier`, `ProductID`, `Quantity`, `DateReceived`) VALUES
(1, 'Sam\'s Warehouse', 'BeautyWE132', '130', '31 October 2023'),
(2, 'Sam\'s Warehouse', 'SoapFR356', '120', '31 October 2023'),
(3, 'AgileStock Warehouse', 'Tea&CofeeJGJ76', '90', '31 October 2023'),
(4, 'Sam\'s Warehouse', 'OilBDS439', '110', '31 October 2023'),
(5, 'Sam\'s Warehouse', 'FitnessMK381', '170', '31 October 2023'),
(7, 'PrimeWare', 'FitnessNF493', '170', '31 October 2023');

-- --------------------------------------------------------

--
-- Table structure for table `suppliertransactions`
--

CREATE TABLE `suppliertransactions` (
  `id` int(11) NOT NULL,
  `Supplier` varchar(50) NOT NULL,
  `Paid` varchar(50) NOT NULL,
  `Date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `suppliertransactions`
--

INSERT INTO `suppliertransactions` (`id`, `Supplier`, `Paid`, `Date`) VALUES
(1, 'Sam\'s Warehouse', '400000', '31 October 2023'),
(2, 'AgileStock Warehouse', '530000', '31 October 2023'),
(3, 'PrimeWare', '240000', '31 October 2023');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `beauty`
--
ALTER TABLE `beauty`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `coffee`
--
ALTER TABLE `coffee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ctransactions`
--
ALTER TABLE `ctransactions`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer_ratings`
--
ALTER TABLE `customer_ratings`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fitness`
--
ALTER TABLE `fitness`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `manageorder`
--
ALTER TABLE `manageorder`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `oil2`
--
ALTER TABLE `oil2`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `receipt`
--
ALTER TABLE `receipt`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `soap`
--
ALTER TABLE `soap`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `suppliertransactions`
--
ALTER TABLE `suppliertransactions`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `beauty`
--
ALTER TABLE `beauty`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `coffee`
--
ALTER TABLE `coffee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `ctransactions`
--
ALTER TABLE `ctransactions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `customer_ratings`
--
ALTER TABLE `customer_ratings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `fitness`
--
ALTER TABLE `fitness`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `manageorder`
--
ALTER TABLE `manageorder`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `oil2`
--
ALTER TABLE `oil2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `orderdetails`
--
ALTER TABLE `orderdetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `receipt`
--
ALTER TABLE `receipt`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `soap`
--
ALTER TABLE `soap`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `suppliertransactions`
--
ALTER TABLE `suppliertransactions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
