package com.facebook.rsys.callmanager.callclient.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.ArrayList;

/* loaded from: StartCallCopyIdParams.class */
public class StartCallCopyIdParams {
    public static 2JQ CONVERTER = IR0.A00(36);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final CallContext callContext;
    public final OverlayConfigLayerInterface callLevelOverlayConfigLayer;
    public final ArrayList initialDataMessages;
    public final ArrayList initialPeerIds;
    public final int joinMode;
    public final String localCallId;
    public final PregenerateSdp pregeneratedSdpManager;
    public final SetupCallback setupCallback;
    public final boolean startWithVideo;
    public final String trigger;
    public final ArrayList userIDsToRing;

    /* loaded from: StartCallCopyIdParams$Builder.class */
    public class Builder {
        public boolean acceptRemoteVideoEnabled;
        public CallContext callContext;
        public OverlayConfigLayerInterface callLevelOverlayConfigLayer;
        public ArrayList initialDataMessages;
        public ArrayList initialPeerIds;
        public int joinMode;
        public String localCallId;
        public PregenerateSdp pregeneratedSdpManager;
        public SetupCallback setupCallback;
        public boolean startWithVideo;
        public String trigger;
        public ArrayList userIDsToRing;

        public StartCallCopyIdParams build() {
            return new StartCallCopyIdParams(this);
        }
    }

    public StartCallCopyIdParams(PregenerateSdp pregenerateSdp, CallContext callContext, SetupCallback setupCallback, OverlayConfigLayerInterface overlayConfigLayerInterface, String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        callContext.getClass();
        arrayList2.getClass();
        this.localCallId = str;
        this.callContext = callContext;
        this.userIDsToRing = arrayList2;
        this.startWithVideo = z2;
        this.acceptRemoteVideoEnabled = z;
        this.trigger = str2;
        this.setupCallback = setupCallback;
        this.initialDataMessages = arrayList;
        this.initialPeerIds = null;
        this.joinMode = 0;
        this.callLevelOverlayConfigLayer = overlayConfigLayerInterface;
        this.pregeneratedSdpManager = pregenerateSdp;
    }

    public StartCallCopyIdParams(Builder builder) {
        builder.callContext.getClass();
        builder.userIDsToRing.getClass();
        builder.trigger.getClass();
        this.localCallId = builder.localCallId;
        this.callContext = builder.callContext;
        this.userIDsToRing = builder.userIDsToRing;
        this.startWithVideo = builder.startWithVideo;
        this.acceptRemoteVideoEnabled = builder.acceptRemoteVideoEnabled;
        this.trigger = builder.trigger;
        this.setupCallback = builder.setupCallback;
        this.initialDataMessages = builder.initialDataMessages;
        this.initialPeerIds = builder.initialPeerIds;
        this.joinMode = builder.joinMode;
        this.callLevelOverlayConfigLayer = builder.callLevelOverlayConfigLayer;
        this.pregeneratedSdpManager = builder.pregeneratedSdpManager;
    }

    public static native StartCallCopyIdParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StartCallCopyIdParams)) {
                return false;
            }
            StartCallCopyIdParams startCallCopyIdParams = (StartCallCopyIdParams) obj;
            String str = this.localCallId;
            String str2 = startCallCopyIdParams.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.callContext.equals(startCallCopyIdParams.callContext) || !this.userIDsToRing.equals(startCallCopyIdParams.userIDsToRing) || this.startWithVideo != startCallCopyIdParams.startWithVideo || this.acceptRemoteVideoEnabled != startCallCopyIdParams.acceptRemoteVideoEnabled || !this.trigger.equals(startCallCopyIdParams.trigger)) {
                return false;
            }
            SetupCallback setupCallback = this.setupCallback;
            SetupCallback setupCallback2 = startCallCopyIdParams.setupCallback;
            if (setupCallback == null) {
                if (setupCallback2 != null) {
                    return false;
                }
            } else if (!setupCallback.equals(setupCallback2)) {
                return false;
            }
            ArrayList arrayList = this.initialDataMessages;
            ArrayList arrayList2 = startCallCopyIdParams.initialDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            ArrayList arrayList3 = this.initialPeerIds;
            ArrayList arrayList4 = startCallCopyIdParams.initialPeerIds;
            if (arrayList3 == null) {
                if (arrayList4 != null) {
                    return false;
                }
            } else if (!arrayList3.equals(arrayList4)) {
                return false;
            }
            if (this.joinMode != startCallCopyIdParams.joinMode) {
                return false;
            }
            OverlayConfigLayerInterface overlayConfigLayerInterface = this.callLevelOverlayConfigLayer;
            OverlayConfigLayerInterface overlayConfigLayerInterface2 = startCallCopyIdParams.callLevelOverlayConfigLayer;
            if (overlayConfigLayerInterface == null) {
                if (overlayConfigLayerInterface2 != null) {
                    return false;
                }
            } else if (!overlayConfigLayerInterface.equals(overlayConfigLayerInterface2)) {
                return false;
            }
            PregenerateSdp pregenerateSdp = this.pregeneratedSdpManager;
            PregenerateSdp pregenerateSdp2 = startCallCopyIdParams.pregeneratedSdpManager;
            if (pregenerateSdp == null) {
                if (pregenerateSdp2 != null) {
                    return false;
                }
            } else if (!pregenerateSdp.equals(pregenerateSdp2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass002.A07(this.trigger, (((AnonymousClass002.A05(this.userIDsToRing, AnonymousClass002.A05(this.callContext, AbstractC2326GOr.A03(1BL.A05(this.localCallId)))) + (this.startWithVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + AnonymousClass001.A02(this.setupCallback)) * 31) + AnonymousClass001.A02(this.initialDataMessages)) * 31) + AnonymousClass001.A02(this.initialPeerIds)) * 31) + this.joinMode) * 31) + AnonymousClass001.A02(this.callLevelOverlayConfigLayer)) * 31) + 4YU.A03(this.pregeneratedSdpManager);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("StartCallCopyIdParams{localCallId=");
        A0k.append(this.localCallId);
        A0k.append(",callContext=");
        A0k.append(this.callContext);
        A0k.append(",userIDsToRing=");
        A0k.append(this.userIDsToRing);
        A0k.append(",startWithVideo=");
        A0k.append(this.startWithVideo);
        A0k.append(",acceptRemoteVideoEnabled=");
        A0k.append(this.acceptRemoteVideoEnabled);
        A0k.append(",trigger=");
        A0k.append(this.trigger);
        A0k.append(",setupCallback=");
        A0k.append(this.setupCallback);
        A0k.append(",initialDataMessages=");
        A0k.append(this.initialDataMessages);
        A0k.append(",initialPeerIds=");
        A0k.append(this.initialPeerIds);
        A0k.append(",joinMode=");
        A0k.append(this.joinMode);
        A0k.append(",callLevelOverlayConfigLayer=");
        A0k.append(this.callLevelOverlayConfigLayer);
        A0k.append(",pregeneratedSdpManager=");
        return AbstractC2327GOs.A0U(this.pregeneratedSdpManager, A0k);
    }
}
