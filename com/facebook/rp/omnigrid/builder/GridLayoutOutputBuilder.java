package com.facebook.rp.omnigrid.builder;

import X.0Pz;
import X.0S2;
import X.0fH;
import X.4YV;
import X.AnonymousClass001;
import X.C2626GjK;
import X.C2628GjQ;
import X.C2632Gji;
import X.DKC;
import X.HNP;
import X.HNQ;
import X.HNR;
import X.Hwa;
import android.graphics.Rect;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;
import com.facebook.rtc.views.omnigrid.GridLayoutInputItem;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: GridLayoutOutputBuilder.class */
public final class GridLayoutOutputBuilder {
    public int contentHeight;
    public int contentWidth;
    public int floatingSelfViewDisplayMode;
    public boolean floatingSelfViewMinimizable;
    public int floatingSelfViewSize;
    public int[] itemData;
    public final GridLayoutInput layoutInput;
    public int[] scrollExclusionAreaData;

    public GridLayoutOutputBuilder(GridLayoutInput gridLayoutInput) {
        this.layoutInput = gridLayoutInput;
    }

    public final C2632Gji build() {
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        int i2;
        Integer num4;
        int i3;
        int i4;
        int size = this.layoutInput.items.size();
        ArrayList A0t = AnonymousClass001.A0t(size);
        int[] iArr = this.itemData;
        if (iArr == null || iArr.length != size * 8) {
            0fH.A0k("GridLayoutOutputBuilder", 0Pz.A0F(size, "Invalid itemData: ", Arrays.toString(iArr), ", itemCount: "));
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                long j = ((GridLayoutInputItem) this.layoutInput.items.get(i5)).id;
                int i6 = i5 * 8;
                int i7 = iArr[i6];
                int i8 = iArr[i6 + 1];
                int i9 = iArr[i6 + 2];
                int i10 = iArr[i6 + 3];
                int i11 = iArr[i6 + 4];
                int i12 = iArr[i6 + 5];
                int i13 = iArr[i6 + 6];
                int i14 = iArr[i6 + 7];
                C2626GjK c2626GjK = new C2626GjK(i7, i8, i9 + i7, i10 + i8);
                Integer[] numArr = HNR.A00;
                int length = numArr.length;
                int i15 = 0;
                while (true) {
                    if (i15 < length) {
                        num3 = numArr[i15];
                        switch (num3.intValue()) {
                            case 1:
                                i4 = 1;
                                break;
                            case 2:
                                i4 = 2;
                                break;
                            case 3:
                                i4 = 3;
                                break;
                            case 4:
                                i4 = 4;
                                break;
                            case 5:
                                i4 = 5;
                                break;
                            case 6:
                                i4 = 6;
                                break;
                            default:
                                i4 = 0;
                                break;
                        }
                        if (i4 != i11) {
                            i15++;
                        }
                    } else {
                        num3 = 0S2.A00;
                    }
                }
                boolean A1P = AnonymousClass001.A1P(i14);
                Integer[] numArr2 = Hwa.A00;
                int length2 = numArr2.length;
                while (true) {
                    if (i2 < length2) {
                        num4 = numArr2[i2];
                        switch (num4.intValue()) {
                            case 1:
                                i3 = 1;
                                break;
                            case 2:
                                i3 = 2;
                                break;
                            default:
                                i3 = 0;
                                break;
                        }
                        i2 = i3 != i12 ? i2 + 1 : 0;
                    } else {
                        num4 = 0S2.A00;
                    }
                }
                A0t.add(new C2628GjQ(c2626GjK, num3, num4, i13, j, A1P));
            }
        }
        int i16 = this.contentHeight;
        GridLayoutInput gridLayoutInput = this.layoutInput;
        boolean A1X = i16 > gridLayoutInput.height ? 2 : 4YV.A1X(this.contentWidth, gridLayoutInput.width);
        int[] iArr2 = this.scrollExclusionAreaData;
        Rect rect = null;
        if (iArr2 != null && iArr2[2] > 0 && iArr2[3] > 0) {
            rect = DKC.A0C();
            int i17 = iArr2[0];
            rect.left = i17;
            int i18 = iArr2[1];
            rect.top = i18;
            rect.right = i17 + iArr2[2];
            rect.bottom = i18 + iArr2[3];
        }
        int i19 = this.contentWidth;
        int i20 = this.contentHeight;
        int i21 = this.floatingSelfViewDisplayMode;
        Integer[] numArr3 = HNP.A00;
        int length3 = numArr3.length;
        int i22 = 0;
        while (true) {
            if (i22 < length3) {
                num = numArr3[i22];
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != i21) {
                    i22++;
                }
            } else {
                num = 0S2.A00;
            }
        }
        boolean z = this.floatingSelfViewMinimizable;
        int i23 = this.floatingSelfViewSize;
        Integer[] numArr4 = HNQ.A00;
        int length4 = numArr4.length;
        int i24 = 0;
        while (true) {
            if (i24 < length4) {
                num2 = numArr4[i24];
                if ((1 - num2.intValue() != 0 ? 0 : 1) != i23) {
                    i24++;
                }
            } else {
                num2 = 0S2.A00;
            }
        }
        return new C2632Gji(rect, this.layoutInput.config.selfViewLocation, num, num2, null, A0t, null, i19, i20, A1X ? 1 : 0, z);
    }
}
