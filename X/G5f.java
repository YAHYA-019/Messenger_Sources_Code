package X;

/* loaded from: G5f.class */
public final class G5f implements Runnable {
    public static final String __redex_internal_original_name = "HeadersRequestProviderImpl$2";
    public final /* synthetic */ 5SG A00;
    public final /* synthetic */ 4Yp A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public G5f(5SG r302, 4Yp r303, String str, String str2, boolean z) {
        this.A01 = r303;
        this.A03 = str;
        this.A04 = z;
        this.A00 = r302;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((F89) this.A01.A00.get()).A00(this.A00, this.A03, this.A02, this.A04);
    }
}
