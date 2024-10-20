package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered;
import com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered;
import com.facebook.xapp.messaging.events.common.threadview.OnOldMessagesRendered;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: A7g.class */
public final class A7g implements 1Vf {
    public Boolean A00;
    public final Context A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final Set A04 = 7zL.A15();

    public A7g(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A01 = context;
        this.A03 = threadKey;
        this.A02 = 1Lm.A01(fbUserSession, 67442);
    }

    public static final void A00(A7g a7g, List list) {
        MailboxFeature A0d;
        long A0s;
        1Um AQV;
        MailboxFutureImpl A0P;
        int i;
        if (list.isEmpty()) {
            return;
        }
        ThreadKey threadKey = a7g.A03;
        if (threadKey.A0y()) {
            return;
        }
        if (threadKey.A0z()) {
            A0d = 7zP.A0d(a7g.A02);
            A0s = threadKey.A0s();
            AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
            A0P = 1BK.A0P(AQV);
            i = 4;
        } else {
            if (7zR.A1X(a7g.A00)) {
                return;
            }
            if (a7g.A00 == null) {
                a7g.A04.addAll(list);
                return;
            } else {
                if (!threadKey.A1L()) {
                    return;
                }
                A0d = 7zP.A0d(a7g.A02);
                A0s = threadKey.A0s();
                AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
                A0P = 1BK.A0P(AQV);
                i = 5;
            }
        }
        1Um.A02(AQV, new A0O(i, A0s, list, A0d, A0P), A0P, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r309v0 */
    /* JADX WARN: Type inference failed for: r309v1 */
    /* JADX WARN: Type inference failed for: r309v2, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r309v3, types: [java.util.AbstractCollection] */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        List list;
        List list2;
        String str2;
        String str3;
        11T.A0H(r302, str);
        switch (str.hashCode()) {
            case -1834325531:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered")) {
                    OnNewMessagesRendered onNewMessagesRendered = (OnNewMessagesRendered) r302;
                    11T.A0F(onNewMessagesRendered, 0);
                    list = onNewMessagesRendered.A00;
                    break;
                }
                throw 4YV.A0f(str);
            case -1440551537:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
                    ThreadKey threadKey = this.A03;
                    if (threadKey.A1L()) {
                        7zU.A0M((5Vk) 1Bu.A06(this.A01, 82763), threadKey).A03(new 9uN(this, 0));
                        return;
                    } else {
                        this.A00 = 1BK.A0d();
                        return;
                    }
                }
                throw 4YV.A0f(str);
            case -1011449748:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnOldMessagesRendered")) {
                    OnOldMessagesRendered onOldMessagesRendered = (OnOldMessagesRendered) r302;
                    11T.A0F(onOldMessagesRendered, 0);
                    list = onOldMessagesRendered.A00;
                    break;
                }
                throw 4YV.A0f(str);
            case 2054794633:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered")) {
                    OnInitialMessagesRendered onInitialMessagesRendered = (OnInitialMessagesRendered) r302;
                    11T.A0F(onInitialMessagesRendered, 0);
                    list = onInitialMessagesRendered.A00;
                    break;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            C5fv c5fv = (C5fv) obj;
            if (c5fv instanceof 5gC) {
                str3 = ((5gC) c5fv).A03;
            } else if (c5fv instanceof C5n8) {
                str3 = ((C5n8) c5fv).A09;
            } else {
                82X AxW = c5fv.AxW(C5m5.A00);
                if (AxW != null) {
                    str3 = (CharSequence) AxW.A01;
                    if (str3 != null) {
                    }
                }
            }
            if (str3.length() > 0) {
                8Nx AxW2 = c5fv.AxW(C5mg.A00);
                if (AxW2 == null || AxW2.A01 == null) {
                    A0s.add(obj);
                }
            }
        }
        if (A0s.isEmpty()) {
            return;
        }
        ThreadKey threadKey2 = this.A03;
        if (!threadKey2.A0y()) {
            if (threadKey2.A0z()) {
                list2 = 1BL.A0z(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    list2.add(((C5fu) ((C5fv) it.next())).A09);
                }
            } else if (threadKey2.A1L()) {
                list2 = AnonymousClass001.A0s();
                Iterator it2 = A0s.iterator();
                while (it2.hasNext()) {
                    8Nv AxW3 = ((C5fv) it2.next()).AxW(A9o.A00);
                    if (AxW3 != null && (str2 = AxW3.A00) != null) {
                        list2.add(str2);
                    }
                }
            }
            A00(this, list2);
        }
        list2 = C0ty.A00;
        A00(this, list2);
    }
}
