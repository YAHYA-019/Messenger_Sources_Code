package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharing.contentdiscovery.model.LifeEvent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: Cvr.class */
public final class Cvr implements C5wx {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Cvr(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.B4e, androidx.fragment.app.Fragment] */
    @Override // X.C5wx
    public boolean onLongClick(View view) {
        if (this.A00 != 0) {
            ((DJb) this.A02).C2j((ThreadKey) this.A03, (LifeEvent) this.A01);
            return true;
        }
        Bds bds = (Bds) this.A02;
        User user = (User) this.A03;
        11T.A0F(view, 1);
        ((CGJ) 1Hv.A02(4YU.A08(view), 83155)).A01(3Ea.A03, (Integer) null, AbF.A1A(user), "contact_manager_long_click");
        ?? r0 = bds.A00;
        MigColorScheme migColorScheme = r0.A0E;
        C8y c8y = r0.A0C;
        if (c8y == null) {
            return true;
        }
        Context requireContext = r0.requireContext();
        06Z parentFragmentManager = r0.getParentFragmentManager();
        C54 c54 = c8y.A00;
        if (c54.A01 == null) {
            1Bn.A0E((Context) null, c54.A00, 147604);
            c54.A01 = new CbQ(requireContext, parentFragmentManager, c54.A04);
        }
        C8y c8y2 = r0.A0C;
        if (c8y2 == null) {
            return true;
        }
        String str = r0.A0K;
        FbUserSession fbUserSession = r0.A01;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        c8y2.A01(view, fbUserSession, migColorScheme, user, str);
        return true;
    }
}
