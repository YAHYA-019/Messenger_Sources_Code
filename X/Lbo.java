package X;

/* loaded from: Lbo.class */
public final /* synthetic */ class Lbo implements C6aq {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ byte[] A02;

    public /* synthetic */ Lbo(String str, byte[] bArr, long j) {
        this.A02 = bArr;
        this.A01 = str;
        this.A00 = j;
    }

    @Override // X.C6aq
    public final void accept(Object obj) {
        byte[] bArr = this.A02;
        String str = this.A01;
        long j = this.A00;
        6ZY r0 = 6ZY.$redex_init_class;
        ((6Vp) obj).A09.A0z.C1V(str, bArr, j);
    }
}
