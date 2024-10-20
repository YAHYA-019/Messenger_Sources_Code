package X;

/* renamed from: X.172, reason: invalid class name */
/* loaded from: 172.class */
public final class AnonymousClass172 extends C0vZ {
    public long A00;
    public boolean A01;
    public final long A02;
    public final long A03 = 1;

    public AnonymousClass172(long j, long j2) {
        this.A02 = j2;
        boolean z = j > j2 ? false : true;
        this.A01 = z;
        this.A00 = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A01;
    }
}
