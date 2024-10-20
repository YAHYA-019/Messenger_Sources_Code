package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.26a, reason: invalid class name */
/* loaded from: 26a.class */
public abstract class C26a extends C26c implements Serializable {
    public static final long serialVersionUID = 1;
    public transient 28Q A00;
    public transient ArrayList A01;
    public transient java.util.Map A02;

    public static IOException A00(28Q r301, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String A09 = 27C.A09(exc);
        if (A09 == null) {
            A09 = 0Pz.A0j("[no message for ", AnonymousClass001.A0Y(exc), "]");
        }
        return new C2cb(r301, A09, exc);
    }

    public static final void A01(28Q r301, JsonSerializer jsonSerializer, C26G c26g, C26a c26a, Object obj) {
        try {
            r301.A0b();
            C25p c25p = c26a._config;
            25L r307 = c26g._encodedSimple;
            if (r307 == null) {
                String str = c26g._simpleName;
                if (c25p == null) {
                    new 25K(str);
                } else {
                    C25s c25s = AnonymousClass253.A00;
                    new 25K(str);
                }
                c26g._encodedSimple = r307;
            }
            r301.A0i(r307);
            jsonSerializer.A0A(r301, c26a, obj);
            r301.A0Y();
        } catch (Exception e) {
            throw A00(r301, e);
        }
    }

    public static final void A02(28Q r301, JsonSerializer jsonSerializer, C26a c26a, Object obj) {
        try {
            jsonSerializer.A0A(r301, c26a, obj);
        } catch (Exception e) {
            throw A00(r301, e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.26c, X.26a] */
    public C26a A0a(C25p c25p, C26u c26u) {
        return new C26c(c25p, this, c26u);
    }

    public void A0b(28Q r302, Object obj) {
        this.A00 = r302;
        if (obj == null) {
            try {
                this._nullValueSerializer.A0A(r302, this, null);
                return;
            } catch (Exception e) {
                throw A00(r302, e);
            }
        }
        Class<?> cls = obj.getClass();
        JsonSerializer A0O = A0O(null, cls, true);
        C25p c25p = this._config;
        C26G c26g = c25p._rootName;
        if (c26g == null) {
            if (c25p.A0G(26D.A0A)) {
                A01(r302, A0O, c25p._rootNames.A00(c25p, cls), this, obj);
                return;
            }
        } else if (!c26g.A02()) {
            A01(r302, A0O, c26g, this, obj);
            return;
        }
        A02(r302, A0O, this, obj);
    }
}
