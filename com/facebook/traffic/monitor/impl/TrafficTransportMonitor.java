package com.facebook.traffic.monitor.impl;

import X.1BO;
import com.facebook.traffic.monitor.api.ITrafficTransportMonitor;
import java.util.UUID;

/* loaded from: TrafficTransportMonitor.class */
public class TrafficTransportMonitor implements ITrafficTransportMonitor {
    public final ITrafficTransportMonitor delegate = SimpleTrafficTransportMonitor.getInstance();

    public static final TrafficTransportMonitor _UL__ULSEP_com_facebook_traffic_monitor_impl_TrafficTransportMonitor_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new TrafficTransportMonitor();
    }

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public UUID getMarkerInstanceUuid(int i, int i2) {
        return this.delegate.getMarkerInstanceUuid(i, i2);
    }

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public UUID getOrGenerateQplMarker(int i, int i2) {
        return this.delegate.getOrGenerateQplMarker(i, i2);
    }

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public UUID registerQplMarkerInstance(int i, int i2) {
        return this.delegate.registerQplMarkerInstance(i, i2);
    }
}
