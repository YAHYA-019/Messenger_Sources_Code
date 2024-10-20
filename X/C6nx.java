package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;

/* renamed from: X.6nx, reason: invalid class name */
/* loaded from: 6nx.class */
public final class C6nx implements 1Vf {
    public final 1Br A00 = 1Bq.A00(68332);
    public final 1Br A01;
    public final Context A02;
    public final FbUserSession A03;

    public C6nx(Context context, FbUserSession fbUserSession) {
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A01 = 1Lm.A00(context, fbUserSession, 81931);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        String str2;
        String str3;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
            throw 4YV.A0f(str);
        }
        OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
        11T.A0F(onThreadOpened, 0);
        ThreadKey threadKey = onThreadOpened.A00;
        if (threadKey.A1C() && ((C5xr) 1Br.A0B(this.A00)).A01()) {
            C7sV c7sV = (C7sV) 1Br.A0B(this.A01);
            long j = threadKey.A04;
            synchronized (c7sV) {
                CC4.A00(BLu.A02, (CC4) 1Br.A0B(c7sV.A03)).A00(j);
                Long l = c7sV.A01;
                Integer num = (l == null || l.longValue() != j) ? null : c7sV.A00;
                c7sV.A01 = null;
                c7sV.A00 = null;
                C9es c9es = (C9es) 1Br.A0B(c7sV.A02);
                if (num != null) {
                    int intValue = num.intValue();
                    switch (intValue) {
                        case 1:
                            str2 = "subthread_row";
                            break;
                        case 2:
                            str2 = "parent_message_menu";
                            break;
                        case 3:
                            str2 = "creation_success_followup";
                            break;
                        case 4:
                            str2 = "subthread_reply_notif";
                            break;
                        default:
                            str2 = "subthread_xma";
                            break;
                    }
                    switch (intValue) {
                        case 1:
                            str3 = AbE.A00(208);
                            break;
                        case 4:
                            str3 = "subthread_reply_notif";
                            break;
                        default:
                            str3 = "thread_view";
                            break;
                    }
                } else {
                    str2 = "unknown";
                    str3 = str2;
                }
                C9es.A00(c9es).A04(new CommunityMessagingLoggerModel(null, null, null, null, String.valueOf(j), null, str2, "subthread_view", "thread_open", str3, null, 1BK.A1D("is_subthread", ConstantsKt.CAMERA_ID_BACK)));
            }
        }
    }
}
