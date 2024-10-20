package com.facebook.messaging.contextbanner.plugins.grouppromptaccessory.addmember;

import X.1BL;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AddMemberGroupPromptAccessoryImplementation.class */
public final class AddMemberGroupPromptAccessoryImplementation {
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;

    public AddMemberGroupPromptAccessoryImplementation(Context context, ThreadKey threadKey) {
        1BL.A1F(context, threadKey);
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = 1Bu.A00(83027);
    }
}
