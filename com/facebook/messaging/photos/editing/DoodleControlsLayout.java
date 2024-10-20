package com.facebook.messaging.photos.editing;

import X.0S2;
import X.11T;
import X.1BK;
import X.1Bn;
import X.2KY;
import X.4YU;
import X.7zM;
import X.7zN;
import X.AbF;
import X.AbG;
import X.AbR;
import X.AnonymousClass001;
import X.C09s;
import X.C0A8;
import X.C22a;
import X.C2rp;
import X.DKC;
import X.DKE;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.GY4;
import X.GY5;
import X.GoE;
import X.HIA;
import X.HIE;
import X.HUN;
import X.HmS;
import X.HmT;
import X.Hz8;
import X.IA8;
import X.IJp;
import X.IWJ;
import X.Rqe;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.widget.CustomFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: DoodleControlsLayout.class */
public class DoodleControlsLayout extends CustomFrameLayout {
    public static final List A0G;
    public static final List A0H;
    public static final Map A0I;
    public static final Map A0J;
    public int A00;
    public ViewPager A01;
    public ViewPager A02;
    public GY5 A03;
    public GoE A04;
    public GoE A05;
    public GoE A06;
    public GoE A07;
    public HmT A08;
    public C22a A09;
    public TabLayout A0A;
    public Integer A0B;
    public AbR A0C;
    public HIA A0D;
    public GY4 A0E;
    public HIE A0F;

    static {
        Pair A0B = GOp.A0B(7zN.A0h(), 2131954304);
        Pair A0B2 = GOp.A0B(-16777216, 2131954275);
        Pair A0B3 = GOp.A0B(-16743169, 2131954273);
        Pair A0B4 = GOp.A0B(-15076914, 2131954302);
        Pair A0B5 = GOp.A0B(-256, 2131954305);
        Pair A0B6 = GOp.A0B(-969435, 2131954298);
        Pair A0B7 = GOp.A0B(-37802, 2131954299);
        Pair A0B8 = GOp.A0B(-48762, 2131954277);
        Pair A0B9 = GOp.A0B(-8963329, 2131954303);
        Pair A0B10 = GOp.A0B(-15590232, 2131954278);
        Pair A0B11 = GOp.A0B(-12856833, 2131954301);
        Pair A0B12 = GOp.A0B(-4456704, 2131965997);
        Pair A0B13 = GOp.A0B(-10824391, 2131954290);
        Integer A0k = 4YU.A0k();
        Pair A0B14 = GOp.A0B(-25823, 2131954293);
        Integer A0i = 7zN.A0i();
        A0G = ImmutableList.of(A0B, A0B2, A0B3, A0B4, A0B5, A0B6, A0B7, A0B8, A0B9, A0B10, A0B11, A0B12, A0B13, A0B14, GOp.A0B(-26990, 2131954295), GOp.A0B(-5108150, 2131954297), GOp.A0B(-9395969, 2131954276), GOp.A0B(-4143, 2131954274), GOp.A0B(-15719, 2131954294), GOp.A0B(-7394296, 2131954292), GOp.A0B(-12247552, 2131954279), GOp.A0B(-1644826, 2131954291), GOp.A0B(-3355444, 2131954300), GOp.A0B(-5000269, 2131954289), GOp.A0B(-6710887, 2131954282), GOp.A0B(-10066330, 2131954281), GOp.A0B(-13421773, 2131954280), GOp.A0B(-15132391, 2131954272));
        A0H = ImmutableList.of(128515, 10084, 128175, 9889, 128166, 128293, 128064, 128076, 127752, 128169, 10024, 128139, 127800, 128591, 127880, 127853, 128123, 128148, 128526, 128588, 128525, 128564, 128561, 128545, 128514, 128540, 128530, 128546);
        A0I = ImmutableMap.of((Object) A0k, (Object) Float.valueOf(6.0f), (Object) A0i, (Object) Float.valueOf(12.0f), (Object) 2, (Object) Float.valueOf(18.0f), (Object) AbG.A11(), (Object) Float.valueOf(28.0f));
        A0J = ImmutableMap.of((Object) A0k, (Object) Float.valueOf(24.0f), (Object) A0i, (Object) Float.valueOf(36.0f), (Object) 2, (Object) Float.valueOf(60.0f));
    }

    public DoodleControlsLayout(Context context) {
        super(context);
        A00();
    }

