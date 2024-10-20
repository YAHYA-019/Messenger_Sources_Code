package com.facebook.wearable.common.comms.hera.host.applinks;

import X.C00t;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: DeviceType.class */
public final class DeviceType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ DeviceType[] $VALUES;
    public final String deviceName;
    public final boolean peerVideoSupported;
    public final boolean requireSnam;
    public static final DeviceType GREATWHITE = new DeviceType("GREATWHITE", 0, "greatwhite", true, false);
    public static final DeviceType HAMMERHEAD = new DeviceType("HAMMERHEAD", 1, "hammerhead", false, true);
    public static final DeviceType MAKO = new DeviceType("MAKO", 2, "mako", false, true);
    public static final DeviceType SILVERTIP = new DeviceType("SILVERTIP", 3, "silvertip", false, true);
    public static final DeviceType ZEBRA = new DeviceType("ZEBRA", 4, "zebra", false, true);
    public static final DeviceType COLADA = new DeviceType("COLADA", 5, "colada", true, false);

    public static final /* synthetic */ DeviceType[] $values() {
        return new DeviceType[]{GREATWHITE, HAMMERHEAD, MAKO, SILVERTIP, ZEBRA, COLADA};
    }

    static {
        DeviceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C00t.A00($values);
    }

    public DeviceType(String str, int i, String str2, boolean z, boolean z2) {
        this.deviceName = str2;
        this.peerVideoSupported = z;
        this.requireSnam = z2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final boolean getPeerVideoSupported() {
        return this.peerVideoSupported;
    }

    public final boolean getRequireSnam() {
        return this.requireSnam;
    }
}
