package com.facebook.messaging.threadview.plugins.contextmenuitems.copyitem;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.2Sh;
import X.7zK;
import X.7zM;
import X.BNO;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: CopyMenuItemPluginImplementation.class */
public final class CopyMenuItemPluginImplementation {
    public static final BNO A08 = BNO.A0D;
    public final ClipboardManager A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Message A04;
    public final Capabilities A05;
    public final 2Sh A06;
    public final Context A07;

    public CopyMenuItemPluginImplementation(Context context, Message message, Capabilities capabilities, 2Sh r305) {
        11T.A0F(context, 1);
        this.A07 = context;
        this.A04 = message;
        this.A05 = capabilities;
        this.A06 = r305;
        Object systemService = context.getSystemService("clipboard");
        11T.A0I(systemService, 7zK.A00(3));
        this.A00 = (ClipboardManager) systemService;
        this.A03 = 1HG.A00(context, 99435);
        this.A01 = 1Bu.A00(81928);
        this.A02 = 7zM.A0U();
    }
}
