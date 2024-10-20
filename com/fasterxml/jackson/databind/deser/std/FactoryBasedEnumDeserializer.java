package com.fasterxml.jackson.databind.deser.std;

import X.24S;
import X.68S;
import X.68U;
import X.68W;
import X.7Rq;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass437;
import X.C26L;
import X.C27T;
import X.C42x;
import X.C68D;
import X.C68e;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: FactoryBasedEnumDeserializer.class */
public class FactoryBasedEnumDeserializer extends StdDeserializer implements AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public transient 7Rq A00;
    public final 68S[] _creatorProps;
    public final JsonDeserializer _deser;
    public final C68D _factory;
    public final boolean _hasArgs;
    public final 24S _inputType;
    public final 68W _valueInstantiator;

    public FactoryBasedEnumDeserializer(24S r302, 68W r303, C68D c68d, Class cls, 68S[] r306) {
        super(cls);
        this._factory = c68d;
        this._hasArgs = true;
        Class cls2 = r302._class;
        this._inputType = (AnonymousClass001.A1W(cls2, String.class) || cls2 == CharSequence.class) ? null : r302;
        this._deser = null;
        this._valueInstantiator = r303;
        this._creatorProps = r306;
    }

    public FactoryBasedEnumDeserializer(C68D c68d, Class cls) {
        super(cls);
        this._factory = c68d;
        this._hasArgs = false;
        this._inputType = null;
        this._deser = null;
        this._valueInstantiator = null;
        this._creatorProps = null;
    }

    public FactoryBasedEnumDeserializer(JsonDeserializer jsonDeserializer, FactoryBasedEnumDeserializer factoryBasedEnumDeserializer) {
        super(factoryBasedEnumDeserializer._valueClass);
        this._inputType = factoryBasedEnumDeserializer._inputType;
        this._factory = factoryBasedEnumDeserializer._factory;
        this._hasArgs = factoryBasedEnumDeserializer._hasArgs;
        this._valueInstantiator = factoryBasedEnumDeserializer._valueInstantiator;
        this._creatorProps = factoryBasedEnumDeserializer._creatorProps;
        this._deser = jsonDeserializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x027f, code lost:
    
        if ((r306 instanceof java.io.IOException) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
    
        if (r303.A0p(X.C26O.A0Q) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0193, code lost:
    
        if ((r308 instanceof X.2LE) != false) goto L48;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer.A0M(X.3pi, X.27T):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Enum;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean A0R(C26L c26l) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return this._deser == null ? A0M(abstractC01033pi, c27t) : c68e.A05(abstractC01033pi, c27t);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean A0W() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 68W A0i() {
        return this._valueInstantiator;
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        24S r0;
        return (this._deser == null && (r0 = this._inputType) != null && this._creatorProps == null) ? new FactoryBasedEnumDeserializer(c27t.A0G(r302, r0), this) : this;
    }
}
