package com.facebook.wearable.common.comms.hera.host.intf;

import X.03Y;
import X.0DR;
import X.C15t;
import com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener;

/* loaded from: IHeraCallManager.class */
public interface IHeraCallManager {
    void addCallStateEventListener(IHeraCallEngineStateListener.ICallStateListener iCallStateListener);

    void addCameraStateEventListener(IHeraCallEngineStateListener.ICameraStateListener iCameraStateListener);

    void addDeviceStateEventListener(IHeraCallEngineStateListener.IDeviceStateListener iDeviceStateListener);

    void addPeerVideoStreamEventListener(IHeraCallEngineStateListener.IPeerVideoStreamListener iPeerVideoStreamListener);

    03Y getCurrentDesiredCamera();

    String getDebugStats();

    Object init(0DR r1);

    Object isCameraEnabled(String str, String str2, String str3, 0DR r4);

    Object isSelfVideoEnabled(0DR r1);

    boolean isWearableCameraActive();

    boolean isWearableCameraEnabled();

    Object release(0DR r1);

    void removeCallStateEventListener(IHeraCallEngineStateListener.ICallStateListener iCallStateListener);

    void removeCameraStateEventListener(IHeraCallEngineStateListener.ICameraStateListener iCameraStateListener);

    void removeDeviceStateEventListener(IHeraCallEngineStateListener.IDeviceStateListener iDeviceStateListener);

    void removePeerVideoStreamEventListener(IHeraCallEngineStateListener.IPeerVideoStreamListener iPeerVideoStreamListener);

    void setCameraSourceFlow(C15t c15t);

    void toggleCamera();

    void updateActiveCamera(String str);
}
