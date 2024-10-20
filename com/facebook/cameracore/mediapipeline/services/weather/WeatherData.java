package com.facebook.cameracore.mediapipeline.services.weather;

/* loaded from: WeatherData.class */
public class WeatherData {
    public final String currentConditionCode;
    public final String preferredTempUnit;
    public final int sunriseHour;
    public final int sunriseMinute;
    public final int sunsetHour;
    public final int sunsetMinute;
    public final float tempCelsius;
    public final float tempFahrenheit;

    public WeatherData(int i, int i2, int i3, int i4, float f, float f2, String str, String str2) {
        this.sunriseHour = i;
        this.sunriseMinute = i2;
        this.sunsetHour = i3;
        this.sunsetMinute = i4;
        this.tempCelsius = f;
        this.tempFahrenheit = f2;
        this.preferredTempUnit = str;
        this.currentConditionCode = str2;
    }
}
