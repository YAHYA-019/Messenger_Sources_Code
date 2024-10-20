package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: K5Q.class */
public abstract class K5Q extends Ld7 {
    public static final java.util.Map zzb = JQx.A13();
    public int zzd = -1;
    public LAl zzc = LAl.A04;

    public static Object A00(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw 1BK.A0s("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw 1BK.A0s("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public Object A02(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new Ld3(K5W.zzb, new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new K5W();
        }
        K5W k5w = null;
        if (i2 == 4) {
            return new K5P(K5W.zzb);
        }
        if (i2 == 5) {
            k5w = K5W.zzb;
        }
        return k5w;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return L23.A02.A00(cls).DD0(this, obj);
    }

    public final int hashCode() {
        int i;
        if ((this.zzd & ((-1) << (-1))) != 0) {
            i = L23.A02.A00(getClass()).DC6(this);
        } else {
            i = this.zza;
            if (i == 0) {
                int DC6 = L23.A02.A00(getClass()).DC6(this);
                this.zza = DC6;
                return DC6;
            }
        }
        return i;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = L6k.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("# ");
        A0k.append(obj);
        L6k.A00(this, A0k, 0);
        return A0k.toString();
    }
}
