package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* renamed from: X.67u, reason: invalid class name */
/* loaded from: 67u.class */
public class C67u {
    public static final C67v[] A01 = new C67v[0];
    public static final Annotation[] A02 = new Annotation[0];
    public final AnonymousClass248 A00;

    public C67u(AnonymousClass248 anonymousClass248) {
        this.A00 = anonymousClass248;
    }

    private final C24u A01(C24u c24u, Annotation annotation) {
        Annotation[] A0N = 27C.A0N(annotation.annotationType());
        int length = A0N.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return c24u;
            }
            Annotation annotation2 = A0N[i2];
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!this.A00.A0o(annotation2)) {
                    c24u = c24u.A00(annotation2);
                } else if (!c24u.A03(annotation2)) {
                    c24u = A01(c24u.A00(annotation2), annotation2);
                }
            }
            i = i2 + 1;
        }
    }

    public final C24u A04(C24u c24u, Annotation[] annotationArr) {
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return c24u;
            }
            Annotation annotation = annotationArr[i2];
            c24u = c24u.A00(annotation);
            if (this.A00.A0o(annotation)) {
                c24u = A01(c24u, annotation);
            }
            i = i2 + 1;
        }
    }

    public final C24u A05(C24u c24u, Annotation[] annotationArr) {
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return c24u;
            }
            Annotation annotation = annotationArr[i2];
            if (!c24u.A03(annotation)) {
                c24u = c24u.A00(annotation);
                AnonymousClass248 anonymousClass248 = this.A00;
                if (anonymousClass248.A0o(annotation)) {
                    Annotation[] A0N = 27C.A0N(annotation.annotationType());
                    int length2 = A0N.length;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 < length2) {
                            Annotation annotation2 = A0N[i4];
                            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !c24u.A03(annotation2)) {
                                c24u = c24u.A00(annotation2);
                                if (anonymousClass248.A0o(annotation2)) {
                                    c24u = A01(c24u, annotation2);
                                }
                            }
                            i3 = i4 + 1;
                        }
                    }
                }
            }
            i = i2 + 1;
        }
    }

    public final C24u A06(Annotation[] annotationArr) {
        C24u c24u = C67g.A00;
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return c24u;
            }
            Annotation annotation = annotationArr[i2];
            c24u = c24u.A00(annotation);
            if (this.A00.A0o(annotation)) {
                c24u = A01(c24u, annotation);
            }
            i = i2 + 1;
        }
    }
}
