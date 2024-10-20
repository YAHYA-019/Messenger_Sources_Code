package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Gjm, reason: case insensitive filesystem */
/* loaded from: Gjm.class */
public final class C2634Gjm extends C04v {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C2634Gjm(int i) {
        this.A03 = i;
        this.A03 = 2;
        ImmutableList A0b = 1BK.A0b();
        this.A03 = 2;
        this.A02 = A0b;
        this.A01 = 0;
        this.A00 = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2634Gjm(int i, int i2) {
        this(C0ty.A00, i, i2, 1);
        this.A03 = 1;
    }

    public C2634Gjm(int i, int i2, Object obj) {
        this.A03 = 3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = obj;
    }

    public C2634Gjm(ImmutableList immutableList, int i) {
        this.A03 = 2;
        this.A03 = 2;
        this.A02 = immutableList;
        this.A01 = 0;
        this.A00 = i;
    }

    public C2634Gjm(Integer num, int i, int i2) {
        this.A03 = 4;
        11T.A0F(num, 1);
        this.A02 = num;
        this.A01 = i;
        this.A00 = i2;
    }

    public C2634Gjm(List list, int i, int i2, int i3) {
        this.A03 = i3;
        if (i3 != 0) {
            this.A01 = i;
            this.A00 = i2;
        } else {
            this.A00 = i;
            this.A01 = i2;
        }
        this.A02 = list;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2634Gjm.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int hashCode() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2634Gjm.hashCode():int");
    }

    public String toString() {
        String str;
        if (4 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RoundedCornerRenderData(renderType=");
        Number number = (Number) this.A02;
        if (number != null) {
            switch (number.intValue()) {
                case 1:
                    str = "MASK";
                    break;
                case 2:
                    str = "NONE";
                    break;
                default:
                    str = "OVERLAY";
                    break;
            }
        } else {
            str = "null";
        }
        A0k.append(str);
        A0k.append(", radius=");
        A0k.append(this.A01);
        A0k.append(DKB.A00(34));
        return DKH.A0p(A0k, this.A00);
    }
}
