package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Am2, reason: case insensitive filesystem */
/* loaded from: Am2.class */
public final class C1583Am2 extends 1pK implements 2Oh {
    public static final String __redex_internal_original_name = "MessageSearchFragment";
    public Fragment A00;
    public Fragment A01;
    public FbUserSession A02;
    public 1pK A03;
    public 6Hx A04;
    public DEN A05;
    public C9Z A07;
    public L2r A08;
    public final C8o A0D = new C8o(this);
    public final C00i A0A = AbF.A0S(this, 84365);
    public final C00i A0C = AbH.A0X();
    public final C00i A0E = AbF.A0S(this, 942);
    public final C00i A0G = 1BV.A00(147892);
    public final C00i A0F = 1BV.A00(84244);
    public final C00i A0B = 1BQ.A02(83522);
    public Integer A09 = 0S2.A00;
    public Bye A06 = null;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v5 ??, still in use, count: 2, list:
          (r302v5 ??) from 0x007e: PHI (r302v1 ??) = (r302v0 ??), (r302v5 ??) binds: [B:2:0x0006, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]
          (r302v5 ?? I:X.C9Z) from 0x007b: IPUT (r302v5 ?? I:X.C9Z), (r301v0 'this' ?? I:X.Am2 A[IMMUTABLE_TYPE, THIS]) X.Am2.A07 X.C9Z
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    private X.C9Z A03() {
        /*
            r301 = this;
            r0 = r301
            X.C9Z r0 = r0.A07
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L7e
            r0 = r301
            X.00i r0 = r0.A0E
            X.1F6 r0 = X.AbF.A0P(r0)
            r303 = r0
            r0 = r301
            X.C8o r0 = r0.A0D
            r304 = r0
            r0 = r301
            X.00i r0 = r0.A0G
            java.lang.Object r0 = r0.get()
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r305 = r0
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L39
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = X.1BL.A0G(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A02 = r1
        L39:
            X.AeL r0 = new X.AeL
            r306 = r0
            r0 = r306
            r1 = r305
            r2 = r302
            r0.<init>(r1, r2)
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A02
            r307 = r0
            android.content.Context r0 = com.facebook.inject.FbInjector.A01()
            r305 = r0
            r0 = r303
            X.AbL.A0y(r0)
            X.C9Z r0 = new X.C9Z     // Catch: java.lang.Throwable -> L66
            r302 = r0
            r0 = r302
            r1 = r307
            r2 = r303
            r3 = r306
            r4 = r304
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L66
            goto L71
        L66:
            r302 = move-exception
            X.1Bn.A0K()
            r0 = r305
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r302
            throw r0
        L71:
            X.1Bn.A0K()
            r0 = r305
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r301
            r1 = r302
            r0.A07 = r1
        L7e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1583Am2.A03():X.C9Z");
    }

    public static void A06(C1583Am2 c1583Am2, Integer num) {
        6Hx r0 = c1583Am2.A04;
        if (r0 != null) {
            r0.A05(num);
        }
        Bye bye = c1583Am2.A06;
        bye.A07 = null;
        bye.A05 = null;
        bye.A01 = null;
        bye.A0B = false;
        c1583Am2.A09 = 0S2.A00;
        bye.A08 = false;
        FbFragmentActivity fbFragmentActivity = c1583Am2.A05;
        if (fbFragmentActivity != null) {
            fbFragmentActivity.finish();
        }
        L2r l2r = c1583Am2.A08;
        if (l2r != null) {
            l2r.A01();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A07(C1583Am2 c1583Am2, Integer num) {
        String A04;
        LithoView lithoView;
        C9Z c9z;
        int intValue = num.intValue();
        if (intValue == 2) {
            A04 = ((CJ1) c1583Am2.A0A.get()).A04(c1583Am2.A02, c1583Am2.A06.A01);
            lithoView = (LithoView) 7zL.A0F(c1583Am2, 2131365683);
            c9z = c1583Am2.A07;
        } else {
            if (intValue != 1) {
                return;
            }
            Bye bye = c1583Am2.A06;
            if (bye == null) {
                0fH.A0k(__redex_internal_original_name, "Unable to set up action bar for thread list when mData is null");
                return;
            } else {
                A04 = AbI.A15(c1583Am2, bye.A07, 2131965535);
                lithoView = (LithoView) 7zL.A0F(c1583Am2, 2131365683);
                c9z = c1583Am2.A03();
            }
        }
        1Iw r0 = lithoView.A09;
        boolean z = c1583Am2.A06.A08;
        AvX avX = new AvX(r0, new C1985Aye());
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E((Context) null, c9z.A00, 16979);
        C1985Aye c1985Aye = avX.A01;
        c1985Aye.A01 = migColorScheme;
        BitSet bitSet = avX.A02;
        bitSet.set(1);
        c1985Aye.A03 = A04;
        bitSet.set(2);
        c1985Aye.A02 = c9z.A0C;
        bitSet.set(3);
        c1985Aye.A04 = z;
        bitSet.set(0);
        c1985Aye.A00 = c9z.A04;
        C1rs.A02(bitSet, avX.A03);
        avX.A0J();
        lithoView.A0x(c1985Aye);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (X.1JF.A0C(r0.A05, "integrated_message_search_server") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A08(X.C1583Am2 r301, java.lang.Integer r302) {
        /*
            java.lang.Integer r0 = X.0S2.A0N
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = A09(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = r301
            X.Bye r0 = r0.A06
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2e
            r0 = r303
            java.lang.String r0 = r0.A05
            r301 = r0
            java.lang.String r0 = "integrated_message_search_server"
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = X.1JF.A0C(r0, r1)
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L32
        L2e:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L32:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1583Am2.A08(X.Am2, java.lang.Integer):boolean");
    }

    public static boolean A09(Integer num, Integer num2) {
        int i;
        int i2;
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        switch (num2.intValue()) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        return AbJ.A1U(i, i2);
    }

    public 1iF A1R() {
        return AbF.A0C(949036578942304L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        FbUserSession fbUserSession = this.A02;
        if (fbUserSession == null) {
            fbUserSession = 1BL.A0G(this);
            this.A02 = fbUserSession;
        }
        this.A02 = fbUserSession;
        AfJ A0b = this.mFragmentManager.A0b("MessageSearchDataFragment");
        A0b.getClass();
        this.A06 = A0b.A00;
        this.A04 = (6Hx) 7zN.A0m(this, this.A02, 84247);
    }

    public void CfF() {
        dismiss();
    }

    public void dismiss() {
        C8o c8o = this.A0D;
        if (c8o != null) {
            c8o.A02();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof DFl) {
            ((DFl) fragment).BOx((CMo) this.A0F.get(), this.A0D, A03());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1503242553);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542564);
        0FI.A08(-32595535, A02);
        return A08;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r301.A0D.A02() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r302) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.getItemId()
            r303 = r0
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L22
            r0 = r301
            X.C8o r0 = r0.A0D
            r305 = r0
            r0 = r305
            boolean r0 = r0.A02()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L27
        L22:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L27:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1583Am2.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A06.A03 = this.A09;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v125, types: [androidx.fragment.app.Fragment, X.Am2] */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bye bye = this.A06;
        if (bye.A07 == null) {
            0fH.A0o(__redex_internal_original_name, "MessageSearchFragment requires a search query!");
            FbFragmentActivity fbFragmentActivity = this.A05;
            if (fbFragmentActivity != null) {
                fbFragmentActivity.finish();
                return;
            }
            return;
        }
        Integer num = bye.A03;
        Integer num2 = 0S2.A00;
        if (num == num2) {
            num = bye.A09 ? 0S2.A0N : bye.A0A ? 0S2.A0C : 0S2.A01;
        }
        06Z childFragmentManager = getChildFragmentManager();
        this.A01 = childFragmentManager.A0b("message_search_thread_list_fragment");
        this.A00 = childFragmentManager.A0b("message_search_thread_message_list_fragment");
        this.A03 = childFragmentManager.A0b("message_search_context_thread_view_fragment");
        C06c A0G = 7zL.A0G(childFragmentManager);
        Fragment fragment = this.A01;
        if (fragment != null) {
            A0G.A0I(fragment);
        }
        Fragment fragment2 = this.A00;
        if (fragment2 != null) {
            A0G.A0I(fragment2);
        }
        1pK r0 = this.A03;
        if (r0 != null) {
            A0G.A0I(r0);
        }
        C06c.A00(A0G, false);
        Bye bye2 = this.A06;
        if (bye2.A07 == null) {
            num = num2;
        } else {
            if (A09(num, 0S2.A0N) && !A08(this, num) && (bye2.A01 == null || bye2.A06 == null)) {
                num = 0S2.A0C;
            }
            if (A09(num, 0S2.A0C) && bye2.A01 == null) {
                num = 0S2.A01;
            }
        }
        Integer num3 = 0S2.A01;
        if (A09(num, num3) && !A08(this, num)) {
            C8o c8o = this.A0D;
            String str = this.A06.A07;
            ?? r02 = c8o.A00;
            if (r02.isAdded()) {
                r02.A06.A07 = str;
                AmB amB = r02.A01;
                if (amB == null) {
                    amB = C1gb.A01(r02.A0C).AZk(36322280725431574L) ? new AmB() : new AmC();
                    r02.A01 = amB;
                }
                if (amB instanceof DHU) {
                    ((DHU) amB).CtZ(str);
                }
                if (r02.A09 != num3) {
                    r02.A09 = num3;
                    A07(r02, num3);
                    Fragment fragment3 = r02.A01;
                    C06c A09 = AbJ.A09((Fragment) r02);
                    A09.A0P(fragment3, "message_search_thread_list_fragment", 2131365682);
                    A09.A0V("message_search_thread_list_fragment");
                    C06c.A00(A09, false);
                }
            }
        }
        if (A09(num, 0S2.A0C) && !A08(this, num)) {
            C8o c8o2 = this.A0D;
            Bye bye3 = this.A06;
            c8o2.A01(bye3.A01, bye3.A07, bye3.A00);
        }
        if (A09(num, 0S2.A0N)) {
            C8o c8o3 = this.A0D;
            Bye bye4 = this.A06;
            c8o3.A00(bye4.A01, bye4.A02, bye4.A04, bye4.A07, bye4.A06, bye4.A0B);
        }
        View view2 = this.mView;
        if (view2 != null) {
            MigColorScheme.A00(view2, AbK.A0h(this));
        }
        CxA.A00(this, AbJ.A0d(), 17);
    }
}
