package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dzh.class */
public final class Dzh extends C1rj {
    public static final CallerContext A06 = CallerContext.A0B("CTCConfirmationBottomSheetFragmentComponentSpec");
    public static final 1Br A07;
    public static final 5Rm A08;
    public Context A00;
    public 1Im A01;
    public 1Im A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    static {
        5Rn r0 = C3s9.A04;
        A08 = new C5X0(500);
        A07 = 1Bu.A00(99485);
    }

    public Dzh() {
        super("CTCConfirmationBottomSheetComponent");
        this.A04 = false;
    }

    public static final 1LI A00(1Iw r301) {
        AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r301);
        abstractC2162Dfq.A03 = ENu.A06;
        abstractC2162Dfq.A0h(4YU.A0E(r301).getString(2131955301));
        abstractC2162Dfq.A02 = ENn.A02;
        abstractC2162Dfq.A0X(C26z.TOP, 8.0f);
        abstractC2162Dfq.A0X(C26z.HORIZONTAL, 16.0f);
        AbstractC2178Dg6.A0A(abstractC2162Dfq, r301, Dzh.class, "CTCConfirmationBottomSheetComponent", -1755229903);
        AbstractC2178Dg6.A06(abstractC2162Dfq).A2L("cancel_button_key");
        return abstractC2162Dfq.A0O(A06);
    }

    public static final 1LI A01(1Iw r301, 1Im r302) {
        String A0t = 4YU.A0t(4YU.A0E(r301), 2131955300);
        AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r301);
        abstractC2162Dfq.A03 = ENu.A02;
        abstractC2162Dfq.A0h(A0t);
        abstractC2162Dfq.A0g(3Eh.ADY);
        abstractC2162Dfq.A02 = ENn.A02;
        abstractC2162Dfq.A0X(C26z.TOP, 16.0f);
        abstractC2162Dfq.A0X(C26z.HORIZONTAL, 16.0f);
        abstractC2162Dfq.A06 = r302;
        AbstractC2178Dg6.A06(abstractC2162Dfq).A2L("call_button_key");
        return abstractC2162Dfq.A0O(A06);
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00, Boolean.valueOf(this.A04), Boolean.valueOf(this.A05), this.A03};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2cM A00;
        2cL A0O;
        QMy A0P = 4YU.A0P(r302);
        Context context = this.A00;
        1Im r0 = this.A01;
        String str = this.A03;
        boolean z = this.A05;
        if (A0P.A00) {
            boolean AZk = 1Br.A07(((EhX) 1Br.A0B(A07)).A00).AZk(36321383076217134L);
            A00 = 2cK.A00(r302);
            if (AZk) {
                A00.A2e(A01(r302, r0));
                A00.A2e(!z ? A00(r302) : null);
                if (z) {
                    A0O = 7zL.A0V(2cK.A00(r302), new 1LH());
                    A00.A2e(A0O);
                    DKG.A1F(context, A00);
                    A00.A2L("bottom_sheet");
                }
            } else {
                A00.A2e(A01(r302, r0));
                A00.A2e(A00(r302));
            }
            C2152Dfg c2152Dfg = new C2152Dfg(r302);
            String A0u = 4YU.A0u(4YU.A0E(r302), str, 2131955302);
            if (A0u == null) {
                ((ESq) c2152Dfg).A00 = true;
            }
            c2152Dfg.A05 = A0u;
            c2152Dfg.A03 = EP4.A0O;
            c2152Dfg.A0h(C26z.TOP, 8.0f);
            c2152Dfg.A0h(C26z.BOTTOM, 10.0f);
            c2152Dfg.A0h(C26z.HORIZONTAL, 16.0f);
            FAa A002 = FAa.A00();
            A002.A02();
            AbstractC2178Dg6.A0H(c2152Dfg, A002);
            AbstractC2178Dg6.A06(c2152Dfg).A2L("meta_text_key");
            A0O = c2152Dfg.A0O(A06);
            A00.A2e(A0O);
            DKG.A1F(context, A00);
            A00.A2L("bottom_sheet");
        } else {
            A00 = 2cK.A00(r302);
            A00.A2L("bottom_sheet");
            DKG.A1F(context, A00);
        }
        return A00.A00;
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        if (this.A04) {
            return null;
        }
        5Rn r0 = C3s9.A04;
        5X3 A00 = C3s9.A00(r0, "bottom_sheet");
        C2jo c2jo = C2jm.A01;
        A00.A03(c2jo);
        A00.A01(0.0f);
        5Rm r02 = A08;
        ((5X4) A00).A02 = r02;
        AnonymousClass673 anonymousClass673 = new AnonymousClass673(A00, 600);
        5X3 A002 = C3s9.A00(r0, "call_button_key");
        A002.A03(c2jo);
        A002.A02(0.0f);
        AnonymousClass673 anonymousClass6732 = new AnonymousClass673(A002, 1000);
        5X3 A003 = C3s9.A00(r0, "cancel_button_key");
        A003.A03(c2jo);
        A003.A02(0.0f);
        AnonymousClass673 anonymousClass6733 = new AnonymousClass673(A003, 1000);
        5X3 A004 = C3s9.A00(r0, "meta_text_key");
        A004.A03(c2jo);
        A004.A02(0.0f);
        AnonymousClass673 anonymousClass6734 = new AnonymousClass673(A004, 1000);
        5X3 A005 = C3s9.A00(r0, "bottom_sheet");
        A005.A03(c2jo);
        A005.A02(0.0f);
        ((5X4) A005).A02 = r02;
        return new 5XA(new C3s9[]{anonymousClass673, anonymousClass6732, anonymousClass6733, anonymousClass6734, A005});
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1755229903) {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != 1035670191) {
                return null;
            }
            1Im r0 = ((Dzh) r302.A00.A01).A01;
            11T.A0F(r0, 1);
            r0.A00(new Object());
            return null;
        }
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        1Im r05 = ((Dzh) r03).A02;
        11T.A0H(r04, r05);
        r05.A00(new Object());
        if (r04.A02 == null) {
            return null;
        }
        r04.A0G(7zR.A0N(), "updateState:CTCConfirmationBottomSheetComponent.onUpdateState");
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((QMy) r303).A00 = true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
