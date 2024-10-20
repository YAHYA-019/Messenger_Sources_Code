package com.facebook.rsys.transport.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.GOq;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: MetricIdentifiers.class */
public class MetricIdentifiers {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ON_ATTACH_FRAGMENT);
    public static long sMcfTypeId;
    public final Long flowId;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;

    public MetricIdentifiers(Long l, String str, String str2, String str3) {
        this.flowId = l;
        this.messageId = str;
        this.remoteSignalingId = str2;
        this.messageType = str3;
    }

    public static native MetricIdentifiers createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetricIdentifiers)) {
                return false;
            }
            MetricIdentifiers metricIdentifiers = (MetricIdentifiers) obj;
            Long l = this.flowId;
            Long l2 = metricIdentifiers.flowId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str = this.messageId;
            String str2 = metricIdentifiers.messageId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.remoteSignalingId;
            String str4 = metricIdentifiers.remoteSignalingId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.messageType;
            String str6 = metricIdentifiers.messageType;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A03(AnonymousClass001.A02(this.flowId)) + 1BL.A05(this.messageId)) * 31) + 1BL.A05(this.remoteSignalingId)) * 31) + 7zN.A05(this.messageType);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetricIdentifiers{flowId=");
        A0k.append(this.flowId);
        A0k.append(",messageId=");
        A0k.append(this.messageId);
        A0k.append(",remoteSignalingId=");
        A0k.append(this.remoteSignalingId);
        A0k.append(",messageType=");
        return GOq.A12(this.messageType, A0k);
    }
}
