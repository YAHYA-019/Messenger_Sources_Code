package com.facebook.rsys.state.gen;

import X.1BL;
import X.2JQ;
import X.30R;
import X.AnonymousClass001;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: State.class */
public class State {
    public static 2JQ CONVERTER = new 30R(1);
    public static long sMcfTypeId;
    public final int callState;
    public final boolean isActive;
    public final String localCallId;
    public final String selfUserId;

    public State(String str, String str2, int i, boolean z) {
        str.getClass();
        this.selfUserId = str;
        this.localCallId = str2;
        this.callState = i;
        this.isActive = z;
    }

    public static native State createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            if (!this.selfUserId.equals(state.selfUserId)) {
                return false;
            }
            String str = this.localCallId;
            String str2 = state.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.callState != state.callState || this.isActive != state.isActive) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.selfUserId.hashCode()) * 31) + 1BL.A05(this.localCallId)) * 31) + this.callState) * 31) + (this.isActive ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("State{selfUserId=");
        A0k.append(this.selfUserId);
        A0k.append(",localCallId=");
        A0k.append(this.localCallId);
        A0k.append(",callState=");
        A0k.append(this.callState);
        A0k.append(",isActive=");
        A0k.append(this.isActive);
        return 1BL.A0v(A0k);
    }
}
