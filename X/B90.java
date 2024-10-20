package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.concurrent.Executor;

/* loaded from: B90.class */
public final class B90 extends BJB {
    public static final String __redex_internal_original_name = "AvatarPreferenceFragment";
    public FbUserSession A00;
    public 2Dp A02;
    public BwR A03;
    public boolean A04;
    public boolean A05;
    public final C01i A0B = DCx.A00(this, 34);
    public final C01i A0C = C01g.A01(DCT.A00);
    public final C01i A0A = C01g.A01(DCS.A00);
    public final C01i A09 = DCx.A00(this, 32);
    public final C01i A07 = DCx.A00(this, 31);
    public final C01i A08 = C01g.A01(DCR.A00);
    public final C01i A06 = C01g.A01(DCQ.A00);
    public final C01i A0D = DCx.A00(this, 35);
    public TriState A01 = TriState.UNSET;

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1713449498);
        this.A00 = 1BM.A01(this);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(121786314, A04);
        return A0J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        C2a2 c2a2;
        int A02 = 0FI.A02(1847450655);
        super/*X.DZJ*/.onDestroy();
        BwR bwR = this.A03;
        if (bwR != null && (c2a2 = bwR.A00) != null) {
            c2a2.AE0(null);
        }
        this.A03 = null;
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        C00i c00i = ((CDb) 7zN.A0m(this, fbUserSession, 83675)).A00.A00;
        FbSharedPreferences A0S = 1BK.A0S(c00i);
        1G9 r0 = CDb.A03;
        int A03 = 7zM.A03(A0S, r0);
        1Ql A0U = 1BL.A0U(c00i);
        A0U.CaE(r0, (A03 + 1) % 1000);
        A0U.commitImmediately();
        0FI.A08(-571136937, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-2113126397);
        super/*androidx.fragment.app.Fragment*/.onResume();
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A04(Property.ICON_TEXT_FIT_WIDTH, Integer.valueOf(7zO.A0D(this).getDisplayMetrics().widthPixels / 2));
        1Kd.A0F(D4q.A00(this, 20), ((1Vd) this.A0B.getValue()).A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "FbAvatarSettingsQuery", (String) null, "fbandroid", -298915296, 0, 1124669L, 1124669L, false, true))), (Executor) this.A0C.getValue());
        if (this.A01 == TriState.UNSET && 7G3.A00((7G3) this.A08.getValue()).AZk(36321529105433028L)) {
            ((C6k3) ((Bc9) this.A0D.getValue()).A00.getValue()).A00(new AeI(new AeI(this, 15), 18));
        }
        BwR bwR = this.A03;
        if (bwR != null) {
            1Br A01 = 1Lm.A01(bwR.A05, 66452);
            if (bwR.A02 && 7Nd.A00((7Nd) 1Br.A0B(A01)).AZk(36322091745690699L)) {
                bwR.A02 = false;
                bwR.A03 = true;
            }
            if (bwR.A03 && bwR.A01) {
                bwR.A03 = false;
                bwR.A01 = false;
                bwR.A06.invoke();
            }
        }
        0FI.A08(-1437807631, A02);
    }
}
