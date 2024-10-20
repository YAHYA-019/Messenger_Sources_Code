package com.facebook.wearable.common.comms.hera.shared.snappmanager;

import X.02L;
import X.11T;
import X.AnonymousClass001;
import X.C00t;
import java.nio.ByteBuffer;
import kotlin.enums.EnumEntries;

/* loaded from: SnAppManagerProtos.class */
public final class SnAppManagerProtos {
    public static final int APPID_ARCI_CALLING = 29;
    public static final int APPID_ARCI_SDK = 32;
    public static final SnAppManagerProtos INSTANCE = new Object();
    public static final int SNAPP_START_RESPONSE_MSGTYPE = 2001;
    public static final int SNAPP_STOP_RESPONSE_MSGTYPE = 2003;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: SnAppManagerProtos$CompanionDeviceErrorCode.class */
    public final class CompanionDeviceErrorCode {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ CompanionDeviceErrorCode[] $VALUES;
        public static final CompanionDeviceErrorCode FailedToParse = new CompanionDeviceErrorCode("FailedToParse", 0);
        public static final CompanionDeviceErrorCode UnknownError = new CompanionDeviceErrorCode("UnknownError", 1);
        public static final CompanionDeviceErrorCode Success = new CompanionDeviceErrorCode("Success", 2);
        public static final CompanionDeviceErrorCode UnknownMessage = new CompanionDeviceErrorCode("UnknownMessage", 3);
        public static final CompanionDeviceErrorCode UnhandledMessage = new CompanionDeviceErrorCode("UnhandledMessage", 4);
        public static final CompanionDeviceErrorCode PayloadCorrupted = new CompanionDeviceErrorCode("PayloadCorrupted", 5);
        public static final CompanionDeviceErrorCode UnsupportedApp = new CompanionDeviceErrorCode("UnsupportedApp", 6);
        public static final CompanionDeviceErrorCode NotEnoughBattery = new CompanionDeviceErrorCode("NotEnoughBattery", 7);
        public static final CompanionDeviceErrorCode ThermalThrottling = new CompanionDeviceErrorCode("ThermalThrottling", 8);
        public static final CompanionDeviceErrorCode NotEnoughStorage = new CompanionDeviceErrorCode("NotEnoughStorage", 9);
        public static final CompanionDeviceErrorCode StartAppFailed = new CompanionDeviceErrorCode("StartAppFailed", 10);
        public static final CompanionDeviceErrorCode StopAppFailed = new CompanionDeviceErrorCode("StopAppFailed", 11);
        public static final CompanionDeviceErrorCode AppNotRunning = new CompanionDeviceErrorCode("AppNotRunning", 12);
        public static final CompanionDeviceErrorCode AppAlreadyStarted = new CompanionDeviceErrorCode("AppAlreadyStarted", 13);
        public static final CompanionDeviceErrorCode NotEnoughPriority = new CompanionDeviceErrorCode("NotEnoughPriority", 14);
        public static final CompanionDeviceErrorCode ChargingNotConnected = new CompanionDeviceErrorCode("ChargingNotConnected", 15);
        public static final CompanionDeviceErrorCode DeniedByPeakPower = new CompanionDeviceErrorCode("DeniedByPeakPower", 16);

        public static final /* synthetic */ CompanionDeviceErrorCode[] $values() {
            return new CompanionDeviceErrorCode[]{FailedToParse, UnknownError, Success, UnknownMessage, UnhandledMessage, PayloadCorrupted, UnsupportedApp, NotEnoughBattery, ThermalThrottling, NotEnoughStorage, StartAppFailed, StopAppFailed, AppNotRunning, AppAlreadyStarted, NotEnoughPriority, ChargingNotConnected, DeniedByPeakPower};
        }

        static {
            CompanionDeviceErrorCode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C00t.A00($values);
        }

        public CompanionDeviceErrorCode(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static CompanionDeviceErrorCode valueOf(String str) {
            return (CompanionDeviceErrorCode) Enum.valueOf(CompanionDeviceErrorCode.class, str);
        }

        public static CompanionDeviceErrorCode[] values() {
            return (CompanionDeviceErrorCode[]) $VALUES.clone();
        }
    }

    private final native ByteBuffer nativeCreateAppControlRequest(boolean z, int i);

    private final native int nativeParseAppStartResponse(ByteBuffer byteBuffer, int i, int i2);

    private final native int nativeParseAppStopResponse(ByteBuffer byteBuffer, int i, int i2);

    public final ByteBuffer createAppControlRequest(boolean z, int i) {
        ByteBuffer nativeCreateAppControlRequest = nativeCreateAppControlRequest(z, i);
        nativeCreateAppControlRequest.position(0);
        nativeCreateAppControlRequest.limit(nativeCreateAppControlRequest.capacity());
        return nativeCreateAppControlRequest;
    }

    public final native int getAppControlRequestMessageType(boolean z);

    public final CompanionDeviceErrorCode parseAppStartResponse(ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 0);
        if (!byteBuffer.isDirect()) {
            throw AnonymousClass001.A0L("Buffer must be direct!");
        }
        CompanionDeviceErrorCode companionDeviceErrorCode = (CompanionDeviceErrorCode) 02L.A02(CompanionDeviceErrorCode.values(), nativeParseAppStartResponse(byteBuffer, byteBuffer.position(), byteBuffer.remaining()) + 1);
        if (companionDeviceErrorCode == null) {
            companionDeviceErrorCode = CompanionDeviceErrorCode.UnknownError;
        }
        return companionDeviceErrorCode;
    }

    public final CompanionDeviceErrorCode parseAppStopResponse(ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 0);
        if (!byteBuffer.isDirect()) {
            throw AnonymousClass001.A0L("Buffer must be direct!");
        }
        CompanionDeviceErrorCode companionDeviceErrorCode = (CompanionDeviceErrorCode) 02L.A02(CompanionDeviceErrorCode.values(), nativeParseAppStopResponse(byteBuffer, byteBuffer.position(), byteBuffer.remaining()) + 1);
        if (companionDeviceErrorCode == null) {
            companionDeviceErrorCode = CompanionDeviceErrorCode.UnknownError;
        }
        return companionDeviceErrorCode;
    }
}
