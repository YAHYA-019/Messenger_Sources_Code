package com.facebook.messaging.montage.composer.doodle;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bu;
import X.7zN;
import X.AbR;
import X.AnonymousClass001;
import X.C09s;
import X.DLP;
import X.GOn;
import X.GOp;
import X.GOq;
import X.GY3;
import X.GoE;
import X.HTV;
import X.HUZ;
import X.Ih3;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.viewpager.widget.ViewPager;
import com.facebook.widget.CustomFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: TextColorLayout.class */
public final class TextColorLayout extends CustomFrameLayout {
    public static final List A09;
    public int A00;
    public int A01;
    public ViewPager A02;
    public GY3 A03;
    public GoE A04;
    public GoE A05;
    public HUZ A06;
    public DLP A07;
    public AbR A08;

    static {
        ImmutableList of = ImmutableList.of(GOp.A0B(7zN.A0h(), 2131954304), GOp.A0B(-16777216, 2131954275), GOp.A0B(-16743169, 2131954273), GOp.A0B(-15076914, 2131954302), GOp.A0B(-256, 2131954305), GOp.A0B(-969435, 2131954298), GOp.A0B(-37802, 2131954299), GOp.A0B(-48762, 2131954277), GOp.A0B(-8963329, 2131954303), GOp.A0B(-15590232, 2131954278), GOp.A0B(-12856833, 2131954301), GOp.A0B(-4456704, 2131965997), GOp.A0B(-10824391, 2131954290), GOp.A0B(-25823, 2131954293), GOp.A0B(-26990, 2131954295), GOp.A0B(-5108150, 2131954297), GOp.A0B(-9395969, 2131954276), GOp.A0B(-4143, 2131954274), GOp.A0B(-15719, 2131954294), GOp.A0B(-7394296, 2131954292), GOp.A0B(-12247552, 2131954279), GOp.A0B(-1644826, 2131954291), GOp.A0B(-3355444, 2131954300), GOp.A0B(-5000269, 2131954289), GOp.A0B(-6710887, 2131954282), GOp.A0B(-10066330, 2131954281), GOp.A0B(-13421773, 2131954280), GOp.A0B(-15132391, 2131954272));
        11T.A0A(of);
        A09 = of;
    }

    public TextColorLayout(Context context) {
        super(context);
        A00();
    }

    public TextColorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public TextColorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private final void A00() {
        this.A08 = (AbR) 1Bu.A00(473).get();
        A0U(2132541715);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Pair pair : A09) {
            A0s.add(GOn.A0G(pair.first, 1BK.A0u(getContext(), GOq.A05(pair))));
        }
        GY3 gy3 = new GY3(A0s);
        this.A03 = gy3;
        gy3.A00 = new HTV(this);
        gy3.A0I(0);
        ViewPager viewPager = (ViewPager) C09s.A01(this, 2131363102);
        this.A02 = viewPager;
        AbR abR = this.A08;
        if (abR != null) {
            GoE A0f = abR.A0f(viewPager);
            this.A04 = A0f;
            A0f.A00 = false;
            ViewPager viewPager2 = this.A02;
            if (viewPager2 != null) {
                viewPager2.A0R(this.A03);
            }
            TabLayout tabLayout = (TabLayout) C09s.A01(this, 2131367836);
            TabLayout.A03(this.A02, tabLayout, false);
            AbR abR2 = this.A08;
            if (abR2 != null) {
                GoE A0f2 = abR2.A0f(tabLayout);
                this.A05 = A0f2;
                A0f2.A00 = false;
                DLP dlp = new DLP(this);
                this.A07 = dlp;
                dlp.A02(new Ih3(this));
                GoE goE = this.A04;
                if (goE != null) {
                    goE.A01();
                }
                GoE goE2 = this.A05;
                if (goE2 != null) {
                    goE2.A01();
                    return;
                }
                return;
            }
        }
        11T.A0L("animatorProvider");
        throw 0Q8.createAndThrow();
    }
}
