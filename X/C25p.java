package X;

import java.io.Serializable;

/* renamed from: X.25p, reason: invalid class name */
/* loaded from: 25p.class */
public final class C25p extends C25q implements Serializable {
    public static final int A00;
    public static final 25I A01 = new 25H();
    public static final long serialVersionUID = 1;
    public final 25I _defaultPrettyPrinter;
    public final AbstractC00983pb _filterProvider;
    public final int _formatWriteFeatures;
    public final int _formatWriteFeaturesToChange;
    public final int _generatorFeatures;
    public final int _generatorFeaturesToChange;
    public final int _serFeatures;

    static {
        int i = 0;
        for (Object obj : (Enum[]) 26D.class.getEnumConstants()) {
            AnonymousClass262 anonymousClass262 = (AnonymousClass262) obj;
            if (anonymousClass262.APc()) {
                i |= anonymousClass262.Ava();
            }
        }
        A00 = i;
    }

    public C25p(C24m c24m, C25b c25b, C25a c25a, 25Y r305, 25Z r306) {
        super(c24m, c25b, c25a, r305, r306);
        this._serFeatures = A00;
        this._filterProvider = null;
        this._defaultPrettyPrinter = A01;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    public C25p(C25p c25p, int i, int i2, int i3, int i4, int i5, long j) {
        super(c25p, j);
        this._serFeatures = i;
        this._filterProvider = null;
        this._defaultPrettyPrinter = c25p._defaultPrettyPrinter;
        this._generatorFeatures = i2;
        this._generatorFeaturesToChange = i3;
        this._formatWriteFeatures = i4;
        this._formatWriteFeaturesToChange = i5;
    }

    public C25p(C25p c25p, C24m c24m) {
        super(c24m, c25p);
        this._serFeatures = c25p._serFeatures;
        this._filterProvider = null;
        this._defaultPrettyPrinter = c25p._defaultPrettyPrinter;
        this._generatorFeatures = c25p._generatorFeatures;
        this._generatorFeaturesToChange = c25p._generatorFeaturesToChange;
        this._formatWriteFeatures = c25p._formatWriteFeatures;
        this._formatWriteFeaturesToChange = c25p._formatWriteFeaturesToChange;
    }

    @Override // X.C25q
    public /* bridge */ /* synthetic */ C25q A0C(C24m c24m) {
        return this._base == c24m ? this : new C25p(this, c24m);
    }

    public C25p A0E(26D r302) {
        int i = this._serFeatures;
        int i2 = i & (r302._mask ^ (-1));
        if (i2 == i) {
            return this;
        }
        return new C25p(this, i2, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange, this._mapperFeatures);
    }

    public void A0F(28Q r302) {
        26D r0 = 26D.A06;
        int i = this._serFeatures;
        if ((r0._mask & i) != 0 && r302.A00 == null) {
            25H r306 = this._defaultPrettyPrinter;
            if (r306 instanceof 25J) {
                r306 = ((25J) r306).AJw();
            }
            if (r306 != null) {
                r302.A00 = r306;
            }
        }
        boolean z = false;
        if ((i & 26D.A0B._mask) != 0) {
            z = true;
        }
        int i2 = this._generatorFeaturesToChange;
        if (i2 != 0 || z) {
            int i3 = this._generatorFeatures;
            if (z) {
                int i4 = 25E.A08._mask;
                i3 |= i4;
                i2 |= i4;
            }
            3sR r02 = (3sR) r302;
            int i5 = r02.A00;
            int i6 = (i3 & i2) | ((i2 ^ (-1)) & i5);
            int i7 = i5 ^ i6;
            if (i7 != 0) {
                r02.A00 = i6;
                r02.A0z(i6, i7);
            }
        }
    }

    public final boolean A0G(26D r302) {
        boolean z = false;
        if ((r302._mask & this._serFeatures) != 0) {
            z = true;
        }
        return z;
    }
}
