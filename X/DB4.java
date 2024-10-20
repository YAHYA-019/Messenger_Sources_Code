package X;

import com.facebook.user.model.User;
import com.google.common.base.Objects;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* loaded from: DB4.class */
public final class DB4 implements Callable {
    public final int A00;
    public final User A01;
    public final C5u0 A02;
    public final String A03;
    public final WeakReference A04;

    public DB4(C6s5 c6s5, User user, C5u0 c5u0, String str, int i) {
        this.A01 = user;
        this.A02 = c5u0;
        this.A03 = str;
        this.A04 = 7zL.A14(c6s5);
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        User A00;
        C6s5 c6s5 = (C6s5) this.A04.get();
        if (c6s5 == null) {
            A00 = this.A01;
        } else {
            A00 = this.A02.A00(1BK.A0X(this.A03), this.A00);
            User user = this.A01;
            if (user == null || !Objects.equal(user.A07(), A00.A07()) || !Objects.equal(user.A0X, A00.A0X) || !Objects.equal(user.A02(), A00.A02())) {
                c6s5.A05();
                return A00;
            }
        }
        return A00;
    }
}
