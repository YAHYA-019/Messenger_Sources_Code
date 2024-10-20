package com.facebook.messaging.montage.list;

import X.06Z;
import X.1BQ;
import X.1Br;
import X.1Rv;
import X.7zU;
import X.AbF;
import X.C00i;
import X.C04464b1;
import X.C2403Gc5;
import X.C2j4;
import X.IX7;
import X.Iq3;
import android.R;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MontageListActivity.class */
public class MontageListActivity extends FbFragmentActivity {
    public C00i A00;
    public final C00i A01 = 1BQ.A02(66459);

    public static void A12(MontageListActivity montageListActivity) {
        super.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.06c] */
    /* JADX WARN: Type inference failed for: r306v3, types: [androidx.fragment.app.Fragment, X.Gc5] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        C2403Gc5 c2403Gc5;
        super.A2y(bundle);
        this.A00 = AbF.A0Q(this, 50024);
        if (bundle == null) {
            ?? c2403Gc52 = new C2403Gc5();
            ?? A0D = 7zU.A0D(this);
            A0D.A0L(c2403Gc52, R.id.content);
            A0D.A04();
            c2403Gc5 = c2403Gc52;
        } else {
            Object A0Y = BDe().A0Y(R.id.content);
            A0Y.getClass();
            c2403Gc5 = (C2403Gc5) A0Y;
        }
        if (!c2403Gc5.A07) {
            c2403Gc5.A07 = true;
            if (c2403Gc5.A01 != null) {
                C2403Gc5.A03(c2403Gc5);
            }
        }
        c2403Gc5.A05 = new IX7(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        if (getIntent().getBooleanExtra("from_chathead", false)) {
            C2j4 c2j4 = (C2j4) this.A01.get();
            06Z BDe = BDe();
            if (((1Rv) 1Br.A0B(c2j4.A07)).A0B()) {
                ((C04464b1) 1Br.A0B(c2j4.A05)).A03();
            } else {
                c2j4.A00 = new Iq3(c2j4);
                C2j4.A00(BDe);
            }
        }
        super.finish();
    }
}
