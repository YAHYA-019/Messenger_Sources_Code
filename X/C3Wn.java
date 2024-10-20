package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.channellist.threadtimestamp.CommunityChatThreadListTimestampImplementation;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadlist.plugins.messengerui.threadtimestamp.MessengerThreadListTimestamp;

/* renamed from: X.3Wn, reason: invalid class name */
/* loaded from: 3Wn.class */
public final class C3Wn implements 2oD {
    public CommunityChatThreadListTimestampImplementation A00;
    public MessengerThreadListTimestamp A01;
    public Object A02;
    public Object A03;
    public final Context A04;
    public final 1YC A05 = 1YC.A03;
    public final FbUserSession A06;

    public C3Wn(Context context, FbUserSession fbUserSession) {
        this.A04 = context;
        this.A06 = fbUserSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b3, code lost:
    
        if (X.C4Mu.A00(r0.A01).AZk(36321834049553234L) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d0 A[Catch: Exception -> 0x0302, all -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0302, blocks: (B:119:0x0292, B:120:0x0297, B:123:0x02a3, B:126:0x02ad, B:131:0x02f1, B:136:0x02d0, B:137:0x02d7, B:139:0x02de, B:140:0x02e5, B:141:0x02ea, B:141:0x02ea, B:144:0x02ba), top: B:118:0x0292, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String BFw(X.0Da r302, com.facebook.messaging.model.threads.ThreadSummary r303) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Wn.BFw(X.0Da, com.facebook.messaging.model.threads.ThreadSummary):java.lang.String");
    }

    public C2xe BFx(0Da r302, ThreadSummary threadSummary) {
        return 1BL.A0N(this.A05, 1BK.A00());
    }
}
