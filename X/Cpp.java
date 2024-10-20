package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Cpp.class */
public final class Cpp implements DFd {
    public final int A00;
    public final Object A01;

    public Cpp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.DFd
    public /* bridge */ /* synthetic */ void C4p(Object obj, boolean z) {
        boolean z2;
        C1529Aki c1529Aki;
        switch (this.A00) {
            case 0:
                if (z) {
                    return;
                }
                AlB alB = (AlB) this.A01;
                if (alB.A02) {
                    return;
                }
                ((C4c) 1Br.A0B(alB.A08)).A00(alB.A05, null, true);
                return;
            case 1:
                if (z) {
                    Bxx bxx = (Bxx) this.A01;
                    bxx.A03.A00(bxx.A01);
                    return;
                }
                return;
            case 2:
            case 5:
            default:
                return;
            case 3:
                C6Q c6q = (C6Q) this.A01;
                c6q.A05.C9A(c6q.A00, z);
                C1320Ady c1320Ady = c6q.A09;
                synchronized (c1320Ady) {
                    z2 = c1320Ady.A07;
                }
                c6q.A01 = z2;
                return;
            case 4:
                boolean z3 = !z;
                AlE alE = ((AlH) this.A01).A0D;
                if (alE != null) {
                    alE.A1a(z3);
                    return;
                }
                return;
            case 6:
                if (z) {
                    CFe.A00(BLQ.A03, (CFe) this.A01);
                    return;
                }
                return;
            case 7:
                if (z) {
                    return;
                }
                Byt byt = (Byt) this.A01;
                if (byt.A06) {
                    return;
                }
                C1548Al1.A03(byt.A08, byt.A0D, ImmutableList.of(), true);
                return;
            case 8:
                if (z) {
                    return;
                }
                C6G c6g = (C6G) this.A01;
                if (c6g.A03 || (c1529Aki = c6g.A01) == null) {
                    return;
                }
                C0ty c0ty = C0ty.A00;
                11T.A0F(c0ty, 1);
                ((C5D) c1529Aki.A06.getValue()).A00(c0ty, true);
                return;
        }
    }
}
