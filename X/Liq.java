package X;

import java.util.List;

/* loaded from: Liq.class */
public final class Liq implements Comparable {
    public static final Liq A01;
    public static final Liq A02;
    public static final Liq A03;
    public static final Liq A04;
    public static final Liq A05;
    public static final Liq A06;
    public static final Liq A07;
    public static final Liq A08;
    public static final Liq A09;
    public static final Liq A0A;
    public static final Liq A0B;
    public static final Liq A0C;
    public static final Liq A0D;
    public static final Liq A0E;
    public static final Liq A0F;
    public static final Liq A0G;
    public static final Liq A0H;
    public static final Liq A0I;
    public static final List A0J;
    public final int A00;

    static {
        Liq liq = new Liq(100);
        A0B = liq;
        Liq liq2 = new Liq(200);
        A0C = liq2;
        Liq liq3 = new Liq(300);
        A0D = liq3;
        Liq liq4 = new Liq(400);
        A0E = liq4;
        Liq liq5 = new Liq(500);
        A0F = liq5;
        Liq liq6 = new Liq(600);
        A06 = liq6;
        Liq liq7 = new Liq(700);
        A0G = liq7;
        Liq liq8 = new Liq(800);
        A0H = liq8;
        Liq liq9 = new Liq(900);
        A0I = liq9;
        A0A = liq;
        A09 = liq2;
        A02 = liq3;
        A04 = liq4;
        A03 = liq5;
        A05 = liq6;
        A01 = liq7;
        A08 = liq8;
        A07 = liq9;
        A0J = C0s8.A14(liq, liq2, liq3, liq4, liq5, liq6, liq7, liq8, liq9);
    }

    public Liq(int i) {
        this.A00 = i;
        if (1 > i || i >= 1001) {
            throw 0Pz.A04("Font weight can be in range [1, 1000]. Current value: ", i);
        }
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 11T.A00(this.A00, ((Liq) obj).A00);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Liq) && this.A00 == ((Liq) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return JQz.A0p("FontWeight(weight=", this.A00);
    }
}
