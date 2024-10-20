package X;

import java.util.List;

/* renamed from: X.3Wy, reason: invalid class name */
/* loaded from: 3Wy.class */
public final class C3Wy implements C3lr {
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;

    public C3Wy(String str, String str2, List list) {
        this.A03 = str;
        this.A02 = str2;
        boolean z = -1;
        switch (str2.hashCode()) {
            case 98322:
                if (str2.equals("ccr")) {
                    z = false;
                    break;
                }
                break;
            case 98694:
                if (str2.equals("cor")) {
                    z = true;
                    break;
                }
                break;
            case 109854:
                if (str2.equals("ocr")) {
                    z = 2;
                    break;
                }
                break;
            case 110226:
                if (str2.equals("oor")) {
                    z = 3;
                    break;
                }
                break;
        }
        int size = list.size();
        switch (z) {
            case false:
            case true:
            case true:
            case true:
                if (size != 2) {
                    throw new C4EG("Mismatching number of values", str);
                }
                try {
                    double parseDouble = Double.parseDouble(1BK.A14(list, 0));
                    this.A00 = parseDouble;
                    double parseDouble2 = Double.parseDouble(1BK.A14(list, 1));
                    this.A01 = parseDouble2;
                    if (parseDouble >= parseDouble2) {
                        throw new C4EG("Bad values order", str);
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new C4EG("Bad number format", str);
                }
            default:
                if (size != 1) {
                    throw new C4EG("Mismatching number of values", str);
                }
                try {
                    this.A00 = Double.parseDouble(1BK.A14(list, 0));
                    return;
                } catch (NumberFormatException unused2) {
                    throw new C4EG("Bad number format", str);
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // X.C3lr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bcy(X.2Hy r302) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Wy.Bcy(X.2Hy):boolean");
    }

    @Override // X.C3lr
    public String getName() {
        return this.A03;
    }
}
