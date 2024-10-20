package X;

import com.facebook.zero.cms.ZeroCmsUtil;
import com.google.common.collect.ImmutableList;

/* renamed from: X.423, reason: invalid class name */
/* loaded from: 423.class */
public final class AnonymousClass423 {
    public final C00i A03 = new 1BQ(16922);
    public final C00i A01 = new 1BQ(16385);
    public final C00i A02 = new 1BQ(49293);
    public final C00i A04 = new 1BQ(99939);
    public final C00i A05 = new 1BV(33101);
    public final C00i A00 = new 1BQ(33013);

    public F98 A00() {
        2BX r0 = (2BX) this.A05.get();
        ImmutableList A00 = F2L.A00(1BK.A0R(r0.A01).A3a((1G2) 2BX.A01(2BX.A02(r0)).A0D(1BJ.A00(2161)), ""));
        if (A00.isEmpty()) {
            return null;
        }
        return (F98) 1BK.A0r(A00);
    }

    public String A01() {
        ZeroCmsUtil zeroCmsUtil;
        int i;
        String str;
        if (((2BQ) this.A03.get()).A04("zero_state")) {
            zeroCmsUtil = (ZeroCmsUtil) this.A02.get();
            i = 2131958519;
            str = "jumpstart_banner_control";
        } else {
            boolean A0L = ((1vL) this.A04.get()).A0L();
            zeroCmsUtil = (ZeroCmsUtil) this.A02.get();
            if (A0L) {
                i = 2131952750;
                str = "all_free_data_banner";
            } else {
                i = 2131956960;
                str = "flex_banner_free_mode_title_short";
            }
        }
        return zeroCmsUtil.A03(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map A02() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A00
            com.facebook.prefs.shared.FbSharedPreferences r0 = X.1BK.A0R(r0)
            r302 = r0
            r0 = 98565(0x18105, float:1.38119E-40)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.1Ky r0 = (X.1Ky) r0
            X.01i r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.1G2 r0 = (X.1G2) r0
            r303 = r0
            java.lang.String r0 = ""
            r304 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            java.lang.String r0 = r0.A3a(r1, r2)
            r302 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L5d
            X.243 r0 = X.AnonymousClass243.A00()     // Catch: java.io.IOException -> L50
            r303 = r0
            X.EEu r0 = new X.EEu     // Catch: java.io.IOException -> L50
            r304 = r0
            r0 = r304
            r1 = r301
            r0.<init>(r1)     // Catch: java.io.IOException -> L50
            r0 = r303
            r1 = r304
            r2 = r302
            java.lang.Object r0 = r0.A0Q(r1, r2)     // Catch: java.io.IOException -> L50
            r304 = r0
            r0 = r304
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.io.IOException -> L50
            r304 = r0
            goto L62
        L50:
            r302 = move-exception
            java.lang.String r0 = "BannerUtils"
            r303 = r0
            java.lang.String r0 = "Error deserializing banner notifications content map"
            r304 = r0
            r0 = r303
            r1 = r304
            r2 = r302
            X.0fH.A0r(r0, r1, r2)
        L5d:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L62:
            r0 = r304
            if (r0 != 0) goto L6a
            java.util.HashMap r0 = X.AnonymousClass001.A0u()
            r304 = r0
        L6a:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass423.A02():java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (X.1BK.A0N(r301.A01).AZk(36310675731841917L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.2BQ r0 = (X.2BQ) r0
            r302 = r0
            java.lang.String r0 = "product_autoflex"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.A04(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3c
            r0 = r301
            X.00i r0 = r0.A01
            r303 = r0
            r0 = r303
            X.2yD r0 = X.1BK.A0N(r0)
            r305 = r0
            r0 = 36310675731841917(0x81005e008d037d, double:3.026355771947705E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 1
            r304 = r0
            r0 = r308
            if (r0 != 0) goto L40
        L3c:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L40:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass423.A03():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (X.1BK.A0N(r301.A01).AZk(36310675731776380L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.2BQ r0 = (X.2BQ) r0
            r302 = r0
            java.lang.String r0 = "product_flex"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.A04(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3c
            r0 = r301
            X.00i r0 = r0.A01
            r303 = r0
            r0 = r303
            X.2yD r0 = X.1BK.A0N(r0)
            r305 = r0
            r0 = 36310675731776380(0x81005e008c037c, double:3.026355771906259E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 1
            r304 = r0
            r0 = r308
            if (r0 != 0) goto L40
        L3c:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L40:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass423.A04():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (X.1BK.A0N(r301.A01).AZk(36310675731907454L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A03
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.2BQ r0 = (X.2BQ) r0
            r303 = r0
            java.lang.String r0 = "special_pricing_free_photo_banner"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.A04(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L37
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.2BQ r0 = (X.2BQ) r0
            r303 = r0
            java.lang.String r0 = "special_pricing_free_photo_video_banner"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.A04(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L58
        L37:
            r0 = r301
            X.00i r0 = r0.A01
            r304 = r0
            r0 = r304
            X.2yD r0 = X.1BK.A0N(r0)
            r302 = r0
            r0 = 36310675731907454(0x81005e008e037e, double:3.026355771989151E-306)
            r306 = r0
            r0 = r302
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 1
            r305 = r0
            r0 = r308
            if (r0 != 0) goto L5d
        L58:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L5d:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass423.A05():boolean");
    }

    public boolean A06() {
        C00i c00i = this.A03;
        return (((2BQ) c00i.get()).A04("freemium_models_banner") || ((2BQ) c00i.get()).A04("freemium_models_fup_banner") || ((2BQ) c00i.get()).A04("zorp_paid_mode_banner")) && 1BK.A0N(this.A01).AZk(2342153684944814966L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (((X.2BQ) r301.A03.get()).A04("ppu_upgrade") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A01
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1BK.A0N(r0)
            r303 = r0
            r0 = 36323590689278740(0x810c1d00004b14, double:3.0345232430351113E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L3d
            r0 = r301
            X.00i r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.2BQ r0 = (X.2BQ) r0
            r307 = r0
            r0 = r307
            java.lang.String r1 = "ppu_upgrade"
            boolean r0 = r0.A04(r1)
            r308 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
            r0 = r308
            if (r0 == 0) goto L40
        L3d:
            r0 = 1
            r306 = r0
        L40:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass423.A07():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (X.1BK.A0N(r301.A01).AZk(36323839797382398L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A07()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L25
            r0 = r301
            X.00i r0 = r0.A01
            X.2yD r0 = X.1BK.A0N(r0)
            r303 = r0
            r0 = 36323839797382398(0x810c5700004cfe, double:3.0346807800029425E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 0
            r302 = r0
            r0 = r306
            if (r0 == 0) goto L27
        L25:
            r0 = 1
            r302 = r0
        L27:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass423.A08():boolean");
    }
}
