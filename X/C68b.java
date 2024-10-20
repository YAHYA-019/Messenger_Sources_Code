package X;

import java.io.Serializable;
import java.util.Set;

/* renamed from: X.68b, reason: invalid class name */
/* loaded from: 68b.class */
public final class C68b implements Serializable {
    public static final C68b A00 = new C68b(null);
    public static final long serialVersionUID = 1;
    public final Set _included;

    public C68b(Set set) {
        this._included = set;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj == null) {
                return false;
            }
            if (obj.getClass() == getClass()) {
                Set set = this._included;
                Set set2 = ((C68b) obj)._included;
                if (set == null) {
                    if (set2 == null) {
                        return true;
                    }
                } else if (set.equals(set2)) {
                    return true;
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Set set = this._included;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public String toString() {
        return String.format("JsonIncludeProperties.Value(included=%s)", this._included);
    }
}
