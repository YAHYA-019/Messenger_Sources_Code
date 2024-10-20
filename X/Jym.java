package X;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: Jym.class */
public class Jym extends Jyn {
    public static final long serialVersionUID = 1;
    public final KN1 _inclusion;
    public final String _msgForMissingId;

    public Jym(68U r302, Jym jym) {
        super(r302, jym);
        Object[] objArr;
        String str;
        68U r0 = this._property;
        if (r0 == null) {
            objArr = new Object[]{this._typePropertyName};
            str = "missing type id property '%s'";
        } else {
            objArr = new Object[]{this._typePropertyName, r0.getName()};
            str = "missing type id property '%s' (for POJO property '%s')";
        }
        this._msgForMissingId = String.format(str, objArr);
        this._inclusion = jym._inclusion;
    }

    public Jym(KN1 kn1, 24S r303, 24S r304, MKA mka, String str, boolean z) {
        super(r303, r304, mka, str, z);
        Object[] objArr;
        String str2;
        68U r0 = this._property;
        if (r0 == null) {
            objArr = new Object[]{this._typePropertyName};
            str2 = "missing type id property '%s'";
        } else {
            objArr = new Object[]{this._typePropertyName, r0.getName()};
            str2 = "missing type id property '%s' (for POJO property '%s')";
        }
        this._msgForMissingId = String.format(str2, objArr);
        this._inclusion = kn1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r304 != null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.4Qi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0B(X.AbstractC01033pi r302, X.C27T r303, X.28P r304, java.lang.String r305) {
        /*
            r301 = this;
            r0 = r301
            r1 = r303
            r2 = r305
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0.A0A(r1, r2)
            r306 = r0
            r0 = r301
            boolean r0 = r0._typeIdVisible
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L65
            r0 = r304
            if (r0 != 0) goto L22
            X.28P r0 = new X.28P
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r303
            r0.<init>(r1, r2)
        L22:
            r0 = r302
            java.lang.String r0 = r0.A1X()
            r308 = r0
            r0 = r304
            r1 = r308
            r0.A0o(r1)
            r0 = r304
            r1 = r305
            r0.A0r(r1)
        L34:
            r0 = r302
            r0.A1g()
            r0 = r304
            r1 = r302
            X.4rL r0 = r0.A0y(r1)
            r308 = r0
            r0 = r308
            r1 = r302
            X.4Qi r0 = X.C4Qi.A00(r0, r1)
            r302 = r0
        L46:
            r0 = r302
            X.42h r0 = r0.A1I()
            r309 = r0
            X.42h r0 = X.C42h.A02
            r308 = r0
            r0 = r309
            r1 = r308
            if (r0 == r1) goto L5d
            r0 = r302
            X.42h r0 = r0.A1K()
        L5d:
            r0 = r306
            r1 = r302
            r2 = r303
            java.lang.Object r0 = r0.A0M(r1, r2)
            return r0
        L65:
            r0 = r304
            if (r0 == 0) goto L46
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jym.A0B(X.3pi, X.27T, X.28P, java.lang.String):java.lang.Object");
    }

    public Object A0C(AbstractC01033pi abstractC01033pi, C27T c27t, 28P r304, String str) {
        if (this._defaultImpl == null) {
            Object A00 = C68e.A00(abstractC01033pi, this._baseType);
            if (A00 == null) {
                if (abstractC01033pi.A1p()) {
                    A00 = Jyn.A01(abstractC01033pi, c27t, this);
                } else if (abstractC01033pi.A1u(C42h.A0C) && c27t.A0p(C26O.A02) && abstractC01033pi.A1Z().trim().isEmpty()) {
                    return null;
                }
            }
            return A00;
        }
        JsonDeserializer A09 = A09(c27t);
        if (A09 != null) {
            if (r304 != null) {
                r304.A0Y();
                abstractC01033pi = r304.A0y(abstractC01033pi);
                abstractC01033pi.A1K();
            }
            return A09.A0M(abstractC01033pi, c27t);
        }
        24S r0 = this._baseType;
        if (c27t._config._problemHandlers != null) {
            throw AnonymousClass001.A0Q("handleMissingTypeId");
        }
        String format = String.format("Could not resolve subtype of %s", r0);
        AbstractC01033pi abstractC01033pi2 = c27t.A00;
        if (str != null) {
            format = 0Pz.A0j(format, ": ", str);
        }
        throw new 3BQ(abstractC01033pi2, r0, format, (String) null);
    }
}
