package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.litho.LithoView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6s5, reason: invalid class name */
/* loaded from: 6s5.class */
public final class C6s5 {
    public static final int A0g = View.generateViewId();
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public DraggableViewContainer A06;
    public LithoView A07;
    public LithoView A08;
    public LithoView A09;
    public LithoView A0A;
    public C9ma A0B;
    public C6tR A0C;
    public C9ki A0D;
    public C9cp A0E;
    public C7W5 A0F;
    public C6tS A0G;
    public C7W6 A0H;
    public 9W2 A0I;
    public C9a3 A0J;
    public C9kz A0K;
    public C6uv A0L;
    public C6ri A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Context A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final 1Br A0T;
    public final 1Br A0U;
    public final 1Br A0V;
    public final 1Br A0W;
    public final C6s7 A0X;
    public final C6s8 A0Y;
    public final C6s4 A0Z;
    public final 6RU A0a;
    public final C6rj A0b;
    public final List A0c;
    public final C01i A0d;
    public final C01i A0e;
    public final 1Br A0f;

    /* JADX WARN: Type inference failed for: r0v45, types: [X.6s8] */
    public C6s5(Context context, C6s4 c6s4, C6rj c6rj) {
        11T.A0F(c6rj, 3);
        this.A0Z = c6s4;
        this.A0Q = context;
        this.A0b = c6rj;
        this.A0V = 1Bu.A00(960);
        this.A0f = 1Bq.A00(66409);
        this.A0R = 1Bq.A00(68689);
        this.A0U = 1Bu.A00(68556);
        this.A0a = new 6RU(context);
        this.A0W = 1Bu.A01(context, 67452);
        this.A0d = C01g.A01(new AnonymousClass834(this, 11));
        this.A0T = 1Bq.A00(68702);
        this.A0e = C01g.A01(new C6s6(this));
        this.A0S = 1Bu.A00(66973);
        this.A0c = new ArrayList();
        this.A0X = new C6s7(this);
        this.A0Y = new C6s9() { // from class: X.6s8
            @Override // X.C6s9
            public void C3A(int i) {
            }

            @Override // X.C6s9
            public void C3H(boolean z, int i) {
                C6s5 c6s5 = C6s5.this;
                int i2 = C6s5.A0g;
                C6uy c6uy = (C6uy) c6s5.A0e.getValue();
                c6uy.A04 = z;
                5Tn r0 = c6uy.A01;
                if (r0 == null) {
                    11T.A0L("data");
                    throw 0Q8.createAndThrow();
                }
                r0.ARw(2);
                if (z && i > 0) {
                    c6s5.A00 = i;
                }
                if (c6s5.A0O != z) {
                    c6s5.A0O = z;
                    C6ri c6ri = c6s5.A0M;
                    if (c6ri != null) {
                        c6ri.A00(new C7Ah(z, c6s5.A00));
                    }
                }
            }

            @Override // X.C6s9
            public void CDO(boolean z) {
                C6s5 c6s5 = C6s5.this;
                int i = C6s5.A0g;
                C9ki c9ki = c6s5.A0D;
                if (c9ki != null && z && c9ki.A03) {
                    C9ki.A00(c9ki, 0L);
                    c9ki.A03 = false;
                }
            }
        };
    }

    public static final int A00(C6s5 c6s5) {
        Resources resources = c6s5.A0Q.getResources();
        float f = resources.getConfiguration().smallestScreenWidthDp;
        if (f < 320.0f) {
            return -1;
        }
        float f2 = f * 0.32f;
        float f3 = 200.0f;
        if (200.0f > f2) {
            f3 = f2;
        }
        return 3yG.A04(resources, f3);
    }

    public static final 1qI A01(C6s5 c6s5) {
        return (1qI) c6s5.A0f.A00.get();
    }

    public static final String A02(Integer num) {
        if (num == null) {
            return "thread_header";
        }
        int intValue = num.intValue();
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue == 4 ? "bottom_right" : "thread_header" : "bottom_left" : "top_right" : "top_left";
    }

