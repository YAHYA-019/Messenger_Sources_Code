package com.facebook.messaging.communitymessaging.plugins.grouppromptaccessory.invite;

import X.06Z;
import X.1BL;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: InviteGroupPromptAccessoryImplementation.class */
public final class InviteGroupPromptAccessoryImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final ThreadSummary A04;

    public InviteGroupPromptAccessoryImplementation(Context context, 06Z r303, ThreadKey threadKey, ThreadSummary threadSummary) {
        1BL.A1H(context, threadKey, r303);
        this.A00 = context;
        this.A03 = threadKey;
        this.A01 = r303;
        this.A04 = threadSummary;
        this.A02 = 1Bu.A00(82368);
    }
}
