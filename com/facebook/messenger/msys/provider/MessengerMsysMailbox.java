package com.facebook.messenger.msys.provider;

import X.0fH;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: MessengerMsysMailbox.class */
public final class MessengerMsysMailbox {
    public volatile MessengerPerUserMsysMailbox A00;
    public volatile MailboxCallback A01;

    public static void A00(MessengerMsysMailbox messengerMsysMailbox, Runnable runnable) {
        synchronized (messengerMsysMailbox) {
            messengerMsysMailbox.A00 = null;
            runnable.run();
            if (messengerMsysMailbox.A01 != null) {
                0fH.A0l("com.facebook.messenger.msys.provider.MessengerMsysMailbox", "Initialize next mailbox");
                messengerMsysMailbox.A01(messengerMsysMailbox.A01);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r0 != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v14, types: [X.1h9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v5, types: [java.lang.Object, X.1gn] */
    /* JADX WARN: Type inference failed for: r307v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(com.facebook.msys.mca.MailboxCallback r302) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.msys.provider.MessengerMsysMailbox.A01(com.facebook.msys.mca.MailboxCallback):void");
    }
}
