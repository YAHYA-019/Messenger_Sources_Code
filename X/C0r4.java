package X;

import com.facebook.common.dextricks.classid.ClassId;

/* renamed from: X.0r4, reason: invalid class name */
/* loaded from: 0r4.class */
public final class C0r4 implements 0eQ {
    public final /* synthetic */ int[] A00;

    public C0r4(int[] iArr) {
        this.A00 = iArr;
    }

    public void AF3(String str, Class cls) {
        11T.A0F(str, 0);
        int dexSignature = ClassId.getDexSignature(cls);
        int[] iArr = this.A00;
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            if (dexSignature == iArr[i2]) {
                0Lw.A02.add(cls);
                0Lx r0 = 0Lw.A01;
                r0.A02 = str;
                if (r0.A01.length() == 0) {
                    r0.A01 = str;
                }
                r0.A00++;
            }
            i = i2 + 1;
        }
    }

    public void AF4(String str) {
    }

    public void AF5(String str) {
    }
}
