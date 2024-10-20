package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterChanged;
import com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterInit;
import java.util.concurrent.Executor;

/* renamed from: X.3cs, reason: invalid class name */
/* loaded from: 3cs.class */
public final class C3cs implements 1Vf {
    public final 1Br A03;
    public final 1Br A04;
    public final Context A06;
    public final FbUserSession A07;
    public final 1Br A02 = 1Bq.A00(68669);
    public final 1Br A01 = 1Bq.A00(16449);
    public final C22K A05 = new C22K();
    public 1Hb A00 = 1Hb.A02;

    public C3cs(Context context, FbUserSession fbUserSession) {
        this.A06 = context;
        this.A07 = fbUserSession;
        this.A04 = 1Lm.A00(context, fbUserSession, 68145);
        this.A03 = 1Lm.A00(context, fbUserSession, 68144);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        int hashCode = str.hashCode();
        if (hashCode != 826782254) {
            if (hashCode != 1942735149) {
                if (hashCode == 2118359254 && str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterChanged")) {
                    OnThreadTypeFilterChanged onThreadTypeFilterChanged = (OnThreadTypeFilterChanged) r302;
                    11T.A0F(onThreadTypeFilterChanged, 0);
                    1Hb r0 = onThreadTypeFilterChanged.A00;
                    1Hb r02 = this.A00;
                    1Hb r03 = 1Hb.A06;
                    if (r02 == r03 ? r0 != r03 : r0 == r03) {
                        ((8yW) 1Br.A0B(this.A04)).A01(2bN.A00());
                    }
                    this.A00 = r0;
                    return;
                }
            } else if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
                if (this.A00 != 1Hb.A06) {
                    if (this.A05.A01(1Wl.A00(this.A02.A00).Auy(36603270372137050L) * 60000)) {
                        MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(this.A03);
                        long A00 = 2bN.A00();
                        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                        MailboxFutureImpl A0P = 1BK.A0P(AQV);
                        1Um.A02(AQV, new A1U(13, A00, mailboxFeature, A0P), A0P, false);
                        A0P.addResultCallback((Executor) 1Br.A0B(this.A01), new A1d(this, 62));
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterInit")) {
            OnThreadTypeFilterInit onThreadTypeFilterInit = (OnThreadTypeFilterInit) r302;
            11T.A0F(onThreadTypeFilterInit, 0);
            1Hb r04 = onThreadTypeFilterInit.A00;
            this.A00 = r04;
            if (r04 == 1Hb.A06) {
                ((8yW) 1Br.A0B(this.A04)).A01(2bN.A00());
                return;
            }
            return;
        }
        throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
    }
}
