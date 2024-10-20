package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: I0a.class */
public final class I0a {
    public 7QJ A01;
    public 1BY A02;
    public JMt A03;
    public 06Z A04;
    public final Context A05;
    public final View A06;
    public final ImageView A07;
    public final TextView A08;
    public final FbUserSession A09;
    public final ThreadKey A0I;
    public final Boolean A0J;
    public final Boolean A0K;
    public final C00i A0D = 1BV.A01((1BY) null, 115916);
    public final C00i A0H = 1BQ.A00();
    public final C00i A0C = 1BQ.A02(114757);
    public final C00i A0G = AbH.A0Q();
    public final C00i A0E = 1BV.A01((1BY) null, 66570);
    public final C00i A0F = 1BV.A01((1BY) null, 16979);
    public final C00i A0B = 1BV.A01((1BY) null, 67077);
    public int A00 = 0;
    public final C00i A0A = 1BV.A01((1BY) null, 16979);

    public I0a(View view, 06Z r303, FbUserSession fbUserSession, 1BO r305, ThreadKey threadKey, Boolean bool, Boolean bool2) {
        this.A02 = 7zL.A0Q(r305);
        this.A06 = view;
        this.A05 = view.getContext();
        this.A0I = threadKey;
        this.A04 = r303;
        this.A07 = (ImageView) C09s.A01(view, 2131365833);
        this.A08 = DKF.A0E(view, 2131365834);
        this.A0J = bool;
        this.A0K = bool2;
        this.A09 = fbUserSession;
    }

    public static void A00(MenuItem menuItem, I0a i0a, int i) {
        if (menuItem != null) {
            menuItem.setTitle(i0a.A05.getResources().getString(i));
        }
    }
}
