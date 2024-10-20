package com.facebook.messaging.memories.consent;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1iF;
import X.1pH;
import X.2M3;
import X.7zN;
import X.7zO;
import X.8Gb;
import X.C9ro;
import X.CfA;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MemoriesConsentActivity.class */
public final class MemoriesConsentActivity extends FbFragmentActivity {
    public 1pH A00;
    public final 2M3 A01 = new C9ro(this, 0);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(1065372051377103L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        2M3 r0 = this.A01;
        View AUH = r0.AUH();
        11T.A0I(AUH, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A00 = 1pH.A01((ViewGroup) AUH, BDe(), new CfA(this, 4));
        Bundle A0H = 7zO.A0H(this);
        long j = A0H != null ? A0H.getLong("consent_entrypoint") : 6;
        7zN.A11(r0.AUH());
        1pH r02 = this.A00;
        if (r02 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        if (r02.BVa()) {
            Bundle A05 = 1BK.A05();
            A05.putLong("consent_entrypoint", j);
            8Gb r03 = new 8Gb();
            r03.setArguments(A05);
            r02.Czz(r03, 0S2.A0j, "MemoriesConsentFragment");
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }
}
