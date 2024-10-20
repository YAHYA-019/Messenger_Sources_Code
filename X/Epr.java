package X;

import java.util.List;

/* loaded from: Epr.class */
public final class Epr {
    public final 1Br A00;
    public final List A01;
    public final List A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public Epr() {
        1Br A0C = 1BK.A0C();
        this.A00 = A0C;
        this.A01 = AnonymousClass001.A0s();
        this.A02 = AnonymousClass001.A0s();
        int A00 = 2yD.A00(1Br.A07(A0C), 36597978970787687L);
        int A002 = 2yD.A00(1Br.A07(this.A00), 36597978970066782L);
        this.A03 = A002;
        int A003 = 2yD.A00(1Br.A07(this.A00), 36597978971049833L);
        this.A05 = A003;
        int A004 = 2yD.A00(1Br.A07(this.A00), 36597978971180906L);
        this.A04 = A004;
        int A005 = 2yD.A00(1Br.A07(this.A00), 36597978970656613L);
        int i = (A002 - A00) / A005;
        int i2 = (A004 - A003) / A005;
        while (A00 <= this.A03) {
            DKD.A1S(this.A01, A00);
            A00 += i;
        }
        int i3 = this.A05;
        while (true) {
            int i4 = i3;
            if (i4 > this.A04) {
                return;
            }
            DKD.A1S(this.A02, i4);
            i3 = i4 + i2;
        }
    }
}
