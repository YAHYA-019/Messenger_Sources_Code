package com.facebook.stickers.keyboardls.stickergrid;

import X.06Z;
import X.0S2;
import X.1BV;
import X.1Bn;
import X.1Du;
import X.2OB;
import X.4YU;
import X.6tM;
import X.7zL;
import X.7zO;
import X.AbG;
import X.AbL;
import X.AnonymousClass001;
import X.C00i;
import X.C09s;
import X.C1F6;
import X.C5es;
import X.GGS;
import X.GWC;
import X.GWI;
import X.GXC;
import X.HLF;
import X.HpA;
import X.Hpa;
import X.ItY;
import X.JMq;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.stickers.model.Sticker;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterTextView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: StickerGridView.class */
public class StickerGridView extends CustomFrameLayout {
    public int A00;
    public GridLayoutManager A01;
    public RecyclerView A02;
    public FbLinearLayout A03;
    public FbLinearLayout A04;
    public GWC A05;
    public Hpa A06;
    public BetterTextView A07;
    public BetterTextView A08;
    public C00i A09;
    public BetterTextView A0A;

    public StickerGridView(Context context) {
        super(context);
        this.A00 = 0;
        A01();
    }

    public StickerGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        A01();
    }

    public StickerGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        A01();
    }

    public static ImmutableList A00(ImmutableList immutableList, Integer num) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (num != null) {
            builder.m11011add((Object) new HpA((Sticker) null, num));
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) new HpA((Sticker) it.next(), 0S2.A00));
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.2kG, java.lang.Object] */
    private void A01() {
        Context context = getContext();
        1BV A0R = 7zL.A0R(context, 491);
        this.A09 = A0R;
        C1F6 c1f6 = (C1F6) A0R.get();
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            GWC gwc = new GWC(context, c1f6);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = gwc;
            A0U(2132543389);
            ?? r0 = (BetterTextView) C09s.A01(this, 2131367609);
            this.A0A = r0;
            r0.setVisibility(8);
            this.A07 = (BetterTextView) C09s.A01(this, 2131367603);
            this.A08 = (BetterTextView) C09s.A01(this, 2131367608);
            this.A04 = (FbLinearLayout) C09s.A01(this, 2131367605);
            this.A03 = (FbLinearLayout) C09s.A01(this, 2131367604);
            this.A02 = (RecyclerView) C09s.A01(this, 2131367602);
            A02(this);
            this.A02.A1B(new Object());
            RecyclerView recyclerView = this.A02;
            GWC gwc2 = this.A05;
            gwc2.getClass();
            recyclerView.A16(gwc2);
            this.A02.A1A(null);
            GWC gwc3 = this.A05;
            gwc3.getClass();
            this.A06 = new Hpa(gwc3);
            this.A02.A1F(new GXC(this, 6));
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static void A02(StickerGridView stickerGridView) {
        int i;
        Resources resources;
        int i2;
        Context context = stickerGridView.getContext();
        if (4YU.A0B(context).orientation != 2) {
            i = stickerGridView.A00;
            if (i == 0) {
                resources = stickerGridView.getResources();
                i2 = 2131427358;
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i);
            stickerGridView.A01 = gridLayoutManager;
            stickerGridView.A02.A1D(gridLayoutManager);
        }
        resources = stickerGridView.getResources();
        i2 = 2131427344;
        i = resources.getInteger(i2);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context, i);
        stickerGridView.A01 = gridLayoutManager2;
        stickerGridView.A02.A1D(gridLayoutManager2);
    }

    private void A03(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        2OB r0 = this.A0A;
        if (isEmpty) {
            r0.setVisibility(8);
        } else {
            r0.setVisibility(0);
            this.A0A.setText(str);
        }
    }

    public int A0V(String str) {
        GWC gwc = this.A05;
        gwc.getClass();
        List list = ((GWI) gwc).A00.A02;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return -1;
            }
            HpA hpA = (HpA) list.get(i2);
            if (hpA.A00() != null && str.equals(hpA.A00().A0F)) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    public ArrayList A0W() {
        ArrayList A0s = AnonymousClass001.A0s();
        GWC gwc = this.A05;
        if (gwc != null) {
            for (HpA hpA : ((GWI) gwc).A00.A02) {
                if (hpA.A02 == 0S2.A00) {
                    Sticker A00 = hpA.A00();
                    A00.getClass();
                    A0s.add(A00);
                }
            }
        }
        return A0s;
    }

    public void A0X() {
        GWC gwc = this.A05;
        gwc.getClass();
        gwc.A0A = true;
        if (HLF.A00(this.A01, this.A02, this.A06, true)) {
            return;
        }
        GWC gwc2 = this.A05;
        gwc2.getClass();
        gwc2.A07();
        Hpa hpa = this.A06;
        GridLayoutManager gridLayoutManager = this.A01;
        if (hpa.A00 == null) {
            return;
        }
        int A1h = gridLayoutManager.A1h();
        while (true) {
            int i = A1h;
            if (i > gridLayoutManager.A1j()) {
                return;
            }
            hpa.A00(i);
            A1h = i + 1;
        }
    }

    public void A0Y() {
        GWC gwc = this.A05;
        gwc.getClass();
        gwc.A0A = false;
        this.A06.A03.clear();
        HLF.A00(this.A01, this.A02, (Hpa) null, false);
    }

    public void A0Z() {
        A03(null);
        this.A08.setVisibility(8);
        this.A04.setVisibility(8);
        this.A02.setVisibility(8);
        this.A04.setVisibility(8);
    }

    public void A0a(int i, boolean z) {
        GWC gwc = this.A05;
        gwc.getClass();
        List list = ((GWI) gwc).A00.A02;
        if (list == null || i >= list.size()) {
            return;
        }
        ((HpA) list.get(i)).A02 = z ? 0S2.A0C : 0S2.A00;
        gwc.A08(i);
    }

    public void A0b(View view, String str, String str2) {
        2OB r305;
        this.A02.setVisibility(8);
        A03(str2);
        if (view != null) {
            this.A04.addView(view);
            this.A04.setVisibility(0);
            r305 = this.A08;
        } else {
            this.A08.setText(str);
            this.A08.setVisibility(0);
            r305 = this.A04;
        }
        r305.setVisibility(8);
        this.A03.setVisibility(8);
    }

    public void A0c(06Z r302) {
        GWC gwc = this.A05;
        gwc.getClass();
        gwc.A00 = r302;
    }

    public void A0d(MigColorScheme migColorScheme) {
        AbG.A1J(this.A0A, migColorScheme);
        AbG.A1J(this.A08, migColorScheme);
        GWC gwc = this.A05;
        gwc.getClass();
        gwc.A02 = migColorScheme;
        gwc.A06 = new 6tM(migColorScheme);
    }

    public void A0e(JMq jMq) {
        GWC gwc = this.A05;
        gwc.getClass();
        gwc.A03 = jMq;
        this.A06.A00 = jMq;
    }

    public void A0f(GGS ggs, ImmutableList immutableList, String str, String str2, boolean z) {
        GWC gwc = this.A05;
        gwc.getClass();
        gwc.A0A = z;
        GWC gwc2 = this.A05;
        gwc2.getClass();
        Runnable itY = new ItY(this);
        gwc2.A08 = str2;
        ((GWI) gwc2).A00.A00(itY, immutableList);
        GWC gwc3 = this.A05;
        gwc3.getClass();
        gwc3.A04 = ggs;
        A03(str);
        this.A06.A02 = str2;
    }

    public void A0g(Sticker sticker, int i) {
        GWC gwc = this.A05;
        gwc.getClass();
        List list = ((GWI) gwc).A00.A02;
        if (list == null || i >= list.size()) {
            return;
        }
        HpA hpA = (HpA) list.get(i);
        if (sticker != null && !7zO.A1Y(AnonymousClass001.A1T(hpA.A00))) {
            hpA.A00 = sticker;
        }
        hpA.A01 = AnonymousClass001.A0K();
        gwc.A08(i);
    }

    public void A0h(C5es c5es) {
        GWC gwc = this.A05;
        gwc.getClass();
        gwc.A05 = c5es;
        this.A06.A01 = c5es;
    }

    public void A0i(ImmutableList immutableList, String str, String str2, boolean z) {
        A0f(null, A00(immutableList, null), str, str2, z);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.A02.canScrollVertically(i);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A02(this);
    }
}
