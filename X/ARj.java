package X;

import kotlin.jvm.functions.Function1;

/* loaded from: ARj.class */
public final class ARj extends C00q implements Function1 {
    public final /* synthetic */ C70o $emojiTextSpannableManager;
    public final /* synthetic */ C26z $otherUserMessageVerticalPaddingEdge;
    public final /* synthetic */ boolean $shouldFullWidthAiBotMessage;
    public final /* synthetic */ C6qu $this_aiBotTextMessageFeature;
    public final /* synthetic */ 7Gi $customizedTextMessageFontSizeStrategy = null;
    public final /* synthetic */ boolean $isFullWidthWithoutMargin = false;
    public final /* synthetic */ boolean $shouldRenderAuthorMessageBold = false;
    public final /* synthetic */ boolean $disableAuthorMessageVerticalPadding = false;
    public final /* synthetic */ boolean $disableMessageHorizontalPadding = false;
    public final /* synthetic */ boolean $disableAuthorMessageHorizontalPadding = false;
    public final /* synthetic */ boolean $disableAuthorMessageMinHeight = false;
    public final /* synthetic */ boolean $disableUserMessageBottomPadding = false;
    public final /* synthetic */ boolean $disableMinimallyWide = false;
    public final /* synthetic */ 8Kv $collapseTextParams = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARj(C70o c70o, C6qu c6qu, C26z c26z, boolean z) {
        super(1);
        this.$this_aiBotTextMessageFeature = c6qu;
        this.$emojiTextSpannableManager = c70o;
        this.$shouldFullWidthAiBotMessage = z;
        this.$otherUserMessageVerticalPaddingEdge = c26z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6zb c6zb = (C6zb) obj;
        11T.A0F(c6zb, 0);
        C5fw c5fw = C5fw.A0N;
        C6qu c6qu = this.$this_aiBotTextMessageFeature;
        C70o c70o = this.$emojiTextSpannableManager;
        7Gi r0 = this.$customizedTextMessageFontSizeStrategy;
        boolean z = this.$shouldFullWidthAiBotMessage;
        boolean z2 = this.$isFullWidthWithoutMargin;
        boolean z3 = this.$shouldRenderAuthorMessageBold;
        boolean z4 = this.$disableAuthorMessageVerticalPadding;
        boolean z5 = this.$disableMessageHorizontalPadding;
        boolean z6 = this.$disableAuthorMessageHorizontalPadding;
        boolean z7 = this.$disableAuthorMessageMinHeight;
        boolean z8 = this.$disableUserMessageBottomPadding;
        c6zb.A03(c5fw, new AL1(c70o, r0, c6qu, this.$collapseTextParams, this.$otherUserMessageVerticalPaddingEdge, z, z2, z3, z4, z5, z6, z7, z8, this.$disableMinimallyWide));
        return 04S.A00;
    }
}
