package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: A7S.class */
public final class A7S implements 1Vf {
    public final FbUserSession A00;
    public final 1Br A01 = 7zM.A0N();
    public final 1Br A02;
    public final Context A03;

    public A7S(Context context, FbUserSession fbUserSession) {
        this.A03 = context;
        this.A00 = fbUserSession;
        this.A02 = 1Bu.A01(context, 49353);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered")) {
            throw 4YV.A0f(str);
        }
        OnInitialMessagesRendered onInitialMessagesRendered = (OnInitialMessagesRendered) r302;
        11T.A0F(onInitialMessagesRendered, 0);
        int A00 = 2yD.A00(1Br.A07(this.A01), 36604515911801502L);
        List<C5fv> list = onInitialMessagesRendered.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        loop0: for (C5fv c5fv : list) {
            if (!((C5fu) c5fv).A0H && (c5fv instanceof C5ft)) {
                1Du it = ((C5ft) c5fv).A01.iterator();
                while (it.hasNext()) {
                    A0s.add(7zU.A0C(((Photo) it.next()).A0E));
                    if (A0s.size() >= A00) {
                        break loop0;
                    }
                }
            }
        }
        ((C10774uk) 1Br.A0B(this.A02)).A0B(this.A00, CallerContext.A0B("FullScreenImagePrefetchHandler"), 0S2.A15, A0s);
    }
}