    public static final void A03(C6s5 c6s5, boolean z) {
        DraggableViewContainer draggableViewContainer = c6s5.A06;
        if (draggableViewContainer == null || c6s5.A08 == null) {
            return;
        }
        C9kz c9kz = c6s5.A0K;
        boolean z2 = false;
        boolean z3 = c9kz != null ? c9kz.A03 : false;
        if (z && !z3) {
            1qI A01 = A01(c6s5);
            if (A01.A09() && 1qI.A02(A01).AZk(36322796122818398L)) {
                z2 = true;
            }
        }
        9W2 r0 = c6s5.A0I;
        if (r0 != null) {
            ((6tZ) 1Br.A0B(r0.A08)).A0B(Boolean.valueOf(z2));
        }
        draggableViewContainer.A0F = !z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (X.1qI.A02(r0).AZk(36322796120917847L) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A04(X.C6s5 r301) {
        /*
            r0 = 83608(0x14698, float:1.1716E-40)
            java.lang.Object r0 = X.1Bi.A03(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.booleanValue()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L25
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.YES
            r304 = r0
            r0 = 83429(0x145e5, float:1.16909E-40)
            r303 = r0
            r0 = r303
            java.lang.Object r0 = X.1Bn.A0A(r0)
            r302 = r0
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L4e
        L25:
            r0 = r301
            X.1qI r0 = A01(r0)
            r304 = r0
            r0 = r304
            boolean r0 = r0.A09()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4e
            r0 = r304
            X.1CO r0 = X.1qI.A02(r0)
            r301 = r0
            r0 = 36322796120917847(0x810b6400094757, double:3.0340207548042126E-306)
            r305 = r0
            r0 = r301
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 != 0) goto L52
        L4e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L52:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6s5.A04(X.6s5):boolean");
    }

    public void A05() {
        7Dr r0;
        5Tn r02;
        if (this.A0A != null) {
            ((6tW) ((C6tU) this.A0W.A00.get()).A02.A00.get()).A01();
        }
        C6uv c6uv = this.A0L;
        if (c6uv != null && c6uv.A01 != null) {
            ((6tW) c6uv.A07.A00.get()).A01();
        }
        if (this.A09 != null) {
            5Tn r03 = ((C6uy) this.A0e.getValue()).A01;
            if (r03 == null) {
                11T.A0L("data");
                throw 0Q8.createAndThrow();
            }
            r03.ARw(1);
        }
        if (this.A07 == null || (r0 = ((C6w1) this.A0S.A00.get()).A00) == null || (r02 = r0.A01) == null) {
            return;
        }
        r02.ARw(1);
    }

    public final void A06() {
        Object value;
        9lF r0;
        SpannableString A00;
        String str;
        String str2;
        C9ma c9ma = this.A0B;
        if (c9ma == null || !c9ma.A07) {
            return;
        }
        C01i c01i = c9ma.A0X;
        8DP r02 = (8DP) c01i.getValue();
        Context context = c9ma.A09;
        long j = c9ma.A0N.A02;
        LifecycleOwner viewLifecycleOwner = c9ma.A0B.getViewLifecycleOwner();
        AK6 ak6 = new AK6(c9ma, 1);
        boolean A002 = ((9Wm) 1Br.A0B(c9ma.A0F)).A00();
        0Xs r03 = r02.A0A;
        do {
            value = r03.getValue();
            r0 = (9lF) value;
            A00 = 8DP.A00(context, viewLifecycleOwner, r02, ak6, j, A002);
            str = r0.A05;
            str2 = r0.A06;
        } while (!r03.AGt(value, new 9lF(r0.A00, r0.A01, r0.A02, r0.A03, A00, str, str2, r0.A0C, r0.A0A, r0.A08, r0.A07, r0.A0B, r0.A09)));
        ((8DP) c01i.getValue()).A02();
        c9ma.A08 = false;
    }
}
