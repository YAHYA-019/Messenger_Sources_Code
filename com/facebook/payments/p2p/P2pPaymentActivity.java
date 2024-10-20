package com.facebook.payments.p2p;

import X.11T;
import X.1lN;
import X.1pK;
import X.2S0;
import X.6Gx;
import X.6QN;
import X.7zM;
import X.AbF;
import X.C00i;
import X.C09p;
import X.C3o5;
import X.DKC;
import X.DKD;
import X.DKE;
import X.ELw;
import X.ER3;
import X.EY2;
import X.Eu7;
import X.F5t;
import X.FHR;
import X.FI2;
import X.FI9;
import X.FII;
import X.GFb;
import X.LLe;
import X.RXM;
import X.S3o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;

/* loaded from: P2pPaymentActivity.class */
public class P2pPaymentActivity extends FbFragmentActivity implements 1lN, C09p {
    public GFb A00;
    public P2pPaymentConfig A01;
    public S3o A02;
    public C00i A03;
    public C00i A04;
    public FI2 A05;
    public final C00i A06 = DKD.A0P();

    public static Intent A12(Context context, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        return C3o5.A0D(context, P2pPaymentActivity.class).putExtra("payment_is_reminder", false).putExtra("extra_payment_config", p2pPaymentConfig).putExtra("extra_payment_data", p2pPaymentData);
    }

    private P2pPaymentConfig A15() {
        P2pPaymentConfig p2pPaymentConfig = this.A01;
        if (p2pPaymentConfig == null) {
            p2pPaymentConfig = (P2pPaymentConfig) getIntent().getParcelableExtra("extra_payment_config");
            this.A01 = p2pPaymentConfig;
        }
        return p2pPaymentConfig;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        BDe().A0A.remove(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        if (this.appCompatDelegateInternal == null) {
            FbFragmentActivity.A0Q(this);
        }
        this.appCompatDelegateInternal.A0R(2132543001);
        if (this.appCompatDelegateInternal == null) {
            FbFragmentActivity.A0Q(this);
        }
        setRequestedOrientation(1);
        BDe().A1L(this);
        if (A15() != null) {
            MigColorScheme.A00(7zM.A0F(this), AbF.A0p(this.A03));
            P2pPaymentData p2pPaymentData = (P2pPaymentData) getIntent().getParcelableExtra("extra_payment_data");
            P2pPaymentConfig A15 = A15();
            try {
                if (this.appCompatDelegateInternal == null) {
                    FbFragmentActivity.A0Q(this);
                }
                6QN r0 = this.appCompatDelegateInternal;
                6QN.A0E(r0);
                LLe lLe = r0.A0K;
                if (lLe != null) {
                    this.A00.BPJ(lLe, A15, p2pPaymentData);
                    this.A02 = new S3o(lLe, this);
                    lLe.A0A.CrY(2131962870);
                }
            } catch (IllegalStateException unused) {
            }
            if (A15().A05 != null) {
                FII.A02(this, A15().A05);
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A04 = AbF.A0Q(this, 99183);
        this.A05 = DKD.A0X();
        this.A03 = DKD.A0W(this);
        if (A15() == null) {
            FI9.A00(this, 2131963152);
            return;
        }
        Eu7 eu7 = (Eu7) this.A04.get();
        ELw eLw = A15().A06;
        ImmutableMap immutableMap = eu7.A00;
        if (!immutableMap.containsKey(eLw)) {
            eLw = ELw.A01;
        }
        this.A00 = (GFb) ((F5t) immutableMap.get(eLw)).A01.get();
        A15();
        getIntent().getParcelableExtra("extra_payment_data");
        if (this.appCompatDelegateInternal == null) {
            FbFragmentActivity.A0Q(this);
        }
        this.appCompatDelegateInternal.A0L();
    }

    public String AWg() {
        return "payment_tray_popup";
    }

    public Long Am7() {
        return null;
    }

    @Override // X.C09p
    public /* synthetic */ void Bkh(Fragment fragment, boolean z) {
    }

    @Override // X.C09p
    public /* synthetic */ void Bki(Fragment fragment, boolean z) {
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (A15() == null || A15().A05 == null) {
            return;
        }
        FII.A01(this, A15().A05);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Iterator it = DKE.A15(this).iterator();
        while (it.hasNext()) {
            2S0 r0 = (1pK) ((Fragment) it.next());
            if (r0.isVisible() && (r0 instanceof 2S0) && r0.Bkd()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // X.C09p
    public void onBackStackChanged() {
        if (DKE.A15(this).isEmpty()) {
            return;
        }
        invalidateOptionsMenu();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (A15() == null) {
            return false;
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        menu.clear();
        S3o s3o = this.A02;
        ImmutableList immutableList = RXM.A00;
        ImmutableList immutableList2 = s3o.A02;
        11T.A09(immutableList2);
        EY2.A00(menu, immutableList2);
        RXM.A00(menu, s3o.A01, s3o.A02);
        s3o.A00 = menu;
        return onCreateOptionsMenu;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        if (menuItem.getItemId() != 2131363695) {
            return super.onOptionsItemSelected(menuItem);
        }
        6Gx A0a = DKC.A0a(this.A06);
        FHR A00 = FHR.A00();
        A00.A08("select_theme");
        A00.A04(ER3.A0e);
        A0a.A05(A00);
        super.onBackPressed();
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        S3o s3o = this.A02;
        ImmutableList immutableList = RXM.A00;
        ImmutableList immutableList2 = s3o.A02;
        11T.A09(immutableList2);
        EY2.A00(menu, immutableList2);
        RXM.A00(menu, s3o.A01, s3o.A02);
        s3o.A00 = menu;
        BDe();
        return super.onPrepareOptionsMenu(menu);
    }
}
