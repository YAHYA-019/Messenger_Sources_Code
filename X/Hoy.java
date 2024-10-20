package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hoy.class */
public final class Hoy {
    public final C00i A00;
    public final 1Br A01;
    public final FbUserSession A02;
    public final 1De A03;

    public Hoy(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        this.A02 = fbUserSession;
        this.A01 = 1Bq.A00(49322);
        this.A00 = 7zL.A0S(fbUserSession, r303, 98492);
    }

    public final int A00(Context context) {
        int max;
        11T.A0F(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279412);
        int A02 = 0NA.A02(context, 2130970632, 0);
        C4s1 c4s1 = (C4s1) 1Br.A0B(this.A01);
        synchronized (c4s1) {
            max = Math.max(c4s1.A04(), c4s1.A03());
        }
        C00i c00i = this.A00;
        return (((max - ((IMK) c00i.get()).A07.top) - ((IMK) c00i.get()).A07.bottom) - dimensionPixelSize) - A02;
    }
}
