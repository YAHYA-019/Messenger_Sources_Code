package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.72i, reason: invalid class name */
/* loaded from: 72i.class */
public final class C72i extends C00q implements Function1 {
    public final /* synthetic */ MigColorScheme $colorScheme;
    public final /* synthetic */ C6qu $this_hScrollXmaFeature;
    public final /* synthetic */ boolean $disableBubbleForMessageText = false;
    public final /* synthetic */ 7Gi $customizedMessageTextFontSizeStrategy = null;
    public final /* synthetic */ C26z $customizedMessageTextVerticalPaddingEdge = null;
    public final /* synthetic */ C26z $customizedMessageTextHorizontalPaddingEdge = null;
    public final /* synthetic */ boolean $disableMaxWidth = false;
    public final /* synthetic */ float $bubbleEndMarginDip = 0.0f;
    public final /* synthetic */ 8Kv $collapseTextParams = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72i(MigColorScheme migColorScheme, C6qu c6qu) {
        super(1);
        this.$this_hScrollXmaFeature = c6qu;
        this.$colorScheme = migColorScheme;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6zD, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6zb c6zb = (C6zb) obj;
        11T.A0F(c6zb, 0);
        C5fw c5fw = C5fw.A0S;
        C6ze c6ze = C6ze.A0h;
        ?? obj2 = new Object();
        C6qu c6qu = this.$this_hScrollXmaFeature;
        MigColorScheme migColorScheme = this.$colorScheme;
        boolean z = this.$disableBubbleForMessageText;
        7Gi r0 = this.$customizedMessageTextFontSizeStrategy;
        C26z c26z = this.$customizedMessageTextVerticalPaddingEdge;
        C26z c26z2 = this.$customizedMessageTextHorizontalPaddingEdge;
        boolean z2 = this.$disableMaxWidth;
        c6zb.A00(c5fw, 71C.A00(c6ze, (6zD) obj2, new C77o(migColorScheme, r0, c6qu, this.$collapseTextParams, c26z, c26z2, this.$bubbleEndMarginDip, z, z2)), new AnonymousClass703[0]);
        return 04S.A00;
    }
}
