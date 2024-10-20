package com.facebook.widget.hscrollrecyclerview;

import X.1Bn;
import X.2NB;
import X.2NQ;
import X.2XA;
import X.C00j;
import X.Q2b;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: HScrollLinearLayoutManager.class */
public class HScrollLinearLayoutManager extends LinearLayoutManager {
    public float A00;
    public Q2b A01;
    public final Context A02;

    public HScrollLinearLayoutManager() {
        super((Context) 1Bn.A0B(83719));
        this.A00 = 50.0f;
        Context context = (Context) 1Bn.A0B(83719);
        A0f();
        this.A02 = context;
        this.A01 = new Q2b(context, this);
    }

    public HScrollLinearLayoutManager(Context context) {
        super(context);
        this.A00 = 50.0f;
        A0f();
        this.A02 = context;
        this.A01 = new Q2b(context, this);
    }

    public void A0j(View view) {
        C00j.A05("HScrollLinearLayoutManager.addView", 1984016728);
        try {
            A0l(view, -1);
            C00j.A01(-600435195);
        } catch (Throwable th) {
            C00j.A01(308297469);
            throw th;
        }
    }

    public void A0m(View view, int i, int i2) {
        C00j.A05("HScrollLinearLayoutManager.measureChildWithMargins", 888679902);
        try {
            super.A0m(view, 0, 0);
            C00j.A01(1911196367);
        } catch (Throwable th) {
            C00j.A01(-1827836387);
            throw th;
        }
    }

    public void A0w(2NB r302, 2NQ r303, int i, int i2) {
        try {
            C00j.A05("HScrollLinearLayoutManager.onMeasure", -664191741);
            ((2XA) this).A07.A0y(i, i2);
            C00j.A01(907194816);
        } catch (Throwable th) {
            C00j.A01(-1873754334);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1L(int i) {
        super.Cjt(i, 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1R(2NB r302, 2NQ r303) {
        C00j.A05("HScrollLinearLayoutManager.onLayoutChildren", -469010184);
        try {
            super.A1R(r302, r303);
            C00j.A01(-1010094456);
        } catch (Throwable th) {
            C00j.A01(2066958938);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1U(2NQ r302, RecyclerView recyclerView, int i) {
        Q2b q2b = this.A01;
        q2b.A00 = i;
        A0x(q2b);
    }
}
