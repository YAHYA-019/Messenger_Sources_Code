package X;

import java.io.Serializable;
import java.util.Set;

/* renamed from: X.24j, reason: invalid class name */
/* loaded from: 24j.class */
public abstract class C24j implements Serializable {
    public static final long serialVersionUID = 1;

    public Integer A00(24S r302, 24S r303, AnonymousClass253 anonymousClass253) {
        if (this instanceof C24h) {
            return 0S2.A00;
        }
        3pZ[] r0 = ((AnonymousClass256) this)._subClassMatchers;
        if (r0 == null || 0 >= r0.length) {
            return 0S2.A0C;
        }
        throw AnonymousClass001.A0Q("match");
    }

    public Integer A01(24S r302, AnonymousClass253 anonymousClass253) {
        if (!(this instanceof C24h)) {
            AnonymousClass256 anonymousClass256 = (AnonymousClass256) this;
            Class cls = r302._class;
            Set set = anonymousClass256._invalidBaseTypes;
            if (set != null && set.contains(cls)) {
                return 0S2.A01;
            }
            3pZ[] r0 = anonymousClass256._baseTypeMatchers;
            if (r0 != null && 0 < r0.length) {
                throw AnonymousClass001.A0Q("match");
            }
        }
        return 0S2.A0C;
    }

    public Integer A02(24S r302, AnonymousClass253 anonymousClass253, String str) {
        if (this instanceof C24h) {
            return 0S2.A00;
        }
        AbstractC00973pa[] abstractC00973paArr = ((AnonymousClass256) this)._subTypeNameMatchers;
        if (abstractC00973paArr == null || 0 >= abstractC00973paArr.length) {
            return 0S2.A0C;
        }
        throw AnonymousClass001.A0Q("match");
    }
}
