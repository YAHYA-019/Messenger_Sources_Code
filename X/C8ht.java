package X;

import android.content.Context;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8ht, reason: invalid class name */
/* loaded from: 8ht.class */
public final class C8ht extends 1LH {
    public final int A00;
    public final AaJ A01;
    public final 85T A02;
    public final 2ZG A03;
    public final AZM A04;
    public final MigColorScheme A05;
    public final Integer A06;

    public C8ht(AaJ aaJ, 85T r303, 2ZG r304, AZM azm, MigColorScheme migColorScheme, Integer num, int i) {
        7zT.A1W(r303, migColorScheme, aaJ, r304);
        this.A02 = r303;
        this.A05 = migColorScheme;
        this.A01 = aaJ;
        this.A03 = r304;
        this.A04 = azm;
        this.A06 = num;
        this.A00 = i;
    }

    private final C59k A01(C2k6 c2k6) {
        Context A0L = 7zP.A0L(c2k6);
        85T r0 = this.A02;
        11T.A0F(r0, 1);
        int i = 2131963185;
        if (r0.A01 == 1Kn.A05) {
            i = 2131963186;
        }
        return BXW.A00(new 9zI(c2k6, this, 5), this.A05, 1BK.A0u(A0L, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.C58p A0L(X.2VJ r302) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8ht.A0L(X.2VJ):X.58p");
    }

    public 1LI A0s(C2k5 c2k5) {
        AnonymousClass555 c59i;
        AnonymousClass544 A00;
        String str;
        11T.A0F(c2k5, 0);
        85T r0 = this.A02;
        String str2 = r0.A03;
        if (1JF.A0A(str2)) {
            return new C1rh(null, null, null, null, null, false);
        }
        2VJ r02 = (2VJ) 1Bi.A03(82490);
        Integer num = this.A06;
        Integer num2 = 0S2.A00;
        if ((num == num2 || num == 0S2.A0C) && 2VJ.A00(r02).AZk(36325201304113580L)) {
            6BC r03 = new 6BC();
            r03.A00 = Long.parseLong(r0.A06);
            r03.A02(A0L(r02));
            r03.A06(str2);
            MigColorScheme migColorScheme = this.A05;
            r03.A03(migColorScheme);
            r03.A01 = C9ye.A01(this, 53);
            final int i = 0;
            r03.A02 = new C5wx(this, i) { // from class: X.9yh
                public final int A00;
                public final Object A01;

                {
                    this.A00 = i;
                    this.A01 = this;
                }

                @Override // X.C5wx
                public boolean onLongClick(View view) {
                    C8ht c8ht = (C8ht) this.A01;
                    return c8ht.A01.C2i(c8ht.A02, c8ht.A05);
                }
            };
            r03.A07 = A01(c2k5);
            C9gn c9gn = C9gn.A00;
            Context A0K = 7zP.A0K(c2k5);
            String A002 = c9gn.A00(A0K, r0);
            if (2VJ.A00(r02).AZk(36325201303392681L) && r0.A01 == 1Kn.A03 && r0.A02 != 1Kn.A05) {
                List list = r0.A07;
                if (!list.isEmpty()) {
                    int i2 = r0.A00;
                    if (i2 > 0) {
                        str = 4YV.A0o(A0K.getResources(), i2, 2131820767);
                        11T.A0D(str);
                    } else {
                        str = " ";
                    }
                    r03.A05 = new C9yp(str, list);
                    if (num == 0S2.A0C ? !(num != num2 || this.A00 > 2yD.A00(2VJ.A00(r02), 36606676279238116L) || !2VJ.A00(r02).AZk(36325201304441262L)) : 2VJ.A00(r02).AZk(36325201304310189L)) {
                        11T.A0A(A0K);
                        int i3 = 2131963185;
                        if (r0.A01 == 1Kn.A05) {
                            i3 = 2131963186;
                        }
                        String A0u = 1BK.A0u(A0K, i3);
                        9zI r04 = new 9zI(c2k5, this, 6);
                        11T.A0F(migColorScheme, 1);
                        c59i = new C59i(r04, migColorScheme, A0u);
                    }
                    r03.A07 = c59i;
                    A00 = r03.A00();
                }
            }
            r03.A05(A002);
            c59i = num == 0S2.A0C ? A01(c2k5) : A01(c2k5);
            r03.A07 = c59i;
            A00 = r03.A00();
        } else {
            AnonymousClass557 A0p = 7zL.A0p();
            A0p.A00 = Long.parseLong(r0.A06);
            A0p.A05 = A0L(r02);
            A0p.A08(str2);
            A0p.A05(this.A05);
            C9ye.A03(A0p, this, 54);
            final int i4 = 1;
            A0p.A02 = new C5wx(this, i4) { // from class: X.9yh
                public final int A00;
                public final Object A01;

                {
                    this.A00 = i4;
                    this.A01 = this;
                }

                @Override // X.C5wx
                public boolean onLongClick(View view) {
                    C8ht c8ht = (C8ht) this.A01;
                    return c8ht.A01.C2i(c8ht.A02, c8ht.A05);
                }
            };
            7zN.A1W(A0p, A01(c2k5));
            A0p.A07(C9gn.A00.A00(7zP.A0K(c2k5), r0));
            A00 = A0p.A00();
        }
        55N A003 = 55M.A00(c2k5.A05);
        A003.A2X(A00);
        2lQ r05 = 2lO.A02;
        7zS.A1L(A003, 7zQ.A0Z((2lO) null, num2, AVC.A01(this, 2)), 0S2.A01, AVC.A01(this, 3));
        return A003.A2W();
    }
}
