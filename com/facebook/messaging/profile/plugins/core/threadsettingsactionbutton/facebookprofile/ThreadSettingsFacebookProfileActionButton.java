package com.facebook.messaging.profile.plugins.core.threadsettingsactionbutton.facebookprofile;

import X.06Z;
import X.1BO;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.2MQ;
import X.3yU;
import X.3yV;
import X.4YV;
import X.7zL;
import X.AbH;
import X.BOo;
import X.C00i;
import X.C8R;
import X.CJ6;
import X.COp;
import X.CZ7;
import X.DJX;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* loaded from: ThreadSettingsFacebookProfileActionButton.class */
public final class ThreadSettingsFacebookProfileActionButton {
    public static boolean A04;
    public static final C00i A05 = AbH.A0X();
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 82248);
    public final C00i A01 = 1BV.A01((1BY) null, 50218);
    public final CJ6 A03 = (CJ6) 1Bn.A0E((Context) null, (1BY) null, 83668);

    public ThreadSettingsFacebookProfileActionButton(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r0 == X.1M1.A09) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        if (r0.equals(X.1Kn.A01) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (r315 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r0 == X.1Kn.A06) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(com.facebook.user.model.User r301, com.facebook.xapp.messaging.capability.vector.Capabilities r302) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.profile.plugins.core.threadsettingsactionbutton.facebookprofile.ThreadSettingsFacebookProfileActionButton.A00(com.facebook.user.model.User, com.facebook.xapp.messaging.capability.vector.Capabilities):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.COp, java.lang.Object] */
    public C8R A01(Context context, 06Z r303, ThreadKey threadKey, DJX djx, User user) {
        FbUserSession A0D = 4YV.A0D(context);
        this.A03.A03((BOo) null, 3yU.A0D, 3yV.A0M, true);
        CZ7 cz7 = new CZ7(3, this, djx, context, r303, user, threadKey, A0D);
        ?? obj = new Object();
        ((COp) obj).A03 = cz7;
        COp.A01(A04 ? 2MQ.A0A : 2MQ.A1U, (COp) obj);
        ((COp) obj).A01 = 2131967133;
        return COp.A00((COp) obj, 2131967133);
    }
}
