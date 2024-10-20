package X;

/* loaded from: BO8.class */
public enum BO8 implements C07n {
    CONSUMER("whatsapp"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMO("fb"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMO("promo"),
    SMB("whatsappsmb");

    public final String mValue;

    BO8(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
