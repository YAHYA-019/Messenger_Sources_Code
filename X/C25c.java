package X;

import java.io.Serializable;

/* renamed from: X.25c, reason: invalid class name */
/* loaded from: 25c.class */
public final class C25c implements Serializable {
    public static final C25c A00;
    public static final long serialVersionUID = 1;
    public final Class _contentFilter;
    public final C25d _contentInclusion;
    public final Class _valueFilter;
    public final C25d _valueInclusion;

    static {
        C25d c25d = C25d.USE_DEFAULTS;
        A00 = new C25c(c25d, c25d, null, null);
    }

    public C25c(C25d c25d, C25d c25d2, Class cls, Class cls2) {
        this._valueInclusion = c25d == null ? C25d.USE_DEFAULTS : c25d;
        this._contentInclusion = c25d2 == null ? C25d.USE_DEFAULTS : c25d2;
        this._valueFilter = cls == Void.class ? null : cls;
        this._contentFilter = cls2 == Void.class ? null : cls2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        if (1 == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (1 == 1) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.25d, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.25d, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.25d, java.lang.Class] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C25c A00(X.C25c r302) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25c.A00(X.25c):X.25c");
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C25c c25c = (C25c) obj;
            if (c25c._valueInclusion != this._valueInclusion || c25c._contentInclusion != this._contentInclusion || c25c._valueFilter != this._valueFilter || c25c._contentFilter != this._contentFilter) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this._contentInclusion, this._valueInclusion.hashCode() << 2);
    }

    public Object readResolve() {
        C25d c25d = this._valueInclusion;
        C25d c25d2 = C25d.USE_DEFAULTS;
        return (c25d == c25d2 && this._contentInclusion == c25d2 && this._valueFilter == null && this._contentFilter == null) ? A00 : this;
    }

    public String toString() {
        StringBuilder A0l = AnonymousClass001.A0l(80);
        A0l.append("JsonInclude.Value(value=");
        A0l.append(this._valueInclusion);
        A0l.append(",content=");
        A0l.append(this._contentInclusion);
        Class cls = this._valueFilter;
        if (cls != null) {
            1BL.A1C(cls, ",valueFilter=", A0l);
            A0l.append(".class");
        }
        Class cls2 = this._contentFilter;
        if (cls2 != null) {
            1BL.A1C(cls2, ",contentFilter=", A0l);
            A0l.append(".class");
        }
        return AnonymousClass001.A0g(A0l, ')');
    }
}
