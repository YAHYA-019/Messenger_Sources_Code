package X;

/* renamed from: X.Jbj, reason: case insensitive filesystem */
/* loaded from: Jbj.class */
public final class C2866Jbj extends Lsl {
    public final Lsm A00;

    public C2866Jbj(Lsm lsm) {
        this.A00 = lsm;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        Lsm lsm = this.A00;
        Object[] objArr = this.A02;
        return new JbX(lsm, objArr[i - 2], objArr[i - 1]);
    }
}
