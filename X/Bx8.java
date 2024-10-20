package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;

/* loaded from: Bx8.class */
public final class Bx8 {
    public C2633Gjl A00;
    public final long A01;
    public final long A02;
    public final LiveData A03;
    public final 22I A04;
    public final LiveData A05;
    public final LiveData A06;

    public Bx8(22I r302, long j, long j2) {
        11T.A0F(r302, 1);
        this.A04 = r302;
        this.A02 = j;
        this.A01 = j2;
        6CU r0 = new 6CU(new J9o(this, 34), DDn.A00);
        this.A05 = r0;
        6CU r02 = new 6CU(new J9o(this, 35), SJC.A00);
        this.A06 = r02;
        this.A00 = new C2633Gjl();
        this.A03 = Transformations.distinctUntilChanged(BRi.A00(r02, r0, new AW5(this, 39)));
    }
}
