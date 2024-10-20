package com.facebook.rsys.callcontext.gen;

import X.1BK;
import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CallContext.class */
public class CallContext {
    public static 2JQ CONVERTER = IR0.A00(28);
    public static long sMcfTypeId;
    public final McfReference appContext;
    public final int roomType;
    public final String selfActorId;
    public final String selfId;

    public CallContext(String str, String str2, int i, McfReference mcfReference) {
        str.getClass();
        mcfReference.getClass();
        this.selfId = str;
        this.selfActorId = str2;
        this.roomType = i;
        this.appContext = mcfReference;
    }

    public static native CallContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallContext)) {
                return false;
            }
            CallContext callContext = (CallContext) obj;
            if (!this.selfId.equals(callContext.selfId)) {
                return false;
            }
            String str = this.selfActorId;
            String str2 = callContext.selfActorId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.roomType != callContext.roomType || !this.appContext.equals(callContext.appContext)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.appContext, (((AbstractC2326GOr.A07(this.selfId) + 1BL.A05(this.selfActorId)) * 31) + this.roomType) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallContext{selfId=");
        A0k.append(this.selfId);
        A0k.append(",selfActorId=");
        A0k.append(this.selfActorId);
        A0k.append(",roomType=");
        A0k.append(this.roomType);
        A0k.append(",appContext=");
        return AbstractC2327GOs.A0U(this.appContext, A0k);
    }
}
