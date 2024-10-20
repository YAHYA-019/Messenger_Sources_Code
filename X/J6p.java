package X;

import com.facebook.rtc.views.omnigrid.GridItemSize;
import com.facebook.user.model.UserKey;
import java.util.Iterator;
import org.webrtc.legacy.videoengine.VideoSizeChangedListener;

/* loaded from: J6p.class */
public final class J6p implements VideoSizeChangedListener {
    public final /* synthetic */ GqX A00;

    public J6p(GqX gqX) {
        this.A00 = gqX;
    }

    @Override // org.webrtc.legacy.videoengine.VideoSizeChangedListener
    public final void onVideoSizeChanged(int i, int i2) {
        GrT grT = (GrT) this.A00.A09.getValue();
        UserKey userKey = grT.A01;
        if (userKey == null) {
            4zI.A03.A06("RemoteVideoParticipantPresenter", "Unexpected null mParticipantKey for onVideoSizeChanged", AnonymousClass001.A1Z());
            return;
        }
        I1m i1m = (I1m) 1Br.A0B(grT.A0B);
        String str = userKey.id;
        11T.A0A(str);
        I1m.A00();
        i1m.A00.put(str, new GridItemSize(i, i2));
        4zI.A03.A05("ParticipantDecodedVideoSizeTracker", "Remote participant video size changed. User id: %s, width: %d, height: %d", 1BK.A1a(str, Integer.valueOf(i), i2));
        Iterator it = i1m.A01.iterator();
        while (it.hasNext()) {
            ((JFo) it.next()).CSh();
        }
        if (GrT.A0C(grT)) {
            GrT.A03(grT);
        }
    }
}
