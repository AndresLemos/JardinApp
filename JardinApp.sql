-- phpMyAdmin SQL Dump
-- version 4.2.12deb2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 26-08-2015 a las 11:58:50
-- Versión del servidor: 5.5.43-0+deb8u1
-- Versión de PHP: 5.6.7-1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `JardinApp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Ciudad`
--

CREATE TABLE IF NOT EXISTS `Ciudad` (
`id_ciudad` int(11) NOT NULL,
  `nombre_ciudad` varchar(30) NOT NULL,
  `id_departamento` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Ciudad`
--

INSERT INTO `Ciudad` (`id_ciudad`, `nombre_ciudad`, `id_departamento`) VALUES
(1, 'MEDELLÍN', 5),
(2, 'MEDELLÍN', 5),
(3, 'BARRANQUILLA', 8),
(4, 'BOGOTÁ, D.C.', 11),
(5, 'CARTAGENA', 13),
(6, 'TUNJA', 15),
(7, 'MANIZALES', 17),
(8, 'FLORENCIA', 18),
(9, 'POPAYÁN', 19),
(10, 'VALLEDUPAR', 20),
(11, 'MONTERÍA', 23),
(12, 'AGUA DE DIOS', 25),
(13, 'QUIBDÓ', 27),
(14, 'NEIVA', 41),
(15, 'RIOHACHA', 44),
(16, 'SANTA MARTA', 47),
(17, 'VILLAVICENCIO', 50),
(18, 'PASTO', 52),
(19, 'CÚCUTA', 54),
(20, 'ARMENIA', 63),
(21, 'PEREIRA', 66),
(22, 'BUCARAMANGA', 68),
(23, 'SINCELEJO', 70);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Departamento`
--

CREATE TABLE IF NOT EXISTS `Departamento` (
`id_departamento` int(11) NOT NULL,
  `nombre_departamento` varchar(28) NOT NULL,
  `id_pais` varchar(3) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Departamento`
--

INSERT INTO `Departamento` (`id_departamento`, `nombre_departamento`, `id_pais`) VALUES
(5, 'ANTIOQUIA', 'COL'),
(8, 'ATLANTICO', 'COL'),
(11, 'BOGOTA', 'COL'),
(13, 'BOLIVAR', 'COL'),
(15, 'BOYACA', 'COL'),
(17, 'CALDAS', 'COL'),
(18, 'CAQUETA', 'COL'),
(19, 'CAUCA', 'COL'),
(20, 'CESAR', 'COL'),
(23, 'CORDOBA', 'COL'),
(25, 'CUNDINAMARCA', 'COL'),
(27, 'CHOCO', 'COL'),
(41, 'HUILA', 'COL'),
(44, 'LA GUAJIRA', 'COL'),
(47, 'MAGDALENA', 'COL'),
(50, 'META', 'COL'),
(52, 'NARIÑO', 'COL'),
(54, 'N. DE SANTANDER', 'COL'),
(63, 'QUINDIO', 'COL'),
(66, 'RISARALDA', 'COL'),
(68, 'SANTANDER', 'COL'),
(70, 'SUCRE', 'COL'),
(73, 'TOLIMA', 'COL'),
(76, 'VALLE DEL CAUCA', 'COL'),
(81, 'ARAUCA', 'COL'),
(85, 'CASANARE', 'COL'),
(86, 'PUTUMAYO', 'COL'),
(88, 'SAN ANDRES', 'COL'),
(91, 'AMAZONAS', 'COL'),
(94, 'GUAINIA', 'COL'),
(95, 'GUAVIARE', 'COL'),
(97, 'VAUPES', 'COL'),
(99, 'VICHADA', 'COL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `DEPARTAMENTOS`
--

CREATE TABLE IF NOT EXISTS `DEPARTAMENTOS` (
  `id_departamento` int(11) NOT NULL,
  `nombre_departamento` varchar(255) DEFAULT NULL,
  `id_pais` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Pais`
--

CREATE TABLE IF NOT EXISTS `Pais` (
  `id_pais` varchar(3) NOT NULL,
  `nombre_pais` varchar(28) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Pais`
--

INSERT INTO `Pais` (`id_pais`, `nombre_pais`) VALUES
('ABW', 'ARUBA'),
('AFG', 'AFGHANISTAN'),
('AGO', 'ANGOLA'),
('AIA', 'ANGUILLA'),
('ALB', 'ALBANIA'),
('AND', 'ANDORRA'),
('ANT', 'NETHERLANDS ANTILLES'),
('ARE', 'UNITED ARAB EMIRATES'),
('ARG', 'ARGENTINA'),
('ARM', 'ARMENIA'),
('ASM', 'AMERICAN SAMOA'),
('ATA', 'ANTARCTICA'),
('ATF', 'FRENCH SOUTHERN TERRITORIES'),
('ATG', 'ANTIGUA AND BARBUDA'),
('AUS', 'AUSTRALIA'),
('AUT', 'AUSTRIA'),
('AZE', 'AZERBAIJAN'),
('BDI', 'BURUNDI'),
('BEL', 'BELGIUM'),
('BEN', 'BENIN'),
('BFA', 'BURKINA FASO'),
('BGD', 'BANGLADESH'),
('BGR', 'BULGARIA'),
('BHR', 'BAHRAIN'),
('BHS', 'BAHAMAS'),
('BIH', 'BOSNIA AND HERZEGOVINA'),
('BLR', 'BELARUS'),
('BLZ', 'BELIZE'),
('BMU', 'BERMUDA'),
('BOL', 'BOLIVIA'),
('BRA', 'BRAZIL'),
('BRB', 'BARBADOS'),
('BRN', 'BRUNEI'),
('BTN', 'BHUTAN'),
('BVT', 'BOUVET ISLAND'),
('BWA', 'BOTSWANA'),
('CAF', 'CENTRAL AFRICAN REPUBLIC'),
('CAN', 'CANADA'),
('CCK', 'COCOS (KEELING) ISLANDS'),
('CHE', 'SWITZERLAND'),
('CHL', 'CHILE'),
('CHN', 'CHINA'),
('CIV', 'CÔTE DIVOIRE'),
('CMR', 'CAMEROON'),
('COD', 'CONGO'),
('COG', 'CONGO'),
('COK', 'COOK ISLANDS'),
('COL', 'COLOMBIA'),
('COM', 'COMOROS'),
('CPV', 'CAPE VERDE'),
('CRI', 'COSTA RICA'),
('CUB', 'CUBA'),
('CXR', 'CHRISTMAS ISLAND'),
('CYM', 'CAYMAN ISLANDS'),
('CYP', 'CYPRUS'),
('CZE', 'CZECH REPUBLIC'),
('DEU', 'GERMANY'),
('DJI', 'DJIBOUTI'),
('DMA', 'DOMINICA'),
('DNK', 'DENMARK'),
('DOM', 'DOMINICAN REPUBLIC'),
('DZA', 'ALGERIA'),
('ECU', 'ECUADOR'),
('EGY', 'EGYPT'),
('ERI', 'ERITREA'),
('ESH', 'WESTERN SAHARA'),
('ESP', 'SPAIN'),
('EST', 'ESTONIA'),
('ETH', 'ETHIOPIA'),
('FIN', 'FINLAND'),
('FJI', 'FIJI ISLANDS'),
('FLK', 'FALKLAND ISLANDS'),
('FRA', 'FRANCE'),
('FRO', 'FAROE ISLANDS'),
('FSM', 'MICRONESIA'),
('GAB', 'GABON'),
('GBR', 'UNITED KINGDOM'),
('GEO', 'GEORGIA'),
('GHA', 'GHANA'),
('GIB', 'GIBRALTAR'),
('GIN', 'GUINEA'),
('GLP', 'GUADELOUPE'),
('GMB', 'GAMBIA'),
('GNB', 'GUINEA-BISSAU'),
('GNQ', 'EQUATORIAL GUINEA'),
('GRC', 'GREECE'),
('GRD', 'GRENADA'),
('GRL', 'GREENLAND'),
('GTM', 'GUATEMALA'),
('GUF', 'FRENCH GUIANA'),
('GUM', 'GUAM'),
('GUY', 'GUYANA'),
('HKG', 'HONG KONG'),
('HMD', 'HEARD ISLAND AND MCDONALD IS'),
('HND', 'HONDURAS'),
('HRV', 'CROATIA'),
('HTI', 'HAITI'),
('HUN', 'HUNGARY'),
('IDN', 'INDONESIA'),
('IND', 'INDIA'),
('IOT', 'BRITISH INDIAN OCEAN TERRITO'),
('IRL', 'IRELAND'),
('IRN', 'IRAN'),
('IRQ', 'IRAQ'),
('ISL', 'ICELAND'),
('ISR', 'ISRAEL'),
('ITA', 'ITALY'),
('JAM', 'JAMAICA'),
('JOR', 'JORDAN'),
('JPN', 'JAPAN'),
('KAZ', 'KAZAKSTAN'),
('KEN', 'KENYA'),
('KGZ', 'KYRGYZSTAN'),
('KHM', 'CAMBODIA'),
('KIR', 'KIRIBATI'),
('KNA', 'SAINT KITTS AND NEVIS'),
('KOR', 'SOUTH KOREA'),
('KWT', 'KUWAIT'),
('LAO', 'LAOS'),
('LBN', 'LEBANON'),
('LBR', 'LIBERIA'),
('LBY', 'LIBYAN ARAB JAMAHIRIYA'),
('LCA', 'SAINT LUCIA'),
('LIE', 'LIECHTENSTEIN'),
('LKA', 'SRI LANKA'),
('LSO', 'LESOTHO'),
('LTU', 'LITHUANIA'),
('LUX', 'LUXEMBOURG'),
('LVA', 'LATVIA'),
('MAC', 'MACAO'),
('MAR', 'MOROCCO'),
('MCO', 'MONACO'),
('MDA', 'MOLDOVA'),
('MDG', 'MADAGASCAR'),
('MDV', 'MALDIVES'),
('MEX', 'MEXICO'),
('MHL', 'MARSHALL ISLANDS'),
('MKD', 'MACEDONIA'),
('MLI', 'MALI'),
('MLT', 'MALTA'),
('MMR', 'MYANMAR'),
('MNG', 'MONGOLIA'),
('MNP', 'NORTHERN MARIANA ISLANDS'),
('MOZ', 'MOZAMBIQUE'),
('MRT', 'MAURITANIA'),
('MSR', 'MONTSERRAT'),
('MTQ', 'MARTINIQUE'),
('MUS', 'MAURITIUS'),
('MWI', 'MALAWI'),
('MYS', 'MALAYSIA'),
('MYT', 'MAYOTTE'),
('NAM', 'NAMIBIA'),
('NCL', 'NEW CALEDONIA'),
('NER', 'NIGER'),
('NFK', 'NORFOLK ISLAND'),
('NGA', 'NIGERIA'),
('NIC', 'NICARAGUA'),
('NIU', 'NIUE'),
('NLD', 'NETHERLANDS'),
('NOR', 'NORWAY'),
('NPL', 'NEPAL'),
('NRU', 'NAURU'),
('NZL', 'NEW ZEALAND'),
('OMN', 'OMAN'),
('PAK', 'PAKISTAN'),
('PAN', 'PANAMA'),
('PCN', 'PITCAIRN'),
('PER', 'PERU'),
('PHL', 'PHILIPPINES'),
('PLW', 'PALAU'),
('PNG', 'PAPUA NEW GUINEA'),
('POL', 'POLAND'),
('PRI', 'PUERTO RICO'),
('PRK', 'NORTH KOREA'),
('PRT', 'PORTUGAL'),
('PRY', 'PARAGUAY'),
('PSE', 'PALESTINE'),
('PYF', 'FRENCH POLYNESIA'),
('QAT', 'QATAR'),
('REU', 'RÉUNION'),
('ROM', 'ROMANIA'),
('RUS', 'RUSSIAN FEDERATION'),
('RWA', 'RWANDA'),
('SAU', 'SAUDI ARABIA'),
('SDN', 'SUDAN'),
('SEN', 'SENEGAL'),
('SGP', 'SINGAPORE'),
('SGS', 'SOUTH GEORGIA AND THE SOUTH '),
('SHN', 'SAINT HELENA'),
('SJM', 'SVALBARD AND JAN MAYEN'),
('SLB', 'SOLOMON ISLANDS'),
('SLE', 'SIERRA LEONE'),
('SLV', 'EL SALVADOR'),
('SMR', 'SAN MARINO'),
('SOM', 'SOMALIA'),
('SPM', 'SAINT PIERRE AND MIQUELON'),
('STP', 'SAO TOME AND PRINCIPE'),
('SUR', 'SURINAME'),
('SVK', 'SLOVAKIA'),
('SVN', 'SLOVENIA'),
('SWE', 'SWEDEN'),
('SWZ', 'SWAZILAND'),
('SYC', 'SEYCHELLES'),
('SYR', 'SYRIA'),
('TCA', 'TURKS AND CAICOS ISLANDS'),
('TCD', 'CHAD'),
('TGO', 'TOGO'),
('THA', 'THAILAND'),
('TJK', 'TAJIKISTAN'),
('TKL', 'TOKELAU'),
('TKM', 'TURKMENISTAN'),
('TMP', 'EAST TIMOR'),
('TON', 'TONGA'),
('TTO', 'TRINIDAD AND TOBAGO'),
('TUN', 'TUNISIA'),
('TUR', 'TURKEY'),
('TUV', 'TUVALU'),
('TWN', 'TAIWAN'),
('TZA', 'TANZANIA'),
('UGA', 'UGANDA'),
('UKR', 'UKRAINE'),
('UMI', 'UNITED STATES MINOR OUTLYING'),
('URY', 'URUGUAY'),
('USA', 'UNITED STATES'),
('UZB', 'UZBEKISTAN'),
('VAT', 'HOLY SEE (VATICAN CITY STATE'),
('VCT', 'SAINT VINCENT AND THE GRENAD'),
('VEN', 'VENEZUELA'),
('VGB', 'VIRGIN ISLANDS'),
('VIR', 'VIRGIN ISLANDS'),
('VNM', 'VIETNAM'),
('VUT', 'VANUATU'),
('WLF', 'WALLIS AND FUTUNA'),
('WSM', 'SAMOA'),
('YEM', 'YEMEN'),
('YUG', 'YUGOSLAVIA'),
('ZAF', 'SOUTH AFRICA'),
('ZMB', 'ZAMBIA'),
('ZWE', 'ZIMBABWE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Roles`
--

CREATE TABLE IF NOT EXISTS `Roles` (
`id_rol` int(11) NOT NULL,
  `nombre_rol` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuarios`
--

CREATE TABLE IF NOT EXISTS `Usuarios` (
  `id_documento` varchar(15) NOT NULL,
  `primer_nombre` varchar(10) NOT NULL,
  `segundo_nombre` varchar(10) DEFAULT '',
  `primer apellido` varchar(10) NOT NULL,
  `segundo_apellido` varchar(10) NOT NULL,
  `contraseña` varchar(15) NOT NULL,
  `direccion` varchar(15) NOT NULL,
  `telefono` varchar(12) NOT NULL,
  `celular` varchar(10) NOT NULL,
  `correo` varchar(15) NOT NULL,
  `tipo_documento` varchar(18) NOT NULL,
  `titulo_profesional` varchar(45) DEFAULT NULL,
  `id_ciudad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuarios_has_Roles`
--

CREATE TABLE IF NOT EXISTS `Usuarios_has_Roles` (
  `id_usuarios` varchar(15) NOT NULL,
  `id_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Ciudad`
--
ALTER TABLE `Ciudad`
 ADD PRIMARY KEY (`id_ciudad`), ADD UNIQUE KEY `idCiudad_UNIQUE` (`id_ciudad`), ADD KEY `fk_Ciudad_Departamento1_idx` (`id_departamento`);

--
-- Indices de la tabla `Departamento`
--
ALTER TABLE `Departamento`
 ADD PRIMARY KEY (`id_departamento`), ADD UNIQUE KEY `idDepartamento_UNIQUE` (`id_departamento`), ADD KEY `fk_Departamento_Pais1_idx` (`id_pais`);

--
-- Indices de la tabla `DEPARTAMENTOS`
--
ALTER TABLE `DEPARTAMENTOS`
 ADD PRIMARY KEY (`id_departamento`), ADD KEY `FK_DEPARTAMENTOS_id_pais` (`id_pais`);

--
-- Indices de la tabla `Pais`
--
ALTER TABLE `Pais`
 ADD PRIMARY KEY (`id_pais`), ADD UNIQUE KEY `id_UNIQUE` (`id_pais`);

--
-- Indices de la tabla `Roles`
--
ALTER TABLE `Roles`
 ADD PRIMARY KEY (`id_rol`), ADD UNIQUE KEY `idRoles_UNIQUE` (`id_rol`);

--
-- Indices de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
 ADD PRIMARY KEY (`id_documento`), ADD UNIQUE KEY `idUsuarios_UNIQUE` (`id_documento`), ADD KEY `fk_Usuarios_Ciudad1_idx` (`id_ciudad`);

--
-- Indices de la tabla `Usuarios_has_Roles`
--
ALTER TABLE `Usuarios_has_Roles`
 ADD PRIMARY KEY (`id_usuarios`,`id_rol`), ADD KEY `fk_Usuarios_has_Roles_Roles1_idx` (`id_rol`), ADD KEY `fk_Usuarios_has_Roles_Usuarios1_idx` (`id_usuarios`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Ciudad`
--
ALTER TABLE `Ciudad`
MODIFY `id_ciudad` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT de la tabla `Departamento`
--
ALTER TABLE `Departamento`
MODIFY `id_departamento` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=100;
--
-- AUTO_INCREMENT de la tabla `Roles`
--
ALTER TABLE `Roles`
MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Ciudad`
--
ALTER TABLE `Ciudad`
ADD CONSTRAINT `Ciudad_ibfk_1` FOREIGN KEY (`id_departamento`) REFERENCES `Departamento` (`id_departamento`);

--
-- Filtros para la tabla `Departamento`
--
ALTER TABLE `Departamento`
ADD CONSTRAINT `fk_Departamento_Pais1` FOREIGN KEY (`id_pais`) REFERENCES `Pais` (`id_pais`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `DEPARTAMENTOS`
--
ALTER TABLE `DEPARTAMENTOS`
ADD CONSTRAINT `FK_DEPARTAMENTOS_id_pais` FOREIGN KEY (`id_pais`) REFERENCES `Pais` (`id_pais`);

--
-- Filtros para la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
ADD CONSTRAINT `fk_Usuarios_Ciudad1` FOREIGN KEY (`id_ciudad`) REFERENCES `Ciudad` (`id_ciudad`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Usuarios_has_Roles`
--
ALTER TABLE `Usuarios_has_Roles`
ADD CONSTRAINT `fk_Usuarios_has_Roles_Usuarios1` FOREIGN KEY (`id_usuarios`) REFERENCES `Usuarios` (`id_documento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_Usuarios_has_Roles_Roles1` FOREIGN KEY (`id_rol`) REFERENCES `Roles` (`id_rol`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
