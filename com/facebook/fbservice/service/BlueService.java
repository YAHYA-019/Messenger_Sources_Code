package com.facebook.fbservice.service;

import X.0FI;
import X.0fH;
import X.1BQ;
import X.C00i;
import X.C00j;
import X.C2rm;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: BlueService.class */
public class BlueService extends C2rm {
    public final C00i A00 = new 1BQ(16567);

    public IBinder A10(Intent intent) {
        BlueServiceLogic blueServiceLogic = (BlueServiceLogic) this.A00.get();
        blueServiceLogic.asBinder();
        return blueServiceLogic;
    }

    @Override // X.C2rm
    public void A12() {
        int A04 = 0FI.A04(609419904);
        C00j.A05("BlueService.onCreate", -518753481);
        try {
            super.A12();
            C00j.A01(739801164);
            0FI.A0A(-1160728893, A04);
        } catch (Throwable th) {
            C00j.A01(-341424697);
            0FI.A0A(51356322, A04);
            throw th;
        }
    }

    @Override // X.C2rm
    public void A13() {
        int A04 = 0FI.A04(1931519140);
        super.A13();
        0fH.A0C(BlueService.class, "onDestroy");
        ((BlueServiceLogic) this.A00.get()).A03();
        0FI.A0A(-5095172, A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRebind(Intent intent) {
        int A04 = 0FI.A04(-1128904757);
        super/*android.app.Service*/.onRebind(intent);
        0FI.A0A(-2064956719, A04);
    }
}
