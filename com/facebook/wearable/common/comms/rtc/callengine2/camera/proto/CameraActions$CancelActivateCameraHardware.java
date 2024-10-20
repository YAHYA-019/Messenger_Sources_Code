package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KEj;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CameraActions$CancelActivateCameraHardware.class */
public final class CameraActions$CancelActivateCameraHardware extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 1;
    public static final CameraActions$CancelActivateCameraHardware DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public String arbitraryCallId_ = "";

    static {
        CameraActions$CancelActivateCameraHardware cameraActions$CancelActivateCameraHardware = new CameraActions$CancelActivateCameraHardware();
        DEFAULT_INSTANCE = cameraActions$CancelActivateCameraHardware;
        KJb.A0A(cameraActions$CancelActivateCameraHardware, CameraActions$CancelActivateCameraHardware.class);
    }

    public static KEj newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CameraActions$CancelActivateCameraHardware parseFrom(ByteBuffer byteBuffer) {
        return (CameraActions$CancelActivateCameraHardware) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001Ȉ", new Object[]{"arbitraryCallId_"});
            case 3:
                return new CameraActions$CancelActivateCameraHardware();
            case 4:
                return new KEj();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CameraActions$CancelActivateCameraHardware.class) {
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
