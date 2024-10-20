package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.68A, reason: invalid class name */
/* loaded from: 68A.class */
public final class C68A extends C67u {
    public final C24z A00;
    public final boolean A01;

    public C68A(AnonymousClass248 anonymousClass248, C24z c24z, boolean z) {
        super(anonymousClass248);
        this.A00 = anonymousClass248 == null ? null : c24z;
        this.A01 = z;
    }

    /* JADX WARN: Type inference failed for: r0v70, types: [X.68C, java.lang.Object] */
    public static void A00(C68A c68a, C24s c24s, Class cls, Class cls2, java.util.Map map) {
        if (cls2 != null) {
            A01(c68a, c24s, cls, cls2, map);
        }
        if (cls == null) {
            return;
        }
        Method[] A0O = 27C.A0O(cls);
        int length = A0O.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Method method = A0O[i2];
            if (!Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2) {
                68B r0 = new 68B(method.getName(), method.getParameterTypes());
                68C r02 = (68C) map.get(r0);
                if (r02 == null) {
                    C24u A06 = ((C67u) c68a).A00 == null ? C67g.A00 : c68a.A06(method.getDeclaredAnnotations());
                    ?? obj = new Object();
                    ((68C) obj).A01 = c24s;
                    ((68C) obj).A02 = method;
                    ((68C) obj).A00 = A06;
                    map.put(r0, obj);
                } else {
                    if (c68a.A01) {
                        r02.A00 = c68a.A05(r02.A00, method.getDeclaredAnnotations());
                    }
                    Method method2 = r02.A02;
                    if (method2 == null) {
                        r02.A02 = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        r02.A02 = method;
                        r02.A01 = c24s;
                    }
                }
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [X.68C, java.lang.Object] */
    public static void A01(C68A c68a, C24s c24s, Class cls, Class cls2, java.util.Map map) {
        List emptyList;
        if (((C67u) c68a).A00 != null) {
            Iterator it = 27C.A00;
            if (cls2 == cls || cls2 == Object.class) {
                emptyList = Collections.emptyList();
            } else {
                emptyList = AnonymousClass001.A0t(8);
                27C.A0E(cls2, cls, emptyList);
            }
            Iterator it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Method[] declaredMethods = ((Class) it2.next()).getDeclaredMethods();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < length) {
                        Method method = declaredMethods[i2];
                        if (!Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2) {
                            68B r0 = new 68B(method.getName(), method.getParameterTypes());
                            68C r02 = (68C) map.get(r0);
                            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                            if (r02 == null) {
                                C24u A06 = c68a.A06(declaredAnnotations);
                                ?? obj = new Object();
                                ((68C) obj).A01 = c24s;
                                ((68C) obj).A02 = null;
                                ((68C) obj).A00 = A06;
                                map.put(r0, obj);
                            } else {
                                r02.A00 = c68a.A05(r02.A00, declaredAnnotations);
                            }
                        }
                        i = i2 + 1;
                    }
                }
            }
        }
    }
}
