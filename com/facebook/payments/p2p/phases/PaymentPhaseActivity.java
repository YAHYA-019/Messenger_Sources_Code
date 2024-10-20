package com.facebook.payments.p2p.phases;

import X.0FI;
import X.1BY;
import X.1Bn;
import X.1K9;
import X.1iF;
import X.1pK;
import X.2S0;
import X.AbL;
import X.C2069Dau;
import X.C2083Db8;
import X.CCr;
import X.DKE;
import X.DKG;
import X.ETD;
import X.EfM;
import X.Elz;
import X.Enz;
import X.FEI;
import X.FFY;
import X.FII;
import X.FJ8;
import X.G6i;
import X.GD4;
import X.GFk;
import X.GFl;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: PaymentPhaseActivity.class */
public class PaymentPhaseActivity extends FbFragmentActivity implements GD4 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public FFY A05;
    public FEI A06;
    public GFl A07;
    public PaymentsTitleBarViewStub A08;
    public FbUserSession A09;
    public FII A0A;
    public CCr A0B;
    public EfM A0C;
    public GFk A0D;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0107, code lost:
    
        if (r0.getBooleanValue(739124527) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0195, code lost:
    
        if (((r301.BDe().A0U() >= 1 ? r301.BDe().A0Y(2131364228) : null) instanceof X.DYt) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A12(com.facebook.payments.p2p.phases.PaymentPhaseActivity r301) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.p2p.phases.PaymentPhaseActivity.A12(com.facebook.payments.p2p.phases.PaymentPhaseActivity):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof 1pK) {
            this.A0D.AC8((1pK) fragment, this.A05);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0244 A[LOOP:0: B:39:0x0236->B:41:0x0244, LOOP_END] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.p2p.phases.PaymentPhaseActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A0A = DKG.A0h(this);
        this.A05 = (FFY) 1Bn.A0A(99194);
        this.A06 = (FEI) 1Bn.A0A(98897);
        this.A0C = (EfM) 1Bn.A0E(this, (1BY) null, 99195);
        this.A0B = (CCr) 1Bn.A0E(this, (1BY) null, 82519);
        Serializable serializableExtra = getIntent().getSerializableExtra("payment_phase_style");
        Object obj = this.A0C.A00.get(serializableExtra);
        obj.getClass();
        this.A07 = ((Enz) obj).A03;
        Object obj2 = this.A0C.A00.get(serializableExtra);
        obj2.getClass();
        this.A0D = ((Enz) obj2).A02;
        this.A0A.A05(this, PaymentsTitleBarStyle.A03, true);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, PaymentsDecoratorAnimation.A01);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List A15 = DKE.A15(this);
        Fragment fragment = (A15 == null || A15.isEmpty()) ? null : (Fragment) DKE.A0q(A15);
        if ((fragment instanceof 2S0) && ((2S0) fragment).Bkd()) {
            return;
        }
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(42063915);
        super.onPause();
        this.A05.A05.A01 = true;
        0FI.A07(-1415676565, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(196829566);
        super.onResume();
        FFY ffy = this.A05;
        Elz elz = ffy.A05;
        elz.A01 = false;
        LinkedList linkedList = elz.A00;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ETD etd = (ETD) it.next();
            Throwable th = etd.A02;
            1K9 r0 = etd.A00;
            if (th != null) {
                r0.onFailure(th);
            } else {
                r0.onSuccess(etd.A01);
            }
        }
        linkedList.clear();
        if (ffy.A02 == null) {
            G6i g6i = new G6i(ffy, 8);
            elz.A02.A08(new C2069Dau(C2083Db8.A00(ffy, 21), elz, 24), "pre_process_task_key", g6i);
        }
        0FI.A07(951861300, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FFY ffy = this.A05;
        bundle.putInt("step_index_key", ffy.A00);
        bundle.putParcelable("instance_state_phase_key", ffy.A02);
        FJ8.A09(bundle, "instance_state_phase_queue_key", ffy.A04);
        ffy.A03.CjT(bundle);
    }
}
