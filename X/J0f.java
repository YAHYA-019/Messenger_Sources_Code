package X;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.incall.impl.active.drawer.ui.ActiveDrawerContainer;
import com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior;

/* loaded from: J0f.class */
public final class J0f implements Runnable {
    public static final String __redex_internal_original_name = "ActiveDrawerContainer$addSheet$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ActiveDrawerContainer A01;
    public final /* synthetic */ DrawerBehavior A02;

    public J0f(Context context, ActiveDrawerContainer activeDrawerContainer, DrawerBehavior drawerBehavior) {
        this.A01 = activeDrawerContainer;
        this.A00 = context;
        this.A02 = drawerBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActiveDrawerContainer activeDrawerContainer = this.A01;
        Class[] clsArr = CoordinatorLayout.A0L;
        FbUserSession fbUserSession = activeDrawerContainer.A0E;
        Context context = this.A00;
        11T.A0D(context);
        if (((2QO) 1Lm.A05(context, fbUserSession, 99977)).A00 != 0) {
            this.A02.A05(4);
        }
    }
}
