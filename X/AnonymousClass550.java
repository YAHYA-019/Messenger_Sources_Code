package X;

/* renamed from: X.550, reason: invalid class name */
/* loaded from: 550.class */
public enum AnonymousClass550 implements C07n {
    INSTAGRAM(0),
    FACEBOOK(1),
    /* JADX INFO: Fake field, exist only in values array */
    AI_BOT(2);

    public final long mValue;

    AnonymousClass550(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
