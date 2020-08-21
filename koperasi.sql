-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2019 at 06:29 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `koperasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE IF NOT EXISTS `anggota` (
  `no_ang` varchar(8) NOT NULL,
  `nama_ang` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `kota` varchar(20) NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL,
  PRIMARY KEY (`no_ang`),
  KEY `no_ang` (`no_ang`),
  KEY `no_ang_2` (`no_ang`),
  KEY `no_ang_3` (`no_ang`),
  KEY `no_ang_4` (`no_ang`),
  KEY `no_ang_5` (`no_ang`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`no_ang`, `nama_ang`, `alamat`, `kota`, `no_telp`, `pekerjaan`) VALUES
('14010', 'Nurul Fitriani', 'Jln Langgau', 'Makassar', '08997206535', 'Mahasiswa'),
('1503113', 'Alifah', 'Rappokalling', 'Makassar', '08997206535', 'Mahasiswa');

-- --------------------------------------------------------

--
-- Table structure for table `angsuran`
--

CREATE TABLE IF NOT EXISTS `angsuran` (
  `no_ang` varchar(8) DEFAULT NULL,
  `total` int(15) DEFAULT NULL,
  `tgl_bayar` varchar(15) DEFAULT NULL,
  `bayar_ang` int(15) DEFAULT NULL,
  `sisa_pinj` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `angsuran`
--

INSERT INTO `angsuran` (`no_ang`, `total`, `tgl_bayar`, `bayar_ang`, `sisa_pinj`) VALUES
('14010', 2100000, '19-05-2019', 200000, 1900000);

--
-- Triggers `angsuran`
--
DROP TRIGGER IF EXISTS `TG_ANGSUR`;
DELIMITER //
CREATE TRIGGER `TG_ANGSUR` AFTER INSERT ON `angsuran`
 FOR EACH ROW BEGIN
UPDATE trans_pinjaman set total=new.sisa_pinj
where no_ang=new.no_ang;
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `detail_simpanan`
--

CREATE TABLE IF NOT EXISTS `detail_simpanan` (
  `nosimpan` varchar(11) NOT NULL,
  `no_ang` varchar(8) NOT NULL,
  `debet` double NOT NULL,
  `kredit` double NOT NULL,
  `saldo` double NOT NULL,
  PRIMARY KEY (`nosimpan`,`no_ang`),
  KEY `no_ang` (`no_ang`),
  KEY `nosimpan` (`nosimpan`,`no_ang`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_simpanan`
--

INSERT INTO `detail_simpanan` (`nosimpan`, `no_ang`, `debet`, `kredit`, `saldo`) VALUES
('SP-19050', '14010', 100000, 50000, 150000);

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman`
--

CREATE TABLE IF NOT EXISTS `pinjaman` (
  `kd_pinj` varchar(30) NOT NULL,
  `jns_pinj` varchar(30) DEFAULT NULL,
  `max_pinj` varchar(30) DEFAULT NULL,
  `max_ang` varchar(30) DEFAULT NULL,
  `bunga` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`kd_pinj`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pinjaman`
--

INSERT INTO `pinjaman` (`kd_pinj`, `jns_pinj`, `max_pinj`, `max_ang`, `bunga`) VALUES
('PJ-PK', 'Pinjaman Pokok', '5000000', '12', '10'),
('PJ-MHS', 'Pinjaman Mahasiswa', '10000000', '36', '15'),
('PJ-USH', 'Pinjaman Usaha', '15000000', '12', '30'),
('PJ-Tian', 'Pinjaman Tian', '1000000', '10', '5');

-- --------------------------------------------------------

--
-- Table structure for table `simpan`
--

CREATE TABLE IF NOT EXISTS `simpan` (
  `no_ang` varchar(8) NOT NULL,
  `username` varchar(30) NOT NULL,
  `tanggal` varchar(30) NOT NULL,
  `ket` varchar(30) NOT NULL,
  `saldo` varchar(30) NOT NULL,
  PRIMARY KEY (`no_ang`),
  KEY `no_ang` (`no_ang`),
  KEY `no_ang_2` (`no_ang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `simpan`
--

INSERT INTO `simpan` (`no_ang`, `username`, `tanggal`, `ket`, `saldo`) VALUES
('14010', 'Nurulfitriani', '18/05/19', 'Member Baru', '200000');

-- --------------------------------------------------------

--
-- Table structure for table `simpanan`
--

CREATE TABLE IF NOT EXISTS `simpanan` (
  `kd_simp` varchar(4) NOT NULL,
  `jns_simp` varchar(20) NOT NULL,
  PRIMARY KEY (`kd_simp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `simpanan`
--

INSERT INTO `simpanan` (`kd_simp`, `jns_simp`) VALUES
('SBRG', 'Simpanan Barang'),
('SPKK', 'Simpanan Pokok'),
('SWJB', 'Simpanan Wajib'),
('STES', 'Simpanan Uang');

-- --------------------------------------------------------

--
-- Table structure for table `trans_pinjaman`
--

CREATE TABLE IF NOT EXISTS `trans_pinjaman` (
  `nopinjam` varchar(11) NOT NULL,
  `tglpinjam` date NOT NULL,
  `no_ang` varchar(8) NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `pinjpokok` int(15) DEFAULT NULL,
  `lama` int(11) NOT NULL,
  `bunga` int(15) DEFAULT NULL,
  `admin` int(11) NOT NULL,
  `jml` int(15) DEFAULT NULL,
  `total` int(15) DEFAULT NULL,
  `angsuran` int(15) DEFAULT NULL,
  PRIMARY KEY (`nopinjam`,`no_ang`),
  KEY `nopinjam` (`nopinjam`,`no_ang`),
  KEY `nopinjam_2` (`nopinjam`,`no_ang`),
  KEY `nopinjam_3` (`nopinjam`,`no_ang`),
  KEY `no_ang` (`no_ang`),
  KEY `no_ang_2` (`no_ang`),
  KEY `nopinjam_4` (`nopinjam`,`no_ang`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trans_pinjaman`
--

INSERT INTO `trans_pinjaman` (`nopinjam`, `tglpinjam`, `no_ang`, `keterangan`, `pinjpokok`, `lama`, `bunga`, `admin`, `jml`, `total`, `angsuran`) VALUES
('PJ-19050', '2019-05-19', '14010', 'Pinjaman Pokok', 2000000, 10, 2, 3, 100000, 1900000, 210000);

-- --------------------------------------------------------

--
-- Table structure for table `trans_simpanan`
--

CREATE TABLE IF NOT EXISTS `trans_simpanan` (
  `nosimpan` varchar(11) NOT NULL,
  `tglsimpan` date NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `saldo` double NOT NULL,
  PRIMARY KEY (`nosimpan`),
  KEY `nosimpan` (`nosimpan`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trans_simpanan`
--

INSERT INTO `trans_simpanan` (`nosimpan`, `tglsimpan`, `jenis`, `saldo`) VALUES
('SP-19050', '2019-05-18', '14010', 150000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
