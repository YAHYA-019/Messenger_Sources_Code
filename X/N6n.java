package X;

import com.facebook.messaging.privacyframework.cmcd.messenger.plugins.cmcddbsource.cmcddbsource.CMCDDBSourceImplementation;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: N6n.class */
public final class N6n implements C1qM {
    public final int A00;
    public final Object A01;

    public N6n(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.google.common.util.concurrent.ListenableFuture] */
    @Override // X.C1qM
    public final void CNu(Set set) {
        N4B n4b;
        C00i c00i;
        Object obj;
        1K9 r307;
        switch (this.A00) {
            case 0:
                CMCDDBSourceImplementation cMCDDBSourceImplementation = (CMCDDBSourceImplementation) this.A01;
                if (((1OC) 1Br.A0B(cMCDDBSourceImplementation.A02)).A05 && set.contains("orca_temp_message_list")) {
                    ((22B) 1Lm.A05(cMCDDBSourceImplementation.A00, cMCDDBSourceImplementation.A01, 84153)).A05(cMCDDBSourceImplementation.A05, 4, cMCDDBSourceImplementation.A03.A0s());
                    return;
                }
                return;
            case 1:
                if (set.contains("fb_friend_updates")) {
                    n4b = (N4B) this.A01;
                    2FT A01 = N4B.A01(n4b);
                    1K9 r0 = n4b.A0D;
                    c00i = n4b.A0B.A00;
                    1Kd.A0F(r0, A01, (Executor) c00i.get());
                    obj = new Object();
                    MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(n4b.A06);
                    PrivacyContext A00 = N4B.A00(n4b);
                    N6o n6o = new N6o(obj, 3);
                    1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0Q = 1BK.A0Q(AQV, n6o);
                    1Um.A02(AQV, new N6v(12, mailboxFeature, A0Q, A00), A0Q, false);
                    break;
                } else {
                    return;
                }
            case 2:
                if (set.contains("fb_friend_updates")) {
                    N4B n4b2 = (N4B) this.A01;
                    obj = N4B.A01(n4b2);
                    r307 = n4b2.A0D;
                    c00i = n4b2.A08.A00;
                    1Kd.A0F(r307, obj, (Executor) c00i.get());
                }
                return;
            default:
                if (set.contains("content_discovery_life_events")) {
                    n4b = (N4B) this.A01;
                    2FT A02 = N4B.A02(n4b);
                    1K9 r02 = n4b.A0D;
                    c00i = n4b.A0B.A00;
                    1Kd.A0F(r02, A02, (Executor) c00i.get());
                    obj = N4B.A03(n4b);
                    break;
                } else {
                    return;
                }
        }
        r307 = n4b.A0E;
        1Kd.A0F(r307, obj, (Executor) c00i.get());
    }
}
