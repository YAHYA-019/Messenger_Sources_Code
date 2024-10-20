package com.facebook.messaging.authapplock;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.0QD;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1SG;
import X.1hN;
import X.1iF;
import X.1vE;
import X.AbF;
import X.AbstractC2326GOr;
import X.C1oy;
import X.DKH;
import X.F7R;
import X.GVX;
import X.HHn;
import X.HQd;
import X.I0i;
import X.I8R;
import X.IKE;
import X.InterfaceC03743yx;
import X.L8S;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.authapplock.baseactivity.AuthAppLockBaseActivity;
import java.util.Iterator;

/* loaded from: AuthAppLockActivity.class */
public final class AuthAppLockActivity extends AuthAppLockBaseActivity implements InterfaceC03743yx {
    public View A00;
    public FbUserSession A01;
    public I8R A02;
    public HHn A03;
    public HQd A04;
    public F7R A05;
    public final 1Br A08 = 1Bq.A00(66345);
    public final 1Br A09 = 1Bq.A00(66441);
    public final ColorDrawable A06 = new ColorDrawable();
    public final 1Br A07 = 1Bu.A00(116337);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(796330954455679L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        String str;
        super.A2l();
        if (((1vE) 1Br.A0B(this.A08)).A07.get()) {
            F7R f7r = this.A05;
            if (f7r == null) {
                str = "chatHeadsOpenActivityHelper";
            } else {
                FbUserSession fbUserSession = this.A01;
                if (fbUserSession == null) {
                    str = "fbUserSession";
                } else {
                    f7r.A00(this, fbUserSession);
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        AuthAppLockBaseActivity.A12(this).markerEnd(234886660, (short) 2);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = DKH.A0H(this);
        this.A03 = (HHn) 1Bn.A0A(116340);
        this.A05 = (F7R) 1Bn.A0A(99423);
        this.A02 = (I8R) 1Bn.A0E(this, (1BY) null, 83149);
        this.A04 = (HQd) 1Bn.A0E(this, (1BY) null, 116339);
        if (this.A03 == null) {
            11T.A0L("layoutResourceResolver");
            throw 0Q8.createAndThrow();
        }
        setContentView(2132541545);
        View requireViewById = requireViewById(2131362161);
        11T.A0A(requireViewById);
        this.A00 = requireViewById;
        requireViewById.setBackground(this.A06);
        View requireViewById2 = requireViewById(2131362166);
        11T.A0A(requireViewById2);
        IKE.A01(requireViewById2, this, 11);
    }

    public void A3B() {
        1hN r0 = (1hN) 1Br.A0B(this.A09);
        Iterator it = 0QD.A0O(r0.A0C, r0.A0B).iterator();
        while (it.hasNext()) {
            ((1SG) it.next()).A0K("app_lock_auth_begin");
        }
        AuthAppLockBaseActivity.A12(this).markerStart(234886660);
        I8R i8r = this.A02;
        if (i8r == null) {
            11T.A0L("authenticator");
            throw 0Q8.createAndThrow();
        }
        I8R.A00(this, new GVX(this, i8r, 0), (Fragment) null, this, i8r);
    }

    @Override // X.JHi
    public void BwG(int i, String str) {
        11T.A0F(str, 1);
        0fH.A0k("AuthAppLockActivity", 0Pz.A0D(i, str));
        if (i == 10) {
            AuthAppLockBaseActivity.A12(this).markerEnd(234886660, (short) 4);
            return;
        }
        HQd hQd = this.A04;
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
            AbstractC2326GOr.A1F(this.A08);
            AuthAppLockBaseActivity.A12(this).markerPoint(234886660, "app_lock_success");
            finish();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AuthAppLockBaseActivity.A12(this).markerEnd(234886660, (short) 4);
        finishAffinity();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(95103891);
        super.onPause();
        if (!((1vE) 1Br.A0B(this.A08)).A07.get()) {
            I8R i8r = this.A02;
            if (i8r == null) {
                11T.A0L("authenticator");
                throw 0Q8.createAndThrow();
            }
            L8S l8s = i8r.A01;
            if (l8s != null) {
                l8s.A01();
            }
        }
        0FI.A07(722144993, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(553537547);
        super.onStart();
        if (((1vE) 1Br.A0B(this.A08)).A07.get()) {
            finish();
        } else {
            boolean A002 = C1oy.A00(getResources());
            ColorDrawable colorDrawable = this.A06;
            int i = -1;
            if (A002) {
                i = -16777216;
            }
            colorDrawable.setColor(i);
            A3B();
        }
        0FI.A07(633387267, A00);
    }

    @Override // X.JHi
    public void onSuccess() {
        1hN r0 = (1hN) 1Br.A0B(this.A09);
        Iterator it = 0QD.A0O(r0.A0C, r0.A0B).iterator();
        while (it.hasNext()) {
            ((1SG) it.next()).A0K("app_lock_auth_end");
        }
        AuthAppLockBaseActivity.A12(this).markerPoint(234886660, "app_lock_success");
        finish();
    }
}
