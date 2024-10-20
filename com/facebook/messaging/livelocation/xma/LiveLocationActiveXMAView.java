package com.facebook.messaging.livelocation.xma;

import X.0FI;
import X.0S2;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.2OB;
import X.4YT;
import X.4YU;
import X.7zL;
import X.7zN;
import X.C00i;
import X.C09s;
import X.C0A8;
import X.C15h;
import X.C2qv;
import X.C54a;
import X.C7sh;
import X.DKG;
import X.GOo;
import X.HRU;
import X.Hlx;
import X.I1z;
import X.ITe;
import X.ITg;
import X.Ink;
import X.J5u;
import X.JNf;
import X.KWj;
import X.Kkz;
import X.MFR;
import X.RaC;
import X.RpX;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.FbMapViewDelegate;
import com.facebook.messaging.xma.ui.XMALinearLayout;
import com.facebook.resources.ui.FbTextView;
import com.facebook.user.model.UserKey;

/* loaded from: LiveLocationActiveXMAView.class */
public class LiveLocationActiveXMAView extends XMALinearLayout implements MFR, ViewTreeObserver.OnGlobalLayoutListener {
    public LinearLayout A00;
    public CardView A01;
    public C00i A02;
    public FbMapViewDelegate A03;
    public RaC A04;
    public FbTextView A05;
    public FbTextView A06;
    public FbTextView A07;
    public UserKey A08;
    public UserKey A09;
    public Double A0A;
    public Double A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public int A0G;
    public int A0H;
    public FrameLayout A0I;
    public LinearLayout A0J;
    public C00i A0K;
    public JNf A0L;
    public Hlx A0M;
    public C15h A0N;
    public final C00i A0O;
    public final C54a A0P;

    public LiveLocationActiveXMAView(Context context) {
        super(context);
        this.A0P = (C54a) 1Bi.A03(68080);
        this.A0O = 1BQ.A02(83828);
        A00();
    }

    public LiveLocationActiveXMAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0P = (C54a) 1Bi.A03(68080);
        this.A0O = 1BQ.A02(83828);
        A00();
    }

    public LiveLocationActiveXMAView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0P = (C54a) 1Bi.A03(68080);
        this.A0O = 1BQ.A02(83828);
        A00();
    }

    private void A00() {
        this.A0N = J5u.A03(this, 23);
        this.A0M = (Hlx) 1Bn.A0A(116300);
        this.A02 = 1BV.A00(116299);
        this.A0K = 7zL.A0R(getContext(), 98516);
        this.A08 = (UserKey) this.A0N.get();
    }

    private void A01() {
        FrameLayout frameLayout = this.A0I;
        int i = this.A0G;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        FbMapViewDelegate fbMapViewDelegate = this.A03;
        int i2 = this.A0G;
        fbMapViewDelegate.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        this.A01.getLayoutParams().width = this.A0G - (7zN.A01(getResources()) * 2);
    }

    public static void A02(LiveLocationActiveXMAView liveLocationActiveXMAView) {
        liveLocationActiveXMAView.A0E(new C7sh(null, null, 4YT.A00(201)));
    }

    public static void A03(LiveLocationActiveXMAView liveLocationActiveXMAView) {
        2OB r0 = liveLocationActiveXMAView.A05;
        if (r0 != null) {
            r0.setText(4YU.A0u(GOo.A0A(liveLocationActiveXMAView), liveLocationActiveXMAView.A0F, 2131958700));
        }
    }

    public static void A04(LiveLocationActiveXMAView liveLocationActiveXMAView) {
        Double d;
        Double d2;
        JNf jNf = liveLocationActiveXMAView.A0L;
        if (jNf == null || (d = liveLocationActiveXMAView.A0A) == null || (d2 = liveLocationActiveXMAView.A0B) == null) {
            return;
        }
        LatLng latLng = new LatLng(d.doubleValue(), d2.doubleValue());
        jNf.Beb(Kkz.A00(latLng, 16.0f));
        liveLocationActiveXMAView.A04.A02.Csx(latLng);
    }

    public static void A05(LiveLocationActiveXMAView liveLocationActiveXMAView) {
        int i = 0;
        liveLocationActiveXMAView.A01.setVisibility(DKG.A00(C2qv.A01(liveLocationActiveXMAView.A09, liveLocationActiveXMAView.A08) ? 1 : 0));
        int A01 = 7zN.A01(liveLocationActiveXMAView.getResources());
        LinearLayout linearLayout = liveLocationActiveXMAView.A0J;
        if (!C2qv.A01(liveLocationActiveXMAView.A09, liveLocationActiveXMAView.A08)) {
            i = A01;
        }
        linearLayout.setPadding(A01, A01, A01, i);
    }

    public void C5X(JNf jNf) {
        this.A0L = jNf;
        if (this.A04 == null) {
            jNf.BHl().Cle(false);
            jNf.A6m(new ITe(this));
            Hlx hlx = this.A0M;
            hlx.getClass();
            RaC A00 = hlx.A00(getContext(), this.A0L);
            this.A04 = A00;
            UserKey userKey = this.A09;
            if (userKey != null) {
                A00.A01(userKey);
            }
            Integer AvW = jNf.AvW();
            if (AvW == 0S2.A00) {
                JNf jNf2 = this.A0L;
                jNf2.Cry(new ITg(this));
                jNf2.Cru(new HRU(this));
            } else if (AvW == 0S2.A01) {
                ((RpX) jNf).A02.addOnMapClickListener(new Ink(this));
            }
        }
        this.A0L.CsF(0, 0, 0, this.A01.getHeight() + C0A8.A00(getContext(), 2.0f));
        A04(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(802609337);
        super.onFinishInflate();
        ((I1z) 4YU.A0p(this.A0K)).A01();
        this.A03 = KWj.A00(getContext(), (FrameLayout) C09s.A01(this, 2131365437));
        this.A01 = (CardView) C09s.A01(this, 2131362879);
        this.A05 = GOo.A0X(this, 2131368067);
        this.A07 = GOo.A0X(this, 2131367731);
        this.A0I = (FrameLayout) C09s.A01(this, 2131363324);
        this.A03.A05(null);
        this.A03.A07(this);
        int A03 = this.A0P.A03();
        this.A0H = A03;
        this.A0G = A03;
        A01();
        this.A06 = GOo.A0X(this, 2131367728);
        this.A0J = (LinearLayout) C09s.A01(this, 2131362600);
        this.A00 = (LinearLayout) C09s.A01(this, 2131362588);
        A05(this);
        A03(this);
        Resources resources = getResources();
        String str = this.A0D;
        if (str == null) {
            str = "";
        }
        setContentDescription(4YU.A0u(resources, str, 2131958699));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        0FI.A0C(437193380, A06);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        UserKey userKey;
        A04(this);
        RaC raC = this.A04;
        if (raC == null || (userKey = this.A09) == null) {
            return;
        }
        raC.A01(userKey);
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.A0H;
        if (View.MeasureSpec.getMode(i) != 0 && View.MeasureSpec.getSize(i) < i3) {
            i3 = View.MeasureSpec.getSize(i);
        }
        if (View.MeasureSpec.getMode(i2) != 0 && View.MeasureSpec.getSize(i2) < i3) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        if (i3 != this.A0G) {
            this.A0G = i3;
            A01();
        }
        super.onMeasure(i, i2);
    }
}
