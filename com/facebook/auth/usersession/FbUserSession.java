package com.facebook.auth.usersession;

import X.1Fy;
import X.1Fz;
import X.1G1;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: FbUserSession.class */
public interface FbUserSession extends 1Fy {
    public static final 1Fz A00 = 1Fz.A00;
    public static final FbUserSession A01 = new 1G1(ConstantsKt.CAMERA_ID_FRONT, ConstantsKt.CAMERA_ID_FRONT, ConstantsKt.CAMERA_ID_FRONT);

    String Aud();

    ViewerContext Aue();

    ViewerContext BHu();

    ViewerContext BKF();

    boolean BTy();
}
