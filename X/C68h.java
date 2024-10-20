package X;

import java.io.Serializable;

/* renamed from: X.68h, reason: invalid class name */
/* loaded from: 68h.class */
public final class C68h implements C42o, Serializable {
    public static final long serialVersionUID = 1;
    public final C68i _access;
    public final Object _nullValue;
    public static final C68h A01 = new C68h(null);
    public static final C68h A00 = new C68h(null);

    public C68h(Object obj) {
        this._nullValue = obj;
        this._access = obj == null ? C68i.ALWAYS_NULL : C68i.CONSTANT;
    }

    @Override // X.C42o
    public /* synthetic */ Object AUt(C27T c27t) {
        return this._nullValue;
    }

    @Override // X.C42o
    public Object Azd(C27T c27t) {
        return this._nullValue;
    }
}
