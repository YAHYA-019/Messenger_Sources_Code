package com.facebook.messaging.search.filtertab;

import X.0FI;
import X.11T;
import X.1BJ;
import X.1Br;
import X.1Kd;
import X.1Lm;
import X.2JX;
import X.2Jf;
import X.3Ku;
import X.4YU;
import X.4YV;
import X.7zL;
import X.7zM;
import X.7zP;
import X.7zR;
import X.7zS;
import X.8Ks;
import X.8Zf;
import X.9De;
import X.AnonymousClass001;
import X.BhC;
import X.BqX;
import X.C03z;
import X.C1a;
import X.CB2;
import X.D4p;
import X.GF8;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* loaded from: SearchFilterBottomsheetFragment.class */
public final class SearchFilterBottomsheetFragment extends BaseMigBottomSheetDialogFragment {
    public int A00;
    public LithoView A01;
    public GF8 A02;
    public BqX A03;
    public List A04 = AnonymousClass001.A0s();
    public int A05;
    public final 1Br A06;
    public final 1Br A07;
    public final BhC A08;
    public final FbUserSession A09;

    public SearchFilterBottomsheetFragment() {
        1Br A0Y = 7zM.A0Y();
        this.A07 = A0Y;
        this.A09 = 7zS.A0E(A0Y);
        this.A06 = 7zM.A0Q();
        this.A08 = new BhC(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView lithoView = new LithoView(7zP.A0T(this));
        this.A01 = lithoView;
        return lithoView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9De, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Context requireContext;
        int i;
        int A02 = 0FI.A02(1559890047);
        super.onCreate(bundle);
        this.A05 = requireArguments().getInt("arg_bottomsheet_filter_pill_tab_position");
        this.A00 = requireArguments().getInt("arg_bottomsheet_filter_pill_list_item_position");
        this.A03 = (BqX) CB2.A00(requireContext()).get(this.A05);
        List list = this.A04;
        list.clear();
        BqX bqX = this.A03;
        if (bqX != null) {
            int intValue = bqX.A00.intValue();
            if (intValue == 0) {
                requireContext = requireContext();
                i = 2131962153;
            } else if (intValue == 2) {
                requireContext = requireContext();
                i = 2131962160;
            } else if (intValue == 1) {
                requireContext = requireContext();
                i = 2131962154;
            } else if (intValue == 3) {
                requireContext = requireContext();
                i = 2131962159;
            }
            String string = requireContext.getString(i);
            if (string != null) {
                list.add(new 8Ks(string, "", 1, false));
            }
        }
        0FI.A08(-1366745563, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(2117663144);
        super.onDestroyView();
        this.A01 = null;
        0FI.A08(-1446312348, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            MigColorScheme A1F = A1F();
            BqX bqX = this.A03;
            lithoView.A0y(new 8Zf(this.A08, A1F, bqX != null ? bqX.A01 : "", this.A04));
        }
        1Br A01 = 1Lm.A01(this.A09, 67844);
        BqX bqX2 = this.A03;
        if (bqX2 != null) {
            Integer num = bqX2.A00;
            3Ku r0 = (3Ku) 1Br.A0B(A01);
            Context requireContext = requireContext();
            C1a c1a = new C1a(this);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            C03z c03z = GraphQlCallInput.A02;
            int intValue = num.intValue();
            4YV.A1A(4YU.A0J(c03z, intValue != 0 ? intValue != 2 ? intValue != 3 ? intValue != 1 ? "" : "EDUCATION" : "FRIENDS" : "WORK" : "CITY", 1BJ.A00(425)), A0M, "input");
            1Kd.A0F(D4p.A00(r0, c1a, 65), 7zR.A0n(requireContext, 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "SearchSubfilterNullStateQuery", (String) null, "fbandroid", 1770717852, 0, 1642051329L, 1642051329L, false, true))), r0.A00);
        }
    }
}
