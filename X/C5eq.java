package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.5eq, reason: invalid class name */
/* loaded from: 5eq.class */
public enum C5eq {
    QUICK_CAM("QUICK_CAM"),
    CAMERA_CORE("CAMERA_CORE"),
    OTHER("OTHER");

    public static final ImmutableMap A00;
    public final String DBSerialValue;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        for (C5eq c5eq : values()) {
            builder.put(c5eq.DBSerialValue, c5eq);
        }
        A00 = builder.build();
    }

    C5eq(String str) {
        this.DBSerialValue = str;
    }
}
