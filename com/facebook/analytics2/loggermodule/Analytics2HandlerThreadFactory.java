package com.facebook.analytics2.loggermodule;

import X.11T;
import X.1Bi;
import X.1Gl;
import X.1Nz;
import X.1S8;
import X.1SA;
import android.content.Context;
import android.os.HandlerThread;

/* loaded from: Analytics2HandlerThreadFactory.class */
public class Analytics2HandlerThreadFactory implements 1Nz {
    public 1S8 A01 = (1S8) 1Bi.A03(16670);
    public 1SA A00 = (1SA) 1Bi.A03(66364);

    public Analytics2HandlerThreadFactory(Context context) {
    }

    public HandlerThread AJ2(String str, int i) {
        HandlerThread A00;
        1S8 r0 = this.A01;
        synchronized (r0) {
            A00 = ((1Gl) r0.A01.get()).A00(r0.A00, str, i);
        }
        11T.A0F(A00, 0);
        A00.getThreadId();
        return A00;
    }
}
