package X;

/* loaded from: AKy.class */
public final class AKy extends C00q implements C00m {
    public final /* synthetic */ C1rn[] $cardTranslationYInPxs;
    public final /* synthetic */ C1rn[] $cardVisibilityPercentages;
    public final /* synthetic */ C2lh $firstVisibleItemPosition;
    public final /* synthetic */ C5it $framePerformanceLogger;
    public final /* synthetic */ 1Br $quickPerformanceLogger$delegate;
    public final /* synthetic */ 4NU $recyclerViewRef;
    public final /* synthetic */ Jtz $snapHelper;
    public final /* synthetic */ float $statusBarHeightInPx;
    public final /* synthetic */ C2k5 $this_render;
    public final /* synthetic */ C8i2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKy(C5it c5it, 1Br r303, C2k5 c2k5, 4NU r305, C2lh c2lh, Jtz jtz, C8i2 c8i2, C1rn[] c1rnArr, C1rn[] c1rnArr2, float f) {
        super(0);
        this.this$0 = c8i2;
        this.$recyclerViewRef = r305;
        this.$snapHelper = jtz;
        this.$framePerformanceLogger = c5it;
        this.$firstVisibleItemPosition = c2lh;
        this.$quickPerformanceLogger$delegate = r303;
        this.$cardVisibilityPercentages = c1rnArr;
        this.$cardTranslationYInPxs = c1rnArr2;
        this.$statusBarHeightInPx = f;
        this.$this_render = c2k5;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C8i2 c8i2 = this.this$0;
        long j = C8i2.A0D;
        9cG r0 = c8i2.A03;
        4NU r02 = this.$recyclerViewRef;
        Jtz jtz = this.$snapHelper;
        C5it c5it = this.$framePerformanceLogger;
        C2lh c2lh = this.$firstVisibleItemPosition;
        ARi aRi = new ARi(c5it, this.$quickPerformanceLogger$delegate, this.$this_render, r02, c2lh, jtz, c8i2, this.$cardVisibilityPercentages, this.$cardTranslationYInPxs, this.$statusBarHeightInPx);
        C2ky c2ky = r0.A01;
        if (c2ky != null) {
            c2ky.A01 = new C9t2(aRi);
        }
        return 7zL.A0T(AQg.A00(jtz, r02, 26));
    }
}
