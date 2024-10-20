package com.facebook.messaging.leadgen.plugins.quickreplydataloader.leadform;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.6Ry;
import X.6Rz;
import X.6S0;
import X.8AN;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: LeadFormIceBreakerDataLoaderImplementation.class */
public final class LeadFormIceBreakerDataLoaderImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 6S0 A05;

    public LeadFormIceBreakerDataLoaderImplementation(Context context, FbUserSession fbUserSession, 6S0 r304) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r304, 3);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A05 = r304;
        this.A03 = 1Bq.A00(16385);
        this.A04 = 1Bq.A00(16456);
        this.A02 = 1Bq.A00(16634);
    }

    public static final boolean A00(LeadFormIceBreakerDataLoaderImplementation leadFormIceBreakerDataLoaderImplementation, ThreadSummary threadSummary) {
        6Ry r0 = (6Ry) 1Lm.A05(leadFormIceBreakerDataLoaderImplementation.A00, leadFormIceBreakerDataLoaderImplementation.A01, 68530);
        ThreadKey threadKey = threadSummary != null ? threadSummary.A0n : null;
        ThreadKey threadKey2 = r0.A01.A01;
        ImmutableList immutableList = ((threadKey2 == null || !threadKey2.equals(threadKey)) ? 6Rz.A02 : r0.A01).A00;
        if (immutableList == null) {
            return false;
        }
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            if (((QuickReplyItem) it.next()).A02 == 8AN.A04) {
                return true;
            }
        }
        return false;
    }
}
