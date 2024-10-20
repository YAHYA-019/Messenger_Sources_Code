package X;

/* loaded from: J06.class */
public final class J06 implements Runnable {
    public static final String __redex_internal_original_name = "EncryptedMediaNetworkFetcher$fetch$attachmentCallback$1$onStreamDataAvailable$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC06954if A01;
    public final /* synthetic */ ITr A02;

    public J06(InterfaceC06954if interfaceC06954if, ITr iTr, long j) {
        this.A01 = interfaceC06954if;
        this.A02 = iTr;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.CHK(this.A02.A01, (int) this.A00);
    }
}
