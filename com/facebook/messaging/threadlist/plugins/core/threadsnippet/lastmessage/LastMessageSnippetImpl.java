package com.facebook.messaging.threadlist.plugins.core.threadsnippet.lastmessage;

import X.11T;
import X.1Bq;
import X.1Br;
import X.C01g;
import X.C01i;
import X.C15h;
import X.C2xu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: LastMessageSnippetImpl.class */
public final class LastMessageSnippetImpl {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C15h A05;
    public final C01i A06;

    public LastMessageSnippetImpl(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A06 = C01g.A01(new C2xu(fbUserSession, this, 14));
        this.A02 = 1Bq.A00(66067);
        this.A05 = new C15h() { // from class: X.2zq
            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                return 1Bn.A0A(83436);
            }
        };
        this.A03 = 1Bq.A00(16385);
        this.A01 = 1Bq.A00(66266);
        this.A04 = 1Bq.A00(68133);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004b, code lost:
    
        if (r311.length() == 0) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0321 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.2nH A00(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadlist.plugins.core.threadsnippet.lastmessage.LastMessageSnippetImpl.A00(com.facebook.messaging.model.threads.ThreadSummary):X.2nH");
    }
}
