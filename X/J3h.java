package X;

/* loaded from: J3h.class */
public final class J3h implements Runnable {
    public static final String __redex_internal_original_name = "ArmadilloMediaDownloader$streamingDownload$1$2$callback$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ JMA A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ byte[] A06;

    public J3h(JMA jma, String str, byte[] bArr, long j, long j2, long j3, boolean z) {
        this.A03 = jma;
        this.A04 = str;
        this.A06 = bArr;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.CO1(this.A04, this.A06, this.A00, this.A01, this.A02, this.A05);
    }
}
