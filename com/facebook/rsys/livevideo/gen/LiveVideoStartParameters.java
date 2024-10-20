package com.facebook.rsys.livevideo.gen;

import X.2JQ;
import X.7zM;
import X.7zP;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: LiveVideoStartParameters.class */
public class LiveVideoStartParameters {
    public static 2JQ CONVERTER = LVi.A00(25);
    public static long sMcfTypeId;
    public final ArrayList activeParticipants;
    public final String funnelSessionId;
    public final ArrayList participantsMediaStatus;

    public LiveVideoStartParameters(ArrayList arrayList, ArrayList arrayList2, String str) {
        7zP.A1S(arrayList, arrayList2, str);
        this.activeParticipants = arrayList;
        this.participantsMediaStatus = arrayList2;
        this.funnelSessionId = str;
    }

    public static native LiveVideoStartParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LiveVideoStartParameters)) {
                return false;
            }
            LiveVideoStartParameters liveVideoStartParameters = (LiveVideoStartParameters) obj;
            if (this.activeParticipants.equals(liveVideoStartParameters.activeParticipants) && this.participantsMediaStatus.equals(liveVideoStartParameters.participantsMediaStatus) && this.funnelSessionId.equals(liveVideoStartParameters.funnelSessionId)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zM.A05(this.funnelSessionId, AnonymousClass002.A05(this.participantsMediaStatus, AbstractC2327GOs.A08(this.activeParticipants)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LiveVideoStartParameters{activeParticipants=");
        A0k.append(this.activeParticipants);
        A0k.append(",participantsMediaStatus=");
        A0k.append(this.participantsMediaStatus);
        A0k.append(",funnelSessionId=");
        return GOq.A12(this.funnelSessionId, A0k);
    }
}
