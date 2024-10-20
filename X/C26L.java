package X;

import java.io.Serializable;

/* renamed from: X.26L, reason: invalid class name */
/* loaded from: 26L.class */
public final class C26L extends C25q implements Serializable {
    public static final int A00;
    public static final long serialVersionUID = 2;
    public final C25l _coercionConfigs;
    public final C01003pd _ctorDetector;
    public final int _deserFeatures;
    public final int _formatReadFeatures;
    public final int _formatReadFeaturesToChange;
    public final C26T _nodeFactory;
    public final int _parserFeatures;
    public final int _parserFeaturesToChange;
    public final C00993pc _problemHandlers;

    static {
        int i = 0;
        for (Object obj : (Enum[]) C26O.class.getEnumConstants()) {
            AnonymousClass262 anonymousClass262 = (AnonymousClass262) obj;
            if (anonymousClass262.APc()) {
                i |= anonymousClass262.Ava();
            }
        }
        A00 = i;
    }

    public C26L(C24m c24m, C25l c25l, C25b c25b, C25a c25a, 25Y r306, 25Z r307) {
        super(c24m, c25b, c25a, r306, r307);
        this._deserFeatures = A00;
        this._problemHandlers = null;
        this._nodeFactory = C26T.A00;
        this._ctorDetector = null;
        this._coercionConfigs = c25l;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    public C26L(C26L c26l, int i, int i2, int i3, int i4, int i5, long j) {
        super(c26l, j);
        this._deserFeatures = i;
        this._problemHandlers = c26l._problemHandlers;
        this._nodeFactory = c26l._nodeFactory;
        this._coercionConfigs = c26l._coercionConfigs;
        this._ctorDetector = c26l._ctorDetector;
        this._parserFeatures = i2;
        this._parserFeaturesToChange = i3;
        this._formatReadFeatures = i4;
        this._formatReadFeaturesToChange = i5;
    }

    public C26L(C26L c26l, C24m c24m) {
        super(c24m, c26l);
        this._deserFeatures = c26l._deserFeatures;
        this._problemHandlers = c26l._problemHandlers;
        this._nodeFactory = c26l._nodeFactory;
        this._coercionConfigs = c26l._coercionConfigs;
        this._ctorDetector = c26l._ctorDetector;
        this._parserFeatures = c26l._parserFeatures;
        this._parserFeaturesToChange = c26l._parserFeaturesToChange;
        this._formatReadFeatures = c26l._formatReadFeatures;
        this._formatReadFeaturesToChange = c26l._formatReadFeaturesToChange;
    }

    @Override // X.C25q
    public /* bridge */ /* synthetic */ C25q A0C(C24m c24m) {
        return this._base == c24m ? this : new C26L(this, c24m);
    }

    public AnonymousClass251 A0E(24S r302) {
        AnonymousClass251 A01 = C24p.A01(r302, this);
        if (A01 == null) {
            A01 = C24p.A00(r302, this);
            if (A01 == null) {
                A01 = new AnonymousClass251(C24p.A02(r302, this, this, false));
            }
        }
        return A01;
    }

    public final boolean A0F(C26O c26o) {
        boolean z = false;
        if ((c26o._mask & this._deserFeatures) != 0) {
            z = true;
        }
        return z;
    }
}
