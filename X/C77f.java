package X;

/* renamed from: X.77f, reason: invalid class name */
/* loaded from: 77f.class */
public final class C77f extends C00q implements C00m {
    public final /* synthetic */ boolean $enableReuseOptimisticUri;
    public final /* synthetic */ C01i $ephemeralImagePostProcessorFactoryProvider;
    public final /* synthetic */ 6oP $overlayFactory;
    public final /* synthetic */ 6oN $photoRetryCallback;
    public final /* synthetic */ boolean $shouldEnableLottieRendering;
    public final /* synthetic */ C6qu $this_stickerMessageFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77f(C6qu c6qu, 6oP r303, 6oN r304, C01i c01i, boolean z, boolean z2) {
        super(0);
        this.$this_stickerMessageFeature = c6qu;
        this.$ephemeralImagePostProcessorFactoryProvider = c01i;
        this.$shouldEnableLottieRendering = z;
        this.$overlayFactory = r303;
        this.$photoRetryCallback = r304;
        this.$enableReuseOptimisticUri = z2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C6qu c6qu = this.$this_stickerMessageFeature;
        AnonymousClass830 anonymousClass830 = new AnonymousClass830(c6qu, 1);
        C6ze c6ze = C6ze.A0R;
        C77g c77g = new C77g(c6qu, this.$overlayFactory, this.$photoRetryCallback, this.$ephemeralImagePostProcessorFactoryProvider, anonymousClass830, this.$shouldEnableLottieRendering, this.$enableReuseOptimisticUri);
        6zM r0 = 6zM.A00;
        11T.A0F(r0, 1);
        return 71C.A00(c6ze, r0, c77g);
    }
}
