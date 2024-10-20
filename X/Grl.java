package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.tabbedpager.TabbedPageIndicator;
import com.facebook.messaging.tabbedpager.TabbedPager;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.ui.emoji.model.EmojiSet;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Grl.class */
public final class Grl extends TabbedPager implements CallerContextable {
    public static final String __redex_internal_original_name = "EmojiKeyboardView";
    public int A00;
    public 1PA A01;
    public 1Mc A02;
    public 2S2 A03;
    public Hh5 A04;
    public AbR A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public IaE A09;
    public IKc A0A;
    public I28 A0B;
    public HiF A0C;
    public MigColorScheme A0D;
    public C22a A0E;
    public boolean A0F;

    public static void A00(Grl grl) {
        IllegalStateException th;
        C00j.A05("loadAndSetEmojisForBackside", 861609488);
        try {
            ((TabbedPager) grl).A0F = true;
            if (grl.A0G) {
                ((TabbedPager) grl).A0C.A0S(new ILa(grl));
            } else {
                TabbedPageIndicator tabbedPageIndicator = ((TabbedPager) grl).A0A;
                DTT dtt = ((TabbedPager) grl).A0C;
                DTT dtt2 = tabbedPageIndicator.A08;
                if (dtt2 != dtt) {
                    if (dtt2 != null) {
                        dtt2.A0U(null);
                    }
                    if (dtt.A0H() == null) {
                        th = AnonymousClass001.A0N("ViewPager does not have adapter instance.");
                        throw th;
                    }
                    tabbedPageIndicator.A08 = dtt;
                    dtt.A0U(tabbedPageIndicator);
                    tabbedPageIndicator.invalidate();
                }
                TabbedPageIndicator tabbedPageIndicator2 = ((TabbedPager) grl).A0A;
                RecyclerView recyclerView = ((TabbedPager) grl).A05;
                tabbedPageIndicator2.A06 = recyclerView;
                tabbedPageIndicator2.A07 = new ILa(grl);
                recyclerView.A1H(new GXC(grl, 4));
            }
            boolean stringIsNullOrEmpty = Platform.stringIsNullOrEmpty(((TabbedPager) grl).A0D);
            TextView textView = ((TabbedPager) grl).A03;
            if (stringIsNullOrEmpty) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                ((TabbedPager) grl).A03.setText(((TabbedPager) grl).A0D);
            }
            AbR abR = grl.A05;
            Hh5 hh5 = grl.A04;
            Context A01 = FbInjector.A01();
            AbL.A0y(abR);
            try {
                IaE iaE = new IaE(hh5, abR);
                1Bn.A0K();
                FbInjector.A04(A01);
                grl.A09 = iaE;
                iaE.A00(grl.A0D);
                IaE iaE2 = grl.A09;
                iaE2.A00 = new Hr8(grl);
                ((TabbedPager) grl).A08 = iaE2;
                GY7 gy7 = ((TabbedPager) grl).A0B;
                gy7.A00 = iaE2;
                gy7.A09();
                GWV gwv = new GWV();
                ((TabbedPager) grl).A09 = gwv;
                gwv.A00 = iaE2;
                gwv.A07();
                java.util.Map map = gwv.A04;
                map.clear();
                1Du it = gwv.A02.iterator();
                int i = 0;
                while (it.hasNext()) {
                    1BK.A1P(it.next(), map, i);
                    i++;
                }
                2Xd r0 = ((TabbedPager) grl).A09;
                ((GWV) r0).A01 = new HWH(grl);
                ((TabbedPager) grl).A05.A16(r0);
                GY7 gy72 = ((TabbedPager) grl).A0B;
                if (gy72 != null) {
                    int size = gy72.A01.size();
                    TextView textView2 = ((TabbedPager) grl).A03;
                    int i2 = 0;
                    if (size > 0) {
                        i2 = 8;
                    }
                    textView2.setVisibility(i2);
                }
                int A012 = ((C3R7) grl.A08.get()).A01();
                grl.A00 = A012;
                List AJh = grl.A0E.AJh(A012);
                if (!AJh.isEmpty()) {
                    AJh.get(0);
                }
                ((TabbedPager) grl).A0B.A0I(AJh);
                GWV gwv2 = ((TabbedPager) grl).A09;
                gwv2.A02 = ImmutableList.copyOf((Collection) AJh);
                gwv2.A07();
                java.util.Map map2 = gwv2.A04;
                map2.clear();
                1Du it2 = gwv2.A02.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    1BK.A1P(it2.next(), map2, i3);
                    i3++;
                }
                GY7 gy73 = ((TabbedPager) grl).A0B;
                if (gy73 != null) {
                    int size2 = gy73.A01.size();
                    TextView textView3 = ((TabbedPager) grl).A03;
                    int i4 = 0;
                    if (size2 > 0) {
                        i4 = 8;
                    }
                    textView3.setVisibility(i4);
                }
                C00j.A01(-1623964948);
            } catch (Throwable th2) {
                th = th2;
                1Bn.A0K();
                FbInjector.A04(A01);
            }
        } catch (Throwable th3) {
            C00j.A01(2092321646);
            throw th3;
        }
    }

    public static void A01(Grl grl) {
        HiF hiF = grl.A0C;
        if (hiF != null) {
            ((2Pl) 1Br.A0B(hiF.A01)).A00("Back space key", 0S2.A15);
            6Qe r0 = hiF.A05;
            ((OneLineComposerView) r0.A00.A0A).A0Z.A0R.A02.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    public static void A02(Grl grl, Emoji emoji) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("emoji", emoji);
        1Ho.A00(((BlueServiceOperationFactory) grl.A06.get()).newInstance_DEPRECATED(4YT.A00(78), A05, 1, CallerContext.A06(Grl.class)), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1199245847);
        super.onAttachedToWindow();
        this.A01.A00();
        0FI.A0C(-71836131, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(994675533);
        IaE iaE = this.A09;
        if (iaE != null && !1JF.A0B(iaE.A03)) {
            1Ql A0V = 1BL.A0V(this.A07);
            A0V.CaL(HOO.A05, this.A09.A03);
            A0V.commit();
        }
        this.A01.A01();
        super.onDetachedFromWindow();
        0FI.A0C(1139330429, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        GWd gWd;
        C2135Deo c2135Deo;
        IaE iaE = this.A09;
        if (iaE != null) {
            Set set = iaE.A0A;
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C2135Deo c2135Deo2 = ((GWd) it.next()).A02;
                    if (c2135Deo2 != null && ((FIU) c2135Deo2).A0Z) {
                        return true;
                    }
                }
            }
            H4z h4z = iaE.A01;
            if (h4z != null && (gWd = h4z.A05) != null && (c2135Deo = gWd.A02) != null && ((FIU) c2135Deo).A0Z) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        H4z h4z;
        H4z h4z2;
        IaE iaE;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A04 != null && (iaE = this.A09) != null && iaE.A03 == null) {
            FbSharedPreferences A0R = 1BK.A0R(this.A07);
            1G2 r0 = HOO.A05;
            if (A0R.BNM(r0)) {
                A0E(1BK.A0R(this.A07).BD0(r0));
            }
        }
        IaE iaE2 = this.A09;
        if (iaE2 != null && z && iaE2.A04 && (h4z2 = iaE2.A01) != null && h4z2.A05 != null) {
            H4z.A00(h4z2, h4z2.A08.A00);
        }
        if (this.A0F && (h4z = this.A09.A01) != null && h4z.A0A) {
            ImmutableList immutableList = h4z.A08.A00;
            if (immutableList != null && immutableList.isEmpty()) {
                int A01 = ((C3R7) this.A08.get()).A01();
                this.A00 = A01;
                List AJh = this.A0E.AJh(A01);
                if (!AJh.isEmpty()) {
                    AJh.get(0);
                }
                A0E(String.valueOf(((EmojiSet) AJh.get(1)).A01));
            }
            this.A0F = false;
        }
    }

    @Override // com.facebook.messaging.tabbedpager.TabbedPager, com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > 0 && size2 > 0) {
            boolean z = !AnonymousClass001.A1T(this.A04);
            Resources resources = getResources();
            this.A04 = 7kT.A00(resources, new C2488Gej(), size, size2 - resources.getDimensionPixelSize(2132279437));
            if (z && !super.A0F) {
                A00(this);
                this.A0F = true;
            }
        }
        super.onMeasure(i, i2);
    }
}
