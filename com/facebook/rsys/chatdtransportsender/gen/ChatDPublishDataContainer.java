package com.facebook.rsys.chatdtransportsender.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import java.util.Arrays;
import java.util.Map;

/* loaded from: ChatDPublishDataContainer.class */
public class ChatDPublishDataContainer {
    public static 2JQ CONVERTER = IR0.A00(50);
    public static long sMcfTypeId;
    public final Map additionalAnnotations;
    public final SignalingTransportCallback callbacks;
    public final byte[] data;
    public final SignalingTransportCallbackExt extCallbacks;
    public final Long flowId;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;
    public final McfReference sender;
    public final String traceId;

    public ChatDPublishDataContainer(McfReference mcfReference, byte[] bArr, Long l, String str, String str2, String str3, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, String str4, Map map) {
        mcfReference.getClass();
        bArr.getClass();
        this.sender = mcfReference;
        this.data = bArr;
        this.flowId = l;
        this.traceId = str;
        this.messageId = str2;
        this.remoteSignalingId = str3;
        this.callbacks = signalingTransportCallback;
        this.extCallbacks = signalingTransportCallbackExt;
        this.messageType = str4;
        this.additionalAnnotations = map;
    }

    public static native ChatDPublishDataContainer createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatDPublishDataContainer)) {
                return false;
            }
            ChatDPublishDataContainer chatDPublishDataContainer = (ChatDPublishDataContainer) obj;
            if (!this.sender.equals(chatDPublishDataContainer.sender) || !Arrays.equals(this.data, chatDPublishDataContainer.data)) {
                return false;
            }
            Long l = this.flowId;
            Long l2 = chatDPublishDataContainer.flowId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str = this.traceId;
            String str2 = chatDPublishDataContainer.traceId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.messageId;
            String str4 = chatDPublishDataContainer.messageId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.remoteSignalingId;
            String str6 = chatDPublishDataContainer.remoteSignalingId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            SignalingTransportCallback signalingTransportCallback = this.callbacks;
            SignalingTransportCallback signalingTransportCallback2 = chatDPublishDataContainer.callbacks;
            if (signalingTransportCallback == null) {
                if (signalingTransportCallback2 != null) {
                    return false;
                }
            } else if (!signalingTransportCallback.equals(signalingTransportCallback2)) {
                return false;
            }
            SignalingTransportCallbackExt signalingTransportCallbackExt = this.extCallbacks;
            SignalingTransportCallbackExt signalingTransportCallbackExt2 = chatDPublishDataContainer.extCallbacks;
            if (signalingTransportCallbackExt == null) {
                if (signalingTransportCallbackExt2 != null) {
                    return false;
                }
            } else if (!signalingTransportCallbackExt.equals(signalingTransportCallbackExt2)) {
                return false;
            }
            String str7 = this.messageType;
            String str8 = chatDPublishDataContainer.messageType;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            Map map = this.additionalAnnotations;
            Map map2 = chatDPublishDataContainer.additionalAnnotations;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A08 = (((((((((((((((AbstractC2327GOs.A08(this.sender) + Arrays.hashCode(this.data)) * 31) + AnonymousClass001.A02(this.flowId)) * 31) + 1BL.A05(this.traceId)) * 31) + 1BL.A05(this.messageId)) * 31) + 1BL.A05(this.remoteSignalingId)) * 31) + AnonymousClass001.A02(this.callbacks)) * 31) + AnonymousClass001.A02(this.extCallbacks)) * 31) + 1BL.A05(this.messageType)) * 31;
        Map map = this.additionalAnnotations;
        if (map != null) {
            i = map.hashCode();
        }
        return A08 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ChatDPublishDataContainer{sender=");
        A0k.append(this.sender);
        A0k.append(",data=");
        A0k.append(this.data);
        A0k.append(",flowId=");
        A0k.append(this.flowId);
        A0k.append(",traceId=");
        A0k.append(this.traceId);
        A0k.append(",messageId=");
        A0k.append(this.messageId);
        A0k.append(",remoteSignalingId=");
        A0k.append(this.remoteSignalingId);
        A0k.append(",callbacks=");
        A0k.append(this.callbacks);
        A0k.append(",extCallbacks=");
        A0k.append(this.extCallbacks);
        A0k.append(",messageType=");
        A0k.append(this.messageType);
        A0k.append(",additionalAnnotations=");
        return AbstractC2327GOs.A0U(this.additionalAnnotations, A0k);
    }
}
