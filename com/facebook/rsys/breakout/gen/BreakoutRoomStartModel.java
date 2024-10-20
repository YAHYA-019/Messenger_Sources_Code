package com.facebook.rsys.breakout.gen;

import X.2JQ;
import X.7zM;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.GOq;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: BreakoutRoomStartModel.class */
public class BreakoutRoomStartModel {
    public static 2JQ CONVERTER = IR0.A00(22);
    public static long sMcfTypeId;
    public final String name;
    public final ArrayList participantIds;

    public BreakoutRoomStartModel(ArrayList arrayList, String str) {
        arrayList.getClass();
        str.getClass();
        this.participantIds = arrayList;
        this.name = str;
    }

    public static native BreakoutRoomStartModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof BreakoutRoomStartModel)) {
                return false;
            }
            BreakoutRoomStartModel breakoutRoomStartModel = (BreakoutRoomStartModel) obj;
            if (this.participantIds.equals(breakoutRoomStartModel.participantIds) && this.name.equals(breakoutRoomStartModel.name)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zM.A05(this.name, AbstractC2327GOs.A08(this.participantIds));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BreakoutRoomStartModel{participantIds=");
        A0k.append(this.participantIds);
        A0k.append(",name=");
        return GOq.A12(this.name, A0k);
    }
}
