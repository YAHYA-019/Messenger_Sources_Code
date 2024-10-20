package X;

/* loaded from: G61.class */
public final class G61 implements Runnable {
    public static final String __redex_internal_original_name = "VideoPrefetchFb4aMarkerStateHelper$enqueueMarkerPoint$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6Co A01;
    public final /* synthetic */ KNR A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public G61(6Co r302, KNR knr, String str, String str2, String str3, long j) {
        this.A01 = r302;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = knr;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Co.A01(this.A01, this.A02, this.A05, this.A04, this.A03, this.A00);
    }
}
