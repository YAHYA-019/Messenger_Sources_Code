package X;

/* renamed from: X.Mc3, reason: case insensitive filesystem */
/* loaded from: Mc3.class */
public final class C3410Mc3 extends C23s implements MQ5 {
    public C3410Mc3() {
        super(-494182090);
    }

    public C3410Mc3(int i) {
        super(i);
    }

    @Override // X.MQ5
    public String AsM() {
        return A0B(1, "issuer_card_art_url");
    }

    @Override // X.MQ5
    public String AsN() {
        return A0B(2, "issuer_name");
    }

    @Override // X.MQ5
    public Qtm BGM() {
        return A0A(Qtm.A03, "token_status", 0);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRr.A04();
    }
}
