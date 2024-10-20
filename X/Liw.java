package X;

import java.io.Serializable;

/* loaded from: Liw.class */
public final class Liw implements Comparable, Serializable {
    public static final long serialVersionUID = 1;
    public Class _class;
    public String _className;
    public int _hashCode;

    public Liw() {
        this._class = null;
        this._className = null;
        this._hashCode = 0;
    }

    public Liw(Class cls) {
        A00(this, cls);
    }

    public static void A00(Liw liw, Class cls) {
        liw._class = cls;
        String name = cls.getName();
        liw._className = name;
        liw._hashCode = name.hashCode();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this._className.compareTo(((Liw) obj)._className);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            if (((Liw) obj)._class != this._class) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public String toString() {
        return this._className;
    }
}
