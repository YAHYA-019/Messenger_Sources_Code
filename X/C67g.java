package X;

import java.lang.annotation.Annotation;

/* renamed from: X.67g, reason: invalid class name */
/* loaded from: 67g.class */
public final class C67g extends C24u {
    public static final C67g A00 = new C24u(null);

    @Override // X.C24u
    public C24u A00(Annotation annotation) {
        Object obj = this.A00;
        Class<? extends Annotation> annotationType = annotation.annotationType();
        C24u c24u = new C24u(obj);
        ((3BT) c24u).A00 = annotationType;
        ((3BT) c24u).A01 = annotation;
        return c24u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.67v, java.lang.Object] */
    @Override // X.C24u
    public C67v A01() {
        return new Object();
    }

    @Override // X.C24u
    public C24w A02() {
        return C24u.A01;
    }

    @Override // X.C24u
    public boolean A03(Annotation annotation) {
        return false;
    }
}
