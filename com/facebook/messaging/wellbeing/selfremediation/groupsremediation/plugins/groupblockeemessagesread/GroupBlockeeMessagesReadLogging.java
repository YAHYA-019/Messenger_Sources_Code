package com.facebook.messaging.wellbeing.selfremediation.groupsremediation.plugins.groupblockeemessagesread;

import X.03Y;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1G1;
import X.AnonymousClass622;
import X.C6G1;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.user.model.UserKey;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: GroupBlockeeMessagesReadLogging.class */
public final class GroupBlockeeMessagesReadLogging {
    public boolean A00;
    public boolean A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final C6G1 A07;
    public final String A08;
    public final Map A09;
    public final Context A0A;

    public GroupBlockeeMessagesReadLogging(Context context, FbUserSession fbUserSession, C6G1 c6g1) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(c6g1, 3);
        this.A0A = context;
        this.A02 = fbUserSession;
        this.A07 = c6g1;
        this.A06 = 1Bu.A01(context, 65862);
        this.A05 = 1Bu.A01(context, 68495);
        this.A08 = ((1G1) fbUserSession).A02;
        this.A03 = 1Bu.A00(65841);
        this.A04 = 1Bq.A00(65837);
        this.A09 = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0123 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List A00(X.C6G1 r301, com.facebook.messaging.wellbeing.selfremediation.groupsremediation.plugins.groupblockeemessagesread.GroupBlockeeMessagesReadLogging r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.groupsremediation.plugins.groupblockeemessagesread.GroupBlockeeMessagesReadLogging.A00(X.6G1, com.facebook.messaging.wellbeing.selfremediation.groupsremediation.plugins.groupblockeemessagesread.GroupBlockeeMessagesReadLogging, java.lang.String):java.util.List");
    }

    public static final void A01(AnonymousClass622 anonymousClass622, GroupBlockeeMessagesReadLogging groupBlockeeMessagesReadLogging) {
        UserKey userKey;
        String str;
        ParticipantInfo participantInfo = anonymousClass622.A03.A0K;
        if (participantInfo == null || (userKey = participantInfo.A0F) == null || (str = userKey.id) == null) {
            return;
        }
        03Y r0 = new 03Y(str, String.valueOf(anonymousClass622.AsR()));
        Map map = groupBlockeeMessagesReadLogging.A09;
        Number number = (Number) map.get(r0);
        long j = 1;
        if (number != null) {
            j = 1 + number.longValue();
        }
        map.put(r0, Long.valueOf(j));
    }
}
