package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.user.model.UserKey;
import java.util.ArrayList;

/* renamed from: X.241, reason: invalid class name */
/* loaded from: 241.class */
public final class AnonymousClass241 {
    public final Context A00;
    public final 1I7 A01;
    public final 1De A02;

    public AnonymousClass241(1De r302) {
        this.A02 = r302;
        Context context = (Context) 1Bn.A0E((Context) null, r302.A00, 83719);
        this.A00 = context;
        11T.A0F(context, 1);
        this.A01 = (1I7) 1Hv.A02(context, 65728);
    }

    public final void A00(UserKey userKey) {
        11T.A0F(userKey, 0);
        ArrayList A0t = AnonymousClass001.A0t(1);
        A0t.add(userKey);
        A02(A0t);
    }

    public final void A01(UserKey userKey) {
        Intent intent = new Intent("com.facebook.user.broadcast.ACTION_USERNAME_UPDATED");
        intent.putExtra("updated_user", userKey);
        this.A01.CkS(intent);
    }

    public final void A02(ArrayList arrayList) {
        Intent intent = new Intent("com.facebook.orca.users.ACTION_USERS_UPDATED");
        intent.putParcelableArrayListExtra("updated_users", arrayList);
        this.A01.CkS(intent);
    }
}
