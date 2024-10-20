package com.fasterxml.jackson.databind.deser.std;

import X.C27T;
import X.GOn;

/* loaded from: AtomicReferenceDeserializer.class */
public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer {
    public static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        return GOn.A1L(this._valueDeserializer.Azd(c27t));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, X.C42o
    public Object AUt(C27T c27t) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, X.C42o
    public /* bridge */ /* synthetic */ Object Azd(C27T c27t) {
        return GOn.A1L(this._valueDeserializer.Azd(c27t));
    }
}
