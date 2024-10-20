package com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.blockmessagesmenuitem;

import X.06Z;
import X.11T;
import X.1BL;
import X.2Gt;
import X.4YU;
import X.4YV;
import X.7EN;
import X.7zS;
import X.AbF;
import X.AnonymousClass545;
import X.BNT;
import X.C00i;
import X.C94;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.blocking.params.BlockUnblockParams;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* loaded from: BlockMessagesMenuItemImplementation.class */
public final class BlockMessagesMenuItemImplementation {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        if (r304.A05 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        if (r304.A05 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r308 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007c, code lost:
    
        if (r304.A02() == X.C1z1.NOT_BLOCKED) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C9T A00(android.content.Context r301, com.facebook.auth.usersession.FbUserSession r302, com.facebook.messaging.model.threads.ThreadSummary r303, com.facebook.user.model.User r304) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.blockmessagesmenuitem.BlockMessagesMenuItemImplementation.A00(android.content.Context, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.user.model.User):X.C9T");
    }

    public static final void A01(06Z r301, ThreadSummary threadSummary, 7EN r303, User user) {
        ThreadParticipant A01;
        7zS.A16(0, threadSummary, r301, r303);
        if (user != null) {
            r303.A07(r301, threadSummary, BNT.A0H, user);
            return;
        }
        if (!threadSummary.A0n.A1H() || (A01 = 2Gt.A01(threadSummary)) == null) {
            return;
        }
        ParticipantInfo participantInfo = A01.A05;
        String str = participantInfo.A09.A00;
        if (str == null) {
            str = "";
        }
        UserKey userKey = participantInfo.A0F;
        11T.A09(userKey);
        r303.A05(r301, new BlockUnblockParams(userKey, str, str), threadSummary, BNT.A0H);
    }

    public static final boolean A02(Context context, C94 c94, ThreadSummary threadSummary, Capabilities capabilities) {
        boolean z = false;
        11T.A0F(context, 0);
        1BL.A1H(threadSummary, capabilities, c94);
        ThreadKey A0f = AbF.A0f(threadSummary);
        if (!ThreadKey.A0l(A0f)) {
            FbUserSession A0E = 4YV.A0E(context);
            if (!ThreadKey.A0q(A0f)) {
                if (ThreadKey.A0Q(A0f)) {
                    ImmutableList immutableList = threadSummary.A1L;
                    11T.A0A(immutableList);
                    if (immutableList.size() != 1) {
                        return true;
                    }
                    C00i c00i = c94.A04.A00;
                    if (c00i.get() == null) {
                        return true;
                    }
                    User user = (User) c00i.get();
                    if (!11T.A0O(user != null ? user.A13 : null, ((ThreadParticipant) immutableList.get(0)).A05.A00())) {
                        return true;
                    }
                } else {
                    if (A0f.A1H()) {
                        return 4YU.A1Y(capabilities, 10);
                    }
                    if (!threadSummary.A2i) {
                        return false;
                    }
                }
            }
            11T.A0F(A0E, 0);
            User A02 = ((AnonymousClass545) 4YU.A0o(A0E, c94.A00, 49481)).A02(A0f);
            if (A02 == null) {
                return false;
            }
            z = true;
            if (!c94.A02(A02)) {
                return false;
            }
        }
        return z;
    }
}
