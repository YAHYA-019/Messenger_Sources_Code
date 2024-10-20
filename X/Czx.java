package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.notifications.constants.push.NotificationType;
import com.facebook.push.constants.PushProperty;
import com.facebook.pushlite.model.PushInfraMetaData;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Czx.class */
public final class Czx implements 5Zs {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;
    public final Set A03;

    public Czx(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        1BY r0 = r303.A00;
        Set A0B = 1Lo.A0B((Context) null, fbUserSession, r0, 181);
        11T.A0A(A0B);
        this.A03 = A0B;
        this.A00 = 1BK.A0C();
        this.A01 = 1Bu.A03(r0, 115658);
    }

    public boolean BMo(C82j c82j, String str) {
        return NotificationType.A5C.A00(str);
    }

    public void C9e(Context context, C82j c82j, PushProperty pushProperty, PushInfraMetaData pushInfraMetaData) {
        if (1Br.A07(this.A00).AZk(2342158057213010352L)) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((DGR) it.next()).C9d(context, c82j, pushProperty);
            }
        }
    }

    public /* synthetic */ boolean CZV() {
        return false;
    }
}
