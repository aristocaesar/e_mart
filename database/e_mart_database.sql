-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2021 at 07:02 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `e_mart_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kode_barang` varchar(8) NOT NULL,
  `nama_barang` varchar(128) NOT NULL,
  `kategori` varchar(8) NOT NULL,
  `harga` int(16) NOT NULL,
  `stok` int(16) NOT NULL,
  `supplier` varchar(8) NOT NULL,
  `created_at` datetime DEFAULT current_timestamp(),
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode_barang`, `nama_barang`, `kategori`, `harga`, `stok`, `supplier`, `created_at`, `updated_at`) VALUES
('BRG0001', 'Webcam SPC WC02 1080HD / 2MP Full HD - Web Cam SPC WC 02', 'K023', 195000, 2, 'S019', '2021-12-09 14:14:45', '2021-12-09 14:14:45'),
('BRG0002', 'Mouse Gaming RAZER DeathAdder Essential Wired 6400 DPI', 'K002', 249000, 4, 'S014', '2021-12-09 14:15:08', '2021-12-09 14:15:08'),
('BRG0003', 'Motherboard MSI MEG Z490 GODLIKE - MB MSI MEG Z 490 Godlike', 'K018', 13850000, 7, 'S006', '2021-12-09 14:16:03', '2021-12-09 14:16:03'),
('BRG0004', 'LED Monitor Gaming ASUS ROG STRIX XG279Q-G 27 Inch 170Hz WQHD HDMI Display Port', 'K011', 12650000, 3, 'S015', '2021-12-09 14:16:44', '2021-12-09 14:16:44'),
('BRG0005', 'LED Monitor Gaming Philips 242E1GSJ/70 23.8 Inch 144Hz FHD HDMI DP', 'K011', 2500000, 2, 'S004', '2021-12-09 14:17:21', '2021-12-09 14:17:21'),
('BRG0006', 'Xiaomi Mi 23.8 Inch Desktop Monitor 1C Full HD Redmi 1A Garansi Resmi', 'K011', 2175000, 5, 'S008', '2021-12-09 14:17:46', '2021-12-09 16:36:32'),
('BRG0007', 'Logitech C270 Webcam HD 720p untuk Windows, Mac OS & Chrome OS', 'K023', 329000, 16, 'S013', '2021-12-09 14:18:23', '2021-12-09 14:19:03'),
('BRG0008', 'Fantech Webcam 2K 4MP Luminous C30 QHD 1440P', 'K023', 319000, 11, 'S005', '2021-12-09 14:18:51', '2021-12-09 14:18:51'),
('BRG0009', 'UPUPIN Q13 Wireless Silent Mouse Gaming Mouse RGB', 'K002', 83000, 6, 'S006', '2021-12-09 14:19:54', '2021-12-09 14:19:54'),
('BRG0010', 'Mouse Gaming HP M160 - 1000DPI RGB USB Wired', 'K002', 59000, 12, 'S018', '2021-12-09 14:20:22', '2021-12-09 14:20:22'),
('BRG0011', 'MSI Motherboard H410M Bomber - LGA1200', 'K018', 980000, 5, 'S016', '2021-12-09 14:21:03', '2021-12-09 14:21:03'),
('BRG0012', 'Gigabyte Motherboard Micro ATX Intel B460M DS3H V2', 'K018', 1496000, 7, 'S013', '2021-12-09 14:21:27', '2021-12-09 14:21:27'),
('BRG0013', 'TP-LINK TL-WR 840N Router TP Link TL-WR840N Wifi Wireless N Router 300Mbps', 'K001', 148000, 9, 'S013', '2021-12-09 14:22:05', '2021-12-09 14:22:05'),
('BRG0014', 'Tenda O3 5km Outdoor Point To Point Cpe', 'K001', 360000, 8, 'S010', '2021-12-09 14:22:57', '2021-12-09 14:22:57'),
('BRG0015', 'TP-LINK EAP 110 300Mbps Wireless N Ceiling Mount Access Poin TL-EAP110', 'K001', 452900, 8, 'S015', '2021-12-09 14:23:20', '2021-12-09 14:23:20'),
('BRG0016', 'Mercusys MW302R 300Mbps Multi-Mode Wireless N Router Garansi Resmi 1 Tahun', 'K001', 127300, 7, 'S009', '2021-12-09 14:23:44', '2021-12-09 14:23:44'),
('BRG0017', 'PRINTER BLUETOOTH MINI PRINTER THERMAL 58MM OKAY 58D PRJ-58D KASIR PPOB POS printer termal', 'K016', 299000, 20, 'S019', '2021-12-09 14:24:11', '2021-12-09 14:24:45'),
('BRG0018', 'Hp Deskjet 2335 / 2336 / 2337 Ink Advantage All-In-One Printer - Print , Scan Dan', 'K016', 699000, 8, 'S004', '2021-12-09 14:24:38', '2021-12-09 14:24:38'),
('BRG0019', 'Hp Printer Smart Tank 515 Wireless All-In-One', 'K016', 2649000, 9, 'S012', '2021-12-09 14:25:12', '2021-12-09 14:25:12'),
('BRG0020', 'RAM NB SAMSUNG DDR3L 8GB 12800 / 1600MHz LAPTOP / NB SODIMM PC3L SAMSUNG ORIGINAL', 'K007', 310000, 11, 'S007', '2021-12-09 14:25:50', '2021-12-09 14:25:50'),
('BRG0021', 'RAM KINGSTON HYPERX FURY GAMING DDR3 8GB 1600MHz 12800 RAM PC DDR3 8GB', 'K007', 365000, 7, 'S017', '2021-12-09 14:26:13', '2021-12-09 14:26:13'),
('BRG0022', 'RAM DDR4 SODimm V-GeN 8GB PC25600/3200Mhz (Memory Laptop VGEN)', 'K007', 488000, 13, 'S013', '2021-12-09 14:26:46', '2021-12-09 14:26:46'),
('BRG0023', 'PROCESSOR INTEL CORE I5 9400F BOX COFFEE LAKE SOKET LGA 1151', 'K010', 2298000, 7, 'S018', '2021-12-09 14:28:23', '2021-12-09 14:28:23'),
('BRG0024', 'Processor Intel Core i5-760 / i5 750 2.8 GHz Socket 1156 LGA Tray', 'K010', 167000, 6, 'S002', '2021-12-09 14:28:53', '2021-12-09 14:29:06'),
('BRG0025', 'Processor Intel Core I3 10105F Box Comet Lake Socket LGA 1200', 'K010', 1350000, 9, 'S011', '2021-12-09 14:29:44', '2021-12-09 14:29:44'),
('BRG0026', 'XBT Fan Casing 12CM LED RING - Fan Case XB-112 ORI', 'K006', 35000, 4, 'S012', '2021-12-09 14:31:00', '2021-12-09 14:31:00'),
('BRG0027', 'Fan Case Casing 12Cm 12 cm Hitam Standart Kipas Komputer Cpu pendingin', 'K006', 15200, 5, 'S010', '2021-12-09 14:31:27', '2021-12-09 14:31:27'),
('BRG0028', 'Fan casing 8 cm tranparan with led ', 'K006', 17100, 3, 'S011', '2021-12-09 14:31:49', '2021-12-09 14:31:49'),
('BRG0029', 'Earise Paket Keyboard gaming dan Mouse/Set Gaming Mouse dan Keyboard USB Cable RGB', 'K003', 85000, 7, 'S013', '2021-12-09 14:32:32', '2021-12-09 14:32:32'),
('BRG0030', 'Jovitech Pengukiran Laser Paket Gaming Keyboard dan Mouse RGB G12/ Gaming USB Cable RGB mechanical', 'K003', 129900, 3, 'S010', '2021-12-09 14:32:57', '2021-12-09 14:33:10');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` varchar(8) NOT NULL,
  `nama_kategori` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`) VALUES
('K001', 'Access Point'),
('K006', 'Air Coller'),
('K014', 'Bluetooth Adapter'),
('K009', 'Card Reader'),
('K012', 'Kabel Connector'),
('K003', 'Keyboard'),
('K005', 'Microfone'),
('K022', 'Modem'),
('K011', 'Monitor'),
('K018', 'MotherBoard'),
('K002', 'Mouse'),
('K020', 'PCI Express'),
('K008', 'Penyimpanan Komputer'),
('K016', 'Printer'),
('K010', 'Processor'),
('K007', 'RAM'),
('K017', 'Scanner'),
('K004', 'Speaker Aktif'),
('K021', 'Tinta Printer'),
('K013', 'USB Sound Card'),
('K019', 'VGA Card'),
('K023', 'Web Cam'),
('K015', 'Wifi Adapter');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` varchar(8) NOT NULL,
  `nama_supplier` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`) VALUES
('S011', 'CV. Caesar Media'),
('S014', 'CV. Indo Komputer '),
('S012', 'CV. Indo Laga'),
('S013', 'CV. Sentra Computer'),
('S015', 'PT. ABM Investama Tbk'),
('S016', 'PT. Buana Loka'),
('S006', 'PT. Bumi Serpong Jaya'),
('S002', 'PT. Bumi Sukses Indo'),
('S001', 'PT. Djarum Super Indonesia'),
('S007', 'PT. Indocement Tunggal Prakarsa Tbk'),
('S017', 'PT. Jakarta Komputer '),
('S018', 'PT. Jember Teknology'),
('S010', 'PT. Kios Komputer'),
('S008', 'PT. Mencari Cinta Sejati'),
('S005', 'PT. Pakuwon'),
('S004', 'PT. Surya Citra Media'),
('S003', 'PT. Uniliver Indonesia'),
('S009', 'PT. WTC Surabaya'),
('S019', 'PT.Sukses Jaya Banyuwangi');

-- --------------------------------------------------------

--
-- Table structure for table `toko`
--

CREATE TABLE `toko` (
  `id_toko` varchar(8) NOT NULL,
  `nama_toko` varchar(32) NOT NULL,
  `alamat` varchar(128) NOT NULL,
  `no_telp` varchar(13) NOT NULL DEFAULT '0',
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `toko`
--

INSERT INTO `toko` (`id_toko`, `nama_toko`, `alamat`, `no_telp`, `updated_at`) VALUES
('T001', 'SIDO JAYA ABADI', 'Jl. Mastrip, Krajan Timur, Sumbersari, Kec. Sumbersari, Kabupaten Jember, Jawa Timur 68121', '085235119101', '2021-12-09 13:24:04');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kode_transaksi` varchar(11) NOT NULL,
  `diskon` int(16) NOT NULL,
  `grand_total` int(16) NOT NULL,
  `tunai` int(16) NOT NULL,
  `id_user` varchar(8) NOT NULL,
  `created_at` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`kode_transaksi`, `diskon`, `grand_total`, `tunai`, `id_user`, `created_at`) VALUES
