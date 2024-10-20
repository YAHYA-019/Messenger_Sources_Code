package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Aki, reason: case insensitive filesystem */
/* loaded from: Aki.class */
public final class C1529Aki extends 1pK {
    public static final String __redex_internal_original_name = "RestrictedListPickerFragment";
    public LithoView A00;
    public C6G A01;
    public final C01i A02 = DCy.A00(this, 49);
    public final C01i A06 = C01g.A01(new AQm(this, 3));
    public final C01i A04 = C01g.A01(new AQm(this, 1));
    public final C01i A03 = C01g.A01(new AQm(this, 0));
    public final C01i A05 = C01g.A01(new AQm(this, 2));

    public 1iF A1R() {
        return AbN.A0B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = new C6G(7zM.A0C(this, 147906), 1BM.A01(this));
    }

    public void A1X() {
        C01i c01i = this.A03;
        if (((1pI) c01i.getValue()).BVa()) {
            ((1pI) c01i.getValue()).CeH("restricted_list_picker_fragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = 0FI.A02(-2104267503);
        7zQ.A0N().A06(this);
        this.A00 = new LithoView(getContext(), (AttributeSet) null);
        C6G c6g = this.A01;
        if (c6g == null) {
            str = "presenter";
        } else {
            c6g.A01 = this;
            c6g.A03 = true;
            CpW cpW = c6g.A0A;
            11T.A0F(cpW, 0);
            C01i c01i = this.A06;
            C5D c5d = (C5D) c01i.getValue();
            LithoView lithoView = this.A00;
            if (lithoView != null) {
                MigColorScheme migColorScheme = (MigColorScheme) this.A02.getValue();
                CxE A00 = CxE.A00(this, ActionId.DATA_LOAD_START);
                11T.A0F(migColorScheme, 1);
                c5d.A00 = lithoView;
                c5d.A02 = migColorScheme;
                c5d.A01 = cpW;
                c5d.A03 = A00;
                ((C5D) c01i.getValue()).A00(C0ty.A00, true);
                Context context = c6g.A04;
                BvD bvD = (BvD) 1Bu.A06(context, 82779);
                1Bu.A06(context, 84387);
                Cpp cpp = new Cpp(c6g, 8);
                B7v b7v = new B7v(c6g, 8);
                FbUserSession fbUserSession = c6g.A05;
                BP5 bp5 = BP5.A0R;
                Cr3 cr3 = c6g.A09;
                CqU cqU = new CqU(context, (LiveData) null, fbUserSession, (2YJ) null, bp5, (53M) null, (BhA) null, cr3, (Integer) null, (HashMap) null);
                List A03 = 11T.A03(b7v);
                CqJ cqJ = new CqJ(fbUserSession);
                CN4 cn4 = (CN4) 1Br.A0B(bvD.A00);
                53M r0 = bvD.A03;
                C91 A01 = CN4.A01(r0, cn4, false, true, false);
                C4B c4b = (C4B) 1Br.A0B(bvD.A01);
                new B81(ClientDataSourceIdentifier.A0p);
                ImmutableMap A002 = c4b.A00(fbUserSession, r0, A01);
                11T.A0A(A002);
                CIo cIo = new CIo(cqU, r0.loggingName);
                cIo.A03(A03);
                B7u b7u = B7u.A02;
                ImmutableList.Builder builder = cIo.A09;
                builder.m11011add((Object) b7u);
                builder.m11011add((Object) cqJ);
                cIo.A0A.m11011add((Object) cpp);
                CIo.A00(cIo, new LinkedHashMap(A002));
                1Br.A0C(bvD.A02);
                c6g.A00 = new Bih(new C1320Ady(context, fbUserSession, cIo));
                1Bu.A06(context, 82780);
                List A032 = 11T.A03(new B7v(c6g, 9));
                1Bu.A06(context, 148104);
                C1308Adl c1308Adl = new C1308Adl(context, fbUserSession, null, null, new CnM(1), null, null, cr3, null);
                1Bn.A0A(147994);
                AeU aeU = new AeU(context, fbUserSession, 53M.A0P);
                CIo cIo2 = new CIo(c1308Adl, "restricted_accounts_picker_null_state");
                cIo2.A03(A032);
                cIo2.A02(11T.A03(aeU));
                1Bn.A0A(83179);
                new C1320Ady(context, fbUserSession, cIo2).A0G(new C96(null, null, null, 0, 40, true, true));
                LithoView lithoView2 = this.A00;
                if (lithoView2 != null) {
                    0FI.A08(-882767410, A02);
                    return lithoView2;
                }
            }
            str = "lithoView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-1973565372);
        C6G c6g = this.A01;
        if (c6g == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        c6g.A01 = null;
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(-1812909987, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-2074885654);
        super/*androidx.fragment.app.Fragment*/.onPause();
        InputMethodManager inputMethodManager = (InputMethodManager) this.A04.getValue();
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        7zR.A12(lithoView, inputMethodManager);
        0FI.A08(-1645911672, A02);
    }
}
