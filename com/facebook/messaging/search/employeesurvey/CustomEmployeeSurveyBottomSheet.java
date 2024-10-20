package com.facebook.messaging.search.employeesurvey;

import X.11T;
import X.1Fj;
import X.1Iw;
import X.1LI;
import X.1cU;
import X.2XL;
import X.2XO;
import X.2cK;
import X.2cM;
import X.2kW;
import X.2kZ;
import X.4YU;
import X.55S;
import X.5A0;
import X.5AM;
import X.7zL;
import X.7zM;
import X.7zP;
import X.8Do;
import X.8OH;
import X.9De;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.AnonymousClass553;
import X.AnonymousClass557;
import X.C02A;
import X.C1u3;
import X.C1u4;
import X.C1ut;
import X.C2ke;
import X.C2kk;
import X.C37s;
import X.C57i;
import X.C8m6;
import X.CJ4;
import X.CYa;
import X.Cvm;
import X.Cx1;
import X.Cx2;
import X.QAQ;
import X.RGD;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: CustomEmployeeSurveyBottomSheet.class */
public final class CustomEmployeeSurveyBottomSheet extends MigBottomSheetDialogFragment {
    public RGD A01;
    public QAQ A02;
    public final List A09 = AnonymousClass001.A0s();
    public List A05 = AnonymousClass001.A0s();
    public int A00 = 1;
    public String A04 = "";
    public String A03 = "";
    public final List A08 = 11T.A03(new CYa(this, 12));
    public final List A07 = 11T.A03(new CYa(this, 11));
    public final AnonymousClass553 A06 = Cx1.A01(this, 36);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(90);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        8OH A00 = C8m6.A00(r302);
        A00.A0R();
        A1F();
        ImmutableList.Builder builder = ImmutableList.builder();
        AnonymousClass557 A0p = 7zL.A0p();
        A0p.A00 = 0L;
        A0p.A08(r302.A0D(2131955338));
        A0p.A07(r302.A0D(2131955339));
        AbJ.A1S(A0p, A1F(), builder);
        Iterator it = this.A05.iterator();
        while (true) {
            5AM r315 = null;
            if (!it.hasNext()) {
                break;
            }
            QAQ qaq = (QAQ) it.next();
            CJ4 cj4 = new CJ4();
            cj4.A00 = qaq.A01 + 1;
            cj4.A04(qaq.A02);
            if (qaq.A00) {
                this.A02 = qaq;
                C1u3 c1u3 = C1u3.A1U;
                C1u4 c1u4 = C1u4.SIZE_32;
                C1ut c1ut = C1ut.A02;
                MigColorScheme A1F = A1F();
                7zP.A1S(c1u3, c1u4, c1ut);
                A1F.getClass();
                r315 = new 5AM(c1u3, c1u4, c1ut, A1F, (CharSequence) null);
            }
            cj4.A05 = r315;
            cj4.A01 = new Cvm(this, qaq, 33);
            builder.m11011add((Object) cj4.A01());
        }
        AnonymousClass557 A0p2 = 7zL.A0p();
        A0p2.A00 = 0L;
        A0p2.A08(r302.A0D(2131955336));
        A0p2.A07(r302.A0D(2131955337));
        AbJ.A1S(A0p2, A1F(), builder);
        for (QAQ qaq2 : this.A09) {
            CJ4 cj42 = new CJ4();
            cj42.A00 = qaq2.A01 + 1;
            cj42.A04(qaq2.A02);
            cj42.A05 = 5A0.A00(new Cx2(this, qaq2, 2), (MigColorScheme) null, qaq2.A00);
            cj42.A01 = new Cvm(this, qaq2, 34);
            builder.m11011add((Object) cj42.A01());
        }
        AnonymousClass557 A0p3 = 7zL.A0p();
        A0p3.A00 = 0L;
        A0p3.A08(r302.A0D(2131955336));
        A0p3.A07(r302.A0D(2131955337));
        AbJ.A1S(A0p3, A1F(), builder);
        long size = r0.size() + 2;
        MigColorScheme A1F2 = A1F();
        11T.A0F(A1F2, 0);
        int i = (-1) >>> 1;
        builder.m11011add((Object) new 55S(A1F2, r302.A0D(2131955335), "", (List) null, this.A08, 0.0f, i, 200, 1, size, true));
        long size2 = r0.size() + 3;
        MigColorScheme A1F3 = A1F();
        11T.A0F(A1F3, 0);
        builder.m11011add((Object) new 55S(A1F3, r302.A0D(2131955334), "", (List) null, this.A07, 0.0f, i, 200, 1, size2, true));
        builder.m11011add((Object) new C57i(this.A06, A1F(), r302.A0D(2131955340), true, false));
        ImmutableList A012 = 1Fj.A01(builder);
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator it2 = A012.iterator();
        while (it2.hasNext()) {
            AbH.A1V(A0h, it2);
        }
        A00.A2W(1Fj.A01(A0h));
        A00.A01.A03 = true;
        2kW r0 = new 2kW();
        r0.A01 = 1;
        r0.A07 = new 2kZ(new 2XL((C02A) null, (C2kk) null, (2XO) null, (Boolean) null, (Integer) null, 2.0f, 0, 0, false, false, false, false, false, true), (1cU) null, (Integer) null, false, false);
        C2ke A002 = r0.A00();
        C8m6 c8m6 = A00.A01;
        c8m6.A01 = A002;
        c8m6.A00 = new 8Do(this);
        A00.A0J();
        A01.A2e(A00.A01);
        7zM.A1O(A01, A1F());
        return A01.A00;
    }
}
