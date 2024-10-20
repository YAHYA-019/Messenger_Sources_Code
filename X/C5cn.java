package X;

/* renamed from: X.5cn, reason: invalid class name */
/* loaded from: 5cn.class */
public final class C5cn implements Runnable {
    public static final String __redex_internal_original_name = "LegacyImageLogger$onImageVisibilityUpdated$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 5CQ A01;
    public final /* synthetic */ 5CM A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C5cn(5CQ r302, 5CM r303, Integer num, Long l, String str, String str2, String str3, int i) {
        this.A02 = r303;
        this.A01 = r302;
        this.A00 = i;
        this.A03 = num;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A04 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5CM r0 = this.A02;
        5CQ r02 = this.A01;
        int i = this.A00;
        5CM.A02(r02, r0, this.A03, this.A04, this.A05, this.A07, this.A06, i);
    }
}
