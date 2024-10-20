package X;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;

/* renamed from: X.3pV, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pV.class */
public final class C00943pV extends 3pW {
    public static final long serialVersionUID = 1;
    public final Constructor _constructor;
    public C4Wj _serialization;

    public C00943pV(C4Wj c4Wj) {
        super((C67v) null, (C24s) null, (C67v[]) null);
        this._constructor = null;
        this._serialization = c4Wj;
    }

    public C00943pV(C67v c67v, C24s c24s, Constructor constructor, C67v[] c67vArr) {
        super(c67v, c24s, c67vArr);
        if (constructor == null) {
            throw AnonymousClass001.A0L("Null constructor not allowed");
        }
        this._constructor = constructor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 24S A03() {
        return this.A01.Ci9(this._constructor.getDeclaringClass());
    }

    public Class A04() {
        return this._constructor.getDeclaringClass();
    }

    public String A05() {
        return this._constructor.getName();
    }

    public /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return this._constructor;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            C27F[] c27fArr = 27C.A01;
            if (obj == null || obj.getClass() != cls) {
                return false;
            }
            Constructor constructor = ((C00943pV) obj)._constructor;
            Constructor constructor2 = this._constructor;
            if (constructor != null) {
                return constructor.equals(constructor2);
            }
            if (constructor2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    public Object readResolve() {
        C4Wj c4Wj = this._serialization;
        Class cls = c4Wj.clazz;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(c4Wj.args);
            if (!declaredConstructor.isAccessible()) {
                27C.A0I(declaredConstructor, false);
            }
            return new C00943pV(null, null, declaredConstructor, null);
        } catch (Exception unused) {
            throw AnonymousClass001.A0L(0Pz.A0E(this._serialization.args.length, "Could not find constructor with ", " args from Class '", cls.getName()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        int length = this._constructor.getParameterTypes().length;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", 27C.A06(this._constructor.getDeclaringClass()), Integer.valueOf(length), length == 1 ? "" : K93.__redex_internal_original_name, this.A00);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.4Wj] */
    public Object writeReplace() {
        Constructor constructor = this._constructor;
        ?? obj = new Object();
        obj.clazz = constructor.getDeclaringClass();
        obj.args = constructor.getParameterTypes();
        return new C00943pV(obj);
    }
}
