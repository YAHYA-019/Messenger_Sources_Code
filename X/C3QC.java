package X;

import java.lang.reflect.Method;

/* renamed from: X.3QC, reason: invalid class name */
/* loaded from: 3QC.class */
public final class C3QC {
    public static final C3QC A03;
    public static final RuntimeException A04;
    public final Method A00;
    public final Method A01;
    public final Method A02;

    static {
        C3QC c3qc = null;
        try {
            e = null;
            c3qc = new C3QC();
        } catch (RuntimeException e) {
            e = e;
        }
        A03 = c3qc;
        A04 = e;
    }

    public C3QC() {
        try {
            this.A02 = Class.class.getMethod(JQw.A00(285), new Class[0]);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.A00 = cls.getMethod("getName", new Class[0]);
            this.A01 = cls.getMethod("getType", new Class[0]);
        } catch (Exception e) {
            throw 1BK.A0s(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", AnonymousClass001.A0Y(e), e.getMessage()), e);
        }
    }
}