    public DoodleControlsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public DoodleControlsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        ImmutableList.Builder builder;
        Hz8 hz8;
        this.A0C = DKC.A0U(473);
        this.A0D = (HIA) 1Bn.A0A(115975);
        this.A0F = (HIE) 1Bn.A0A(115976);
        1Bn.A0A(115977);
        Context context = getContext();
        this.A0E = new GY4(context);
        this.A09 = GOp.A0y();
        A0U(2132542457);
        GY5 gy5 = new GY5(context);
        this.A03 = gy5;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Pair pair : A0G) {
            A0s.add(GOn.A0G(pair.first, context.getString(GOo.A02(pair))));
        }
        if (2 >= A0s.size() || 20 >= A0s.size()) {
            builder = ImmutableList.builder();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                IA8 ia8 = new IA8();
                IA8.A01(ia8, gy5.A04);
                ia8.A00 = GOq.A06(pair2);
                IA8.A00(ia8);
                ia8.A02 = (String) pair2.second;
                builder.m11011add((Object) ia8);
            }
        } else {
            LinkedList A1F = AbF.A1F();
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                Pair pair3 = (Pair) it2.next();
                IA8 ia82 = new IA8();
                IA8.A01(ia82, gy5.A04);
                ia82.A00 = GOq.A06(pair3);
                IA8.A00(ia82);
                ia82.A02 = (String) pair3.second;
                ia82.A01 = 1;
                IA8.A00(ia82);
                A1F.add(ia82);
            }
            IA8 ia83 = new IA8();
            IA8.A01(ia83, gy5.A04);
            ia83.A04 = true;
            IA8.A00(ia83);
            ia83.A01 = 1;
            IA8.A00(ia83);
            ia83.A02 = gy5.A03.getString(2131954296);
            A1F.remove(20);
            A1F.add(2, ia83);
            builder = ImmutableList.builder();
            builder.addAll(A1F);
        }
        gy5.A01 = builder.build();
        gy5.A0I();
        this.A03.A00 = new HmS(this);
        ViewPager viewPager = (ViewPager) C09s.A01(this, 2131363102);
        this.A01 = viewPager;
        viewPager.A0R(this.A03);
        GoE A0f = this.A0C.A0f(this.A01);
        this.A04 = A0f;
        A0f.A00 = false;
        TabLayout tabLayout = (TabLayout) C09s.A01(this, 2131367836);
        this.A0A = tabLayout;
        GoE A0f2 = this.A0C.A0f(tabLayout);
        this.A06 = A0f2;
        A0f2.A00 = false;
        View A01 = C09s.A01(this, 2131368247);
        A01.setOnClickListener(new IJp(this));
        this.A07 = this.A0C.A0f(A01);
        C2rp.A01(A01);
        GY4 gy4 = this.A0E;
        LinkedList<Emoji> A1F2 = AbF.A1F();
        Iterator it3 = A0H.iterator();
        while (it3.hasNext()) {
            A1F2.add(2KY.A02(this.A09, Emoji.A03(DKE.A0F(it3), 0)));
        }
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (Emoji emoji : A1F2) {
            Hz8 hz82 = new Hz8();
            IWJ iwj = gy4.A04;
            11T.A0F(iwj, 0);
            hz82.A04.add(iwj);
            hz82.A01 = emoji;
            Hz8.A00(hz82);
            builder2.m11011add((Object) hz82);
        }
        ImmutableList build = builder2.build();
        gy4.A01 = build;
        if (build != null && (hz8 = (Hz8) build.get(0)) != null) {
            hz8.A03 = true;
            Hz8.A00(hz8);
        }
        this.A0E.A00 = new HUN(this);
        ViewPager viewPager2 = (ViewPager) C09s.A01(this, 2131363859);
        this.A02 = viewPager2;
        viewPager2.A0R(this.A0E);
        GoE A0f3 = this.A0C.A0f(this.A02);
        this.A05 = A0f3;
        A0f3.A00 = false;
        TabLayout.A03(this.A01, this.A0A, false);
        this.A0B = 0S2.A00;
        this.A00 = GOn.A07(getResources(), 2132279313);
    }

    public void A0V() {
        GoE goE;
        this.A06.A00();
        int intValue = this.A0B.intValue();
        if (intValue == 0 || intValue == 3) {
            goE = this.A04;
        } else {
            if (intValue != 1) {
                return;
            }
            goE = this.A05;
            if (goE == null) {
                return;
            }
        }
        goE.A00();
    }

    public void A0W() {
        GoE goE;
        this.A06.A01();
        int intValue = this.A0B.intValue();
        if (intValue == 0 || intValue == 3) {
            goE = this.A04;
        } else {
            if (intValue != 1) {
                return;
            }
            goE = this.A05;
            if (goE == null) {
                return;
            }
        }
        goE.A01();
    }

    public void A0X(Integer num) {
        TabLayout tabLayout;
        ViewPager viewPager;
        Hz8 hz8;
        GoE goE;
        if (this.A0B != num) {
            this.A0B = num;
            if (num != 0S2.A00 && num != 0S2.A0N) {
                this.A04.A00();
                this.A06.A00();
            }
            if (this.A0B != 0S2.A01 && (goE = this.A05) != null) {
                goE.A00();
            }
            int intValue = num.intValue();
            if (intValue == 0 || intValue == 3) {
                this.A03.A0I();
                this.A04.A01();
                this.A06.A01();
                tabLayout = this.A0A;
                viewPager = this.A01;
            } else {
                if (intValue != 1) {
                    TabLayout.A03(null, this.A0A, false);
                    this.A08.A00(new Rqe(C0A8.A00(getContext(), 12.0f)));
                    return;
                }
                GY4 gy4 = this.A0E;
                if (gy4 == null || this.A05 == null || this.A02 == null) {
                    return;
                }
                List list = gy4.A01;
                if (list != null && (hz8 = (Hz8) 1BK.A0r(list)) != null) {
                    hz8.A03 = true;
                    Hz8.A00(hz8);
                }
                this.A05.A01();
                this.A06.A01();
                tabLayout = this.A0A;
                viewPager = this.A02;
            }
            TabLayout.A03(viewPager, tabLayout, false);
        }
    }

    public int getColor() {
        IA8 ia8 = this.A03.A04.A00;
        if (ia8 == null) {
            return -1;
        }
        if (ia8.A04) {
            return 0;
        }
        return ia8.A00;
    }

    public float getStrokeWidth() {
        Context context;
        Map map;
        int i;
        int intValue = this.A0B.intValue();
        if (intValue == 0 || intValue == 3) {
            context = getContext();
            map = A0I;
            IA8 ia8 = this.A03.A04.A00;
            i = ia8 == null ? 1 : ia8.A01;
        } else {
            if (intValue != 1) {
                return 0.0f;
            }
            context = getContext();
            map = A0J;
            Hz8 hz8 = this.A0E.A04.A00;
            i = hz8 == null ? 0 : hz8.A00;
        }
        return C0A8.A00(context, 7zM.A00(7zN.A0r(map, i)));
    }
}
