package X;

/* renamed from: X.77i, reason: invalid class name */
/* loaded from: 77i.class */
public final class C77i extends C00q implements C00m {
    public final /* synthetic */ C01i $adminMessageIconFactory;
    public final /* synthetic */ C01i $callToActionHandler;
    public final /* synthetic */ boolean $disableMessageHorizontalPadding;
    public final /* synthetic */ boolean $hideAdminMessage;
    public final /* synthetic */ 2KG $textAlignment;
    public final /* synthetic */ C70p $textSpannableManager;
    public final /* synthetic */ C6qu $this_adminMessageFeature;
    public final /* synthetic */ boolean $useTextMessageHorizontalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77i(2KG r302, C6qu c6qu, C70p c70p, C01i c01i, C01i c01i2, boolean z, boolean z2, boolean z3) {
        super(0);
        this.$hideAdminMessage = z;
        this.$this_adminMessageFeature = c6qu;
        this.$adminMessageIconFactory = c01i;
        this.$callToActionHandler = c01i2;
        this.$useTextMessageHorizontalPadding = z2;
        this.$disableMessageHorizontalPadding = z3;
        this.$textAlignment = r302;
        this.$textSpannableManager = c70p;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.$hideAdminMessage) {
            return new AAJ(C6ze.A02);
        }
        6yM Ad4 = this.$this_adminMessageFeature.A00.Ad4();
        return new 7JY(this.$textAlignment, (7JX) this.$adminMessageIconFactory.getValue(), (7H9) this.$callToActionHandler.getValue(), Ad4, this.$textSpannableManager, this.$useTextMessageHorizontalPadding, this.$disableMessageHorizontalPadding);
    }
}
