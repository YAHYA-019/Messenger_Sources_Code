package X;

/* renamed from: X.987, reason: invalid class name */
/* loaded from: 987.class */
public enum AnonymousClass987 implements C07n {
    INTERACTION("interaction"),
    IMPRESSION("impression"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_MUTATION("data_mutation"),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR("error");

    public final String mValue;

    AnonymousClass987(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
