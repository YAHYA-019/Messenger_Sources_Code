package com.facebook.tigon.internal;

import X.0SY;

/* loaded from: TigonStartupLogger.class */
public final class TigonStartupLogger {
    public boolean A00;
    public final 0SY A01 = new 0SY();

    public final void A00() {
        synchronized (this) {
            if (!this.A00) {
                this.A01.markerStart(17971040);
                this.A00 = true;
            }
        }
    }

    public final void A01(String str) {
        this.A01.markerPoint(17971040, str);
    }
}
