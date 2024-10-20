package X;

/* loaded from: F7z.class */
public abstract class F7z {
    public final int A00;
    public final EMb A01;
    public final CharSequence A02;
    public final boolean A03;

    public F7z(EMb eMb, CharSequence charSequence, boolean z) {
        this.A02 = charSequence;
        this.A01 = eMb;
        this.A00 = (-1) >>> 1;
        this.A03 = z;
    }

    public F7z(EnN enN) {
        this.A02 = enN.A02;
        this.A01 = enN.A01;
        this.A00 = enN.A00;
        this.A03 = enN.A03;
    }

    public final void A00(FAa fAa) {
        11T.A0F(fAa, 0);
        fAa.A01 = this.A00;
        fAa.A0F = this.A03;
        fAa.A05 = this.A01.locale;
    }
}
