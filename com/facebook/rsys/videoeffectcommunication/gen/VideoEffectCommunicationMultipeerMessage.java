package com.facebook.rsys.videoeffectcommunication.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: VideoEffectCommunicationMultipeerMessage.class */
public class VideoEffectCommunicationMultipeerMessage {
    public static 2JQ CONVERTER = LVi.A00(65);
    public static long sMcfTypeId;
    public final byte[] binaryMessage;
    public final long effectId;
    public final String message;
    public final String senderId;
    public final String topic;

    public VideoEffectCommunicationMultipeerMessage(long j, String str, String str2, byte[] bArr, String str3) {
        str.getClass();
        str2.getClass();
        this.effectId = j;
        this.topic = str;
        this.message = str2;
        this.binaryMessage = bArr;
        this.senderId = str3;
    }

    public static native VideoEffectCommunicationMultipeerMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationMultipeerMessage)) {
                return false;
            }
            VideoEffectCommunicationMultipeerMessage videoEffectCommunicationMultipeerMessage = (VideoEffectCommunicationMultipeerMessage) obj;
            if (this.effectId != videoEffectCommunicationMultipeerMessage.effectId || !this.topic.equals(videoEffectCommunicationMultipeerMessage.topic) || !this.message.equals(videoEffectCommunicationMultipeerMessage.message)) {
                return false;
            }
            byte[] bArr = this.binaryMessage;
            byte[] bArr2 = videoEffectCommunicationMultipeerMessage.binaryMessage;
            if (bArr == null) {
                if (bArr2 != null) {
                    return false;
                }
            } else if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            String str = this.senderId;
            String str2 = videoEffectCommunicationMultipeerMessage.senderId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.message, AnonymousClass002.A07(this.topic, AbstractC2326GOr.A03(1BL.A01(this.effectId)))) + AnonymousClass001.A02(this.binaryMessage)) * 31) + 7zN.A05(this.senderId);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoEffectCommunicationMultipeerMessage{effectId=");
        A0k.append(this.effectId);
        A0k.append(",topic=");
        A0k.append(this.topic);
        A0k.append(",message=");
        A0k.append(this.message);
        A0k.append(",binaryMessage=");
        A0k.append(this.binaryMessage);
        A0k.append(",senderId=");
        return GOq.A12(this.senderId, A0k);
    }
}
