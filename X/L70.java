package X;

/* loaded from: L70.class */
public abstract class L70 {
    public static final KYK A00;
    public static final KYK A01;

    static {
        KYK kyk;
        try {
            kyk = (KYK) JQy.A0o("com.google.protobuf.NewInstanceSchemaFull");
        } catch (Exception unused) {
            kyk = null;
        }
        A00 = kyk;
        A01 = new KYK();
    }

    public static KYK A00() {
        return A00;
    }

    public static KYK A01() {
        return A01;
    }
}
