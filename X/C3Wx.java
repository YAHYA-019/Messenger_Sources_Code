package X;

import java.util.List;

/* renamed from: X.3Wx, reason: invalid class name */
/* loaded from: 3Wx.class */
public final class C3Wx implements C3lr {
    public final String A00;
    public final String A01;

    public C3Wx(String str, String str2, List list) {
        if (list != null && !list.isEmpty()) {
            throw new C4EG("Mismatching number of values", str);
        }
        this.A00 = str;
        this.A01 = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0039. Please report as an issue. */
    @Override // X.C3lr
    public boolean Bcy(2Hy r302) {
        String str = this.A01;
        boolean z = true;
        boolean z2 = -1;
        switch (str.hashCode()) {
            case 3392903:
                if (str.equals("null")) {
                    z2 = false;
                    break;
                }
                break;
            case 104980213:
                if (str.equals("nnull")) {
                    z2 = true;
                    break;
                }
                break;
            case 1509016093:
                if (str.equals("catch_all")) {
                    z2 = 2;
                    break;
                }
                break;
        }
        switch (z2) {
            case false:
                z = "NULL".equals(r302.A02);
                return z;
            case true:
                return !"NULL".equals(r302.A02);
            case true:
                return z;
            default:
                return false;
        }
    }

    @Override // X.C3lr
    public String getName() {
        return this.A00;
    }
}
