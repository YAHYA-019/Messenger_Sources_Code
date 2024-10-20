package X;

/* renamed from: X.4Ra, reason: invalid class name */
/* loaded from: 4Ra.class */
public enum C4Ra implements C07n {
    STACK(0),
    SINGLE_IMAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(999);

    public final long mValue;

    C4Ra(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
