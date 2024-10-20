package X;

/* renamed from: X.986, reason: invalid class name */
/* loaded from: 986.class */
public enum AnonymousClass986 implements C07n {
    FAILURE(0),
    SUCCESS(1);

    public final long mValue;

    AnonymousClass986(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
