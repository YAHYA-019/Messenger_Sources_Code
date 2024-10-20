package com.facebook.auth.credentials;

import X.AbstractC01033pi;
import X.C27T;
import X.DKr;
import com.facebook.common.json.FbJsonDeserializer;

/* loaded from: SessionCookieDeserializer.class */
public class SessionCookieDeserializer extends FbJsonDeserializer {
    public SessionCookieDeserializer() {
        this.A00 = SessionCookie.class;
    }

    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return DKr.A00(abstractC01033pi);
    }
}
