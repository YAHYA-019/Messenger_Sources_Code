package com.facebook.wearable.common.comms.hera.host.intf;

import X.0DR;
import X.2aI;

/* loaded from: IHeraVideoBridge.class */
public interface IHeraVideoBridge {
    Object deinitPeerVideoProxy(0DR r1);

    Object getSharedEglContext();

    void initCameraProxy(Object obj, 2aI r2);

    Object maybeInitPeerVideoProxy(Object obj, 0DR r2);

    Object release(0DR r1);
}
