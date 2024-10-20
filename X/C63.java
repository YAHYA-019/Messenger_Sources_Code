package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.threadview.model.groupedmessages.GroupedMessageForwardMetadata;
import java.util.ArrayList;

/* loaded from: C63.class */
public final class C63 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1BP A07;
    public final 1De A08;

    public C63(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        1BY r0 = r303.A00;
        this.A05 = 1Lm.A03(fbUserSession, r0, 65961);
        this.A04 = 1Lm.A03(fbUserSession, r0, 84153);
        this.A06 = 1Bq.A00(68077);
        this.A03 = 1Bu.A03(r0, 68925);
        this.A02 = 1Bu.A03(r0, 115941);
        this.A01 = AbG.A0M();
        this.A00 = 1Bu.A03(r0, 68365);
        this.A07 = FbInjector.A00;
    }

    public final void A00(Message message, AnonymousClass539 anonymousClass539) {
        String str;
        11T.A0F(anonymousClass539, 1);
        User user = (User) 1De.A00(this.A08, 83430);
        ArrayList A17 = 1BK.A17(7zU.A0r(7zQ.A0H(user)));
        GroupedMessageForwardMetadata groupedMessageForwardMetadata = message.A0l;
        String str2 = groupedMessageForwardMetadata != null ? groupedMessageForwardMetadata.A00 : null;
        if (ThreadKey.A0S(message.A0V)) {
            str = message.A1V;
            if (str == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        } else {
            str = message.A1R;
            if (str == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        }
        ((22B) 1Br.A0B(this.A04)).A07(new CyG(message, anonymousClass539, this, str, str2, 6), A17, 1BK.A17(11T.A03(7zL.A13(user))));
    }
}
