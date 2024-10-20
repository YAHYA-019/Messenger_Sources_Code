package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KEn;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CameraActions$ToggleCamera.class */
public final class CameraActions$ToggleCamera extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 1;
    public static final CameraActions$ToggleCamera DEFAULT_INSTANCE;
    public static final int FROM_DEVICE_ID_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public int bitField0_;
    public String arbitraryCallId_ = "";
    public String fromDeviceId_ = "";

    static {
        CameraActions$ToggleCamera cameraActions$ToggleCamera = new CameraActions$ToggleCamera();
        DEFAULT_INSTANCE = cameraActions$ToggleCamera;
        KJb.A0A(cameraActions$ToggleCamera, CameraActions$ToggleCamera.class);
    }

    public static KEn newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CameraActions$ToggleCamera parseFrom(ByteBuffer byteBuffer) {
        return (CameraActions$ToggleCamera) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002��\u0001\u0001\u0002\u0002������\u0001Ȉ\u0002ለ��", new Object[]{"bitField0_", "arbitraryCallId_", "fromDeviceId_"});
            case 3:
                return new CameraActions$ToggleCamera();
            case 4:
                return new KEn();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CameraActions$ToggleCamera.class) {
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
