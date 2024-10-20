package X;

/* loaded from: M13.class */
public final class M13 extends C00q implements C00m {
    public final /* synthetic */ AnonymousClass068 $androidxRegistry;
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M13(AnonymousClass068 anonymousClass068, String str, boolean z) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = anonymousClass068;
        this.$key = str;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.$registered) {
            AnonymousClass068 anonymousClass068 = this.$androidxRegistry;
            String str = this.$key;
            11T.A0F(str, 0);
            anonymousClass068.A05.A01(str);
        }
        return 04S.A00;
    }
}
