package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.71m, reason: invalid class name */
/* loaded from: 71m.class */
public final class C71m extends C00q implements Function1 {
    public final /* synthetic */ boolean $enableReuseOptimisticUri;
    public final /* synthetic */ C01i $ephemeralImagePostProcessorFactoryProvider;
    public final /* synthetic */ C01i $gestureDetector;
    public final /* synthetic */ C01i $messageLifetimeCalculator;
    public final /* synthetic */ 6oP $overlayFactory;
    public final /* synthetic */ 6oN $photoRetryCallback;
    public final /* synthetic */ boolean $shouldEnableLottieRendering;
    public final /* synthetic */ C01i $stickerMessageFactory;
    public final /* synthetic */ C6qu $this_stickerMessageFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71m(C6qu c6qu, 6oP r303, 6oN r304, C01i c01i, C01i c01i2, C01i c01i3, C01i c01i4, boolean z, boolean z2) {
        super(1);
        this.$this_stickerMessageFeature = c6qu;
        this.$ephemeralImagePostProcessorFactoryProvider = c01i;
        this.$shouldEnableLottieRendering = z;
        this.$overlayFactory = r303;
        this.$photoRetryCallback = r304;
        this.$enableReuseOptimisticUri = z2;
        this.$messageLifetimeCalculator = c01i2;
        this.$gestureDetector = c01i3;
        this.$stickerMessageFactory = c01i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6zb c6zb = (C6zb) obj;
        11T.A0F(c6zb, 0);
        c6zb.A04(C5fw.A0J, new C77f(this.$this_stickerMessageFeature, this.$overlayFactory, this.$photoRetryCallback, this.$ephemeralImagePostProcessorFactoryProvider, this.$shouldEnableLottieRendering, this.$enableReuseOptimisticUri));
        c6zb.A04(C5fw.A0K, new 83J(this.$this_stickerMessageFeature, this.$overlayFactory, this.$photoRetryCallback, this.$ephemeralImagePostProcessorFactoryProvider, this.$messageLifetimeCalculator, this.$gestureDetector, this.$stickerMessageFactory, 1));
        return 04S.A00;
    }
}
