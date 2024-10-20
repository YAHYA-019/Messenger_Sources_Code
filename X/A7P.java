package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.secure.secrettypes.SecretString;
import com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered;
import com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: A7P.class */
public final class A7P implements 1Vf {
    public final 1Br A00;
    public final ThreadKey A01;
    public final FbUserSession A02;

    public A7P(FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A02 = fbUserSession;
        this.A01 = threadKey;
        this.A00 = 1Lm.A01(fbUserSession, 67764);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        List list;
        07F r308;
        int i;
        11T.A0H(r302, str);
        if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered")) {
            OnInitialMessagesRendered onInitialMessagesRendered = (OnInitialMessagesRendered) r302;
            11T.A0F(onInitialMessagesRendered, 0);
            list = onInitialMessagesRendered.A00;
            r308 = C0s8.A16(list);
        } else {
            if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered")) {
                throw 4YV.A0f(str);
            }
            OnNewMessagesRendered onNewMessagesRendered = (OnNewMessagesRendered) r302;
            11T.A0F(onNewMessagesRendered, 0);
            list = onNewMessagesRendered.A00;
            11T.A0F(list, 0);
            r308 = new 07F(AnonymousClass001.A04(list), 0, -1);
        }
        int i2 = r308.A00;
        if (i2 < 0 || i2 >= list.size() || (i = r308.A01) < 0 || i >= list.size()) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Indices range must be within list bounds.  Index range: ");
            A0k.append(r308);
            7zQ.A1Z(", list size: ", A0k, list);
            throw AnonymousClass001.A0L(A0k.toString());
        }
        5gC r305 = null;
        int i3 = r308.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i > i2) : i2 <= i) {
            while (true) {
                82U AxW = ((C5fv) list.get(i2)).AxW(C5vc.A00);
                if (AxW != null && AxW.A01) {
                    r305 = (C5fv) list.get(i2);
                    break;
                } else if (i2 == i) {
                    break;
                } else {
                    i2 += i3;
                }
            }
        }
        if (r305 instanceof 5gC) {
            ((9MN) 1Br.A0B(this.A00)).A00.set(new 8Lu(this.A01, 11T.A03(new C87v(new SecretString(r305.A03)))));
        } else {
            ((9MN) 1Br.A0B(this.A00)).A00 = new AtomicReference(null);
        }
    }
}
