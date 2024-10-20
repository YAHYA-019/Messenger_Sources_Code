package com.facebook.rsys.outgoingcallconfig.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.7zP;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.ArrayList;

/* loaded from: OutgoingCallConfig.class */
public class OutgoingCallConfig {
    public static 2JQ CONVERTER = IR0.A00(ActionId.END_START_ACTIVITY);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final String appId;
    public final CallContext callContext;
    public final OverlayConfigLayerInterface callLevelOverlayConfigLayer;
    public final boolean forReconnect;
    public final ArrayList initialDataMessages;
    public final boolean isE2eeModeMandated;
    public final int joinMode;
    public final String localCallId;
    public final PregenerateSdp pregeneratedSdpManager;
    public final boolean startWithVideo;
    public final String trigger;
    public final ArrayList userIDsToRing;

    public OutgoingCallConfig(String str, String str2, CallContext callContext, ArrayList arrayList, boolean z, boolean z2, String str3, ArrayList arrayList2, boolean z3, boolean z4, int i, OverlayConfigLayerInterface overlayConfigLayerInterface, PregenerateSdp pregenerateSdp) {
        7zP.A1S(str2, callContext, arrayList);
        str3.getClass();
        this.localCallId = str;
        this.appId = str2;
        this.callContext = callContext;
        this.userIDsToRing = arrayList;
        this.startWithVideo = z;
        this.acceptRemoteVideoEnabled = z2;
        this.trigger = str3;
        this.initialDataMessages = arrayList2;
        this.isE2eeModeMandated = z3;
        this.forReconnect = z4;
        this.joinMode = i;
        this.callLevelOverlayConfigLayer = overlayConfigLayerInterface;
        this.pregeneratedSdpManager = pregenerateSdp;
    }

    public static native OutgoingCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OutgoingCallConfig)) {
                return false;
            }
            OutgoingCallConfig outgoingCallConfig = (OutgoingCallConfig) obj;
            String str = this.localCallId;
            String str2 = outgoingCallConfig.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.appId.equals(outgoingCallConfig.appId) || !this.callContext.equals(outgoingCallConfig.callContext) || !this.userIDsToRing.equals(outgoingCallConfig.userIDsToRing) || this.startWithVideo != outgoingCallConfig.startWithVideo || this.acceptRemoteVideoEnabled != outgoingCallConfig.acceptRemoteVideoEnabled || !this.trigger.equals(outgoingCallConfig.trigger)) {
                return false;
            }
            ArrayList arrayList = this.initialDataMessages;
            ArrayList arrayList2 = outgoingCallConfig.initialDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.isE2eeModeMandated != outgoingCallConfig.isE2eeModeMandated || this.forReconnect != outgoingCallConfig.forReconnect || this.joinMode != outgoingCallConfig.joinMode) {
                return false;
            }
            OverlayConfigLayerInterface overlayConfigLayerInterface = this.callLevelOverlayConfigLayer;
            OverlayConfigLayerInterface overlayConfigLayerInterface2 = outgoingCallConfig.callLevelOverlayConfigLayer;
            if (overlayConfigLayerInterface == null) {
                if (overlayConfigLayerInterface2 != null) {
                    return false;
                }
            } else if (!overlayConfigLayerInterface.equals(overlayConfigLayerInterface2)) {
                return false;
            }
            PregenerateSdp pregenerateSdp = this.pregeneratedSdpManager;
            PregenerateSdp pregenerateSdp2 = outgoingCallConfig.pregeneratedSdpManager;
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
        return ((((((((((AnonymousClass002.A07(this.trigger, (((AnonymousClass002.A05(this.userIDsToRing, AnonymousClass002.A05(this.callContext, AnonymousClass002.A07(this.appId, AbstractC2326GOr.A03(1BL.A05(this.localCallId))))) + (this.startWithVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + AnonymousClass001.A02(this.initialDataMessages)) * 31) + (this.isE2eeModeMandated ? 1 : 0)) * 31) + (this.forReconnect ? 1 : 0)) * 31) + this.joinMode) * 31) + AnonymousClass001.A02(this.callLevelOverlayConfigLayer)) * 31) + 4YU.A03(this.pregeneratedSdpManager);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OutgoingCallConfig{localCallId=");
        A0k.append(this.localCallId);
        A0k.append(",appId=");
        A0k.append(this.appId);
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
        A0k.append(",initialDataMessages=");
        A0k.append(this.initialDataMessages);
        A0k.append(",isE2eeModeMandated=");
        A0k.append(this.isE2eeModeMandated);
        A0k.append(",forReconnect=");
        A0k.append(this.forReconnect);
        A0k.append(",joinMode=");
        A0k.append(this.joinMode);
        A0k.append(",callLevelOverlayConfigLayer=");
        A0k.append(this.callLevelOverlayConfigLayer);
        A0k.append(",pregeneratedSdpManager=");
        return AbstractC2327GOs.A0U(this.pregeneratedSdpManager, A0k);
    }
}
