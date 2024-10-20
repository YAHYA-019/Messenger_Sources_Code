package X;

/* renamed from: X.5o0, reason: invalid class name */
/* loaded from: 5o0.class */
public final class C5o0 extends C04v {
    public static final C5o0 A01 = new C5o0(04R.A0G());
    public final java.util.Map A00;

    public C5o0() {
        this(04R.A0G());
    }

    public C5o0(java.util.Map map) {
        11T.A0F(map, 1);
        this.A00 = map;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5o0) && 11T.A0O(this.A00, ((C5o0) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MediaDownloadControlStatuses(statuses=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
