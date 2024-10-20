package com.facebook.wearable.common.comms.hera.host.applinks;

import X.11T;
import X.1BK;
import X.1BL;
import X.7zN;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.KtJ;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AppLinksDeviceConfig.class */
public final class AppLinksDeviceConfig extends C04v {
    public final String BtcAddress;
    public final String buildFlavor;
    public final String deviceImageAssetURI;
    public final String deviceModelName;
    public final String deviceName;
    public final String deviceSerial;
    public final DeviceType deviceType;
    public final String firmwareVersion;
    public final String hardwareType;
    public final String ipAddress;
    public final KtJ linkSecurity;
    public final String macAddress;
    public final UUID serviceUUID;

    public AppLinksDeviceConfig(UUID uuid, KtJ ktJ, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DeviceType deviceType) {
        1BL.A1H(uuid, ktJ, str);
        11T.A0F(str8, 10);
        11T.A0F(deviceType, 13);
        this.serviceUUID = uuid;
        this.linkSecurity = ktJ;
        this.BtcAddress = str;
        this.firmwareVersion = str2;
        this.deviceSerial = str3;
        this.ipAddress = str4;
        this.deviceImageAssetURI = str5;
        this.deviceModelName = str6;
        this.buildFlavor = str7;
        this.deviceName = str8;
        this.hardwareType = str9;
        this.macAddress = str10;
        this.deviceType = deviceType;
    }

    public /* synthetic */ AppLinksDeviceConfig(UUID uuid, KtJ ktJ, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DeviceType deviceType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, ktJ, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, str8, (i & 1024) != 0 ? null : str9, (i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 ? null : str10, deviceType);
    }

