package com.sda.zad17;

public class MeasurementConverter {

    public static double convert(double value, ConversionType conversionType){
        return value * conversionType.getConverter();
    }

    public static void main(String[] args) {
        MeasurementConverter convert = new MeasurementConverter();
        System.out.println(convert(4,ConversionType.YARDS_TO_METERS));
    }
}
