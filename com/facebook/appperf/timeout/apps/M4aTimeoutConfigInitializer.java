package com.facebook.appperf.timeout.apps;

import X.0XK;
import X.0XL;
import X.11T;
import X.1Bq;
import X.1Br;
import X.2yD;
import X.5J0;
import X.C0T8;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.inject.FbInjector;

/* loaded from: M4aTimeoutConfigInitializer.class */
public final class M4aTimeoutConfigInitializer {
    public static boolean A02;
    public final 1Br A00;
    public final boolean A01;

    public M4aTimeoutConfigInitializer() {
        1Br A00 = 1Bq.A00(16385);
        this.A00 = A00;
        this.A01 = ((2yD) A00.A00.get()).AZk(36318213390807267L);
    }

    public static final void A00(M4aTimeoutConfigInitializer m4aTimeoutConfigInitializer) {
        if (A02) {
            return;
        }
        A02 = true;
        2yD r0 = (2yD) m4aTimeoutConfigInitializer.A00.A00.get();
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        if (r0.AZk(36318213391462634L)) {
            if (!0XL.A00) {
                0XL.A00 = true;
                HandlerThread handlerThread = new HandlerThread("SystemConfigReader", 10);
                C0T8.A00(handlerThread);
                handlerThread.start();
                new Handler(handlerThread.getLooper()).postDelayed(new 0XK(A00, handlerThread), 180000L);
            }
            5J0.A01 = true;
        }
    }
}
