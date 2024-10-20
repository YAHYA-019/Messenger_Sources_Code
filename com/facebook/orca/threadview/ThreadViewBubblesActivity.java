package com.facebook.orca.threadview;

import X.0fH;
import X.1BQ;
import X.1Bi;
import X.1Br;
import X.1Od;
import X.1vE;
import X.2OZ;
import X.4YU;
import X.4YV;
import X.5JF;
import X.5SW;
import X.5oO;
import X.7zL;
import X.AbH;
import X.AbJ;
import X.AbK;
import X.C00i;
import X.C2j5;
import X.C6el;
import X.DER;
import X.DIJ;
import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* loaded from: ThreadViewBubblesActivity.class */
public class ThreadViewBubblesActivity extends ThreadViewActivity implements DIJ, DER {
    public C00i A00;
    public final C00i A04 = 1BQ.A02(68467);
    public final C00i A05 = AbH.A0b();
    public final C00i A06 = AbH.A0D();
    public final C00i A02 = AbH.A0O();
    public final C00i A01 = 1BQ.A02(16616);
    public final C00i A03 = 1BQ.A02(83481);

    @Override // com.facebook.orca.threadview.ThreadViewActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2w(Context context) {
        super.A2w(context);
        this.A00 = 7zL.A0R(this, 33230);
    }

    @Override // com.facebook.orca.threadview.ThreadViewActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        C6el c6el;
        super.A2y(bundle);
        ((5oO) this.A04.get()).A09(this);
        2OZ r304 = super.A03;
        if (r304 != null) {
            ThreadKey threadKey = r304.A0H;
            if (threadKey == null) {
                super.A01.getClass();
                r304 = super.A03;
                c6el = new C6el();
                threadKey = super.A01;
            } else {
                c6el = new C6el();
            }
            c6el.A00(threadKey);
            c6el.A02(5SW.A0G);
            r304.A1a(new ThreadViewParams(c6el));
        }
    }

    public void CQ7() {
        2OZ r0 = super.A03;
        if (r0 != null) {
            r0.A1Y();
        }
    }

    public void CQI() {
        if (super.A03 != null) {
            if (!((1Od) this.A01.get()).A0F() && ((5JF) this.A03.get()).A00()) {
                0fH.A0j("ThreadViewBubblesActivity", "[badge] Updating app badge count from OM Bubble...");
                AbJ.A1Q(this.A02);
            }
            if (1Br.A07(((C2j5) 4YU.A0p(this.A00)).A03).AZk(36324668726792088L)) {
                0fH.A0j("ThreadViewBubblesActivity", "Need to redirect to full screen");
                this.A05.get();
                AbK.A0q(this.A06).A0A(getBaseContext(), 4YV.A08("fb-messenger://threads"));
                finish();
                return;
            }
            if (super.A03.A0H == null) {
                super.A01.getClass();
                2OZ r0 = super.A03;
                C6el c6el = new C6el();
                c6el.A00(super.A01);
                c6el.A02(5SW.A0G);
                c6el.A0A = null;
                c6el.A06 = null;
                c6el.A07 = null;
                r0.A1a(new ThreadViewParams(c6el));
            }
            super.A03.A1Z();
        }
    }

    public void CQR() {
        ((1vE) 1Bi.A03(66345)).A07.set(true);
    }
}
