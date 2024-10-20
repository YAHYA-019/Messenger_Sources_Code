package com.facebook.messaging.threadview.plugins.interfaceextensions.pill;

import X.1Bi;
import X.C0A8;
import X.C6n9;
import android.content.res.Resources;

/* loaded from: MessagePillsDecoration.class */
public final class MessagePillsDecoration {
    public static int A00(Resources resources, int i) {
        float f = -21.5f;
        if (!((Boolean) ((C6n9) 1Bi.A03(81997)).A00.A00.get()).booleanValue()) {
            f = -20.0f;
        }
        int A03 = C0A8.A03(resources, f) + i;
        int i2 = 0;
        if (A03 < 0) {
            i2 = -A03;
        }
        return i2;
    }
}