    public static /* synthetic */ AppLinksDeviceConfig copy$default(AppLinksDeviceConfig appLinksDeviceConfig, UUID uuid, KtJ ktJ, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DeviceType deviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = appLinksDeviceConfig.serviceUUID;
        }
        if ((i & 2) != 0) {
            ktJ = appLinksDeviceConfig.linkSecurity;
        }
        if ((i & 4) != 0) {
            str = appLinksDeviceConfig.BtcAddress;
        }
        if ((i & 8) != 0) {
            str2 = appLinksDeviceConfig.firmwareVersion;
        }
        if ((i & 16) != 0) {
            str3 = appLinksDeviceConfig.deviceSerial;
        }
        if ((i & 32) != 0) {
            str4 = appLinksDeviceConfig.ipAddress;
        }
        if ((i & 64) != 0) {
            str5 = appLinksDeviceConfig.deviceImageAssetURI;
        }
        if ((i & 128) != 0) {
            str6 = appLinksDeviceConfig.deviceModelName;
        }
        if ((i & 256) != 0) {
            str7 = appLinksDeviceConfig.buildFlavor;
        }
        if ((i & 512) != 0) {
            str8 = appLinksDeviceConfig.deviceName;
        }
        if ((i & 1024) != 0) {
            str9 = appLinksDeviceConfig.hardwareType;
        }
        if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            str10 = appLinksDeviceConfig.macAddress;
        }
        if ((i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
            deviceType = appLinksDeviceConfig.deviceType;
        }
        return appLinksDeviceConfig.copy(uuid, ktJ, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, deviceType);
    }

    public final UUID component1() {
        return this.serviceUUID;
    }

    public final String component10() {
        return this.deviceName;
    }

    public final String component11() {
        return this.hardwareType;
    }

    public final String component12() {
        return this.macAddress;
    }

    public final DeviceType component13() {
        return this.deviceType;
    }

    public final KtJ component2() {
        return this.linkSecurity;
    }

    public final String component3() {
        return this.BtcAddress;
    }

    public final String component4() {
        return this.firmwareVersion;
    }

    public final String component5() {
        return this.deviceSerial;
    }

    public final String component6() {
        return this.ipAddress;
    }

    public final String component7() {
        return this.deviceImageAssetURI;
    }

    public final String component8() {
        return this.deviceModelName;
    }

    public final String component9() {
        return this.buildFlavor;
    }

    public final AppLinksDeviceConfig copy(UUID uuid, KtJ ktJ, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DeviceType deviceType) {
        7zT.A1S(uuid, ktJ, str);
        11T.A0F(str8, 9);
        11T.A0F(deviceType, 12);
        return new AppLinksDeviceConfig(uuid, ktJ, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, deviceType);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AppLinksDeviceConfig)) {
                return false;
            }
            AppLinksDeviceConfig appLinksDeviceConfig = (AppLinksDeviceConfig) obj;
            if (!11T.A0O(this.serviceUUID, appLinksDeviceConfig.serviceUUID) || !11T.A0O(this.linkSecurity, appLinksDeviceConfig.linkSecurity) || !11T.A0O(this.BtcAddress, appLinksDeviceConfig.BtcAddress) || !11T.A0O(this.firmwareVersion, appLinksDeviceConfig.firmwareVersion) || !11T.A0O(this.deviceSerial, appLinksDeviceConfig.deviceSerial) || !11T.A0O(this.ipAddress, appLinksDeviceConfig.ipAddress) || !11T.A0O(this.deviceImageAssetURI, appLinksDeviceConfig.deviceImageAssetURI) || !11T.A0O(this.deviceModelName, appLinksDeviceConfig.deviceModelName) || !11T.A0O(this.buildFlavor, appLinksDeviceConfig.buildFlavor) || !11T.A0O(this.deviceName, appLinksDeviceConfig.deviceName) || !11T.A0O(this.hardwareType, appLinksDeviceConfig.hardwareType) || !11T.A0O(this.macAddress, appLinksDeviceConfig.macAddress) || this.deviceType != appLinksDeviceConfig.deviceType) {
                return false;
            }
        }
        return true;
    }

    public final String getBtcAddress() {
        return this.BtcAddress;
    }

    public final String getBuildFlavor() {
        return this.buildFlavor;
    }

    public final String getDeviceImageAssetURI() {
        return this.deviceImageAssetURI;
    }

    public final String getDeviceModelName() {
        return this.deviceModelName;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceSerial() {
        return this.deviceSerial;
    }

    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final String getHardwareType() {
        return this.hardwareType;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final KtJ getLinkSecurity() {
        return this.linkSecurity;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final UUID getServiceUUID() {
        return this.serviceUUID;
    }

    public int hashCode() {
        return 1BK.A03(this.deviceType, (((AnonymousClass002.A07(this.deviceName, (((((((((((AnonymousClass002.A07(this.BtcAddress, AnonymousClass002.A05(this.linkSecurity, 1BL.A03(this.serviceUUID))) + 1BL.A05(this.firmwareVersion)) * 31) + 1BL.A05(this.deviceSerial)) * 31) + 1BL.A05(this.ipAddress)) * 31) + 1BL.A05(this.deviceImageAssetURI)) * 31) + 1BL.A05(this.deviceModelName)) * 31) + 1BL.A05(this.buildFlavor)) * 31) + 1BL.A05(this.hardwareType)) * 31) + 7zN.A05(this.macAddress)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AppLinksDeviceConfig(serviceUUID=");
        A0k.append(this.serviceUUID);
        A0k.append(", linkSecurity=");
        A0k.append(this.linkSecurity);
        A0k.append(", BtcAddress=");
        A0k.append(this.BtcAddress);
        A0k.append(", firmwareVersion=");
        A0k.append(this.firmwareVersion);
        A0k.append(", deviceSerial=");
        A0k.append(this.deviceSerial);
        A0k.append(", ipAddress=");
        A0k.append(this.ipAddress);
        A0k.append(", deviceImageAssetURI=");
        A0k.append(this.deviceImageAssetURI);
        A0k.append(", deviceModelName=");
        A0k.append(this.deviceModelName);
        A0k.append(", buildFlavor=");
        A0k.append(this.buildFlavor);
        A0k.append(", deviceName=");
        A0k.append(this.deviceName);
        A0k.append(", hardwareType=");
        A0k.append(this.hardwareType);
        A0k.append(", macAddress=");
        A0k.append(this.macAddress);
        A0k.append(", deviceType=");
        return AnonymousClass002.A0K(this.deviceType, A0k);
    }
}
