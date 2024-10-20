package X;

import android.view.Menu;
import android.view.View;
import com.facebook.user.model.User;

/* loaded from: Cx7.class */
public final class Cx7 implements DGL {
    public final /* synthetic */ CPR A00;
    public final /* synthetic */ 6HW A01;
    public final /* synthetic */ User A02;

    public Cx7(CPR cpr, 6HW r303, User user) {
        this.A00 = cpr;
        this.A01 = r303;
        this.A02 = user;
    }

    public final void onClick(View view) {
        11T.A0F(view, 0);
        CPR cpr = this.A00;
        8Ca A01 = ((C9kp) 1Br.A0B(cpr.A0B)).A01(view, 7zQ.A0m(cpr.A04));
        6HW r0 = this.A01;
        Menu menu = ((7QJ) A01).A04;
        JXV jZn = new JZn(A01.A00);
        User user = this.A02;
        jZn.inflate(2131623944, menu);
        6HQ r02 = r0.A01;
        6HQ.A00(menu, r02, user);
        6HQ.A01(menu, user);
        ((7QJ) A01).A01 = new CZY(user, r0, 2);
        AbH.A1L(view, r02.A08);
        A01.A00();
    }
}
