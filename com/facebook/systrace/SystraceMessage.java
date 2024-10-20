package com.facebook.systrace;

import X.0YQ;
import X.0YR;
import X.0YS;
import X.0YT;
import X.C0py;

/* loaded from: SystraceMessage.class */
public abstract class SystraceMessage {
    public static final 0YR A02 = new Object();
    public static final ThreadLocal A03 = new 0YT();
    public static final 0YQ A00 = new Object();
    public static final 0YQ A01 = new Object();

    public static 0YR A00(0YQ r301, String str, long j) {
        if (!Systrace.A0E(j)) {
            return A02;
        }
        C0py c0py = (C0py) A03.get();
        c0py.A00 = j;
        c0py.A02 = r301;
        c0py.A03 = str;
        0YS r0 = c0py.A01;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= r0.A00) {
                r0.A00 = 0;
                return c0py;
            }
            r0.A01[i2] = null;
            i = i2 + 1;
        }
    }
}
