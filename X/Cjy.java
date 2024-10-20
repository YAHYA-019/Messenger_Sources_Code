package X;

import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* loaded from: Cjy.class */
public final class Cjy implements 7Yx {
    public final /* synthetic */ 4iI A00;
    public final /* synthetic */ 7L6 A01;
    public final /* synthetic */ UserKey A02;
    public final /* synthetic */ C5id A03;

    public Cjy(4iI r302, 7L6 r303, UserKey userKey, C5id c5id) {
        this.A00 = r302;
        this.A02 = userKey;
        this.A01 = r303;
        this.A03 = c5id;
    }

    public final void CHY(User user) {
        if (user != null) {
            4iI r0 = this.A00;
            UserKey userKey = this.A02;
            7L6 r02 = this.A01;
            C5id c5id = this.A03;
            11T.A0D(userKey);
            r0.A06(new RqY(r02, user, c5id), userKey);
        }
    }
}
