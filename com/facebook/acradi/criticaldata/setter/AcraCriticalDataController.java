package com.facebook.acradi.criticaldata.setter;

import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1ID;
import X.4RY;
import X.5G3;
import X.5G4;
import X.5G5;
import X.C15h;
import android.content.Context;
import com.facebook.acra.criticaldata.CriticalAppData;
import com.facebook.common.util.TriState;
import com.facebook.inject.FbInjector;

/* loaded from: AcraCriticalDataController.class */
public final class AcraCriticalDataController implements 5G3 {
    public final Context A00 = FbInjector.A00();
    public final C15h A03 = 5G4.A00;
    public final C15h A04 = 5G5.A00;
    public final TriState A01 = (TriState) 1Bn.A0A(83429);
    public final 1Br A02 = 1Bq.A00(33032);

    public void Bni(1ID r302, 1ID r303, 4RY r304, String str) {
        CriticalAppData.setDeviceId(this.A00, r303.A01);
    }
}
