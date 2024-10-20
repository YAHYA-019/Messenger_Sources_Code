package androidx.recyclerview.widget;

import X.2NB;
import X.2NP;
import X.2NQ;
import X.2Nm;
import X.2XA;
import X.2XB;
import X.2XJ;
import X.2Xd;
import X.4YV;
import X.AbstractC02843wc;
import X.AnonymousClass001;
import X.C02833wb;
import X.C2lg;
import X.C2rb;
import X.C3063Jhx;
import X.DKC;
import X.JQx;
import X.JQy;
import X.KqT;
import X.Kqk;
import X.L8y;
import X.LBW;
import X.LGo;
import X.Ljx;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: StaggeredGridLayoutManager.class */
public class StaggeredGridLayoutManager extends 2XA implements 2XB {
    public int A00;
    public int A02;
    public int A05;
    public 2XJ A07;
    public 2XJ A08;
    public SavedState A0A;
    public boolean A0B;
    public boolean A0C;
    public LBW[] A0G;
    public BitSet A0H;
    public int[] A0J;
    public final Kqk A0L;
    public int A06 = -1;
    public boolean A0D = false;
    public boolean A0E = false;
    public int A03 = -1;
    public int A04 = (-1) << (-1);
    public L8y A09 = new Object();
    public int A01 = 2;
    public final Rect A0K = DKC.A0C();
    public final KqT A0M = new KqT(this);
    public boolean A0I = false;
    public boolean A0F = true;
    public final Runnable A0N = new Ljx(this);

