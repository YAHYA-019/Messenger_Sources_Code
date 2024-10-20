package com.facebook.messaging.neue.nux.acctlogin;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Fv;
import X.1G2;
import X.1Iw;
import X.1Ql;
import X.1iF;
import X.2Vz;
import X.2W0;
import X.7zL;
import X.7zN;
import X.7zP;
import X.7zQ;
import X.AbK;
import X.B0G;
import X.BMG;
import X.Bfp;
import X.Bm8;
import X.C00i;
import X.C1806Atf;
import X.C1rs;
import X.CQH;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.BitSet;

/* loaded from: AccountSSOAutoLoginCardFragment.class */
public final class AccountSSOAutoLoginCardFragment extends SlidingSheetDialogFragment {
    public FbUserSession A00;
    public Bm8 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 1Br A07 = 7zN.A0I(this);
    public final 1Br A09 = 1Bq.A00(33179);
    public final 1Br A06 = 1Bu.A00(85245);
    public final 1Br A05 = 1Bu.A02(this, 17037);
    public final 1Br A08 = 1BK.A0E();
    public final 1Fv A0A = 7zQ.A0N();
    public final Bfp A0B = new Bfp(this);

    public 1iF A17() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-27075945);
        super.onCreate(bundle);
        1Ql.A01(1Br.A08(this.A08), 2W0.A0M, false);
        C00i c00i = this.A05.A00;
        this.A02 = !((FbSharedPreferences) ((2Vz) c00i.get()).A04.get()).A3a(2W0.A04, "").equals("");
        this.A03 = ((2Vz) c00i.get()).A0B();
        this.A00 = this.A0A.A06(this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean("is_from_oauth")) {
            CQH cqh = (CQH) 1Br.A0B(this.A06);
            BMG bmg = BMG.A1d;
            Bundle bundle3 = this.mArguments;
            11T.A0D(bundle3);
            cqh.A0E(bmg, bundle3.getString("logging_prefix"));
        } else if (this.A02) {
            ((CQH) 1Br.A0B(this.A06)).A09(BMG.A0I);
        } else if (this.A03) {
            ((2Vz) c00i.get()).A07(BMG.A19);
        }
        0FI.A08(-955625232, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        int A02 = 0FI.A02(-2037772827);
        Dialog dialog = ((0D2) this).A01;
        Window window = null;
        if (dialog != null) {
            window = dialog.getWindow();
        }
        if (window != null) {
            Dialog dialog2 = ((0D2) this).A01;
            11T.A0D(dialog2);
            Window window2 = dialog2.getWindow();
            11T.A0D(window2);
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        1Iw A0T = 7zP.A0T(this);
        LithoView lithoView = new LithoView(A0T);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("user_id")) != null && string.length() != 0) {
            Bundle bundle3 = this.mArguments;
            11T.A0D(bundle3);
            String string2 = bundle3.getString("user_name");
            if (string2 != null && string2.length() != 0) {
                C1806Atf c1806Atf = new C1806Atf(A0T, new B0G());
                FbUserSession fbUserSession = this.A00;
                if (fbUserSession == null) {
                    7zL.A1C();
                    throw 0Q8.createAndThrow();
                }
                B0G b0g = c1806Atf.A01;
                b0g.A00 = fbUserSession;
                BitSet bitSet = c1806Atf.A02;
                bitSet.set(2);
                Bundle bundle4 = this.mArguments;
                11T.A0D(bundle4);
                b0g.A03 = bundle4.getString("user_name");
                bitSet.set(0);
                Bundle bundle5 = this.mArguments;
                11T.A0D(bundle5);
                b0g.A04 = bundle5.getString("user_id");
                bitSet.set(4);
                Bundle bundle6 = this.mArguments;
                11T.A0D(bundle6);
                b0g.A05 = bundle6.getBoolean("is_from_oauth", false);
                bitSet.set(3);
                b0g.A02 = 7zQ.A0m(this.A07);
                bitSet.set(1);
                b0g.A01 = this.A0B;
                C1rs.A04(bitSet, c1806Atf.A03);
                c1806Atf.A0J();
                lithoView.A0x(b0g);
            }
        }
        0FI.A08(-1007087968, A02);
        return lithoView;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        if (this.A02) {
            ((CQH) 1Br.A0B(this.A06)).A09(BMG.A0G);
            if (this.A04) {
                C00i c00i = this.A05.A00;
                FbSharedPreferences A0R = 1BK.A0R(((2Vz) c00i.get()).A04);
                1G2 r0 = 2W0.A05;
                String A3a = A0R.A3a(r0, "");
                if (!A3a.equals("") && (A3a.equals("switcher_first_impression") || A3a.equals("switcher_second_impression"))) {
                    1Ql A0V = 1BL.A0V(((2Vz) c00i.get()).A04);
                    A0V.CaL(r0, "switcher_second_impression");
                    A0V.commit();
                }
            }
            ((2Vz) 1Br.A0B(this.A05)).A03();
        } else if (this.A03) {
            ((2Vz) 1Br.A0B(this.A05)).A09("");
        }
        1Ql.A01(1Br.A08(this.A08), 2W0.A0M, false);
    }
}
