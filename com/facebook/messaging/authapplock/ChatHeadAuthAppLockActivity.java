package com.facebook.messaging.authapplock;

import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1iF;
import X.1vE;
import X.7zR;
import X.AbF;
import X.AbstractC2326GOr;
import X.DKH;
import X.F7R;
import X.HQd;
import X.I0i;
import X.I8R;
import X.InterfaceC03743yx;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.authapplock.baseactivity.AuthAppLockBaseActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ChatHeadAuthAppLockActivity.class */
public final class ChatHeadAuthAppLockActivity extends AuthAppLockBaseActivity implements InterfaceC03743yx {
    public I8R A00;
    public MigColorScheme A01;
    public FbUserSession A02;
    public HQd A03;
    public F7R A04;
    public final 1Br A06 = 1Bq.A00(66345);
    public final ColorDrawable A05 = new ColorDrawable();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(796330954455679L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        String str;
        super.A2l();
        if (((1vE) 1Br.A0B(this.A06)).A07.get()) {
            F7R f7r = this.A04;
            if (f7r == null) {
                str = "chatHeadsOpenActivityHelper";
            } else {
                FbUserSession fbUserSession = this.A02;
                if (fbUserSession != null) {
                    f7r.A00(this, fbUserSession);
                    return;
                }
                str = "fbUserSession";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A02 = DKH.A0H(this);
        this.A04 = (F7R) 1Bn.A0A(99423);
        this.A00 = (I8R) 1Bn.A0E(this, (1BY) null, 83149);
        this.A03 = (HQd) 1Bn.A0E(this, (1BY) null, 116339);
        this.A01 = 7zR.A0c(this);
    }

    @Override // X.JHi
    public void BwG(int i, String str) {
        11T.A0F(str, 1);
        0fH.A0k("ChatHeadAppLockActvity", 0Pz.A0D(i, str));
        if (i == 10) {
            finish();
            return;
        }
        HQd hQd = this.A03;
        if (hQd == null) {
            11T.A0L("authLockStringResolver");
            throw 0Q8.createAndThrow();
        }
        I0i.A00(this, hQd, 211);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 211 && i2 == -1) {
            AbstractC2326GOr.A1F(this.A06);
        }
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finishAffinity();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r301 = this;
            r0 = -1908258707(0xffffffff8e42486d, float:-2.3947218E-30)
            int r0 = X.0FI.A00(r0)
            r302 = r0
            r0 = r301
            super.onResume()
            r0 = r301
            X.1Br r0 = r0.A06
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.1vE r0 = (X.1vE) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A07
            r303 = r0
            r0 = r303
            boolean r0 = r0.get()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2c
            r0 = r301
            r0.finish()
        L25:
            r0 = 1855142777(0x6e933b79, float:2.2783097E28)
            r1 = r302
            X.0FI.A07(r0, r1)
            return
        L2c:
            r0 = r301
            android.content.res.Resources r0 = r0.getResources()
            boolean r0 = X.C1oy.A00(r0)
            r305 = r0
            java.lang.String r0 = "colorScheme"
            r306 = r0
            r0 = r301
            android.graphics.drawable.ColorDrawable r0 = r0.A05
            r307 = r0
            r0 = r301
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.A01
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L72
            r0 = r303
            if (r0 == 0) goto L69
            r0 = r303
            int r0 = r0.AZN()
            r304 = r0
        L54:
            r0 = r307
            r1 = r304
            r0.setColor(r1)
            r0 = r301
            X.I8R r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L80
            java.lang.String r0 = "authenticator"
            r306 = r0
        L69:
            r0 = r306
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L72:
            r0 = r303
            if (r0 == 0) goto L69
            r0 = r303
            int r0 = r0.BKg()
            r304 = r0
            goto L54
        L80:
            X.GVX r0 = new X.GVX
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = r306
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = r307
            r2 = 0
            r3 = r301
            r4 = r306
            X.I8R.A00(r0, r1, r2, r3, r4)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.authapplock.ChatHeadAuthAppLockActivity.onResume():void");
    }

    @Override // X.JHi
    public void onSuccess() {
        finish();
    }
}
