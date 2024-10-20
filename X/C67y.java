package X;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.Iterator;

/* renamed from: X.67y, reason: invalid class name */
/* loaded from: 67y.class */
public final class C67y extends AbstractC00953pX implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient Field A00;
    public ACf _serialization;

    public C67y(C67v c67v, C24s c24s, Field field) {
        super(c67v, c24s);
        this.A00 = field;
    }

    public C67y(ACf aCf) {
        super(null, null);
        this.A00 = null;
        this._serialization = aCf;
    }

    @Override // X.C24r
    public 24S A03() {
        return this.A01.Ci9(this.A00.getGenericType());
    }

    @Override // X.C24r
    public Class A04() {
        return this.A00.getType();
    }

    @Override // X.C24r
    public String A05() {
        return this.A00.getName();
    }

    @Override // X.C24r
    public /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return this.A00;
    }

    @Override // X.AbstractC00953pX
    public /* bridge */ /* synthetic */ C24r A09(C67v c67v) {
        return new C67y(c67v, this.A01, this.A00);
    }

    @Override // X.AbstractC00953pX
    public Class A0A() {
        return this.A00.getDeclaringClass();
    }

    @Override // X.AbstractC00953pX
    public Object A0B(Object obj) {
        try {
            return this.A00.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(0Pz.A0v("Failed to getValue() for field ", A0C(), ": ", e.getMessage()), e);
        }
    }

    @Override // X.AbstractC00953pX
    public Member A0D() {
        return this.A00;
    }

    @Override // X.C24r
    public boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = 27C.A00;
            if (obj == null || obj.getClass() != cls) {
                return false;
            }
            Field field = ((C67y) obj).A00;
            Field field2 = this.A00;
            if (field != null) {
                return field.equals(field2);
            }
            if (field2 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C24r
    public int hashCode() {
        return this.A00.getName().hashCode();
    }

    public Object readResolve() {
        ACf aCf = this._serialization;
        Class cls = aCf.clazz;
        try {
            Field declaredField = cls.getDeclaredField(aCf.name);
            if (!declaredField.isAccessible()) {
                27C.A0I(declaredField, false);
            }
            return new C67y(null, null, declaredField);
        } catch (Exception unused) {
            throw AnonymousClass001.A0L(0Pz.A0v("Could not find method '", this._serialization.name, "' from Class '", cls.getName()));
        }
    }

    @Override // X.C24r
    public String toString() {
        return 0Pz.A0j("[field ", A0C(), "]");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.ACf, java.lang.Object] */
    public Object writeReplace() {
        Field field = this.A00;
        ?? obj = new Object();
        obj.clazz = field.getDeclaringClass();
        obj.name = field.getName();
        return new C67y(obj);
    }
}
