package X;

/* renamed from: X.207, reason: invalid class name */
/* loaded from: 207.class */
public final class AnonymousClass207 {
    public final Class A00;
    public final String A01;

    public AnonymousClass207(Class cls, String str) {
        this.A00 = cls;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw AnonymousClass001.A0L("Unable to determine name of class. Use a dedicated string-key or make your class a top-level class.");
        }
        this.A01 = 0Pz.A0W(canonicalName, (str == null || 0CU.A0O(str)) ? "" : 0Pz.A0K(str, ':'));
    }
}
