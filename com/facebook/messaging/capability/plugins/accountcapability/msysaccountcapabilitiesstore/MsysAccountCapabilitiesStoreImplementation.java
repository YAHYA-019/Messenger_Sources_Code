package com.facebook.messaging.capability.plugins.accountcapability.msysaccountcapabilitiesstore;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1Um;
import X.A1U;
import X.A1d;
import X.AnonymousClass388;
import X.C1qM;
import X.C1v7;
import X.C9zx;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: MsysAccountCapabilitiesStoreImplementation.class */
public final class MsysAccountCapabilitiesStoreImplementation {
    public long A00;
    public AnonymousClass388 A01;
    public C1v7 A02;
    public C1qM A03 = new C9zx(this, 1);

    public final void A00(C1v7 c1v7) {
        if (this.A02 == null && c1v7 != null) {
            this.A02 = c1v7;
        }
        AnonymousClass388 anonymousClass388 = this.A01;
        if (anonymousClass388 == null) {
            11T.A0L("mailboxAccountInformation");
            throw 0Q8.createAndThrow();
        }
        long j = this.A00;
        A1d a1d = new A1d(this, 39);
        1Um AQV = anonymousClass388.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, a1d);
        1Um.A02(AQV, new A1U(0, j, anonymousClass388, A0Q), A0Q, false);
    }
}