('TR124112268', 0, 83000, 100000, 'U001', '2021-12-10 04:11:47'),
('TR180056795', 0, 488000, 500000, 'U002', '2021-12-10 02:35:04'),
('TR207281365', 5, 497800, 530000, 'U002', '2021-12-10 02:10:03'),
('TR241245367', 0, 2066250, 2100000, 'U002', '2021-12-10 02:20:38'),
('TR243346061', 10, 342900, 350000, 'U002', '2021-12-10 01:57:54'),
('TR288049032', 0, 488000, 500000, 'U002', '2021-12-10 02:21:34'),
('TR309174386', 0, 129900, 130000, 'U002', '2021-12-10 04:47:32'),
('TR313120189', 10, 812610, 100, 'U001', '2021-12-10 08:54:12'),
('TR322678933', 0, 329000, 330000, 'U002', '2021-12-10 02:11:13'),
('TR325510159', 0, 2583000, 1, 'U001', '2021-12-10 08:34:48'),
('TR338631610', 0, 319000, 320000, 'U002', '2021-12-10 02:16:13'),
('TR372614273', 0, 83000, 85000, 'U002', '2021-12-10 02:22:30'),
('TR375418027', 0, 15200, 15200, 'U001', '2021-12-10 09:02:55'),
('TR409369970', 0, 167000, 167000, 'U002', '2021-12-10 02:19:08'),
('TR42440499', 0, 310000, 310000, 'U002', '2021-12-10 02:23:52'),
('TR540062470', 0, 1496000, 1500000, 'U002', '2021-12-10 04:45:05'),
('TR552086952', 10, 296100, 300000, 'U002', '2021-12-10 02:13:32'),
('TR552738242', 0, 148000, 150000, 'U002', '2021-12-10 02:25:57'),
('TR562417243', 0, 148000, 150000, 'U001', '2021-12-10 02:26:39'),
('TR626724555', 10, 23550300, 23600000, 'U001', '2021-12-10 08:57:27'),
('TR627510171', 0, 444100, 450000, 'U002', '2021-12-10 02:14:49'),
('TR631612453', 0, 167000, 170000, 'U002', '2021-12-10 02:32:13'),
('TR640504759', 10, 578610, 600000, 'U002', '2021-12-10 02:30:06'),
('TR64569875', 0, 319000, 320000, 'U001', '2021-12-10 02:24:54'),
('TR655711583', 0, 319000, 400000, 'U002', '2021-12-10 02:34:01'),
('TR665921529', 5, 611040, 620000, 'U002', '2021-12-10 02:17:57'),
('TR676593092', 0, 329000, 330000, 'U002', '2021-12-10 02:11:56'),
('TR765556533', 0, 390000, 400000, 'U002', '2021-12-10 01:52:55'),
('TR900333300', 0, 329000, 330000, 'U002', '2021-12-10 02:36:41');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_detail`
--

CREATE TABLE `transaksi_detail` (
  `kode_transaksi` varchar(11) NOT NULL,
  `qyt` int(16) NOT NULL,
  `sub_total` int(16) NOT NULL,
  `kode_barang` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi_detail`
