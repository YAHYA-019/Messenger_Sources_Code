package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KEl;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CameraActions$SetCameraOnDesired.class */
public final class CameraActions$SetCameraOnDesired extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 1;
    public static final int CAMERA_ON_DESIRED_FIELD_NUMBER = 2;
    public static final CameraActions$SetCameraOnDesired DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public String arbitraryCallId_ = "";
    public boolean cameraOnDesired_;

    static {
        CameraActions$SetCameraOnDesired cameraActions$SetCameraOnDesired = new CameraActions$SetCameraOnDesired();
        DEFAULT_INSTANCE = cameraActions$SetCameraOnDesired;
        KJb.A0A(cameraActions$SetCameraOnDesired, CameraActions$SetCameraOnDesired.class);
    }

    public static KEl newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CameraActions$SetCameraOnDesired parseFrom(ByteBuffer byteBuffer) {
        return (CameraActions$SetCameraOnDesired) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002\u0007", new Object[]{"arbitraryCallId_", "cameraOnDesired_"});
            case 3:
                return new CameraActions$SetCameraOnDesired();
            case 4:
                return new KEl();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CameraActions$SetCameraOnDesired.class) {
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
