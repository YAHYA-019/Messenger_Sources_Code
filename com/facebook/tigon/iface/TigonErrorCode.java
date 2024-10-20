package com.facebook.tigon.iface;

import X.1BK;
import X.AbL;
import X.C00t;
import X.DLD;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: TigonErrorCode.class */
public final class TigonErrorCode {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ TigonErrorCode[] $VALUES;
    public static final TigonErrorCode CANCEL;
    public static final DLD Companion;
    public static final TigonErrorCode FATAL_ERROR;
    public static final TigonErrorCode INVALID_REQUEST;
    public static final TigonErrorCode NONE;
    public static final Map NUMERIC_TO_ERROR_CODE;
    public static final TigonErrorCode REQUEST_NOT_SUPPORTED;
    public static final TigonErrorCode TRANSIENT_ERROR;
    public final int value;

    /* JADX WARN: Type inference failed for: r0v30, types: [X.DLD, java.lang.Object] */
    static {
        TigonErrorCode tigonErrorCode = new TigonErrorCode("NONE", 0, 0);
        NONE = tigonErrorCode;
        TigonErrorCode tigonErrorCode2 = new TigonErrorCode("CANCEL", 1, 1);
        CANCEL = tigonErrorCode2;
        TigonErrorCode tigonErrorCode3 = new TigonErrorCode("TRANSIENT_ERROR", 2, 2);
        TRANSIENT_ERROR = tigonErrorCode3;
        TigonErrorCode tigonErrorCode4 = new TigonErrorCode("FATAL_ERROR", 3, 3);
        FATAL_ERROR = tigonErrorCode4;
        TigonErrorCode tigonErrorCode5 = new TigonErrorCode("INVALID_REQUEST", 4, 4);
        INVALID_REQUEST = tigonErrorCode5;
        TigonErrorCode tigonErrorCode6 = new TigonErrorCode("REQUEST_NOT_SUPPORTED", 5, 5);
        REQUEST_NOT_SUPPORTED = tigonErrorCode6;
        TigonErrorCode[] tigonErrorCodeArr = {tigonErrorCode, tigonErrorCode2, tigonErrorCode3, tigonErrorCode4, tigonErrorCode5, tigonErrorCode6};
        $VALUES = tigonErrorCodeArr;
        $ENTRIES = C00t.A00(tigonErrorCodeArr);
        Companion = new Object();
        TigonErrorCode[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(values.length));
        for (TigonErrorCode tigonErrorCode7 : values) {
            linkedHashMap.put(Integer.valueOf(tigonErrorCode7.value), tigonErrorCode7);
        }
        NUMERIC_TO_ERROR_CODE = linkedHashMap;
    }

    public TigonErrorCode(String str, int i, int i2) {
        this.value = i2;
    }

    public static final TigonErrorCode fromValue(int i) {
        return Companion.fromValue(i);
    }

    public static TigonErrorCode valueOf(String str) {
        return (TigonErrorCode) Enum.valueOf(TigonErrorCode.class, str);
    }

    public static TigonErrorCode[] values() {
        return (TigonErrorCode[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (ordinal()) {
            case 0:
                return "None";
            case 1:
                return "Cancel";
            case 2:
                return "TransientError";
            case 3:
                return "FatalError";
            case 4:
                return "InvalidRequest";
            case 5:
                return "RequestNotSupported";
            default:
                throw 1BK.A1F();
        }
    }
}
