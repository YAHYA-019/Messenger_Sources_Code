package com.facebook.ipc.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: FacebookUserSerializer.class */
public class FacebookUserSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), FacebookUser.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        FacebookUser facebookUser = (FacebookUser) obj;
        if (facebookUser == null) {
            r302.A0Z();
        }
        r302.A0b();
        long j = facebookUser.mUserId;
        r302.A0o(ErrorReportingConstants.USER_ID_KEY);
        r302.A0g(j);
        AbstractC11224vw.A0D(r302, "first_name", facebookUser.mFirstName);
        AbstractC11224vw.A0D(r302, "last_name", facebookUser.mLastName);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, facebookUser.mDisplayName);
        AbstractC11224vw.A0D(r302, "pic_square", facebookUser.mImageUrl);
        AbstractC11224vw.A05(r302, c26c, facebookUser.mCoverPhoto, "pic_cover");
        r302.A0Y();
    }
}
