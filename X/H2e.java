package X;

/* loaded from: H2e.class */
public final class H2e extends H2U {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2e(GRd gRd) {
        super(QUi.class);
        this.A00 = 2;
        this.A01 = gRd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2e(Hgk hgk, Class cls, int i) {
        super(cls);
        this.A00 = i;
        this.A01 = hgk;
    }

    public /* bridge */ /* synthetic */ void A05(6QK r302) {
        switch (this.A00) {
            case 0:
            case 1:
                Hgk hgk = (Hgk) this.A01;
                hgk.A01.CO0(new C6cu(hgk.A00));
                return;
            default:
                throw AnonymousClass001.A0Q("getExtensionId$fbandroid_java_com_facebook_video_smartstates_playerbehavior_playerbehavior");
        }
    }
}
