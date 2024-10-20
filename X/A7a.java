package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.jumppill.events.JumpToMessageEvent;

/* loaded from: A7a.class */
public final class A7a implements 1Vf {
    public final 6vA A00;
    public final Context A01;
    public final FbUserSession A02;
    public final ThreadKey A03;
    public final C07484k0 A04;
    public final C5jn A05;

    public A7a(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A03 = threadKey;
        C07484k0 AgW = ((C5k6) 1Lo.A04(context, fbUserSession, (1BY) null, 67819)).AgW(threadKey);
        this.A04 = AgW;
        C5jn c5jn = ((C5j7) 1Lo.A08(fbUserSession, 66320)).AgW(threadKey).A02;
        this.A05 = c5jn;
        this.A00 = new 6vA(context, fbUserSession, threadKey, AgW, c5jn);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.jumppill.events.JumpToMessageEvent")) {
            throw 4YV.A0f(str);
        }
        JumpToMessageEvent jumpToMessageEvent = (JumpToMessageEvent) r302;
        11T.A0F(jumpToMessageEvent, 0);
        this.A00.A00(jumpToMessageEvent.A00);
    }
}
