package com.facebook.rsys.reactions.gen;

import X.1BK;
import X.2JQ;
import X.7zP;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: EmojiReactionsParticipantModel.class */
public class EmojiReactionsParticipantModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.APPLY_OPTIMISTICS);
    public static long sMcfTypeId;
    public final EmojiModel emoji;
    public final long emojiExpiryTime;
    public final String participantId;
    public final ArrayList reactions;

    public EmojiReactionsParticipantModel(String str, EmojiModel emojiModel, long j, ArrayList arrayList) {
        7zP.A1S(str, emojiModel, arrayList);
        this.participantId = str;
        this.emoji = emojiModel;
        this.emojiExpiryTime = j;
        this.reactions = arrayList;
    }

    public static native EmojiReactionsParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof EmojiReactionsParticipantModel)) {
                return false;
            }
            EmojiReactionsParticipantModel emojiReactionsParticipantModel = (EmojiReactionsParticipantModel) obj;
            if (this.participantId.equals(emojiReactionsParticipantModel.participantId) && this.emoji.equals(emojiReactionsParticipantModel.emoji) && this.emojiExpiryTime == emojiReactionsParticipantModel.emojiExpiryTime && this.reactions.equals(emojiReactionsParticipantModel.reactions)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.reactions, AnonymousClass002.A02(this.emojiExpiryTime, AnonymousClass002.A05(this.emoji, AbstractC2326GOr.A07(this.participantId))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EmojiReactionsParticipantModel{participantId=");
        A0k.append(this.participantId);
        A0k.append(",emoji=");
        A0k.append(this.emoji);
        A0k.append(",emojiExpiryTime=");
        A0k.append(this.emojiExpiryTime);
        A0k.append(",reactions=");
        return AbstractC2327GOs.A0U(this.reactions, A0k);
    }
}
