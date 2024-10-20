package com.facebook.rsys.log.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: LogModel.class */
public class LogModel {
    public static 2JQ CONVERTER = LVi.A00(29);
    public static long sMcfTypeId;
    public final String callTrigger;
    public final boolean isConnectedEnd;
    public final Long peerId;
    public final String sharedCallId;
    public final Long startingBatteryLevel;
    public final boolean uploadConsoleLogAtEnd;
    public final boolean wasDeviceCharged;

    public LogModel(String str, Long l, String str2, Long l2, boolean z, boolean z2, boolean z3) {
        str2.getClass();
        this.sharedCallId = str;
        this.peerId = l;
        this.callTrigger = str2;
        this.startingBatteryLevel = l2;
        this.wasDeviceCharged = z;
        this.isConnectedEnd = z2;
        this.uploadConsoleLogAtEnd = z3;
    }

    public static native LogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LogModel)) {
                return false;
            }
            LogModel logModel = (LogModel) obj;
            String str = this.sharedCallId;
            String str2 = logModel.sharedCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            Long l = this.peerId;
            Long l2 = logModel.peerId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (!this.callTrigger.equals(logModel.callTrigger)) {
                return false;
            }
            Long l3 = this.startingBatteryLevel;
            Long l4 = logModel.startingBatteryLevel;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            if (this.wasDeviceCharged != logModel.wasDeviceCharged || this.isConnectedEnd != logModel.isConnectedEnd || this.uploadConsoleLogAtEnd != logModel.uploadConsoleLogAtEnd) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass002.A07(this.callTrigger, (AbstractC2326GOr.A03(1BL.A05(this.sharedCallId)) + AnonymousClass001.A02(this.peerId)) * 31) + 4YU.A03(this.startingBatteryLevel)) * 31) + (this.wasDeviceCharged ? 1 : 0)) * 31) + (this.isConnectedEnd ? 1 : 0)) * 31) + (this.uploadConsoleLogAtEnd ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LogModel{sharedCallId=");
        A0k.append(this.sharedCallId);
        A0k.append(",peerId=");
        A0k.append(this.peerId);
        A0k.append(",callTrigger=");
        A0k.append(this.callTrigger);
        A0k.append(",startingBatteryLevel=");
        A0k.append(this.startingBatteryLevel);
        A0k.append(",wasDeviceCharged=");
        A0k.append(this.wasDeviceCharged);
        A0k.append(",isConnectedEnd=");
        A0k.append(this.isConnectedEnd);
        A0k.append(",uploadConsoleLogAtEnd=");
        return AbstractC2327GOs.A0X(A0k, this.uploadConsoleLogAtEnd);
    }
}
