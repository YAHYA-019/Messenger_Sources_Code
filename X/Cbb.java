package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* loaded from: Cbb.class */
public final class Cbb implements CallerContextable {
    public static final String __redex_internal_original_name = "TincanSendMessageManager";
    public 1BY A00;
    public final C00i A02;
    public final C00i A03;
    public final C00i A01 = 1BV.A01((1BY) null, 33031);
    public final C00i A04 = 1BQ.A02(16476);
    public final C00i A06 = 1BQ.A02(50219);
    public final C00i A05 = 1BV.A01((1BY) null, 16671);

    public Cbb(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A03 = AbF.A0B(fbUserSession, (1BY) null, 49713);
        this.A02 = AbF.A0A(fbUserSession, (1BY) null, 84719);
    }

    public static final Cbb A00(1BO r301, Object obj) {
        return new Cbb(r301, (FbUserSession) obj);
    }

    public static void A01(Message message, ThreadKey threadKey, Cbb cbb) {
        int i;
        Integer num = AbG.A0p(cbb.A05).A09() ? 0S2.A01 : 0S2.A00;
        HashMap A0u = AnonymousClass001.A0u();
        ImmutableMap immutableMap = message.A13;
        A0u.put("surface", Boolean.parseBoolean(AbF.A1C(immutableMap, 4YT.A00(1188))) ? "bubbles" : Boolean.parseBoolean(AbF.A1C(immutableMap, 4YT.A00(1189))) ? "chatheads" : "thread_view");
        String str = message.A1g;
        if (str == null) {
            str = message.A1V;
        }
        C00i c00i = cbb.A06;
        7XV r0 = (7XV) c00i.get();
        switch (((7XV) c00i.get()).A00(message).intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            default:
                i = 5;
                break;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(QwV.A0L.value);
        Long l = message.A1L;
        Integer valueOf3 = l != null ? Integer.valueOf(l.intValue()) : null;
        int A00 = ThreadKey.A00(threadKey.A06);
        Integer valueOf4 = Integer.valueOf(A00);
        1UG A08 = 1BK.A08(1BK.A07(r0.A00), "tincan_msg_stat");
        if (A08.isSampled()) {
            A08.A0C("event_type");
            A08.A6H("sync_client_type", 1BK.A0l(num.intValue() != 0 ? 1 : 0));
            if (str != null) {
                A08.A7R(TraceFieldType.MsgId, str);
            }
            if (valueOf != null) {
                A08.A6H(TraceFieldType.MsgType, 7zP.A0g(valueOf));
            }
            if (valueOf2 != null) {
                A08.A6H("packet_type", 7zP.A0g(valueOf2));
            }
            if (valueOf4 != null) {
                A08.A6H("thread_type", 1BK.A0l(A00));
            }
            if (valueOf3 != null) {
                A08.A6H("disappearing_setting", 1BK.A0l(valueOf3.intValue() / 1000));
            }
            A08.A6J("extra_data", A0u);
            A08.BZL();
        }
    }
}
