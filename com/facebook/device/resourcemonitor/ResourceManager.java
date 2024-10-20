package com.facebook.device.resourcemonitor;

import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1Od;
import X.1Pi;
import X.1pU;
import X.C00i;
import X.C01s;
import X.C07974lf;
import X.C07984li;
import com.facebook.device.DeviceConditionHelper;
import com.facebook.device.resourcemonitor.ResourceManager;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: ResourceManager.class */
public final class ResourceManager {
    public DataUsageBytes A00;
    public C07984li A01;
    public boolean A02;
    public final C07974lf A03;
    public final C00i A04 = new 1BQ(16616);
    public final C00i A05;
    public final Runtime A06;
    public final ConcurrentMap A07;
    public final C01s A08;
    public final 1Pi A09;
    public final DeviceConditionHelper A0A;
    public final ResourceMonitor A0B;

    /* JADX WARN: Type inference failed for: r0v40, types: [X.4li, java.lang.Object] */
    public ResourceManager() {
        ResourceMonitor resourceMonitor = (ResourceMonitor) 1Bi.A03(49227);
        1BQ r0 = new 1BQ(99931);
        Runtime runtime = (Runtime) 1Bn.A0A(100183);
        DeviceConditionHelper deviceConditionHelper = (DeviceConditionHelper) 1Bi.A03(17096);
        C01s c01s = (C01s) 1Bi.A03(16511);
        C07974lf c07974lf = (C07974lf) 1Bi.A03(49228);
        this.A0B = resourceMonitor;
        this.A05 = r0;
        this.A06 = runtime;
        this.A0A = deviceConditionHelper;
        this.A03 = c07974lf;
        1pU r02 = new 1pU();
        r02.A02(MapMakerInternalMap.Strength.A01);
        this.A07 = r02.A00();
        this.A00 = this.A03.A02(MonitoredProcess.A01.uid);
        ?? obj = new Object();
        obj.A02 = 0L;
        obj.A03 = 0L;
        obj.A00 = 0L;
        obj.A01 = 0L;
        this.A01 = obj;
        this.A08 = c01s;
        1Pi r03 = new 1Pi() { // from class: X.4lj
            public void CV8(DeviceConditionHelper deviceConditionHelper2) {
                ResourceManager.this.A00();
            }
        };
        this.A09 = r03;
        deviceConditionHelper.A02.put(r03, true);
    }

    public void A00() {
        DataUsageBytes dataUsageBytes;
        synchronized (this) {
            MonitoredProcess monitoredProcess = MonitoredProcess.A01;
            DataUsageBytes A02 = this.A03.A02(monitoredProcess.uid);
            if (((1Od) this.A04.get()).A0E() && monitoredProcess.trackForegroundOnly) {
                new DataUsageBytes(0L, 0L);
            } else {
                DataUsageBytes dataUsageBytes2 = this.A00;
                new DataUsageBytes(A02.A00 - dataUsageBytes2.A00, A02.A01 - dataUsageBytes2.A01);
            }
            this.A00 = A02;
            if (this.A02) {
                C07984li c07984li = this.A01;
                c07984li.A02 += dataUsageBytes.A00;
                c07984li.A03 += dataUsageBytes.A01;
            } else {
                C07984li c07984li2 = this.A01;
                c07984li2.A00 += dataUsageBytes.A00;
                c07984li2.A01 += dataUsageBytes.A01;
            }
            this.A02 = this.A0A.A03(false);
        }
    }
}
