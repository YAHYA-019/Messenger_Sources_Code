package X;

import java.util.Collection;

/* renamed from: X.24b, reason: invalid class name */
/* loaded from: 24b.class */
public class C24b extends C24c {
    public static final long serialVersionUID = 1;

    public C24b(Class cls) {
        super(null, 24W.A00, cls, null, null, null, 0, false);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.24c, X.24b] */
    public static C24b A00(24W r301, Class cls) {
        if (cls == null) {
            return null;
        }
        return cls == Object.class ? 24R.A03 : new C24c(A00(r301, cls.getSuperclass()), r301, cls, null, null, null, 0, false);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.24c, X.24b] */
    public static C24b A01(Class cls) {
        if (java.util.Map.class.isAssignableFrom(cls)) {
            throw 1BL.A0f("Cannot construct SimpleType for a Map (class: ", cls.getName(), ")");
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw 1BL.A0f("Cannot construct SimpleType for a Collection (class: ", cls.getName(), ")");
        }
        if (cls.isArray()) {
            throw 1BL.A0f("Cannot construct SimpleType for an array (class: ", cls.getName(), ")");
        }
        24W r0 = 24W.A00;
        return new C24c(A00(r0, cls.getSuperclass()), r0, cls, null, null, null, 0, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.24c, X.24b] */
    public static C24b A02(Class cls) {
        return new C24c(null, null, cls, null, null, null, 0, false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C24c c24c = (C24c) obj;
        if (((24S) c24c)._class == ((24S) this)._class) {
            return this._bindings.equals(c24c._bindings);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(A0U());
        sb.append(']');
        return sb.toString();
    }
}
