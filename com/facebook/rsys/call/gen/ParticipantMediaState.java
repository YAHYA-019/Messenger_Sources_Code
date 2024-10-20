package com.facebook.rsys.call.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: ParticipantMediaState.class */
public class ParticipantMediaState {
    public static 2JQ CONVERTER = IR0.A00(27);
    public static long sMcfTypeId;
    public final ArrayList audioStreams;
    public final ArrayList videoStreams;

    public ParticipantMediaState(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.videoStreams = arrayList;
        this.audioStreams = arrayList2;
    }

    public static native ParticipantMediaState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ParticipantMediaState)) {
                return false;
            }
            ParticipantMediaState participantMediaState = (ParticipantMediaState) obj;
            if (this.videoStreams.equals(participantMediaState.videoStreams) && this.audioStreams.equals(participantMediaState.audioStreams)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.audioStreams, AbstractC2327GOs.A08(this.videoStreams));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ParticipantMediaState{videoStreams=");
        A0k.append(this.videoStreams);
        A0k.append(",audioStreams=");
        return AbstractC2327GOs.A0U(this.audioStreams, A0k);
    }
}
