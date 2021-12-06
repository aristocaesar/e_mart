-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2021 at 10:46 PM
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
('BRG0001', 'Bonkyo Wireless Optical Mouse Dan Minimalism - MSE6', 'K010', 59900, 14, 'S006', '2021-12-06 07:50:03', '2021-12-06 01:48:28'),
('BRG0002', 'Monitor Samsung 24\" 75hz S24R350 IPS FHD HDMI LED (LS24R350FHE)', 'K001', 2241400, 14, 'S006', '2021-12-07 02:47:30', '2021-12-07 02:47:30'),
('BRG0003', 'Xiaomi Mi 23.8 Inch Desktop Monitor 1C Full HD Redmi 1A Garansi Resmi', 'K001', 2175000, 67, 'S008', '2021-12-07 02:48:14', '2021-12-07 02:48:14'),
('BRG0004', 'Acetech Wireless Mouse Gaming - Mouse Wireless Bluetooth Gaming A30 Black', 'K024', 39000, 6, 'S018', '2021-12-07 02:48:35', '2021-12-07 02:48:35'),
('BRG0005', 'TP-LINK TL-WR 840N Router TP Link TL-WR840N Wifi Wireless N Router 300Mbps', 'K024', 148000, 45, 'S009', '2021-12-07 02:49:14', '2021-12-07 02:49:14'),
('BRG0006', 'Tenda AC6 Wireless Router AC1200 Smart Dual-Band WiFI Router', 'K024', 308000, 10, 'S017', '2021-12-07 02:49:35', '2021-12-07 02:49:35'),
('BRG0007', 'Kabel Lan Cat5e FTP STP Outdoor 30 Meter Siap Pakai Kabel UTPp', 'K025', 62500, 51, 'S016', '2021-12-07 02:50:23', '2021-12-07 04:22:29');

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
('K024', 'Access Point'),
('K017', 'Charger Laptop'),
('K011', 'Flaskdisk'),
('K012', 'Harddisk'),
('K019', 'Kabel HDMI'),
('K006', 'Kabel Sata'),
('K016', 'Kabel VGA'),
('K009', 'Kipas Pendingin'),
('K025', 'Konektor'),
('K021', 'LCD Laptop'),
('K008', 'Modem'),
('K001', 'Monitor'),
('K010', 'Mouse'),
('K014', 'Power Supply'),
('K007', 'Printer'),
('K018', 'Processor'),
('K015', 'RAM'),
('K020', 'Scanner'),
('K005', 'Sound Speaker'),
('K013', 'SSD'),
('K003', 'Tinta'),
('K022', 'USB Bluetooth'),
('K023', 'Wifi Adapther');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` varchar(8) NOT NULL,
  `nama_supplier` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`) VALUES
('S018', 'Bhineka'),
('S008', 'Cv.Caesar Cell'),
('S004', 'Cv.Utama Joyo Kencono Mandraguno'),
('S009', 'Dino Market'),
('S017', 'Itnesia'),
('S011', 'Jakarta Notebook'),
('S015', 'Jakmall'),
('S019', 'Joom'),
('S016', 'Jualo'),
('S010', 'Lazada'),
('S014', 'Multicom'),
('S005', 'Pt.Djarum Super Indonesia'),
('S002', 'Pt.Gudang Ganam'),
('S001', 'Pt.Mabuk Cinta Abadi Sentosa'),
('S006', 'Pt.Mencari Cinta Sejati'),
('S007', 'Pt.Player Cell'),
('S003', 'Pt.Sesuk Sukses Sampek Tipes'),
('S020', 'Sanberg'),
('S013', 'Soklik'),
('S012', 'Toko Komputer ');

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
('T001', 'Player Cell', 'Jl. Mastrip, Krajan Timur, Sumbersari, Kec. Sumbersari, Kabupaten Jember, Jawa Timur 68121', '0', '2021-12-06 01:43:21');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kode_transaksi` varchar(11) NOT NULL,
  `diskon` int(16) NOT NULL,
  `ppn` int(16) NOT NULL,
  `grand_total` int(16) NOT NULL,
  `tunai` int(16) NOT NULL,
  `id_user` varchar(8) NOT NULL,
  `created_at` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`kode_transaksi`, `diskon`, `ppn`, `grand_total`, `tunai`, `id_user`, `created_at`) VALUES
('TR756454321', 10, 10, 43000, 50000, 'U001', '2021-12-04 02:45:37');

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
('U001', '1', 'ARISTO CAESAR PRATAMA', '1', 1, '0852351191010', 'Aktif', '2021-12-07 04:43:43', '2021-12-03 01:50:51', '2021-12-05 14:19:21'),
('U002', 'person', 'ANJAY GAMING', 'person', 2, '543534534', 'Aktif', '2021-12-06 07:53:33', '2021-12-03 01:54:41', '2021-12-06 07:52:27'),
('U004', 'a', 'ETST 2 DAS', 'a', 2, '12312', 'Non-Aktif', '2021-12-04 16:14:39', '2021-12-04 05:20:58', '2021-12-05 14:08:35');

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
  ADD CONSTRAINT `FK_barang` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_transaksi` FOREIGN KEY (`kode_transaksi`) REFERENCES `transaksi` (`kode_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_detail_ibfk_3` FOREIGN KEY (`kode_transaksi`) REFERENCES `transaksi` (`kode_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
