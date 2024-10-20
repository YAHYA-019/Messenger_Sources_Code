package com.facebook.traffic.ttrc;

import X.0Pz;
import X.1BO;
import X.1BQ;
import X.2yD;
import X.C00i;
import X.C47q;
import com.facebook.traffic.monitor.api.ITrafficTransportMonitor;
import com.facebook.traffic.ttrc.MC;
import java.util.UUID;

/* loaded from: TrafficTtrcEventListener.class */
public class TrafficTtrcEventListener implements C47q {
    public final C00i mMobileConfig = new 1BQ(16385);
    public final C00i mConfigParser = new 1BQ(50183);
    public final C00i mTrafficTransportMonitor = new 1BQ(67590);

    public static final TrafficTtrcEventListener _UL__ULSEP_com_facebook_traffic_ttrc_TrafficTtrcEventListener_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new TrafficTtrcEventListener();
    }

    public String getMarkerUuid(int i, int i2) {
        UUID markerInstanceUuid = ((ITrafficTransportMonitor) this.mTrafficTransportMonitor.get()).getMarkerInstanceUuid(i, i2);
        return markerInstanceUuid == null ? "" : 0Pz.A0V("uid=", markerInstanceUuid);
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, double d) {
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, int i3) {
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, long j) {
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, String str2) {
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, boolean z) {
    }

    public void onMarkerAnnotate(int i, int i2, String str, double[] dArr) {
    }

    public void onMarkerAnnotate(int i, int i2, String str, int[] iArr) {
    }

    public void onMarkerAnnotate(int i, int i2, String str, long[] jArr) {
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, String[] strArr) {
    }

    public void onMarkerAnnotate(int i, int i2, String str, boolean[] zArr) {
    }

    public void onMarkerDropped(int i, int i2) {
    }

    @Override // X.C47q
    public void onMarkerEnd(int i, int i2, long j, long j2, short s) {
    }

    @Override // X.C47q
    public void onMarkerPoint(int i, int i2, String str, String str2, long j) {
    }

    @Override // X.C47q
    public void onMarkerStart(int i, int i2, long j) {
        ((ITrafficTransportMonitor) this.mTrafficTransportMonitor.get()).registerQplMarkerInstance(i, i2);
    }

    public boolean shouldAttachListener(int i) {
        if (!((2yD) this.mMobileConfig.get()).AZk(MC.android_traffic_qoe.enable_traffic_ttrc_event_listener)) {
            return false;
        }
        return ((TrafficTtrcMobileConfigParser) this.mConfigParser.get()).parseMarkerIds(((2yD) this.mMobileConfig.get()).BCy(MC.android_traffic_qoe.qpl_marker_ids_to_attach_traffic_ttrc_event_listener)).contains(Integer.valueOf(i));
    }
}
