package com.facebook.katana.model;

import X.28P;
import X.C01s;
import X.EEw;
import com.facebook.ipc.model.FacebookUser;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: FacebookSessionInfo.class */
public class FacebookSessionInfo {
    public C01s A00;
    public List A01;
    public String activeUserId;
    public final String analyticsClaim;
    public final String errorData;
    public String mFilterKey;
    public FacebookUser mMyself;
    public final String machineID;
    public final String oAuthToken;
    public final String sessionKey;
    public final String sessionSecret;
    public final long userId;
    public String username;

    public FacebookSessionInfo() {
        this.username = null;
        this.sessionKey = null;
        this.sessionSecret = null;
        this.oAuthToken = null;
        this.machineID = null;
        this.errorData = null;
        this.userId = -1;
        this.A01 = null;
        this.analyticsClaim = null;
        this.activeUserId = null;
    }

    public FacebookSessionInfo(C01s c01s, FacebookUser facebookUser, String str, String str2, String str3, String str4, String str5, String str6, List list, long j) {
        this.username = str;
        this.sessionKey = str2;
        this.sessionSecret = str3;
        this.oAuthToken = str4;
        this.userId = j;
        this.machineID = str5;
        this.errorData = null;
        this.mFilterKey = null;
        this.mMyself = facebookUser;
        this.A01 = list;
        this.A00 = c01s;
        this.analyticsClaim = str6;
        this.activeUserId = null;
    }

    public List getSessionCookies() {
        List list = this.A01;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public void setSessionCookies(28P r302) {
        if (r302 == null) {
            this.A01 = null;
            return;
        }
        try {
            this.A01 = (List) 28P.A00(r302.A02, r302).A1V(new EEw(this));
        } catch (IOException unused) {
            this.A01 = null;
        }
    }
}
