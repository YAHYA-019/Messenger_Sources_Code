package com.facebook.payments.auth.fingerprint;

import X.0D2;
import X.0FI;
import X.1Bi;
import X.1Bn;
import X.1Kd;
import X.1iF;
import X.2FT;
import X.2Ov;
import X.4YV;
import X.7zO;
import X.AbH;
import X.AbJ;
import X.C00i;
import X.C2121Dea;
import X.DKD;
import X.DKG;
import X.DKS;
import X.EX8;
import X.EtC;
import X.F8y;
import X.F95;
import X.FI2;
import X.FK6;
import X.FcB;
import X.Fca;
import X.FwJ;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: FingerprintNuxDialogFragment.class */
public class FingerprintNuxDialogFragment extends 2Ov {
    public EtC A00;
    public F8y A01;
    public F95 A02;
    public Executor A03;
    public boolean A04;
    public boolean A05;
    public FcB A06;
    public FI2 A07;
    public final C00i A08 = AbH.A0D();
    public final Fca A09 = (Fca) 1Bi.A03(99165);
    public final EX8 A0A = (EX8) 1Bi.A03(99003);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        C2121Dea A00 = DKS.A00(this);
        ((DKS) A00).A01.A0I = false;
        A00.A06(2131962354);
        A00.A05(2131962352);
        DKS.A02(A00, this, 47, 2131962350);
        A00.A0D(FK6.A00(this, 46), 2131955718);
        return A00.A0I();
    }

    public 1iF A17() {
        return DKG.A0G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1) {
            A0p();
            return;
        }
        String stringExtra = intent.getStringExtra("user_entered_pin");
        stringExtra.getClass();
        2FT A02 = this.A09.A02(stringExtra);
        FwJ A00 = FwJ.A00(4YV.A0C(requireContext()), this, 25);
        Executor executor = this.A03;
        executor.getClass();
        1Kd.A0F(A00, A02, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(518004311);
        super.onCreate(bundle);
        this.A01 = (F8y) 7zO.A0l(this, 99313);
        this.A02 = (F95) 7zO.A0l(this, 99353);
        this.A00 = (EtC) 7zO.A0l(this, 99335);
        this.A03 = AbJ.A1D();
        this.A06 = (FcB) 1Bn.A0A(99314);
        this.A07 = DKD.A0X();
        this.A05 = requireArguments().getBoolean("is_pin_present", false);
        if (bundle != null) {
            this.A04 = bundle.getBoolean("is_hidden");
        }
        0FI.A08(-360234738, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putBoolean("is_hidden", this.A04);
    }

    public void onStart() {
        Dialog dialog;
        int A02 = 0FI.A02(-1125158264);
        super/*X.0D2*/.onStart();
        if (this.A04 && (dialog = ((0D2) this).A01) != null) {
            dialog.hide();
            this.A04 = true;
        }
        0FI.A08(1233724032, A02);
    }
}
