package com.facebook.ipc.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: FacebookProfileSerializer.class */
public class FacebookProfileSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), FacebookProfile.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        FacebookProfile facebookProfile = (FacebookProfile) obj;
        if (facebookProfile == null) {
            r302.A0Z();
        }
        r302.A0b();
        long j = facebookProfile.mId;
        r302.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r302.A0g(j);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, facebookProfile.mDisplayName);
        AbstractC11224vw.A0D(r302, "pic_square", facebookProfile.mImageUrl);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, facebookProfile.mTypeString);
        r302.A0Y();
    }
}
