package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AL0.class */
public final class AL0 extends C00q implements C00m {
    public final /* synthetic */ 8Kv $collapseTextParams;
    public final /* synthetic */ 7Gi $customizedTextMessageFontSizeStrategy;
    public final /* synthetic */ boolean $disableAuthorMessageHorizontalPadding;
    public final /* synthetic */ boolean $disableAuthorMessageMinHeight;
    public final /* synthetic */ boolean $disableAuthorMessageVerticalPadding;
    public final /* synthetic */ boolean $disableMessageHorizontalPadding;
    public final /* synthetic */ boolean $disableMinimallyWide;
    public final /* synthetic */ boolean $disableUserMessageBottomPadding;
    public final /* synthetic */ boolean $isFullWidthWithoutMargin;
    public final /* synthetic */ C26z $otherUserMessageVerticalPaddingEdge;
    public final /* synthetic */ boolean $shouldFullWidthAiBotMessage;
    public final /* synthetic */ boolean $shouldRenderAuthorMessageBold;
    public final /* synthetic */ C6qu $this_aiBotTextMessageFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AL0(7Gi r302, C6qu c6qu, 8Kv r304, C26z c26z, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        super(0);
        this.$this_aiBotTextMessageFeature = c6qu;
        this.$customizedTextMessageFontSizeStrategy = r302;
        this.$shouldFullWidthAiBotMessage = z;
        this.$isFullWidthWithoutMargin = z2;
        this.$shouldRenderAuthorMessageBold = z3;
        this.$disableAuthorMessageVerticalPadding = z4;
        this.$disableMessageHorizontalPadding = z5;
        this.$disableAuthorMessageHorizontalPadding = z6;
        this.$disableAuthorMessageMinHeight = z7;
        this.$disableUserMessageBottomPadding = z8;
        this.$otherUserMessageVerticalPaddingEdge = c26z;
        this.$disableMinimallyWide = z9;
        this.$collapseTextParams = r304;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C6qu c6qu = this.$this_aiBotTextMessageFeature;
        6yM Ad4 = c6qu.Ad4();
        C72k c72k = new C72k(c6qu.A09);
        7Gh r306 = this.$customizedTextMessageFontSizeStrategy;
        if (r306 == null) {
            r306 = new 7Gh((7Gi) null, (DefaultConstructorMarker) null, 1);
        }
        boolean z = this.$shouldFullWidthAiBotMessage;
        boolean z2 = this.$isFullWidthWithoutMargin;
        boolean z3 = this.$shouldRenderAuthorMessageBold;
        boolean z4 = this.$disableAuthorMessageVerticalPadding;
        boolean z5 = this.$disableMessageHorizontalPadding;
        boolean z6 = this.$disableAuthorMessageHorizontalPadding;
        boolean z7 = this.$disableAuthorMessageMinHeight;
        boolean z8 = this.$disableUserMessageBottomPadding;
        return new 7Gk((InterfaceC02083tw) null, r306, Ad4, c72k, this.$collapseTextParams, this.$otherUserMessageVerticalPaddingEdge, false, false, z, z2, z3, z4, z5, z6, z7, z8, this.$disableMinimallyWide);
    }
}
