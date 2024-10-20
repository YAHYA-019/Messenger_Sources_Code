package com.facebook.rsys.polls.gen;

import X.1BK;
import X.2JQ;
import X.7zP;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: PollModel.class */
public class PollModel {
    public static 2JQ CONVERTER = LVi.A00(41);
    public static long sMcfTypeId;
    public final PollParticipantModel creator;
    public final String id;
    public final ArrayList options;
    public final PollPermissionsModel permissions;
    public final int state;
    public final String title;
    public final int type;

    public PollModel(String str, PollParticipantModel pollParticipantModel, ArrayList arrayList, String str2, int i, int i2, PollPermissionsModel pollPermissionsModel) {
        7zP.A1S(str, pollParticipantModel, arrayList);
        str2.getClass();
        pollPermissionsModel.getClass();
        this.id = str;
        this.creator = pollParticipantModel;
        this.options = arrayList;
        this.title = str2;
        this.type = i;
        this.state = i2;
        this.permissions = pollPermissionsModel;
    }

    public static native PollModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PollModel)) {
                return false;
            }
            PollModel pollModel = (PollModel) obj;
            if (this.id.equals(pollModel.id) && this.creator.equals(pollModel.creator) && this.options.equals(pollModel.options) && this.title.equals(pollModel.title) && this.type == pollModel.type && this.state == pollModel.state && this.permissions.equals(pollModel.permissions)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.permissions, (((AnonymousClass002.A07(this.title, AnonymousClass002.A05(this.options, AnonymousClass002.A05(this.creator, AbstractC2326GOr.A07(this.id)))) + this.type) * 31) + this.state) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PollModel{id=");
        A0k.append(this.id);
        A0k.append(",creator=");
        A0k.append(this.creator);
        A0k.append(",options=");
        A0k.append(this.options);
        A0k.append(",title=");
        A0k.append(this.title);
        A0k.append(",type=");
        A0k.append(this.type);
        A0k.append(",state=");
        A0k.append(this.state);
        A0k.append(",permissions=");
        return AbstractC2327GOs.A0U(this.permissions, A0k);
    }
}
