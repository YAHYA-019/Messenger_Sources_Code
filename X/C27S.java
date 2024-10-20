package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.27S, reason: invalid class name */
/* loaded from: 27S.class */
public abstract class C27S extends C27T implements Serializable {
    public static final long serialVersionUID = 1;
    public transient LinkedHashMap A00;
    public List _objectIdResolvers;

    public Object A0q(AbstractC01033pi abstractC01033pi, 24S r303, JsonDeserializer jsonDeserializer, Object obj) {
        Object A0M;
        Object[] objArr;
        String str;
        C26L c26l = this._config;
        C26G c26g = c26l._rootName;
        if (c26g != null ? !c26g.A02() : c26l.A0F(C26O.A0K)) {
            if (c26g == null) {
                c26g = c26l._rootNames.A00(c26l, r303._class);
            }
            String str2 = c26g._simpleName;
            C42h A1I = abstractC01033pi.A1I();
            C42h c42h = C42h.A06;
            if (A1I != c42h) {
                C27F[] c27fArr = 27C.A01;
                objArr = new Object[]{str2 == null ? "[null]" : 27C.A08(str2), A1I};
                str = "Current token not START_OBJECT (needed to unwrap root name %s), but %s";
            } else {
                C42h A1K = abstractC01033pi.A1K();
                c42h = C42h.A03;
                if (A1K != c42h) {
                    C27F[] c27fArr2 = 27C.A01;
                    objArr = new Object[]{str2 == null ? "[null]" : 27C.A08(str2), abstractC01033pi.A1I()};
                    str = "Current token not FIELD_NAME (to contain expected root name %s), but %s";
                } else {
                    String A1X = abstractC01033pi.A1X();
                    if (!str2.equals(A1X)) {
                        A0c(r303, A1X, "Root name (%s) does not match expected (%s) for type %s", A1X == null ? "[null]" : 27C.A08(A1X), 27C.A08(str2), 27C.A04(r303));
                        throw 0Q8.createAndThrow();
                    }
                    abstractC01033pi.A1K();
                    A0M = obj == null ? jsonDeserializer.A0M(abstractC01033pi, this) : jsonDeserializer.A0N(abstractC01033pi, this, obj);
                    C42h A1K2 = abstractC01033pi.A1K();
                    c42h = C42h.A02;
                    if (A1K2 != c42h) {
                        objArr = new Object[]{27C.A08(str2), abstractC01033pi.A1I()};
                        str = "Current token not END_OBJECT (to match wrapper object with root name %s), but %s";
                    }
                }
            }
            A0Z(c42h, r303, str, objArr);
            throw 0Q8.createAndThrow();
        }
        if (obj != null) {
            return jsonDeserializer.A0N(abstractC01033pi, this, obj);
        }
        A0M = jsonDeserializer.A0M(abstractC01033pi, this);
        return A0M;
    }
}
