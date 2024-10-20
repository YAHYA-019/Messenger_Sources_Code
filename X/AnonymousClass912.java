package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.resources.ui.FbProgressBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.912, reason: invalid class name */
/* loaded from: 912.class */
public final class AnonymousClass912 extends FbFrameLayout implements LifecycleObserver {
    public 06Z A00;
    public LifecycleOwner A01;
    public ThreadKey A02;
    public MigColorScheme A03;
    public 9Lq A04;
    public boolean A05;
    public boolean A06;
    public final RecyclerView A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final LithoView A0G;
    public final LithoView A0H;
    public final FbProgressBar A0I;
    public final C9mD A0J;
    public final C01i A0K;
    public final C01i A0L;
    public final Observer A0M;
    public final Observer A0N;
    public final 8Dp A0O;
    public final 1Iw A0P;
    public final 9Ri A0Q;

    public AnonymousClass912(Context context, ThreadKey threadKey) {
        super(context);
        this.A0F = 1Bu.A00(147813);
        this.A08 = 1Bu.A00(68614);
        this.A0E = 1Bu.A01(context, 68615);
        C01i A00 = C01g.A00(C03i.A02, new J9o(context, 16));
        this.A0L = A00;
        this.A0A = 1Bu.A00(68613);
        this.A09 = 1Lm.A01(7zM.A0I(A00), 116062);
        this.A0D = 1Lm.A00(context, 7zM.A0I(this.A0L), 68376);
        this.A0C = 1Lm.A00(context, 7zM.A0I(this.A0L), 68377);
        this.A0B = 1Bu.A00(68617);
        1Br.A0C(this.A0F);
        C9mD c9mD = new C9mD(context, threadKey, null, false);
        this.A0J = c9mD;
        this.A0N = new C9qq(this, ActionId.ACTION_BAR_COMPLETE);
        this.A0M = new C9qq(this, ActionId.LEGACY_MARKER);
        this.A02 = threadKey;
        this.A0P = 7zL.A0W(context);
        this.A0K = C01g.A01(new J9o(this, 15));
        this.A0Q = new 9Ri(context, threadKey, this);
        View.inflate(context, 2132541557, this);
        RecyclerView recyclerView = (RecyclerView) 7zM.A0H(this, 2131362325);
        this.A07 = recyclerView;
        this.A0I = (FbProgressBar) 7zM.A0H(this, 2131365312);
        this.A0G = (LithoView) 7zM.A0H(this, 2131363716);
        this.A0H = (LithoView) 7zM.A0H(this, 2131366058);
        8Dp r0 = new 8Dp((int) 7G3.A00((7G3) 1Br.A0B(this.A0B)).Av9(1GD.A07, 36599954655286048L));
        this.A0O = r0;
        r0.A00 = new J9o(this, 14);
        recyclerView.A16((2Xd) 1Br.A0B(this.A08));
        recyclerView.A1A(new Q2T());
        Resources resources = getResources();
        int integer = resources.getInteger(resources.getConfiguration().orientation == 2 ? 2131427344 : 2131427358);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), integer);
        gridLayoutManager.A01 = new 8De(this, integer);
        recyclerView.A1D(gridLayoutManager);
        this.A03 = 7zR.A0c(context);
        c9mD.A06(threadKey);
        A01(this);
    }

    public static final void A00(C99g c99g, AnonymousClass912 anonymousClass912) {
        boolean z;
        C99h c99h;
        ArrayList A0s = AnonymousClass001.A0s();
        if (c99g instanceof C91X) {
            C91X c91x = (C91X) c99g;
            C11184vr c11184vr = c91x.A00;
            if (c11184vr != null) {
                A0s.add(new C1663Ap5(anonymousClass912.A03, c11184vr));
            }
            List list = c91x.A01;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((8K7) it.next()).A00 > 1) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            A0s.add(new 8HU(anonymousClass912.A02, z));
            9lK r0 = (9lK) 1Br.A0B(anonymousClass912.A0D);
            list.size();
            r0.A02(new 8He());
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                int i2 = i;
                if (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C0s8.A18();
                        throw 0Q8.createAndThrow();
                    }
                    8K7 r02 = (8K7) next;
                    final Uri uri = r02.A01;
                    final Uri uri2 = r02.A03;
                    final Uri uri3 = r02.A02;
                    if (uri3 != null) {
                        c99h = new C99h(uri3) { // from class: X.91b
                            public final Uri A00;

                            {
                                this.A00 = uri3;
                            }
                        };
                    } else if (7zQ.A1a(anonymousClass912.A0K) && uri != null) {
                        c99h = new C99h(uri) { // from class: X.91b
                            public final Uri A00;

                            {
                                this.A00 = uri;
                            }
                        };
                    } else if (uri2 != null) {
                        c99h = new C99h(uri2) { // from class: X.91c
                            public final Uri A00;

                            {
                                this.A00 = uri2;
                            }
                        };
                    } else {
                        i = i3;
                    }
                    CallerContext callerContext = 8HV.A07;
                    A0s2.add(new 8HV(r02, (9Rh) 1Br.A0B(anonymousClass912.A0A), anonymousClass912.A0Q, c99h, i2));
                    i = i3;
                } else {
                    A0s.addAll(A0s2);
                    if (c91x.A03) {
                        A0s.add(new Q63());
                    }
                }
            }
        }
        2JB.A01(new AGV(c99g, anonymousClass912, A0s));
    }

    public static final void A01(AnonymousClass912 anonymousClass912) {
        LithoView lithoView = anonymousClass912.A0G;
        1Iw r0 = anonymousClass912.A0P;
        8Sm A00 = C8nz.A00(r0);
        int B9Q = anonymousClass912.A03.B9Q();
        C8nz c8nz = A00.A01;
        c8nz.A00 = B9Q;
        A00.A2X(2131957317);
        c8nz.A04 = true;
        c8nz.A03 = new AE3(anonymousClass912);
        lithoView.A0x(A00.A2W());
        LithoView lithoView2 = anonymousClass912.A0H;
        Dzg dzg = new Dzg();
        C1rs c1rs = new C1rs(dzg, r0, 0, 0);
        ((8OB) c1rs).A01 = dzg;
        ((8OB) c1rs).A00 = r0;
        dzg.A00 = anonymousClass912.A02;
        dzg.A01 = 9eY.A00;
        c1rs.A0J();
        lithoView2.A0x(((8OB) c1rs).A01);
        C99g c99g = (C99g) anonymousClass912.A0J.A04.getValue();
        if (c99g != null) {
            A00(c99g, anonymousClass912);
        }
    }

    public static final void A02(AnonymousClass912 anonymousClass912) {
        boolean z;
        Object obj;
        2XA r0 = anonymousClass912.A07.A0F;
        11T.A0I(r0, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r0;
        int A1h = linearLayoutManager.A1h();
        int A1j = linearLayoutManager.A1j();
        if (A1h != -1) {
            07E r02 = new 07E(A1h, A1j);
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                int A06 = 7zL.A06(it);
                GWI gwi = (GWI) 1Br.A0B(anonymousClass912.A08);
                if (A06 >= 0 && A06 < gwi.getItemCount() && (obj = gwi.A00.A02.get(A06)) != null) {
                    A0s.add(obj);
                }
            }
            ArrayList<8HV> A0s2 = AnonymousClass001.A0s();
            for (Object obj2 : A0s) {
                if (obj2 instanceof 8HV) {
                    A0s2.add(obj2);
                }
            }
            for (8HV r03 : A0s2) {
                I5X i5x = (I5X) 1Br.A0B(anonymousClass912.A09);
                8K7 r04 = r03.A01;
                if (7zQ.A1a(anonymousClass912.A0K)) {
                    z = true;
                    if (r04.A01 != null) {
                        i5x.A03(r04, r03.A00, z, anonymousClass912.A02.A1N());
                    }
                }
                z = false;
                i5x.A03(r04, r03.A00, z, anonymousClass912.A02.A1N());
            }
        }
    }

    public final void A03(boolean z) {
        if (z) {
            C9ba c9ba = (C9ba) 1Br.A0B(this.A0C);
            Integer num = 0S2.A0N;
            c9ba.A01(false, num);
            C00i c00i = this.A09.A00;
            ((I5X) c00i.get()).A05(this.A02.A1N());
            if (!this.A06) {
                ((9lK) 1Br.A0B(this.A0D)).A03(0S2.A00, num, ((I5X) c00i.get()).A01(), false);
            }
            A02(this);
            this.A06 = true;
            this.A0J.A05();
        } else if (this.A05) {
            ((C9ba) 1Br.A0B(this.A0C)).A00();
            ((9lK) 1Br.A0B(this.A0D)).A01(8Hd.A00);
            ((I5X) 1Br.A0B(this.A09)).A04(this.A02.A1N());
        }
        this.A05 = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1170736331);
        super.onAttachedToWindow();
        this.A07.A1F(this.A0O);
        C9mD c9mD = this.A0J;
        c9mD.A04.observeForever(this.A0N);
        c9mD.A05.observeForever(this.A0M);
        0FI.A0C(1194135860, A06);
    }

    public final void onDestroy() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.A01;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.A0J.A04();
        ((C9ba) 1Br.A0B(this.A0C)).A00();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(200676928);
        super.onDetachedFromWindow();
        this.A07.A1G(this.A0O);
        C9mD c9mD = this.A0J;
        c9mD.A04.removeObserver(this.A0N);
        c9mD.A05.removeObserver(this.A0M);
        0FI.A0C(-1875865269, A06);
    }
}
