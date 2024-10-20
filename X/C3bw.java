package X;

/* renamed from: X.3bw, reason: invalid class name */
/* loaded from: 3bw.class */
public final class C3bw implements C2lr {
    public final EdM A00;
    public final C1tx A01;

    public C3bw(EdM edM, C1tx c1tx) {
        11T.A0F(c1tx, 1);
        this.A01 = c1tx;
        this.A00 = edM;
    }

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
        11T.A0F(c2ly, 0);
        C1tx c1tx = this.A01;
        if (c1tx.equals(null)) {
            throw AnonymousClass001.A0Q("sizeConstraints");
        }
        C1qq c1qq = c1tx.A02.A04;
        if (c1qq == null) {
            throw 1BK.A0h();
        }
        C23N A00 = C23Z.A00(null, null, c1tx, null, -1, c1qq.A00, j);
        A00.A01();
        return new C2m0(A00.A0C, A00.A09, A00);
    }
}
