package X;

import com.facebook.contacts.server.FetchContactsResult;
import com.facebook.contacts.server.FetchPaymentEligibleContactsParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Apm, reason: case insensitive filesystem */
/* loaded from: Apm.class */
public final class C1680Apm extends C4r3 {
    public static final String __redex_internal_original_name = "FetchPaymentEligibleContactsMethod";
    public final CGn A00;
    public final COi A01;
    public final C00i A02;
    public final C00i A03;

    public C1680Apm() {
        super(AbI.A0G(), AbI.A0s());
        this.A01 = AbJ.A0F();
        this.A00 = (CGn) 1Bn.A0A(84597);
        this.A02 = AbH.A0a();
        this.A03 = 1BQ.A00();
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H;
        int i;
        CGn cGn;
        int i2;
        FetchPaymentEligibleContactsParams fetchPaymentEligibleContactsParams = (FetchPaymentEligibleContactsParams) obj;
        String str = fetchPaymentEligibleContactsParams.A01;
        if (1JF.A0A(str) || str.toString().length() < 1) {
            A0H = AbF.A0H(14);
            C00i c00i = this.A03;
            if (1BK.A0N(c00i).AZk(36311569075997710L)) {
                1CO r0 = (1CO) c00i.get();
                int i3 = fetchPaymentEligibleContactsParams.A00;
                i = Math.min(C1Ur.A00(r0, i3, 36593044052575253L), i3);
            } else {
                i = fetchPaymentEligibleContactsParams.A00;
            }
            A0H.A06("limit", i);
            A0H.A08("is_optimized", 1BK.A0N(c00i).AZk(36311569075932173L));
            cGn = this.A00;
            cGn.A01(A0H);
        } else {
            A0H = AbF.A0H(15);
            A0H.A03("search_constraint", str);
            C00i c00i2 = this.A03;
            if (1BK.A0N(c00i2).AZk(36311569075997710L)) {
                1CO r02 = (1CO) c00i2.get();
                int i4 = fetchPaymentEligibleContactsParams.A00;
                i2 = Math.min(C1Ur.A00(r02, i4, 36593044052575253L), i4);
            } else {
                i2 = fetchPaymentEligibleContactsParams.A00;
            }
            A0H.A06("limit", i2);
            A0H.A08("is_optimized", 1BK.A0N(c00i2).AZk(36311569075932173L));
            cGn = this.A00;
            cGn.A01(A0H);
            A0H.A02(Boolean.valueOf(C0et.A0P.equals(((C0qy) cGn.A01.get()).A02)), "is_for_messenger");
        }
        A0H.A02(cGn.A02.get(), "is_work_build");
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        Class cls;
        2JY A0B;
        int i;
        int i2;
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList build = ImmutableList.builder().build();
        String str = ((FetchPaymentEligibleContactsParams) obj).A01;
        if (1JF.A0A(str) || str.toString().length() < 1) {
            cls = 2JX.class;
            2JY A0K = AbF.A0K((2JY) obj2, cls, -16182743);
            if (A0K != null) {
                A0B = 1BK.A0B(A0K, cls, 1392614399, 1136842441);
                if (A0B != null) {
                    i = 104993457;
                    i2 = -605918492;
                    build = A0B.A0c(i, cls, i2);
                }
            }
        } else {
            cls = 2JX.class;
            2JY A0K2 = AbF.A0K((2JY) obj2, cls, 1818686360);
            if (A0K2 != null) {
                A0B = 1BK.A0B(A0K2, cls, 1392614399, 1575413731);
                if (A0B != null) {
                    i = 104993457;
                    i2 = -1178308548;
                    build = A0B.A0c(i, cls, i2);
                }
            }
        }
        for (int i3 = 0; i3 < build.size(); i3++) {
            COi.A02(this.A01, AbG.A0E(build, i3), builder);
        }
        ImmutableList build2 = builder.build();
        0fH.A07(C1680Apm.class, build2, "Got result: %s");
        return new FetchContactsResult(EnumC08284mf.A06, build2, null, 1BL.A08(this.A02));
    }
}
