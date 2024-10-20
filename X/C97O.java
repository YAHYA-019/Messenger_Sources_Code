package X;

/* renamed from: X.97O, reason: invalid class name */
/* loaded from: 97O.class */
public enum C97O {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    LEFT("LEFT"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTER("CENTER");

    public final String serverValue;

    C97O(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
