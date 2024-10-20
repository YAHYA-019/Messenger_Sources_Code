package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* loaded from: Jyn.class */
public class Jyn extends Jyp implements Serializable {
    public static final long serialVersionUID = 1;

    public static Object A01(AbstractC01033pi abstractC01033pi, C27T c27t, Jyn jyn) {
        C42h c42h;
        24S r308;
        Object[] objArr;
        String str;
        String A1Z;
        Object A1U;
        if (abstractC01033pi.A1k() && (A1U = abstractC01033pi.A1U()) != null) {
            return jyn.A0A(c27t, A1U instanceof String ? (String) A1U : String.valueOf(A1U)).A0M(abstractC01033pi, c27t);
        }
        boolean A1p = abstractC01033pi.A1p();
        if (A1p) {
            C42h A1K = abstractC01033pi.A1K();
            c42h = C42h.A0C;
            if (A1K != c42h) {
                r308 = jyn._baseType;
                objArr = new Object[]{r308._class.getName()};
                str = "need JSON String that contains type id (for subtype of %s)";
                c27t.A0Z(c42h, r308, str, objArr);
                throw 0Q8.createAndThrow();
            }
            A1Z = abstractC01033pi.A1Z();
            abstractC01033pi.A1K();
        } else {
            if (jyn._defaultImpl == null) {
                24S r0 = jyn._baseType;
                c27t.A0Z(C42h.A05, r0, JQx.A0v(r0._class, "need JSON Array to contain As.WRAPPER_ARRAY type information for class "), new Object[0]);
                throw 0Q8.createAndThrow();
            }
            3dA r02 = jyn._idResolver;
            A1Z = r02.BOT(r02.A00._class, (Object) null);
        }
        JsonDeserializer A0A = jyn.A0A(c27t, A1Z);
        if (jyn._typeIdVisible && !(jyn instanceof Jyk)) {
            abstractC01033pi = Jyp.A02(abstractC01033pi, C42h.A06, c27t, jyn, A1Z);
        }
        if (A1p && abstractC01033pi.A1I() == C42h.A01) {
            return A0A.Azd(c27t);
        }
        Object A0M = A0A.A0M(abstractC01033pi, c27t);
        if (A1p) {
            C42h A1K2 = abstractC01033pi.A1K();
            c42h = C42h.A01;
            if (A1K2 != c42h) {
                r308 = jyn._baseType;
                objArr = new Object[0];
                str = "expected closing END_ARRAY after type information and deserialized value";
                c27t.A0Z(c42h, r308, str, objArr);
                throw 0Q8.createAndThrow();
            }
        }
        return A0M;
    }

    @Override // X.C68e
    public KN1 A03() {
        return this instanceof Jym ? ((Jym) this)._inclusion : this instanceof Jyk ? KN1.EXTERNAL_PROPERTY : KN1.WRAPPER_ARRAY;
    }

    @Override // X.C68e
    public C68e A04(68U r302) {
        Jym jym;
        if (this instanceof Jyk) {
            if (r302 != this._property) {
                return new Jyp(r302, this);
            }
        } else {
            if (this instanceof Jym) {
                Jym jym2 = (Jym) this;
                if (jym2 instanceof Jyl) {
                    Jyl jyl = (Jyl) jym2;
                    68U r0 = jyl._property;
                    jym = jyl;
                    if (r302 != r0) {
                        return new Jyl(r302, jyl);
                    }
                } else {
                    68U r02 = jym2._property;
                    jym = jym2;
                    if (r302 != r02) {
                        return new Jym(r302, jym2);
                    }
                }
                return jym;
            }
            if (r302 != this._property) {
                return new Jyp(r302, this);
            }
        }
        return this;
    }

    @Override // X.C68e
    public Object A05(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return (!(this instanceof Jym) || abstractC01033pi.A1u(C42h.A05)) ? A01(abstractC01033pi, c27t, this) : A07(abstractC01033pi, c27t);
    }

    @Override // X.C68e
    public Object A06(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return A01(abstractC01033pi, c27t, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (r307 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0168, code lost:
    
        if (r306 != X.C42h.A03) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r305v1, types: [X.Jyp, X.Jym] */
    /* JADX WARN: Type inference failed for: r305v2 */
    /* JADX WARN: Type inference failed for: r305v3, types: [X.Jyp, X.Jym, X.Jyl] */
    @Override // X.C68e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jyn.A07(X.3pi, X.27T):java.lang.Object");
    }

    @Override // X.C68e
    public Object A08(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return A01(abstractC01033pi, c27t, this);
    }
}
