package X;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;

/* renamed from: X.68D, reason: invalid class name */
/* loaded from: 68D.class */
public final class C68D extends 3pW implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient Method A00;
    public Class[] _paramClasses;
    public ACg _serialization;

    public C68D(C67v c67v, C24s c24s, Method method, C67v[] c67vArr) {
        super(c67v, c24s, c67vArr);
        if (method == null) {
            throw AnonymousClass001.A0L("Cannot construct AnnotatedMethod with null Method");
        }
        this.A00 = method;
    }

    public C68D(ACg aCg) {
        super((C67v) null, (C24s) null, (C67v[]) null);
        this.A00 = null;
        this._serialization = aCg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 24S A03() {
        return this.A01.Ci9(this.A00.getGenericReturnType());
    }

    public Class A04() {
        return this.A00.getReturnType();
    }

    public String A05() {
        return this.A00.getName();
    }

    public /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ C24r A09(C67v c67v) {
        return new C68D(c67v, this.A01, this.A00, ((3pW) this)._paramAnnotations);
    }

    public Class A0A() {
        return this.A00.getDeclaringClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object A0B(Object obj) {
        try {
            return this.A00.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException(0Pz.A0v("Failed to getValue() with method ", A0C(), ": ", 27C.A09(e)), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String A0C() {
        StringBuilder A0n;
        String str;
        String A0C = super/*X.3pX*/.A0C();
        int A0G = A0G();
        if (A0G == 0) {
            A0n = AnonymousClass001.A0n(A0C);
            str = "()";
        } else {
            if (A0G != 1) {
                return String.format("%s(%d params)", AnonymousClass001.A1b(super/*X.3pX*/.A0C(), A0G()));
            }
            A0n = AnonymousClass001.A0n(A0C);
            A0n.append("(");
            A0n.append(A0J(0).getName());
            str = ")";
        }
        return AnonymousClass001.A0d(str, A0n);
    }

    public /* bridge */ /* synthetic */ Member A0D() {
        return this.A00;
    }

    public int A0G() {
        Class<?>[] clsArr = this._paramClasses;
        if (clsArr == null) {
            clsArr = this.A00.getParameterTypes();
            this._paramClasses = clsArr;
        }
        return clsArr.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 24S A0H(int i) {
        Type[] genericParameterTypes = this.A00.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.A01.Ci9(genericParameterTypes[i]);
    }

    public Class A0J(int i) {
        Class<?>[] clsArr = this._paramClasses;
        if (clsArr == null) {
            clsArr = this.A00.getParameterTypes();
            this._paramClasses = clsArr;
        }
        if (0 >= clsArr.length) {
            return null;
        }
        return clsArr[0];
    }

    public final Object A0K() {
        return this.A00.invoke(null, AnonymousClass001.A1Z());
    }

    public final Object A0L(Object obj) {
        return this.A00.invoke(null, obj);
    }

    public final Object A0M(Object[] objArr) {
        return this.A00.invoke(null, objArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = 27C.A00;
            if (obj == null || obj.getClass() != cls) {
                return false;
            }
            Method method = ((C68D) obj).A00;
            Method method2 = this.A00;
            if (method != null) {
                return method.equals(method2);
            }
            if (method2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.getName().hashCode();
    }

    public Object readResolve() {
        ACg aCg = this._serialization;
        Class cls = aCg.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(aCg.name, aCg.args);
            if (!declaredMethod.isAccessible()) {
                27C.A0I(declaredMethod, false);
            }
            return new C68D(null, null, declaredMethod, null);
        } catch (Exception unused) {
            throw AnonymousClass001.A0L(0Pz.A0v("Could not find method '", this._serialization.name, "' from Class '", cls.getName()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        return 0Pz.A0j("[method ", A0C(), "]");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.ACg, java.lang.Object] */
    public Object writeReplace() {
        Method method = this.A00;
        ?? obj = new Object();
        obj.clazz = method.getDeclaringClass();
        obj.name = method.getName();
        obj.args = method.getParameterTypes();
        return new C68D(obj);
    }
}
