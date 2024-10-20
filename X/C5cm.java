package X;

/* renamed from: X.5cm, reason: invalid class name */
/* loaded from: 5cm.class */
public final class C5cm implements Runnable {
    public static final String __redex_internal_original_name = "LegacyImageLogger$onImageLoadStatusUpdated$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 5CQ A01;
    public final /* synthetic */ 5CM A02;
    public final /* synthetic */ Integer A03;

    public C5cm(5CQ r302, 5CM r303, Integer num, long j) {
        this.A02 = r303;
        this.A01 = r302;
        this.A03 = num;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5CM.A01(this.A01, this.A02, this.A03, this.A00);
    }
}
