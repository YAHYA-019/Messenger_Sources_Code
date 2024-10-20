package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.787, reason: invalid class name */
/* loaded from: 787.class */
public final class AnonymousClass787 extends C00q implements C00m {
    public final /* synthetic */ AnonymousClass730 $bodyAccessoryFactory;
    public final /* synthetic */ 8Kv $collapseTextParams;
    public final /* synthetic */ MigColorScheme $colorScheme;
    public final /* synthetic */ C00m $ctaHandlerProvider;
    public final /* synthetic */ 7Gi $customizedTextMessageFontSizeStrategy;
    public final /* synthetic */ C26z $customizedTextMessageVerticalPaddingEdge;
    public final /* synthetic */ boolean $disableMessageHorizontalPadding;
    public final /* synthetic */ boolean $isBackgroundForMessageTextDisabled;
    public final /* synthetic */ Integer $maxSubTitleLines;
    public final /* synthetic */ Integer $maxTitleLines;
    public final /* synthetic */ 72D $mediaRenderingConfigurationFactory;
    public final /* synthetic */ Float $profileHeaderBottomMargin;
    public final /* synthetic */ boolean $shouldEnableFaviconResizing;
    public final /* synthetic */ boolean $shouldShowEntireSubtitle;
    public final /* synthetic */ C70p $textSpannableManager;
    public final /* synthetic */ C6qu $this_standardXmaFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass787(MigColorScheme migColorScheme, 7Gi r303, C6qu c6qu, C70p c70p, 8Kv r306, AnonymousClass730 anonymousClass730, 72D r308, C26z c26z, Float f, Integer num, Integer num2, C00m c00m, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.$this_standardXmaFeature = c6qu;
        this.$ctaHandlerProvider = c00m;
        this.$colorScheme = migColorScheme;
        this.$mediaRenderingConfigurationFactory = r308;
        this.$textSpannableManager = c70p;
        this.$bodyAccessoryFactory = anonymousClass730;
        this.$shouldShowEntireSubtitle = z;
        this.$isBackgroundForMessageTextDisabled = z2;
        this.$customizedTextMessageFontSizeStrategy = r303;
        this.$customizedTextMessageVerticalPaddingEdge = c26z;
        this.$disableMessageHorizontalPadding = z3;
        this.$shouldEnableFaviconResizing = z4;
        this.$maxTitleLines = num;
        this.$maxSubTitleLines = num2;
        this.$profileHeaderBottomMargin = f;
        this.$collapseTextParams = r306;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        6yM Ad4 = ((C6qv) this.$this_standardXmaFeature.A06).Ad4();
        7Kx r0 = (7Kx) this.$ctaHandlerProvider.invoke();
        C6qv c6qv = this.$this_standardXmaFeature.A00;
        1Va Akk = c6qv.Akk();
        78B Ao5 = c6qv.Ao5();
        C6qv c6qv2 = this.$this_standardXmaFeature.A00;
        C66e AwD = c6qv2.AwD();
        boolean BAl = c6qv2.BAl();
        MigColorScheme migColorScheme = this.$colorScheme;
        72D r02 = this.$mediaRenderingConfigurationFactory;
        C70p c70p = this.$textSpannableManager;
        AnonymousClass730 anonymousClass730 = this.$bodyAccessoryFactory;
        boolean z = this.$isBackgroundForMessageTextDisabled;
        7Gi r03 = this.$customizedTextMessageFontSizeStrategy;
        C26z c26z = this.$customizedTextMessageVerticalPaddingEdge;
        boolean z2 = this.$disableMessageHorizontalPadding;
        boolean z3 = this.$shouldEnableFaviconResizing;
        Integer num = this.$maxTitleLines;
        Integer num2 = this.$maxSubTitleLines;
        return new 7LD(migColorScheme, Akk, r03, Ao5, Ad4, c70p, this.$collapseTextParams, anonymousClass730, r0, r02, AwD, c26z, this.$profileHeaderBottomMargin, num, num2, BAl, z, z2, z3);
    }
}
