package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.DarkColorScheme;
import com.facebook.msys.mca.MailboxFeature;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8v9, reason: invalid class name */
/* loaded from: 8v9.class */
public final class C8v9 extends BJB {
    public static final String __redex_internal_original_name = "MemoriesAppSettingsFragment";
    public Context A00;
    public FbUserSession A01;
    public 2Pg A02;
    public C2xd A03;
    public LithoView A04;
    public C5ww A05;
    public C5ww A06;
    public final 1Br A07 = 1Bu.A02(this, 68292);
    public final 1Br A08 = 1Bu.A02(this, 83257);
    public final 1Br A09 = 7zM.A0P();
    public final C5ww A0A = C9ye.A01(this, 58);

    public static final void A03(C8v9 c8v9, boolean z) {
        String str;
        9XE r0 = (9XE) 1Br.A0B(c8v9.A08);
        FbUserSession fbUserSession = c8v9.A01;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            r0.A00(fbUserSession, z);
            2Pg r02 = c8v9.A02;
            if (r02 != null) {
                2Pg.A05(r02.A0W(), r02, 1NK.A2a, z);
                ((9R0) 1Br.A0B(c8v9.A07)).A00 = z;
                return;
            }
            str = "notifController";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public 1iF A1R() {
        return new 1iF(1065372051377103L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = 1BM.A01(this);
    }

    public void A1c() {
        String str;
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131959406;
        By5 A00 = c9bw.A00();
        LithoView lithoView = this.A04;
        if (lithoView != null) {
            Context context = this.A00;
            if (context == null) {
                str = "context";
            } else {
                1Iw A0W = 7zL.A0W(context);
                final MigColorScheme migColorScheme = ((BJB) this).A01;
                11T.A0A(migColorScheme);
                C00i c00i = this.A07.A00;
                final boolean z = ((9R0) c00i.get()).A01;
                final boolean z2 = ((9R0) c00i.get()).A00;
                final C5ww c5ww = this.A06;
                if (c5ww == null) {
                    str = "memoriesToggleListener";
                } else {
                    final C5ww c5ww2 = this.A0A;
                    final C5ww c5ww3 = this.A05;
                    if (c5ww3 != null) {
                        lithoView.A0y(A1Z(new 1LH(c5ww, c5ww2, c5ww3, migColorScheme, z, z2) { // from class: X.8c3
                            public final C5ww A00;
                            public final C5ww A01;
                            public final C5ww A02;
                            public final MigColorScheme A03;
                            public final boolean A04;
                            public final boolean A05;

                            {
                                11T.A0F(c5ww2, 5);
                                this.A03 = migColorScheme;
                                this.A05 = z;
                                this.A04 = z2;
                                this.A02 = c5ww;
                                this.A00 = c5ww2;
                                this.A01 = c5ww3;
                            }

                            public 1LI A0s(C2k5 c2k5) {
                                boolean A1W = 7zL.A1W(c2k5);
                                MigColorScheme migColorScheme2 = this.A03;
                                int BDl = migColorScheme2.BDl();
                                Integer num = 0S2.A00;
                                2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, 7zL.A0j(BDl), 1));
                                Integer num2 = 0S2.A01;
                                2lO A0c = 7zS.A0c(4YV.A0K(7zQ.A0X(A0g, num2, 1.0f), 0S2.A04, 3yH.A04(c2k5)), num2, true);
                                C2sn A0L = 7zR.A0L(c2k5);
                                CQY A002 = 7zU.A0T().A00(A0L.AeS(), migColorScheme2);
                                String A09 = 3yH.A09(A0L, 2131959402);
                                boolean z3 = this.A05;
                                A002.A0K(this.A02, A09, z3);
                                A002.A0B(2131959404);
                                if (z3) {
                                    A002.A0K(this.A00, 3yH.A09(A0L, 2131959405), this.A04);
                                    A002.A0B(2131959403);
                                }
                                if (1pQ.A00(7zQ.A0h()).AZk(36324595714772820L)) {
                                    EL0 el0 = EL0.A03;
                                    String A092 = 3yH.A09(A0L, 2131959401);
                                    C1u3 c1u3 = C1u3.A1a;
                                    C1u4 c1u4 = C1u4.SIZE_24;
                                    C1ut c1ut = C1ut.A0B;
                                    7zP.A1S(c1u3, c1u4, c1ut);
                                    A002.A0F(new Byf(this.A01, null, new 5AM(c1u3, c1u4, c1ut, migColorScheme2, (CharSequence) null), el0, A092, "", num, null, 0L, true, A1W, A1W));
                                }
                                C8m6 A093 = A002.A09();
                                11T.A0A(A093);
                                return 7zM.A0l(A093, A0L, c2k5, A0c);
                            }
                        }, A0W, A00));
                        return;
                    }
                    str = "memoriesThreadLevelOptOutListener";
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-295179235);
        LithoView A0M = 7zR.A0M(this);
        A0M.setClickable(true);
        this.A04 = A0M;
        0FI.A08(1118873242, A02);
        return A0M;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(244412636);
        super/*X.DZJ*/.onDestroyView();
        this.A04 = null;
        0FI.A08(382051339, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(654282162);
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(1048496920, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        Window window;
        int A02 = 0FI.A02(217550647);
        super/*androidx.fragment.app.Fragment*/.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            C2yk.A00(window, ((BJB) this).A01.BDl());
            1tJ.A07(window, ((BJB) this).A01 instanceof DarkColorScheme);
            1tJ.A06(window, ((BJB) this).A01.BDl());
        }
        0FI.A08(646116314, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        Context A08 = 4YU.A08(view);
        this.A00 = A08;
        String str = "context";
        C2xd c2xd = (C2xd) 1Bn.A0E(A08, (1BY) null, 464);
        this.A03 = c2xd;
        if (c2xd == null) {
            str = "provider";
        } else {
            Context context = this.A00;
            if (context != null) {
                FbUserSession fbUserSession = this.A01;
                if (fbUserSession != null) {
                    this.A02 = c2xd.A0C(context, fbUserSession, null);
                    this.A06 = C9ye.A01(this, 59);
                    this.A05 = C9ye.A01(this, 60);
                    FbUserSession fbUserSession2 = this.A01;
                    if (fbUserSession2 != null) {
                        Context context2 = this.A00;
                        if (context2 != null) {
                            new MailboxFeature((1Uj) 1Lo.A04(context2, fbUserSession2, (1BY) null, 16686)).A00().addResultCallback(4YV.A11(this.A09), new A1d((Function1) AVD.A01(this, 43), 69));
                            9R0 r0 = (9R0) 1Br.A0B(this.A07);
                            2Pg r02 = this.A02;
                            if (r02 != null) {
                                r0.A00 = 2Pg.A0E(r02, 1NK.A2a, true);
                                A1c();
                                return;
                            }
                            str = "notifController";
                        }
                    }
                }
                str = "fbUserSession";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
