package com.facebook.messenger.notification.engine;

import X.C00t;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: NotificationEngineValueType.class */
public final class NotificationEngineValueType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ NotificationEngineValueType[] $VALUES;
    public static final NotificationEngineValueType NOTIFICATION_ENGINE_VALUE_TYPE_ARRAY;
    public static final NotificationEngineValueType NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN;
    public static final NotificationEngineValueType NOTIFICATION_ENGINE_VALUE_TYPE_NONE;
    public static final NotificationEngineValueType NOTIFICATION_ENGINE_VALUE_TYPE_NUMBER;
    public static final NotificationEngineValueType NOTIFICATION_ENGINE_VALUE_TYPE_STRING;
    public final int value;

    static {
        NotificationEngineValueType notificationEngineValueType = new NotificationEngineValueType("NOTIFICATION_ENGINE_VALUE_TYPE_NONE", 0, 0);
        NOTIFICATION_ENGINE_VALUE_TYPE_NONE = notificationEngineValueType;
        NotificationEngineValueType notificationEngineValueType2 = new NotificationEngineValueType("NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN", 1, 1);
        NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN = notificationEngineValueType2;
        NotificationEngineValueType notificationEngineValueType3 = new NotificationEngineValueType("NOTIFICATION_ENGINE_VALUE_TYPE_NUMBER", 2, 2);
        NOTIFICATION_ENGINE_VALUE_TYPE_NUMBER = notificationEngineValueType3;
        NotificationEngineValueType notificationEngineValueType4 = new NotificationEngineValueType("NOTIFICATION_ENGINE_VALUE_TYPE_STRING", 3, 3);
        NOTIFICATION_ENGINE_VALUE_TYPE_STRING = notificationEngineValueType4;
        NotificationEngineValueType notificationEngineValueType5 = new NotificationEngineValueType("NOTIFICATION_ENGINE_VALUE_TYPE_ARRAY", 4, 4);
        NOTIFICATION_ENGINE_VALUE_TYPE_ARRAY = notificationEngineValueType5;
        NotificationEngineValueType[] notificationEngineValueTypeArr = {notificationEngineValueType, notificationEngineValueType2, notificationEngineValueType3, notificationEngineValueType4, notificationEngineValueType5};
        $VALUES = notificationEngineValueTypeArr;
        $ENTRIES = C00t.A00(notificationEngineValueTypeArr);
    }

    public NotificationEngineValueType(String str, int i, int i2) {
        this.value = i2;
    }

    public static NotificationEngineValueType valueOf(String str) {
        return (NotificationEngineValueType) Enum.valueOf(NotificationEngineValueType.class, str);
    }

    public static NotificationEngineValueType[] values() {
        return (NotificationEngineValueType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
