package com.facebook.messaging.search.nullstate.prefetch;

import X.02J;
import X.03Y;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1De;
import X.1Lm;
import X.1Lo;
import X.1Um;
import X.A0D;
import X.C00683ob;
import X.C0s8;
import X.Cxn;
import X.Iay;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: SearchNullStateMediaTabPrefetcher.class */
public final class SearchNullStateMediaTabPrefetcher {
    public final 1De A00;
    public final 1Br A01 = 1Bq.A00(66630);
    public final PrivacyContext A02;

    public SearchNullStateMediaTabPrefetcher(1De r302) {
        this.A00 = r302;
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", "2971616476299527");
        11T.A0A(newPrivacyContextNative);
        this.A02 = newPrivacyContextNative;
    }

    public static final void A00(FbUserSession fbUserSession, SearchNullStateMediaTabPrefetcher searchNullStateMediaTabPrefetcher, long j) {
        C00683ob c00683ob = (C00683ob) 1Lm.A07(fbUserSession, searchNullStateMediaTabPrefetcher.A00.A00, 67629);
        c00683ob.A0A(C0s8.A14(02J.A01(new 03Y(TraceFieldType.ContentType, 0)), 02J.A01(new 03Y(TraceFieldType.ContentType, 1)), 02J.A01(new 03Y(TraceFieldType.ContentType, 2))));
        PrivacyContext privacyContext = searchNullStateMediaTabPrefetcher.A02;
        1Um AQV = c00683ob.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new Iay(3, j, mailboxFutureImpl, c00683ob, privacyContext))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public final void A01(FbUserSession fbUserSession, long j, boolean z) {
        11T.A0F(fbUserSession, 2);
        if (!z) {
            A00(fbUserSession, this, j);
            return;
        }
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04((Context) null, fbUserSession, this.A00.A00, 67629);
        PrivacyContext privacyContext = this.A02;
        MailboxCallback a0d = new A0D(2, j, fbUserSession, this);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(a0d);
        if (AQV.Cj2(new Cxn(9, mailboxFutureImpl, privacyContext, mailboxFeature))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
