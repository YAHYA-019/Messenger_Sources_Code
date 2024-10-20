package X;

/* renamed from: X.2ms, reason: invalid class name */
/* loaded from: 2ms.class */
public enum C2ms implements C07n {
    DRAFT(0),
    FOLLOW_UP(1),
    FOLLOW_UP_RECEIVER(2),
    UNREAD_COUNT(3);

    public final long mValue;

    C2ms(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
