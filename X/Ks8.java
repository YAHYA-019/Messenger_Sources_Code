package X;

import java.util.List;
import java.util.Locale;

/* loaded from: Ks8.class */
public final class Ks8 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final L4k A09;
    public final C3114Jjl A0A;
    public final C3120Jjr A0B;
    public final Kk1 A0C;
    public final LSd A0D;
    public final Ke2 A0E;
    public final Kkq A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final String A0J;
    public final String A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;

    public Ks8(L4k l4k, C3114Jjl c3114Jjl, C3120Jjr c3120Jjr, Kk1 kk1, LSd lSd, Ke2 ke2, Kkq kkq, Integer num, Integer num2, Integer num3, String str, String str2, List list, List list2, List list3, float f, float f2, float f3, float f4, int i, int i2, int i3, long j, long j2, boolean z) {
        this.A0N = list;
        this.A09 = l4k;
        this.A0J = str;
        this.A07 = j;
        this.A0H = num;
        this.A08 = j2;
        this.A0K = str2;
        this.A0M = list2;
        this.A0D = lSd;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A0B = c3120Jjr;
        this.A0C = kk1;
        this.A0L = list3;
        this.A0I = num2;
        this.A0A = c3114Jjl;
        this.A0O = z;
        this.A0E = ke2;
        this.A0F = kkq;
        this.A0G = num3;
    }

    public String A00(String str) {
        int i;
        StringBuilder A0n = AnonymousClass001.A0n(str);
        A0n.append(this.A0J);
        A0n.append("\n");
        L4k l4k = this.A09;
        Ks8 ks8 = (Ks8) l4k.A06.A05(this.A08);
        if (ks8 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                A0n.append(str2);
                A0n.append(ks8.A0J);
                ks8 = (Ks8) l4k.A06.A05(ks8.A08);
                if (ks8 == null) {
                    break;
                }
                str2 = "->";
            }
            A0n.append(str);
            A0n.append("\n");
        }
        List list = this.A0M;
        if (!list.isEmpty()) {
            A0n.append(str);
            A0n.append("\tMasks: ");
            A0n.append(list.size());
            A0n.append("\n");
        }
        int i2 = this.A06;
        if (i2 != 0 && (i = this.A05) != 0) {
            A0n.append(str);
            A0n.append("\tBackground: ");
            A0n.append(String.format(Locale.US, "%dx%d %X\n", 1BK.A1a(Integer.valueOf(i2), Integer.valueOf(i), this.A04)));
        }
        List list2 = this.A0N;
        if (!list2.isEmpty()) {
            A0n.append(str);
            A0n.append("\tShapes:\n");
            for (Object obj : list2) {
                A0n.append(str);
                JR0.A1D(obj, "\t\t", "\n", A0n);
            }
        }
        return A0n.toString();
    }

    public String toString() {
        return A00("");
    }
}
