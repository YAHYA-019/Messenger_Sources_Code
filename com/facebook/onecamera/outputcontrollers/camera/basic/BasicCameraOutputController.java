package com.facebook.onecamera.outputcontrollers.camera.basic;

import X.Gtl;
import X.GuI;
import X.GuK;
import X.ICm;
import X.JPi;
import X.JQG;

/* loaded from: BasicCameraOutputController.class */
public final class BasicCameraOutputController extends GuI implements JQG {
    public volatile ICm A00;

    public void A0A() {
        this.A00 = ((Gtl) ((JPi) ((GuI) this).A00.AdC(JPi.A00))).A02;
    }

    @Override // X.JQI
    public GuK Ash() {
        return JQG.A00;
    }
}
