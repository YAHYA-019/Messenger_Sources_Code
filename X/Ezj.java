package X;

import org.json.JSONException;

/* loaded from: Ezj.class */
public final class Ezj {
    public Float A00;
    public final 1Br A03 = 1BK.A0C();
    public final 1Br A01 = 7zM.A0N();
    public final 1Br A02 = 1Bq.A00(99939);

    public final float A00() {
        if (this.A00 == null) {
            try {
                String string = DKC.A1F(1Br.A07(this.A03).BDB(1GD.A07, 36873977863405819L)).getString("default");
                if (string != null) {
                    this.A00 = Float.valueOf(Float.parseFloat(string));
                }
            } catch (NumberFormatException | JSONException e) {
                0fH.A0r("MusicPickerConfig", "Exception while fetching the target loudness value", e);
                return -18.0f;
            }
        }
        Float f = this.A00;
        if (f != null) {
            return f.floatValue();
        }
        throw 1BK.A0h();
    }

    public final boolean A01() {
        boolean z = false;
        if (!((1vL) 1Br.A0B(this.A02)).A0S()) {
            2yD A07 = 1Br.A07(this.A03);
            1GD r0 = 1GD.A05;
            if (A07.AZr(r0, 36311792414166439L) || 1Br.A07(this.A01).AZr(r0, 2378183899294470412L)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean A02() {
        return 2yD.A03(1Br.A07(this.A03), 36318410958910024L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if ((!X.11T.A0O(r302, "FB_LASSO_BLUE")) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A01()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r301
            X.1Br r0 = r0.A01
            r304 = r0
            r0 = r304
            X.2yD r0 = X.1Br.A07(r0)
            r305 = r0
            r0 = 72340890080841997(0x10101a80001110d, double:7.749765368754361E-304)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            java.lang.String r0 = "FB_LASSO_BLUE"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = X.11T.A0O(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 != 0) goto L3e
        L3a:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L3e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ezj.A03(java.lang.String):boolean");
    }
}
