package com.facebook.rsys.livewith.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: LiveWithModel.class */
public class LiveWithModel {
    public static 2JQ CONVERTER = LVi.A00(27);
    public static long sMcfTypeId;
    public final int callType;
    public final ArrayList guests;
    public final int role;
    public final int state;

    public LiveWithModel(int i, int i2, int i3, ArrayList arrayList) {
        arrayList.getClass();
        this.callType = i;
        this.role = i2;
        this.state = i3;
        this.guests = arrayList;
    }

    public static native LiveWithModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LiveWithModel)) {
                return false;
            }
            LiveWithModel liveWithModel = (LiveWithModel) obj;
            if (this.callType == liveWithModel.callType && this.role == liveWithModel.role && this.state == liveWithModel.state && this.guests.equals(liveWithModel.guests)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.guests, (((AbstractC2326GOr.A03(this.callType) + this.role) * 31) + this.state) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LiveWithModel{callType=");
        A0k.append(this.callType);
        A0k.append(",role=");
        A0k.append(this.role);
        A0k.append(",state=");
        A0k.append(this.state);
        A0k.append(",guests=");
        return AbstractC2327GOs.A0U(this.guests, A0k);
    }
}
