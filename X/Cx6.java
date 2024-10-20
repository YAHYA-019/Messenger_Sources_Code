package X;

import android.view.View;
import com.facebook.user.model.User;

/* loaded from: Cx6.class */
public final class Cx6 implements DGL {
    public final /* synthetic */ B82 A00;
    public final /* synthetic */ User A01;

    public Cx6(B82 b82, User user) {
        this.A00 = b82;
        this.A01 = user;
    }

    public void onClick(View view) {
        B82 b82 = this.A00;
        b82.A04.A00(b82.A00, b82.A01, this.A01);
    }
}
