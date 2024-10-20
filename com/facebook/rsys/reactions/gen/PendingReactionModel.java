package com.facebook.rsys.reactions.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PendingReactionModel.class */
public class PendingReactionModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.APPLY_FINISHED_LIST);
    public static long sMcfTypeId;
    public final EmojiModel emoji;
    public final int source;

    public PendingReactionModel(EmojiModel emojiModel, int i) {
        emojiModel.getClass();
        this.emoji = emojiModel;
        this.source = i;
    }

    public static native PendingReactionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PendingReactionModel)) {
                return false;
            }
            PendingReactionModel pendingReactionModel = (PendingReactionModel) obj;
            if (this.emoji.equals(pendingReactionModel.emoji) && this.source == pendingReactionModel.source) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2327GOs.A08(this.emoji) + this.source;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PendingReactionModel{emoji=");
        A0k.append(this.emoji);
        A0k.append(",source=");
        return AbstractC2327GOs.A0W(A0k, this.source);
    }
}
