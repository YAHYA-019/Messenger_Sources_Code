package X;

import android.content.Context;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.platformmetadata.types.persona.MessagePlatformPersona;
import com.facebook.user.model.UserKey;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.60m, reason: invalid class name */
/* loaded from: 60m.class */
public final class C60m {
    public final Context A00;
    public final C0dp A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C60p A05;

    public C60m(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A04 = 1Bq.A00(16822);
        this.A03 = 1Bu.A00(66684);
        this.A02 = 1Bq.A00(66265);
        this.A01 = (C0dp) 1Bi.A03(33226);
        this.A05 = new C60p((C60n) C1Y6.A00(context, "com_facebook_messaging_threadview_plugins_interfaces_rowitemgrouping_RowItemGroupingInterfaceSpec", "All", new Object[0]));
    }

    public static final boolean A00(Message message, Message message2, C60m c60m) {
        ParticipantInfo participantInfo;
        ParticipantInfo participantInfo2;
        if (message2 == null || !11T.A0O(message.A1Z, message2.A1Z) || C1q7.A0E(message) || C1q7.A0E(message2)) {
            return false;
        }
        C00i c00i = c60m.A04.A00;
        if (((C1q7) c00i.get()).A0w(message) || ((C1q7) c00i.get()).A0w(message2) || message.A1m != null || message2.A1m != null || C1q7.A0S(message) || C1q7.A0S(message2)) {
            return false;
        }
        String A06 = C1q7.A06(message);
        if ("ADMIN".equals(A06) || "FULLBLEED".equals(A06)) {
            return false;
        }
        String A062 = C1q7.A06(message2);
        if ("ADMIN".equals(A062) || "FULLBLEED".equals(A062) || (participantInfo = message.A0K) == null || (participantInfo2 = message2.A0K) == null || !Objects.equal(participantInfo.A0F, participantInfo2.A0F)) {
            return false;
        }
        String A05 = C1q7.A05(message);
        String A052 = C1q7.A05(message2);
        if (A05 != null) {
            if (A052 == null || !Objects.equal(A05, A052)) {
                return false;
            }
        } else if (A052 != null) {
            return false;
        }
        if (Math.abs(C1q7.A00(message) - C1q7.A00(message2)) >= 60000) {
            return false;
        }
        Boolean bool = message.A17;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = message2.A17;
        return bool2 == null || !bool2.booleanValue();
    }

    public static final boolean A01(Message message, Message message2, boolean z) {
        GenericAdminMessageInfo genericAdminMessageInfo;
        11T.A0F(message, 0);
        boolean z2 = false;
        if (z && C1q7.A0E(message) && (genericAdminMessageInfo = message.A0C) != null && "CONFIRM_FRIEND_REQUEST".equals(genericAdminMessageInfo.A0I)) {
            return false;
        }
        ImmutableList immutableList = C1q7.A07;
        C1q8 A04 = message.A04();
        if (A04 == C1q8.A0G || A04 == C1q8.A0F) {
            return false;
        }
        if (z || message2 == null) {
            return true;
        }
        if (C1q7.A0E(message) && !C1q7.A0k(message)) {
            return false;
        }
        if (Math.abs(C1q7.A00(message) - C1q7.A00(message2)) >= 600000 || !11T.A0O(message.A1Z, message2.A1Z)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean A02(Message message, List list, boolean z) {
        C7sf c7sf;
        if (list.size() != 1) {
            return false;
        }
        C7sf c7sf2 = (C7sf) list.get(0);
        MessagePlatformPersona messagePlatformPersona = null;
        if (c7sf2 == null || c7sf2.A00 == null) {
            return false;
        }
        C7sf c7sf3 = (C7sf) list.get(0);
        ParticipantInfo participantInfo = c7sf3 != null ? c7sf3.A00 : null;
        C7sf c7sf4 = (C7sf) list.get(0);
        if (c7sf4 != null && c7sf4.A01 != null && (c7sf = (C7sf) list.get(0)) != null) {
            messagePlatformPersona = c7sf.A01;
        }
        UserKey userKey = null;
        if (C60p.A00(2mH.A02, message, null, null, null, this.A05, null, null) || z || C1q7.A0E(message)) {
            return false;
        }
        ParticipantInfo participantInfo2 = message.A0K;
        UserKey userKey2 = participantInfo2 != null ? participantInfo2.A0F : null;
        if (participantInfo != null) {
            userKey = participantInfo.A0F;
        }
        if (!11T.A0O(userKey2, userKey)) {
            return false;
        }
        String A05 = C1q7.A05(message);
        if (messagePlatformPersona != null) {
            String str = messagePlatformPersona.A00;
            if (A05 != null) {
                if (str == null || !Objects.equal(A05, str)) {
                    return false;
                }
            } else if (str != null) {
                return false;
            }
        }
        return Math.abs(this.A01.now() - C1q7.A00(message)) < 60000;
    }
}
