package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* renamed from: X.9rd, reason: invalid class name */
/* loaded from: 9rd.class */
public final class C9rd implements JKw {
    public final Context A01;
    public final 1pI A02;
    public final 06Z A04;
    public final FbUserSession A05;
    public final C01i A03 = AQZ.A00(this, C03i.A02, 27);
    public Point A00 = new Point(0, 0);

    public C9rd(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305) {
        this.A01 = context;
        this.A05 = fbUserSession;
        this.A02 = r305;
        this.A04 = r303;
    }

    @Override // X.JKw
    public void AND(float f, float f2) {
        this.A00 = new Point((int) f, (int) f2);
    }

    @Override // X.JKw
    public void ANE(float f, float f2) {
        Point point = this.A00;
        int i = point.x;
        int i2 = (int) f;
        if (i == i2 && point.y == ((int) f2)) {
            return;
        }
        this.A00 = new Point(i2, (int) f2);
    }

    @Override // X.JKw
    public void ANF() {
    }

    @Override // X.JKw
    public void ANH() {
        Context context = this.A01;
        FbUserSession A0F = 4YV.A0F(context);
        1qI A0U = 7zR.A0U();
        Long A0e = 0CW.A0e(A0U.A06());
        if (1qI.A02(A0U).AZk(36322796125046647L)) {
            if (1BK.A0F() != null) {
                06Z r0 = this.A04;
                2Ov r02 = new 2Ov();
                Bundle A05 = 1BK.A05();
                A05.putString("message_to_send_on_thread_open", null);
                r02.setArguments(A05);
                r02.A0m(r0, "AiBotLauncher");
                return;
            }
            return;
        }
        if (A0e != null) {
            ThreadKey A0F2 = ThreadKey.A0F(A0e.longValue(), 7zO.A0C(A0F));
            2Mt r03 = (2Mt) this.A03.getValue();
            C6el A0H = 1BK.A0H(A0F2);
            A0H.A02(5SW.A09);
            r03.A01(context, 2mH.A02, A0F, new ThreadViewParams(A0H));
        }
    }
}
