package com.facebook.widget.recyclerview;

import X.1BK;
import X.1sP;
import X.2NB;
import X.2NQ;
import X.2XJ;
import X.2Z5;
import X.6M4;
import X.AnonymousClass001;
import X.C00j;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AutoMeasureLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: BetterLinearLayoutManager.class */
public class BetterLinearLayoutManager extends AutoMeasureLinearLayoutManager implements 2Z5 {
    public 6M4 A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public final Rect A06;
    public final List A07;

    public BetterLinearLayoutManager(Context context) {
        super(context);
        ((AutoMeasureLinearLayoutManager) this).A00 = true;
        this.A06 = new Rect();
        this.A07 = new ArrayList();
    }

    public BetterLinearLayoutManager(Context context, int i) {
        super(context, i, false);
        ((AutoMeasureLinearLayoutManager) this).A00 = true;
        this.A06 = new Rect();
        this.A07 = new ArrayList();
    }

    private void A00() {
        this.A04 = null;
        this.A05 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public int A0W() {
        return 1sP.A01() ? super.A0W() : this.A06.bottom;
    }

    public int A0X() {
        return 1sP.A01() ? super.A0X() : this.A06.left;
    }

    public int A0Y() {
        return 1sP.A01() ? super.A0Y() : this.A06.right;
    }

    public int A0Z() {
        return 1sP.A01() ? super.A0Z() : this.A06.top;
    }

    public void A0l(View view, int i) {
        C00j.A05("BetterLinearLayoutManager.addView", 259265234);
        try {
            super.A0l(view, i);
            C00j.A01(202452286);
        } catch (Throwable th) {
            C00j.A01(-662339497);
            throw th;
        }
    }

    public void A0m(View view, int i, int i2) {
        C00j.A05("BetterLinearLayoutManager.measureChildWithMargins", 240356205);
        try {
            super.A0m(view, 0, 0);
            C00j.A01(1927969641);
        } catch (Throwable th) {
            C00j.A01(1426560024);
            throw th;
        }
    }

    public void A0q(View view, 2NB r303) {
        C00j.A05("BetterLinearLayoutManager.removeAndRecycleView", -693411756);
        try {
            super.A0q(view, r303);
            C00j.A01(-914094184);
        } catch (Throwable th) {
            C00j.A01(735302963);
            throw th;
        }
    }

    public void A0v(2NB r302, int i) {
        C00j.A05("BetterLinearLayoutManager.removeAndRecycleViewAt", -978182258);
        try {
            super.A0v(r302, i);
            C00j.A01(1015420813);
        } catch (Throwable th) {
            C00j.A01(-225784203);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A16(2NB r302, 2NQ r303, int i) {
        C00j.A05("BetterLinearLayoutManager.scrollVerticallyBy", 1986522334);
        try {
            try {
                A00();
                int A16 = super.A16(r302, r303, i);
                C00j.A01(-151016156);
                return A16;
            } catch (IndexOutOfBoundsException e) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Adapter count: ");
                A0k.append(A0V());
                A0k.append(" Scroll amount: ");
                A0k.append(i);
                throw 1BK.A0s(AnonymousClass001.A0Z(r303, " ", A0k), e);
            }
        } catch (Throwable th) {
            C00j.A01(-365984667);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1L(int i) {
        A00();
        super.A1L(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1R(2NB r302, 2NQ r303) {
        A00();
        super.A1R(r302, r303);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1U(2NQ r302, RecyclerView recyclerView, int i) {
        if (i != -1) {
            A00();
            super.A1U(r302, recyclerView, i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1g() {
        Integer num = this.A01;
        if (num == null) {
            num = Integer.valueOf(super.A1g());
            this.A01 = num;
        }
        return num.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1h() {
        Integer num = this.A03;
        if (num == null) {
            num = Integer.valueOf(super.A1h());
            this.A03 = num;
        }
        return num.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1i() {
        Integer num = this.A04;
        if (num == null) {
            num = Integer.valueOf(super.A1i());
            this.A04 = num;
        }
        return num.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1j() {
        Integer num = this.A05;
        if (num == null) {
            num = Integer.valueOf(super.A1j());
            this.A05 = num;
        }
        return num.intValue();
    }

    /* JADX WARN: Type inference failed for: r303v2, types: [java.lang.Object, X.6M4] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1p(int i) {
        super.A1p(i);
        6M4 r303 = this.A00;
        6M4 r3032 = r303;
        if (r303 == null) {
            ?? obj = new Object();
            ((6M4) obj).A01 = this;
            this.A00 = obj;
            r3032 = obj;
        }
        r3032.A00 = 2XJ.A00(r3032.A01, i);
    }

    /* JADX WARN: Type inference failed for: r302v5, types: [java.lang.Object, X.6M4] */
    public int ASj() {
        Integer num = this.A02;
        if (num == null) {
            6M4 r302 = this.A00;
            6M4 r3022 = r302;
            if (r302 == null) {
                ?? obj = new Object();
                ((6M4) obj).A01 = this;
                this.A00 = obj;
                r3022 = obj;
            }
            num = Integer.valueOf(r3022.A00());
            this.A02 = num;
        }
        return num.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Cjt(int i, int i2) {
        A00();
        super.Cjt(i, i2);
    }
}
