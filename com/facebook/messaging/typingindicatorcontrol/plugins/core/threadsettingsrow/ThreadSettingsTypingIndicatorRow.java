package com.facebook.messaging.typingindicatorcontrol.plugins.core.threadsettingsrow;

import X.11T;
import X.AbG;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.C60l;
import X.CII;
import X.CQg;
import X.Cug;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsTypingIndicatorRow.class */
public final class ThreadSettingsTypingIndicatorRow {
    public static final long A02 = ThreadSettingsTypingIndicatorRow.class.hashCode();
    public final ThreadSummary A00;
    public final Context A01;

    public ThreadSettingsTypingIndicatorRow(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A00 = threadSummary;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r304.A02() == X.C1z1.NOT_BLOCKED) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(android.content.Context r301, com.facebook.auth.usersession.FbUserSession r302, com.facebook.messaging.model.threads.ThreadSummary r303, com.facebook.user.model.User r304) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.typingindicatorcontrol.plugins.core.threadsettingsrow.ThreadSettingsTypingIndicatorRow.A00(android.content.Context, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.user.model.User):boolean");
    }

    public final Cug A01() {
        CQg A00 = CQg.A00();
        Context context = this.A01;
        CQg.A07(context, A00, 2131967215);
        CQg.A08(BNV.A2O, A00);
        A00.A00 = A02;
        int i = 2131967211;
        if (C60l.A00(this.A00)) {
            i = 2131967210;
        }
        A00.A0B = AbG.A16(context, i);
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A6d, (C1ut) null, (Boolean) null);
        return CQg.A04(A00, this, 71);
    }
}
