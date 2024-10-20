package X;

import android.graphics.Typeface;

/* loaded from: Kjx.class */
public final class Kjx {
    public final Typeface A00;
    public final L1v A01 = new L1v(1024);
    public final JgL A02;
    public final char[] A03;

    public Kjx(Typeface typeface, JgL jgL) {
        this.A00 = typeface;
        this.A02 = jgL;
        int A03 = jgL.A03(6);
        this.A03 = new char[(A03 != 0 ? LA6.A01(jgL, A03) : 0) * 2];
        int A032 = jgL.A03(6);
        if (A032 == 0) {
            return;
        }
        int A01 = LA6.A01(jgL, A032);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A01) {
                return;
            }
            L85 l85 = new L85(this, i2);
            Character.toChars(LA6.A00(L85.A00(l85)), this.A03, i2 * 2);
            JgK A00 = L85.A00(l85);
            int A033 = A00.A03(16);
            0RZ.A05(AnonymousClass001.A1P(A033 != 0 ? LA6.A01(A00, A033) : 0), "invalid metadata codepoint length");
            L1v l1v = this.A01;
            JgK A002 = L85.A00(l85);
            int A034 = A002.A03(16);
            l1v.A00(l85, 0, (A034 != 0 ? LA6.A01(A002, A034) : 0) - 1);
            i = i2 + 1;
        }
    }
}
