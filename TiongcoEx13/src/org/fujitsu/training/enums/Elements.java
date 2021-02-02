package org.fujitsu.training.enums;

import java.util.EnumSet;

public enum Elements {

	HYDROGEN("Hydrogen", "H", 1), HELIUM("Helium", "He", 2), LITHIUM("Lithium", "Li", 3),
	BERYLLIUM("Beryllium", "Be", 4), BORON("Boron", "B", 5), CARBON("Carbon", "C", 6), NITROGEN("Nitrogen", "N", 7),
	OXYGEN("Oxygen", "O", 8), FLUORINE("Fluorine", "F", 9), NEON("Neon", "Ne", 10), SODIUM("Sodium", "Na", 11),
	MAGNESIUM("Magnesium", "Mg", 12), ALUMINUM("Aluminum", "Al", 13), SILICON("Silicon", "Si", 14),
	PHOSPHORUS("Phosphorus", "P", 15), SULFUR("Sulfur", "S", 16), CHLORINE("Chlorine", "Cl", 17),
	ARGON("Argon", "Ar", 18), POTASSIUM("Potassium", "K", 19), CALCIUM("Calcium", "Ca", 20),
	SCANDIUM("Scandium", "Sc", 21), TITANIUM("Titanium", "Ti", 22), VANADIUM("Vanadium", "V", 23),
	CHROMIUM("Chromium", "Cr", 24), MANGANESE("Manganese", "Mn", 25), IRON("Iron", "Fe", 26),
	COBALT("Cobalt", "Co", 27), NICKEL("Nickel", "Ni", 28), COPPER("Copper", "Cu", 29), ZINC("Zinc", "Zn", 30),
	GALLIUM("Gallium", "Ga", 31), GERMANIUM("Germanium", "Ge", 32), ARSENIC("Arsenic", "As", 33),
	SELENIUM("Selenium", "Se", 34), BROMINE("Bromine", "Br", 35), KRYPTON("Krypton", "Kr", 36),
	RUBIDIUM("Rubidium", "Rb", 37), STRONTIUM("Strontium", "Sr", 38), YTTRIUM("Yttrium", "Y", 39),
	ZIRCONIUM("Zirconium", "Zr", 40), NIOBIUM("Niobium", "Nb", 41), MOLYBDENUM("Molybdenum", "Mo", 42),
	TECHNETIUM("Technetium", "Tc", 43), RUTHENIUM("Ruthenium", "Ru", 44), RHODIUM("Rhodium", "Rh", 45),
	PALLADIUM("Palladium", "Pd", 46), SILVER("Silver", "Ag", 47), CADMIUM("Cadmium", "Cd", 48),
	INDIUM("Indium", "In", 49), TIN("Tin", "Sn", 50), ANTIMONY("Antimony", "Sb", 51), TELLURIUM("Tellurium", "Te", 52),
	IODINE("Iodine", "I", 53), XENON("Xenon", "Xe", 54), CESIUM("Cesium", "Cs", 55), BARIUM("Barium", "Ba", 56),
	LANTHANUM("Lanthanum", "La", 57), CERIUM("Cerium", "Ce", 58), PRASEODYMIUM("Praseodymium", "Pr", 59),
	NEODYMIUM("Neodymium", "Nd", 60), PROMETHIUM("Promethium", "Pr", 61), SAMARIUM("Samarium", "Sm", 62),
	EUROPIUM("Europium", "Eu", 63), GADOLINIUM("Gadolinium", "Gd", 64), TERBIUM("Terbium", "Tb", 65),
	DYSPROSIUM("Dysprosium", "Dy", 66), HOLMIUM("Holmium", "Ho", 67), ERBIUM("Erbium", "Er", 68),
	THULIUM("Thulium", "Tm", 69), YTTERBIUM("Ytterbium", "Yb", 70), LUTETIUM("Lutetium", "Lu", 71),
	HAFNIUM("Hafnium", "Hf", 72), TANTALUM("Tantalum", "Ta", 73), TUNGSTEN("Tungsten", "W", 74),
	RHENIUM("Rhenium", "Re", 75), OSMIUM("Osmium", "Os", 76), IRIDIUM("Iridium", "Ir", 77),
	PLATINUM("Platinum", "Pt", 78), GOLD("Gold", "Au", 79), MERCURY("Mercury", "Hg", 80),
	THALLIUM("Thallium", "Tl", 81), LEAD("Lead", "Pb", 82), BISMUTH("Bismuth", "Bi", 83),
	POLONIUM("Polonium", "Po", 84), ASTATINE("Astatine", "At", 85), RADON("Radon", "Rn", 86),
	FRANCIUM("Francium", "Fr", 87), RADIUM("Radium", "Ra", 88), ACTINIUM("Actinium", "Ac", 89),
	THORIUM("Thorium", "Th", 90), PROTACTINIUM("Protactinium", "Pa", 91), URANIUM("Uranium", "U", 92),
	NEPTUNIUM("Neptunium", "Np", 93), PLUTONIUM("Plutonium", "Pu", 94), AMERICIUM("Americium", "Am", 95),
	CURIUM("Curium", "Cm", 96), BERKELIUM("Berkelium", "Bk", 97), CALIFORNIUM("Californium", "Cf", 98),
	EINSTEINIUM("Einsteinium", "Es", 99), FERMIUM("Fermium", "Fm", 100), MENDELEVIUM("Mendelevium", "Md", 101),
	NOBELIUM("Nobelium", "No", 102), LAWRENCIUM("Lawrencium", "Lr", 103), RUTHERFORDIUM("Rutherfordium", "Rf", 104),
	DUBNIUM("Dubnium", "Db", 105), SEABORGIUM("Seaborgium", "Sg", 106), BOHRIUM("Bohrium", "Bh", 107),
	HASSIUM("Hassium", "Hs", 108), MEITNERIUM("Meitnerium", "Mt", 109), DARMSTADTIUM("Darmstadtium", "Ds", 110),
	ROENTGENIUM("Roentgenium", "Rg", 111), COPERNICIUM("Copernicium", "Cn", 112), NIHONIUM("Nihonium", "Nh", 113),
	FLEROVIUM("Felrovium", "Fl", 114), MOSCOVIUM("Moscovium", "Mc", 115), LIVERMORIUM("Livermorium", "Lv", 116),
	TENNESSINE("Tennessine", "Ts", 117), OGANESSON("Oganesson", "Og", 118);

