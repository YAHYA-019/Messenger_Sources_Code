package com.facebook.messaging.contextbanner.plugins.grouppromptaccessory.viewmembers;

import X.1BL;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* loaded from: ViewMembersGroupPromptAccessoryImplementation.class */
public final class ViewMembersGroupPromptAccessoryImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final ThreadSummary A04;

    public ViewMembersGroupPromptAccessoryImplementation(Context context, ThreadKey threadKey, ThreadSummary threadSummary) {
        1BL.A1F(context, threadKey);
        this.A00 = context;
        this.A03 = threadKey;
        this.A04 = threadSummary;
        this.A02 = 1Bu.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
        this.A01 = 1Bu.A00(794);
    }
}
