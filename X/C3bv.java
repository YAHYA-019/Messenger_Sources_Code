package X;

import android.graphics.Rect;

/* renamed from: X.3bv, reason: invalid class name */
/* loaded from: 3bv.class */
public final class C3bv implements C2lr {
    @Override // X.C2lr
    public boolean BSE(C2lr c2lr) {
        11T.A0F(c2lr, 1);
        return C28q.A03(this, c2lr);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        C2lr c2lr = (C2lr) obj;
        11T.A0F(c2lr, 1);
        return C28q.A03(this, c2lr);
    }

    @Override // X.C2lr
    public C2m0 BY9(C2ly c2ly, long j) {
        int A03 = C26P.A03(j);
        int i = ((07F) ((23W) (A03 == C26P.A01(j) ? 23V.A00 : A03 == 0 ? C2jg.A00 : C39x.A00)).A01).A01;
        int A02 = C26P.A02(j);
        long A01 = C3RP.A01(i, j, ((07F) ((23W) (A02 == C26P.A00(j) ? 23V.A00 : A02 == 0 ? C2jg.A00 : C39x.A00)).A01).A01);
        return new C2m0(new Rect(0, 0, F3u.A00(A01), (int) (A01 & 4294967295L)), A01);
    }
}
