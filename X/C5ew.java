package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.5ew, reason: invalid class name */
/* loaded from: 5ew.class */
public enum C5ew {
    DEFAULT("DEFAULT"),
    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE"),
    HD("HD");

    public static final ImmutableMap A00;
    public final String DBSerialValue;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        for (C5ew c5ew : values()) {
            builder.put(c5ew.DBSerialValue, c5ew);
        }
        A00 = builder.build();
    }

    C5ew(String str) {
        this.DBSerialValue = str;
    }
}
