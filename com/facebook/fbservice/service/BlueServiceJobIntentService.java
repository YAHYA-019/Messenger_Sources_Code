package com.facebook.fbservice.service;

import X.0FI;
import X.0fH;
import X.1BQ;
import X.AbstractC02263un;
import X.C00i;
import X.C01w;

/* loaded from: BlueServiceJobIntentService.class */
public class BlueServiceJobIntentService extends AbstractC02263un {
    public final C00i A00;

    public BlueServiceJobIntentService() {
        super(BlueServiceJobIntentService.class.getName());
        this.A00 = 1BQ.A02(16567);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02263un
    public void onDestroy() {
        int A04 = 0FI.A04(-71355823);
        super.onDestroy();
        0fH.A0C(BlueServiceJobIntentService.class, "onDestroy");
        ((BlueServiceLogic) this.A00.get()).A03();
        0FI.A0A(-1534763501, A04);
        C01w.A00(this);
    }
}
