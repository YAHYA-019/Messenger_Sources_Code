package com.facebook.rsys.callinfo.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.GOq;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CallInfo.class */
public class CallInfo {
    public static 2JQ CONVERTER = LVi.A00(3);
    public static long sMcfTypeId;
    public final int expansionBehavior;
    public final boolean isAdminAddOnly;
    public final String name;
    public final int state;
    public final ArrayList threadAdminIds;
    public final String threadPhotoURL;

    public CallInfo(int i, String str, int i2, ArrayList arrayList, boolean z, String str2) {
        this.state = i;
        this.name = str;
        this.expansionBehavior = i2;
        this.threadAdminIds = arrayList;
        this.isAdminAddOnly = z;
        this.threadPhotoURL = str2;
    }

    public static native CallInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallInfo)) {
                return false;
            }
            CallInfo callInfo = (CallInfo) obj;
            if (this.state != callInfo.state) {
                return false;
            }
            String str = this.name;
            String str2 = callInfo.name;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.expansionBehavior != callInfo.expansionBehavior) {
                return false;
            }
            ArrayList arrayList = this.threadAdminIds;
            ArrayList arrayList2 = callInfo.threadAdminIds;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.isAdminAddOnly != callInfo.isAdminAddOnly) {
                return false;
            }
            String str3 = this.threadPhotoURL;
            String str4 = callInfo.threadPhotoURL;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC2326GOr.A03(this.state) + 1BL.A05(this.name)) * 31) + this.expansionBehavior) * 31) + AnonymousClass001.A02(this.threadAdminIds)) * 31) + (this.isAdminAddOnly ? 1 : 0)) * 31) + 7zN.A05(this.threadPhotoURL);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallInfo{state=");
        A0k.append(this.state);
        A0k.append(",name=");
        A0k.append(this.name);
        A0k.append(",expansionBehavior=");
        A0k.append(this.expansionBehavior);
        A0k.append(",threadAdminIds=");
        A0k.append(this.threadAdminIds);
        A0k.append(",isAdminAddOnly=");
        A0k.append(this.isAdminAddOnly);
        A0k.append(",threadPhotoURL=");
        return GOq.A12(this.threadPhotoURL, A0k);
    }
}
