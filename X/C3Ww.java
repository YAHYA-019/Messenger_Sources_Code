package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.3Ww, reason: invalid class name */
/* loaded from: 3Ww.class */
public final class C3Ww implements C3lr {
    public final String A00;

    public C3Ww(String str, List list) {
        if (list != null && !list.isEmpty()) {
            throw new C4EG("Mismatching number of values", str);
        }
        this.A00 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    @Override // X.C3lr
    public boolean Bcy(2Hy r302) {
        String str = r302.A02;
        try {
            switch (str.hashCode()) {
                case -1838656495:
                    if (str.equals("STRING")) {
                        return this.A00.equals(r302.toString().toLowerCase(Locale.US));
                    }
                    return false;
                case 72655:
                    if (str.equals("INT")) {
                        return Double.parseDouble(this.A00) == ((double) r302.A01);
                    }
                    return false;
                case 2044650:
                    if (!str.equals("BOOL")) {
                        return false;
                    }
                    boolean z = r302.A03;
                    return AnonymousClass001.A1Q(Boolean.parseBoolean(this.A00) ? 1 : 0, z ? 1 : 0);
                case 66988604:
                    if (str.equals("FLOAT")) {
                        return Double.parseDouble(this.A00) == r302.A01();
                    }
                    return false;
                default:
                    return false;
            }
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // X.C3lr
    public String getName() {
        return this.A00;
    }
}
