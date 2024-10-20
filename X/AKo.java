package X;

/* loaded from: AKo.class */
public final class AKo extends C00q implements C00m {
    public final /* synthetic */ float $contentHeightPct;
    public final /* synthetic */ C7p9 $imageBlurListener;
    public final /* synthetic */ 4gJ $imageLoadListener;
    public final /* synthetic */ 7Lm $textColorSelector;
    public final /* synthetic */ C2k5 $this_render;
    public final /* synthetic */ C8hh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKo(4gJ r302, C2k5 c2k5, C7p9 c7p9, C8hh c8hh, 7Lm r306, float f) {
        super(0);
        this.this$0 = c8hh;
        this.$this_render = c2k5;
        this.$contentHeightPct = f;
        this.$imageBlurListener = c7p9;
        this.$imageLoadListener = r302;
        this.$textColorSelector = r306;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C8hh c8hh = this.this$0;
        C2k5 c2k5 = this.$this_render;
        float f = this.$contentHeightPct;
        C7p9 c7p9 = this.$imageBlurListener;
        4gJ r0 = this.$imageLoadListener;
        7Lm r02 = this.$textColorSelector;
        5BH A01 = 5BG.A01(c2k5.AeS());
        A01.A2b(C8hh.A03);
        7zM.A1J(A01, c8hh.A01.A01);
        A01.A2Y(r0 != null ? new 4gO(r0) : null);
        A01.A0m(100.0f);
        A01.A10(100.0f);
        C07004ik A0H = 7zR.A0H();
        ((C07014il) A0H).A09 = new 6Bv(c7p9, r02, f, 0);
        C06984ii.A01(A01, A0H);
        return 7zO.A0O(A01);
    }
}
