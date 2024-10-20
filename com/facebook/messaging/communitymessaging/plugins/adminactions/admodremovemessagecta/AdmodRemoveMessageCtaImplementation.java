package com.facebook.messaging.communitymessaging.plugins.adminactions.admodremovemessagecta;

import X.06Z;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Lm;
import X.4YU;
import X.4YV;
import X.5zD;
import X.AbF;
import X.AbG;
import X.AdC;
import X.Ca0;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AdmodRemoveMessageCtaImplementation.class */
public final class AdmodRemoveMessageCtaImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 5zD A05;
    public final AdminMessageCta A06;
    public final ThreadSummary A07;
    public final String A08;

    public AdmodRemoveMessageCtaImplementation(Context context, 06Z r303, FbUserSession fbUserSession, 5zD r305, AdminMessageCta adminMessageCta, ThreadSummary threadSummary, String str) {
        1BL.A1H(context, fbUserSession, adminMessageCta);
        4YV.A1M(r303, 6, r305);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A06 = adminMessageCta;
        this.A08 = str;
        this.A07 = threadSummary;
        this.A01 = r303;
        this.A05 = r305;
        this.A04 = AbG.A0c();
        this.A03 = AbG.A0Q();
    }

    public final void A00(Uri uri) {
        ThreadSummary threadSummary;
        String queryParameter;
        if (uri == null || (threadSummary = this.A07) == null || (queryParameter = uri.getQueryParameter("community_id")) == null) {
            return;
        }
        ThreadKey threadKey = threadSummary.A0l;
        Long l = null;
        String.valueOf(threadKey != null ? 4YU.A0l(threadKey) : null);
        String queryParameter2 = uri.getQueryParameter("thread_id");
        if (queryParameter2 != null) {
            ThreadKey threadKey2 = threadSummary.A0n;
            if (threadKey2 != null) {
                l = AbF.A14(threadKey2);
            }
            String.valueOf(l);
            String queryParameter3 = uri.getQueryParameter("removed_msg_sender_id");
            if (queryParameter3 != null) {
                long j = threadSummary.A06;
                FbUserSession fbUserSession = this.A02;
                Context context = this.A00;
                MutableLiveData A04 = ((AdC) 1Lm.A05(context, fbUserSession, 82391)).A04(context, Long.valueOf(j), 1BK.A0n(queryParameter), Long.parseLong(queryParameter3), Long.parseLong(queryParameter2));
                A04.observeForever(new Ca0(A04, this, queryParameter3, 1));
            }
        }
    }
}
