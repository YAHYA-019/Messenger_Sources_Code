package X;

/* renamed from: X.0dh, reason: invalid class name */
/* loaded from: 0dh.class */
public final class C0dh {
    public static final C0dh A01 = new C0dh("");
    public final String A00;

    public C0dh(String str) {
        if (str.contains(":")) {
            throw AnonymousClass001.A0L("Invalid name");
        }
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00.equals(((C0dh) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00;
    }
}
