package X;

import com.facebook.cameracore.mediapipeline.services.weather.WeatherData;

/* loaded from: Ewi.class */
public final class Ewi {
    public WeatherData A00;
    public Throwable A01;
    public boolean A02;

    public final String A00() {
        String str;
        WeatherData weatherData = this.A00;
        if (weatherData == null) {
            str = "";
        } else {
            str = weatherData.currentConditionCode;
            if (str == null) {
                throw 1BK.A0h();
            }
        }
        return str;
    }

    public final String A01() {
        float f;
        Integer num;
        WeatherData weatherData = this.A00;
        if (weatherData == null) {
            return "";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        String str = null;
        boolean A0O = 11T.A0O(weatherData.preferredTempUnit, "F");
        WeatherData weatherData2 = this.A00;
        if (A0O) {
            if (weatherData2 != null) {
                f = weatherData2.tempFahrenheit;
                num = Integer.valueOf((int) f);
            }
            num = null;
        } else {
            if (weatherData2 != null) {
                f = weatherData2.tempCelsius;
                num = Integer.valueOf((int) f);
            }
            num = null;
        }
        A0k.append(num);
        A0k.append((char) 176);
        WeatherData weatherData3 = this.A00;
        if (weatherData3 != null) {
            str = weatherData3.preferredTempUnit;
        }
        A0k.append(str);
        return 11T.A02(A0k);
    }
}
