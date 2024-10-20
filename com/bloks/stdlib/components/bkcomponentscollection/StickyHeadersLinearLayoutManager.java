package com.bloks.stdlib.components.bkcomponentscollection;

import X.11T;
import X.1BL;
import X.2NB;
import X.2NQ;
import X.2XA;
import X.2Xd;
import X.4YV;
import X.AnonymousClass001;
import X.C0s8;
import X.C2lb;
import X.DSj;
import X.DSm;
import X.LGo;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: StickyHeadersLinearLayoutManager.class */
public final class StickyHeadersLinearLayoutManager extends LinearLayoutManager {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public DSj A04;
    public final List A05;
    public final DSm A06;

    /* loaded from: StickyHeadersLinearLayoutManager$SavedState.class */
    public final class SavedState implements Parcelable {
        public static final LGo CREATOR = LGo.A00(46);
        public final int A00;
        public final int A01;
        public final Parcelable A02;

        public SavedState(Parcel parcel) {
            this((SavedState) (Build.VERSION.SDK_INT >= 33 ? parcel.readParcelable(SavedState.class.getClassLoader(), SavedState.class) : 1BL.A0C(parcel, SavedState.class)), parcel.readInt(), parcel.readInt());
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            this.A02 = parcelable;
            this.A01 = i;
            this.A00 = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeParcelable(this.A02, i);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
        }
    }

    public StickyHeadersLinearLayoutManager(Context context, int i) {
        super(context, i, false);
        this.A05 = AnonymousClass001.A0s();
        this.A06 = new DSm(this);
        this.A02 = -1;
        this.A01 = -1;
    }

    private final int A00(int i) {
        int i2;
        List list = this.A05;
        int A04 = AnonymousClass001.A04(list);
        int i3 = 0;
        while (true) {
            if (i3 > A04) {
                i2 = -1;
                break;
            }
            i2 = (i3 + A04) / 2;
            if (AnonymousClass001.A03(list.get(i2)) <= i) {
                if (i2 >= AnonymousClass001.A04(list)) {
                    break;
                }
                i3 = i2 + 1;
                if (AnonymousClass001.A03(list.get(i3)) > i) {
                    break;
                }
            } else {
                A04 = i2 - 1;
            }
        }
        return i2;
    }

    public static final int A04(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i) {
        int i2;
        List list = stickyHeadersLinearLayoutManager.A05;
        int A04 = AnonymousClass001.A04(list);
        int i3 = 0;
        while (true) {
            if (i3 > A04) {
                i2 = -1;
                break;
            }
            i2 = (i3 + A04) / 2;
            if (i2 > 0) {
                int i4 = i2 - 1;
                if (AnonymousClass001.A03(list.get(i4)) >= i) {
                    A04 = i4;
                }
            }
            if (AnonymousClass001.A03(list.get(i2)) >= i) {
                break;
            }
            i3 = i2 + 1;
        }
        return i2;
    }

    private final void A05() {
        View view = this.A03;
        if (view != null) {
            2XA.A0K(view, this, -1);
        }
    }

    private final void A06() {
        int A05;
        View view = this.A03;
        if (view == null || (A05 = ((2XA) this).A05.A05(view)) < 0) {
            return;
        }
        ((2XA) this).A05.A08(A05);
    }

    private final void A07(View view) {
        A0m(view, 0, 0);
        if (super.A01 == 1) {
            view.layout(A0X(), 0, ((2XA) this).A03 - A0Y(), view.getMeasuredHeight());
        } else {
            view.layout(0, A0Z(), view.getMeasuredWidth(), ((2XA) this).A00 - A0W());
        }
    }

    private final void A08(2Xd r302) {
        DSj dSj = this.A04;
        if (dSj != null) {
            dSj.D5v(this.A06);
        }
        if (!(r302 instanceof DSj)) {
            this.A04 = null;
            this.A05.clear();
        } else {
            this.A04 = (DSj) r302;
            DSm dSm = this.A06;
            r302.CcA(dSm);
            dSm.A01();
        }
    }

