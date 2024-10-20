package X;

/* renamed from: X.4Rb, reason: invalid class name */
/* loaded from: 4Rb.class */
public enum C4Rb implements C07n {
    READ("read"),
    WRITE("write");

    public final String mValue;

    C4Rb(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
