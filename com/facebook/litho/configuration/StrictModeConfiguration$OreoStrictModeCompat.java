package com.facebook.litho.configuration;

import X.11T;
import android.os.Build;
import android.os.StrictMode;

/* loaded from: StrictModeConfiguration$OreoStrictModeCompat.class */
public final class StrictModeConfiguration$OreoStrictModeCompat {
    public static final StrictModeConfiguration$OreoStrictModeCompat A00 = new Object();

    public final StrictMode.ThreadPolicy.Builder detectUnbufferedIO(StrictMode.ThreadPolicy.Builder builder) {
        11T.A0E(builder);
        if (Build.VERSION.SDK_INT < 26) {
            return builder;
        }
        StrictMode.ThreadPolicy.Builder detectUnbufferedIo = builder.detectUnbufferedIo();
        11T.A0J(detectUnbufferedIo, "detectUnbufferedIo(...)");
        return detectUnbufferedIo;
    }
}
