package com.facebook.user.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: AlohaProxyUserSerializer.class */
public class AlohaProxyUserSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), AlohaProxyUser.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        AlohaProxyUser alohaProxyUser = (AlohaProxyUser) obj;
        if (alohaProxyUser == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "fbId", alohaProxyUser.fbId);
        AbstractC11224vw.A0D(r302, "alohaUserName", alohaProxyUser.alohaUserName);
        r302.A0Y();
    }
}
