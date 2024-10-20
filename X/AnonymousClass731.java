package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.731, reason: invalid class name */
/* loaded from: 731.class */
public final class AnonymousClass731 extends C00q implements Function1 {
    public final /* synthetic */ AnonymousClass730 $bodyAccessoryFactory;
    public final /* synthetic */ MigColorScheme $colorScheme;
    public final /* synthetic */ C00m $ctaHandlerProvider;
    public final /* synthetic */ 72D $mediaRenderingConfigurationFactory;
    public final /* synthetic */ boolean $shouldEnableFaviconResizing;
    public final /* synthetic */ boolean $shouldShowEntireSubtitle;
    public final /* synthetic */ C70p $textSpannableManager;
    public final /* synthetic */ C6qu $this_standardXmaFeature;
    public final /* synthetic */ boolean $isBackgroundForMessageTextDisabled = false;
    public final /* synthetic */ 7Gi $customizedTextMessageFontSizeStrategy = null;
    public final /* synthetic */ C26z $customizedTextMessageVerticalPaddingEdge = null;
    public final /* synthetic */ boolean $disableMessageHorizontalPadding = false;
    public final /* synthetic */ Integer $maxTitleLines = null;
    public final /* synthetic */ Integer $maxSubTitleLines = null;
    public final /* synthetic */ Float $profileHeaderBottomMargin = null;
    public final /* synthetic */ 8Kv $collapseTextParams = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass731(MigColorScheme migColorScheme, C6qu c6qu, C70p c70p, AnonymousClass730 anonymousClass730, 72D r306, C00m c00m, boolean z, boolean z2) {
        super(1);
        this.$this_standardXmaFeature = c6qu;
        this.$ctaHandlerProvider = c00m;
        this.$colorScheme = migColorScheme;
        this.$mediaRenderingConfigurationFactory = r306;
        this.$textSpannableManager = c70p;
        this.$bodyAccessoryFactory = anonymousClass730;
        this.$shouldShowEntireSubtitle = z;
        this.$shouldEnableFaviconResizing = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6zb c6zb = (C6zb) obj;
        11T.A0F(c6zb, 0);
        C5fw c5fw = C5fw.A0S;
        C6qu c6qu = this.$this_standardXmaFeature;
        C6ze c6ze = C6ze.A0h;
        C00m c00m = this.$ctaHandlerProvider;
        MigColorScheme migColorScheme = this.$colorScheme;
        72D r0 = this.$mediaRenderingConfigurationFactory;
        C70p c70p = this.$textSpannableManager;
        AnonymousClass730 anonymousClass730 = this.$bodyAccessoryFactory;
        boolean z = this.$shouldShowEntireSubtitle;
        boolean z2 = this.$isBackgroundForMessageTextDisabled;
        7Gi r02 = this.$customizedTextMessageFontSizeStrategy;
        C26z c26z = this.$customizedTextMessageVerticalPaddingEdge;
        boolean z3 = this.$disableMessageHorizontalPadding;
        boolean z4 = this.$shouldEnableFaviconResizing;
        Integer num = this.$maxTitleLines;
        Integer num2 = this.$maxSubTitleLines;
        AnonymousClass787 anonymousClass787 = new AnonymousClass787(migColorScheme, r02, c6qu, c70p, this.$collapseTextParams, anonymousClass730, r0, c26z, this.$profileHeaderBottomMargin, num, num2, c00m, z, z2, z3, z4);
        6zM r03 = 6zM.A00;
        11T.A0F(r03, 1);
        c6zb.A00(c5fw, 71C.A00(c6ze, r03, anonymousClass787), new AnonymousClass703[0]);
        return 04S.A00;
    }
}
