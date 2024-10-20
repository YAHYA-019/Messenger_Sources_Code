package X;

import android.content.Context;
import android.util.BoostFramework;
import java.lang.reflect.Constructor;

/* renamed from: X.2sl, reason: invalid class name */
/* loaded from: 2sl.class */
public final class C2sl {
    public static 2LZ A02;
    public static 2La A03;
    public static 2Lb A04;
    public static 2Lb A05;
    public final BoostFramework A00;
    public final Object A01;

    static {
        2LZ r0 = new 2LZ("android.util.BoostFramework");
        A02 = r0;
        2LZ.A00(r0, new Class[0], false);
        A03 = 2LZ.A00(A02, new Class[]{Context.class}, true);
        A04 = A02.A02("perfLockAcquire", new Class[]{Integer.TYPE, int[].class});
        A05 = A02.A02("perfLockRelease", new Class[0]);
    }

    public C2sl(Context context) {
        Object obj;
        boolean z = A02.A03;
        2La r0 = A03;
        if (r0 != null) {
            this.A00 = r0.A00 != null ? new BoostFramework(context) : new BoostFramework();
            return;
        }
        Constructor constructor = r0.A00;
        if (constructor != null) {
            new Object[1][0] = context;
            Constructor constructor2 = null;
            obj = constructor2.newInstance(null);
        } else {
            Class cls = ((2LZ) constructor).A01;
            Class cls2 = null;
            obj = null;
            if (0 != 0) {
                try {
                    obj = cls2.newInstance();
                } catch (Exception unused) {
                }
            }
        }
        this.A01 = obj;
    }

    public static boolean A00() {
        boolean z = false;
        if (A03.A00 != null) {
            z = true;
        }
        return z;
    }

    public static boolean A01() {
        return A02.A05((ClassLoader) null);
    }

    public int A02(int i, int... iArr) {
        BoostFramework boostFramework = this.A00;
        if (boostFramework != null) {
            return boostFramework.perfLockAcquire(i, iArr);
        }
        return A04.A00(new Object[]{Integer.valueOf(i), iArr}, this.A01);
    }

    public void A03() {
        BoostFramework boostFramework = this.A00;
        if (boostFramework != null) {
            boostFramework.perfLockRelease();
            return;
        }
        A05.A00(AnonymousClass001.A1Z(), this.A01);
    }
}
