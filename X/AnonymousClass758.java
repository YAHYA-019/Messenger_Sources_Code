package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.758, reason: invalid class name */
/* loaded from: 758.class */
public final class AnonymousClass758 implements C6zG {
    public final C6z3 A00 = C6z2.A0y;
    public final 6yJ A01;
    public final AnonymousClass750 A02;

    public AnonymousClass758(6yJ r302, AnonymousClass750 anonymousClass750) {
        this.A02 = anonymousClass750;
        if (r302 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = r302;
    }

    @Override // X.C6zG
    public 1LI AMI(1LI r302, C1qb c1qb, C5j5 c5j5, 5vW r305, List list, int i) {
        11T.A0F(c1qb, 0);
        11T.A0F(c5j5, 1);
        11T.A0F(r302, 2);
        11T.A0F(r305, 3);
        11T.A0F(list, 5);
        long j = ((C5fu) ((5vV) r305).A00).A02;
        6yJ r0 = this.A01;
        Context context = ((1Iw) c1qb).A0D;
        11T.A0A(context);
        return new 7J1(r302, r0.BDv(context), j, this.A02.Cyk(r305, list, i));
    }

    @Override // X.C6zJ
    public /* bridge */ /* synthetic */ Object Am9() {
        return this.A00;
    }
}
