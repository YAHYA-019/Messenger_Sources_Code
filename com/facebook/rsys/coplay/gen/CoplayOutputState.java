package com.facebook.rsys.coplay.gen;

import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CoplayOutputState.class */
public class CoplayOutputState {
    public static 2JQ CONVERTER = IR0.A00(57);
    public static long sMcfTypeId;
    public final int action;
    public final boolean dmaGamingNotConsented;
    public final int e2eeDisclaimerStatus;
    public final ArrayList eligibleParticipants;
    public final String errorMessage;
    public final CoplayMatchState matchState;

    public CoplayOutputState(CoplayMatchState coplayMatchState, ArrayList arrayList, int i, String str, int i2, boolean z) {
        this.matchState = coplayMatchState;
        this.eligibleParticipants = arrayList;
        this.action = i;
        this.errorMessage = str;
        this.e2eeDisclaimerStatus = i2;
        this.dmaGamingNotConsented = z;
    }

    public static native CoplayOutputState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CoplayOutputState)) {
                return false;
            }
            CoplayOutputState coplayOutputState = (CoplayOutputState) obj;
            CoplayMatchState coplayMatchState = this.matchState;
            CoplayMatchState coplayMatchState2 = coplayOutputState.matchState;
            if (coplayMatchState == null) {
                if (coplayMatchState2 != null) {
                    return false;
                }
            } else if (!coplayMatchState.equals(coplayMatchState2)) {
                return false;
            }
            ArrayList arrayList = this.eligibleParticipants;
            ArrayList arrayList2 = coplayOutputState.eligibleParticipants;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.action != coplayOutputState.action) {
                return false;
            }
            String str = this.errorMessage;
            String str2 = coplayOutputState.errorMessage;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.e2eeDisclaimerStatus != coplayOutputState.e2eeDisclaimerStatus || this.dmaGamingNotConsented != coplayOutputState.dmaGamingNotConsented) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC2326GOr.A03(AnonymousClass001.A02(this.matchState)) + AnonymousClass001.A02(this.eligibleParticipants)) * 31) + this.action) * 31) + 7zN.A05(this.errorMessage)) * 31) + this.e2eeDisclaimerStatus) * 31) + (this.dmaGamingNotConsented ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CoplayOutputState{matchState=");
        A0k.append(this.matchState);
        A0k.append(",eligibleParticipants=");
        A0k.append(this.eligibleParticipants);
        A0k.append(",action=");
        A0k.append(this.action);
        A0k.append(",errorMessage=");
        A0k.append(this.errorMessage);
        A0k.append(",e2eeDisclaimerStatus=");
        A0k.append(this.e2eeDisclaimerStatus);
        A0k.append(",dmaGamingNotConsented=");
        return AbstractC2327GOs.A0X(A0k, this.dmaGamingNotConsented);
    }
}
