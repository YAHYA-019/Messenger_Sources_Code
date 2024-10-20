package X;

/* renamed from: X.988, reason: invalid class name */
/* loaded from: 988.class */
public enum AnonymousClass988 implements C07n {
    TEXT(0),
    IMAGE(1),
    XMA(2);

    public final long mValue;

    AnonymousClass988(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
