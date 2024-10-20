package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.messaging.model.messages.Message;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6np, reason: invalid class name */
/* loaded from: 6np.class */
public final class C6np implements C6K9 {
    public final 1Br A00;
    public final 1Br A01;

    public C6np(Context context) {
        11T.A0F(context, 1);
        this.A01 = 1Bu.A01(context, 16428);
        this.A00 = 1Bu.A01(context, 84968);
    }

    @Override // X.C6K9
    public void Bbm(Message message) {
        AbstractC01593ro A01;
        6Ay BCm;
        ImmutableList BDF;
        String str;
        FbUserSession A03 = 1Br.A03(this.A01);
        if ("GAME".equals(62Z.A01(message))) {
            COn cOn = (COn) 1Br.A0B(this.A00);
            11T.A0F(A03, 0);
            5Pm r0 = message.A08;
            if (r0 == null || (BCm = r0.BCm()) == null || (BDF = BCm.BDF()) == null) {
                return;
            }
            1Du it = BDF.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next == GraphQLStoryAttachmentStyle.A0Q) {
                    str = "instant_games_leaderboard_update_seen";
                } else if (next == GraphQLStoryAttachmentStyle.A0P) {
                    str = "instant_games_custom_update_seen";
                }
                if (str.length() == 0) {
                    return;
                } else {
                    A01 = COn.A01(A03, cOn, message, str);
                }
            }
            return;
        }
        if (!C1q7.A0R(message)) {
            return;
        }
        COn cOn2 = (COn) 1Br.A0B(this.A00);
        11T.A0F(A03, 0);
        A01 = COn.A01(A03, cOn2, message, C7sx.A00(message) ? "custom_game_admin_message_seen" : "game_admin_message_seen");
        if (A01 != null) {
            A01.A0A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (X.C1q7.A0R(r302) != false) goto L6;
     */
    @Override // X.C6K9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cy0(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            java.lang.String r0 = X.62Z.A01(r0)
            r303 = r0
            java.lang.String r0 = "GAME"
            r304 = r0
            r0 = r304
            r1 = r303
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L24
            r0 = r302
            boolean r0 = X.C1q7.A0R(r0)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L27
        L24:
            r0 = 1
            r305 = r0
        L27:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6np.Cy0(com.facebook.messaging.model.messages.Message):boolean");
    }
}
