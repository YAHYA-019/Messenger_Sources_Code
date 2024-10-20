package com.facebook.wearable.common.comms.hera.shared.intf;

import X.0DR;
import java.util.List;

/* loaded from: IHeraCallEngineStateListener.class */
public interface IHeraCallEngineStateListener {

    /* loaded from: IHeraCallEngineStateListener$ICallStateListener.class */
    public interface ICallStateListener {
        Object onCallEnd(String str, 0DR r2);

        Object onCallStart(String str, 0DR r2);
    }

    /* loaded from: IHeraCallEngineStateListener$ICameraStateListener.class */
    public interface ICameraStateListener {
        void onActiveCameraChanged(Camera camera);

        void onAvailableCameraChanged(List list);

        void onCameraSwitchComplete(Camera camera);

        void onCameraSwitchInProgress(Camera camera, Camera camera2);

        void onDesiredCameraChanged(Camera camera);
    }

    /* loaded from: IHeraCallEngineStateListener$IDeviceStateListener.class */
    public interface IDeviceStateListener {
        void onDeviceStateChanged(List list);
    }

    /* loaded from: IHeraCallEngineStateListener$IPeerVideoStreamListener.class */
    public interface IPeerVideoStreamListener {
        void onPeerVideoStarted(String str);

        void onPeerVideoStopped(String str);
    }
}
