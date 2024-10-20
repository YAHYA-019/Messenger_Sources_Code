package X;

import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.functions.Function1;

/* renamed from: X.70v, reason: invalid class name */
/* loaded from: 70v.class */
public final class C70v extends C00q implements Function1 {
    public final /* synthetic */ 7Tf $attachmentPkResolver;
    public final /* synthetic */ C6yo $cacheEfficiencyHelper;
    public final /* synthetic */ boolean $enableBitmapResize;
    public final /* synthetic */ boolean $enableGifRendering;
    public final /* synthetic */ boolean $enableReuseOptimisticUri;
    public final /* synthetic */ C01i $ephemeralImagePostProcessorFactoryProvider;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ boolean $isAvatarPowerUpsEnabled;
    public final /* synthetic */ boolean $isZoomablePhotoEnabled = true;
    public final /* synthetic */ 7yP $mediaStateRepository;
    public final /* synthetic */ 5VY $mediaUploadProgressObserver;
    public final /* synthetic */ C01i $photoActionSelectedListener;
    public final /* synthetic */ boolean $photoLoadedReportEnabled;
    public final /* synthetic */ C01i $photoMessageClickHandler;
    public final /* synthetic */ 6oN $photoRetryCallback;
    public final /* synthetic */ boolean $shouldUseVitoMultiPhotoRenderer;
    public final /* synthetic */ C01i $singlePhotoOverlayFactory;
    public final /* synthetic */ C6qu $this_photoMessageFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70v(FbUserSession fbUserSession, 7yP r303, 5VY r304, 7Tf r305, C6yo c6yo, C6qu c6qu, 6oN r308, C01i c01i, C01i c01i2, C01i c01i3, C01i c01i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(1);
        this.$this_photoMessageFeature = c6qu;
        this.$photoActionSelectedListener = c01i;
        this.$photoMessageClickHandler = c01i2;
        this.$enableGifRendering = z;
        this.$shouldUseVitoMultiPhotoRenderer = z2;
        this.$photoLoadedReportEnabled = z3;
        this.$singlePhotoOverlayFactory = c01i3;
        this.$isAvatarPowerUpsEnabled = z4;
        this.$ephemeralImagePostProcessorFactoryProvider = c01i4;
        this.$photoRetryCallback = r308;
        this.$fbUserSession = fbUserSession;
        this.$enableReuseOptimisticUri = z5;
        this.$attachmentPkResolver = r305;
        this.$mediaUploadProgressObserver = r304;
        this.$cacheEfficiencyHelper = c6yo;
        this.$enableBitmapResize = z6;
        this.$mediaStateRepository = r303;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6zb c6zb = (C6zb) obj;
        11T.A0F(c6zb, 0);
        C5fw c5fw = C5fw.A0E;
        C6qu c6qu = this.$this_photoMessageFeature;
        boolean z = this.$isZoomablePhotoEnabled;
        C01i c01i = this.$photoActionSelectedListener;
        C01i c01i2 = this.$photoMessageClickHandler;
        boolean z2 = this.$enableGifRendering;
        boolean z3 = this.$shouldUseVitoMultiPhotoRenderer;
        boolean z4 = this.$photoLoadedReportEnabled;
        C01i c01i3 = this.$singlePhotoOverlayFactory;
        boolean z5 = this.$isAvatarPowerUpsEnabled;
        C01i c01i4 = this.$ephemeralImagePostProcessorFactoryProvider;
        6oN r0 = this.$photoRetryCallback;
        FbUserSession fbUserSession = this.$fbUserSession;
        boolean z6 = this.$enableReuseOptimisticUri;
        7Tf r02 = this.$attachmentPkResolver;
        c6zb.A03(c5fw, new C76z(fbUserSession, this.$mediaStateRepository, this.$mediaUploadProgressObserver, r02, this.$cacheEfficiencyHelper, c6qu, r0, c01i, c01i2, c01i3, c01i4, z, z2, z3, z4, z5, z6, this.$enableBitmapResize));
        return 04S.A00;
    }
}
