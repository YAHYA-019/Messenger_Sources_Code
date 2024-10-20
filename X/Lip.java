package X;

/* loaded from: Lip.class */
public abstract class Lip implements Comparable {
    public static final Lip A00(Lip lip, Class cls) {
        if (cls.isInstance(lip)) {
            return (Lip) cls.cast(lip);
        }
        throw new Exception(0Pz.A0v("Expected a ", cls.getName(), " value, but got ", AnonymousClass001.A0Y(lip)));
    }

    public static CharSequence A01(Object obj, Object obj2) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj2 : obj.toString();
    }

    public int A02() {
        if (this instanceof K6T) {
            return 3;
        }
        if (this instanceof K6V) {
            return 5;
        }
        if (!(this instanceof K6S)) {
            if (this instanceof K6R) {
                return 2;
            }
            return this instanceof K6Q ? 7 : 4;
        }
        int i = 32;
        if (((K6S) this).A00 >= 0) {
            i = 0;
        }
        return (i >> 5) & 7;
    }

    public int A03() {
        if (this instanceof K6V) {
            return ((K6V) this).A00;
        }
        if (this instanceof K6U) {
            return ((K6U) this).A00;
        }
        return 0;
    }
}