    public static final void A09(2NB r301, StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null) {
            stickyHeadersLinearLayoutManager.A03 = null;
            stickyHeadersLinearLayoutManager.A02 = -1;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            C2lb A09 = RecyclerView.A09(view);
            A09.A00 &= -129;
            A09.A05();
            A09.A00 |= 4;
            stickyHeadersLinearLayoutManager.A0k(view);
            if (r301 != null) {
                r301.A09(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x018a, code lost:
    
        if (r319 < r314) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0562, code lost:
    
        if ((r319 + r320) > 0.0f) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0C(X.2NB r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 1679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.A0C(X.2NB, boolean):void");
    }

    public void A0y(RecyclerView recyclerView) {
        A08(recyclerView.A0C);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A15(2NB r302, 2NQ r303, int i) {
        1BL.A1F(r302, r303);
        A06();
        int A15 = super.A15(r302, r303, i);
        A05();
        if (A15 != 0) {
            A0C(r302, false);
        }
        return A15;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A16(2NB r302, 2NQ r303, int i) {
        1BL.A1F(r302, r303);
        A06();
        int A16 = super.A16(r302, r303, i);
        A05();
        if (A16 != 0) {
            A0C(r302, false);
        }
        return A16;
    }

    public int A17(2NQ r302) {
        11T.A0F(r302, 0);
        A06();
        int A01 = LinearLayoutManager.A01(this, r302);
        A05();
        return A01;
    }

    public int A18(2NQ r302) {
        11T.A0F(r302, 0);
        A06();
        int A02 = LinearLayoutManager.A02(this, r302);
        A05();
        return A02;
    }

    public int A19(2NQ r302) {
        11T.A0F(r302, 0);
        A06();
        int A03 = LinearLayoutManager.A03(this, r302);
        A05();
        return A03;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1A(2NQ r302) {
        11T.A0F(r302, 0);
        A06();
        int A01 = LinearLayoutManager.A01(this, r302);
        A05();
        return A01;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1B(2NQ r302) {
        11T.A0F(r302, 0);
        A06();
        int A02 = LinearLayoutManager.A02(this, r302);
        A05();
        return A02;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1C(2NQ r302) {
        11T.A0F(r302, 0);
        A06();
        int A03 = LinearLayoutManager.A03(this, r302);
        A05();
        return A03;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public Parcelable A1D() {
        return new SavedState(super.A1D(), this.A01, this.A00);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View A1E(View view, 2NB r303, 2NQ r304, int i) {
        4YV.A1N(view, r303);
        11T.A0F(r304, 3);
        A06();
        View A1E = super.A1E(view, r303, r304, i);
        A05();
        return A1E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1L(int i) {
        Cjt(i, (-1) << (-1));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1N(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A01 = savedState.A01;
            this.A00 = savedState.A00;
            parcelable = savedState.A02;
        }
        super.A1N(parcelable);
    }

    public void A1P(2Xd r302, 2Xd r303) {
        A08(r303);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1R(2NB r302, 2NQ r303) {
        boolean A1W = 1BL.A1W(r302, r303);
        A06();
        super.A1R(r302, r303);
        A05();
        if (r303.A08) {
            return;
        }
        A0C(r302, A1W);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public PointF AHD(int i) {
        A06();
        PointF AHD = super.AHD(i);
        A05();
        return AHD;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Cjt(int i, int i2) {
        int i3 = (-1) << (-1);
        this.A01 = -1;
        this.A00 = i3;
        int A00 = A00(i);
        if (A00 != -1) {
            List list = this.A05;
            if (C0s8.A0z(Integer.valueOf(i), list, list.size()) < 0) {
                int i4 = i - 1;
                if (C0s8.A0z(Integer.valueOf(i4), list, list.size()) >= 0) {
                    super.Cjt(i4, i2);
                    return;
                }
                View view = this.A03;
                if (view != null) {
                    int A0z = C0s8.A0z(Integer.valueOf(this.A02), list, list.size());
                    if (A0z < 0) {
                        A0z = -1;
                    }
                    if (A00 == A0z) {
                        if (i2 == i3) {
                            i2 = 0;
                        }
                        i2 += super.A01 == 1 ? view.getHeight() : view.getWidth();
                    }
                }
                this.A01 = i;
                this.A00 = i2;
            }
        }
        super.Cjt(i, i2);
    }
}
