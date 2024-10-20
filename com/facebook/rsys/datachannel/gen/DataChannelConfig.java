package com.facebook.rsys.datachannel.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: DataChannelConfig.class */
public class DataChannelConfig {
    public static 2JQ CONVERTER = IR0.A00(99);
    public static long sMcfTypeId;
    public final byte[] initialStateSyncData;
    public final boolean isE2ee;
    public final Long maxRetransmitTime;
    public final Long maxRetransmits;
    public final boolean ordered;
    public final int priority;
    public final boolean sendDataOnCallStart;
    public final int transportType;

    public DataChannelConfig(boolean z, Long l, Long l2, int i, byte[] bArr, boolean z2, boolean z3, int i2) {
        this.ordered = z;
        this.maxRetransmitTime = l;
        this.maxRetransmits = l2;
        this.transportType = i;
        this.initialStateSyncData = bArr;
        this.sendDataOnCallStart = z2;
        this.isE2ee = z3;
        this.priority = i2;
    }

    public static native DataChannelConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataChannelConfig)) {
                return false;
            }
            DataChannelConfig dataChannelConfig = (DataChannelConfig) obj;
            if (this.ordered != dataChannelConfig.ordered) {
                return false;
            }
            Long l = this.maxRetransmitTime;
            Long l2 = dataChannelConfig.maxRetransmitTime;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Long l3 = this.maxRetransmits;
            Long l4 = dataChannelConfig.maxRetransmits;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            if (this.transportType != dataChannelConfig.transportType) {
                return false;
            }
            byte[] bArr = this.initialStateSyncData;
            byte[] bArr2 = dataChannelConfig.initialStateSyncData;
            if (bArr == null) {
                if (bArr2 != null) {
                    return false;
                }
            } else if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            if (this.sendDataOnCallStart != dataChannelConfig.sendDataOnCallStart || this.isE2ee != dataChannelConfig.isE2ee || this.priority != dataChannelConfig.priority) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AbstractC2326GOr.A03(this.ordered ? 1 : 0) + AnonymousClass001.A02(this.maxRetransmitTime)) * 31) + AnonymousClass001.A02(this.maxRetransmits)) * 31) + this.transportType) * 31) + 4YU.A03(this.initialStateSyncData)) * 31) + (this.sendDataOnCallStart ? 1 : 0)) * 31) + (this.isE2ee ? 1 : 0)) * 31) + this.priority;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DataChannelConfig{ordered=");
        A0k.append(this.ordered);
        A0k.append(",maxRetransmitTime=");
        A0k.append(this.maxRetransmitTime);
        A0k.append(",maxRetransmits=");
        A0k.append(this.maxRetransmits);
        A0k.append(",transportType=");
        A0k.append(this.transportType);
        A0k.append(",initialStateSyncData=");
        A0k.append(this.initialStateSyncData);
        A0k.append(",sendDataOnCallStart=");
        A0k.append(this.sendDataOnCallStart);
        A0k.append(",isE2ee=");
        A0k.append(this.isE2ee);
        A0k.append(",priority=");
        return AbstractC2327GOs.A0W(A0k, this.priority);
    }
}
