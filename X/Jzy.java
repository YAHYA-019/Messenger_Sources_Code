package X;

import java.io.Serializable;

/* loaded from: Jzy.class */
public final class Jzy extends 7Rp implements Serializable {
    public static final long serialVersionUID = 1;
    public final Class[] _views;

    public Jzy(Class[] clsArr) {
        this._views = clsArr;
    }

    public boolean A00(Class cls) {
        int length = this._views.length;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            Class cls2 = this._views[i2];
            if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                break;
            }
            i = i2 + 1;
        }
        z = true;
        return z;
    }
}
