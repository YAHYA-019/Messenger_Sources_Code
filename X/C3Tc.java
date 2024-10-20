package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;

/* renamed from: X.3Tc, reason: invalid class name */
/* loaded from: 3Tc.class */
public final class C3Tc {
    public static final C03z A06 = C03z.A00();
    public final C15h A00;
    public final C15h A01;
    public final C15h A02;
    public final C15h A03;
    public final C15h A04;
    public final C15h A05;

    public C3Tc(C15h c15h, C15h c15h2, C15h c15h3, C15h c15h4, C15h c15h5, C15h c15h6) {
        this.A03 = c15h;
        this.A05 = c15h2;
        this.A01 = c15h3;
        this.A02 = c15h4;
        this.A04 = c15h5;
        this.A00 = c15h6;
    }

    public static 1CO A00(C3Tc c3Tc, int i) {
        C15h c15h;
        if (i != 0) {
            if (i == 1) {
                c15h = c3Tc.A05;
            } else if (i != 2 && i != 3) {
                if (i != 4) {
                    throw AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("%d is not a MobileConfigUnitType", Integer.valueOf(i)));
                }
                c15h = c3Tc.A01;
            }
            return (1CO) c15h.get();
        }
        c15h = c3Tc.A03;
        return (1CO) c15h.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ff, code lost:
    
        if ((r304 instanceof X.1Dy) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
    
        if (r0 >= 16384) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b A[Catch: IOException -> 0x0335, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0335, blocks: (B:2:0x0000, B:3:0x0004, B:5:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0023, B:12:0x002a, B:14:0x0030, B:16:0x0045, B:19:0x0053, B:20:0x005c, B:23:0x0067, B:27:0x0076, B:28:0x007d, B:33:0x0094, B:37:0x00a2, B:42:0x00cc, B:45:0x00d8, B:46:0x00df, B:47:0x00e6, B:54:0x0115, B:56:0x0124, B:58:0x012b, B:60:0x0134, B:62:0x013b, B:66:0x014e, B:67:0x0157, B:70:0x0166, B:72:0x016d, B:73:0x0172, B:74:0x0179, B:75:0x0180, B:77:0x018b, B:79:0x0191, B:82:0x019b, B:84:0x01a4, B:85:0x01aa, B:88:0x01b3, B:91:0x01c0, B:93:0x01cf, B:95:0x01d5, B:97:0x01df, B:98:0x01e8, B:103:0x02e9, B:105:0x02f8, B:107:0x0304, B:113:0x0212, B:114:0x021b, B:121:0x025c, B:123:0x0269, B:125:0x0274, B:129:0x028d, B:130:0x0296, B:132:0x02a5, B:133:0x02ac, B:134:0x02b3, B:135:0x02ba, B:137:0x02dc, B:144:0x00b7, B:146:0x00c3, B:150:0x030f, B:151:0x0314, B:152:0x0319, B:152:0x0319, B:155:0x031f, B:156:0x0325, B:158:0x032c, B:160:0x0331), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b3 A[Catch: IOException -> 0x0335, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0335, blocks: (B:2:0x0000, B:3:0x0004, B:5:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0023, B:12:0x002a, B:14:0x0030, B:16:0x0045, B:19:0x0053, B:20:0x005c, B:23:0x0067, B:27:0x0076, B:28:0x007d, B:33:0x0094, B:37:0x00a2, B:42:0x00cc, B:45:0x00d8, B:46:0x00df, B:47:0x00e6, B:54:0x0115, B:56:0x0124, B:58:0x012b, B:60:0x0134, B:62:0x013b, B:66:0x014e, B:67:0x0157, B:70:0x0166, B:72:0x016d, B:73:0x0172, B:74:0x0179, B:75:0x0180, B:77:0x018b, B:79:0x0191, B:82:0x019b, B:84:0x01a4, B:85:0x01aa, B:88:0x01b3, B:91:0x01c0, B:93:0x01cf, B:95:0x01d5, B:97:0x01df, B:98:0x01e8, B:103:0x02e9, B:105:0x02f8, B:107:0x0304, B:113:0x0212, B:114:0x021b, B:121:0x025c, B:123:0x0269, B:125:0x0274, B:129:0x028d, B:130:0x0296, B:132:0x02a5, B:133:0x02ac, B:134:0x02b3, B:135:0x02ba, B:137:0x02dc, B:144:0x00b7, B:146:0x00c3, B:150:0x030f, B:151:0x0314, B:152:0x0319, B:152:0x0319, B:155:0x031f, B:156:0x0325, B:158:0x032c, B:160:0x0331), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A01(X.C3lW r301, java.util.Collection r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Tc.A01(X.3lW, java.util.Collection, boolean):java.lang.String");
    }

    public static HashMap A02(1CP r301, long j) {
        HashMap A0u = AnonymousClass001.A0u();
        int i = (int) ((j >>> 48) & 63);
        1GD r0 = 1GD.A07;
        1GD A01 = 1GD.A01(r0);
        A01.A03 = true;
        A0u.put("value", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNSUPPORTED TYPE" : String.valueOf(r301.AiH(A01, j)) : ((j >>> 60) & 1) == 1 ? r301.BDC(r0, "__fbt_null__", j) : r301.BDB(r0, j) : String.valueOf(r301.Av9(A01, j)) : String.valueOf(r301.AZr(A01, j)));
        MobileConfigValueSource mobileConfigValueSource = A01.A01.A00;
        int ordinal = mobileConfigValueSource.ordinal();
        if (ordinal != 1 && ordinal != 0) {
            A0u.put(Property.SYMBOL_Z_ORDER_SOURCE, ordinal != 2 ? 0Pz.A0d("default[", "]", mobileConfigValueSource.getSource()) : "override");
        }
        return A0u;
    }
}
