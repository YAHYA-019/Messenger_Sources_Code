package com.facebook.rsys.raisehands.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: RaisedHandsQueuerModel.class */
public class RaisedHandsQueuerModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.PRIVACY_VIOLATION);
    public static long sMcfTypeId;
    public final boolean isNewState;
    public final long startTime;
    public final int state;
    public final String userId;

    public RaisedHandsQueuerModel(String str, long j, boolean z, int i) {
        str.getClass();
        this.userId = str;
        this.startTime = j;
        this.isNewState = z;
        this.state = i;
    }

    public static native RaisedHandsQueuerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof RaisedHandsQueuerModel)) {
                return false;
            }
            RaisedHandsQueuerModel raisedHandsQueuerModel = (RaisedHandsQueuerModel) obj;
            if (this.userId.equals(raisedHandsQueuerModel.userId) && this.startTime == raisedHandsQueuerModel.startTime && this.isNewState == raisedHandsQueuerModel.isNewState && this.state == raisedHandsQueuerModel.state) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AnonymousClass002.A02(this.startTime, AbstractC2326GOr.A07(this.userId)) + (this.isNewState ? 1 : 0)) * 31) + this.state;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RaisedHandsQueuerModel{userId=");
        A0k.append(this.userId);
        A0k.append(",startTime=");
        A0k.append(this.startTime);
        A0k.append(",isNewState=");
        A0k.append(this.isNewState);
        A0k.append(",state=");
        return AbstractC2327GOs.A0W(A0k, this.state);
    }
}
