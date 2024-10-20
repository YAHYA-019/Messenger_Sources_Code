package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;

/* renamed from: X.68G, reason: invalid class name */
/* loaded from: 68G.class */
public final class C68G extends C67u {
    public C00943pV A00;
    public final C24s A01;
    public final boolean A02;

    public C68G(AnonymousClass248 anonymousClass248, C24s c24s, boolean z) {
        super(anonymousClass248);
        this.A01 = c24s;
        this.A02 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.annotation.Annotation[]] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.annotation.Annotation[]] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.67v] */
    /* JADX WARN: Type inference failed for: r309v3 */
    /* JADX WARN: Type inference failed for: r309v4 */
    /* JADX WARN: Type inference failed for: r309v5 */
    public static C00943pV A00(C68G c68g, C27F c27f, C27F c27f2) {
        C67v[] A03;
        int i;
        Annotation[][] annotationArr;
        int i2;
        C24s c24s;
        Constructor constructor;
        Object A02;
        C67v[] c67vArr;
        int i3 = c27f.A00;
        if (i3 < 0) {
            i3 = c27f.A01.getParameterTypes().length;
            c27f.A00 = i3;
        }
        if (((C67u) c68g).A00 == null) {
            c24s = c68g.A01;
            constructor = c27f.A01;
            A02 = new Object();
            if (i3 != 0) {
                c67vArr = new C67v[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    c67vArr[i4] = new Object();
                }
                return new C00943pV(A02, c24s, constructor, c67vArr);
            }
        } else {
            if (i3 != 0) {
                Annotation[][] annotationArr2 = c27f.A03;
                if (annotationArr2 == null) {
                    annotationArr2 = c27f.A01.getParameterAnnotations();
                    c27f.A03 = annotationArr2;
                }
                int length = annotationArr2.length;
                Annotation[][] annotationArr3 = null;
                if (i3 != length) {
                    Constructor constructor2 = c27f.A01;
                    Class<?> declaringClass = constructor2.getDeclaringClass();
                    Iterator it = 27C.A00;
                    if (Enum.class.isAssignableFrom(declaringClass) && i3 == (i2 = length + 2)) {
                        annotationArr = new Annotation[i2];
                        System.arraycopy(annotationArr2, 0, annotationArr, 2, length);
                    } else {
                        if (!declaringClass.isMemberClass() || i3 != (i = length + 1)) {
                            throw AnonymousClass001.A0N(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", 1BK.A1a(constructor2.getDeclaringClass().getName(), Integer.valueOf(i3), length)));
                        }
                        annotationArr = new Annotation[i];
                        System.arraycopy(annotationArr2, 0, annotationArr, 1, length);
                        annotationArr[0] = C67u.A02;
                    }
                    A03 = c68g.A03(annotationArr, null);
                } else {
                    if (c27f2 != null) {
                        annotationArr3 = c27f2.A03;
                        if (annotationArr3 == null) {
                            annotationArr3 = c27f2.A01.getParameterAnnotations();
                            c27f2.A03 = annotationArr3;
                        }
                    }
                    A03 = c68g.A03(annotationArr2, annotationArr3);
                }
                return new C00943pV(A02(c68g, c27f, c27f2), c68g.A01, c27f.A01, A03);
            }
            c24s = c68g.A01;
            constructor = c27f.A01;
            A02 = A02(c68g, c27f, c27f2);
        }
        c67vArr = C67u.A01;
        return new C00943pV(A02, c24s, constructor, c67vArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.67v] */
    /* JADX WARN: Type inference failed for: r308v0 */
    /* JADX WARN: Type inference failed for: r308v1 */
    /* JADX WARN: Type inference failed for: r308v2 */
    /* JADX WARN: Type inference failed for: r308v3 */
    public static C68D A01(C68G c68g, C24s c24s, Method method, Method method2) {
        Object A01;
        C67v[] A03;
        int length = method.getParameterTypes().length;
        if (((C67u) c68g).A00 == null) {
            A01 = new Object();
            if (length != 0) {
                A03 = new C67v[length];
                int i = 0;
                do {
                    A03[i] = new Object();
                    i++;
                } while (i < length);
            }
            A03 = C67u.A01;
        } else {
            C24u A06 = c68g.A06(method.getDeclaredAnnotations());
            if (length == 0) {
                if (method2 != null) {
                    A06 = c68g.A04(A06, method2.getDeclaredAnnotations());
                }
                A01 = A06.A01();
                A03 = C67u.A01;
            } else {
                if (method2 != null) {
                    A06 = c68g.A04(A06, method2.getDeclaredAnnotations());
                }
                A01 = A06.A01();
                A03 = c68g.A03(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations());
            }
        }
        return new C68D(A01, c24s, method, A03);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.67v, java.lang.Object] */
    public static C67v A02(C68G c68g, C27F c27f, C27F c27f2) {
        if (!c68g.A02) {
            return new Object();
        }
        Annotation[] annotationArr = c27f.A02;
        if (annotationArr == null) {
            annotationArr = c27f.A01.getDeclaredAnnotations();
            c27f.A02 = annotationArr;
        }
        C24u A06 = c68g.A06(annotationArr);
        if (c27f2 != null) {
            Annotation[] annotationArr2 = c27f2.A02;
            if (annotationArr2 == null) {
                annotationArr2 = c27f2.A01.getDeclaredAnnotations();
                c27f2.A02 = annotationArr2;
            }
            A06 = c68g.A04(A06, annotationArr2);
        }
        return A06.A01();
    }

    private C67v[] A03(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        C67v[] c67vArr;
        if (this.A02) {
            int length = annotationArr.length;
            c67vArr = new C67v[length];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                C24u A04 = A04(C67g.A00, annotationArr[i2]);
                if (annotationArr2 != null) {
                    A04 = A04(A04, annotationArr2[i2]);
                }
                c67vArr[i2] = A04.A01();
                i = i2 + 1;
            }
        } else {
            c67vArr = C67u.A01;
        }
        return c67vArr;
    }
}
