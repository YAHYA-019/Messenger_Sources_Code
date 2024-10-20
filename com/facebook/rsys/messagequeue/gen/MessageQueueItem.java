package com.facebook.rsys.messagequeue.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: MessageQueueItem.class */
public class MessageQueueItem {
    public static 2JQ CONVERTER = LVi.A00(33);
    public static long sMcfTypeId;
    public final int expiryTimeMsec;
    public final int id;
    public final McfReference message;

    public MessageQueueItem(int i, int i2, McfReference mcfReference) {
        mcfReference.getClass();
        this.id = i;
        this.expiryTimeMsec = i2;
        this.message = mcfReference;
    }

    public static native MessageQueueItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof MessageQueueItem)) {
                return false;
            }
            MessageQueueItem messageQueueItem = (MessageQueueItem) obj;
            if (this.id == messageQueueItem.id && this.expiryTimeMsec == messageQueueItem.expiryTimeMsec && this.message.equals(messageQueueItem.message)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.message, (AbstractC2326GOr.A03(this.id) + this.expiryTimeMsec) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MessageQueueItem{id=");
        A0k.append(this.id);
        A0k.append(",expiryTimeMsec=");
        A0k.append(this.expiryTimeMsec);
        A0k.append(",message=");
        return AbstractC2327GOs.A0U(this.message, A0k);
    }
}
