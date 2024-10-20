package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* renamed from: X.24r, reason: invalid class name */
/* loaded from: 24r.class */
public abstract class C24r {
    public 24S A03() {
        return ((C24q) this).A03;
    }

    public Class A04() {
        return ((C24q) this).A05;
    }

    public String A05() {
        return ((C24q) this).A05.getName();
    }

    public Annotation A06(Class cls) {
        return ((C24q) this).A04.AUd(cls);
    }

    public AnnotatedElement A07() {
        throw 0Q8.createAndThrow();
    }

    public boolean A08(Class[] clsArr) {
        return ((C24q) this).A04.BNG(clsArr);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
