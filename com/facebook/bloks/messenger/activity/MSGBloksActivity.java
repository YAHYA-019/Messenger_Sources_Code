package com.facebook.bloks.messenger.activity;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bn;
import X.1lN;
import X.1pH;
import X.1tC;
import X.2LK;
import X.2Od;
import X.2Ov;
import X.7zL;
import X.7zO;
import X.AbI;
import X.AbK;
import X.AbL;
import X.AfK;
import X.AnonymousClass001;
import X.C0k4;
import X.C1io;
import X.C2050DaD;
import X.CfA;
import X.DDz;
import X.DKD;
import X.DKE;
import X.DLQ;
import X.DZT;
import X.DZU;
import X.EUf;
import X.EaZ;
import X.F0E;
import X.FGX;
import X.FIv;
import X.FZn;
import X.Fwk;
import X.FxJ;
import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.bloks.messenger.hosting.screens.MsgCdsBottomSheetFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.meta.foa.cds.bottomsheet.MsgNativeCdsBottomSheetFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksActivity.class */
public class MSGBloksActivity extends FbFragmentActivity implements 1lN, 2LK, DDz, C1io {
    public 1pH A00;

    private Fragment A12() {
        List A15 = DKE.A15(this);
        if (A15.isEmpty()) {
            return null;
        }
        return (Fragment) DKE.A0q(A15);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        this.A00.A06();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        1pH r305;
        DZT A00;
        1pH r3052;
        1lN msgCdsBottomSheetFragment;
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A00 = 1pH.A01((ViewGroup) requireViewById(R.id.content), BDe(), new CfA(this, 0));
        String str = "MSGBloksScreenFragment_default_screen_id";
        if (BDe().A0b(str) == null) {
            Bundle A0H = 7zO.A0H(this);
            if (A0H == null) {
                throw AnonymousClass001.A0N("Bloks Activity must be initialized with a non-null extras bundle prepared by SurfaceCore.");
            }
            int i = A0H.getInt("target_fragment", 0);
            if (i != 0) {
                if (i == 1) {
                    AbK.A1D(this, A08);
                    r3052 = this.A00;
                    msgCdsBottomSheetFragment = new MsgCdsBottomSheetFragment();
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && bundle == null) {
                            BDe().A1K(new AfK(this, 0), false);
                            FZn A01 = FZn.A0B.A01(A0H);
                            2Ov baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                            baseMigBottomSheetDialogFragment.setArguments(A0H);
                            baseMigBottomSheetDialogFragment.A0m(BDe(), A01.A07);
                            return;
                        }
                        return;
                    }
                    int i2 = A0H.getInt("shared_element_transition", -1);
                    if (i2 != -1) {
                        FGX.A02(EaZ.class, Integer.valueOf(i2));
                    }
                    AbK.A1D(this, A08);
                    r3052 = this.A00;
                    msgCdsBottomSheetFragment = new MsgNativeCdsBottomSheetFragment();
                } else {
                    if (bundle != null) {
                        return;
                    }
                    FZn A012 = FZn.A0B.A01(A0H);
                    r305 = this.A00;
                    A00 = new DZT();
                    A00.setArguments(A0H);
                    str = A012.A07;
                }
                msgCdsBottomSheetFragment.setArguments(A0H);
                r3052.Czy(msgCdsBottomSheetFragment, DKD.A0p(A0H, "bloks_model_screen_id"));
                return;
            }
            FxJ A002 = F0E.A00(A0H);
            C0k4.A00(A002);
            MigColorScheme migColorScheme = A002.A03;
            if (migColorScheme != null) {
                Window window = getWindow();
                if (window != null) {
                    ((1tC) 1Bn.A0A(16838)).A03(window, migColorScheme);
                }
            } else {
                AbK.A1D(this, A08);
            }
            r305 = this.A00;
            F0E.A01(A0H, A002);
            A00 = EUf.A00(A0H, 100, false);
            DLQ dlq = A002.A06;
            if (dlq != null) {
                str = FIv.A07(dlq);
            }
            r305.Czy(A00, str);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    public String AWg() {
        1lN A12 = A12();
        return A12 == null ? "null" : A12 instanceof 1lN ? A12.AWg() : "unknown";
    }

    public Map Agf() {
        Map Agf;
        HashMap A0u = AnonymousClass001.A0u();
        2LK A12 = A12();
        if ((A12 instanceof 2Od) && (Agf = A12.Agf()) != null) {
            A0u.putAll(Agf);
        }
        return A0u;
    }

    public Long Am7() {
        return 453586272481763L;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InputMethodManager A06;
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (A06 = AbI.A06(this)) != null) {
            A06.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
        if (this.A00.A07()) {
            return;
        }
        Fragment A12 = A12();
        if (A12 instanceof 0D2) {
            7zL.A1Q(A12);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Fragment A12 = A12();
        if (A12 != null) {
            BDe().A11(bundle, A12, "MSGBloksScreenFragment_default_screen_id");
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(1222451879);
        super.onStart();
        DZU A12 = A12();
        if (A12 instanceof DZU) {
            A12.getClass();
            C2050DaD c2050DaD = A12.A04;
            if (c2050DaD == null) {
                11T.A0L("bloksHost");
                throw 0Q8.createAndThrow();
            }
            MigColorScheme.A00(requireViewById(R.id.content), ((Fwk) c2050DaD).A01.A01);
        }
        0FI.A07(-76997332, A00);
    }
}
