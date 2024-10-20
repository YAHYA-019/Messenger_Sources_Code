package X;

/* loaded from: Lbf.class */
public abstract class Lbf implements C6a9 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03 = 6aC.A03.getAndIncrement();
    public final long A04;
    public final 6Yl A05;
    public final 6DQ A06;
    public final C6aA A07;
    public final Object A08;

    public Lbf(6Yl r302, 6D7 r303, 6DQ r304, Object obj, int i, int i2, long j, long j2) {
        this.A07 = new C6aA(r303);
        this.A06 = r304;
        this.A01 = i;
        this.A05 = r302;
        this.A00 = i2;
        this.A08 = obj;
        this.A04 = j;
        this.A02 = j2;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(", Bytes Loaded: ");
        A0k.append(this.A07.A00);
        A0k.append(", Chunk Type: ");
        A0k.append(this.A01);
        AnonymousClass001.A1H(A0k);
        1BK.A1R(A0k, this.A06);
        return A0k.toString();
    }
}
