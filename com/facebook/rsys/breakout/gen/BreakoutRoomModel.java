package com.facebook.rsys.breakout.gen;

import X.2JQ;
import X.7zM;
import X.7zP;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: BreakoutRoomModel.class */
public class BreakoutRoomModel {
    public static 2JQ CONVERTER = IR0.A00(21);
    public static long sMcfTypeId;
    public final String conferenceName;
    public final String linkUrl;
    public final String name;
    public final ArrayList participantIds;

    public BreakoutRoomModel(String str, String str2, ArrayList arrayList, String str3) {
        7zP.A1S(str, str2, arrayList);
        str3.getClass();
        this.conferenceName = str;
        this.linkUrl = str2;
        this.participantIds = arrayList;
        this.name = str3;
    }

    public static native BreakoutRoomModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof BreakoutRoomModel)) {
                return false;
            }
            BreakoutRoomModel breakoutRoomModel = (BreakoutRoomModel) obj;
            if (this.conferenceName.equals(breakoutRoomModel.conferenceName) && this.linkUrl.equals(breakoutRoomModel.linkUrl) && this.participantIds.equals(breakoutRoomModel.participantIds) && this.name.equals(breakoutRoomModel.name)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zM.A05(this.name, AnonymousClass002.A05(this.participantIds, AnonymousClass002.A07(this.linkUrl, AbstractC2326GOr.A07(this.conferenceName))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BreakoutRoomModel{conferenceName=");
        A0k.append(this.conferenceName);
        A0k.append(",linkUrl=");
        A0k.append(this.linkUrl);
        A0k.append(",participantIds=");
        A0k.append(this.participantIds);
        A0k.append(",name=");
        return GOq.A12(this.name, A0k);
    }
}
