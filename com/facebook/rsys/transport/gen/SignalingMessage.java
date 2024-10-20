package com.facebook.rsys.transport.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: SignalingMessage.class */
public class SignalingMessage {
    public static 2JQ CONVERTER = IR0.A00(ActionId.DISPLAYED_ON_SCREEN);
    public static long sMcfTypeId;
    public final boolean disableInlineProcessing;
    public final McfReference extraContext;
    public final SignalingMessageIncomingStats incomingStats;
    public final MetricIdentifiers metricIdentifiers;
    public final byte[] payload;
    public final int transportChannel;

    public SignalingMessage(int i, MetricIdentifiers metricIdentifiers, byte[] bArr, McfReference mcfReference, SignalingMessageIncomingStats signalingMessageIncomingStats, boolean z) {
        metricIdentifiers.getClass();
        bArr.getClass();
        this.transportChannel = i;
        this.metricIdentifiers = metricIdentifiers;
        this.payload = bArr;
        this.extraContext = mcfReference;
        this.incomingStats = signalingMessageIncomingStats;
        this.disableInlineProcessing = z;
    }

    public static native SignalingMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SignalingMessage)) {
                return false;
            }
            SignalingMessage signalingMessage = (SignalingMessage) obj;
            if (this.transportChannel != signalingMessage.transportChannel || !this.metricIdentifiers.equals(signalingMessage.metricIdentifiers) || !Arrays.equals(this.payload, signalingMessage.payload)) {
                return false;
            }
            McfReference mcfReference = this.extraContext;
            McfReference mcfReference2 = signalingMessage.extraContext;
            if (mcfReference == null) {
                if (mcfReference2 != null) {
                    return false;
                }
            } else if (!mcfReference.equals(mcfReference2)) {
                return false;
            }
            SignalingMessageIncomingStats signalingMessageIncomingStats = this.incomingStats;
            SignalingMessageIncomingStats signalingMessageIncomingStats2 = signalingMessage.incomingStats;
            if (signalingMessageIncomingStats == null) {
                if (signalingMessageIncomingStats2 != null) {
                    return false;
                }
            } else if (!signalingMessageIncomingStats.equals(signalingMessageIncomingStats2)) {
                return false;
            }
            if (this.disableInlineProcessing != signalingMessage.disableInlineProcessing) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass002.A05(this.metricIdentifiers, AbstractC2326GOr.A03(this.transportChannel)) + Arrays.hashCode(this.payload)) * 31) + AnonymousClass001.A02(this.extraContext)) * 31) + 4YU.A03(this.incomingStats)) * 31) + (this.disableInlineProcessing ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SignalingMessage{transportChannel=");
        A0k.append(this.transportChannel);
        A0k.append(",metricIdentifiers=");
        A0k.append(this.metricIdentifiers);
        A0k.append(",payload=");
        A0k.append(this.payload);
        A0k.append(",extraContext=");
        A0k.append(this.extraContext);
        A0k.append(",incomingStats=");
        A0k.append(this.incomingStats);
        A0k.append(",disableInlineProcessing=");
        return AbstractC2327GOs.A0X(A0k, this.disableInlineProcessing);
    }
}
