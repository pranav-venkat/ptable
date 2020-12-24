package co.pranav.table;

public class Ptable {

    public static final int AtomicMassId=0;
    public static final int DensityId=1;
    public static final int NameId=2;
    public static final int SymbolId=3;
    public static final int OscId=4;
    public static final int GroupId=5;
    public static final int YearId =6;
    public static final int SsId=7;
    public static final int OsId=8;
    public static final int IonizationEnergyId=9;
    public static final int AtomicRadiusId=10;
    public static final int ElectronAffinityId=11;
    public static final int ElectronegatvityId=12;
    public static final int ElectronicConfigurationId =13;
    public static final int AtomicNumberId=14;
    public static final int MeltingPointId=15;
    public static final int BoilingPointId=16;

    public static String[] ChemoProps = {"atomic_mass", "density", "name",
            "symbol", "oxidation_state_count", "group",
            "year", "standard_state", "oxidation_state",
            "ionization_energy", "atomic_radius", "electron_affinity",
            "electronegativity", "electronic_configuration", "atomic_number",
            "melting_point", "boiling_point"};

    public static element[] ptable = {new element(1, "H", "Hydrogen", 1.008, "FFFFFF", "1s1", 2.2, 120, 13.598, 0.754, 2, "+1, -1", "Gas", 13.81, 20.28, 0.00008988, "Nonmetal", 1766),
            new element(2, "He", "Helium", 4.0026, "D9FFFF", "1s2", 0, 140, 24.587, 0, 1, "0", "Gas", 0.95, 4.22, 0.0001785, "Noble gas", 1868),
            new element(3, "Li", "Lithium", 7, "CC80FF", "[He]2s1", 0.98, 182, 5.392, 0.618, 1, "1", "Solid", 453.65, 1615, 0.534, "Alkali metal", 1817),
            new element(4, "Be", "Beryllium", 9.012183, "C2FF00", "[He]2s2", 1.57, 153, 9.323, 0, 1, "2", "Solid", 1560, 2744, 1.85, "Alkaline earth metal", 1798),
            new element(5, "B", "Boron", 10.81, "FFB5B5", "[He]2s2 2p1", 2.04, 192, 8.298, 0.277, 1, "3", "Solid", 2348, 4273, 2.37, "Metalloid", 1808),
            new element(6, "C", "Carbon", 12.011, "909090", "[He]2s2 2p2", 2.55, 170, 11.26, 1.263, 3, "+4, +2, -4", "Solid", 3823, 4098, 2.267, "Nonmetal", 0),
            new element(7, "N", "Nitrogen", 14.007, "3050F8", "[He] 2s2 2p3", 3.04, 155, 14.534, 7, 8, "+5, +4, +3, +2, +1, -1, -2, -3", "Gas", 63.15, 77.36, 0.0012506, "Nonmetal", 1772),
            new element(8, "O", "Oxygen", 15.999, "FF0D0D", "[He]2s2 2p4", 3.44, 152, 13.618, 1.461, 1, "-2", "Gas", 54.36, 90.2, 0.001429, "Nonmetal", 1774),
            new element(9, "F", "Fluorine", 18.99840316, "9E+51", "[He]2s2 2p5", 3.98, 135, 17.423, 3.339, 1, "-1", "Gas", 53.53, 85.03, 0.001696, "Halogen", 1670),
            new element(10, "Ne", "Neon", 20.18, "B3E3F5", "[He]2s2 2p6", 0, 154, 21.565, 0, 1, "0", "Gas", 24.56, 27.07, 0.0008999, "Noble gas", 1898),
            new element(11, "Na", "Sodium", 22.9897693, "AB5CF2", "[Ne]3s1", 0.93, 227, 5.139, 0.548, 1, "0", "Solid", 370.95, 1156, 0.97, "Alkali metal", 1807),
            new element(12, "Mg", "Magnesium", 24.305, "8AFF00", "[Ne]3s2", 1.31, 173, 7.646, 0, 1, "2", "Solid", 923, 1363, 1.74, "Alkaline earth metal", 1808),
            new element(13, "Al", "Aluminum", 26.981538, "BFA6A6", "[Ne]3s2 3p1", 1.61, 184, 5.986, 0.441, 1, "3", "Solid", 933.437, 2792, 2.7, "Post-transition metal", 0),
            new element(14, "Si", "Silicon", 28.085, "F0C8A0", "[Ne]3s2 3p2", 1.9, 210, 8.152, 1.385, 3, "+4, +2, -4", "Solid", 1687, 3538, 2.3296, "Metalloid", 1854),
            new element(15, "P", "Phosphorus", 30.973762, "FF8000", "[Ne]3s2 3p3", 2.19, 180, 10.487, 0.746, 3, "+5, +3, -3", "Solid", 317.3, 553.65, 1.82, "Nonmetal", 1669),
            new element(16, "S", "Sulfur", 32.07, "FFFF30", "[Ne]3s2 3p4", 2.58, 180, 10.36, 2.077, 3, "+6, +4, -2", "Solid", 388.36, 717.75, 2.067, "Nonmetal", 0),
            new element(17, "Cl", "Chlorine", 35.45, "1FF01F", "[Ne]3s2 3p5", 3.16, 175, 12.968, 3.617, 4, "+7, +5, +1, -1", "Gas", 171.65, 239.11, 0.003214, "Halogen", 1774),
            new element(18, "Ar", "Argon", 39.9, "80D1E3", "[Ne]3s2 3p6", 0, 188, 15.76, 0, 1, "0", "Gas", 83.8, 87.3, 0.0017837, "Noble gas", 1894),
            new element(19, "K", "Potassium", 39.098, "8F40D4", "[Ar]4s1", 0.82, 275, 4.341, 0.501, 1, "1", "Solid", 336.53, 1032, 0.89, "Alkali metal", 1807),
            new element(20, "Ca", "Calcium", 40.08, "3DFF00", "[Ar]4s2", 1, 231, 6.113, 2.37, 1, "2", "Solid", 1115, 1757, 1.54, "Alkaline earth metal", 0),
            new element(21, "Sc", "Scandium", 44.95591, "E6E6E6", "[Ar]4s2 3d1", 1.36, 211, 6.561, 0.188, 1, "3", "Solid", 1814, 3109, 2.99, "Transition metal", 1879),
            new element(22, "Ti", "Titanium", 47.87, "BFC2C7", "[Ar]4s2 3d2", 1.54, 187, 6.828, 0.079, 3, "+4, +3, +2", "Solid", 1941, 3560, 4.5, "Transition metal", 1791),
            new element(23, "V", "Vanadium", 50.941, "A6A6AB", "[Ar]4s2 3d3", 1.63, 179, 6.746, 0.525, 4, "+5, +4, +3, +2", "Solid", 2183, 3680, 6, "Transition metal", 1801),
            new element(24, "Cr", "Chromium", 51.996, "8A99C7", "[Ar]3d5 4s1", 1.66, 189, 6.767, 0.666, 3, "+6, +3, +2", "Solid", 2180, 2944, 7.15, "Transition metal", 1797),
            new element(25, "Mn", "Manganese", 54.93804, "9C7AC7", "[Ar]4s2 3d5", 1.55, 197, 7.434, 0, 4, "+7, +4, +3, +2", "Solid", 1519, 2334, 7.3, "Transition metal", 1774),
            new element(26, "Fe", "Iron", 55.84, "E06633", "[Ar]4s2 3d6", 1.83, 194, 7.902, 0.163, 2, "+3, +2", "Solid", 1811, 3134, 7.874, "Transition metal", 0),
            new element(27, "Co", "Cobalt", 58.93319, "F090A0", "[Ar]4s2 3d7", 1.88, 192, 7.881, 0.661, 2, "+3, +2", "Solid", 1768, 3200, 8.86, "Transition metal", 1735),
            new element(28, "Ni", "Nickel", 58.693, "50D050", "[Ar]4s2 3d8", 1.91, 163, 7.64, 1.156, 2, "+3, +2", "Solid", 1728, 3186, 8.912, "Transition metal", 1751),
            new element(29, "Cu", "Copper", 63.55, "C88033", "[Ar]4s1 3d10", 1.9, 140, 7.726, 1.228, 2, "+2, +1", "Solid", 1357.77, 2835, 8.933, "Transition metal", 0),
            new element(30, "Zn", "Zinc", 65.4, "7D80B0", "[Ar]4s2 3d10", 1.65, 139, 9.394, 0, 1, "2", "Solid", 692.68, 1180, 7.134, "Transition metal", 1746),
            new element(31, "Ga", "Gallium", 69.72, "C28F8F", "[Ar]4s2 3d10 4p1", 1.81, 187, 5.999, 0.3, 1, "3", "Solid", 302.91, 2477, 5.91, "Post-transition metal", 1875),
            new element(32, "Ge", "Germanium", 72.63, "668F8F", "[Ar]4s2 3d10 4p2", 2.01, 211, 7.9, 1.35, 2, "+4, +2", "Solid", 1211.4, 3106, 5.323, "Metalloid", 1886),
            new element(33, "As", "Arsenic", 74.92159, "BD80E3", "[Ar]4s2 3d10 4p3", 2.18, 185, 9.815, 0.81, 3, "+5, +3, -3", "Solid", 1090, 887, 5.776, "Metalloid", 0),
            new element(34, "Se", "Selenium", 78.97, "FFA100", "[Ar]4s2 3d10 4p4", 2.55, 190, 9.752, 2.021, 3, "+6, +4, -2", "Solid", 493.65, 958, 4.809, "Nonmetal", 1817),
            new element(35, "Br", "Bromine", 79.9, "A62929", "[Ar]4s2 3d10 4p5", 2.96, 183, 11.814, 3.365, 3, "+5, +1, -1", "Liquid", 265.95, 331.95, 3.11, "Halogen", 1826),
            new element(36, "Kr", "Krypton", 83.8, "5CB8D1", "[Ar]4s2 3d10 4p6", 3, 202, 14, 0, 1, "0", "Gas", 115.79, 119.93, 0.003733, "Noble gas", 1898),
            new element(37, "Rb", "Rubidium", 85.468, "702EB0", "[Kr]5s1", 0.82, 303, 4.177, 0.468, 1, "1", "Solid", 312.46, 961, 1.53, "Alkali metal", 1861),
            new element(38, "Sr", "Strontium", 87.6, "00FF00", "[Kr]5s2", 0.95, 249, 5.695, 5.03, 1, "2", "Solid", 1050, 1655, 2.64, "Alkaline earth metal", 1790),
            new element(39, "Y", "Yttrium", 88.9058, "94FFFF", "[Kr]5s2 4d1", 1.22, 219, 6.217, 0.307, 1, "3", "Solid", 1795, 3618, 4.47, "Transition metal", 1794),
            new element(40, "Zr", "Zirconium", 91.22, "94E0E0", "[Kr]5s2 4d2", 1.33, 186, 6.634, 0.426, 1, "4", "Solid", 2128, 4682, 6.52, "Transition metal", 1789),
            new element(41, "Nb", "Niobium", 92.9064, "73C2C9", "[Kr]5s1 4d4", 1.6, 207, 6.759, 0.893, 2, "+5, +3", "Solid", 2750, 5017, 8.57, "Transition metal", 1801),
            new element(42, "Mo", "Molybdenum", 96, "54B5B5", "[Kr]5s1 4d5", 2.16, 209, 7.092, 0.746, 1, "6", "Solid", 2896, 4912, 10.2, "Transition metal", 1778),
            new element(43, "Tc", "Technetium", 97.90721, "3B9E9E", "[Kr]5s2 4d5", 1.9, 209, 7.28, 0.55, 3, "+7, +6, +4", "Solid", 2430, 4538, 11, "Transition metal", 1937),
            new element(44, "Ru", "Ruthenium", 101.1, "248F8F", "[Kr]5s1 4d7", 2.2, 207, 7.361, 1.05, 1, "3", "Solid", 2607, 4423, 12.1, "Transition metal", 1827),
            new element(45, "Rh", "Rhodium", 102.9055, "0A7D8C", "[Kr]5s1 4d8", 2.28, 195, 7.459, 1.137, 1, "3", "Solid", 2237, 3968, 12.4, "Transition metal", 1803),
            new element(46, "Pd", "Palladium", 106.4, "6985", "[Kr]4d10", 2.2, 202, 8.337, 0.557, 2, "+3, +2", "Solid", 1828.05, 3236, 12, "Transition metal", 1803),
            new element(47, "Ag", "Silver", 107.868, "C0C0C0", "[Kr]5s1 4d10", 1.93, 172, 7.576, 1.302, 1, "1", "Solid", 1234.93, 2435, 10.501, "Transition metal", 0),
            new element(48, "Cd", "Cadmium", 112.41, "FFD98F", "[Kr]5s2 4d10", 1.69, 158, 8.994, 0, 1, "2", "Solid", 594.22, 1040, 8.69, "Transition metal", 1817),
            new element(49, "In", "Indium", 114.82, "A67573", "[Kr]5s2 4d10 5p1", 1.78, 193, 5.786, 0.3, 1, "3", "Solid", 429.75, 2345, 7.31, "Post-transition metal", 1863),
            new element(50, "Sn", "Tin", 118.71, "668080", "[Kr]5s2 4d10 5p2", 1.96, 217, 7.344, 1.2, 2, "+4, +2", "Solid", 505.08, 2875, 7.287, "Post-transition metal", 0),
            new element(51, "Sb", "Antimony", 121.76, "9E63B5", "[Kr]5s2 4d10 5p3", 2.05, 206, 8.64, 1.07, 3, "+5, +3, -3", "Solid", 903.78, 1860, 6.685, "Metalloid", 0),
            new element(52, "Te", "Tellurium", 127.6, "D47A00", "[Kr]5s2 4d10 5p4", 2.1, 206, 9.01, 1.971, 3, "+6, +4, -2", "Solid", 722.66, 1261, 6.232, "Metalloid", 1782),
            new element(53, "I", "Iodine", 126.9045, "940094", "[Kr]5s2 4d10 5p5", 2.66, 198, 10.451, 3.059, 4, "+7, +5, +1, -1", "Solid", 386.85, 457.55, 4.93, "Halogen", 1811),
            new element(54, "Xe", "Xenon", 131.29, "429EB0", "[Kr]5s2 4d10 5p6", 2.6, 216, 12.13, 0, 1, "0", "Gas", 161.36, 165.03, 0.005887, "Noble gas", 1898),
            new element(55, "Cs", "Cesium", 132.905452, "57178F", "[Xe]6s1", 0.79, 343, 3.894, 0.472, 1, "1", "Solid", 301.59, 944, 1.93, "Alkali metal", 1860),
            new element(56, "Ba", "Barium", 137.33, "00C900", "[Xe]6s2", 0.89, 268, 5.212, 13.95, 1, "2", "Solid", 1000, 2170, 3.62, "Alkaline earth metal", 1808),
            new element(57, "La", "Lanthanum", 138.9055, "70D4FF", "[Xe]6s2 5d1", 1.1, 240, 5.577, 0.5, 1, "3", "Solid", 1191, 3737, 6.15, "Lanthanide", 1839),
            new element(58, "Ce", "Cerium", 140.12, "FFFFC7", "[Xe]6s2 4f1 5d1", 1.12, 235, 5.539, 0.5, 2, "+4, +3", "Solid", 1071, 3697, 6.77, "Lanthanide", 1803),
            new element(59, "Pr", "Praseodymium", 140.9077, "D9FFC7", "[Xe]6s2 4f3", 1.13, 239, 5.464, 50, 1, "3", "Solid", 1204, 3793, 6.77, "Lanthanide", 1885),
            new element(60, "Nd", "Neodymium", 144.24, "C7FFC7", "[Xe]6s2 4f4", 1.14, 229, 5.525, 50, 1, "3", "Solid", 1294, 3347, 7.01, "Lanthanide", 1885),
            new element(61, "Pm", "Promethium", 144.91276, "A3FFC7", "[Xe]6s2 4f5", 0, 236, 5.55, 50, 1, "3", "Solid", 1315, 3273, 7.26, "Lanthanide", 1945),
            new element(62, "Sm", "Samarium", 150.4, "8FFFC7", "[Xe]6s2 4f6", 1.17, 229, 5.644, 50, 2, "+3, +2", "Solid", 1347, 2067, 7.52, "Lanthanide", 1879),
            new element(63, "Eu", "Europium", 151.96, "61FFC7", "[Xe]6s2 4f7", 0, 233, 5.67, 50, 2, "+3, +2", "Solid", 1095, 1802, 5.24, "Lanthanide", 1901),
            new element(64, "Gd", "Gadolinium", 157.2, "45FFC7", "[Xe]6s2 4f7 5d1", 1.2, 237, 6.15, 50, 1, "3", "Solid", 1586, 3546, 7.9, "Lanthanide", 1880),
            new element(65, "Tb", "Terbium", 158.92535, "30FFC7", "[Xe]6s2 4f9", 0, 221, 5.864, 50, 1, "3", "Solid", 1629, 3503, 8.23, "Lanthanide", 1843),
            new element(66, "Dy", "Dysprosium", 162.5, "1FFFC7", "[Xe]6s2 4f10", 1.22, 229, 5.939, 50, 1, "3", "Solid", 1685, 2840, 8.55, "Lanthanide", 1886),
            new element(67, "Ho", "Holmium", 164.93033, "00FF9C", "[Xe]6s2 4f11", 1.23, 216, 6.022, 50, 1, "3", "Solid", 1747, 2973, 8.8, "Lanthanide", 1878),
            new element(68, "Er", "Erbium", 167.26, "0", "[Xe]6s2 4f12", 1.24, 235, 6.108, 50, 1, "3", "Solid", 1802, 3141, 9.07, "Lanthanide", 1843),
            new element(69, "Tm", "Thulium", 168.93422, "00D452", "[Xe]6s2 4f13", 1.25, 227, 6.184, 50, 1, "2", "Solid", 1818, 2223, 9.32, "Lanthanide", 1879),
            new element(70, "Yb", "Ytterbium", 173.04, "00BF38", "[Xe]6s2 4f14", 0, 242, 6.254, 50, 2, "+3, +2", "Solid", 1092, 1469, 6.9, "Lanthanide", 1878),
            new element(71, "Lu", "Lutetium", 174.967, "00AB24", "[Xe]6s2 4f14 5d1", 1.27, 221, 5.426, 50, 1, "3", "Solid", 1936, 3675, 9.84, "Lanthanide", 1907),
            new element(72, "Hf", "Hafnium", 178.5, "4DC2FF", "[Xe]6s2 4f14 5d2", 1.3, 212, 6.825, 0, 1, "4", "Solid", 2506, 4876, 13.3, "Transition metal", 1923),
            new element(73, "Ta", "Tantalum", 180.9479, "4DA6FF", "[Xe]6s2 4f14 5d3", 1.5, 217, 7.89, 0.322, 1, "5", "Solid", 3290, 5731, 16.4, "Transition metal", 1802),
            new element(74, "W", "Tungsten", 183.8, "2194D6", "[Xe]6s2 4f14 5d4", 2.36, 210, 7.98, 0.815, 1, "6", "Solid", 3695, 5828, 19.3, "Transition metal", 1783),
            new element(75, "Re", "Rhenium", 186.21, "267DAB", "[Xe]6s2 4f14 5d5", 1.9, 217, 7.88, 0.15, 3, "+7, +6, +4", "Solid", 3459, 5869, 20.8, "Transition metal", 1925),
            new element(76, "Os", "Osmium", 190.2, "266696", "[Xe]6s2 4f14 5d6", 2.2, 216, 8.7, 1.1, 2, "+4, +3", "Solid", 3306, 5285, 22.57, "Transition metal", 1803),
            new element(77, "Ir", "Iridium", 192.22, "175487", "[Xe]6s2 4f14 5d7", 2.2, 202, 9.1, 1.565, 2, "+4, +3", "Solid", 2719, 4701, 22.42, "Transition metal", 1803),
            new element(78, "Pt", "Platinum", 195.08, "D0D0E0", "[Xe]6s1 4f14 5d9", 2.28, 209, 9, 2.128, 2, "+4, +2", "Solid", 2041.55, 4098, 21.46, "Transition metal", 1735),
            new element(79, "Au", "Gold", 196.96657, "FFD123", "[Xe]6s1 4f14 5d10", 2.54, 166, 9.226, 2.309, 2, "+3, +1", "Solid", 1337.33, 3129, 19.282, "Transition metal", 0),
            new element(80, "Hg", "Mercury", 200.59, "B8B8D0", "[Xe]6s2 4f14 5d10", 2, 209, 10.438, 0, 2, "+2, +1", "Liquid", 234.32, 629.88, 13.5336, "Transition metal", 0),
            new element(81, "Tl", "Thallium", 204.383, "A6544D", "[Xe]6s2 4f14 5d10 6p1", 1.62, 196, 6.108, 0.2, 2, "+3, +1", "Solid", 577, 1746, 11.8, "Post-transition metal", 1861),
            new element(82, "Pb", "Lead", 207, "575961", "[Xe]6s2 4f14 5d10 6p2", 2.33, 202, 7.417, 0.36, 2, "+4, +2", "Solid", 600.61, 2022, 11.342, "Post-transition metal", 0),
            new element(83, "Bi", "Bismuth", 208.9804, "9E4FB5", "[Xe]6s2 4f14 5d10 6p3", 2.02, 207, 7.289, 0.946, 2, "+5, +3", "Solid", 544.55, 1837, 9.807, "Post-transition metal", 1753),
            new element(84, "Po", "Polonium", 208.98243, "AB5C00", "[Xe]6s2 4f14 5d10 6p4", 2, 197, 8.417, 1.9, 2, "+4, +2", "Solid", 527, 1235, 9.32, "Metalloid", 1898),
            new element(85, "At", "Astatine", 209.98715, "754F45", "[Xe]6s2 4f14 5d10 6p5", 2.2, 202, 9.5, 2.8, 2, "7, 5, 3, 1, -1", "Solid", 575, 0, 7, "Halogen", 1940),
            new element(86, "Rn", "Radon", 222.01758, "428296", "[Xe]6s2 4f14 5d10 6p6", 0, 220, 10.745, 0, 1, "0", "Gas", 202, 211.45, 0.00973, "Noble gas", 1900),
            new element(87, "Fr", "Francium", 223.01973, "420066", "[Rn]7s1", 0.7, 348, 3.9, 0.47, 1, "1", "Solid", 300, 676.8, 2.48, "Alkali metal", 1939),
            new element(88, "Ra", "Radium", 226.02541, "007D00", "[Rn]7s2", 0.9, 283, 5.279, -1, 1, "2", "Solid", 973, 1413, 5, "Alkaline earth metal", 1898),
            new element(89, "Ac", "Actinium", 227.02775, "70ABFA", "[Rn]7s2 6d1", 1.1, 260, 5.17, -1, 1, "3", "Solid", 1324, 3471, 10.07, "Actinide", 1899),
            new element(90, "Th", "Thorium", 232.038, "00BAFF", "[Rn]7s2 6d2", 1.3, 237, 6.08, -1, 1, "4", "Solid", 2023, 5061, 11.72, "Actinide", 1828),
            new element(91, "Pa", "Protactinium", 231.0359, "00A1FF", "[Rn]7s2 5f2 6d1", 1.5, 243, 5.89, -1, 2, "+5, +4", "Solid", 1845, 0, 15.37, "Actinide", 1913),
            new element(92, "U", "Uranium", 238.0289, "008FFF", "[Rn]7s2 5f3 6d1", 1.38, 240, 6.194, -1, 4, "+6, +5, +4, +3", "Solid", 1408, 4404, 18.95, "Actinide", 1789),
            new element(93, "Np", "Neptunium", 237.04817, "0080FF", "[Rn]7s2 5f4 6d1", 1.36, 221, 6.266, -1, 4, "+6, +5, +4, +3", "Solid", 917, 4175, 20.25, "Actinide", 1940),
            new element(94, "Pu", "Plutonium", 244.0642, "006BFF", "[Rn]7s2 5f6", 1.28, 243, 6.06, -1, 4, "+6, +5, +4, +3", "Solid", 913, 3501, 19.84, "Actinide", 1940),
            new element(95, "Am", "Americium", 243.06138, "545CF2", "[Rn]7s2 5f7", 1.3, 244, 5.993, -1, 4, "+6, +5, +4, +3", "Solid", 1449, 2284, 13.69, "Actinide", 1944),
            new element(96, "Cm", "Curium", 247.07035, "785CE3", "[Rn]7s2 5f7 6d1", 1.3, 245, 6.02, -1, 1, "3", "Solid", 1618, 3400, 13.51, "Actinide", 1944),
            new element(97, "Bk", "Berkelium", 247.07031, "8A4FE3", "[Rn]7s2 5f9", 1.3, 0, 6.23, -1, 2, "+4, +3", "Solid", 1323, -273.28, 14, "Actinide", 1949),
            new element(98, "Cf", "Californium", 251.07959, "A136D4", "[Rn]7s2 5f10", 1.3, 0, 6.3, -1, 1, "3", "Solid", 1173, -273.28, 0, "Actinide", 1950),
            new element(99, "Es", "Einsteinium", 252.083, "B31FD4", "[Rn]7s2 5f11", 1.3, 0, 6.42, -1, 1, "3", "Solid", 1133, -273.28, 0, "Actinide", 1952),
            new element(100, "Fm", "Fermium", 257.09511, "B31FBA", "[Rn] 5f12 7s2", 1.3, 0, 6.5, -1, 1, "3", "Solid", 1800, -273.28, 0, "Actinide", 1952),
            new element(101, "Md", "Mendelevium", 258.09843, "B30DA6", "[Rn]7s2 5f13", 1.3, 0, 6.58, -1, 2, "+3, +2", "Solid", 1100, -273.28, 0, "Actinide", 1955),
            new element(102, "No", "Nobelium", 259.101, "BD0D87", "[Rn]7s2 5f14", 1.3, 0, 6.65, -1, 2, "+3, +2", "Solid", 1100, -273.28, 0, "Actinide", 1957),
            new element(103, "Lr", "Lawrencium", 262.11, "C70066", "[Rn]7s2 5f14 6d1", 1.3, 0, 4.9, -1, 1, "3", "Solid", 1900, -273.28, 0, "Actinide", 1961),
            new element(104, "Rf", "Rutherfordium", 267.122, "CC0059", "[Rn]7s2 5f14 6d2", 0, 0, 0, -1, 1, "4", "Solid", -273.28, -273.28, 0, "Transition metal", 1964),
            new element(105, "Db", "Dubnium", 268.126, "D1004F", "[Rn]7s2 5f14 6d3", 0, 0, 0, -1, 3, "5, 4, 3", "Solid", -273.28, -273.28, 0, "Transition metal", 1967),
            new element(106, "Sg", "Seaborgium", 271.134, "D90045", "[Rn]7s2 5f14 6d4", 0, 0, 0, -1, 5, "6, 5, 4, 3, 0", "Solid", -273.28, -273.28, 0, "Transition metal", 1974),
            new element(107, "Bh", "Bohrium", 274.144, "E00038", "[Rn]7s2 5f14 6d5", 0, 0, 0, -1, 4, "7, 5, 4, 3", "Solid", -273.28, -273.28, 0, "Transition metal", 1976),
            new element(108, "Hs", "Hassium", 277.152, "E6002E", "[Rn]7s2 5f14 6d6", 0, 0, 0, -1, 6, "8, 6, 5, 4, 3, 2", "Solid", -273.28, -273.28, 0, "Transition metal", 1984),
            new element(109, "Mt", "Meitnerium", 278.156, "EB0026", "[Rn]7s2 5f14 6d7 (calculated)", 0, 0, 0, -1, 6, "9, 8, 6, 4, 3, 1", "Solid", -273.28, -273.28, 0, "Transition metal", 1982),
            new element(110, "Ds", "Darmstadtium", 281.165, "0", "[Rn]7s2 5f14 6d8 (predicted)", 0, 0, 0, -1, 5, "8, 6, 4, 2, 0", "Expected to be a Solid", -273.28, -273.28, 0, "Transition metal", 1994),
            new element(111, "Rg", "Roentgenium", 282.169, "0", "[Rn]7s2 5f14 6d9 (predicted)", 0, 0, 0, -1, 4, "5, 3, 1, -1", "Expected to be a Solid", -273.28, -273.28, 0, "Transition metal", 1994),
            new element(112, "Cn", "Copernicium", 285.177, "0", "[Rn]7s2 5f14 6d10 (predicted)", 0, 0, 0, -1, 3, "2, 1, 0", "Expected to be a Solid", -273.28, -273.28, 0, "Transition metal", 1996),
            new element(113, "Nh", "Nihonium", 286.183, "0", "[Rn]5f14 6d10 7s2 7p1 (predicted)", 0, 0, 0, -1, 1, "0", "Expected to be a Solid", -273.28, -273.28, 0, "Post-transition metal", 2004),
            new element(114, "Fl", "Flerovium", 289.191, "0", "[Rn]7s2 7p2 5f14 6d10 (predicted)", 0, 0, 0, -1, 5, "6, 4,2, 1, 0", "Expected to be a Solid", -273.28, -273.28, 0, "Post-transition metal", 1998),
            new element(115, "Mc", "Moscovium", 290.196, "0", "[Rn]7s2 7p3 5f14 6d10 (predicted)", 0, 0, 0, -1, 2, "3, 1", "Expected to be a Solid", -273.28, -273.28, 0, "Post-transition metal", 2003),
            new element(116, "Lv", "Livermorium", 293.205, "0", "[Rn]7s2 7p4 5f14 6d10 (predicted)", 0, 0, 0, -1, 3, "+4, +2, -2", "Expected to be a Solid", -273.28, -273.28, 0, "Post-transition metal", 2000),
            new element(117, "Ts", "Tennessine", 294.211, "0", "[Rn]7s2 7p5 5f14 6d10 (predicted)", 0, 0, 0, -1, 4, "+5, +3, +1, -1", "Expected to be a Solid", -273.28, -273.28, 0, "Halogen", 2010),
            new element(118, "Og", "Oganesson", 294.214, "0", "[Rn]7s2 7p6 5f14 6d10 (predicted)", 0, 0, 0, -1, 6, "+6, +4, +2, +1, 0, -1", "Expected to be a Gas", -273.28, -273.28, 0, "Noble gas", 2006)};
    element H = ptable[0];
    element He = ptable[1];
    element Li = ptable[2];
    element Be = ptable[3];
    element B = ptable[4];
    element C = ptable[5];
    element N = ptable[6];
    element O = ptable[7];
    element F = ptable[8];
    element Ne = ptable[9];
    element Na = ptable[10];
    element Mg = ptable[11];
    element Al = ptable[12];
    element Si = ptable[13];
    element P = ptable[14];
    element S = ptable[15];
    element Cl = ptable[16];
    element Ar = ptable[17];
    element K = ptable[18];
    element Ca = ptable[19];
    element Sc = ptable[20];
    element Ti = ptable[21];
    element V = ptable[22];
    element Cr = ptable[23];
    element Mn = ptable[24];
    element Fe = ptable[25];
    element Co = ptable[26];
    element Ni = ptable[27];
    element Cu = ptable[28];
    element Zn = ptable[29];
    element Ga = ptable[30];
    element Ge = ptable[31];
    element As = ptable[32];
    element Se = ptable[33];
    element Br = ptable[34];
    element Kr = ptable[35];
    element Rb = ptable[36];
    element Sr = ptable[37];
    element Y = ptable[38];
    element Zr = ptable[39];
    element Nb = ptable[40];
    element Mo = ptable[41];
    element Tc = ptable[42];
    element Ru = ptable[43];
    element Rh = ptable[44];
    element Pd = ptable[45];
    element Ag = ptable[46];
    element Cd = ptable[47];
    element In = ptable[48];
    element Sn = ptable[49];
    element Sb = ptable[50];
    element Te = ptable[51];
    element I = ptable[52];
    element Xe = ptable[53];
    element Cs = ptable[54];
    element Ba = ptable[55];
    element La = ptable[56];
    element Ce = ptable[57];
    element Pr = ptable[58];
    element Nd = ptable[59];
    element Pm = ptable[60];
    element Sm = ptable[61];
    element Eu = ptable[62];
    element Gd = ptable[63];
    element Tb = ptable[64];
    element Dy = ptable[65];
    element Ho = ptable[66];
    element Er = ptable[67];
    element Tm = ptable[68];
    element Yb = ptable[69];
    element Lu = ptable[70];
    element Hf = ptable[71];
    element Ta = ptable[72];
    element W = ptable[73];
    element Re = ptable[74];
    element Os = ptable[75];
    element Ir = ptable[76];
    element Pt = ptable[77];
    element Au = ptable[78];
    element Hg = ptable[79];
    element Tl = ptable[80];
    element Pb = ptable[81];
    element Bi = ptable[82];
    element Po = ptable[83];
    element At = ptable[84];
    element Rn = ptable[85];
    element Fr = ptable[86];
    element Ra = ptable[87];
    element Ac = ptable[88];
    element Th = ptable[89];
    element Pa = ptable[90];
    element U = ptable[91];
    element Np = ptable[92];
    element Pu = ptable[93];
    element Am = ptable[94];
    element Cm = ptable[95];
    element Bk = ptable[96];
    element Cf = ptable[97];
    element Es = ptable[98];
    element Fm = ptable[99];
    element Md = ptable[100];
    element No = ptable[101];
    element Lr = ptable[102];
    element Rf = ptable[103];
    element Db = ptable[104];
    element Sg = ptable[105];
    element Bh = ptable[106];
    element Hs = ptable[107];
    element Mt = ptable[108];
    element Ds = ptable[109];
    element Rg = ptable[110];
    element Cn = ptable[111];
    element Nh = ptable[112];
    element Fl = ptable[113];
    element Mc = ptable[114];
    element Lv = ptable[115];
    element Ts = ptable[116];
    element Og = ptable[117];


