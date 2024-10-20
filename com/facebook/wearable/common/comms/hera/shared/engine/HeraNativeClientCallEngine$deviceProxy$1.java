package com.facebook.wearable.common.comms.hera.shared.engine;

import X.KFu;
import X.KGw;
import X.KPe;
import X.Lge;
import com.meta.hera.engine.device.Device;
import com.meta.wearable.comms.calling.hera.engine.device.FeatureDeviceProxy;

/* loaded from: HeraNativeClientCallEngine$deviceProxy$1.class */
public final class HeraNativeClientCallEngine$deviceProxy$1 extends FeatureDeviceProxy {
    @Override // com.meta.wearable.comms.calling.hera.engine.device.FeatureDeviceProxy
    public Device getDevice() {
        KFu A02 = Lge.A02();
        KPe kPe = KPe.A01;
        ((Device) KGw.A00(A02)).role_ = kPe.getNumber();
        return (Device) A02.A05();
    }
}
