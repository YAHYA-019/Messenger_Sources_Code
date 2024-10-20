package com.facebook.rsys.reactions.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: EmojiModel.class */
public class EmojiModel {
    public static 2JQ CONVERTER = IR0.A00(150);
    public static long sMcfTypeId;
    public final String emojiClickId;
    public final String emojiId;
    public final int type;

    public EmojiModel(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.emojiId = str;
        this.emojiClickId = str2;
        this.type = i;
    }

    public static native EmojiModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof EmojiModel)) {
                return false;
            }
            EmojiModel emojiModel = (EmojiModel) obj;
            if (this.emojiId.equals(emojiModel.emojiId) && this.emojiClickId.equals(emojiModel.emojiClickId) && this.type == emojiModel.type) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.emojiClickId, AbstractC2326GOr.A07(this.emojiId)) + this.type;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EmojiModel{emojiId=");
        A0k.append(this.emojiId);
        A0k.append(",emojiClickId=");
        A0k.append(this.emojiClickId);
        A0k.append(",type=");
        return AbstractC2327GOs.A0W(A0k, this.type);
    }
}
