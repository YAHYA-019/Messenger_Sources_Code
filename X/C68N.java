package X;

import java.io.Serializable;

/* renamed from: X.68N, reason: invalid class name */
/* loaded from: 68N.class */
public final class C68N implements Serializable {
    public static final long serialVersionUID = 255;
    public final transient 7Rn A00;
    public C25h _contentNulls;
    public final String _defaultValue;
    public final String _description;
    public final Integer _index;
    public final Boolean _required;
    public C25h _valueNulls;
    public static final C68N A02 = new C68N(null, null, null, Boolean.TRUE, null, null, null);
    public static final C68N A01 = new C68N(null, null, null, Boolean.FALSE, null, null, null);
    public static final C68N A03 = new C68N(null, null, null, null, null, null, null);

    public C68N(C25h c25h, C25h c25h2, 7Rn r304, Boolean bool, Integer num, String str, String str2) {
        this._required = bool;
        this._description = str;
        this._index = num;
        this._defaultValue = (str2 == null || str2.isEmpty()) ? null : str2;
        this.A00 = r304;
        this._valueNulls = c25h;
        this._contentNulls = c25h2;
    }

    public static C68N A00(Boolean bool, Integer num, String str, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? A03 : bool.booleanValue() ? A02 : A01 : new C68N(null, null, null, bool, num, str, str2);
    }

    public C68N A01(7Rn r302) {
        Boolean bool = this._required;
        String str = this._description;
        return new C68N(this._valueNulls, this._contentNulls, r302, bool, this._index, str, this._defaultValue);
    }

    public Object readResolve() {
        if (this._description != null || this._index != null || this._defaultValue != null || this.A00 != null || this._valueNulls != null || this._contentNulls != null) {
            return this;
        }
        Boolean bool = this._required;
        return bool == null ? A03 : bool.booleanValue() ? A02 : A01;
    }
}
