package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.cowatch.notifications.MessengerLivingRoomCreateNotification;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C5z.class */
public final class C5z {
    public final C00i A00;
    public final 1De A01;
    public final 1Br A02 = 7zM.A0d();
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final Context A08;

    public C5z(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A06 = 1Bu.A03(r0, 68463);
        this.A03 = 1Bu.A03(r0, 49358);
        Context context = (Context) 1Bn.A0E((Context) null, r0, 83719);
        this.A08 = context;
        this.A07 = 7zN.A0H(context);
        this.A05 = 1Bq.A00(49803);
        this.A04 = 1Bq.A00(49797);
        this.A00 = 1HG.A00((Context) 1Bn.A0E((Context) null, r0, 83719), 50024);
    }

    public final void A00(Context context, FbUserSession fbUserSession, MessengerLivingRoomCreateNotification messengerLivingRoomCreateNotification) {
        ThreadKey A0Y;
        7zT.A1S(fbUserSession, context, messengerLivingRoomCreateNotification);
        String str = messengerLivingRoomCreateNotification.A00;
        1Br r0 = this.A07;
        if (str == null) {
            4iI r02 = (4iI) 1Br.A0B(r0);
            String str2 = messengerLivingRoomCreateNotification.A02;
            if (str2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A0Y = r02.A02(Long.parseLong(str2));
            if (A0Y == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        } else {
            1Br.A0C(r0);
            A0Y = AbI.A0Y(str);
        }
        1BY r03 = this.A01.A00;
        1MV A0B = AbF.A0B(fbUserSession, r03, 83326);
        2QO r04 = (2QO) 1Lo.A04((Context) null, fbUserSession, r03, 99977);
        if (r04 != null && r04.BQN()) {
            if (A0Y.equals(((HpT) A0B.get()).A00())) {
                return;
            }
        }
        ((5bF) 1Br.A0B(this.A04)).A0A((ParticipantInfo) null, A0Y, new Cnx(context, messengerLivingRoomCreateNotification, this, A0Y));
    }
}
