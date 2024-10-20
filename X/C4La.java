package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.messaging.navigation.home.drawer.fragment.HomeDrawerSwipeStateController$DrawerSwipeAction;

/* renamed from: X.4La, reason: invalid class name */
/* loaded from: 4La.class */
public final class C4La {
    public float A02;
    public final C2iw A04;
    public final C4Fl A05;
    public HomeDrawerSwipeStateController$DrawerSwipeAction A00 = HomeDrawerSwipeStateController$DrawerSwipeAction.A03;
    public C4Lc A01 = C4Lb.A02;
    public final C4Le A07 = new C4Le() { // from class: X.4Ld
        @Override // X.C4Le
        public final void Bq5(1Iw r302) {
            C4La c4La = C4La.this;
            C4La.A01(c4La, C4Lb.A03, null);
            c4La.A00 = HomeDrawerSwipeStateController$DrawerSwipeAction.A02;
            c4La.A05.A1k();
        }
    };
    public final C4Le A06 = new C4Le() { // from class: X.4Lf
        @Override // X.C4Le
        public final void Bq5(1Iw r302) {
            C4La c4La = C4La.this;
            C4La.A01(c4La, C4Lb.A02, null);
            c4La.A00 = HomeDrawerSwipeStateController$DrawerSwipeAction.A03;
            c4La.A05.A1j();
        }
    };
    public final 1Br A03 = 1Bq.A00(83660);

    public C4La(C2iw c2iw, C4Fl c4Fl) {
        this.A04 = c2iw;
        this.A05 = c4Fl;
    }

    public static final float A00(Context context, C4La c4La, float f) {
        float f2;
        Resources resources = context.getResources();
        11T.A0A(resources);
        float A02 = c4La.A02(resources);
        int ordinal = c4La.A00.ordinal();
        boolean A00 = C2rY.A00(context);
        int i = 1;
        if (ordinal != 0) {
            if (A00) {
                i = -1;
            }
            f2 = (i * f) + A02;
        } else {
            if (A00) {
                i = -1;
            }
            f2 = i * f;
        }
        if (A02 <= 0.0f) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Received drawer content width < 0: ");
            A0k.append(A02);
            A0k.append(", raw translation: ");
            A0k.append(f);
            A0k.append(", transformedX: ");
            A0k.append(f2);
            0fH.A0o("HomeDrawerSwipeStateController", A0k.toString());
        }
        return 07C.A01(f2, 0.0f, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.4TB, java.lang.Object] */
    public static final void A01(C4La c4La, C4Lc c4Lc, C4Le c4Le) {
        c4La.A01 = c4Lc;
        c4La.A03.A00.get();
        C2iw c2iw = c4La.A04;
        11T.A0F(c2iw, 1);
        C2ko A0G = 1LI.A0G(c2iw, 1699150002);
        if (A0G != 0) {
            ?? obj = new Object();
            ((4TB) obj).A00 = c4Lc;
            ((4TB) obj).A01 = c4Le;
            A0G.A00(obj, new Object[0]);
        }
    }

    public final float A02(Resources resources) {
        float f = this.A02;
        if (f <= 0.0f) {
            f = C4Fk.A00.A01(resources);
            this.A02 = f;
        }
        return f;
    }
}
