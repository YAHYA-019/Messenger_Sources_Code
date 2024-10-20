package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: AudioModel.class */
public class AudioModel {
    public static 2JQ CONVERTER = IR0.A00(5);
    public static long sMcfTypeId;
    public final int activeAudioInputRouteIdx;
    public final int activeAudioOutputRouteIdx;
    public final int audioActivationState;
    public final boolean audioBufferingStarted;
    public final ArrayList availableAudioInputRoutes;
    public final ArrayList availableAudioOutputRoutes;
    public final boolean hasUsedBluetoothAudioOutputRoute;
    public final boolean isInitialModel;
    public final boolean micOn;
    public final boolean micOnDesired;
    public final boolean noiseSuppressionOn;
    public final boolean shouldResetNsAecAlgorithms;

    public AudioModel(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, ArrayList arrayList, boolean z5, int i3, ArrayList arrayList2, boolean z6, boolean z7) {
        arrayList.getClass();
        arrayList2.getClass();
        this.audioActivationState = i;
        this.micOnDesired = z;
        this.micOn = z2;
        this.noiseSuppressionOn = z3;
        this.shouldResetNsAecAlgorithms = z4;
        this.activeAudioInputRouteIdx = i2;
        this.availableAudioInputRoutes = arrayList;
        this.hasUsedBluetoothAudioOutputRoute = z5;
        this.activeAudioOutputRouteIdx = i3;
        this.availableAudioOutputRoutes = arrayList2;
        this.audioBufferingStarted = z6;
        this.isInitialModel = z7;
    }

    public static native AudioModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AudioModel)) {
                return false;
            }
            AudioModel audioModel = (AudioModel) obj;
            if (this.audioActivationState == audioModel.audioActivationState && this.micOnDesired == audioModel.micOnDesired && this.micOn == audioModel.micOn && this.noiseSuppressionOn == audioModel.noiseSuppressionOn && this.shouldResetNsAecAlgorithms == audioModel.shouldResetNsAecAlgorithms && this.activeAudioInputRouteIdx == audioModel.activeAudioInputRouteIdx && this.availableAudioInputRoutes.equals(audioModel.availableAudioInputRoutes) && this.hasUsedBluetoothAudioOutputRoute == audioModel.hasUsedBluetoothAudioOutputRoute && this.activeAudioOutputRouteIdx == audioModel.activeAudioOutputRouteIdx && this.availableAudioOutputRoutes.equals(audioModel.availableAudioOutputRoutes) && this.audioBufferingStarted == audioModel.audioBufferingStarted && this.isInitialModel == audioModel.isInitialModel) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.availableAudioOutputRoutes, (((AnonymousClass002.A05(this.availableAudioInputRoutes, (((((((((AbstractC2326GOr.A03(this.audioActivationState) + (this.micOnDesired ? 1 : 0)) * 31) + (this.micOn ? 1 : 0)) * 31) + (this.noiseSuppressionOn ? 1 : 0)) * 31) + (this.shouldResetNsAecAlgorithms ? 1 : 0)) * 31) + this.activeAudioInputRouteIdx) * 31) + (this.hasUsedBluetoothAudioOutputRoute ? 1 : 0)) * 31) + this.activeAudioOutputRouteIdx) * 31) + (this.audioBufferingStarted ? 1 : 0)) * 31) + (this.isInitialModel ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioModel{audioActivationState=");
        A0k.append(this.audioActivationState);
        A0k.append(",micOnDesired=");
        A0k.append(this.micOnDesired);
        A0k.append(",micOn=");
        A0k.append(this.micOn);
        A0k.append(",noiseSuppressionOn=");
        A0k.append(this.noiseSuppressionOn);
        A0k.append(",shouldResetNsAecAlgorithms=");
        A0k.append(this.shouldResetNsAecAlgorithms);
        A0k.append(",activeAudioInputRouteIdx=");
        A0k.append(this.activeAudioInputRouteIdx);
        A0k.append(",availableAudioInputRoutes=");
        A0k.append(this.availableAudioInputRoutes);
        A0k.append(",hasUsedBluetoothAudioOutputRoute=");
        A0k.append(this.hasUsedBluetoothAudioOutputRoute);
        A0k.append(",activeAudioOutputRouteIdx=");
        A0k.append(this.activeAudioOutputRouteIdx);
        A0k.append(",availableAudioOutputRoutes=");
        A0k.append(this.availableAudioOutputRoutes);
        A0k.append(",audioBufferingStarted=");
        A0k.append(this.audioBufferingStarted);
        A0k.append(",isInitialModel=");
        return AbstractC2327GOs.A0X(A0k, this.isInitialModel);
    }
}
