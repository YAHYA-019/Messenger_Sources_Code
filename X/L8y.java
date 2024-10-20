package X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.Arrays;
import java.util.List;

/* loaded from: L8y.class */
public final class L8y {
    public List A00;
    public int[] A01;

    public static StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00(L8y l8y, int i) {
        return (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) l8y.A00.get(i);
    }

    public static void A01(L8y l8y, int i) {
        int[] iArr = l8y.A01;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            l8y.A01 = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i >= length) {
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            l8y.A01 = iArr3;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            int[] iArr4 = l8y.A01;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A02(int i) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00;
        List list = this.A00;
        if (list == null) {
            return null;
        }
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            A00 = A00(this, size);
        } while (A00.A01 != i);
        return A00;
    }

    public void A03() {
        int[] iArr = this.A01;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.A00 = null;
    }

    public void A04(int i) {
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (A00(this, size).A01 >= i) {
                    this.A00.remove(size);
                }
            }
        }
        A05(i);
    }

    public void A05(int i) {
        int[] iArr;
        int length;
        int[] iArr2 = this.A01;
        if (iArr2 == null || i >= iArr2.length) {
            return;
        }
        if (this.A00 != null) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A02 = A02(i);
            if (A02 != null) {
                this.A00.remove(A02);
            }
            int size = this.A00.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (A00(this, i2).A01 < i) {
                    i2++;
                } else if (i2 != -1) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00 = A00(this, i2);
                    this.A00.remove(i2);
                    int i3 = A00.A01;
                    if (i3 != -1) {
                        iArr = this.A01;
                        length = Math.min(i3 + 1, iArr.length);
                    }
                }
            }
        }
        iArr = this.A01;
        length = iArr.length;
        Arrays.fill(iArr, i, length, -1);
    }

    public void A06(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        A01(this, i3);
        int[] iArr2 = this.A01;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.A01, i, i3, -1);
        List list = this.A00;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00 = A00(this, size);
            int i4 = A00.A01;
            if (i4 >= i) {
                A00.A01 = i4 + i2;
            }
        }
    }

    public void A07(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        A01(this, i3);
        int[] iArr2 = this.A01;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.A01;
        int length = iArr3.length;
        Arrays.fill(iArr3, length - i2, length, -1);
        List list = this.A00;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00 = A00(this, size);
            int i4 = A00.A01;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.A00.remove(size);
                } else {
                    A00.A01 = i4 - i2;
                }
            }
        }
    }

    public void A08(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        List list = this.A00;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A00 = list;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                this.A00.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00 = A00(this, i2);
            if (A00.A01 == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01) {
                this.A00.remove(i2);
            }
            if (A00.A01 >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01) {
                this.A00.add(i2, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
            i = i2 + 1;
        }
    }
}
