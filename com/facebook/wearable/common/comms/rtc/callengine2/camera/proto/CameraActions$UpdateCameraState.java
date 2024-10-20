package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KEq;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CameraActions$UpdateCameraState.class */
public final class CameraActions$UpdateCameraState extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 1;
    public static final int CAMERA_BLOCKED_BY_MITIGATION_FIELD_NUMBER = 3;
    public static final int CAMERA_BLOCKED_BY_SCREENSHARE_FIELD_NUMBER = 4;
    public static final CameraActions$UpdateCameraState DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int STATE_FIELD_NUMBER = 2;
    public String arbitraryCallId_ = "";
    public int bitField0_;
    public boolean cameraBlockedByMitigation_;
    public boolean cameraBlockedByScreenshare_;
    public int state_;

    static {
        CameraActions$UpdateCameraState cameraActions$UpdateCameraState = new CameraActions$UpdateCameraState();
        DEFAULT_INSTANCE = cameraActions$UpdateCameraState;
        KJb.A0A(cameraActions$UpdateCameraState, CameraActions$UpdateCameraState.class);
    }

    public static KEq newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CameraActions$UpdateCameraState parseFrom(ByteBuffer byteBuffer) {
        return (CameraActions$UpdateCameraState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004��\u0001\u0001\u0004\u0004������\u0001Ȉ\u0002ဌ��\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "arbitraryCallId_", "state_", "cameraBlockedByMitigation_", "cameraBlockedByScreenshare_"});
            case 3:
                return new CameraActions$UpdateCameraState();
            case 4:
                return new KEq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CameraActions$UpdateCameraState.class) {
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
