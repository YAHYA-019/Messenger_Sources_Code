package com.facebook.rsys.reactions.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: ReactionModel.class */
public class ReactionModel {
    public static 2JQ CONVERTER = LVi.A00(57);
    public static long sMcfTypeId;
    public final long reactionExpiryTime;
    public final EmojiModel selectedReaction;

    public ReactionModel(EmojiModel emojiModel, long j) {
        emojiModel.getClass();
        this.selectedReaction = emojiModel;
        this.reactionExpiryTime = j;
    }

    public static native ReactionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ReactionModel)) {
                return false;
            }
            ReactionModel reactionModel = (ReactionModel) obj;
            if (this.selectedReaction.equals(reactionModel.selectedReaction) && this.reactionExpiryTime == reactionModel.reactionExpiryTime) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2327GOs.A08(this.selectedReaction) + 1BL.A01(this.reactionExpiryTime);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ReactionModel{selectedReaction=");
        A0k.append(this.selectedReaction);
        A0k.append(",reactionExpiryTime=");
        A0k.append(this.reactionExpiryTime);
        return 1BL.A0v(A0k);
    }
}
