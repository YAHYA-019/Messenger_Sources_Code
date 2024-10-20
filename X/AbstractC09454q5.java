package X;

import com.facebook.auth.protocol.LinkedFbUserFromIgSessionInfo;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.accountswitch.model.MessengerAccountType;

/* renamed from: X.4q5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4q5.class */
public abstract class AbstractC09454q5 {
    public static final MessengerAccountInfo A00(LinkedFbUserFromIgSessionInfo linkedFbUserFromIgSessionInfo) {
        11T.A0F(linkedFbUserFromIgSessionInfo, 0);
        return new MessengerAccountInfo(MessengerAccountType.A03, null, linkedFbUserFromIgSessionInfo.A03, null, null, null, null, linkedFbUserFromIgSessionInfo.A02, 0, -1, 0L, false, false, false, false);
    }

    public static final MessengerAccountInfo A01(FirstPartySsoSessionInfo firstPartySsoSessionInfo) {
        return new MessengerAccountInfo(MessengerAccountType.A03, null, firstPartySsoSessionInfo.A06, null, null, null, null, firstPartySsoSessionInfo.A08, 0, -1, 0L, false, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        if (r0.has(r320) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.messaging.accountswitch.model.MessengerAccountInfo A02(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC09454q5.A02(java.lang.String):com.facebook.messaging.accountswitch.model.MessengerAccountInfo");
    }
}
