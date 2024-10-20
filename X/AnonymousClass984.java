package X;

/* renamed from: X.984, reason: invalid class name */
/* loaded from: 984.class */
public enum AnonymousClass984 implements C07n {
    SUGGESTED(0),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_AI(1),
    JTBD(2),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(999);

    public final long mValue;

    AnonymousClass984(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
