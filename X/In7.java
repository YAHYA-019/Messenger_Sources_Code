package X;

import com.facebook.inject.FbInjector;
import com.facebook.messenger.plugins.mediauploadfailurenotifier.Postmailbox;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: In7.class */
public final class In7 implements 2eF {
    public final int A00;
    public final Object A01;
    public final String A02;

    public In7(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Throwable A0N;
        1qX r0;
        if (this.A00 != 0) {
            MailboxNullable mailboxNullable = (MailboxNullable) obj;
            if (mailboxNullable == null || (r0 = (1qX) mailboxNullable.value) == null) {
                A0N = AnonymousClass001.A0T("Unexpected result");
            } else {
                if (1qX.A00(r0) != 0) {
                    1Bi.A03(84491);
                    long A0F = 7zQ.A0F(r0, 0);
                    Postmailbox postmailbox = (Postmailbox) this.A01;
                    C5gc c5gc = (C5gc) GOo.A0n(FbInjector.A03, postmailbox.mAppContext.fbUserSession, 68338);
                    String str = this.A02;
                    long currentTimeMillis = System.currentTimeMillis();
                    Long valueOf = Long.valueOf(A0F);
                    Long A0n = 1BK.A0n(postmailbox.mAppContext.fbUserSession.A05);
                    1Um A0O = 1BK.A0O(c5gc, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    1Um.A02(A0O, new N7P(A0P, c5gc, valueOf, A0n, str, str, str, currentTimeMillis), A0P, false);
                    return new C3e7(A0P);
                }
                A0N = AnonymousClass001.A0T("No message send error after media upload failure");
            }
        } else {
            IXv iXv = (JNm) obj;
            if (iXv != null) {
                iXv.A00.D6H(this.A02);
                ListenableFuture listenableFuture = 1hM.A01;
                11T.A0A(listenableFuture);
                return listenableFuture;
            }
            A0N = AnonymousClass001.A0N("Cannot unsubscribe from state sync topic for an ended ConferenceCall");
        }
        return new 7hZ(A0N);
    }
}
