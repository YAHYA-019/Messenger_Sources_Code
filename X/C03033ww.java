package X;

import android.iawareperf.UniPerf;
import java.lang.reflect.Method;

/* renamed from: X.3ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ww.class */
public final class C03033ww {
    public static 2LZ A02;
    public static 2Lb A03;
    public static 2Lb A04;
    public final UniPerf A00;
    public final Object A01;

    static {
        2LZ r0 = new 2LZ("android.iawareperf.UniPerf");
        A02 = r0;
        A03 = r0.A02("getInstance", new Class[0]);
        A04 = A02.A02("uniPerfEvent", new Class[]{Integer.TYPE, String.class, int[].class});
    }

    public C03033ww() {
        if (A02.A03) {
            this.A00 = UniPerf.getInstance();
            return;
        }
        Object[] objArr = new Object[0];
        Method method = A03.A00;
        Object obj = null;
        if (method != null) {
            try {
                obj = method.invoke(null, objArr);
            } catch (Exception unused) {
            }
        }
        this.A01 = obj;
    }

    public static boolean A00() {
        return A02.A05((ClassLoader) null);
    }

    public int A01(int i, int... iArr) {
        UniPerf uniPerf = this.A00;
        if (uniPerf != null) {
            return uniPerf.uniPerfEvent(i, "", iArr);
        }
        return A04.A00(new Object[]{Integer.valueOf(i), "", iArr}, this.A01);
    }
}
