package com.facebook.messaging.editmessage.plugins.editmessage.contextmenu;

import X.1Br;
import X.1Bu;
import X.7zM;
import X.BNO;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: EditMessageMenuItemPluginImplementation.class */
public final class EditMessageMenuItemPluginImplementation {
    public static final BNO A07 = BNO.A0K;
    public final Message A03;
    public final Context A04;
    public final ThreadSummary A05;
    public final Capabilities A06;
    public final 1Br A01 = 1Bu.A00(81928);
    public final 1Br A02 = 7zM.A0U();
    public final 1Br A00 = 1Bu.A00(147580);

    public EditMessageMenuItemPluginImplementation(Context context, Message message, ThreadSummary threadSummary, Capabilities capabilities) {
        this.A03 = message;
        this.A04 = context;
        this.A06 = capabilities;
        this.A05 = threadSummary;
    }
}
