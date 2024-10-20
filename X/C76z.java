package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.76z, reason: invalid class name */
/* loaded from: 76z.class */
public final class C76z extends C00q implements C00m {
    public final /* synthetic */ 7Tf $attachmentPkResolver;
    public final /* synthetic */ C6yo $cacheEfficiencyHelper;
    public final /* synthetic */ boolean $enableBitmapResize;
    public final /* synthetic */ boolean $enableGifRendering;
    public final /* synthetic */ boolean $enableReuseOptimisticUri;
    public final /* synthetic */ C01i $ephemeralImagePostProcessorFactoryProvider;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ boolean $isAvatarPowerUpsEnabled;
    public final /* synthetic */ boolean $isZoomablePhotoEnabled;
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
    public C76z(FbUserSession fbUserSession, 7yP r303, 5VY r304, 7Tf r305, C6yo c6yo, C6qu c6qu, 6oN r308, C01i c01i, C01i c01i2, C01i c01i3, C01i c01i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(0);
        this.$this_photoMessageFeature = c6qu;
        this.$isZoomablePhotoEnabled = z;
        this.$photoActionSelectedListener = c01i;
        this.$photoMessageClickHandler = c01i2;
        this.$enableGifRendering = z2;
        this.$shouldUseVitoMultiPhotoRenderer = z3;
        this.$photoLoadedReportEnabled = z4;
        this.$singlePhotoOverlayFactory = c01i3;
        this.$isAvatarPowerUpsEnabled = z5;
        this.$ephemeralImagePostProcessorFactoryProvider = c01i4;
        this.$photoRetryCallback = r308;
        this.$fbUserSession = fbUserSession;
        this.$enableReuseOptimisticUri = z6;
        this.$attachmentPkResolver = r305;
        this.$mediaUploadProgressObserver = r304;
        this.$cacheEfficiencyHelper = c6yo;
        this.$enableBitmapResize = z7;
        this.$mediaStateRepository = r303;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v135, types: [X.6zD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.6zD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.6zD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.6zD] */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        83H r302;
        C6qu c6qu = this.$this_photoMessageFeature;
        boolean z = this.$isZoomablePhotoEnabled;
        C01i c01i = this.$photoActionSelectedListener;
        11T.A0F(c6qu, 0);
        11T.A0F(c01i, 2);
        C01i A00 = C01g.A00(C03i.A03, new 84Q(10, c6qu, c01i, z));
        Context AWp = this.$this_photoMessageFeature.A00.AWp();
        74E r0 = (74E) this.$photoMessageClickHandler.getValue();
        C01i Awt = this.$this_photoMessageFeature.A00.Awt();
        AnonymousClass701 anonymousClass701 = null;
        AnonymousClass771 anonymousClass771 = new AnonymousClass771(AWp, r0, null, Awt != null ? (C75c) Awt.getValue() : null, false, false);
        boolean z2 = this.$photoLoadedReportEnabled;
        C6qu c6qu2 = this.$this_photoMessageFeature;
        AnonymousClass776 anonymousClass776 = new AnonymousClass776(c6qu2, z2);
        if (this.$enableGifRendering) {
            anonymousClass701 = 71C.A00(C6ze.A09, (6zD) new Object(), new 83A(this.$singlePhotoOverlayFactory, c6qu2, 36));
        }
        AnonymousClass701 A002 = 71C.A00(C6ze.A0L, (6zD) new Object(), new AnonymousClass838(1, this.$this_photoMessageFeature, this.$isAvatarPowerUpsEnabled));
        C6ze c6ze = C6ze.A0N;
        ?? obj2 = new Object();
        C6qu c6qu3 = this.$this_photoMessageFeature;
        C01i c01i2 = this.$ephemeralImagePostProcessorFactoryProvider;
        C01i c01i3 = this.$singlePhotoOverlayFactory;
        AnonymousClass701 A003 = 71C.A00(c6ze, (6zD) obj2, new 77C(this.$fbUserSession, this.$mediaStateRepository, this.$mediaUploadProgressObserver, this.$attachmentPkResolver, this.$cacheEfficiencyHelper, anonymousClass771, c6qu3, this.$photoRetryCallback, c01i2, c01i3, anonymousClass776, this.$enableReuseOptimisticUri, this.$enableBitmapResize));
        boolean z3 = this.$shouldUseVitoMultiPhotoRenderer;
        C6ze c6ze2 = C6ze.A0H;
        if (z3) {
            obj = new Object();
            r302 = new 83H(1, this.$cacheEfficiencyHelper, this.$this_photoMessageFeature, anonymousClass771, this.$ephemeralImagePostProcessorFactoryProvider);
        } else {
            obj = new Object();
            r302 = new 83G(1, this.$ephemeralImagePostProcessorFactoryProvider, A00, this.$this_photoMessageFeature);
        }
        AnonymousClass701[] anonymousClass701Arr = {anonymousClass701, A002, A003, 71C.A00(c6ze2, obj, (C00m) r302)};
        11T.A0F(anonymousClass701Arr, 0);
        return 02L.A08(anonymousClass701Arr);
    }
}
