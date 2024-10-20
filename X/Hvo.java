package X;

import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import com.facebook.rsys.video.gen.VideoStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: Hvo.class */
public abstract class Hvo {
    public static final boolean A00(ParticipantMediaState participantMediaState) {
        ArrayList arrayList = participantMediaState.audioStreams;
        11T.A09(arrayList);
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i = ((AudioStream) it.next()).streamState;
            if (i == 3 || i == 2 || i == 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A01(ParticipantMediaState participantMediaState) {
        ArrayList arrayList = participantMediaState.videoStreams;
        11T.A09(arrayList);
        boolean z = true;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i = ((VideoStream) it.next()).streamState;
                if (i == 3 || i == 4) {
                    break;
                }
                if (i == 2) {
                    return true;
                }
            }
        }
        z = false;
        return z;
    }
}
