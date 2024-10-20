package X;

import android.view.View;
import java.util.List;

/* renamed from: X.9px, reason: invalid class name */
/* loaded from: 9px.class */
public final class C9px implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public C9px(C8fx c8fx, String str, int i) {
        this.A00 = 9;
        this.A02 = c8fx;
        this.A03 = str;
        this.A01 = i;
    }

    public C9px(C1308Adl c1308Adl, String str, int i, int i2) {
        this.A00 = i2;
        if (i2 != 0) {
            this.A02 = c1308Adl;
            this.A03 = str;
            this.A01 = i;
        } else {
            this.A02 = c1308Adl;
            this.A03 = str;
            this.A01 = i;
        }
    }

    public static DIT A00(C9px c9px) {
        return (DIT) ((C1308Adl) c9px.A02).A0G.get();
    }

    public static void A01(DIT dit, BP5 bp5, C9px c9px) {
        dit.CWC(bp5, Integer.valueOf(c9px.A01), "", c9px.A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v117, types: [X.5fq, X.5qu] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                C1308Adl c1308Adl = (C1308Adl) this.A02;
                String str = this.A03;
                int i2 = this.A01;
                DIT dit = (DIT) c1308Adl.A0G.get();
                if (dit != null) {
                    dit.CWC(BP5.A02, Integer.valueOf(i2), "", str);
                    return;
                }
                return;
            case 1:
                A05 = 0FI.A05(323167435);
                DIT A00 = A00(this);
                if (A00 != null) {
                    A01(A00, BP5.A0a, this);
                }
                i = 1164247248;
                0FI.A0B(i, A05);
                return;
            case 2:
                A05 = 0FI.A05(-719771996);
                DIT A002 = A00(this);
                if (A002 != null) {
                    A002.CWC(BP5.A07, Integer.valueOf(this.A01), "", this.A03);
                }
                i = -1751559449;
                0FI.A0B(i, A05);
                return;
            case 3:
                A05 = 0FI.A05(694290602);
                DIT A003 = A00(this);
                if (A003 != null) {
                    A01(A003, BP5.A0b, this);
                }
                i = -1282108998;
                0FI.A0B(i, A05);
                return;
            case 4:
                A05 = 0FI.A05(1324227493);
                DIT A004 = A00(this);
                if (A004 != null) {
                    A01(A004, BP5.A0C, this);
                }
                i = -460586749;
                0FI.A0B(i, A05);
                return;
            case 5:
                A05 = 0FI.A05(993394245);
                DIT A005 = A00(this);
                if (A005 != null) {
                    A01(A005, BP5.A0A, this);
                }
                i = 440103100;
                0FI.A0B(i, A05);
                return;
            case 6:
                A05 = 0FI.A05(-1816376416);
                DIT A006 = A00(this);
                if (A006 != null) {
                    A01(A006, BP5.A0B, this);
                }
                i = 1104962590;
                0FI.A0B(i, A05);
                return;
            case 7:
                A05 = 0FI.A05(-1403599241);
                DIT A007 = A00(this);
                if (A007 != null) {
                    A01(A007, BP5.A0W, this);
                }
                i = -468177084;
                0FI.A0B(i, A05);
                return;
            case 8:
                A05 = 0FI.A05(909280455);
                DIT A008 = A00(this);
                if (A008 != null) {
                    A01(A008, BP5.A0K, this);
                }
                i = 205032163;
                0FI.A0B(i, A05);
                return;
            default:
                A05 = 0FI.A05(-1450170994);
                C8fx c8fx = (C8fx) this.A02;
                List list = C8fx.A04;
                2Of r0 = c8fx.A00;
                String str2 = this.A03;
                Integer valueOf = Integer.valueOf(this.A01);
                11T.A0F(str2, 0);
                r0.AQN(new A5n(valueOf));
                ?? c5fq = new C5fq();
                c5fq.A02 = str2;
                c5fq.A0B = 4YU.A0s();
                r0.AQN(new 7Ad((C5fq) c5fq, "composer_text_tab", (String) null));
                i = -382106678;
                0FI.A0B(i, A05);
                return;
        }
    }
}
