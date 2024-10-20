package X;

import com.facebook.traffic.monitor.api.ITrafficTransportMonitor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* renamed from: X.39b, reason: invalid class name */
/* loaded from: 39b.class */
public final class C39b extends 2Lg {
    public final 2Lg A00;
    public final C00i A01;

    public C39b() {
        1BQ A02 = 1BQ.A02(67590);
        this.A01 = A02;
        final ITrafficTransportMonitor iTrafficTransportMonitor = (ITrafficTransportMonitor) A02.get();
        this.A00 = new 2Lg(iTrafficTransportMonitor) { // from class: X.39e
            public final ITrafficTransportMonitor A00;

            {
                this.A00 = iTrafficTransportMonitor;
            }

            public /* bridge */ /* synthetic */ Object A02() {
                return new Object();
            }

            public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
                if (obj != null && obj2 != null) {
                    UUID markerInstanceUuid = this.A00.getMarkerInstanceUuid(r302.getMarkerId(), r302.A02);
                    if (markerInstanceUuid != null) {
                        r302.AxQ().A06("event_instance_uuid", markerInstanceUuid.toString());
                    }
                }
                return 1hM.A01;
            }

            public String B5Q() {
                return "traffic_transport_monitor_metadata";
            }

            public int B5R() {
                return 62;
            }

            public Class BBP() {
                return R3H.class;
            }

            public boolean BS6(2Lc r302) {
                return r302.A09;
            }
        };
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        this.A00.AMK(r302, obj, obj2);
        return 1hM.A01;
    }

    public String B5Q() {
        return this.A00.B5Q();
    }

    public int B5R() {
        return this.A00.B5R();
    }

    public Class BBP() {
        return this.A00.BBP();
    }

    public boolean BS6(2Lc r302) {
        return this.A00.BS6(r302);
    }
}
