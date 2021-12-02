-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2021 at 09:41 PM
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
('BRG0001', 'Epson Printer L121 Print Only - Garansi Resmi Epson', 'K001', 1735000, 20, 'S001', '2021-11-26 00:40:08', '2021-11-25 18:37:50'),
('BRG0002', 'Tinta Canon BLUEPRINT Refill For Printer Canon 100ml - Varian Warna', 'K002', 43000, 10, 'S002', '2021-11-26 00:40:59', '2021-11-25 18:40:11');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `kode_kategori` varchar(8) NOT NULL,
  `nama_kategori` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`kode_kategori`, `nama_kategori`) VALUES
('K001', 'Printer'),
('K002', 'Tinta');

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
('S001', 'PT.Centrakom'),
('S002', 'PT.Multikom');

-- --------------------------------------------------------

--
-- Table structure for table `toko`
--

CREATE TABLE `toko` (
  `id_toko` varchar(8) NOT NULL,
  `nama_toko` varchar(32) NOT NULL,
  `alamat` varchar(128) NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `toko`
--

INSERT INTO `toko` (`id_toko`, `nama_toko`, `alamat`, `no_telp`, `updated_at`) VALUES
('T001', 'Sejahtera Abadi jaya abasd', 'Jl. Mastrip, Krajan Timur, Sumbersari, Kec. Sumbersari, Kabupaten Jember, Jawa Timur 68121', '087564094304', '2021-12-03 03:30:12');

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
('TR039434985', 0, 10, 43000, 45000, 'U0002', '2021-11-26 00:43:43');

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
('TR039434985', 1, 43000, 'BRG0002');

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
  `no_hp` varchar(13) NOT NULL,
  `isAktif` enum('Aktif','Tidak aktif') NOT NULL,
  `login_terbaru` datetime DEFAULT current_timestamp(),
  `created_at` datetime DEFAULT current_timestamp(),
  `updated_at` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `username`, `nama_lengkap`, `password`, `role`, `no_hp`, `isAktif`, `login_terbaru`, `created_at`, `updated_at`) VALUES
('U0001', 'admin', 'UDIN SEDUNIA', '1212', 1, '085607185972', 'Aktif', '2021-12-03 03:39:50', '2021-11-25 18:27:00', '2021-12-03 02:40:36'),
('U0002', 'bocilkematian', 'WINDAH BASUDARAA', '11', 2, '085655990781', 'Aktif', '2021-12-03 01:11:53', '2021-11-26 00:32:14', '2021-12-03 01:11:59'),
('U003', 'user', 'Trismayanti', 'user', 2, '085123456789', 'Aktif', '2021-12-03 01:50:51', '2021-12-03 01:50:51', '2021-12-02 19:49:27'),
('U004', 'person', 'Ulul', 'person', 2, '543534534', 'Aktif', '2021-12-03 01:54:41', '2021-12-03 01:54:41', '2021-12-03 01:54:41');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`),
  ADD KEY `kategori` (`kategori`),
  ADD KEY `supplier` (`supplier`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`kode_kategori`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

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
  ADD PRIMARY KEY (`id_user`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`kategori`) REFERENCES `kategori` (`kode_kategori`),
  ADD CONSTRAINT `barang_ibfk_2` FOREIGN KEY (`supplier`) REFERENCES `supplier` (`id_supplier`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`);

--
-- Constraints for table `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  ADD CONSTRAINT `transaksi_detail_ibfk_1` FOREIGN KEY (`kode_transaksi`) REFERENCES `transaksi` (`kode_transaksi`),
  ADD CONSTRAINT `transaksi_detail_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`),
  ADD CONSTRAINT `transaksi_detail_ibfk_3` FOREIGN KEY (`kode_transaksi`) REFERENCES `transaksi` (`kode_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
