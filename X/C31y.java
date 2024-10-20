package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.31y, reason: invalid class name */
/* loaded from: 31y.class */
public final class C31y implements 1Vf {
    public final 1Br A00;
    public final Context A04;
    public final FbUserSession A05;
    public final 1Br A01 = 1Bq.A00(66435);
    public final C22K A03 = new C22K();
    public final 1Br A02 = 1Bq.A00(66502);

    public C31y(Context context, FbUserSession fbUserSession) {
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A00 = 1Lm.A00(context, fbUserSession, 33183);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        int i;
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
        }
        C00j.A05("SelectiveSyncInboxCommunityContainersHandler.onInboxVisible", 80133819);
        try {
            if (this.A03.A01(((2bE) 1Br.A0B(this.A02)).A00)) {
                ((1SF) 1Br.A0B(this.A01)).A0K("community_container_selective_sync_remediation_start");
                22I r0 = (22I) 1Br.A0B(this.A00);
                A1d a1d = new A1d(this, 43);
                1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
                mailboxFutureImpl.Cu4(a1d);
                if (!AQV.Cj2(new Iag(r0, mailboxFutureImpl, 1))) {
                    mailboxFutureImpl.cancel(false);
                }
                i = -1031779277;
            } else {
                0fH.A0j("SelectiveSyncInboxCommunityContainersHandler", "Skipping bumped community container to inbox sync -- not valid start time");
                i = -1564733905;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(51430475);
            throw th;
        }
    }
}
