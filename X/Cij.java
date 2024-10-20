package X;

import com.facebook.user.model.User;

/* loaded from: Cij.class */
public final class Cij implements AXh {
    public final User A00;
    public final String A01;

    public Cij(User user) {
        11T.A0F(user, 1);
        this.A00 = user;
        this.A01 = AbF.A1A(user);
    }

    @Override // X.AXh
    public String getId() {
        return this.A01;
    }
}
