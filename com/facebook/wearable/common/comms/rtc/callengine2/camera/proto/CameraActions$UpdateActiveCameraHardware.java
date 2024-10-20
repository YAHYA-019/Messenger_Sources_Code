package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KEp;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CameraActions$UpdateActiveCameraHardware.class */
public final class CameraActions$UpdateActiveCameraHardware extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 1;
    public static final int CAMERA_ID_FIELD_NUMBER = 3;
    public static final CameraActions$UpdateActiveCameraHardware DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public int bitField0_;
    public String arbitraryCallId_ = "";
    public String deviceId_ = "";
    public String cameraId_ = "";

    static {
        CameraActions$UpdateActiveCameraHardware cameraActions$UpdateActiveCameraHardware = new CameraActions$UpdateActiveCameraHardware();
        DEFAULT_INSTANCE = cameraActions$UpdateActiveCameraHardware;
        KJb.A0A(cameraActions$UpdateActiveCameraHardware, CameraActions$UpdateActiveCameraHardware.class);
    }

    public static KEp newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CameraActions$UpdateActiveCameraHardware parseFrom(ByteBuffer byteBuffer) {
        return (CameraActions$UpdateActiveCameraHardware) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003��\u0001\u0001\u0003\u0003������\u0001Ȉ\u0002ለ��\u0003ለ\u0001", new Object[]{"bitField0_", "arbitraryCallId_", "deviceId_", "cameraId_"});
            case 3:
                return new CameraActions$UpdateActiveCameraHardware();
            case 4:
                return new KEp();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CameraActions$UpdateActiveCameraHardware.class) {
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
