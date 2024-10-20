package X;

/* renamed from: X.980, reason: invalid class name */
/* loaded from: 980.class */
public enum AnonymousClass980 implements C07n {
    APP_BADGE(0),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_BADGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    INBOX_BADGE(2);

    public final long mValue;

    AnonymousClass980(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
