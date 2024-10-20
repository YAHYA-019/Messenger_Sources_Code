package com.facebook.earlyfetch;

import X.1BQ;
import X.1Bi;
import X.1EZ;
import X.1Fv;
import X.2yD;
import X.AbstractC00603o4;
import X.C00i;
import android.content.Intent;
import com.facebook.inject.FbInjector;

/* loaded from: EarlyFetchController.class */
public class EarlyFetchController {
    public Intent A00;
    public final C00i A02 = FbInjector.A00;
    public final C00i A01 = 1BQ.A02(114941);

    private void A00(Intent intent) {
        int intExtra;
        if (((2yD) 1Bi.A03(16387)).AZk(72339270884524449L)) {
            return;
        }
        String A00 = AbstractC00603o4.A00(39);
        if (!intent.hasExtra(A00) || (intExtra = intent.getIntExtra(A00, -1)) < 0 || intExtra > 1197 || intExtra == 248) {
            return;
        }
        1Fv.A00(intent.getExtras(), (1Fv) 1Bi.A03(66351), (1EZ) null);
        this.A01.get();
    }

    public void onBeforeStartActivity(Intent intent) {
        A00(intent);
        this.A00 = intent;
    }

    public void onStartActivity(Intent intent) {
        if (this.A00 != intent) {
            A00(intent);
        }
        this.A00 = null;
    }
}
