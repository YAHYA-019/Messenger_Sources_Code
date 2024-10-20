package X;

/* loaded from: Eu4.class */
public final class Eu4 {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public Eu4(Integer num, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TosFlow{shouldAcceptTos=");
        A0k.append(this.A01);
        A0k.append(", shouldShowExplicitTos=");
        A0k.append(this.A02);
        A0k.append(", reason=");
        A0k.append(R2T.A00(this.A00));
        return AnonymousClass001.A0f(A0k);
    }
}
