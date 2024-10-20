package com.facebook.messaging.contextbanner.plugins.grouppromptaccessory.editname;

import X.06Z;
import X.1BL;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: EditNameGroupPromptAccessoryImplementation.class */
public final class EditNameGroupPromptAccessoryImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final ThreadKey A04;

    public EditNameGroupPromptAccessoryImplementation(Context context, 06Z r303, ThreadKey threadKey, ThreadSummary threadSummary) {
        1BL.A1H(context, threadKey, r303);
        this.A00 = context;
        this.A04 = threadKey;
        this.A01 = r303;
        this.A03 = threadSummary;
        this.A02 = 1Bu.A01(context, 82259);
    }
}
