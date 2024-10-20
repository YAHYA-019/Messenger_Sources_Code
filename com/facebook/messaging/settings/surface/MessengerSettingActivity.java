package com.facebook.messaging.settings.surface;

import X.1BV;
import X.1Bi;
import X.1Fv;
import X.1Lo;
import X.1iF;
import X.1pK;
import X.C00i;
import X.C06c;
import X.DKy;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MessengerSettingActivity.class */
public abstract class MessengerSettingActivity extends FbFragmentActivity {
    public C00i A00;
    public C00i A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(3514598055237358L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = 1Lo.A00(this, ((1Fv) 1Bi.A03(66351)).A05(this), 99445);
        this.A00 = new 1BV(this, 16979);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    public void A3B() {
        ((DKy) this.A01.get()).A01(this);
    }

    public void A3C(1pK r302) {
        A3D(r302, false);
    }

    public void A3D(1pK r302, boolean z) {
        r302.getClass();
        setContentView(2132543350);
        A2c(2131365483).setBackground(new ColorDrawable(((MigColorScheme) this.A00.get()).BDl()));
        String name = r302.getClass().getName();
        if (BDe().A0b(name) == null) {
            C06c c06c = new C06c(BDe());
            c06c.A0Q(r302, name, 2131364228);
            if (z) {
                c06c.A0V(name);
            }
            c06c.A04();
        }
    }
}
