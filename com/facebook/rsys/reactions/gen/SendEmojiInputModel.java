package com.facebook.rsys.reactions.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: SendEmojiInputModel.class */
public class SendEmojiInputModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.FUTURE_LISTENERS_COMPLETE);
    public static long sMcfTypeId;
    public final String emojiId;
    public final int source;
    public final int type;

    public SendEmojiInputModel(String str, int i, int i2) {
        str.getClass();
        this.emojiId = str;
        this.type = i;
        this.source = i2;
    }

    public static native SendEmojiInputModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof SendEmojiInputModel)) {
                return false;
            }
            SendEmojiInputModel sendEmojiInputModel = (SendEmojiInputModel) obj;
            if (this.emojiId.equals(sendEmojiInputModel.emojiId) && this.type == sendEmojiInputModel.type && this.source == sendEmojiInputModel.source) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A07(this.emojiId) + this.type) * 31) + this.source;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SendEmojiInputModel{emojiId=");
        A0k.append(this.emojiId);
        A0k.append(",type=");
        A0k.append(this.type);
        A0k.append(",source=");
        return AbstractC2327GOs.A0W(A0k, this.source);
    }
}
