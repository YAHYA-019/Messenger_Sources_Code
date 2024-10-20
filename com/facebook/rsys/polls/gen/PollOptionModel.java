package com.facebook.rsys.polls.gen;

import X.1BK;
import X.1BL;
import X.2JQ;
import X.7zP;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: PollOptionModel.class */
public class PollOptionModel {
    public static 2JQ CONVERTER = LVi.A00(43);
    public static long sMcfTypeId;
    public final PollOptionContentModel content;
    public final String id;
    public final PollOptionPermissionsModel permissions;
    public final float voteFraction;
    public final ArrayList voters;

    public PollOptionModel(String str, PollOptionContentModel pollOptionContentModel, ArrayList arrayList, float f, PollOptionPermissionsModel pollOptionPermissionsModel) {
        7zP.A1S(str, pollOptionContentModel, arrayList);
        pollOptionPermissionsModel.getClass();
        this.id = str;
        this.content = pollOptionContentModel;
        this.voters = arrayList;
        this.voteFraction = f;
        this.permissions = pollOptionPermissionsModel;
    }

    public static native PollOptionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PollOptionModel)) {
                return false;
            }
            PollOptionModel pollOptionModel = (PollOptionModel) obj;
            if (this.id.equals(pollOptionModel.id) && this.content.equals(pollOptionModel.content) && this.voters.equals(pollOptionModel.voters) && this.voteFraction == pollOptionModel.voteFraction && this.permissions.equals(pollOptionModel.permissions)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.permissions, 1BL.A00(AnonymousClass002.A05(this.voters, AnonymousClass002.A05(this.content, AbstractC2326GOr.A07(this.id))), this.voteFraction));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PollOptionModel{id=");
        A0k.append(this.id);
        A0k.append(",content=");
        A0k.append(this.content);
        A0k.append(",voters=");
        A0k.append(this.voters);
        A0k.append(",voteFraction=");
        A0k.append(this.voteFraction);
        A0k.append(",permissions=");
        return AbstractC2327GOs.A0U(this.permissions, A0k);
    }
}
