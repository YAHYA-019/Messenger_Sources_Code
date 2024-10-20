package com.facebook.messaging.avatar.avatarprofile.api;

import X.11T;
import X.2Jf;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.EA8;
import X.F9Q;
import X.Fs6;
import X.Jvn;
import X.RoX;

/* loaded from: ProfilePictureSyncStatusDataFetch.class */
public final class ProfilePictureSyncStatusDataFetch extends 5iK {
    public EA8 A00;
    public 5iJ A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.messaging.avatar.avatarprofile.api.ProfilePictureSyncStatusDataFetch] */
    public static ProfilePictureSyncStatusDataFetch create(5iJ r301, EA8 ea8) {
        ?? obj = new Object();
        obj.A01 = r301;
        obj.A00 = ea8;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A01;
        11T.A0F(r0, 0);
        F9Q f9q = new F9Q((2Jf) null, new RoX());
        f9q.A02(0L);
        return Jvn.A00(F9Q.A00(r0, f9q, 160562339816799L), r0, new Fs6(r0, 1));
    }
}