	private String name;
	private String symbolicName;
	private Integer atomicNumber;

	private Elements(String name, String symbolicName, Integer atomicNumber) {
		this.name = name;
		this.symbolicName = symbolicName;
		this.atomicNumber = atomicNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbolicName() {
		return symbolicName;
	}

	public void setSymbolicName(String symbolicName) {
		this.symbolicName = symbolicName;
	}

	public Integer getAtomicNumber() {
		return atomicNumber;
	}

	public void setAtomicNumber(Integer atomicNumber) {
		this.atomicNumber = atomicNumber;
	}

	public static EnumSet<Elements> Alkali = EnumSet.of(Elements.LITHIUM, Elements.SODIUM, Elements.POTASSIUM,
			Elements.RUBIDIUM, Elements.CESIUM, Elements.FRANCIUM);
	public static EnumSet<Elements> Transition = EnumSet.of(Elements.SCANDIUM, Elements.TITANIUM, Elements.VANADIUM,
			Elements.CHROMIUM, Elements.MANGANESE, Elements.IRON, Elements.COBALT, Elements.NICKEL, Elements.COPPER,
			Elements.ZINC, Elements.GALLIUM, Elements.YTTRIUM, Elements.ZIRCONIUM, Elements.NIOBIUM,
			Elements.MOLYBDENUM, Elements.TECHNETIUM, Elements.RUTHENIUM, Elements.RHODIUM, Elements.PALLADIUM,
			Elements.SILVER, Elements.CADMIUM, Elements.HAFNIUM, Elements.TANTALUM, Elements.TUNGSTEN, Elements.RHENIUM,
			Elements.OSMIUM, Elements.IRIDIUM, Elements.PLATINUM, Elements.GOLD, Elements.MERCURY,
			Elements.RUTHERFORDIUM, Elements.DUBNIUM, Elements.SEABORGIUM, Elements.BOHRIUM, Elements.HASSIUM,
			Elements.MEITNERIUM, Elements.DARMSTADTIUM, Elements.ROENTGENIUM, Elements.COPERNICIUM);
	public static EnumSet<Elements> Metals = EnumSet.of(Elements.ALUMINUM, Elements.TIN, Elements.INDIUM,
			Elements.THALLIUM, Elements.LEAD, Elements.BISMUTH, Elements.NIHONIUM, Elements.FLEROVIUM,
			Elements.MOSCOVIUM, Elements.LIVERMORIUM);

	@Override
	public String toString() {
		return String.join(" ", name, symbolicName, atomicNumber + "", "\n");
	}

}
