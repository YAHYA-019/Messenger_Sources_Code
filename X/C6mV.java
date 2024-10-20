package X;

import com.facebook.common.dextricks.DexStore;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.HashMap;

/* renamed from: X.6mV, reason: invalid class name */
/* loaded from: 6mV.class */
public enum C6mV implements 0Eq {
    TTL_OFF(0),
    TTL_ON_UNKNOWN(1),
    TTL_30SECONDS(30000),
    TTL_1MINUTE(60000),
    TTL_3MINUTES(180000),
    TTL_5MINUTES(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_BITRATE),
    TTL_10MINUTES(600000),
    TTL_15MINUTES(900000),
    TTL_30MINUTES(1800000),
    TTL_1HOUR(3600000),
    TTL_2HOURS(7200000),
    TTL_4HOURS(14400000),
    TTL_8HOURS(28800000),
    TTL_12HOURS(43200000),
    TTL_24HOURS(DexStore.DAYS_TO_MS_FACTOR),
    TTL_36HOURS(129600000),
    /* JADX INFO: Fake field, exist only in values array */
    TTL_72HOURS(259200000);

    public static final java.util.Map A00 = new HashMap();
    public final int value;

    static {
        for (C6mV c6mV : values()) {
            A00.put(Integer.valueOf(c6mV.value), c6mV);
        }
    }

    C6mV(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
