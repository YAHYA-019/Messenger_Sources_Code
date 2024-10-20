package com.facebook.user.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InstagramUserSerializer.class */
public class InstagramUserSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), InstagramUser.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        InstagramUser instagramUser = (InstagramUser) obj;
        if (instagramUser == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "instagramUserId", instagramUser.instagramUserId);
        AbstractC11224vw.A0D(r302, "userName", instagramUser.userName);
        AbstractC11224vw.A0D(r302, "profilePictureUrl", instagramUser.profilePictureUrl);
        r302.A0Y();
    }
}
