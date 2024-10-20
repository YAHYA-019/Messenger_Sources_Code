package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9kf, reason: invalid class name */
/* loaded from: 9kf.class */
public final class C9kf {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1De A08;

    public C9kf(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A00 = fbUserSession;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 49712);
        this.A07 = 1Bu.A03(r0, 68202);
        this.A01 = 1Bq.A00(16449);
        this.A06 = 7zM.A0O();
        this.A02 = 1Lm.A03(fbUserSession, r0, 68508);
        this.A05 = 1Bq.A00(16511);
        this.A03 = 1Bq.A00(68524);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.model.messages.Message r301, X.C9kf r302, com.facebook.messaging.send.trigger.NavigationTrigger r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9kf.A00(com.facebook.messaging.model.messages.Message, X.9kf, com.facebook.messaging.send.trigger.NavigationTrigger, java.lang.String):void");
    }

    public static final void A01(C9kf c9kf, Function1 function1, long j) {
        8yC r0 = (8yC) 1Br.A0B(c9kf.A02);
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A0O(10, j, new C8yz(AQV, r0), r0, A0P), A0P, false);
        A0P.addResultCallback(new A1U(16, j, function1, c9kf));
    }
}
