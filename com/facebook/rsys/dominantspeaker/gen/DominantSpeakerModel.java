package com.facebook.rsys.dominantspeaker.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: DominantSpeakerModel.class */
public class DominantSpeakerModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.QUERY_READY);
    public static long sMcfTypeId;
    public final String dominantSpeakerUserId;
    public final ArrayList recentDominantSpeakerUserIds;

    public DominantSpeakerModel(String str, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.dominantSpeakerUserId = str;
        this.recentDominantSpeakerUserIds = arrayList;
    }

    public static native DominantSpeakerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof DominantSpeakerModel)) {
                return false;
            }
            DominantSpeakerModel dominantSpeakerModel = (DominantSpeakerModel) obj;
            if (this.dominantSpeakerUserId.equals(dominantSpeakerModel.dominantSpeakerUserId) && this.recentDominantSpeakerUserIds.equals(dominantSpeakerModel.recentDominantSpeakerUserIds)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.recentDominantSpeakerUserIds, AbstractC2326GOr.A07(this.dominantSpeakerUserId));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DominantSpeakerModel{dominantSpeakerUserId=");
        A0k.append(this.dominantSpeakerUserId);
        A0k.append(",recentDominantSpeakerUserIds=");
        return AbstractC2327GOs.A0U(this.recentDominantSpeakerUserIds, A0k);
    }
}
