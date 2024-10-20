package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.RemoteException;
import android.view.WindowManager;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.base.Preconditions;

/* loaded from: L8A.class */
public final class L8A {
    public Context A00;
    public Handler A01;
    public C3262JoS A02;
    public C3262JoS A03;
    public boolean A04;
    public boolean A05;
    public final FbSharedPreferences A06;
    public final C15h A07;
    public final C01s A08;

    public L8A() {
        Context A0J = 7zP.A0J();
        LuE luE = new LuE(this, 5);
        FbSharedPreferences A0i = AbJ.A0i();
        Handler handler = (Handler) 1Bn.A0B(16430);
        C01s A0I = 1BL.A0I();
        this.A00 = A0J;
        this.A07 = luE;
        this.A06 = A0i;
        this.A08 = A0I;
        this.A01 = handler;
    }

    public static void A00(Point point, L8A l8a, Integer num) {
        int i;
        if (!1BK.A1T(l8a.A06, 1NK.A0M)) {
            try {
                if (l8a.A03 == null) {
                    C3262JoS c3262JoS = (C3262JoS) l8a.A07.get();
                    l8a.A03 = c3262JoS;
                    JwQ jwQ = new JwQ(c3262JoS.A02, 2131954093);
                    Preconditions.checkState(AnonymousClass001.A1U(((KTe) c3262JoS).A01));
                    ((KTe) c3262JoS).A01 = jwQ;
                    jwQ.A00 = new Kez(c3262JoS);
                    l8a.A03.A01();
                }
                C3262JoS c3262JoS2 = l8a.A03;
                JwQ jwQ2 = ((KTe) c3262JoS2).A01;
                if (num != jwQ2.A03) {
                    jwQ2.A0V(num);
                    WindowManager.LayoutParams layoutParams = c3262JoS2.getLayoutParams();
                    if (num == 0S2.A01) {
                        i = 51;
                    } else {
                        if (num == 0S2.A00) {
                            i = 53;
                        }
                        c3262JoS2.setLayoutParams(layoutParams);
                    }
                    layoutParams.gravity = i;
                    c3262JoS2.setLayoutParams(layoutParams);
                }
                c3262JoS2.A00 = point.x;
                C3262JoS.A00(c3262JoS2);
                c3262JoS2.A01 = point.y;
                C3262JoS.A00(c3262JoS2);
                l8a.A05 = true;
                c3262JoS2.A04();
            } catch (RemoteException | WindowManager.BadTokenException e) {
                A01(l8a, e, "T2190668:wm_ex_add_first_chat_head_nux", "Failed to add first chat head nux window");
            }
        }
    }

    public static void A01(L8A l8a, Exception exc, String str, String str2) {
        StringBuilder A0n = AnonymousClass001.A0n(str2);
        A0n.append(": ");
        A0n.append(exc);
        A0n.append(":\n\n");
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            1BK.A1R(A0n, stackTraceElement);
            A0n.append("\n");
        }
        String obj = A0n.toString();
        0fH.A0B(L8A.class, obj);
        l8a.A08.D0v(str, obj);
    }

    public void A02() {
        this.A01.removeCallbacksAndMessages(null);
        C3262JoS c3262JoS = this.A03;
        if (c3262JoS != null) {
            c3262JoS.A03();
            this.A03 = null;
        }
    }
}
