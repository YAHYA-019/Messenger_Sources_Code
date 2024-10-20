package X;

/* loaded from: Kic.class */
public final class Kic {
    public final CharSequence A00;
    public final CharSequence A01;
    public final String A02;

    public Kic(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.A01 = charSequence;
        this.A00 = charSequence2;
        this.A02 = str;
        if (charSequence.length() <= 0) {
            throw AnonymousClass001.A0L("userId should not be empty");
        }
    }
}
