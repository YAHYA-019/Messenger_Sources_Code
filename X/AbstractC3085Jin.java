package X;

/* renamed from: X.Jin, reason: case insensitive filesystem */
/* loaded from: Jin.class */
public abstract class AbstractC3085Jin extends KTD {
    public int A00;
    public int A01;
    public String A02;
    public L7S[] A03;

    public AbstractC3085Jin() {
        this.A03 = null;
        this.A01 = 0;
    }

    public AbstractC3085Jin(AbstractC3085Jin abstractC3085Jin) {
        this.A03 = null;
        this.A01 = 0;
        this.A02 = abstractC3085Jin.A02;
        this.A00 = abstractC3085Jin.A00;
        L7S[] l7sArr = abstractC3085Jin.A03;
        int length = l7sArr.length;
        L7S[] l7sArr2 = new L7S[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                this.A03 = l7sArr2;
                return;
            } else {
                l7sArr2[i2] = new L7S(l7sArr[i2]);
                i = i2 + 1;
            }
        }
    }

    public L7S[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public void setPathData(L7S[] l7sArr) {
        int length;
        int length2;
        L7S[] l7sArr2 = this.A03;
        if (l7sArr2 != null && l7sArr != null && (length = l7sArr2.length) == (length2 = l7sArr.length)) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    for (int i3 = 0; i3 < length2; i3++) {
                        l7sArr2[i3].A00 = l7sArr[i3].A00;
                        int i4 = 0;
                        while (true) {
                            int i5 = i4;
                            if (i5 < l7sArr[i3].A01.length) {
                                l7sArr2[i3].A01[i5] = l7sArr[i3].A01[i5];
                                i4 = i5 + 1;
                            }
                        }
                    }
                    return;
                }
                if (l7sArr2[i2].A00 != l7sArr[i2].A00 || l7sArr2[i2].A01.length != l7sArr[i2].A01.length) {
                    break;
                } else {
                    i = i2 + 1;
                }
            }
        }
        int length3 = l7sArr.length;
        L7S[] l7sArr3 = new L7S[length3];
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= length3) {
                this.A03 = l7sArr3;
                return;
            } else {
                l7sArr3[i7] = new L7S(l7sArr[i7]);
                i6 = i7 + 1;
            }
        }
    }
}
