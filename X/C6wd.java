package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.stickers.model.Sticker;
import java.util.List;

/* renamed from: X.6wd, reason: invalid class name */
/* loaded from: 6wd.class */
public final class C6wd {
    public 6wB A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final C6wh A0D;
    public final C6wh A0E;
    public final boolean A0F;
    public final 1De A0G;
    public final C6ri A0H;
    public final C6qq A0I;

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, X.6wg] */
    public C6wd(1De r302, final C6ri c6ri, C6qq c6qq, boolean z) {
        this.A0G = r302;
        this.A0F = z;
        this.A0H = c6ri;
        this.A0I = c6qq;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 67800);
        this.A07 = 1Bu.A03(r0, 82018);
        this.A05 = 1Bu.A03(r0, 82019);
        this.A04 = 1Bu.A03(r0, 82654);
        this.A0A = 1Bu.A03(r0, 68002);
        this.A09 = 1Bu.A03(r0, 68001);
        this.A0B = 1Bu.A03(r0, 68003);
        this.A06 = 1Bq.A00(68416);
        this.A08 = 1Bu.A03(r0, 49718);
        this.A01 = 1Bu.A03(r0, 66795);
        this.A0C = 1Bu.A03(r0, 50201);
        this.A02 = 1Bu.A03(r0, 487);
        this.A0E = new C6wh(new Object(), C6we.A0A, 2131966329);
        this.A0D = new C6wh(new C6wg(c6ri) { // from class: X.6wi
            public final C6ri A00;

            {
                this.A00 = c6ri;
            }

            @Override // X.C6wg
            public void C6f(Context context, View view, 06Z r304, Sticker sticker, 6tM r306) {
                boolean A1W = 1BL.A1W(sticker, context);
                C6ri c6ri2 = this.A00;
                if (c6ri2 != null) {
                    c6ri2.A00(new 7C5(sticker));
                }
                Hpb hpb = (Hpb) 1Bn.A0E(context, (1BY) null, 116047);
                A3F a3f = new A3F(sticker, this);
                Bundle A05 = 1BK.A05();
                A05.putParcelable("removeRecentSticker", sticker);
                1IB A00 = 1Ho.A00(4YU.A0L(hpb.A02).newInstance_DEPRECATED(1BJ.A00(542), A05), A1W);
                8HJ r02 = new 8HJ(hpb, a3f, 3);
                hpb.A00 = new 2eS(r02, A00);
                1Kd.A0D(hpb.A04, r02, A00);
            }
        }, C6we.A07, 2131966327);
    }

    public static final C6wh A00(C6wd c6wd, 96D r302) {
        return new C6wh(new LZB((CHs) 1Br.A0B(c6wd.A04), c6wd.A0H, (Hs7) 1Br.A0B(c6wd.A05), r302), C6we.A06, 2131966326);
    }

    public static final C6wh A01(C6wd c6wd, 96D r302) {
        return new C6wh(new LZC((CHs) 1Br.A0B(c6wd.A04), c6wd.A0H, (Hs7) 1Br.A0B(c6wd.A05), r302), C6we.A08, 2131966328);
    }

    public void A02(Context context, View view, Fragment fragment, 06Z r305, Sticker sticker, 6tM r307, 96D r308) {
        List A0A;
        11T.A0F(context, 0);
        1BL.A1H(sticker, view, r307);
        11T.A0F(r308, 4);
        if (fragment == null) {
            fragment = (r305 == null || (A0A = r305.A0T.A0A()) == null) ? null : (Fragment) 0QD.A0J(A0A, 0);
        }
        if (!AnonymousClass842.A00((AnonymousClass842) 1Br.A0B(this.A06)).AZk(36320953582829420L) || r308 == 96D.A04 || fragment == null) {
            return;
        }
        C6qq c6qq = this.A0I;
        if (c6qq == null) {
            c6qq = ((82O) 1Br.A0B(this.A02)).A0a(context.getResources().getDimensionPixelSize(2132279429));
        }
        6wB B4P = c6qq.B4P(sticker, 1BK.A1V(r308, 96D.A07));
        this.A00 = B4P;
        if (B4P != null) {
            B4P.Cwj(150);
            B4P.Co9(48);
            B4P.CmA(r307.A00(0S2.A0N));
        }
        6wB r0 = this.A00;
        if (r0 != null) {
            r0.Cwh(0.0f);
            r0.AQa(context, sticker);
        }
        final View rootView = view.getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(r307.A00(0S2.A07));
        colorDrawable.setBounds(0, 0, rootView.getWidth(), rootView.getHeight());
        rootView.getOverlay().add(colorDrawable);
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: X.9qe
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                6wB r02 = this.A00;
                if (r02 != null) {
                    r02.AQW();
                }
                rootView.getOverlay().clear();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(1:52)(3:7|(2:8|(2:10|(1:12)(1:49))(2:50|51))|13))(2:54|(13:56|(1:58)|16|(1:18)|19|20|21|22|23|24|25|26|(8:28|(1:30)|31|(1:33)|34|(1:36)|37|(2:39|40)(2:42|43))(1:44)))|14|(1:48)|16|(0)|19|20|21|22|23|24|25|26|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011a, code lost:
    
        r320 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
    
        X.0fH.A0H(X.5Qz.class, "could not fetch recent stickers", r320);
        r321 = X.1BK.A0d();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(android.content.Context r302, android.view.View r303, androidx.fragment.app.Fragment r304, X.06Z r305, com.facebook.stickers.model.Sticker r306, X.6tM r307, X.96D r308, java.util.EnumMap r309, X.C00m r310) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6wd.A03(android.content.Context, android.view.View, androidx.fragment.app.Fragment, X.06Z, com.facebook.stickers.model.Sticker, X.6tM, X.96D, java.util.EnumMap, X.00m):void");
    }
}
