package X;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: DqL.class */
public final class DqL extends C04v {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DqL() {
        this(AnonymousClass001.A0s(), 0, 5);
        this.A02 = 5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DqL(int i) {
        this();
        this.A02 = i;
    }

    public DqL(int i, int i2, Object obj) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = obj;
    }

    public DqL(2EU r302, int i) {
        this.A02 = 1;
        this.A01 = r302;
        this.A00 = i;
    }

    public DqL(EM0 em0, int i) {
        this.A02 = 2;
        this.A00 = i;
        this.A01 = em0;
    }

    public DqL(LinkedHashMap linkedHashMap, int i) {
        this.A02 = 0;
        this.A00 = i;
        this.A01 = linkedHashMap;
    }

    public DqL(List list, int i, int i2) {
        this.A02 = i2;
        if (3 - i2 != 0) {
            11T.A0F(list, 1);
        }
        this.A01 = list;
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0135 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DqL.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int i;
        Object obj;
        int hashCode;
        switch (this.A02) {
            case 0:
            case 2:
            case 4:
                i = this.A00 * 31;
                obj = this.A01;
                hashCode = obj.hashCode();
                return i + hashCode;
            case 1:
            case 3:
            case 5:
                i = 1BL.A03(this.A01);
                hashCode = this.A00;
                return i + hashCode;
            case 6:
                i = this.A00 * 31;
                obj = this.A01;
                if (obj == null) {
                    hashCode = 0;
                    return i + hashCode;
                }
                hashCode = obj.hashCode();
                return i + hashCode;
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public String toString() {
        StringBuilder A0k;
        String str;
        switch (this.A02) {
            case 1:
                A0k = AnonymousClass001.A0k();
                A0k.append("SizedValue(value=");
                A0k.append(this.A01);
                A0k.append(", size=");
                A0k.append(this.A00);
                return 4YV.A0x(A0k);
            case 2:
                A0k = AnonymousClass001.A0k();
                A0k.append("MerlinVisibilityUpdate(pct=");
                A0k.append(this.A00);
                str = ", status=";
                A0k.append(str);
                A0k.append(this.A01);
                return 4YV.A0x(A0k);
            case 6:
                A0k = AnonymousClass001.A0k();
                A0k.append("VersionResult(version=");
                A0k.append(this.A00);
                str = ", reason=";
                A0k.append(str);
                A0k.append(this.A01);
                return 4YV.A0x(A0k);
            default:
                return super.toString();
        }
    }
}
