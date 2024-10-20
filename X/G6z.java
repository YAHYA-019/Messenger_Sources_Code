package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: G6z.class */
public final class G6z implements Callable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public G6z(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i2;
        this.A05 = obj3;
        this.A08 = obj2;
        this.A02 = j;
        this.A07 = obj4;
        this.A06 = obj5;
        this.A03 = obj;
        this.A01 = i;
        this.A04 = obj6;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        if (this.A00 == 0) {
            F9S f9s = F63.A04;
            F63 f63 = (F63) this.A06;
            FyG fyG = (FyG) this.A08;
            C23d A01 = f9s.A01((Context) this.A03, f63, fyG, EYU.A00(fyG), this.A01);
            FHF fhf = (FHF) this.A05;
            return EYn.A00(ELi.A03, fhf.A03((Ewt) this.A07), new AKl(0, this.A02, A01, this.A04, fhf));
        }
        F63 f632 = (F63) this.A05;
        if (f632 != null) {
            C1st c1st = (C1st) this.A08;
            long j = this.A02;
            11T.A0F(c1st, 0);
            2AS r0 = f632.A01;
            if (c1st == f632.A00 && F2G.A01(r0, j)) {
                return new F63(c1st, r0, this.A07, f632.A03);
            }
        }
        F9S f9s2 = F63.A04;
        Object obj = this.A06;
        return f9s2.A03(f9s2.A01((Context) this.A03, f632, obj, (C23e[]) this.A04, this.A01), (C1st) this.A08, this.A07, this.A02);
    }
}
