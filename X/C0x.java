package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.attachment.EphemeralMediaState;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: C0x.class */
public final class C0x {
    public final /* synthetic */ Rh7 A00;

    public C0x(Rh7 rh7) {
        this.A00 = rh7;
    }

    public void A00() {
        Rh7 rh7 = this.A00;
        ((Htq) rh7.A0P.get()).A01();
        C5f c5f = rh7.A08;
        if (c5f != null) {
            RO3 A00 = c5f.A00();
            if (A00.A00) {
                return;
            }
            A00.A00 = true;
            String str = A00.A05;
            if (str != null) {
                Message message = rh7.A0S;
                ThreadKey threadKey = message.A0V;
                1BY r0 = rh7.A02;
                FbUserSession A05 = 1Fw.A05(r0);
                6hG r02 = (6hG) 1Lo.A04((Context) null, A05, r0, 82276);
                1xC r03 = (1xC) 1Lo.A04((Context) null, A05, r0, 33148);
                if (!str.equals(message.A1V) || C7sz.A00(message) == EphemeralMediaState.UNSEEN) {
                    if (((2rT) rh7.A0I.get()).A02(threadKey)) {
                        threadKey.getClass();
                        String A02 = A00.A04.A02();
                        A02.getClass();
                        Long A0k = 7zO.A0k(threadKey);
                        Integer valueOf = Integer.valueOf(C7sz.A00(message).ordinal());
                        Long valueOf2 = Long.valueOf(1BL.A08(rh7.A0H));
                        1Um A0O = 1BK.A0O(r03, 0);
                        MailboxFutureImpl A0P = 1BK.A0P(A0O);
                        1Um.A02(A0O, new Cyf(r03, A0P, A0k, valueOf, valueOf2, str, A02, 0), A0P, false);
                    } else {
                        CEE cee = (CEE) rh7.A0N.get();
                        11T.A0F(rh7.A01, 0);
                        CEE.A00(cee, str, "SEEN");
                    }
                    rh7.A0C.m11011add((Object) str);
                    r02.A03.add(str);
                    return;
                }
                if (C7sz.A00(message) == EphemeralMediaState.SEEN) {
                    if (((2rT) rh7.A0I.get()).A02(threadKey)) {
                        threadKey.getClass();
                        String A022 = A00.A04.A02();
                        A022.getClass();
                        Long A0k2 = 7zO.A0k(threadKey);
                        Integer valueOf3 = Integer.valueOf(C7sz.A00(message).ordinal());
                        Long valueOf4 = Long.valueOf(1BL.A08(rh7.A0H));
                        1Um AQV = r03.mMailboxApiHandleMetaProvider.AQV(0);
                        MailboxFutureImpl A0P2 = 1BK.A0P(AQV);
                        1Um.A02(AQV, new Cyf(r03, A0P2, A0k2, valueOf3, valueOf4, str, A022, 1), A0P2, false);
                    } else {
                        CEE cee2 = (CEE) rh7.A0N.get();
                        11T.A0F(rh7.A01, 0);
                        CEE.A00(cee2, str, "REPLAY");
                    }
                    rh7.A0B.m11011add((Object) str);
                    r02.A03.remove(str);
                }
            }
        }
    }
}
