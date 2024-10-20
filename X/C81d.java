package X;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

/* renamed from: X.81d, reason: invalid class name */
/* loaded from: 81d.class */
public final class C81d {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C6dC A06;
    public final int[] A07;
    public final int[] A08;
    public final LinkedList[] A09;
    public final Point A0A;
    public final int[] A0B;

    public C81d(Point point, C6dC c6dC, int i) {
        int i2;
        this.A06 = c6dC;
        this.A05 = i;
        this.A0A = point;
        boolean z = c6dC.isHorizontal;
        int i3 = point.y;
        if (z) {
            this.A04 = i3;
            int i4 = point.x;
            this.A01 = ((int) Math.ceil((i * 1.0d) / 2.0d)) + i4;
            this.A00 = i3;
            i2 = i4 - (i / 2);
        } else {
            this.A04 = i3 - (i / 2);
            i2 = point.x;
            this.A01 = i2;
            this.A00 = i3 + ((int) Math.ceil((i * 1.0d) / 2.0d));
        }
        this.A03 = i2;
        int size = 6dD.A00.size();
        int[] iArr = new int[size];
        this.A08 = iArr;
        int[] iArr2 = new int[size];
        this.A07 = iArr2;
        int[] iArr3 = new int[size];
        this.A0B = iArr3;
        LinkedList[] linkedListArr = new LinkedList[size];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= size) {
                this.A09 = linkedListArr;
                return;
            }
            iArr[i6] = 0;
            iArr2[i6] = this.A05;
            iArr3[i6] = (-1) >>> 1;
            linkedListArr[i6] = new LinkedList();
            i5 = i6 + 1;
        }
    }

    public final C81d A00(View view) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        6dB layoutParams = view.getLayoutParams();
        11T.A0I(layoutParams, "null cannot be cast to non-null type com.facebook.video.plugins.common.AnchorLayout.LayoutParams");
        6dB r0 = layoutParams;
        int measuredWidth = ((ViewGroup.MarginLayoutParams) r0).leftMargin + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r0).rightMargin;
        int measuredHeight = ((ViewGroup.MarginLayoutParams) r0).topMargin + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
        C6dC c6dC = this.A06;
        int i6 = measuredHeight;
        if (c6dC.isHorizontal) {
            i6 = measuredWidth;
            measuredWidth = measuredHeight;
        }
        int[] iArr = this.A07;
        int ordinal = r0.A04.ordinal();
        if (i6 <= iArr[ordinal]) {
            int i7 = r0.A00;
            int[] iArr2 = this.A0B;
            if (i7 <= iArr2[ordinal]) {
                iArr2[ordinal] = i7;
                if (measuredWidth > this.A02) {
                    this.A02 = measuredWidth;
                    switch (c6dC.ordinal()) {
                        case 2:
                        case 6:
                            this.A04 = this.A00 - measuredWidth;
                            break;
                        case 3:
                        case 7:
                            this.A01 = this.A03 + measuredWidth;
                            break;
                        case 4:
                        case 8:
                            this.A03 = this.A01 - measuredWidth;
                            break;
                        case 5:
                        default:
                            this.A00 = this.A04 + measuredWidth;
                            break;
                    }
                }
                int[] iArr3 = this.A08;
                iArr3[ordinal] = iArr3[ordinal] + i6;
                iArr[ordinal] = iArr[ordinal] - i6;
                if (ordinal == 0) {
                    this.A09[ordinal].addLast(view);
                    int max = Math.max(iArr3[0], iArr3[1]);
                    z = 2;
                    i3 = this.A05;
                    i4 = i3 - (max * 2);
                } else {
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            return null;
                        }
                        this.A09[ordinal].addFirst(view);
                        int i8 = iArr3[2];
                        int i9 = this.A05;
                        iArr[0] = (i8 > 0 ? (i9 - i8) / 2 : i9 - iArr3[1]) - iArr3[0];
                        z2 = 2;
                        i5 = i9 - (Math.max(iArr3[0], iArr3[1]) * 2);
                        iArr[z2 ? 1 : 0] = i5 - iArr3[z2 ? 1 : 0];
                        return null;
                    }
                    this.A09[ordinal].addLast(view);
                    boolean z3 = false;
                    int i10 = iArr3[2];
                    i3 = this.A05;
                    if (i10 > 0) {
                        i4 = (i3 - i10) / 2;
                        z = z3;
                    } else {
                        i4 = i3 - iArr3[1];
                        z = z3;
                    }
                }
                iArr[z ? 1 : 0] = i4 - iArr3[z ? 1 : 0];
                boolean z4 = true;
                int i11 = iArr3[2];
                if (i11 > 0) {
                    i5 = (i3 - i11) / 2;
                    z2 = z4;
                } else {
                    i5 = i3 - iArr3[0];
                    z2 = z4;
                }
                iArr[z2 ? 1 : 0] = i5 - iArr3[z2 ? 1 : 0];
                return null;
            }
        }
        switch (c6dC.ordinal()) {
            case 2:
            case 6:
                i = this.A0A.x;
                i2 = this.A04;
                break;
            case 3:
            case 7:
                i = this.A01;
                i2 = this.A0A.y;
                break;
            case 4:
            case 8:
                i = this.A03;
                i2 = this.A0A.y;
                break;
            case 5:
            default:
                i = this.A0A.x;
                i2 = this.A00;
                break;
        }
        C81d c81d = new C81d(new Point(i, i2), c6dC, Math.max(this.A05, i6));
        c81d.A00(view);
        return c81d;
    }
}
