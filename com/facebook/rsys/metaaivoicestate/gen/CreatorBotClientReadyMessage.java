package com.facebook.rsys.metaaivoicestate.gen;

import X.0Pz;
import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CreatorBotClientReadyMessage.class */
public class CreatorBotClientReadyMessage {
    public static 2JQ CONVERTER = N6e.A00(38);
    public static long sMcfTypeId;
    public final boolean ready;

    public CreatorBotClientReadyMessage(boolean z) {
        this.ready = z;
    }

    public static native CreatorBotClientReadyMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CreatorBotClientReadyMessage)) {
                return false;
            }
            if (this.ready != ((CreatorBotClientReadyMessage) obj).ready) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 527 + (this.ready ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A19("CreatorBotClientReadyMessage{ready=", "}", this.ready);
    }
}
