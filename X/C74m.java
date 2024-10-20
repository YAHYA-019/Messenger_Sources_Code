package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.74m, reason: invalid class name */
/* loaded from: 74m.class */
public final class C74m implements C6zG {
    public final C6z3 A00 = C6z2.A0G;
    public final Integer A01;
    public final Iterable A02;

    public C74m(Integer num, Iterable iterable) {
        this.A02 = iterable;
        this.A01 = num;
    }

    @Override // X.C6zG
    public 1LI AMI(1LI r302, C1qb c1qb, C5j5 c5j5, 5vW r305, List list, int i) {
        11T.A0F(c1qb, 0);
        11T.A0F(c5j5, 1);
        11T.A0F(r302, 2);
        11T.A0F(r305, 3);
        11T.A0F(list, 5);
        Iterable<AnonymousClass715> iterable = this.A02;
        if (0QD.A00(iterable) != 0) {
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass715 anonymousClass715 : iterable) {
                if (anonymousClass715.BQh(r305)) {
                    arrayList.add(anonymousClass715.AdF(r302, c1qb, c5j5, r305, list, i));
                }
            }
            if (!arrayList.isEmpty()) {
                int i2 = 0;
                2cM A01 = 2cK.A01(c1qb, (String) null, 0);
                C1ro c1ro = C1ro.CENTER;
                A01.A2g(c1ro);
                int size = arrayList.size() - 1;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C0s8.A18();
                        throw 0Q8.createAndThrow();
                    }
                    A01.A2e((1LI) obj);
                    if (i2 < size) {
                        C1rq A012 = C1rg.A01(c1qb, null, 0);
                        A012.A0l(16.0f);
                        A01.A2e(A012.A00);
                    }
                    i2 = i3;
                }
                C5fv c5fv = ((5vV) r305).A00;
                boolean A03 = C5v6.A03(c5fv);
                A01.A1y(c1ro);
                A01.A24(C26z.START, A03 ? 6.0f : 12.0f);
                A01.A24(C26z.END, 12.0f);
                A01.A0k(0.0f);
                2cL r0 = A01.A00;
                return this.A01.intValue() != 0 ? new 7K3(r302, r0, c5fv) : new 8Ya(r302, r0, c5fv);
            }
        }
        C1rq A013 = C1rg.A01(c1qb, null, 0);
        A013.A2f(r302);
        return A013.A00;
    }

    @Override // X.C6zJ
    public /* bridge */ /* synthetic */ Object Am9() {
        return this.A00;
    }
}
