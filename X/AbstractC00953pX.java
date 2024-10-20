package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

/* renamed from: X.3pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pX.class */
public abstract class AbstractC00953pX extends C24r implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient C67v A00;
    public final transient C24s A01;

    public AbstractC00953pX(C67v c67v, C24s c24s) {
        this.A01 = c24s;
        this.A00 = c67v;
    }

    @Override // X.C24r
    public final Annotation A06(Class cls) {
        C67v c67v = this.A00;
        if (c67v == null) {
            return null;
        }
        return c67v.AUd(cls);
    }

    @Override // X.C24r
    public boolean A08(Class[] clsArr) {
        C67v c67v = this.A00;
        if (c67v == null) {
            return false;
        }
        return c67v.BNG(clsArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3pX, X.3pW, X.3pV] */
    public C24r A09(C67v c67v) {
        ?? r0 = (C00943pV) this;
        return new C00943pV(c67v, r0.A01, r0._constructor, ((3pW) r0)._paramAnnotations);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Class A0A() {
        return ((C00943pV) this)._constructor.getDeclaringClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object A0B(Object obj) {
        throw new UnsupportedOperationException(0Pz.A0W("Cannot call getValue() on constructor of ", ((C00943pV) this)._constructor.getDeclaringClass().getName()));
    }

    public String A0C() {
        return 0Pz.A0j(A0A().getName(), "#", A05());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Member A0D() {
        return ((C00943pV) this)._constructor;
    }

    public final void A0E(boolean z) {
        Member A0D = A0D();
        if (A0D != null) {
            27C.A0I(A0D, z);
        }
    }

    public final boolean A0F() {
        C67v c67v = this.A00;
        if (c67v == null) {
            return false;
        }
        return c67v.A01();
    }
}
