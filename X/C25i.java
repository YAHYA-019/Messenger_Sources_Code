package X;

import java.io.Serializable;

/* renamed from: X.25i, reason: invalid class name */
/* loaded from: 25i.class */
public final class C25i implements C25j, Serializable {
    public static final C25i A00;
    public static final C25i A01;
    public static final long serialVersionUID = 1;
    public final C25k _creatorMinLevel;
    public final C25k _fieldMinLevel;
    public final C25k _getterMinLevel;
    public final C25k _isGetterMinLevel;
    public final C25k _setterMinLevel;

    static {
        C25k c25k = C25k.PUBLIC_ONLY;
        C25k c25k2 = C25k.ANY;
        A01 = new C25i(c25k, c25k, c25k2, c25k2, c25k);
        A00 = new C25i(c25k, c25k, c25k, c25k, c25k);
    }

    public C25i(C25k c25k) {
        this._getterMinLevel = c25k;
        this._isGetterMinLevel = c25k;
        this._setterMinLevel = c25k;
        this._creatorMinLevel = c25k;
        this._fieldMinLevel = c25k;
    }

    public C25i(C25k c25k, C25k c25k2, C25k c25k3, C25k c25k4, C25k c25k5) {
        this._getterMinLevel = c25k;
        this._isGetterMinLevel = c25k2;
        this._setterMinLevel = c25k3;
        this._creatorMinLevel = c25k4;
        this._fieldMinLevel = c25k5;
    }

    public String toString() {
        return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
    }
}
