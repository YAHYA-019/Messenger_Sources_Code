package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Cmm.class */
public final class Cmm implements 5Vz {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ DFY A02;
    public final /* synthetic */ CNl A03;

    public Cmm(Context context, 06Z r303, DFY dfy, CNl cNl) {
        this.A03 = cNl;
        this.A00 = context;
        this.A01 = r303;
        this.A02 = dfy;
    }

    public void Bq7(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        if (immutableList.isEmpty()) {
            return;
        }
        CNl cNl = this.A03;
        Context context = this.A00;
        06Z r0 = this.A01;
        User user = (User) 4YU.A0q(immutableList, 0);
        DFY dfy = this.A02;
        CO3.A02(context, user, 7zP.A1Z(user) ? 1 : 0);
        1Kn r02 = 1Kn.A03;
        dfy.Bzw(r02);
        r0.A1R("request_key_cancel_friend_request_click", new Bundle(0));
        ((Bga) 1Br.A0B(cNl.A00)).A00 = r02;
    }
}
