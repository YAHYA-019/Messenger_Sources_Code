package com.facebook.katana.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: FacebookSessionInfoSerializer.class */
public class FacebookSessionInfoSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), FacebookSessionInfo.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        FacebookSessionInfo facebookSessionInfo = (FacebookSessionInfo) obj;
        if (facebookSessionInfo == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "username", facebookSessionInfo.username);
        AbstractC11224vw.A0D(r302, "session_key", facebookSessionInfo.sessionKey);
        AbstractC11224vw.A0D(r302, "secret", facebookSessionInfo.sessionSecret);
        AbstractC11224vw.A0D(r302, "access_token", facebookSessionInfo.oAuthToken);
        long j = facebookSessionInfo.userId;
        r302.A0o(ErrorReportingConstants.USER_ID_KEY);
        r302.A0g(j);
        AbstractC11224vw.A0D(r302, "machine_id", facebookSessionInfo.machineID);
        AbstractC11224vw.A0D(r302, "error_data", facebookSessionInfo.errorData);
        AbstractC11224vw.A0D(r302, "filter", facebookSessionInfo.mFilterKey);
        AbstractC11224vw.A05(r302, c26c, facebookSessionInfo.mMyself, "profile");
        AbstractC11224vw.A0D(r302, "analytics_claim", facebookSessionInfo.analyticsClaim);
        AbstractC11224vw.A0D(r302, "active_uid", facebookSessionInfo.activeUserId);
        AbstractC11224vw.A06(r302, c26c, "session_cookies", facebookSessionInfo.getSessionCookies());
        r302.A0Y();
    }
}
