package com.sda.zad12;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private int established;
    private String country;

    public Manufacturer(String name, int established, String country) {
        this.name = name;
        this.established = established;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return established == that.established &&
                Objects.equals(name, that.name) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, established, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", established=" + established +
                ", country='" + country + '\'' +
                '}';
    }
}
