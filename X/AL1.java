package X;

/* loaded from: AL1.class */
public final class AL1 extends C00q implements C00m {
    public final /* synthetic */ 8Kv $collapseTextParams;
    public final /* synthetic */ 7Gi $customizedTextMessageFontSizeStrategy;
    public final /* synthetic */ boolean $disableAuthorMessageHorizontalPadding;
    public final /* synthetic */ boolean $disableAuthorMessageMinHeight;
    public final /* synthetic */ boolean $disableAuthorMessageVerticalPadding;
    public final /* synthetic */ boolean $disableMessageHorizontalPadding;
    public final /* synthetic */ boolean $disableMinimallyWide;
    public final /* synthetic */ boolean $disableUserMessageBottomPadding;
    public final /* synthetic */ C70o $emojiTextSpannableManager;
    public final /* synthetic */ boolean $isFullWidthWithoutMargin;
    public final /* synthetic */ C26z $otherUserMessageVerticalPaddingEdge;
    public final /* synthetic */ boolean $shouldFullWidthAiBotMessage;
    public final /* synthetic */ boolean $shouldRenderAuthorMessageBold;
    public final /* synthetic */ C6qu $this_aiBotTextMessageFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AL1(C70o c70o, 7Gi r303, C6qu c6qu, 8Kv r305, C26z c26z, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        super(0);
        this.$this_aiBotTextMessageFeature = c6qu;
        this.$emojiTextSpannableManager = c70o;
        this.$customizedTextMessageFontSizeStrategy = r303;
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
        this.$collapseTextParams = r305;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6zD, java.lang.Object] */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass701 A00 = 71C.A00(C6ze.A07, (6zD) new Object(), new AKL(this.$emojiTextSpannableManager, 32));
        C6qu c6qu = this.$this_aiBotTextMessageFeature;
        C6ze c6ze = C6ze.A0W;
        AL0 al0 = new AL0(this.$customizedTextMessageFontSizeStrategy, c6qu, this.$collapseTextParams, this.$otherUserMessageVerticalPaddingEdge, this.$shouldFullWidthAiBotMessage, this.$isFullWidthWithoutMargin, this.$shouldRenderAuthorMessageBold, this.$disableAuthorMessageVerticalPadding, this.$disableMessageHorizontalPadding, this.$disableAuthorMessageHorizontalPadding, this.$disableAuthorMessageMinHeight, this.$disableUserMessageBottomPadding, this.$disableMinimallyWide);
        6zM r0 = 6zM.A00;
        11T.A0F(r0, 1);
        return C0s8.A14(A00, 71C.A00(c6ze, r0, al0));
    }
}
