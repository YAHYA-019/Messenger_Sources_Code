package com.facebook.cameracore.mediapipeline.services.weather;

import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: WeatherServiceDataSource.class */
public interface WeatherServiceDataSource {
    void getAltitude(NativeDataPromise nativeDataPromise);

    void getWeather(NativeDataPromise nativeDataPromise);

    void stop();
}
