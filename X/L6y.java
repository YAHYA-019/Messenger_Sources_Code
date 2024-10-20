package X;

/* loaded from: L6y.class */
public abstract class L6y {
    public static final L2m A00 = new L2m();
    public static final L2m A01;

    static {
        L2m l2m;
        try {
            l2m = (L2m) JQy.A0o("com.google.protobuf.ExtensionSchemaFull");
        } catch (Exception unused) {
            l2m = null;
        }
        A01 = l2m;
    }

    public static L2m A00() {
        L2m l2m = A01;
        if (l2m != null) {
            return l2m;
        }
        throw AnonymousClass001.A0N("Protobuf runtime is not correctly loaded.");
    }

    public static L2m A01() {
        return A00;
    }
}
