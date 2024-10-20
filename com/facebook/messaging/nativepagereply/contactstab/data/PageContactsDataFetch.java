package com.facebook.messaging.nativepagereply.contactstab.data;

import X.0RZ;
import X.1G1;
import X.2Jf;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.AbF;
import X.C30G;
import X.EAB;
import X.F9Q;
import X.GEs;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: PageContactsDataFetch.class */
public final class PageContactsDataFetch extends 5iK {
    public int A00;
    public FbUserSession A01;
    public EAB A02;
    public 5iJ A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.nativepagereply.contactstab.data.PageContactsDataFetch, java.lang.Object] */
    public static PageContactsDataFetch create(5iJ r301, EAB eab) {
        ?? obj = new Object();
        obj.A03 = r301;
        obj.A00 = eab.A00;
        obj.A01 = eab.A01;
        obj.A02 = eab;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A03;
        int i = this.A00;
        1G1 r02 = this.A01;
        r02.getClass();
        0RZ.A04(r02.BKF().mIsPageContext);
        C30G A0H = AbF.A0H(75);
        A0H.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r02.A05);
        ((2Jf) A0H).A00.A04("time_window", 2592000L);
        A0H.A06("limit", i);
        A0H.A06("latest_messenger_threads_connection_first", 25);
        F9Q f9q = new F9Q(A0H, (GEs) null);
        f9q.A04 = r02.BKF();
        return F9Q.A00(r0, f9q, 367103207806489L);
    }
}
