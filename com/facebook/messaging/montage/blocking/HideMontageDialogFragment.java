package com.facebook.messaging.montage.blocking;

import X.06Z;
import X.0FI;
import X.1BK;
import X.1iF;
import X.2Ov;
import X.AbF;
import X.AbJ;
import X.Bea;
import X.C06c;
import X.C5ic;
import X.CSG;
import X.DR6;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;

/* loaded from: HideMontageDialogFragment.class */
public class HideMontageDialogFragment extends 2Ov {
    public Bea A00;
    public C5ic A01;
    public String A02;

    public int A0d(C06c c06c, String str) {
        throw new UnsupportedOperationException();
    }

    public void A0m(06Z r302, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        if (this.A02 == null) {
            A0o();
        }
        String A0v = 1BK.A0v(getContext(), this.A02, 2131960703);
        String string = getContext().getString(2131960702);
        String string2 = getContext().getString(2131960776);
        DR6 A02 = this.A01.A02(getContext());
        A02.A03(A0v);
        A02.A0J(string);
        CSG.A01(A02, string2, this, ActionId.CONTROLLER_INITIATED);
        CSG.A05(A02, this, ActionId.TIMEOUT, 2131957622);
        return A02.A04();
    }

    public int A0q(C06c c06c, String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    public 1iF A17() {
        return AbF.A0C(1567251216773138L);
    }

    public void A1C(06Z r302) {
        if (r302.A0b("hide_montage_dialog_fragment") == null) {
            super/*X.0D2*/.A0m(r302, "hide_montage_dialog_fragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(591771226);
        super.onCreate(bundle);
        this.A01 = AbJ.A0c();
        this.A02 = this.mArguments.getString("other_user_name_key");
        0FI.A08(2096163579, A02);
    }
}
