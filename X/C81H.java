package X;

/* renamed from: X.81H, reason: invalid class name */
/* loaded from: 81H.class */
public final class C81H implements Runnable {
    public static final String __redex_internal_original_name = "FBMerlinImpressionManager$onImpressionAggregated$1";
    public final /* synthetic */ 81G A00;
    public final /* synthetic */ 6KI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C81H(81G r302, 6KI r303, String str, boolean z) {
        this.A00 = r302;
        this.A02 = str;
        this.A01 = r303;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        81G r0 = this.A00;
        String str = this.A02;
        AnonymousClass814 anonymousClass814 = new AnonymousClass814(r0, str);
        6KI r02 = this.A01;
        r02.A04.CUk(r02.A01, r0, anonymousClass814, str, this.A03);
    }
}
