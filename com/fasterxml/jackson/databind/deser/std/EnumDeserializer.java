package com.fasterxml.jackson.databind.deser.std;

import X.2Go;
import X.3eV;
import X.3eW;
import X.68U;
import X.AnonymousClass437;
import X.C27T;
import X.C42x;
import X.C68k;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: EnumDeserializer.class */
public class EnumDeserializer extends StdScalarDeserializer implements AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public final Boolean _caseInsensitive;
    public final Enum _enumDefaultValue;
    public Object[] _enumsByIndex;
    public final boolean _isFromIntValue;
    public final 3eV _lookupByName;
    public 3eV _lookupByToString;

    public EnumDeserializer(3eW r302, Boolean bool) {
        super(r302._enumClass);
        this._lookupByName = r302.A01();
        this._enumsByIndex = r302._enums;
        this._enumDefaultValue = r302._defaultValue;
        this._caseInsensitive = bool;
        this._isFromIntValue = r302._isFromIntValue;
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super(enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this._enumDefaultValue = enumDeserializer._enumDefaultValue;
        this._caseInsensitive = bool;
        this._isFromIntValue = enumDeserializer._isFromIntValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x020d, code lost:
    
        if (r309 == null) goto L67;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumDeserializer.A0M(X.3pi, X.27T):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Enum;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        return this._enumDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean A0W() {
        return true;
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        Boolean A0j = A0j(C68k.A00, r302, c27t, A0S());
        if (A0j == null) {
            A0j = this._caseInsensitive;
        }
        return 2Go.A00(this._caseInsensitive, A0j) ? this : new EnumDeserializer(this, A0j);
    }
}
