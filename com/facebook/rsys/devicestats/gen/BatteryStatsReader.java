package com.facebook.rsys.devicestats.gen;

/* loaded from: BatteryStatsReader.class */
public abstract class BatteryStatsReader {
    public abstract long getBatteryLevel();

    public abstract boolean isCharging();
}
