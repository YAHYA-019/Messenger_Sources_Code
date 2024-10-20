package X;

/* loaded from: BO5.class */
public enum BO5 implements C07n {
    ALL(1),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN(2),
    ADMIN_MOD(3);

    public final long mValue;

    BO5(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
