package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.LinkedHashMap;

/* renamed from: X.9f3, reason: invalid class name */
/* loaded from: 9f3.class */
public final class C9f3 {
    public final 1Br A00 = 1BK.A0D();

    public static final void A00(ThreadKey threadKey, C9f3 c9f3, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        1UG A08 = 1BK.A08(1Br.A02(c9f3.A00), "message_action");
        if (A08.isSampled()) {
            A08.A7R("action", str);
            A08.A7R("entry_point", str4);
            A08.A7R("message_type", str5);
            A08.A7R("mid", "NULL");
            A08.A7R("reaction", "NULL");
            A08.A7R(4YT.A00(177), "NULL");
            A08.A0E("threadid", 4YU.A0y(threadKey));
            A08.A7R("thread_type", threadKey.A06.toString());
            A08.A7R("recipient_id", str2);
            A08.A6H("groupsize", Long.valueOf(j));
            LinkedHashMap A1C = 1BK.A1C();
            if (str3 != null) {
                A1C.put("bot_response_id", str3);
            }
            if (str6 != null) {
                A1C.put(GOm.A00(1), str6);
            }
            A08.A6J("extra", A1C);
            A08.BZL();
        }
    }
}