    /* loaded from: StaggeredGridLayoutManager$SavedState.class */
    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = LGo.A00(28);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public List A04;
        public boolean A05;
        public boolean A06;
        public boolean A07;
        public int[] A08;
        public int[] A09;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A02);
            if (this.A02 > 0) {
                parcel.writeIntArray(this.A09);
            }
            parcel.writeInt(this.A01);
            if (this.A01 > 0) {
                parcel.writeIntArray(this.A08);
            }
            parcel.writeInt(this.A07 ? 1 : 0);
            parcel.writeInt(this.A05 ? 1 : 0);
            parcel.writeInt(this.A06 ? 1 : 0);
            parcel.writeList(this.A04);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.L8y, java.lang.Object] */
    public StaggeredGridLayoutManager(int i, int i2) {
        this.A02 = i2;
        A0H(i);
        this.A0L = new Kqk();
        this.A07 = 2XJ.A00(this, this.A02);
        this.A08 = 2XJ.A00(this, 1 - this.A02);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.L8y, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Nm.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        int i4 = obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        if (i3 != 0 && i3 != 1) {
            throw AnonymousClass001.A0L("invalid orientation.");
        }
        A1a((String) null);
        if (i3 != this.A02) {
            this.A02 = i3;
            2XJ r0 = this.A07;
            this.A07 = this.A08;
            this.A08 = r0;
            A0e();
        }
        A0H(i4);
        A1g(z);
        this.A0L = new Kqk();
        this.A07 = 2XJ.A00(this, this.A02);
        this.A08 = 2XJ.A00(this, 1 - this.A02);
    }

    private int A01() {
        int i = 0;
        if (A0U() != 0) {
            i = 2XA.A0G(A0d(0));
        }
        return i;
    }

    private int A02() {
        int A0U = A0U();
        if (A0U == 0) {
            return 0;
        }
        return 2XA.A0G(A0d(A0U - 1));
    }

    private int A03(int i) {
        int A05 = this.A0G[0].A05(i);
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (i3 >= this.A06) {
                return A05;
            }
            int A052 = this.A0G[i3].A05(i);
            if (A052 > A05) {
                A05 = A052;
            }
            i2 = i3 + 1;
        }
    }

    private int A04(int i) {
        int A06 = this.A0G[0].A06(i);
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (i3 >= this.A06) {
                return A06;
            }
            int A062 = this.A0G[i3].A06(i);
            if (A062 < A06) {
                A06 = A062;
            }
            i2 = i3 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0104, code lost:
    
        if (r0 >= r304.A00()) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x076a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0493  */
    /* JADX WARN: Type inference failed for: r0v298, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v523, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A05(X.Kqk r302, X.2NB r303, X.2NQ r304) {
        /*
            Method dump skipped, instructions count: 2667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A05(X.Kqk, X.2NB, X.2NQ):int");
    }

    private int A06(2NB r302, 2NQ r303, int i) {
        if (A0U() == 0 || i == 0) {
            return 0;
        }
        A0P(r303, i);
        Kqk kqk = this.A0L;
        int A05 = A05(kqk, r302, r303);
        if (kqk.A00 >= A05) {
            i = A05;
            if (i < 0) {
                i = -A05;
            }
        }
        this.A07.A0E(-i);
        this.A0B = this.A0E;
        kqk.A00 = 0;
        A0N(kqk, r302);
        return i;
    }

    private int A07(2NQ r302) {
        if (A0U() == 0) {
            return 0;
        }
        2XJ r0 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C2rb.A02(A0A(z2), A09(z2), r0, this, r302, z, this.A0E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004a, code lost:
    
        if (X.4YV.A1U(((X.2XA) r301).A07.getLayoutDirection()) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View A08() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A08():android.view.View");
    }

    private View A09(boolean z) {
        2XJ r0 = this.A07;
        int A06 = r0.A06();
        int A03 = r0.A03();
        View view = null;
        for (int A0U = A0U() - 1; A0U >= 0; A0U--) {
            View A0d = A0d(A0U);
            int A0B = r0.A0B(A0d);
            int A08 = r0.A08(A0d);
            if (A08 > A06 && A0B < A03) {
                if (A08 <= A03 || !z) {
                    return A0d;
                }
                if (view == null) {
                    view = A0d;
                }
            }
        }
        return view;
    }

    private View A0A(boolean z) {
        View A0d;
        2XJ r0 = this.A07;
        int A06 = r0.A06();
        int A03 = r0.A03();
        int A0U = A0U();
        View view = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A0U) {
                return view;
            }
            A0d = A0d(i2);
            int A0B = r0.A0B(A0d);
            if (r0.A08(A0d) > A06 && A0B < A03) {
                if (A0B >= A06 || !z) {
                    break;
                }
                if (view == null) {
                    view = A0d;
                }
            }
            i = i2 + 1;
        }
        return A0d;
    }

    private void A0B() {
        this.A0E = (this.A02 == 1 || !4YV.A1U(((2XA) this).A07.getLayoutDirection())) ? this.A0D : !this.A0D;
    }

    private void A0C(int i) {
        Kqk kqk = this.A0L;
        kqk.A04 = i;
        int i2 = 1;
        if (this.A0E != AnonymousClass001.A1Q(i, -1)) {
            i2 = -1;
        }
        kqk.A03 = i2;
    }

    private void A0H(int i) {
        A1a((String) null);
        if (i == this.A06) {
            return;
        }
        this.A09.A03();
        A0e();
        this.A06 = i;
        this.A0H = new BitSet(i);
        LBW[] lbwArr = new LBW[i];
        this.A0G = lbwArr;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                A0e();
                return;
            } else {
                lbwArr[i3] = new LBW(this, i3);
                i2 = i3 + 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r0 == (-1)) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0N(X.Kqk r302, X.2NB r303) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0N(X.Kqk, X.2NB):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0987, code lost:
    
        if (r307 > 0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x09ef, code lost:
    
        if (A1h() == false) goto L246;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0O(X.2NB r302, X.2NQ r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 2967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0O(X.2NB, X.2NQ, boolean):void");
    }

    private void A0P(2NQ r302, int i) {
        int A01;
        int i2;
        if (i > 0) {
            A01 = A02();
            i2 = 1;
        } else {
            A01 = A01();
            i2 = -1;
        }
        Kqk kqk = this.A0L;
        kqk.A07 = true;
        A0Q(r302, A01);
        A0C(i2);
        kqk.A01 = A01 + kqk.A03;
        kqk.A00 = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        if (r0.A0P == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.A05 == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0Q(X.2NQ r302, int r303) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0Q(X.2NQ, int):void");
    }

    private void A0R(LBW lbw, int i, int i2) {
        int i3 = lbw.A02;
        if (i == -1) {
            int i4 = lbw.A01;
            if (i4 == ((-1) << (-1))) {
                LBW.A02(lbw);
                i4 = lbw.A01;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = lbw.A00;
            if (i5 == ((-1) << (-1))) {
                LBW.A01(lbw);
                i5 = lbw.A00;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A0H.set(lbw.A04, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0S(androidx.recyclerview.widget.StaggeredGridLayoutManager r301, int r302, int r303, int r304) {
        /*
            r0 = r301
            boolean r0 = r0.A0E
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lae
            r0 = r301
            int r0 = r0.A02()
            r306 = r0
        L11:
            r0 = 8
            r307 = r0
            r0 = r304
            r1 = r307
            if (r0 != r1) goto La3
            r0 = r303
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto La8
            r0 = r302
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            r0 = r303
            r309 = r0
        L2d:
            r0 = r301
            X.L8y r0 = r0.A09
            r310 = r0
            r0 = r310
            r1 = r309
            r0.A05(r1)
            r0 = 1
            r311 = r0
            r0 = r304
            r1 = r311
            if (r0 == r1) goto L99
            r0 = 2
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L8f
            r0 = r304
            r1 = r307
            if (r0 != r1) goto L62
            r0 = r310
            r1 = r302
            r2 = r311
            r0.A07(r1, r2)
            r0 = r310
            r1 = r303
            r2 = r311
            r0.A06(r1, r2)
        L62:
            r0 = r308
            r1 = r306
            if (r0 <= r1) goto L85
            r0 = r301
            boolean r0 = r0.A0E
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L86
            r0 = r301
            int r0 = r0.A01()
            r305 = r0
        L7a:
            r0 = r309
            r1 = r305
            if (r0 > r1) goto L85
            r0 = r301
            r0.A0e()
        L85:
            return
        L86:
            r0 = r301
            int r0 = r0.A02()
            r305 = r0
            goto L7a
        L8f:
            r0 = r310
            r1 = r302
            r2 = r303
            r0.A07(r1, r2)
            goto L62
        L99:
            r0 = r310
            r1 = r302
            r2 = r303
            r0.A06(r1, r2)
            goto L62
        La3:
            r0 = r302
            r1 = r303
            int r0 = r0 + r1
            r308 = r0
        La8:
            r0 = r302
            r309 = r0
            goto L2d
        Lae:
            r0 = r301
            int r0 = r0.A01()
            r306 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0S(androidx.recyclerview.widget.StaggeredGridLayoutManager, int, int, int):void");
    }

    private boolean A0T(int i) {
        if (this.A02 == 0) {
            return AnonymousClass001.A1Q(i, -1) != this.A0E;
        }
        return AnonymousClass001.A1Q(AnonymousClass001.A1Q(i, -1) ? 1 : 0, this.A0E ? 1 : 0) == 4YV.A1U(((2XA) this).A07.getLayoutDirection());
    }

    public int A15(2NB r302, 2NQ r303, int i) {
        return A06(r302, r303, i);
    }

    public int A16(2NB r302, 2NQ r303, int i) {
        return A06(r302, r303, i);
    }

    public int A17(2NQ r302) {
        if (A0U() == 0) {
            return 0;
        }
        2XJ r0 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C2rb.A00(A0A(z2), A09(z2), r0, this, r302, z);
    }

    public int A18(2NQ r302) {
        return A07(r302);
    }

    public int A19(2NQ r302) {
        if (A0U() == 0) {
            return 0;
        }
        2XJ r0 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C2rb.A01(A0A(z2), A09(z2), r0, this, r302, z);
    }

    public int A1A(2NQ r302) {
        if (A0U() == 0) {
            return 0;
        }
        2XJ r0 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C2rb.A00(A0A(z2), A09(z2), r0, this, r302, z);
    }

    public int A1B(2NQ r302) {
        return A07(r302);
    }

    public int A1C(2NQ r302) {
        if (A0U() == 0) {
            return 0;
        }
        2XJ r0 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C2rb.A01(A0A(z2), A09(z2), r0, this, r302, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c0  */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int[], androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.LBW[]] */
    /* JADX WARN: Type inference failed for: r0v28, types: [int, X.LBW] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, boolean] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44, types: [int[], androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v45, types: [int, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, X.L8y] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v47, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [int, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int[], androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v54, types: [int[], androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v55, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.List, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Parcelable A1D() {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1D():android.os.Parcelable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01a3, code lost:
    
        if (X.4YV.A1U(((X.2XA) r301).A07.getLayoutDirection()) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c8, code lost:
    
        if (X.4YV.A1U(((X.2XA) r301).A07.getLayoutDirection()) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A1E(android.view.View r302, X.2NB r303, X.2NQ r304, int r305) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1E(android.view.View, X.2NB, X.2NQ, int):android.view.View");
    }

    public C2lg A1F() {
        int i = -1;
        int i2 = -2;
        if (this.A02 == 0) {
            i = -2;
            i2 = -1;
        }
        return new C2lg(i, i2);
    }

    public C2lg A1G(Context context, AttributeSet attributeSet) {
        return new C2lg(context, attributeSet);
    }

    public C2lg A1H(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2lg((ViewGroup.MarginLayoutParams) layoutParams) : new C2lg(layoutParams);
    }

    public void A1I(int i) {
        super.A1I(i);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.A06) {
                return;
            }
            LBW lbw = this.A0G[i3];
            int i4 = lbw.A01;
            int i5 = (-1) << (-1);
            if (i4 != i5) {
                lbw.A01 = i4 + i;
            }
            int i6 = lbw.A00;
            if (i6 != i5) {
                lbw.A00 = i6 + i;
            }
            i2 = i3 + 1;
        }
    }

    public void A1J(int i) {
        super.A1J(i);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.A06) {
                return;
            }
            LBW lbw = this.A0G[i3];
            int i4 = lbw.A01;
            int i5 = (-1) << (-1);
            if (i4 != i5) {
                lbw.A01 = i4 + i;
            }
            int i6 = lbw.A00;
            if (i6 != i5) {
                lbw.A00 = i6 + i;
            }
            i2 = i3 + 1;
        }
    }

    public void A1K(int i) {
        if (i == 0) {
            A1h();
        }
    }

    public void A1L(int i) {
        SavedState savedState = this.A0A;
        if (savedState != null && savedState.A00 != i) {
            savedState.A09 = null;
            savedState.A02 = 0;
            savedState.A00 = -1;
            savedState.A03 = -1;
        }
        this.A03 = i;
        this.A04 = (-1) << (-1);
        A0e();
    }

    public void A1M(Rect rect, int i, int i2) {
        int A0D;
        int A0D2;
        int A0X = A0X() + A0Y();
        int A0Z = A0Z() + A0W();
        if (this.A02 == 1) {
            A0D2 = 2XA.A0D(i2, rect.height() + A0Z, ((2XA) this).A07.getMinimumHeight());
            A0D = 2XA.A0D(i, (this.A05 * this.A06) + A0X, ((2XA) this).A07.getMinimumWidth());
        } else {
            A0D = 2XA.A0D(i, rect.width() + A0X, ((2XA) this).A07.getMinimumWidth());
            A0D2 = 2XA.A0D(i2, (this.A05 * this.A06) + A0Z, ((2XA) this).A07.getMinimumHeight());
        }
        ((2XA) this).A07.setMeasuredDimension(A0D, A0D2);
    }

    public void A1N(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A0A = savedState;
            if (this.A03 != -1) {
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A00 = -1;
                savedState.A03 = -1;
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A01 = 0;
                savedState.A08 = null;
                savedState.A04 = null;
            }
            A0e();
        }
    }

    public void A1O(AccessibilityEvent accessibilityEvent) {
        super.A1O(accessibilityEvent);
        if (A0U() > 0) {
            View A0A = A0A(false);
            View A09 = A09(false);
            if (A0A == null || A09 == null) {
                return;
            }
            int A0G = 2XA.A0G(A0A);
            int A0G2 = 2XA.A0G(A09);
            if (A0G < A0G2) {
                accessibilityEvent.setFromIndex(A0G);
                accessibilityEvent.setToIndex(A0G2);
            } else {
                accessibilityEvent.setFromIndex(A0G2);
                accessibilityEvent.setToIndex(A0G);
            }
        }
    }

    public void A1P(2Xd r302, 2Xd r303) {
        this.A09.A03();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A06) {
                return;
            }
            this.A0G[i2].A08();
            i = i2 + 1;
        }
    }

    public void A1Q(2NP r302, 2NQ r303, int i, int i2) {
        Kqk kqk;
        int i3;
        int A05;
        int i4;
        if (this.A02 != 0) {
            i = i2;
        }
        if (A0U() == 0 || i == 0) {
            return;
        }
        A0P(r303, i);
        int[] iArr = this.A0J;
        if (iArr == null || iArr.length < this.A06) {
            this.A0J = new int[this.A06];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.A06; i6++) {
            Kqk kqk2 = this.A0L;
            if (kqk2.A03 == -1) {
                A05 = kqk2.A05;
                i4 = this.A0G[i6].A06(A05);
            } else {
                A05 = this.A0G[i6].A05(kqk2.A02);
                i4 = kqk2.A02;
            }
            int i7 = A05 - i4;
            if (i7 >= 0) {
                this.A0J[i5] = i7;
                i5++;
            }
        }
        Arrays.sort(this.A0J, 0, i5);
        for (int i8 = 0; i8 < i5 && (i3 = (kqk = this.A0L).A01) >= 0 && i3 < r303.A00(); i8++) {
            r302.A76(i3, this.A0J[i8]);
            kqk.A01 += kqk.A03;
        }
    }

    public void A1R(2NB r302, 2NQ r303) {
        A0O(r302, r303, true);
    }

    public void A1S(2NB r302, RecyclerView recyclerView) {
        A0z(recyclerView);
        Runnable runnable = this.A0N;
        RecyclerView recyclerView2 = ((2XA) this).A07;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.A06; i++) {
            this.A0G[i].A08();
        }
        recyclerView.requestLayout();
    }

    public void A1T(2NQ r302) {
        this.A03 = -1;
        this.A04 = (-1) << (-1);
        this.A0A = null;
        this.A0M.A00();
    }

    public void A1U(2NQ r302, RecyclerView recyclerView, int i) {
        C02833wb c02833wb = new C02833wb(recyclerView.getContext());
        ((AbstractC02843wc) c02833wb).A00 = i;
        A0x(c02833wb);
    }

    public void A1V(RecyclerView recyclerView) {
        this.A09.A03();
        A0e();
    }

    public void A1W(RecyclerView recyclerView, int i, int i2) {
        A0S(this, i, i2, 1);
    }

    public void A1X(RecyclerView recyclerView, int i, int i2) {
        A0S(this, i, i2, 2);
    }

    public void A1Y(RecyclerView recyclerView, int i, int i2, int i3) {
        A0S(this, i, i2, 8);
    }

    public void A1Z(RecyclerView recyclerView, Object obj, int i, int i2) {
        A0S(this, i, i2, 4);
    }

    public void A1a(String str) {
        if (this.A0A == null) {
            super.A1a(str);
        }
    }

    public boolean A1b() {
        return AnonymousClass001.A1O(this.A02);
    }

    public boolean A1c() {
        return AnonymousClass001.A1N(this.A01);
    }

    public boolean A1d() {
        return AnonymousClass001.A1U(this.A0A);
    }

    public boolean A1e() {
        return 4YV.A1U(this.A02);
    }

    public boolean A1f(C2lg c2lg) {
        return c2lg instanceof C3063Jhx;
    }

    public void A1g(boolean z) {
        A1a((String) null);
        SavedState savedState = this.A0A;
        if (savedState != null && savedState.A07 != z) {
            savedState.A07 = z;
        }
        this.A0D = z;
        A0e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        r0 = -r308;
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r0 = r0.size();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        r310 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (r310 >= r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        r0 = X.L8y.A00(r0, r310);
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
    
        if (r0 >= r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
    
        if (r0 < r304) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        if (r0 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        if (r0.A00 == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        if (r0.A02 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012a, code lost:
    
        r302 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
    
        r0.A04(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        r0 = r310 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0141, code lost:
    
        r302 = r0.A01;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1h() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1h():boolean");
    }

    public int[] A1i(int[] iArr) {
        int i;
        int size;
        int[] iArr2 = new int[this.A06];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.A06) {
                return iArr2;
            }
            LBW lbw = this.A0G[i3];
            if (lbw.A05.A0D) {
                i = JQx.A0L(lbw.A03, 1);
                size = -1;
            } else {
                i = 0;
                size = lbw.A03.size();
            }
            iArr2[i3] = LBW.A00(lbw, i, size, true, true, false);
            i2 = i3 + 1;
        }
    }

    public int[] A1j(int[] iArr) {
        int i;
        if (iArr == null) {
            iArr = new int[this.A06];
        } else {
            int length = iArr.length;
            int i2 = this.A06;
            if (length < i2) {
                throw JQy.A0i("Provided int[]'s size must be more than or equal to span count. Expected:", ", array size:", i2, length);
            }
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.A06) {
                return iArr;
            }
            LBW lbw = this.A0G[i4];
            boolean z = lbw.A05.A0D;
            int size = lbw.A03.size();
            if (z) {
                i = size - 1;
                size = -1;
            } else {
                i = 0;
            }
            iArr[i4] = LBW.A00(lbw, i, size, false, true, false);
            i3 = i4 + 1;
        }
    }

    public int[] A1k(int[] iArr) {
        int A0L;
        int i;
        if (iArr == null) {
            iArr = new int[this.A06];
        } else {
            int length = iArr.length;
            int i2 = this.A06;
            if (length < i2) {
                throw JQy.A0i("Provided int[]'s size must be more than or equal to span count. Expected:", ", array size:", i2, length);
            }
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.A06) {
                return iArr;
            }
            LBW lbw = this.A0G[i4];
            if (lbw.A05.A0D) {
                A0L = 0;
                i = lbw.A03.size();
            } else {
                A0L = JQx.A0L(lbw.A03, 1);
                i = -1;
            }
            iArr[i4] = LBW.A00(lbw, A0L, i, true, true, false);
            i3 = i4 + 1;
        }
    }

    public int[] A1l(int[] iArr) {
        int i;
        if (iArr == null) {
            iArr = new int[this.A06];
        } else {
            int length = iArr.length;
            int i2 = this.A06;
            if (length < i2) {
                throw JQy.A0i("Provided int[]'s size must be more than or equal to span count. Expected:", ", array size:", i2, length);
            }
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.A06) {
                return iArr;
            }
            LBW lbw = this.A0G[i4];
            boolean z = lbw.A05.A0D;
            int size = lbw.A03.size();
            if (z) {
                i = 0;
            } else {
                i = size - 1;
                size = -1;
            }
            iArr[i4] = LBW.A00(lbw, i, size, false, true, false);
            i3 = i4 + 1;
        }
    }

    public PointF AHD(int i) {
        int i2 = -1;
        if (A0U() != 0 ? AnonymousClass001.A1R(i, A01()) == this.A0E : this.A0E) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.A02 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }
}
