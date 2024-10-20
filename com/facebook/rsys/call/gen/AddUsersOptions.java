package com.facebook.rsys.call.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import java.util.ArrayList;

/* loaded from: AddUsersOptions.class */
public class AddUsersOptions {
    public static 2JQ CONVERTER = LVi.A00(1);
    public static long sMcfTypeId;
    public final ArrayList customDataMessages;
    public final CallContext newCallContext;

    public AddUsersOptions(CallContext callContext, ArrayList arrayList) {
        this.newCallContext = callContext;
        this.customDataMessages = arrayList;
    }

    public static native AddUsersOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AddUsersOptions)) {
                return false;
            }
            AddUsersOptions addUsersOptions = (AddUsersOptions) obj;
            CallContext callContext = this.newCallContext;
            CallContext callContext2 = addUsersOptions.newCallContext;
            if (callContext == null) {
                if (callContext2 != null) {
                    return false;
                }
            } else if (!callContext.equals(callContext2)) {
                return false;
            }
            ArrayList arrayList = this.customDataMessages;
            ArrayList arrayList2 = addUsersOptions.customDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(AnonymousClass001.A02(this.newCallContext)) + 4YU.A03(this.customDataMessages);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AddUsersOptions{newCallContext=");
        A0k.append(this.newCallContext);
        A0k.append(",customDataMessages=");
        return AbstractC2327GOs.A0U(this.customDataMessages, A0k);
    }
}
