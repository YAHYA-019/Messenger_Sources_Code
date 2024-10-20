package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbui.widget.pagerindicator.TabbedViewPagerIndicator;
import com.facebook.fbui.widget.slidingviewgroup.SlidingViewGroup;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.util.colors.MontageBackgroundColor;
import com.facebook.widget.text.BetterEditTextView;

/* loaded from: I8Y.class */
public final class I8Y {
    public static final MFG A0P;
    public static final MFG A0Q;
    public static final float[] A0R;
    public int A00;
    public int A01;
    public 2EU A02;
    public 2EU A03;
    public Hm0 A04;
    public HRa A05;
    public final int A06;
    public final ViewGroup A07;
    public final LinearLayout A08;
    public final RecyclerView A09;
    public final ViewPager A0A;
    public final TabbedViewPagerIndicator A0B;
    public final SlidingViewGroup A0C;
    public final C2592Gib A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final HTB A0H;
    public final GY6 A0I;
    public final MontageBackgroundColor A0J;
    public final BetterEditTextView A0K;
    public final Runnable A0L;
    public final int A0M;
    public final AbR A0N;
    public final 1BP A0O;

    static {
        MFG mfg = EZn.A00;
        11T.A0A(mfg);
        A0Q = mfg;
        FeI feI = FeI.A00;
        11T.A0A(feI);
        A0P = feI;
        A0R = new float[]{30.0f, 30.0f, 30.0f, 30.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.HTB] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.facebook.widget.text.BetterEditTextView, android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v66, types: [com.facebook.messaging.montage.util.colors.MontageBackgroundColor, java.lang.Object] */
    public I8Y(ViewGroup viewGroup, FbUserSession fbUserSession, SlidingViewGroup slidingViewGroup, C6r6 c6r6) {
        7zP.A1L(slidingViewGroup, 2, c6r6);
        11T.A0F(fbUserSession, 7);
        this.A0O = FbInjector.A00;
        AbR abR = (AbR) 7zN.A0k(FbInjector.A03, 493);
        this.A0N = abR;
        this.A0F = 1Bq.A00(65630);
        this.A0G = 1Bu.A00(115930);
        this.A0E = 1Bq.A00(84243);
        this.A0H = new Object();
        this.A07 = viewGroup;
        this.A0C = slidingViewGroup;
        ?? r0 = (BetterEditTextView) 7zM.A0H(slidingViewGroup, 2131367163);
        this.A0K = r0;
        slidingViewGroup.A03();
        slidingViewGroup.A07(new MFG[]{A0Q, A0P}, true);
        slidingViewGroup.A04 = new C2534Ggi(this, 2);
        this.A0L = new Iqd(this);
        slidingViewGroup.A05 = new FeJ(this, 2);
        Context context = viewGroup.getContext();
        this.A0D = new C2592Gib(20, 4.0f, context.getColor(2132213864));
        this.A0M = GOn.A0D().getDimensionPixelSize(2132279376);
        A00(this);
        viewGroup.addView(slidingViewGroup);
        this.A08 = (LinearLayout) 7zM.A0H(slidingViewGroup, 2131363331);
        int color = context.getColor(2132213863);
        this.A06 = color;
        ?? obj = new Object();
        obj.A01 = new int[]{color, color};
        this.A0J = obj;
        ViewPager viewPager = (ViewPager) 7zM.A0H(slidingViewGroup, 2131366271);
        this.A0A = viewPager;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            GY6 gy6 = new GY6(fbUserSession, AbG.A0H(abR), c6r6);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0I = gy6;
            gy6.A02 = new HT8(this);
            gy6.A03 = new HT9(this);
            viewPager.A0R(gy6);
            TabbedViewPagerIndicator tabbedViewPagerIndicator = (TabbedViewPagerIndicator) 7zM.A0H(slidingViewGroup, 2131366272);
            this.A0B = tabbedViewPagerIndicator;
            0PY fzm = new FZM(this, 0);
            ViewPager viewPager2 = tabbedViewPagerIndicator.A03;
            if (viewPager2 != null) {
                viewPager2.A0S(fzm);
            }
            tabbedViewPagerIndicator.A0A.add(fzm);
            tabbedViewPagerIndicator.A07(viewPager);
            tabbedViewPagerIndicator.A06(0);
            tabbedViewPagerIndicator.A05();
            int i = gy6.A00;
            viewPager.A0K(1 - ((i <= 1 || !11T.A0O(String.valueOf(gy6.A0M[0]), GOn.A0D().getString(2131960583))) ? 0S2.A01 : 0S2.A0C).intValue() != 0 ? 1 : 0);
            tabbedViewPagerIndicator.setVisibility(i > 1 ? 0 : 8);
            RecyclerView recyclerView = (RecyclerView) 7zM.A0H(slidingViewGroup, 2131367185);
            this.A09 = recyclerView;
            recyclerView.A16((2Xd) 1Br.A0B(this.A0G));
            Drawable background = r0.getBackground();
            Drawable mutate = background.mutate();
            int color2 = context.getColor(2132213766);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            mutate.setColorFilter(color2, mode);
            r0.setBackground(background);
            Drawable[] compoundDrawables = r0.getCompoundDrawables();
            11T.A0A(compoundDrawables);
            compoundDrawables[0].mutate().setColorFilter(context.getColor(2132213766), mode);
            r0.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            IJ7.A00((TextView) r0, this, 0);
            ((GWQ) 1Br.A0B(this.A0G)).A00 = new HTA(this);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.A07.getContext(), 6);
            RecyclerView recyclerView2 = this.A09;
            recyclerView2.A1D(gridLayoutManager);
            gridLayoutManager.A01 = new GW4(this, 3);
            AbstractC2327GOs.A0b(GOn.A0D(), recyclerView2, 2132279320, 2132279320);
            recyclerView2.A1F(new GXC(this, 2));
            ((C8F) 1Br.A0B(this.A0E)).A01(fbUserSession);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static final void A00(I8Y i8y) {
        ViewGroup viewGroup = i8y.A07;
        int height = viewGroup.getHeight() - i8y.A0M;
        int min = Math.min(viewGroup.getHeight(), viewGroup.getWidth());
        if (height == i8y.A00 && min == i8y.A01) {
            return;
        }
        i8y.A00 = height;
        i8y.A01 = min;
        SlidingViewGroup slidingViewGroup = i8y.A0C;
        ViewGroup.LayoutParams A0C = GOp.A0C(slidingViewGroup);
        A0C.width = i8y.A01;
        A0C.height = i8y.A00;
        slidingViewGroup.setLayoutParams(A0C);
    }

    public final void A01() {
        this.A0C.A05(A0Q);
    }
}
