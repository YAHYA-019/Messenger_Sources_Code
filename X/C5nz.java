package X;

/* renamed from: X.5nz, reason: invalid class name */
/* loaded from: 5nz.class */
public final class C5nz extends C04v {
    public static final C5nz A01 = new C5nz(04R.A0G());
    public final java.util.Map A00;

    public C5nz() {
        this(04R.A0G());
    }

    public C5nz(java.util.Map map) {
        this.A00 = map;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5nz) && 11T.A0O(this.A00, ((C5nz) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TranslatedMessageStatuses(statuses=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
