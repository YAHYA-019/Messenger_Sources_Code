package X;

import java.util.List;

/* renamed from: X.701, reason: invalid class name */
/* loaded from: 701.class */
public final class AnonymousClass701 implements AnonymousClass703 {
    public final C6zf A00;
    public final 6zD A01;
    public final C01i A02;

    public AnonymousClass701(C6zf c6zf, 6zD r303, C01i c01i) {
        this.A00 = c6zf;
        this.A01 = r303;
        this.A02 = c01i;
    }

    @Override // X.AnonymousClass703
    public C6zf B77() {
        return this.A00;
    }

    @Override // X.AnonymousClass703
    public 1LI Cfc(C1qb c1qb, C5j5 c5j5, 5vW r304, List list, int i) {
        11T.A0F(c1qb, 0);
        11T.A0F(c5j5, 1);
        11T.A0F(r304, 2);
        11T.A0F(list, 4);
        C01i c01i = this.A02;
        if (c01i.isInitialized() || this.A01.BUV(r304, i)) {
            return ((AnonymousClass703) c01i.getValue()).Cfc(c1qb, c5j5, r304, list, i);
        }
        return null;
    }
}
