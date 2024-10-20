package com.facebook.onecamera.outputcontrollers.touchgesture.basic;

import X.Gtl;
import X.GuI;
import X.GuK;
import X.JOW;
import X.JPi;
import X.JQH;
import X.Rk2;

/* loaded from: BasicTouchGestureOutputController.class */
public final class BasicTouchGestureOutputController extends GuI implements JQH {
    public final boolean A00;
    public volatile Rk2 A01;

    public BasicTouchGestureOutputController(JOW jow, boolean z) {
        super(jow);
        this.A00 = z;
    }

    public void A08() {
        this.A01 = null;
    }

    public void A0A() {
        this.A01 = new Rk2(((Gtl) ((JPi) ((GuI) this).A00.AdC(JPi.A00))).A02, this.A00);
    }

    @Override // X.JQI
    public GuK Ash() {
        return JQH.A00;
    }
}
