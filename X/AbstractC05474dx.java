package X;

import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.CompoundOrdering;
import com.google.common.collect.NaturalOrdering;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4dx, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dx.class */
public abstract class AbstractC05474dx {
    public static final C1zA A00;
    public static final C1zA A01;

    static {
        NaturalOrdering naturalOrdering = NaturalOrdering.A02;
        C1zA A03 = new CompoundOrdering(new ByFunctionOrdering(new D2i(33), naturalOrdering), new ByFunctionOrdering(new D2i(34), naturalOrdering)).A03();
        A01 = A03;
        A00 = new ByFunctionOrdering(new D2i(35), A03);
    }

    public static Exception A00(Class cls, Throwable th) {
        Object obj;
        List asList = Arrays.asList(cls.getConstructors());
        C1zA c1zA = A00;
        if (!(asList instanceof Collection)) {
            Iterator it = asList.iterator();
            asList = new ArrayList();
            C1Jp.A02(asList, it);
        }
        Object[] array = asList.toArray();
        Arrays.sort(array, c1zA);
        Iterator it2 = 1JW.A02(Arrays.asList(array)).iterator();
        while (it2.hasNext()) {
            Constructor constructor = (Constructor) it2.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length = parameterTypes.length;
            Object[] objArr = new Object[length];
            int i = 0;
            while (true) {
                int i2 = i;
                obj = null;
                if (i2 < length) {
                    Class<?> cls2 = parameterTypes[i2];
                    if (!cls2.equals(String.class)) {
                        if (!cls2.equals(Throwable.class)) {
                            break;
                        }
                        objArr[i2] = th;
                    } else {
                        objArr[i2] = th.toString();
                    }
                    i = i2 + 1;
                } else {
                    try {
                        obj = constructor.newInstance(objArr);
                        break;
                    } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
                    }
                }
            }
            Exception exc = (Exception) obj;
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("No appropriate constructor for exception of type ");
        A0k.append(cls);
        throw new IllegalArgumentException(AnonymousClass001.A0d(" in response to chained exception", A0k), th);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(6:4|(1:25)|6|7|8|2)|26|27|28|29|30|31|32|33|(1:35)|36|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        r307 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A01(java.lang.Class r301, java.util.concurrent.Future r302) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05474dx.A01(java.lang.Class, java.util.concurrent.Future):java.lang.Object");
    }
}
