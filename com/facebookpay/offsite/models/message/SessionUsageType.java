package com.facebookpay.offsite.models.message;

import X.C00t;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: SessionUsageType.class */
public final class SessionUsageType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ SessionUsageType[] $VALUES;
    public static final SessionUsageType ON_SESSION = new SessionUsageType("ON_SESSION", 0);
    public static final SessionUsageType OFF_SESSION = new SessionUsageType("OFF_SESSION", 1);

    public static final /* synthetic */ SessionUsageType[] $values() {
        return new SessionUsageType[]{ON_SESSION, OFF_SESSION};
    }

    static {
        SessionUsageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C00t.A00($values);
    }

    public SessionUsageType(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SessionUsageType valueOf(String str) {
        return (SessionUsageType) Enum.valueOf(SessionUsageType.class, str);
    }

    public static SessionUsageType[] values() {
        return (SessionUsageType[]) $VALUES.clone();
    }
}
