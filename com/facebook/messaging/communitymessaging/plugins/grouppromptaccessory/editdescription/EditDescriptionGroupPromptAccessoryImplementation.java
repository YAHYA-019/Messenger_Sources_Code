package com.facebook.messaging.communitymessaging.plugins.grouppromptaccessory.editdescription;

import X.1BL;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: EditDescriptionGroupPromptAccessoryImplementation.class */
public final class EditDescriptionGroupPromptAccessoryImplementation {
    public final Context A00;
    public final ThreadKey A01;
    public final ThreadSummary A02;

    public EditDescriptionGroupPromptAccessoryImplementation(Context context, ThreadKey threadKey, ThreadSummary threadSummary) {
        1BL.A1F(context, threadKey);
        this.A00 = context;
        this.A01 = threadKey;
        this.A02 = threadSummary;
    }
}
