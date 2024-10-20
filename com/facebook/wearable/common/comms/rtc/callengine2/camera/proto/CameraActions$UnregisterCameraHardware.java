package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KEo;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CameraActions$UnregisterCameraHardware.class */
public final class CameraActions$UnregisterCameraHardware extends KJb implements MJ3 {
    public static final int CAMERA_ID_FIELD_NUMBER = 2;
    public static final CameraActions$UnregisterCameraHardware DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public int bitField0_;
    public String deviceId_ = "";
    public String cameraId_ = "";

    static {
        CameraActions$UnregisterCameraHardware cameraActions$UnregisterCameraHardware = new CameraActions$UnregisterCameraHardware();
        DEFAULT_INSTANCE = cameraActions$UnregisterCameraHardware;
        KJb.A0A(cameraActions$UnregisterCameraHardware, CameraActions$UnregisterCameraHardware.class);
    }

    public static KEo newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CameraActions$UnregisterCameraHardware parseFrom(ByteBuffer byteBuffer) {
        return (CameraActions$UnregisterCameraHardware) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002��\u0001\u0001\u0002\u0002������\u0001Ȉ\u0002ለ��", new Object[]{"bitField0_", "deviceId_", "cameraId_"});
            case 3:
                return new CameraActions$UnregisterCameraHardware();
            case 4:
                return new KEo();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CameraActions$UnregisterCameraHardware.class) {
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