    public static String get_property(int x, int prop) {

        switch (prop) {
            case Ptable.AtomicMassId: return String.valueOf(ptable[x].atomic_mass);
            case Ptable.AtomicRadiusId: return String.valueOf(ptable[x].atomic_radius);
            case Ptable.AtomicNumberId: return String.valueOf(ptable[x].atomic_number);
            case Ptable.SymbolId: return String.valueOf(ptable[x].symbol);
            case Ptable.SsId: return String.valueOf(ptable[x].standard_state);
            case Ptable.OscId: return String.valueOf(ptable[x].oxidation_state_count);
            case Ptable.OsId: return String.valueOf(ptable[x].oxidation_state);
            case Ptable.NameId: return String.valueOf(ptable[x].name);
            case Ptable.BoilingPointId: return String.valueOf(ptable[x].boiling_point);
            case Ptable.MeltingPointId: return String.valueOf(ptable[x].melting_point);
            case Ptable.GroupId: return String.valueOf(ptable[x].group_block);
            case Ptable.ElectronAffinityId: return String.valueOf(ptable[x].electron_affinity);
            case Ptable.ElectronegatvityId: return String.valueOf(ptable[x].electronegativity);
            case Ptable.ElectronicConfigurationId: return String.valueOf(ptable[x].electronic_configuration);
            case Ptable.YearId: return String.valueOf(ptable[x].year);
            case Ptable.IonizationEnergyId: return String.valueOf(ptable[x].ionization_energy);
            case Ptable.DensityId: return String.valueOf(ptable[x].density);
            default : return "monkey";
        }

    }

}
