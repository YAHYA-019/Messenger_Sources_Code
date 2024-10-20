package com.facebook.messaging.publicchats.plugins.threaddetails.editchatmenuitem;

import X.1BK;
import X.1BL;
import X.1pI;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: EditChatMenuItemImplementation.class */
public final class EditChatMenuItemImplementation {
    public final Context A00;
    public final 1pI A01;
    public final ThreadSummary A02;

    public EditChatMenuItemImplementation(Context context, 1pI r303, ThreadSummary threadSummary) {
        1BL.A1F(context, r303);
        this.A00 = context;
        this.A01 = r303;
        if (threadSummary == null) {
            throw 1BK.A0h();
        }
        this.A02 = threadSummary;
    }
}
