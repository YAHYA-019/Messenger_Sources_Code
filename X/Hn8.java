package X;

import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsServiceObjectsWrapper;
import java.util.LinkedList;
import org.json.JSONObject;

/* loaded from: Hn8.class */
public final class Hn8 {
    public PlatformEventsServiceObjectsWrapper A00;
    public final LinkedList A01 = AbF.A1F();

    public void A00(JSONObject jSONObject) {
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = this.A00;
        if (platformEventsServiceObjectsWrapper == null || !platformEventsServiceObjectsWrapper._isAlive) {
            this.A01.add(jSONObject);
        } else {
            platformEventsServiceObjectsWrapper.enqueueEvent(jSONObject);
        }
    }
}
