package X;

import java.io.Serializable;

/* renamed from: X.25g, reason: invalid class name */
/* loaded from: 25g.class */
public final class C25g implements Serializable {
    public static final C25g A00;
    public static final long serialVersionUID = 1;
    public final C25h _contentNulls;
    public final C25h _nulls;

    static {
        C25h c25h = C25h.DEFAULT;
        A00 = new C25g(c25h, c25h);
    }

    public C25g(C25h c25h, C25h c25h2) {
        this._nulls = c25h;
        this._contentNulls = c25h2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C25g c25g = (C25g) obj;
            if (c25g._nulls != this._nulls || c25g._contentNulls != this._contentNulls) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this._nulls.ordinal() + (this._contentNulls.ordinal() << 2);
    }

    public Object readResolve() {
        C25h c25h = this._nulls;
        C25h c25h2 = this._contentNulls;
        C25h c25h3 = C25h.DEFAULT;
        return (c25h == c25h3 && c25h2 == c25h3) ? A00 : this;
    }

    public String toString() {
        return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this._nulls, this._contentNulls);
    }
}
