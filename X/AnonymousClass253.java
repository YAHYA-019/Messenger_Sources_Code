package X;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: X.253, reason: invalid class name */
/* loaded from: 253.class */
public abstract class AnonymousClass253 implements C24z, Serializable {
    public static final long serialVersionUID = 2;
    public final C24m _base;
    public final long _mapperFeatures;
    public static final C25c A01 = C25c.A00;
    public static final C25s A00 = C25s.A01;

    public AnonymousClass253(C24m c24m, long j) {
        this._base = c24m;
        this._mapperFeatures = j;
    }

    public AnonymousClass253(C24m c24m, AnonymousClass253 anonymousClass253) {
        this._base = c24m;
        this._mapperFeatures = anonymousClass253._mapperFeatures;
    }

    public AnonymousClass253(AnonymousClass253 anonymousClass253, long j) {
        this._base = anonymousClass253._base;
        this._mapperFeatures = j;
    }

    public C25s A00(Class cls) {
        C25y c25y;
        Boolean bool;
        C25b c25b = ((C25q) this)._configOverrides;
        java.util.Map map = c25b._overrides;
        if (map != null && (c25y = (C25y) map.get(cls)) != null) {
            C25s c25s = c25y._format;
            if (c25s != null) {
                Boolean bool2 = c25s._lenient;
                if (bool2 == null && (bool = c25b._defaultLeniency) != bool2) {
                    c25s = new C25s(c25s._features, c25s._shape, bool, c25s._pattern, c25s._timezoneStr, c25s._locale, c25s.A00);
                }
                return c25s;
            }
        }
        Boolean bool3 = c25b._defaultLeniency;
        return bool3 == null ? C25s.A01 : new C25s(C25v.A02, null, bool3, "", null, null, null);
    }

    public C25c A01(Class cls) {
        C25q c25q = (C25q) this;
        C25c c25c = c25q.A03(cls)._include;
        C25c c25c2 = c25q._configOverrides._defaultInclusion;
        if (c25c2 != null) {
            c25c = c25c2.A00(c25c);
        }
        return c25c;
    }

    public AnonymousClass248 A02() {
        return (this._mapperFeatures & AnonymousClass260.A0P._mask) != 0 ? this._base._annotationIntrospector : Jxc.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r303 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C25y A03(java.lang.Class r302) {
        /*
            r301 = this;
            r0 = r301
            r303 = r0
            r0 = r301
            X.25q r0 = (X.C25q) r0
            X.25b r0 = r0._configOverrides
            java.util.Map r0 = r0._overrides
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L20
            r0 = r303
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            X.25y r0 = (X.C25y) r0
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L24
        L20:
            X.25y r0 = X.C25q.A01
            r303 = r0
        L24:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass253.A03(java.lang.Class):X.25y");
    }

    public AnonymousClass251 A04(24S r302) {
        AnonymousClass251 A012 = C24p.A01(r302, this);
        if (A012 == null) {
            A012 = new AnonymousClass251(r302, this, C67f.A00(r302, this, this), Collections.emptyList());
        }
        return A012;
    }

    public AnonymousClass251 A05(Class cls) {
        return A04(this._base._typeFactory.A09(cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        if (r314 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e7, code lost:
    
        if (r314 == r0) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C25j A06(X.C24q r302, java.lang.Class r303) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass253.A06(X.24q, java.lang.Class):X.25j");
    }

    public final boolean A07() {
        boolean z = false;
        if ((this._mapperFeatures & AnonymousClass260.A0E._mask) != 0) {
            z = true;
        }
        return z;
    }

    public final boolean A08() {
        boolean z = false;
        if ((this._mapperFeatures & AnonymousClass260.A0P._mask) != 0) {
            z = true;
        }
        return z;
    }

    public final boolean A09(AnonymousClass260 anonymousClass260) {
        boolean z = false;
        if ((this._mapperFeatures & anonymousClass260._mask) != 0) {
            z = true;
        }
        return z;
    }
}
