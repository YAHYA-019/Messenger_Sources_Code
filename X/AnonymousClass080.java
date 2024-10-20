package X;

/* renamed from: X.080, reason: invalid class name */
/* loaded from: 080.class */
public abstract class AnonymousClass080 {
    public static final Integer A00;

    static {
        Integer num = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            if (obj instanceof Integer) {
                Integer num2 = (Integer) obj;
                if (num2 != null && num2.intValue() > 0) {
                    num = num2;
                }
            }
        } catch (Throwable unused) {
        }
        A00 = num;
    }
}
