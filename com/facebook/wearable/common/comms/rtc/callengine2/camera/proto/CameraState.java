package com.facebook.wearable.common.comms.rtc.callengine2.camera.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KEs;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: CameraState.class */
public final class CameraState extends KJb implements MJ3 {
    public static final int AVAILABLE_CAMERAS_FIELD_NUMBER = 7;
    public static final int CAMERA_STATES_FIELD_NUMBER = 1;
    public static final CameraState DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public MRR availableCameras_;
    public MRR cameraStates_;

    static {
        CameraState cameraState = new CameraState();
        DEFAULT_INSTANCE = cameraState;
        KJb.A0A(cameraState, CameraState.class);
    }

    public CameraState() {
        KE9 ke9 = KE9.A02;
        this.cameraStates_ = ke9;
        this.availableCameras_ = ke9;
    }

    public static KEs newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CameraState parseFrom(ByteBuffer byteBuffer) {
        return (CameraState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0007\u0002��\u0002��\u0001\u001b\u0007\u001b", new Object[]{"cameraStates_", CallCameraState.class, "availableCameras_", CameraHardware.class});
            case 3:
                return new CameraState();
            case 4:
                return new KEs();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CameraState.class) {
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
