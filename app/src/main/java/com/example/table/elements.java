package com.example.table;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ptable")
public class elements {

    @ColumnInfo(name = "oxidation_state_count")
    public int oxidation_state_count;
    @ColumnInfo(name = "group_block")
    public String group_block;
    @ColumnInfo(name = "year")
    public int year;
    @ColumnInfo(name = "standard_state")
    public String standard_state;
    @ColumnInfo(name = "oxidation_state")
    public String oxidation_state;
    @ColumnInfo(name = "density")
    public double density;
    @ColumnInfo(name = "ionization_energy")
    public double ionization_energy;
    @ColumnInfo(name = "atomic_radius")
    public double atomic_radius;
    @ColumnInfo(name = "electron_affinity")
    public double electron_affinity;
    @ColumnInfo(name = "electronegativity")
    public double electronegativity;
    @ColumnInfo(name = "electronic_configuration")
    public String electronic_configuration;
    @ColumnInfo(name = "color")
    public String color;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name = "symbol")
    public String symbol;
    @ColumnInfo(name = "mass")
    public double atomic_mass;
    @PrimaryKey
    public int atomic_number;
    @ColumnInfo(name = "melting_point")
    public double melting_point;
    @ColumnInfo(name = "boiling_point")
    public double boiling_point;

}
