package com.facebook.device.resourcemonitor;

/* loaded from: MonitoredProcess.class */
public enum MonitoredProcess {
    A01;

    public final String analyticCounterName = "data";
    public final boolean trackForegroundOnly = false;
    public final int uid;

    MonitoredProcess(int i) {
        this.uid = i;
    }

    public static MonitoredProcess fromString(String str) {
        MonitoredProcess monitoredProcess;
        MonitoredProcess[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                monitoredProcess = A01;
                break;
            }
            monitoredProcess = values[i2];
            if (monitoredProcess.name().equals(str)) {
                break;
            }
            i = i2 + 1;
        }
        return monitoredProcess;
    }
}
