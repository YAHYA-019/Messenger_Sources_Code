package X;

import android.content.Context;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Cmk.class */
public final class Cmk implements 5Vz {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DFY A01;
    public final /* synthetic */ CNl A02;

    public Cmk(Context context, DFY dfy, CNl cNl) {
        this.A02 = cNl;
        this.A00 = context;
        this.A01 = dfy;
    }

    public void Bq7(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        if (immutableList.isEmpty()) {
            return;
        }
        CNl cNl = this.A02;
        Context context = this.A00;
        User user = (User) 4YU.A0q(immutableList, 0);
        DFY dfy = this.A01;
        11T.A0F(user, 1);
        CO3.A03(context, user, 1);
        1Kn r0 = 1Kn.A05;
        dfy.Bzw(r0);
        ((Bga) 1Br.A0B(cNl.A00)).A00 = r0;
    }
}
