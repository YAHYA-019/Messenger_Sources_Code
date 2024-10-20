package X;

/* renamed from: X.3xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xm.class */
public final class C03293xm implements Comparable {
    public final long A00;
    public final RunnableC03283xl A01;

    public C03293xm(RunnableC03283xl runnableC03283xl, long j) {
        this.A01 = runnableC03283xl;
        this.A00 = j;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.A00).compareTo(Long.valueOf(((C03293xm) obj).A00));
    }
}
