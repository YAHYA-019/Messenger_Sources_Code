package com.facebook.rsys.countdowntimer.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

/* loaded from: CountdownTimerFeatureModel.class */
public class CountdownTimerFeatureModel {
    public static 2JQ CONVERTER = LVi.A00(8);
    public static long sMcfTypeId;
    public final CountdownTimerModel activeTimer;
    public final boolean canViewerConfigureCountdownTimer;
    public final boolean isCountdownTimerFeatureEnabled;
    public final boolean needSyncActiveTimer;
    public final HashSet participantActionCapabilities;

    public CountdownTimerFeatureModel(CountdownTimerModel countdownTimerModel, boolean z, boolean z2, HashSet hashSet, boolean z3) {
        hashSet.getClass();
        this.activeTimer = countdownTimerModel;
        this.isCountdownTimerFeatureEnabled = z;
        this.canViewerConfigureCountdownTimer = z2;
        this.participantActionCapabilities = hashSet;
        this.needSyncActiveTimer = z3;
    }

    public static native CountdownTimerFeatureModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CountdownTimerFeatureModel)) {
                return false;
            }
            CountdownTimerFeatureModel countdownTimerFeatureModel = (CountdownTimerFeatureModel) obj;
            CountdownTimerModel countdownTimerModel = this.activeTimer;
            CountdownTimerModel countdownTimerModel2 = countdownTimerFeatureModel.activeTimer;
            if (countdownTimerModel == null) {
                if (countdownTimerModel2 != null) {
                    return false;
                }
            } else if (!countdownTimerModel.equals(countdownTimerModel2)) {
                return false;
            }
            if (this.isCountdownTimerFeatureEnabled != countdownTimerFeatureModel.isCountdownTimerFeatureEnabled || this.canViewerConfigureCountdownTimer != countdownTimerFeatureModel.canViewerConfigureCountdownTimer || !this.participantActionCapabilities.equals(countdownTimerFeatureModel.participantActionCapabilities) || this.needSyncActiveTimer != countdownTimerFeatureModel.needSyncActiveTimer) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.participantActionCapabilities, (((AbstractC2326GOr.A03(AnonymousClass001.A02(this.activeTimer)) + (this.isCountdownTimerFeatureEnabled ? 1 : 0)) * 31) + (this.canViewerConfigureCountdownTimer ? 1 : 0)) * 31) + (this.needSyncActiveTimer ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CountdownTimerFeatureModel{activeTimer=");
        A0k.append(this.activeTimer);
        A0k.append(",isCountdownTimerFeatureEnabled=");
        A0k.append(this.isCountdownTimerFeatureEnabled);
        A0k.append(",canViewerConfigureCountdownTimer=");
        A0k.append(this.canViewerConfigureCountdownTimer);
        A0k.append(",participantActionCapabilities=");
        A0k.append(this.participantActionCapabilities);
        A0k.append(",needSyncActiveTimer=");
        return AbstractC2327GOs.A0X(A0k, this.needSyncActiveTimer);
    }
}
