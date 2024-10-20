package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.resources.ui.FbTextView;
import java.util.List;

/* loaded from: Juq.class */
public final class Juq extends Ezy {
    public Context A01;
    public View A02;
    public ViewGroup A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public ViewPager A06;
    public LithoView A07;
    public LithoView A08;
    public ReboundHorizontalScrollView A09;
    public FbTextView A0A;
    public Drawable A0B;
    public Drawable A0C;
    public Drawable A0D;
    public 06Z A0E;
    public 1BY A0F;
    public RQD A0G;
    public P2pPaymentConfig A0H;
    public int A00 = 0;
    public final C00i A0O = 1BV.A01((1BY) null, 99559);
    public final C00i A0J = 1BV.A01((1BY) null, 16979);
    public final C00i A0P = 1BV.A01((1BY) null, 67860);
    public final CallerContext A0N = CallerContext.A0B("ThemeExtension");
    public final Handler A0I = new Handler(Looper.getMainLooper(), new LG3(this, 2));
    public final HFq A0Q = new JuI(this);
    public final View.OnClickListener A0M = LKO.A00(this, 78);
    public final RGq A0L = new RGq(new RGo(this));
    public final KfV A0K = new KfV(new RGp(this));

    static {
        "GIFT_WRAP_BOTTOM_SHEET_SEEN_PREF_KEY".getClass();
    }

    public Juq(1BO r302) {
        this.A0F = 7zL.A0Q(r302);
    }

    @Override // X.Ezy
    public Integer A0B() {
        return 0S2.A0N;
    }

    @Override // X.Ezy
    public View A0D(Context context, ViewGroup viewGroup) {
        return this.A05;
    }

    /* JADX WARN: Type inference failed for: r0v94, types: [android.view.View, com.facebook.resources.ui.FbTextView] */
    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        super.A00 = true;
        this.A01 = context;
        this.A0G = rqd;
        this.A0E = r304.mFragmentManager;
        this.A05 = (LinearLayout) LayoutInflater.from(context).inflate(2132543004, (ViewGroup) null, false);
        View view = r304.mView;
        if (view != null) {
            this.A04 = (LinearLayout) view.findViewById(2131366377);
        }
        LinearLayout linearLayout = this.A05;
        if (linearLayout != null) {
            linearLayout.getViewTreeObserver().addOnPreDrawListener(new LKn(this, 1));
        }
        this.A06 = (ViewPager) this.A05.findViewById(2131367994);
        this.A02 = this.A05.requireViewById(2131368170);
        ReboundHorizontalScrollView reboundHorizontalScrollView = (ReboundHorizontalScrollView) this.A05.requireViewById(2131367993);
        this.A09 = reboundHorizontalScrollView;
        HFq hFq = this.A0Q;
        List list = reboundHorizontalScrollView.A0K;
        if (!list.contains(hFq)) {
            list.add(hFq);
        }
        LinearLayout linearLayout2 = this.A05;
        if (linearLayout2 != null) {
            this.A03 = (ViewGroup) linearLayout2.findViewById(2131367989);
            this.A08 = (LithoView) this.A05.findViewById(2131367990);
            this.A07 = new LithoView(this.A01);
            ?? r0 = (FbTextView) this.A05.findViewById(2131367988);
            this.A0A = r0;
            if (r0 != 0) {
                C00i c00i = this.A0J;
                AbH.A1K((View) r0, ((MigColorScheme) c00i.get()).AZL());
                this.A0A.setTextColor(((MigColorScheme) c00i.get()).BKh());
                this.A0A.setVisibility(8);
            }
        }
        this.A0C = this.A01.getDrawable(2132411567);
        this.A0D = this.A01.getDrawable(2132411568);
        this.A0B = this.A01.getDrawable(2132411435);
        this.A09.setVisibility(0);
        this.A02.setVisibility(0);
        this.A09.A07 = true;
        ViewPager viewPager = this.A06;
        if (viewPager != null) {
            viewPager.getViewTreeObserver().addOnGlobalLayoutListener(new LKj(this, 6));
        }
        this.A0H = p2pPaymentConfig;
    }
}
