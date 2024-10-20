package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KEi;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CameraActions$ActivateCameraHardware.class */
public final class CameraActions$ActivateCameraHardware extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 1;
    public static final int CAMERA_ID_FIELD_NUMBER = 3;
    public static final CameraActions$ActivateCameraHardware DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public int bitField0_;
    public String arbitraryCallId_ = "";
    public String deviceId_ = "";
    public String cameraId_ = "";

    static {
        CameraActions$ActivateCameraHardware cameraActions$ActivateCameraHardware = new CameraActions$ActivateCameraHardware();
        DEFAULT_INSTANCE = cameraActions$ActivateCameraHardware;
        KJb.A0A(cameraActions$ActivateCameraHardware, CameraActions$ActivateCameraHardware.class);
    }

    public static KEi newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CameraActions$ActivateCameraHardware parseFrom(ByteBuffer byteBuffer) {
        return (CameraActions$ActivateCameraHardware) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return new CameraActions$ActivateCameraHardware();
            case 4:
                return new KEi();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CameraActions$ActivateCameraHardware.class) {
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
