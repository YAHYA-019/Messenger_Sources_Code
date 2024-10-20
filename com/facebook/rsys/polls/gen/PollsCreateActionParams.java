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

/* loaded from: PollsCreateActionParams.class */
public class PollsCreateActionParams {
    public static 2JQ CONVERTER = LVi.A00(48);
    public static long sMcfTypeId;
    public final ArrayList options;
    public final String pollId;
    public final PollPermissionsModel pollPermissions;
    public final int pollType;
    public final String title;

    public PollsCreateActionParams(String str, String str2, ArrayList arrayList, int i, PollPermissionsModel pollPermissionsModel) {
        7zP.A1S(str, str2, arrayList);
        pollPermissionsModel.getClass();
        this.pollId = str;
        this.title = str2;
        this.options = arrayList;
        this.pollType = i;
        this.pollPermissions = pollPermissionsModel;
    }

    public static native PollsCreateActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PollsCreateActionParams)) {
                return false;
            }
            PollsCreateActionParams pollsCreateActionParams = (PollsCreateActionParams) obj;
            if (this.pollId.equals(pollsCreateActionParams.pollId) && this.title.equals(pollsCreateActionParams.title) && this.options.equals(pollsCreateActionParams.options) && this.pollType == pollsCreateActionParams.pollType && this.pollPermissions.equals(pollsCreateActionParams.pollPermissions)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.pollPermissions, (AnonymousClass002.A05(this.options, AnonymousClass002.A07(this.title, AbstractC2326GOr.A07(this.pollId))) + this.pollType) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PollsCreateActionParams{pollId=");
        A0k.append(this.pollId);
        A0k.append(",title=");
        A0k.append(this.title);
        A0k.append(",options=");
        A0k.append(this.options);
        A0k.append(",pollType=");
        A0k.append(this.pollType);
        A0k.append(",pollPermissions=");
        return AbstractC2327GOs.A0U(this.pollPermissions, A0k);
    }
}
