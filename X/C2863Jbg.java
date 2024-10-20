package X;

/* renamed from: X.Jbg, reason: case insensitive filesystem */
/* loaded from: Jbg.class */
public final class C2863Jbg extends Lsl {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        Object[] objArr = this.A02;
        return new LtF(objArr[i - 2], objArr[i - 1]);
    }
}
