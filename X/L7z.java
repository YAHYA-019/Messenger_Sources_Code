package X;

import java.lang.reflect.Method;

/* loaded from: L7z.class */
public final class L7z {
    public static final L7z A00 = new Object();
    public static final C01i A01;
    public static final C01i A02;
    public static final C01i A03;
    public static final C01i A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L7z, java.lang.Object] */
    static {
        C03i c03i = C03i.A02;
        A03 = C01g.A00(c03i, M2q.A00);
        A01 = C01g.A00(c03i, M2n.A00);
        A02 = C01g.A00(c03i, M2p.A00);
        A04 = C01g.A00(c03i, M2o.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Method A00(Class cls, String str) {
        Method method = null;
        try {
            Class cls2 = (Class) A03.getValue();
            if (cls2 != 0) {
                method = cls2.getMethod(str, String.class, cls);
            }
            return method;
        } catch (NoSuchMethodException e) {
            4gE.A02.A06("SystemPropertiesService", "Unable to access System Properties method", e);
            return null;
        }
    }

    public final int A01(String str, int i) {
        try {
            Method method = (Method) A02.getValue();
            Object obj = null;
            if (method != null) {
                obj = method.invoke(null, str, Integer.valueOf(i));
            }
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num != null) {
                    i = num.intValue();
                }
            }
            return i;
        } catch (Exception e) {
            4gE.A02.A06("SystemPropertiesService", 0Pz.A0W("Exception getting prop ", str), e);
            return i;
        }
    }
}
