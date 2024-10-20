package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.9mX, reason: invalid class name */
/* loaded from: 9mX.class */
public final class C9mX {
    public final C00i A01 = 1BQ.A02(16634);
    public final C00i A00 = 1BQ.A00();

    public static EnumC03583yg A00(ThreadKey threadKey) {
        switch (threadKey.A06.ordinal()) {
            case 0:
                return EnumC03583yg.A0G;
            case 1:
                return EnumC03583yg.A0D;
            case 3:
            case 4:
                return EnumC03583yg.A0K;
            case 8:
                return EnumC03583yg.A0J;
            case 9:
                return EnumC03583yg.A0F;
            case 10:
                return EnumC03583yg.A0L;
            case 18:
                return EnumC03583yg.A0B;
            case 19:
                return EnumC03583yg.A0A;
            case 21:
                return EnumC03583yg.A01;
            case 23:
                return EnumC03583yg.A0E;
            default:
                return EnumC03583yg.A0M;
        }
    }

    public static void A01(7M6 r301, 6Pq r302, BO2 bo2, Message message, C9mX c9mX) {
        ParticipantInfo participantInfo = message.A0K;
        String str = null;
        String A00 = participantInfo == null ? null : participantInfo.A00();
        BotResponseMetadata botResponseMetadata = message.A0k;
        if (botResponseMetadata != null) {
            str = botResponseMetadata.A0A;
        }
        A02(r301, r302, bo2, message.A0V, c9mX, A00, message.A1V, str, message.A05);
    }

    public static void A02(7M6 r301, 6Pq r302, BO2 bo2, ThreadKey threadKey, C9mX c9mX, String str, String str2, String str3, long j) {
        0DA r321;
        0DA r323;
        0DA r312;
        if (1BK.A0N(c9mX.A00).AZk(36313304242657368L)) {
            1UG A08 = 1BK.A08(1BK.A07(c9mX.A01), 1BJ.A00(468));
            if (A08.isSampled()) {
                String str4 = null;
                if (str == null || str2 == null) {
                    r321 = null;
                } else {
                    r321 = new 0DA();
                    r321.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                    r321.A06("sender_id", 1BK.A0n(str));
                    r321.A04("sent_time", Double.valueOf(j));
                }
                0DA r0 = new 0DA();
                r0.A01(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                if (threadKey != null) {
                    r323 = new 0DA();
                    r323.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 1BK.A0w(threadKey));
                    r323.A07("key", threadKey.A0u());
                    r323.A01(A00(threadKey), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                } else {
                    r323 = null;
                }
                0DA r02 = new 0DA();
                r02.A01(r301, "category");
                if (bo2 != null) {
                    r312 = new 0DA();
                    r312.A01(bo2, "post_type");
                } else {
                    r312 = null;
                }
                if (str3 != null) {
                    HashMap A0u = AnonymousClass001.A0u();
                    A0u.put("bot_response_id", String.valueOf(str3));
                    str4 = new JSONObject(A0u).toString();
                }
                if (r321 == null || r323 == null) {
                    return;
                }
                A08.A7T(r02, "click");
                A08.A7T(r0, "click_target");
                A08.A7T(r323, "thread");
                A08.A7T(r321, "message");
                A08.A7T(r312, "xma");
                A08.A7R("extra", str4);
                A08.BZL();
            }
        }
    }

    public static void A03(1UG r301, ThreadKey threadKey, String str) {
        r301.A6H(1BJ.A00(217), Long.valueOf(((C0dp) 1Bi.A03(99390)).now()));
        r301.A5c(A00(threadKey), "thread_type");
        r301.A7R(4YT.A00(1495), str);
        r301.A7R("model_id", "");
    }

    public void A04(6Pq r302, Message message) {
        A01(7M6.A01, r302, null, message, this);
    }
}
