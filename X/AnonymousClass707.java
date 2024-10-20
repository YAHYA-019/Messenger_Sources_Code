package X;

import android.content.res.Resources;
import java.util.List;

/* renamed from: X.707, reason: invalid class name */
/* loaded from: 707.class */
public final class AnonymousClass707 implements C6zG {
    public static final AnonymousClass707 A02 = new AnonymousClass707(new AnonymousClass709(2132279327));
    public final C6z3 A00 = C6z2.A0N;
    public final C2pe A01;

    public AnonymousClass707(C2pe c2pe) {
        this.A01 = c2pe;
    }

    @Override // X.C6zG
    public 1LI AMI(1LI r302, C1qb c1qb, C5j5 c5j5, 5vW r305, List list, int i) {
        int Chq;
        11T.A0F(c1qb, 0);
        11T.A0F(r302, 2);
        11T.A0F(r305, 3);
        5vH r0 = ((5vV) r305).A01.A02;
        if (r0 == 5vH.A02 || r0 == 5vH.A05) {
            C2pe c2pe = this.A01;
            Resources resources = ((1Iw) c1qb).A0D.getResources();
            11T.A0A(resources);
            Chq = c2pe.Chq(resources);
        } else {
            Chq = 0;
        }
        2dD A00 = C2dB.A00(c1qb);
        A00.A2X(r302);
        A00.A2C(C26z.TOP, Chq);
        return A00.A2W();
    }

    @Override // X.C6zJ
    public /* bridge */ /* synthetic */ Object Am9() {
        return this.A00;
    }
}
