package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KEh;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CallCameraState.class */
public final class CallCameraState extends KJb implements MJ3 {
    public static final int ACTIVE_CAMERA_ID_FIELD_NUMBER = 7;
    public static final int ACTIVE_DEVICE_ID_FIELD_NUMBER = 6;
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final int CAMERA_BLOCKED_BY_MITIGATION_FIELD_NUMBER = 5;
    public static final int CAMERA_BLOCKED_BY_SCREENSHARE_FIELD_NUMBER = 10;
    public static final int CAMERA_ID_DESIRED_FIELD_NUMBER = 9;
    public static final int CAMERA_ON_DESIRED_FIELD_NUMBER = 3;
    public static final int CAMERA_PAUSED_DESIRED_FIELD_NUMBER = 4;
    public static final CallCameraState DEFAULT_INSTANCE;
    public static final int DEFAULT_VIDEO_STREAM_STATE_FIELD_NUMBER = 2;
    public static final int DEVICE_ID_DESIRED_FIELD_NUMBER = 8;
    public static volatile MGg PARSER;
    public int bitField0_;
    public boolean cameraBlockedByMitigation_;
    public boolean cameraBlockedByScreenshare_;
    public boolean cameraOnDesired_;
    public boolean cameraPausedDesired_;
    public int defaultVideoStreamState_;
    public String callId_ = "";
    public String activeDeviceId_ = "";
    public String activeCameraId_ = "";
    public String deviceIdDesired_ = "";
    public String cameraIdDesired_ = "";

    static {
        CallCameraState callCameraState = new CallCameraState();
        DEFAULT_INSTANCE = callCameraState;
        KJb.A0A(callCameraState, CallCameraState.class);
    }

    public static KEh newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallCameraState parseFrom(ByteBuffer byteBuffer) {
        return (CallCameraState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
    }

    public final Object dynamicMethod(KMJ kmj, Object obj, Object obj2) {
        Object obj3;
        MGg mGg;
        switch (kmj.ordinal()) {
            case 0:
                obj3 = (byte) 1;
                break;
            case 1:
                return null;
            case 2:
                return KJb.A05(DEFAULT_INSTANCE, "��\n��\u0001\u0001\n\n������\u0001Ȉ\u0002\f\u0003\u0007\u0004\u0007\u0005\u0007\u0006ለ��\u0007ለ\u0001\bለ\u0002\tለ\u0003\n\u0007", new Object[]{"bitField0_", "callId_", "defaultVideoStreamState_", "cameraOnDesired_", "cameraPausedDesired_", "cameraBlockedByMitigation_", "activeDeviceId_", "activeCameraId_", "deviceIdDesired_", "cameraIdDesired_", "cameraBlockedByScreenshare_"});
            case 3:
                return new CallCameraState();
            case 4:
                return new KEh();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallCameraState.class) {
                        mGg = PARSER;
                        if (mGg == null) {
                            L9l l9l = Lgf.A01;
                            mGg = KJb.A00(DEFAULT_INSTANCE);
                            PARSER = mGg;
                        }
                    }
                    return mGg;
                }
                break;
            default:
                throw AnonymousClass001.A0p();
        }
        return obj3;
    }
}
