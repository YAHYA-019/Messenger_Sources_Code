package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.77o, reason: invalid class name */
/* loaded from: 77o.class */
public final class C77o extends C00q implements C00m {
    public final /* synthetic */ float $bubbleEndMarginDip;
    public final /* synthetic */ 8Kv $collapseTextParams;
    public final /* synthetic */ MigColorScheme $colorScheme;
    public final /* synthetic */ 7Gi $customizedMessageTextFontSizeStrategy;
    public final /* synthetic */ C26z $customizedMessageTextHorizontalPaddingEdge;
    public final /* synthetic */ C26z $customizedMessageTextVerticalPaddingEdge;
    public final /* synthetic */ boolean $disableBubbleForMessageText;
    public final /* synthetic */ boolean $disableMaxWidth;
    public final /* synthetic */ C6qu $this_hScrollXmaFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77o(MigColorScheme migColorScheme, 7Gi r303, C6qu c6qu, 8Kv r305, C26z c26z, C26z c26z2, float f, boolean z, boolean z2) {
        super(0);
        this.$this_hScrollXmaFeature = c6qu;
        this.$colorScheme = migColorScheme;
        this.$disableBubbleForMessageText = z;
        this.$customizedMessageTextFontSizeStrategy = r303;
        this.$customizedMessageTextVerticalPaddingEdge = c26z;
        this.$customizedMessageTextHorizontalPaddingEdge = c26z2;
        this.$disableMaxWidth = z2;
        this.$bubbleEndMarginDip = f;
        this.$collapseTextParams = r305;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C6qv c6qv = this.$this_hScrollXmaFeature.A00;
        6yM Ad4 = c6qv.Ad4();
        MigColorScheme migColorScheme = this.$colorScheme;
        1Va Akk = c6qv.Akk();
        boolean z = this.$disableBubbleForMessageText;
        7Gi r0 = this.$customizedMessageTextFontSizeStrategy;
        C26z c26z = this.$customizedMessageTextVerticalPaddingEdge;
        C26z c26z2 = this.$customizedMessageTextHorizontalPaddingEdge;
        boolean z2 = this.$disableMaxWidth;
        return new AAd(migColorScheme, Akk, r0, Ad4, this.$collapseTextParams, c26z, c26z2, this.$bubbleEndMarginDip, z, z2);
    }
}
