package X;

import java.util.HashSet;

/* loaded from: J7R.class */
public final class J7R extends HashSet {
    public final int A00;

    public J7R(int i) {
        GQW gqw;
        this.A00 = i;
        switch (i) {
            case 0:
                add(H9n.RGBA);
                gqw = H9n.LUM;
                break;
            case 1:
                add(GQW.A0A);
                add(GQW.A09);
                add(GQW.A04);
                add(GQW.A02);
                add(GQW.A08);
                add(GQW.A06);
                add(GQW.A05);
                gqw = GQW.A0B;
                break;
            default:
                add(GQW.A0A);
                add(GQW.A04);
                add(GQW.A08);
                add(GQW.A0C);
                add(GQW.A03);
                gqw = GQW.A07;
                break;
        }
        add(gqw);
    }
}
