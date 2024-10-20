package X;

import java.io.Serializable;

/* renamed from: X.26G, reason: invalid class name */
/* loaded from: 26G.class */
public final class C26G implements Serializable {
    public static final long serialVersionUID = 1;
    public 25L _encodedSimple;
    public final String _namespace;
    public final String _simpleName;
    public static final C26G A01 = new C26G("", null);
    public static final C26G A00 = new C26G(new String(""), null);

    public C26G(String str, String str2) {
        C27F[] c27fArr = 27C.A01;
        this._simpleName = str == null ? "" : str;
        this._namespace = str2;
    }

    public static C26G A00(String str) {
        return (str == null || str.isEmpty()) ? A01 : new C26G(C42i.A00.A00(str), null);
    }

    public static C26G A01(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? A01 : new C26G(C42i.A00.A00(str), str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r301._simpleName.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0._namespace
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            r0 = r301
            java.lang.String r0 = r0._simpleName
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L1d
        L19:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L1d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26G.A02():boolean");
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C26G c26g = (C26G) obj;
            String str = this._simpleName;
            String str2 = c26g._simpleName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this._namespace;
            String str4 = c26g._namespace;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this._namespace;
        return str == null ? this._simpleName.hashCode() : str.hashCode() ^ this._simpleName.hashCode();
    }

    public Object readResolve() {
        String str;
        return (this._namespace == null && ((str = this._simpleName) == null || "".equals(str))) ? A01 : this;
    }

    public String toString() {
        String str = this._namespace;
        return str == null ? this._simpleName : 0Pz.A0v("{", str, "}", this._simpleName);
    }
}
