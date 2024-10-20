package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import java.util.concurrent.Executor;

/* loaded from: F6o.class */
public final class F6o {
    public int A00;
    public final float[] A01 = new float[2];
    public final /* synthetic */ Context A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ ImageView A04;
    public final /* synthetic */ FbUserSession A05;
    public final /* synthetic */ ElR A06;
    public final /* synthetic */ Pzm A07;
    public final /* synthetic */ DNH A08;
    public final /* synthetic */ HhX A09;
    public final /* synthetic */ EWd A0A;
    public final /* synthetic */ Hnb A0B;
    public final /* synthetic */ User A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ Executor A0E;

    public F6o(Context context, View view, ImageView imageView, FbUserSession fbUserSession, ElR elR, Pzm pzm, DNH dnh, HhX hhX, EWd eWd, Hnb hnb, User user, String str, Executor executor) {
        this.A04 = imageView;
        this.A0B = hnb;
        this.A09 = hhX;
        this.A0D = str;
        this.A0C = user;
        this.A05 = fbUserSession;
        this.A02 = context;
        this.A08 = dnh;
        this.A0A = eWd;
        this.A0E = executor;
        this.A06 = elR;
        this.A03 = view;
        this.A07 = pzm;
        this.A00 = 7zO.A0I(imageView.getContext()).widthPixels;
    }

    public static void A00(F6o f6o, float f) {
        DNH dnh = f6o.A08;
        float[] fArr = f6o.A01;
        DNI dni = dnh.A07;
        fArr[0] = dni.A00 * dni.getBounds().width();
        fArr[1] = DKD.A02(dni) / 2;
        fArr[1] = DNH.A00(dni, dnh, fArr);
        ImageView imageView = f6o.A04;
        imageView.getMatrix().mapPoints(fArr);
        if (C2rY.A00(imageView.getContext())) {
            fArr[0] = (fArr[0] + f6o.A00) - DKC.A02(imageView);
        }
        Pzm pzm = f6o.A07;
        float f2 = fArr[0];
        float f3 = fArr[1];
        pzm.A00 = f2;
        pzm.A01 = f3;
        RO6 ro6 = pzm.A03;
        if (ro6 != null) {
            ro6.A03 = f2;
            ro6.A04 = f3;
        }
        pzm.invalidateSelf();
        float f4 = pzm.A08 + (f * (pzm.A07 - r0));
        pzm.A02 = f4;
        RO6 ro62 = pzm.A03;
        if (ro62 != null) {
            ro62.A01 = f4;
        }
        pzm.invalidateSelf();
    }
}
