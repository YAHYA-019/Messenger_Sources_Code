package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.Alp, reason: case insensitive filesystem */
/* loaded from: Alp.class */
public final class C1570Alp extends 1pK implements 1pN, 2Op {
    public static final BzK A08 = new Object();
    public static final String __redex_internal_original_name = "CommunityCreationNuxFragment";
    public 1pI A00;
    public Bkm A01;
    public 2MX A02;
    public String A03;
    public final 1Br A06 = AbG.A0c();
    public final C01i A07 = C01g.A00(C03i.A02, new DCw(this, 29));
    public final View.OnClickListener A05 = CZD.A00(this, 58);
    public final View.OnClickListener A04 = CZD.A00(this, 57);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1570Alp c1570Alp) {
        2MX r0;
        A06(c1570Alp, "dismiss", null);
        1pI r02 = c1570Alp.A00;
        if (r02 != null) {
            if (!r02.BVa()) {
                return;
            }
            1pI r03 = c1570Alp.A00;
            if (r03 != null) {
                r03.CeH(__redex_internal_original_name);
                if (11T.A0O(c1570Alp.requireArguments().getString("community_creation_nux_entry_point"), "communities_tab") || (r0 = c1570Alp.A02) == null) {
                    return;
                }
                r0.CVh(0S2.A0C);
                return;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }

    public static final void A06(C1570Alp c1570Alp, String str, String str2) {
        Bkm bkm = c1570Alp.A01;
        if (bkm == null) {
            11T.A0L("communityCreationMigNuxCarousel");
            throw 0Q8.createAndThrow();
        }
        int i = bkm.A00;
        AbJ.A0O(c1570Alp.A06).A04(new CommunityMessagingLoggerModel(null, CAJ.A00(c1570Alp.A03), null, null, null, null, str, "community_creation_nux_interstitial", str2, CAJ.A01(c1570Alp.A03), null, 1BK.A1D(7zK.A00(273), String.valueOf(i))));
    }

    public boolean Bkd() {
        A03(this);
        return true;
    }

    public void CpV(2MX r302) {
        this.A02 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-2053807605);
        11T.A0F(layoutInflater, 0);
        this.A03 = requireArguments().getString("community_creation_nux_entry_point");
        View inflate = layoutInflater.inflate(2132542368, viewGroup, false);
        0FI.A08(-960993758, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C1296Ad8 A0O = AbJ.A0O(this.A06);
        String str = this.A03;
        A0O.A03(new CommunityMessagingLoggerModel(null, CAJ.A00(str), null, null, null, null, null, "community_creation_nux_interstitial", 7zK.A00(284), CAJ.A01(str), null, null));
        C01i c01i = this.A07;
        LithoView lithoView = (LithoView) c01i.getValue();
        1Iw A0U = AbF.A0U((LithoView) c01i.getValue());
        MigColorScheme A0j = 7zS.A0j(this);
        Bkm bkm = (Bkm) 1Bn.A0A(83311);
        this.A01 = bkm;
        if (bkm == null) {
            11T.A0L("communityCreationMigNuxCarousel");
            throw 0Q8.createAndThrow();
        }
        String string = requireArguments().getString("community_creation_nux_entry_point");
        View.OnClickListener onClickListener = this.A04;
        View.OnClickListener onClickListener2 = this.A05;
        11T.A0F(A0j, 1);
        int i = 2131967447;
        int i2 = 2131954478;
        if (C4Mu.A00((C4Mu) 1Bi.A03(68133)).AZk(36321834049946455L)) {
            i = 2131954477;
            i2 = 2131954464;
        }
        8NK r0 = new 8NK(new 8Lf(CZD.A00(onClickListener, 55), CZD.A00(onClickListener2, 56), A0U.A0D(i), A0U.A0D(i2)), new 8Yw(A0j, string, bkm.A01, bkm.A00), (9Di) null, "", (CharSequence) null, (CharSequence) null, (Integer) null, (Integer) null, (List) null, true, true);
        8Tn A00 = C8nn.A00(A0U);
        A00.A2a(A0j);
        A00.A2Z(r0);
        lithoView.A0x(new QGH(A00.A2W(), A0j, CxE.A00(this, 22)));
        this.A00 = 1vD.A00(view);
        C5fi.A00(getActivity());
    }
}
