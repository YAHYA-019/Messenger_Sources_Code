package com.facebook.messaging.montage.audience.picker;

import X.1BK;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1LE;
import X.1Lo;
import X.2Kj;
import X.7zU;
import X.AbF;
import X.AbJ;
import X.AbL;
import X.AbR;
import X.AlX;
import X.BfF;
import X.BfG;
import X.Bse;
import X.C00i;
import X.C21N;
import X.CNW;
import X.CbU;
import X.Qnx;
import android.R;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.inject.FbInjector;
import com.google.common.base.Preconditions;

/* loaded from: MontageAudiencePickerActivity.class */
public class MontageAudiencePickerActivity extends FbFragmentActivity {
    public AlX A00;
    public AbR A01;
    public C00i A02;
    public Bse A03;
    public Qnx A04;
    public CNW A05;
    public final C00i A06 = 1BQ.A01();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A03 = (Bse) 1Bn.A0E(this, (1BY) null, 83276);
        this.A01 = AbF.A0O(this, 610);
        this.A02 = 1BV.A00(611);
        Qnx serializable = bundle == null ? null : bundle.getSerializable("mode");
        this.A04 = serializable;
        if (serializable == null) {
            serializable = (Qnx) getIntent().getSerializableExtra("mode");
            this.A04 = serializable;
        }
        Preconditions.checkNotNull(serializable, "Must specify mode to open audience picker");
        AlX A0b = BDe().A0b("audence_picker_fragment");
        this.A00 = A0b;
        if (A0b == null) {
            this.A00 = new AlX();
            AbJ.A1J(7zU.A0D(this), this.A00, "audence_picker_fragment", R.id.content);
        }
        Bse bse = this.A03;
        if (!((2Kj) bse.A03.get()).A00() || CbU.A00(bse.A02) == 1LE.A05) {
            1BK.A09(this.A06).D11("MontageAudiencePickerActivity", "Should not be showing audience controls");
            finish();
            return;
        }
        AbR abR = this.A01;
        Qnx qnx = this.A04;
        BfF bfF = new BfF(this);
        BfG bfG = new BfG(this);
        AlX alX = this.A00;
        C21N c21n = (C21N) 1Lo.A04(this, A08, (1BY) null, 33124);
        AbR abR2 = (AbR) this.A02.get();
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            CNW cnw = new CNW(A08, abR2, abR, qnx, bfF, bfG, alX, c21n);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = cnw;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AlX alX = this.A00;
        if (alX == null || !alX.Bkd()) {
            super.onBackPressed();
            overridePendingTransition(2130772066, 2130772070);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("mode", this.A04);
    }
}
