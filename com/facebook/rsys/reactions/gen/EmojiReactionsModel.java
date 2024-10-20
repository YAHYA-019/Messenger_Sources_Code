package com.facebook.rsys.reactions.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: EmojiReactionsModel.class */
public class EmojiReactionsModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE);
    public static long sMcfTypeId;
    public final ArrayList allowedGifDomains;
    public final ArrayList emojiParticipants;
    public final boolean isEmojiReactionsFeatureEnabled;
    public final PendingReactionModel pendingReaction;

    public EmojiReactionsModel(ArrayList arrayList, boolean z, PendingReactionModel pendingReactionModel, ArrayList arrayList2) {
        arrayList.getClass();
        this.emojiParticipants = arrayList;
        this.isEmojiReactionsFeatureEnabled = z;
        this.pendingReaction = pendingReactionModel;
        this.allowedGifDomains = arrayList2;
    }

    public static native EmojiReactionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EmojiReactionsModel)) {
                return false;
            }
            EmojiReactionsModel emojiReactionsModel = (EmojiReactionsModel) obj;
            if (!this.emojiParticipants.equals(emojiReactionsModel.emojiParticipants) || this.isEmojiReactionsFeatureEnabled != emojiReactionsModel.isEmojiReactionsFeatureEnabled) {
                return false;
            }
            PendingReactionModel pendingReactionModel = this.pendingReaction;
            PendingReactionModel pendingReactionModel2 = emojiReactionsModel.pendingReaction;
            if (pendingReactionModel == null) {
                if (pendingReactionModel2 != null) {
                    return false;
                }
            } else if (!pendingReactionModel.equals(pendingReactionModel2)) {
                return false;
            }
            ArrayList arrayList = this.allowedGifDomains;
            ArrayList arrayList2 = emojiReactionsModel.allowedGifDomains;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC2327GOs.A08(this.emojiParticipants) + (this.isEmojiReactionsFeatureEnabled ? 1 : 0)) * 31) + AnonymousClass001.A02(this.pendingReaction)) * 31) + 4YU.A03(this.allowedGifDomains);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EmojiReactionsModel{emojiParticipants=");
        A0k.append(this.emojiParticipants);
        A0k.append(",isEmojiReactionsFeatureEnabled=");
        A0k.append(this.isEmojiReactionsFeatureEnabled);
        A0k.append(",pendingReaction=");
        A0k.append(this.pendingReaction);
        A0k.append(",allowedGifDomains=");
        return AbstractC2327GOs.A0U(this.allowedGifDomains, A0k);
    }
}
