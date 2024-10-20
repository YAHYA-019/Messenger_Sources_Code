package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKC;
import X.Hn8;
import X.JEH;
import com.facebook.jni.HybridData;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: PlatformEventsServiceObjectsWrapper.class */
public final class PlatformEventsServiceObjectsWrapper {
    public boolean _isAlive;
    public final JEH delegate;
    public final Hn8 input;
    public final HybridData mHybridData;

    public PlatformEventsServiceObjectsWrapper(JEH jeh, Hn8 hn8) {
        this.delegate = jeh;
        this.input = hn8;
        if (hn8 != null) {
            hn8.A00 = this;
        }
        this.mHybridData = initHybrid();
    }

    private final native void enqueueEventNative(String str);

    private final native HybridData initHybrid();

    public final void didReceiveEngineEvent(String str) {
        try {
            JSONObject A1F = DKC.A1F(str);
            JEH jeh = this.delegate;
            if (jeh != null) {
                jeh.ANG(A1F);
            }
        } catch (JSONException e) {
            throw AnonymousClass002.A0C(e, "Invalid json events from engine: ", AnonymousClass001.A0k());
        }
    }

    public void enqueueEvent(JSONObject jSONObject) {
        11T.A0F(jSONObject, 0);
        enqueueEventNative(11T.A02(jSONObject));
    }

    public final void start() {
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper;
        this._isAlive = true;
        Hn8 hn8 = this.input;
        if (hn8 == null || (platformEventsServiceObjectsWrapper = hn8.A00) == null || !platformEventsServiceObjectsWrapper._isAlive) {
            return;
        }
        while (true) {
            LinkedList linkedList = hn8.A01;
            if (linkedList.isEmpty()) {
                return;
            }
            PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper2 = hn8.A00;
            Object pop = linkedList.pop();
            pop.getClass();
            platformEventsServiceObjectsWrapper2.enqueueEvent((JSONObject) pop);
        }
    }
}
