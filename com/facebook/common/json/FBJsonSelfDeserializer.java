package com.facebook.common.json;

import X.0Q8;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.C27T;
import X.C4V6;
import com.google.common.base.Throwables;
import java.io.IOException;

/* loaded from: FBJsonSelfDeserializer.class */
public class FBJsonSelfDeserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        try {
            A0Y();
            throw AnonymousClass001.A0Q("deserialize");
        } catch (Exception e) {
            Throwables.propagateIfPossible(e, IOException.class);
            C4V6.A01(abstractC01033pi, this.A00, e);
            throw 0Q8.createAndThrow();
        }
    }
}
