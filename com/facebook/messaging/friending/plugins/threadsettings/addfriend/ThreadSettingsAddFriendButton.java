package com.facebook.messaging.friending.plugins.threadsettings.addfriend;

import X.06Z;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Kn;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ThreadSettingsAddFriendButton.class */
public final class ThreadSettingsAddFriendButton {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final ThreadSummary A04;
    public final User A05;

    public ThreadSettingsAddFriendButton(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, User user) {
        1BL.A11(1, context, fbUserSession, r303);
        this.A00 = context;
        this.A05 = user;
        this.A02 = fbUserSession;
        this.A01 = r303;
        this.A04 = threadSummary;
        this.A03 = 1Bu.A00(83668);
    }

    public static final int A00(1Kn r301) {
        int i;
        if (1Kn.A03 == r301) {
            return 2131966938;
        }
        if (1Kn.A04 == r301) {
            i = 2131966945;
        } else {
            if (1Kn.A01 == r301) {
                return 2131966942;
            }
            i = 2131966941;
            if (1Kn.A05 != r301) {
                return 2131966938;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (r310 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        if (r304 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ee, code lost:
    
        if (r304 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (r304 == null) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.COp, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C8R A01() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.friending.plugins.threadsettings.addfriend.ThreadSettingsAddFriendButton.A01():X.C8R");
    }
}
