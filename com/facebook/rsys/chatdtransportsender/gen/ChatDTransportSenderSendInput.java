package com.facebook.rsys.chatdtransportsender.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import java.util.Arrays;
import java.util.Map;

/* loaded from: ChatDTransportSenderSendInput.class */
public class ChatDTransportSenderSendInput {
    public static 2JQ CONVERTER = IR0.A00(52);
    public static long sMcfTypeId;
    public final SignalingTransportCallback callbacks;
    public final SignalingTransportCallbackExt extCallbacks;
    public final Long flowId;
    public final Map loggingAnnotations;
    public final byte[] message;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;

    public ChatDTransportSenderSendInput(byte[] bArr, Long l, String str, String str2, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, String str3, Map map) {
        bArr.getClass();
        this.message = bArr;
        this.flowId = l;
        this.messageId = str;
        this.remoteSignalingId = str2;
        this.callbacks = signalingTransportCallback;
        this.extCallbacks = signalingTransportCallbackExt;
        this.messageType = str3;
        this.loggingAnnotations = map;
    }

    public static native ChatDTransportSenderSendInput createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatDTransportSenderSendInput)) {
                return false;
            }
            ChatDTransportSenderSendInput chatDTransportSenderSendInput = (ChatDTransportSenderSendInput) obj;
            if (!Arrays.equals(this.message, chatDTransportSenderSendInput.message)) {
                return false;
            }
            Long l = this.flowId;
            Long l2 = chatDTransportSenderSendInput.flowId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str = this.messageId;
            String str2 = chatDTransportSenderSendInput.messageId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.remoteSignalingId;
            String str4 = chatDTransportSenderSendInput.remoteSignalingId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            SignalingTransportCallback signalingTransportCallback = this.callbacks;
            SignalingTransportCallback signalingTransportCallback2 = chatDTransportSenderSendInput.callbacks;
            if (signalingTransportCallback == null) {
                if (signalingTransportCallback2 != null) {
                    return false;
                }
            } else if (!signalingTransportCallback.equals(signalingTransportCallback2)) {
                return false;
            }
            SignalingTransportCallbackExt signalingTransportCallbackExt = this.extCallbacks;
            SignalingTransportCallbackExt signalingTransportCallbackExt2 = chatDTransportSenderSendInput.extCallbacks;
            if (signalingTransportCallbackExt == null) {
                if (signalingTransportCallbackExt2 != null) {
                    return false;
                }
            } else if (!signalingTransportCallbackExt.equals(signalingTransportCallbackExt2)) {
                return false;
            }
            String str5 = this.messageType;
            String str6 = chatDTransportSenderSendInput.messageType;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            Map map = this.loggingAnnotations;
            Map map2 = chatDTransportSenderSendInput.loggingAnnotations;
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
        int A03 = (((((((((((AbstractC2326GOr.A03(Arrays.hashCode(this.message)) + AnonymousClass001.A02(this.flowId)) * 31) + 1BL.A05(this.messageId)) * 31) + 1BL.A05(this.remoteSignalingId)) * 31) + AnonymousClass001.A02(this.callbacks)) * 31) + AnonymousClass001.A02(this.extCallbacks)) * 31) + 1BL.A05(this.messageType)) * 31;
        Map map = this.loggingAnnotations;
        if (map != null) {
            i = map.hashCode();
        }
        return A03 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ChatDTransportSenderSendInput{message=");
        A0k.append(this.message);
        A0k.append(",flowId=");
        A0k.append(this.flowId);
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
        A0k.append(",loggingAnnotations=");
        return AbstractC2327GOs.A0U(this.loggingAnnotations, A0k);
    }
}
