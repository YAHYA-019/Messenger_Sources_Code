package com.facebook.common.staggeredgrid;

import X.11T;
import X.2NB;
import X.2NQ;
import X.2XA;
import X.2Xd;
import X.8Cf;
import X.C2626GjK;
import X.C2634Gjm;
import X.C2lg;
import X.C9Jz;
import X.DKC;
import X.GWG;
import android.content.Context;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: HorizontalStaggeredLayoutManager.class */
public final class HorizontalStaggeredLayoutManager extends 2XA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public RecyclerView A08;
    public C9Jz A09;
    public final int A0A;
    public final C2634Gjm A0C;
    public final boolean A0E;
    public final boolean A0F;
    public final Context A0G;
    public final SparseArray A0B = DKC.A0E();
    public final LruCache A0H = new LruCache(100);
    public final ConcurrentMap A0D = new ConcurrentHashMap();

    public HorizontalStaggeredLayoutManager(Context context, C2634Gjm c2634Gjm, int i, boolean z, boolean z2) {
        this.A0G = context;
        this.A0A = i;
        this.A0C = c2634Gjm;
        this.A0F = z;
        this.A0E = z2;
        this.A06 = i;
        this.A02 = i;
    }

    private final C2626GjK A00(int i) {
        Object obj;
        C2626GjK c2626GjK = null;
        if (this.A05 != 0) {
            SparseArray sparseArray = this.A0B;
            if (i < sparseArray.size()) {
                obj = sparseArray.get(i);
            } else {
                LruCache lruCache = this.A0H;
                Integer valueOf = Integer.valueOf(i);
                if (lruCache.get(valueOf) != null) {
                    obj = lruCache.get(valueOf);
                } else {
                    C2626GjK c2626GjK2 = (C2626GjK) sparseArray.get(i % this.A05);
                    C2626GjK A00 = A00(i - this.A06);
                    if (A00 != null) {
                        int i2 = A00.A02 + this.A0C.A00;
                        C2626GjK c2626GjK3 = new C2626GjK(i2, c2626GjK2.A03, (c2626GjK2.A02 - c2626GjK2.A01) + i2, c2626GjK2.A00);
                        lruCache.put(valueOf, c2626GjK3);
                        return c2626GjK3;
                    }
                }
            }
            c2626GjK = (C2626GjK) obj;
        }
        return c2626GjK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03ce, code lost:
    
        if (r318 < A0V()) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03d1, code lost:
    
        r318 = A0V();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03d7, code lost:
    
        r0 = java.lang.Integer.valueOf(r320);
        r0 = java.lang.Integer.valueOf(r318);
        r325 = r0.intValue();
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03fb, code lost:
    
        if (r325 >= r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03fe, code lost:
    
        r0 = X.2NB.A00(r302, r325);
        X.11T.A0A(r0);
        A0j(r0);
        r0 = A00(r325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x041c, code lost:
    
        if (r0 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x041f, code lost:
    
        r0 = r0.A01;
        r0 = r0 - r301.A00;
        r0 = r0.A02 - r0;
        r0 = r0 + r0;
        r0 = r0.A03;
        r0 = r0.A00 - r0;
        r0 = r0 + r0;
        r324 = false;
        r310 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x047c, code lost:
    
        if ((r325 % r0) >= r301.A02) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x047f, code lost:
    
        r324 = true;
        r310 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x049a, code lost:
    
        if (r0.getAlpha() == r310) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x049d, code lost:
    
        r0 = r301.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04bc, code lost:
    
        if (X.11T.A0N((java.lang.Float) r0.get(r0), r310) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04bf, code lost:
    
        r0.put(r0, java.lang.Float.valueOf(r310));
        X.GOo.A1C(r0);
        r0.animate().alpha(r310).setDuration(80).withEndAction(new X.Izp(r0, r301, r324)).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x050e, code lost:
    
        r0 = (X.C2lg) r0.getLayoutParams();
        r0 = ((X.2XA) r301).A07.A0f(r0);
        r0 = r0 + (r0.left + r0.right);
        r0 = r0 + (r0.top + r0.bottom);
        r0 = X.2XA.A0E(((X.2XA) r301).A03, ((X.2XA) r301).A04, (A0X() + A0Y()) + r0, ((android.view.ViewGroup.LayoutParams) r0).width, A1b());
        r0 = X.2XA.A0E(((X.2XA) r301).A00, ((X.2XA) r301).A01, (A0Z() + A0W()) + r0, ((android.view.ViewGroup.LayoutParams) r0).height, A1e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x05eb, code lost:
    
        if (A14(r0, r0, r0, r0) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05ee, code lost:
    
        r0.measure(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x05f7, code lost:
    
        X.2XA.A0I(r0, r0, r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0604, code lost:
    
        r325 = r325 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x066f, code lost:
    
        r0 = r302.A06;
        X.11T.A0A(r0);
        r0 = X.0QD.A0V(r0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0696, code lost:
    
        if (r0.hasNext() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0699, code lost:
    
        r302.A09(((X.C2lb) r0.next()).A0I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x060d, code lost:
    
        r0 = A00(r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0617, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0638, code lost:
    
        if (r0.A01 > (r301.A00 + ((X.2XA) r301).A03)) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x063b, code lost:
    
        r322 = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0642, code lost:
    
        r0 = r315;
        r315 = r315 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0650, code lost:
    
        if (r0 != r320) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03ba, code lost:
    
        if (r320 > r322) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03bd, code lost:
    
        r318 = r0 + r322;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A01(X.2NB r302, X.2NQ r303) {
        /*
            Method dump skipped, instructions count: 1719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager.A01(X.2NB, X.2NQ):void");
    }

    public void A0w(2NB r302, 2NQ r303, int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i5 = View.MeasureSpec.getSize(i2);
        } else {
            SparseArray sparseArray = this.A0B;
            int i6 = this.A06 - 1;
            if (sparseArray.indexOfKey(i6) >= 0) {
                i5 = this.A0C.A01 + ((C2626GjK) sparseArray.get(i6)).A00;
            }
        }
        int i7 = this.A0C.A01;
        if (i5 <= 0 || (i4 = this.A07) <= 0) {
            i3 = this.A06;
        } else {
            i3 = Math.min(i5 / i4, this.A0A);
            if (i5 < (i4 * i3) + (i7 * i3)) {
                i3--;
            }
        }
        C9Jz c9Jz = this.A09;
        if (c9Jz != null) {
            8Cf r0 = c9Jz.A00;
            float f = NestedScrollView.A0T;
            if (i3 != r0.A02 && r0.A08) {
                r0.A02 = i3;
                8Cf.A01(r0);
            }
        }
        ((2XA) this).A07.setMeasuredDimension(size, i5);
    }

    public void A0y(RecyclerView recyclerView) {
        this.A08 = recyclerView;
    }

    public void A0z(RecyclerView recyclerView) {
        this.A0H.evictAll();
    }

    public int A15(2NB r302, 2NQ r303, int i) {
        11T.A0F(r302, 1);
        int i2 = this.A00;
        int i3 = i2 + i;
        if (i3 < i2) {
            this.A04 = 0;
        }
        this.A00 = i3;
        RecyclerView recyclerView = this.A08;
        2Xd r308 = null;
        if (recyclerView != null) {
            r308 = recyclerView.A0C;
        }
        int i4 = ((r308 instanceof GWG) && r308 != null && A0V() == ((-1) >>> 1)) ? (-1) >>> 1 : (this.A01 + this.A0C.A00) - ((2XA) this).A03;
        int i5 = this.A00;
        if (i5 < 0) {
            i4 = 0;
        } else {
            if (i5 <= i4) {
                i4 = i5;
            }
            if (i4 < i5) {
                this.A04 = 0;
            }
        }
        this.A00 = i4;
        A01(r302, r303);
        return i;
    }

    public C2lg A1F() {
        return new C2lg(-2, -2);
    }

    public void A1L(int i) {
        float f = RecyclerView.A1C;
        if (i < this.A00) {
            this.A04 = 0;
        }
        this.A00 = i;
    }

    public void A1R(2NB r302, 2NQ r303) {
        11T.A0H(r302, r303);
        A01(r302, r303);
    }

    public void A1S(2NB r302, RecyclerView recyclerView) {
        A0z(recyclerView);
        this.A08 = null;
    }

    public boolean A1b() {
        return true;
    }

    public boolean A1e() {
        return false;
    }
}
