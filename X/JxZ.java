package X;

/* loaded from: JxZ.class */
public abstract class JxZ extends 3eQ {
    public final Class _scope;

    public JxZ(Class cls) {
        this._scope = cls;
    }

    public boolean A02(3eQ r302) {
        boolean z;
        if (this instanceof JxX) {
            JxX jxX = (JxX) this;
            z = false;
            if (r302.getClass() == jxX.getClass()) {
                JxX jxX2 = (JxX) r302;
                if (jxX2._scope == jxX._scope && jxX2._property == jxX._property) {
                    z = true;
                }
            }
        } else {
            if (r302.getClass() != getClass()) {
                return false;
            }
            z = true;
            if (((JxZ) r302)._scope != this._scope) {
                return false;
            }
        }
        return z;
    }
}
