package com.facebook.rtc.chatd;

import X.03Y;
import X.04R;
import X.0QD;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1KE;
import X.1Lm;
import X.2yD;
import X.4zI;
import X.4zJ;
import X.7zL;
import X.7zO;
import X.7zQ;
import X.7zT;
import X.AbE;
import X.AnonymousClass001;
import X.BRs;
import X.C01g;
import X.C01i;
import X.C06w;
import X.C06z;
import X.C0ty;
import X.C2F;
import X.C2I;
import X.C7v;
import X.DCs;
import X.H9O;
import X.HAo;
import X.HNw;
import X.IDU;
import X.Ixv;
import X.J13;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.rsys.chatdtransportsender.gen.ChatDPublishDataContainer;
import com.facebook.rsys.transport.gen.SendMessageStats;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rtc.chatd.utils.JavaCppHelper;
import com.facebook.rtc.chatd.utils.OneTraceLogging;
import com.facebook.wamsys.wcc.TransferStats;
import com.facebook.wamsys.wcc.XMPPStats;
import com.facebook.wamsys.wcp.MultiwayNotificationResult;
import com.facebook.wamsys.wcp.MultiwaySendResult;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ChatDHandlerPluginPostmailbox.class */
public final class ChatDHandlerPluginPostmailbox extends Postmailbox {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(ChatDHandlerPluginPostmailbox.class, "messageDeserializer", "getMessageDeserializer()Lcom/facebook/rtc/helpers/signalingserializationutils/WebrtcMWMessageDeserializer;", 0), new C06w(ChatDHandlerPluginPostmailbox.class, "executor", "getExecutor()Lcom/facebook/common/executors/SerialListeningExecutorService;", 0)};
    public final 1Br executor$delegate;
    public final JavaCppHelper javaCppHelper;
    public final 1Br messageDeserializer$delegate;
    public final H9O messageSource;
    public final OneTraceLogging oneTraceLogging;
    public final AccountSession pluginContext;
    public final MessengerSessionedMCPContext sessionedAppContext;
    public final C01i unexpectedEventReporter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.facebook.rtc.chatd.utils.JavaCppHelper] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.rtc.chatd.utils.OneTraceLogging, java.lang.Object] */
    public ChatDHandlerPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this(accountSession, messengerSessionedMCPContext, new Object(), new Object());
        1BL.A1F(accountSession, messengerSessionedMCPContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.rtc.chatd.utils.OneTraceLogging, java.lang.Object] */
    public ChatDHandlerPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext, JavaCppHelper javaCppHelper) {
        this(accountSession, messengerSessionedMCPContext, javaCppHelper, new Object());
        1BL.A1H(accountSession, messengerSessionedMCPContext, javaCppHelper);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatDHandlerPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext, JavaCppHelper javaCppHelper, OneTraceLogging oneTraceLogging) {
        super(accountSession, messengerSessionedMCPContext);
        7zT.A1W(accountSession, messengerSessionedMCPContext, javaCppHelper, oneTraceLogging);
        this.pluginContext = accountSession;
        this.sessionedAppContext = messengerSessionedMCPContext;
        this.javaCppHelper = javaCppHelper;
        this.oneTraceLogging = oneTraceLogging;
        this.messageDeserializer$delegate = 1Bu.A00(84853);
        this.unexpectedEventReporter = C01g.A01(DCs.A00);
        this.executor$delegate = 1Bu.A00(16479);
        this.messageSource = H9O.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ChatDHandlerPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext, JavaCppHelper javaCppHelper, OneTraceLogging oneTraceLogging, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountSession, messengerSessionedMCPContext, (i & 4) != 0 ? new Object() : javaCppHelper, (i & 8) != 0 ? new Object() : oneTraceLogging);
    }

    public static void A00(H9O h9o, Long l, byte[] bArr, long j) {
        11T.A0F(h9o, 1);
        1Br.A0C(HNw.A00);
        if (j < -99 || j > 500000) {
            j = -97;
        }
        HNw.A01.getValue();
        IDU idu = (IDU) 1Lm.A06(1BL.A0E(), 115766);
        if (h9o.ordinal() != 0) {
            throw 1BK.A1F();
        }
        idu.A04(HAo.A02, l, bArr, j);
    }

    private final 03Y convertUserData(Object obj) {
        List list;
        if (obj instanceof McfReference) {
            list = this.javaCppHelper.convertPackedParamsToArrayList((McfReference) obj);
            11T.A0D(list);
        } else if (obj instanceof ArrayList) {
            list = 0QD.A0V((Iterable) obj);
        } else {
            4zJ r0 = 4zI.A03;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Could not convert user data of type: ");
            Class<?> cls = obj.getClass();
            r0.A06("ChatDSignaling", AnonymousClass001.A0a(7zL.A18(cls), A0k), new Object[0]);
            C7v A00 = ((C2I) this.unexpectedEventReporter.getValue()).A00("chatd_m4a");
            A00.A01("error", "userData_parse_failure");
            A00.A01("class", String.valueOf(7zL.A18(cls)));
            A00.A01("oncall", AbE.A00(704));
            A00.A00();
            list = C0ty.A00;
        }
        return 1BK.A1G(list, 04R.A0A(7zO.A1b("User Data Size", String.valueOf(list.size()), 1BK.A1G("User Data Type", AnonymousClass001.A0Y(obj)))));
    }

    private final 1KE getExecutor() {
        return (1KE) 1Br.A0B(this.executor$delegate);
    }

    private final C2F getMessageDeserializer() {
        return (C2F) 1Br.A0B(this.messageDeserializer$delegate);
    }

    private final String getMessageTypeString(RtcMessageHeader rtcMessageHeader) {
        return rtcMessageHeader != null ? BRs.A00((Integer) rtcMessageHeader.A00(0)) : "empty";
    }

    private final RtcMessageHeader getRtcHeader(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return getMessageDeserializer().A00(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalHandleMessageResponse(MultiwaySendResult multiwaySendResult, Object obj) {
        Long l;
        Object obj2;
        XMPPStats xmppStats;
        byte[] data = multiwaySendResult.getData();
        MsysError error = multiwaySendResult.getError();
        TransferStats outgoingStats = multiwaySendResult.getOutgoingStats();
        long encryptedBytes = (outgoingStats == null || (xmppStats = outgoingStats.getXmppStats()) == null) ? 0L : xmppStats.getEncryptedBytes();
        if (obj != null) {
            03Y convertUserData = convertUserData(obj);
            List list = (List) convertUserData.first;
            Map map = (Map) convertUserData.second;
            if (1BK.A1Y(list)) {
                if (list.get(0) instanceof ChatDPublishDataContainer) {
                    Object obj3 = list.get(0);
                    11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.rsys.chatdtransportsender.gen.ChatDPublishDataContainer");
                    ChatDPublishDataContainer chatDPublishDataContainer = (ChatDPublishDataContainer) obj3;
                    SignalingTransportCallbackExt signalingTransportCallbackExt = chatDPublishDataContainer.extCallbacks;
                    if (signalingTransportCallbackExt != null) {
                        map.put("Has ExtCallbacks", ConstantsKt.CAMERA_ID_BACK);
                        if (2yD.A03(this.sessionedAppContext.getMobileConfig(), 36322873430591523L)) {
                            signalingTransportCallbackExt.sendCompleteCallbackExt(new SendMessageStats((short) 1, encryptedBytes, 0L, 0L, AnonymousClass001.A1U(error), error != null ? error.getCode() : 0, null, 21));
                        }
                    } else {
                        map.put("Has ExtCallbacks", ConstantsKt.CAMERA_ID_FRONT);
                    }
                    SignalingTransportCallback signalingTransportCallback = chatDPublishDataContainer.callbacks;
                    if (signalingTransportCallback != null) {
                        map.put("Has Callbacks", ConstantsKt.CAMERA_ID_BACK);
                        if (error == null) {
                            signalingTransportCallback.sendSuccessCallback();
                        } else {
                            signalingTransportCallback.sendFailureCallback();
                        }
                    } else {
                        map.put("Has Callbacks", ConstantsKt.CAMERA_ID_FRONT);
                    }
                }
                if (list.size() >= 3) {
                    Object obj4 = list.get(2);
                    Object obj5 = list.get(1);
                    if ((obj4 == null || (obj4 instanceof String)) && (obj5 instanceof AccountSession)) {
                        this.oneTraceLogging.logOnRSChatDHandlerCallback((String) obj4, (AccountSession) obj5, error, map);
                    }
                }
                if (list.size() >= 4 && ((obj2 = list.get(3)) == null || (obj2 instanceof Long))) {
                    l = (Long) obj2;
                    if (data != null || data.length == 0) {
                    }
                    A00(this.messageSource, l, data, -1);
                    return;
                }
            }
        }
        l = null;
        if (data != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalHandleNotification(AccountSession accountSession, MultiwayNotificationResult multiwayNotificationResult) {
        XMPPStats xmppStats;
        byte[] data = multiwayNotificationResult.getData();
        int i = 0;
        if (data == null || data.length == 0) {
            4zI.A03.A05("ChatDSignaling", "Received empty notification", new Object[0]);
            return;
        }
        this.oneTraceLogging.logOnRSChatDHandlerNotification(accountSession, multiwayNotificationResult, 04R.A0A(7zQ.A1b("Message Type", getMessageTypeString(getRtcHeader(data)))));
        TransferStats incomingStats = multiwayNotificationResult.getIncomingStats();
        if (incomingStats != null && (xmppStats = incomingStats.getXmppStats()) != null) {
            i = xmppStats.getEncryptedBytes();
        }
        A00(this.messageSource, null, data, i);
    }

    @Override // com.facebook.rtc.chatd.Postmailbox
    public boolean ChatDHandlerPluginPostMailboxImpl_MEMHandleInMultiwaySessionedNotification(MultiwayNotificationResult multiwayNotificationResult) {
        11T.A0F(multiwayNotificationResult, 0);
        if (2yD.A03(this.sessionedAppContext.getMobileConfig(), 2342165882644154402L)) {
            getExecutor().execute(new Ixv(this, multiwayNotificationResult));
            return true;
        }
        internalHandleNotification(this.pluginContext, multiwayNotificationResult);
        return true;
    }

    @Override // com.facebook.rtc.chatd.Postmailbox
    public void ChatDHandlerPluginPostMailboxImpl_MEMMultiwayMessageSessionedHandler(MultiwaySendResult multiwaySendResult, Object obj) {
        11T.A0F(multiwaySendResult, 0);
        if (2yD.A03(this.sessionedAppContext.getMobileConfig(), 2342165882644154402L)) {
            getExecutor().execute(new J13(this, multiwaySendResult, obj));
        } else {
            internalHandleMessageResponse(multiwaySendResult, obj);
        }
    }
}
