package com.facebook.messenger.mcp;

import X.11T;
import com.facebook.msys.mca.Mailbox;

/* loaded from: PluginContext.class */
public final class PluginContext {
    public final Mailbox A00;

    public PluginContext(Mailbox mailbox) {
        11T.A0F(mailbox, 1);
        this.A00 = mailbox;
    }

    public final Mailbox getMailbox() {
        return this.A00;
    }
}
