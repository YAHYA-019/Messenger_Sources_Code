package com.facebook.rsys.messagequeue.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: MessageQueue.class */
public class MessageQueue {
    public static 2JQ CONVERTER = IR0.A00(ActionId.MESSENGER_DELTA_REQUEST);
    public static long sMcfTypeId;
    public final ArrayList items;
    public final String name;

    public MessageQueue(String str, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.name = str;
        this.items = arrayList;
    }

    public static native MessageQueue createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof MessageQueue)) {
                return false;
            }
            MessageQueue messageQueue = (MessageQueue) obj;
            if (this.name.equals(messageQueue.name) && this.items.equals(messageQueue.items)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.items, AbstractC2326GOr.A07(this.name));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MessageQueue{name=");
        A0k.append(this.name);
        A0k.append(",items=");
        return AbstractC2327GOs.A0U(this.items, A0k);
    }
}
