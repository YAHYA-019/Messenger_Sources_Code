package com.facebook.widget.recyclerview;

import X.0WH;
import X.1BK;
import X.1BQ;
import X.1II;
import X.2Mp;
import X.2Nn;
import X.2No;
import X.2Nq;
import X.2Ns;
import X.2Nt;
import X.2Nv;
import X.2Nw;
import X.2Nz;
import X.2O0;
import X.2O1;
import X.2O3;
import X.2XA;
import X.2XR;
import X.2Xd;
import X.2Y0;
import X.2YM;
import X.2YO;
import X.2Z5;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C3lm;
import X.HTG;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.common.dextricks.Constants;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.LithoView;
import com.facebook.resources.ui.FbRecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: BetterRecyclerView.class */
public class BetterRecyclerView extends FbRecyclerView implements 2Mp {
    public int A00;
    public int A01;
    public HTG A02;
    public 2YM A03;
    public 2Y0 A04;
    public C3lm A05;
    public boolean A06;
    public boolean A07;
    public List A08;
    public final GestureDetector A09;
    public final GestureDetector A0A;
    public final 2Nv A0B;
    public final 2Nv A0C;
    public final C00i A0D;
    public final 2Nn A0E;
    public final CopyOnWriteArrayList A0F;
    public final Handler A0G;
    public final 2O3 A0H;
    public final 2No A0I;
    public final 2O0 A0J;
    public final 2O0 A0K;

    public BetterRecyclerView(Context context) {
        super(context, null);
        Handler A07 = AnonymousClass001.A07();
        this.A0G = A07;
        this.A0E = new 2Nn();
        this.A0I = new 2No(this);
        this.A0F = new CopyOnWriteArrayList();
        Context context2 = getContext();
        this.A09 = new GestureDetector(context2, new 2Nq(this), A07);
        this.A0A = new GestureDetector(context2, new 2Ns(this), A07);
        this.A0B = new 2Nt(this);
        this.A0C = new 2Nw(this);
        this.A0K = new 2Nz(this);
        this.A0J = new 2O1(this);
        this.A0H = new 2O3(this);
        this.A01 = 0;
        this.A0D = 1BQ.A02(16501);
        A00();
    }

    public BetterRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Handler handler = new Handler(Looper.getMainLooper());
        this.A0G = handler;
        this.A0E = new 2Nn();
        this.A0I = new 2No(this);
        this.A0F = new CopyOnWriteArrayList();
        Context context2 = getContext();
        this.A09 = new GestureDetector(context2, new 2Nq(this), handler);
        this.A0A = new GestureDetector(context2, new 2Ns(this), handler);
        this.A0B = new 2Nt(this);
        this.A0C = new 2Nw(this);
        this.A0K = new 2Nz(this);
        this.A0J = new 2O1(this);
        this.A0H = new 2O3(this);
        this.A01 = 0;
        this.A0D = new 1BQ(16501);
        A00();
    }

    public BetterRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Handler A07 = AnonymousClass001.A07();
        this.A0G = A07;
        this.A0E = new 2Nn();
        this.A0I = new 2No(this);
        this.A0F = new CopyOnWriteArrayList();
        Context context2 = getContext();
        this.A09 = new GestureDetector(context2, new 2Nq(this), A07);
        this.A0A = new GestureDetector(context2, new 2Ns(this), A07);
        this.A0B = new 2Nt(this);
        this.A0C = new 2Nw(this);
        this.A0K = new 2Nz(this);
        this.A0J = new 2O1(this);
        this.A0H = new 2O3(this);
        this.A01 = 0;
        this.A0D = 1BQ.A02(16501);
        A00();
    }

    private void A00() {
        this.A00 = super.getVisibility();
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        A1F(this.A0H);
    }

    public static void A01(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof LithoView) {
                ((BaseMountingView) childAt).Bgo();
            } else if (childAt instanceof ViewGroup) {
                A01((ViewGroup) childAt);
            }
            i = i2 + 1;
        }
    }

    public static void A02(BetterRecyclerView betterRecyclerView) {
        super.setVisibility(betterRecyclerView.A00);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A0s(int i) {
        C00j.A05("BetterRecyclerView.offsetChildrenVertical", 1953632976);
        try {
            super.A0s(i);
            C00j.A01(848550861);
        } catch (Throwable th) {
            C00j.A01(-2056748962);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A16(2Xd r302) {
        2Xd r0 = super.A0C;
        if (r0 != null) {
            r0.D5v(this.A0I);
            r0.D5v(this.A0K);
            r0.D5v(this.A0J);
        }
        super.A16(r302);
        if (r302 != null) {
            r302.CcA(this.A0K);
            r302.CcA(this.A0I);
            r302.CcA(this.A0J);
        }
        A02(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A1D(2XA r302) {
        if (r302 != null) {
            r302.A10(false);
        }
        super.A1D(r302);
    }

    public void A1N(2YO r302) {
        0WH r0 = this.A0E.A00;
        synchronized (r0) {
            r0.add(r302);
        }
    }

    public void CcZ(2XR r302) {
        List list = this.A08;
        if (list == null) {
            list = new ArrayList();
            this.A08 = list;
        }
        list.add(r302);
    }

    public void D66(2XR r302) {
        List list = this.A08;
        if (list != null) {
            list.remove(r302);
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        int A1h;
        if (i < 0 && super.A0F != null && getChildCount() > 0) {
            boolean z = false;
            boolean z2 = false;
            if (getChildAt(0).getTop() >= (this.A0P ? 0 : getPaddingTop())) {
                z2 = true;
            }
            2Z5 r0 = super.A0F;
            if (r0 instanceof 2Z5) {
                A1h = r0.ASj();
            } else if (r0 instanceof LinearLayoutManager) {
                A1h = ((LinearLayoutManager) r0).A1h();
            }
            if (A1h > 0 || !z2) {
                z = true;
            }
            return z;
        }
        return super.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        List list = this.A08;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((2XR) this.A08.get(i)).CXx(getChildCount());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        1II r0 = super.A0C;
        if ((r0 instanceof 1II) && r0.BRi()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        C00j.A05("BetterRecyclerView.draw", -1552026474);
        try {
            try {
                super.draw(canvas);
                this.A0E.A00();
                C00j.A01(1952474166);
            } catch (NullPointerException e) {
                int childCount = getChildCount();
                ArrayList A0t = AnonymousClass001.A0t(childCount);
                for (int i = 0; i < childCount; i++) {
                    A0t.add(getChildAt(i));
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Expected:");
                A0k.append(childCount);
                throw 1BK.A0s(AnonymousClass001.A0Z(A0t, " Children:", A0k), e);
            }
        } catch (Throwable th) {
            C00j.A01(678047310);
            throw th;
        }
    }

    @Override // android.view.View
    public int getVisibility() {
        return this.A00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        2Y0 r0 = this.A04;
        if (r0 != null) {
            r0.BlC(this);
        }
        super.onLayout(z, i, i2, i3, i4);
        2Y0 r02 = this.A04;
        if (r02 != null) {
            r02.BiQ(this);
        }
        if (z) {
            A01(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        2Y0 r0 = this.A04;
        if (r0 != null) {
            r0.C5l();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.A00 = i;
        A02(this);
    }
}
