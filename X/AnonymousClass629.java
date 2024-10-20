package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;

/* renamed from: X.629, reason: invalid class name */
/* loaded from: 629.class */
public final class AnonymousClass629 implements 62A {
    public final 1Br A00;
    public final 1BP A01;

    public AnonymousClass629(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = FbInjector.A00;
        Context context = FbInjector.A03;
        11T.A0A(context);
        this.A00 = 1Lm.A00(context, fbUserSession, 65958);
    }

    public /* bridge */ /* synthetic */ C5fq A4n(Message message) {
        C5w5 c5w5 = new C5w5();
        String str = message.A1m;
        if (str == null) {
            throw 1BK.A0h();
        }
        c5w5.A01 = str;
        c5w5.A02 = message.A1n;
        return c5w5;
    }

    public boolean BQi(Message message) {
        String str = message.A1m;
        boolean z = false;
        if (str != null && str.length() != 0) {
            this.A00.A00.get();
            ParticipantInfo participantInfo = message.A0K;
            if (participantInfo != null && participantInfo.A00() != null) {
                z = true;
            }
        }
        return z;
    }
}
