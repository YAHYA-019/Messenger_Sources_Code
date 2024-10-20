package X;

import java.io.Serializable;

/* renamed from: X.27I, reason: invalid class name */
/* loaded from: 27I.class */
public final class C27I implements Serializable {
    public static final long serialVersionUID = 1;
    public final C27L[] _abstractTypeResolvers;
    public final C27J[] _additionalDeserializers;
    public final C27P[] _additionalKeyDeserializers;
    public final C27K[] _modifiers;
    public final 27N[] _valueInstantiators;
    public static final C27J[] A02 = new C27J[0];
    public static final C27K[] A01 = new C27K[0];
    public static final C27L[] A00 = new C27L[0];
    public static final 27N[] A04 = new 27N[0];
    public static final C27P[] A03 = {new Object()};

    public C27I() {
        this(null, null, null, null, null);
    }

    public C27I(C27L[] c27lArr, C27K[] c27kArr, C27J[] c27jArr, C27P[] c27pArr, 27N[] r306) {
        this._additionalDeserializers = c27jArr == null ? A02 : c27jArr;
        this._additionalKeyDeserializers = c27pArr == null ? A03 : c27pArr;
        this._modifiers = c27kArr == null ? A01 : c27kArr;
        this._abstractTypeResolvers = c27lArr == null ? A00 : c27lArr;
        this._valueInstantiators = r306 == null ? A04 : r306;
    }
}
