package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5h5, reason: invalid class name */
/* loaded from: 5h5.class */
public final class C5h5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5h5[] A01;
    public static final C5h5 A02;
    public static final C5h5 A03;
    public static final C5h5 A04;
    public static final C5h5 A05;
    public static final C5h5 A06;
    public static final C5h5 A07;
    public static final C5h5 A08;
    public static final C5h5 A09;
    public static final C5h5 A0A;
    public final String identifier;

    static {
        C5h5 c5h5 = new C5h5("DEVICE_IDLE_REQUIRED", 0, "DeviceIdleRequired");
        A02 = c5h5;
        C5h5 c5h52 = new C5h5("EXTERNAL_POWER_REQUIRED", 1, "ExternalPowerRequired");
        A03 = c5h52;
        C5h5 c5h53 = new C5h5("WIFI_REQUIRED", 2, "WiFiConnectivityRequired");
        A0A = c5h53;
        C5h5 c5h54 = new C5h5("MAX_EXECUTION_TIME_SEC", 3, "MaximumExecutionTime");
        A05 = c5h54;
        C5h5 c5h55 = new C5h5("MAX_EXECUTION_TIME_PER_DAY_SEC", 4, "MaximumExecutionTimePerDay");
        A04 = c5h55;
        C5h5 c5h56 = new C5h5("MAX_NETWORK_CONSUMPTION_PER_DAY_BYTES", 5, "MaximumNetworkConsumptionPerDay");
        A06 = c5h56;
        C5h5 c5h57 = new C5h5("MIN_BATTERY_LEVEL", 6, "MinimumBatteryLevel");
        A08 = c5h57;
        C5h5 c5h58 = new C5h5("MIN_AVAILABLE_MEMORY_BYTES", 7, "MinimumAvailableMemory");
        A07 = c5h58;
        C5h5 c5h59 = new C5h5("MIN_EVICTABLE_MEMORY_BYTES", 8, "MinimumEvictableMemory");
        A09 = c5h59;
        C5h5[] c5h5Arr = {c5h5, c5h52, c5h53, c5h54, c5h55, c5h56, c5h57, c5h58, c5h59, new C5h5("MIN_FREE_DISK_SPACE_BYTES", 9, "MinimumFreeDiskSpace")};
        A01 = c5h5Arr;
        A00 = C00t.A00(c5h5Arr);
    }

    public C5h5(String str, int i, String str2) {
        this.identifier = str2;
    }

    public static C5h5 valueOf(String str) {
        return (C5h5) Enum.valueOf(C5h5.class, str);
    }

    public static C5h5[] values() {
        return (C5h5[]) A01.clone();
    }
}
