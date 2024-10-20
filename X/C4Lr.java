package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.4Lr, reason: invalid class name */
/* loaded from: 4Lr.class */
public final class C4Lr implements 1VB, 1VC {
    public static final java.util.Map A08 = 04R.A09(new 03Y[]{new 03Y("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible", new 1VF(new 1VE[]{new 1VE(C0s8.A14(new 1VD(0)), 0), new 1VE(C0s8.A14(new 1VD(1)), 1)}))});
    public C4Lt A00;
    public C4Lt A01;
    public C4Ls A02;
    public C4Lx A03;
    public C4Lv A04;
    public final Context A05;
    public final C4Fo A06;
    public final 1Va A07;

    public C4Lr(Context context, C4Fo c4Fo, 1Va r304) {
        this.A05 = context;
        this.A07 = r304;
        this.A06 = c4Fo;
        C4Ls c4Ls = new C4Ls(context, c4Fo, r304);
        C4O1 c4o1 = new C4O1(this, 5);
        1VJ r0 = new 1VJ(c4Ls);
        c4o1.invoke(r0);
        1VH r02 = r0.A00;
        ArrayList arrayList = r0.A02;
        ArrayList arrayList2 = r0.A01;
        11T.A0I(r02, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.events.controller.config.HomeDrawerEventsGlobalConfig");
        this.A02 = (C4Ls) r02;
        Object obj = arrayList.get(0);
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.events.controller.config.HomeDrawerCriticalPathAwareBackgroundQueueConfig");
        this.A00 = (C4Lt) obj;
        Object obj2 = arrayList.get(1);
        11T.A0I(obj2, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.events.controller.config.HomeDrawerCriticalPathAwareBackgroundQueueConfig");
        this.A01 = (C4Lt) obj2;
        Object obj3 = arrayList2.get(0);
        11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.events.handlers.interop.ThirdPartyChatsOptInStateEventHandlerConfig");
        this.A04 = (C4Lv) obj3;
        Object obj4 = arrayList2.get(1);
        11T.A0I(obj4, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.events.handlers.badging.AccountSwitcherBadgingEventHandlerConfig");
        this.A03 = (C4Lx) obj4;
    }

    public 1VO Al1(int i) {
        C4Lt c4Lt;
        if (i == 0) {
            c4Lt = this.A00;
        } else {
            if (i != 1) {
                throw new RuntimeException();
            }
            c4Lt = this.A01;
        }
        return c4Lt.A00;
    }

    public int AoW() {
        return 2;
    }

    public 1VF AvX(String str) {
        11T.A0F(str, 0);
        return (1VF) A08.get(str);
    }

    public int B5i() {
        return 2;
    }

    public 1Vf BfG(int i) {
        S47 s47;
        if (i != 0) {
            if (i == 1) {
                return (1Vf) (this.A03.isEnabled() ? new A7E() : 2Wi.A00);
            }
            throw new RuntimeException();
        }
        if (this.A04.isEnabled()) {
            C4Ls c4Ls = this.A02;
            s47 = new S47(c4Ls.A00, c4Ls.A01);
        } else {
            s47 = 2Wi.A00;
        }
        return (1Vf) s47;
    }
}