--

INSERT INTO `transaksi_detail` (`kode_transaksi`, `qyt`, `sub_total`, `kode_barang`) VALUES
('TR765556533', 2, 390000, 'BRG0001'),
('TR243346061', 2, 296000, 'BRG0013'),
('TR243346061', 1, 85000, 'BRG0029'),
('TR207281365', 1, 195000, 'BRG0001'),
('TR207281365', 1, 329000, 'BRG0007'),
('TR322678933', 1, 329000, 'BRG0007'),
('TR676593092', 1, 329000, 'BRG0007'),
('TR552086952', 1, 329000, 'BRG0007'),
('TR627510171', 1, 296100, 'BRG0007'),
('TR627510171', 1, 148000, 'BRG0013'),
('TR338631610', 1, 319000, 'BRG0008'),
('TR665921529', 1, 195000, 'BRG0001'),
('TR665921529', 2, 448200, 'BRG0002'),
('TR409369970', 1, 167000, 'BRG0024'),
('TR241245367', 1, 2066250, 'BRG0006'),
('TR288049032', 1, 488000, 'BRG0022'),
('TR372614273', 1, 83000, 'BRG0009'),
('TR42440499', 1, 310000, 'BRG0020'),
('TR64569875', 1, 319000, 'BRG0008'),
('TR552738242', 1, 148000, 'BRG0013'),
('TR562417243', 1, 148000, 'BRG0013'),
('TR640504759', 1, 148000, 'BRG0013'),
('TR640504759', 1, 365000, 'BRG0021'),
('TR640504759', 1, 129900, 'BRG0030'),
('TR631612453', 1, 167000, 'BRG0024'),
('TR655711583', 1, 319000, 'BRG0008'),
('TR180056795', 1, 488000, 'BRG0022'),
('TR900333300', 1, 329000, 'BRG0007'),
('TR124112268', 1, 83000, 'BRG0009'),
('TR540062470', 1, 1496000, 'BRG0012'),
('TR309174386', 1, 129900, 'BRG0030'),
('TR325510159', 1, 2500000, 'BRG0005'),
('TR325510159', 1, 83000, 'BRG0009'),
('TR313120189', 1, 195000, 'BRG0001'),
('TR313120189', 1, 249000, 'BRG0002'),
('TR313120189', 1, 329000, 'BRG0007'),
('TR313120189', 1, 129900, 'BRG0030'),
('TR626724555', 2, 390000, 'BRG0001'),
('TR626724555', 1, 249000, 'BRG0002'),
('TR626724555', 1, 13850000, 'BRG0003'),
('TR626724555', 1, 8855000, 'BRG0004'),
('TR626724555', 1, 2175000, 'BRG0006'),
('TR626724555', 1, 329000, 'BRG0007'),
('TR626724555', 1, 319000, 'BRG0008'),
('TR375418027', 1, 15200, 'BRG0027');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` varchar(8) NOT NULL,
  `username` varchar(64) NOT NULL,
  `nama_lengkap` varchar(64) NOT NULL,
  `password` varchar(256) NOT NULL,
  `role` int(1) NOT NULL,
  `no_hp` varchar(13) NOT NULL DEFAULT '"0"',
  `isAktif` enum('Aktif','Non-Aktif') NOT NULL,
  `login_terbaru` datetime DEFAULT current_timestamp(),
  `created_at` datetime DEFAULT current_timestamp(),
  `updated_at` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `username`, `nama_lengkap`, `password`, `role`, `no_hp`, `isAktif`, `login_terbaru`, `created_at`, `updated_at`) VALUES
('U001', 'admin', 'WILLIAM TANUWIJAYA', 'admin', 1, '085123456789', 'Aktif', '2021-12-10 09:15:01', '2021-12-03 01:50:51', '2021-12-09 13:08:01'),
('U002', 'kasir', 'AHMAD ZACKY', 'kasir', 2, '085987654321', 'Aktif', '2021-12-10 04:46:58', '2021-12-09 13:10:55', '2021-12-09 13:10:55');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`),
  ADD UNIQUE KEY `nama_barang` (`nama_barang`),
  ADD KEY `kategori` (`kategori`),
  ADD KEY `supplier` (`supplier`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`),
  ADD UNIQUE KEY `nama_kategori` (`nama_kategori`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`),
  ADD UNIQUE KEY `nama_supplier` (`nama_supplier`);

--
-- Indexes for table `toko`
--
ALTER TABLE `toko`
  ADD PRIMARY KEY (`id_toko`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kode_transaksi`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  ADD KEY `kode_barang` (`kode_barang`),
  ADD KEY `kode_transaksi` (`kode_transaksi`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `FK_kategori` FOREIGN KEY (`kategori`) REFERENCES `kategori` (`id_kategori`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_supplier` FOREIGN KEY (`supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `FK_user` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  ADD CONSTRAINT `FK_Transaksi` FOREIGN KEY (`kode_transaksi`) REFERENCES `transaksi` (`kode_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
