package com.example.table;

public class element {

    public int oxidation_state_count;
    public String group_block;
    public int year;
    public String standard_state;
    public String oxidation_state;
    public double density;
    public double ionization_energy;
    public double atomic_radius;
    public double electron_affinity;
    public double electronegativity;
    public String electronic_configuration;
    public String color;
    public String name;
    public String symbol;
    public double atomic_mass;
    public int atomic_number;
    public double melting_point;
    public double boiling_point;

    public  element(int AtomicNumber, String Symbol,String Name,double AtomicMass,String CPKHexColor,String ElectronConfiguration, double Electronegativity,double AtomicRadius,double IonizationEnergy,double  ElectronAffinity,int OxidationStatescount, String  OxidationStates, String StandardState,double MeltingPoint,double BoilingPoint,double Density, String GroupBlock,int YearDiscovered)
    {
    this.symbol = Symbol;
    this.atomic_mass = AtomicMass;
    this.atomic_number = AtomicNumber;
    this.melting_point = MeltingPoint;
    this.boiling_point = BoilingPoint;
    this.name = Name;
    this.color  = CPKHexColor;
    this.electronic_configuration = ElectronConfiguration;
    this.electronegativity = Electronegativity;
    this.electron_affinity = ElectronAffinity;
    this.atomic_radius = AtomicRadius;
    this.ionization_energy = IonizationEnergy;
    this.density = Density;
    this.oxidation_state = OxidationStates;
    this.standard_state = StandardState;
    this.year = YearDiscovered;
    this.group_block = GroupBlock;
    this.oxidation_state_count = OxidationStatescount;
}


}
