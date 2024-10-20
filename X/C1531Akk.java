package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.search.capsection.CapSectionParam;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.messaging.search.filtertab.SearchFilterBottomsheetFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Akk, reason: case insensitive filesystem */
/* loaded from: Akk.class */
public final class C1531Akk extends 1pK {
    public static final String __redex_internal_original_name = "MessagingSearchCapSectionFragment";
    public int A00;
    public int A01;
    public FbUserSession A02;
    public C00i A03;
    public C00i A04;
    public LithoView A05;
    public C1qb A06;
    public C2ke A07;
    public DataSourceIdentifier A08;
    public BP5 A09;
    public DK4 A0A;
    public CGl A0B;
    public DJ0 A0C;
    public CIH A0D;
    public Cc4 A0E;
    public CHE A0F;
    public C5xv A0G;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S;
    public LithoView A0T;
    public CapSectionParam A0U;
    public CqU A0V;
    public boolean A0W;
    public boolean A0X;
    public final C00i A0e = AbH.A0L();
    public final C00i A0a = AbH.A0F();
    public final C00i A0Z = AbH.A0X();
    public final AtomicBoolean A0d = 7zO.A15();
    public ImmutableList A0J = ImmutableList.of();
    public ImmutableList A0I = ImmutableList.of();
    public final C00i A0Y = 1BV.A00(84244);
    public ImmutableList A0H = ImmutableList.of();
    public final C1784AsI A0b = new C1784AsI(1);
    public final GF8 A0c = new GF8() { // from class: X.Cpk
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [X.Akk, androidx.fragment.app.Fragment] */
        @Override // X.GF8
        public final void CJR(8Ks r302, int i) {
            BqX bqX;
            ?? r0 = C1531Akk.this;
            C1784AsI c1784AsI = r0.A0b;
            c1784AsI.getClass();
            List A00 = CB2.A00(r0.requireContext());
            if (i == 0) {
                bqX = A00.get(c1784AsI.A00);
            } else {
                bqX = new BqX(0S2.A15, r302.A02, true);
            }
            11T.A0F(bqX, 1);
            ArrayList A10 = 7zO.A10((Collection) c1784AsI.A02, 0);
            A10.set(c1784AsI.A00, bqX);
            c1784AsI.A02 = A10;
            int i2 = c1784AsI.A00;
            if (i2 >= 0) {
                Integer[] numArr = (Integer[]) c1784AsI.A03;
                if (i2 < numArr.length) {
                    numArr[i2] = Integer.valueOf(i);
                }
            }
            1BK.A1E(r0.A0a).execute(new D6M((C1531Akk) r0));
        }
    };
    public final AY9 A0f = new AY9() { // from class: X.Cpm
        /* JADX WARN: Type inference failed for: r0v1, types: [X.Akk, androidx.fragment.app.Fragment] */
        @Override // X.AY9
        public final void ByY(BqX bqX, int i) {
            ?? r0 = C1531Akk.this;
            C1784AsI c1784AsI = r0.A0b;
            c1784AsI.A00 = i;
            int intValue = ((Integer[]) c1784AsI.A03)[i].intValue();
            GF8 gf8 = r0.A0c;
            2qR r02 = BaseMigBottomSheetDialogFragment.A06;
            11T.A0F(gf8, 2);
            0D2 searchFilterBottomsheetFragment = new SearchFilterBottomsheetFragment();
            Bundle A05 = 1BK.A05();
            A05.putInt("arg_bottomsheet_filter_pill_tab_position", i);
            A05.putInt("arg_bottomsheet_filter_pill_list_item_position", intValue);
            searchFilterBottomsheetFragment.A02 = gf8;
            searchFilterBottomsheetFragment.setArguments(A05);
            searchFilterBottomsheetFragment.A0m(r0.mFragmentManager, C1531Akk.__redex_internal_original_name);
        }
    };

    public 1iF A1R() {
        return AbK.A0E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04bd, code lost:
    
        if (r306 == false) goto L23;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x02b9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v342, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v344, types: [java.lang.Throwable, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1531Akk.A1S(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0180, code lost:
    
        if (X.1JF.A0A(r301.A0K) != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1X() {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1531Akk.A1X():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1716337608);
        CustomLinearLayout customLinearLayout = new CustomLinearLayout(requireContext());
        customLinearLayout.setOrientation(1);
        AbH.A1J(customLinearLayout, -1);
        if (this.A0R) {
            LithoView A0V = 7zO.A0V(customLinearLayout.getContext());
            this.A05 = A0V;
            AbK.A1G(A0V, customLinearLayout);
        }
        LithoView A0V2 = 7zO.A0V(customLinearLayout.getContext());
        this.A0T = A0V2;
        customLinearLayout.addView(A0V2, new LinearLayout.LayoutParams(-1, -1));
        this.A06 = new C1qb(requireContext());
        customLinearLayout.setOnTouchListener(new CZL(this, 1));
        LithoView lithoView = this.A0T;
        if (lithoView != null) {
            lithoView.setImportantForAccessibility(1);
        }
        C00i c00i = this.A0Y;
        this.A0D = CMo.A01((CMo) c00i.get(), this.A09.loggingName).A01;
        ((CMo) c00i.get()).A02(this.A09.loggingName, true);
        0FI.A08(-896070738, A02);
        return customLinearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1695809124);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        C00i c00i = this.A03;
        if (c00i != null) {
            ((CQU) c00i.get()).A08();
        }
        ((CMo) this.A0Y.get()).A02(this.A09.loggingName, false);
        this.A0D = null;
        this.A0E.AEC();
        Cc4 cc4 = this.A0E;
        cc4.A0N.A03();
        cc4.A0M.A03();
        cc4.A0L.A03();
        CFH cfh = cc4.A0O;
        C1qM c1qM = cfh.A00;
        if (c1qM != null) {
            ((C21N) cfh.A07.getValue()).A01(c1qM);
        }
        0FI.A08(-313278511, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1020273608);
        super/*androidx.fragment.app.Fragment*/.onPause();
        AcP acP = (AcP) 4YU.A0p(this.A04);
        String str = this.A0K;
        BP5 bp5 = this.A09;
        CHE che = this.A0F;
        ImmutableList of = (che == null || che.A01() == null) ? ImmutableList.of() : this.A0F.A01();
        CIH cih = this.A0D;
        ImmutableList of2 = cih == null ? ImmutableList.of() : cih.A01(this.A0H);
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = of2.iterator();
        while (it.hasNext()) {
            AbL.A17(builder, it);
        }
        acP.A0C(bp5, AbI.A0t(of, builder.build()), (ImmutableList) null, str);
        0FI.A08(-1124066880, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        LithoView lithoView;
        C1qb c1qb;
        super.onViewCreated(view, bundle);
        if (this.A0R && (lithoView = this.A05) != null && this.A0G != null && (c1qb = this.A06) != null) {
            C5yw A0b = 7zN.A0b(c1qb, false);
            A0b.A2f(this.A0L);
            A0b.A2b(AbK.A0h(this));
            A0b.A2Y();
            A0b.A2d(this.A0G);
            AbH.A1R(lithoView, A0b);
        }
        A1X();
        View view2 = this.mView;
        if (view2 != null) {
            MigColorScheme.A00(view2, AbK.A0h(this));
        }
        CxA.A00(this, AbJ.A0d(), 14);
    }
}
