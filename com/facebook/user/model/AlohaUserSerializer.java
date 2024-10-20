package com.facebook.user.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: AlohaUserSerializer.class */
public class AlohaUserSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), AlohaUser.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        AlohaUser alohaUser = (AlohaUser) obj;
        if (alohaUser == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "fbId", alohaUser.fbId);
        AbstractC11224vw.A05(r302, c26c, alohaUser.name, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r302.A0Y();
    }
}
