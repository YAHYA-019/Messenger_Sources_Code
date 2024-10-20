package androidx.recyclerview.widget;

import X.0Pz;
import X.2NB;
import X.2NP;
import X.2NQ;
import X.2Nm;
import X.2XA;
import X.2XB;
import X.2XH;
import X.2XI;
import X.2XJ;
import X.2Xl;
import X.AbstractC02843wc;
import X.C02833wb;
import X.C2lg;
import X.C2rb;
import X.C2xc;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: LinearLayoutManager.class */
public class LinearLayoutManager extends 2XA implements 2XB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public 2Xl A04;
    public SavedState A05;
    public 2XJ A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;
    public final 2XH A0B;
    public final 2XI A0C;
    public boolean mLastStackFromEnd;
    public boolean mStackFromEnd;

    /* loaded from: LinearLayoutManager$SavedState.class */
    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C2xc(0);
        public int A00;
        public int A01;
        public boolean A02;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A02 ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.2XI, java.lang.Object] */
    public LinearLayoutManager(Context context, int i, boolean z) {
        this.A01 = 1;
        this.A07 = false;
        this.A08 = false;
        this.mStackFromEnd = false;
        this.A09 = true;
        this.A02 = -1;
        this.A03 = (-1) << (-1);
        this.A05 = null;
        this.A0B = new 2XH();
        this.A0C = new Object();
        this.A00 = 2;
        this.A0A = new int[2];
        A1p(i);
        A1u(z);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.2XI, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A01 = 1;
        this.A07 = false;
        this.A08 = false;
        this.mStackFromEnd = false;
        this.A09 = true;
        this.A02 = -1;
        this.A03 = (-1) << (-1);
        this.A05 = null;
        this.A0B = new 2XH();
        this.A0C = new Object();
        this.A00 = 2;
        this.A0A = new int[2];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Nm.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        boolean z2 = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1p(i3);
        A1u(z);
        A1v(z2);
    }

    private int A00(2Xl r302, 2NB r303, 2NQ r304, boolean z) {
        int i;
        int i2 = r302.A00;
        int i3 = r302.A08;
        int i4 = (-1) << (-1);
        if (i3 != i4) {
            if (i2 < 0) {
                r302.A08 = i3 + i2;
            }
            A09(r302, r303);
        }
        int i5 = r302.A00 + r302.A02;
        2XI r0 = this.A0C;
        while (true) {
            if ((!r302.A0A && i5 <= 0) || (i = r302.A01) < 0 || i >= r304.A00()) {
                break;
            }
            r0.A00 = 0;
            r0.A01 = false;
            r0.A03 = false;
            r0.A02 = false;
            A1r(r0, r302, r303, r304);
            if (!r0.A01) {
                int i6 = r302.A07;
                int i7 = r0.A00;
                r302.A07 = i6 + (r302.A05 * i7);
                if (!r0.A03 || r302.A09 != null || !r304.A08) {
                    r302.A00 -= i7;
                    i5 -= i7;
                }
                int i8 = r302.A08;
                if (i8 != i4) {
                    int i9 = i8 + i7;
                    r302.A08 = i9;
                    int i10 = r302.A00;
                    if (i10 < 0) {
                        r302.A08 = i9 + i10;
                    }
                    A09(r302, r303);
                }
                if (z && r0.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - r302.A00;
    }

    public static int A01(LinearLayoutManager linearLayoutManager, 2NQ r302) {
        if (linearLayoutManager.A0U() == 0) {
            return 0;
        }
        linearLayoutManager.A1o();
        2XJ r0 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A09;
        boolean z2 = !z;
        return C2rb.A00(linearLayoutManager.A1n(z2), linearLayoutManager.A1m(z2), r0, linearLayoutManager, r302, z);
    }

    public static int A02(LinearLayoutManager linearLayoutManager, 2NQ r302) {
        if (linearLayoutManager.A0U() == 0) {
            return 0;
        }
        linearLayoutManager.A1o();
        2XJ r0 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A09;
        boolean z2 = !z;
        return C2rb.A02(linearLayoutManager.A1n(z2), linearLayoutManager.A1m(z2), r0, linearLayoutManager, r302, z, linearLayoutManager.A08);
    }

    public static int A03(LinearLayoutManager linearLayoutManager, 2NQ r302) {
        if (linearLayoutManager.A0U() == 0) {
            return 0;
        }
        linearLayoutManager.A1o();
        2XJ r0 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A09;
        boolean z2 = !z;
        return C2rb.A01(linearLayoutManager.A1n(z2), linearLayoutManager.A1m(z2), r0, linearLayoutManager, r302, z);
    }

    private int A04(2NB r302, 2NQ r303, int i) {
        if (A0U() == 0 || i == 0) {
            return 0;
        }
        A1o();
        this.A04.A0B = true;
        int i2 = -1;
        if (i > 0) {
            i2 = 1;
        }
        int abs = Math.abs(i);
        A0B(this, r303, i2, abs, true);
        2Xl r0 = this.A04;
        int A00 = r0.A08 + A00(r0, r302, r303, false);
        if (A00 < 0) {
            return 0;
        }
        if (abs > A00) {
            i = i2 * A00;
        }
        this.A06.A0E(-i);
        this.A04.A04 = i;
        return i;
    }

    private View A05(int i, int i2) {
        A1o();
        if (i2 <= i && i2 >= i) {
            return A0d(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A06.A0B(A0d(i)) < this.A06.A06()) {
            i3 = 16644;
            i4 = 16388;
        }
        return (this.A01 == 0 ? ((2XA) this).A08 : ((2XA) this).A09).A00(i, i2, i3, i4);
    }

    private View A06(int i, int i2, boolean z, boolean z2) {
        A1o();
        int i3 = 320;
        int i4 = 320;
        if (z) {
            i4 = 24579;
        }
        if (!z2) {
            i3 = 0;
        }
        return (this.A01 == 0 ? ((2XA) this).A08 : ((2XA) this).A09).A00(i, i2, i4, i3);
    }

    private void A07(int i, int i2) {
        this.A04.A00 = this.A06.A03() - i2;
        2Xl r0 = this.A04;
        int i3 = 1;
        if (this.A08) {
            i3 = -1;
        }
        r0.A03 = i3;
        r0.A01 = i;
        r0.A05 = 1;
        r0.A07 = i2;
        r0.A08 = (-1) << (-1);
    }

    private void A08(int i, int i2) {
        this.A04.A00 = i2 - this.A06.A06();
        2Xl r0 = this.A04;
        r0.A01 = i;
        int i3 = -1;
        if (this.A08) {
            i3 = 1;
        }
        r0.A03 = i3;
        r0.A05 = -1;
        r0.A07 = i2;
        r0.A08 = (-1) << (-1);
    }

    private void A09(2Xl r302, 2NB r303) {
        int i;
        int i2;
        if (!r302.A0B || r302.A0A) {
            return;
        }
        int i3 = r302.A08;
        int i4 = r302.A06;
        if (r302.A05 == -1) {
            int A0U = A0U();
            if (i3 < 0) {
                return;
            }
            int A01 = (this.A06.A01() - i3) + i4;
            if (this.A08) {
                i = 0;
                int i5 = 0;
                while (true) {
                    i2 = i5;
                    if (i2 >= A0U) {
                        return;
                    }
                    View A0d = A0d(i2);
                    if (this.A06.A0B(A0d) < A01 || this.A06.A0D(A0d) < A01) {
                        break;
                    } else {
                        i5 = i2 + 1;
                    }
                }
            } else {
                i = A0U - 1;
                int i6 = i;
                while (true) {
                    i2 = i6;
                    if (i2 < 0) {
                        return;
                    }
                    View A0d2 = A0d(i2);
                    if (this.A06.A0B(A0d2) < A01 || this.A06.A0D(A0d2) < A01) {
                        break;
                    } else {
                        i6 = i2 - 1;
                    }
                }
            }
        } else {
            if (i3 < 0) {
                return;
            }
            int i7 = i3 - i4;
            int A0U2 = A0U();
            if (this.A08) {
                i = A0U2 - 1;
                int i8 = i;
                while (true) {
                    i2 = i8;
                    if (i2 < 0) {
                        return;
                    }
                    View A0d3 = A0d(i2);
                    if (this.A06.A08(A0d3) > i7 || this.A06.A0C(A0d3) > i7) {
                        break;
                    } else {
                        i8 = i2 - 1;
                    }
                }
            } else {
                i = 0;
                int i9 = 0;
                while (true) {
                    i2 = i9;
                    if (i2 >= A0U2) {
                        return;
                    }
                    View A0d4 = A0d(i2);
                    if (this.A06.A08(A0d4) > i7 || this.A06.A0C(A0d4) > i7) {
                        break;
                    } else {
                        i9 = i2 + 1;
                    }
                }
            }
        }
        A0C(r303, i, i2);
    }

    public static void A0A(LinearLayoutManager linearLayoutManager) {
        linearLayoutManager.A08 = (linearLayoutManager.A01 == 1 || !linearLayoutManager.A1w()) ? linearLayoutManager.A07 : !linearLayoutManager.A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0.A01() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0B(androidx.recyclerview.widget.LinearLayoutManager r301, X.2NQ r302, int r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0B(androidx.recyclerview.widget.LinearLayoutManager, X.2NQ, int, int, boolean):void");
    }

    private void A0C(2NB r302, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                A0v(r302, i);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    A0v(r302, i2);
                }
            }
        }
    }

    private View A1m(boolean z) {
        int A0U;
        int i;
        if (this.A08) {
            A0U = 0;
            i = A0U();
        } else {
            A0U = A0U() - 1;
            i = -1;
        }
        return A06(A0U, i, z, true);
    }

    private View A1n(boolean z) {
        int i;
        int A0U;
        if (this.A08) {
            i = A0U() - 1;
            A0U = -1;
        } else {
            i = 0;
            A0U = A0U();
        }
        return A06(i, A0U, z, true);
    }

    public View A0c(int i) {
        int A0U = A0U();
        if (A0U == 0) {
            return null;
        }
        int A0G = i - 2XA.A0G(A0d(0));
        if (A0G >= 0 && A0G < A0U) {
            View A0d = A0d(A0G);
            if (2XA.A0G(A0d) == i) {
                return A0d;
            }
        }
        return super.A0c(i);
    }

    public int A15(2NB r302, 2NQ r303, int i) {
        if (this.A01 == 1) {
            return 0;
        }
        return A04(r302, r303, i);
    }

    public int A16(2NB r302, 2NQ r303, int i) {
        if (this.A01 == 0) {
            return 0;
        }
        return A04(r302, r303, i);
    }

    public int A1A(2NQ r302) {
        return A01(this, r302);
    }

    public int A1B(2NQ r302) {
        return A02(this, r302);
    }

    public int A1C(2NQ r302) {
        return A03(this, r302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int, androidx.recyclerview.widget.LinearLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int, android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int, androidx.recyclerview.widget.LinearLayoutManager$SavedState, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int, androidx.recyclerview.widget.LinearLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int, androidx.recyclerview.widget.LinearLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.recyclerview.widget.LinearLayoutManager$SavedState, boolean] */
    public Parcelable A1D() {
        SavedState savedState;
        int i;
        if (this.A05 != null) {
            ?? r0 = new Object().A01;
            r0.A01 = r0;
            ?? r02 = r0.A00;
            r02.A00 = r02;
            ?? r03 = r02.A02;
            r03.A02 = r03;
            return r03;
        }
        new Object();
        if (A0U() > 0) {
            A1o();
            boolean z = this.mLastStackFromEnd;
            boolean z2 = this.A08;
            ?? r04 = (z2 ? 1 : 0) ^ (z2 ? 1 : 0);
            r04.A02 = r04;
            if (r04 == 0) {
                ?? A0G = 2XA.A0G(A0d(r04 != 0 ? A0U() - 1 : 0));
                A0G.A01 = A0G;
                2XJ r05 = this.A06;
                r05.A0B(r05);
                int A06 = this.A06.A06();
                ?? r06 = A06 - A06;
                r06.A00 = r06;
                return r06;
            }
            A0d(r04 != 0 ? 0 : A0U() - 1);
            this.A06.A03();
            2XJ r07 = this.A06;
            int A08 = r07.A08(r07);
            ?? r08 = A08 - A08;
            r08.A00 = r08;
            int A0G2 = 2XA.A0G((View) r08);
            i = A0G2;
            savedState = A0G2;
        } else {
            savedState = -1;
            i = -1;
        }
        savedState.A01 = i;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0093, code lost:
    
        if (r301.A08 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        r306 = A0U() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r306 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e8, code lost:
    
        if (r301.A08 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A1E(android.view.View r302, X.2NB r303, X.2NQ r304, int r305) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1E(android.view.View, X.2NB, X.2NQ, int):android.view.View");
    }

    public void A1L(int i) {
        this.A02 = i;
        this.A03 = (-1) << (-1);
        SavedState savedState = this.A05;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A0e();
    }

    public void A1N(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A05 = savedState;
            if (this.A02 != -1) {
                savedState.A01 = -1;
            }
            A0e();
        }
    }

    public void A1O(AccessibilityEvent accessibilityEvent) {
        super.A1O(accessibilityEvent);
        if (A0U() > 0) {
            accessibilityEvent.setFromIndex(A1h());
            accessibilityEvent.setToIndex(A1j());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        if (((X.2XA) r301).A05.A04.contains(r305) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0a6e, code lost:
    
        if (r0 >= r324) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x025b, code lost:
    
        if (r0.A01() != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0407, code lost:
    
        if (r309 <= 0) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1R(X.2NB r302, X.2NQ r303) {
        /*
            Method dump skipped, instructions count: 3075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1R(X.2NB, X.2NQ):void");
    }

    public void A1T(2NQ r302) {
        this.A05 = null;
        this.A02 = -1;
        this.A03 = (-1) << (-1);
        this.A0B.A00();
    }

    public void A1U(2NQ r302, RecyclerView recyclerView, int i) {
        C02833wb c02833wb = new C02833wb(recyclerView.getContext());
        ((AbstractC02843wc) c02833wb).A00 = i;
        A0x(c02833wb);
    }

    public void A1a(String str) {
        if (this.A05 == null) {
            super.A1a(str);
        }
    }

    public boolean A1b() {
        boolean z = false;
        if (this.A01 == 0) {
            z = true;
        }
        return z;
    }

    public boolean A1c() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r301.mLastStackFromEnd != r301.mStackFromEnd) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1d() {
        /*
            r301 = this;
            r0 = r301
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1b
            r0 = r301
            boolean r0 = r0.mLastStackFromEnd
            r303 = r0
            r0 = r301
            boolean r0 = r0.mStackFromEnd
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L20
        L1b:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L20:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1d():boolean");
    }

    public boolean A1e() {
        boolean z = true;
        if (this.A01 != 1) {
            z = false;
        }
        return z;
    }

    public int A1g() {
        View A06 = A06(0, A0U(), true, false);
        if (A06 == null) {
            return -1;
        }
        return 2XA.A0G(A06);
    }

    public int A1h() {
        View A06 = A06(0, A0U(), false, true);
        if (A06 == null) {
            return -1;
        }
        return 2XA.A0G(A06);
    }

    public int A1i() {
        int i = -1;
        View A06 = A06(A0U() - 1, -1, true, false);
        if (A06 != null) {
            i = 2XA.A0G(A06);
        }
        return i;
    }

    public int A1j() {
        int i = -1;
        View A06 = A06(A0U() - 1, -1, false, true);
        if (A06 != null) {
            i = 2XA.A0G(A06);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r301.A01 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r301.A01 == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A1k(int r302) {
        /*
            Method dump skipped, instructions count: 179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1k(int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r0 >= r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        if (r0 <= r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A1l(X.2NB r302, X.2NQ r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1l(X.2NB, X.2NQ, boolean, boolean):android.view.View");
    }

    public void A1o() {
        if (this.A04 == null) {
            this.A04 = new 2Xl();
        }
    }

    public void A1p(int i) {
        if (i != 0 && i != 1) {
            throw 0Pz.A04("invalid orientation:", i);
        }
        A1a((String) null);
        if (i != this.A01 || this.A06 == null) {
            2XJ A00 = 2XJ.A00(this, i);
            this.A06 = A00;
            this.A0B.A02 = A00;
            this.A01 = i;
            A0e();
        }
    }

    public void A1q(2XH r302, 2NB r303, 2NQ r304, int i) {
    }

    public void A1r(2XI r302, 2Xl r303, 2NB r304, 2NQ r305) {
        int A0Z;
        int A0A;
        int i;
        int i2;
        View A01 = r303.A01(r304);
        if (A01 == null) {
            r302.A01 = true;
            return;
        }
        C2lg c2lg = (C2lg) A01.getLayoutParams();
        List list = r303.A09;
        boolean z = this.A08;
        int i3 = r303.A05;
        boolean z2 = false;
        if (list == null) {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                A0j(A01);
            } else {
                A0l(A01, 0);
            }
        } else {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                2XA.A0L(A01, this, -1, true);
            } else {
                2XA.A0L(A01, this, 0, true);
            }
        }
        A0m(A01, 0, 0);
        r302.A00 = this.A06.A09(A01);
        if (this.A01 == 1) {
            if (A1w()) {
                i2 = ((2XA) this).A03 - A0Y();
                i = i2 - this.A06.A0A(A01);
            } else {
                i = A0X();
                i2 = this.A06.A0A(A01) + i;
            }
            int i4 = r303.A05;
            int i5 = r303.A07;
            int i6 = r302.A00;
            A0A = i5 + i6;
            A0Z = i5;
            if (i4 == -1) {
                A0Z = i5 - i6;
                A0A = i5;
            }
        } else {
            A0Z = A0Z();
            A0A = this.A06.A0A(A01) + A0Z;
            int i7 = r303.A05;
            i = r303.A07;
            int i8 = r302.A00;
            i2 = i + i8;
            if (i7 == -1) {
                i2 = i;
                i -= i8;
            }
        }
        2XA.A0J(A01, i, A0Z, i2, A0A);
        if (c2lg.mViewHolder.A08() || c2lg.A01()) {
            r302.A03 = true;
        }
        r302.A02 = A01.hasFocusable();
    }

    public void A1s(2Xl r302, 2NP r303, 2NQ r304) {
        int i = r302.A01;
        if (i < 0 || i >= r304.A00()) {
            return;
        }
        r303.A76(i, Math.max(0, r302.A08));
    }

    public void A1t(2NQ r302, int[] iArr) {
        int A07 = r302.A06 != -1 ? this.A06.A07() : 0;
        int i = 0;
        if (this.A04.A05 != -1) {
            i = A07;
            A07 = 0;
        }
        iArr[0] = A07;
        iArr[1] = i;
    }

    public void A1u(boolean z) {
        A1a((String) null);
        if (z != this.A07) {
            this.A07 = z;
            A0e();
        }
    }

    public void A1v(boolean z) {
        A1a((String) null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            A0e();
        }
    }

    public boolean A1w() {
        boolean z = true;
        if (((2XA) this).A07.getLayoutDirection() != 1) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [float] */
    public PointF AHD(int i) {
        if (A0U() == 0) {
            return null;
        }
        boolean z = false;
        2XA.A0G(A0d(0));
        int i2 = 1;
        if (i < 1) {
            z = true;
        }
        boolean z2 = this.A08;
        boolean z3 = z;
        if (z3 != z3) {
            i2 = -1;
        }
        int i3 = this.A01;
        ?? r0 = i2;
        return r0 == 0 ? new PointF(r0, 0.0f) : new PointF(0.0f, r0);
    }

    public void Cjt(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        SavedState savedState = this.A05;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A0e();
    }
}
