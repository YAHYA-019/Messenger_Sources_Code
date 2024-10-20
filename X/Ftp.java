package X;

import android.net.Uri;

/* loaded from: Ftp.class */
public final class Ftp implements GGj {
    public final EmX A00;

    public Ftp(EmX emX) {
        this.A00 = emX;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        Ejw ejw;
        EES ees = (AbstractC10314t5) obj;
        if (ees instanceof EES) {
            EES ees2 = ees;
            EmX emX = this.A00;
            String str = ees2.A01;
            F6v f6v = ees2.A00;
            if (!DKE.A1Y(emX.A01)) {
                if (((C7b) emX.A00.get()).A00(f6v.A0B, f6v.A01, f6v.A00, f6v.A0L, f6v.A0N) != null) {
                    ejw = new Ejw("", false);
                    r302.ANn(new EEc(ees2, ejw));
                }
            }
            Uri.Builder buildUpon = C0A2.A03(str).buildUpon();
            String str2 = f6v.A0C;
            if (str2 != null && 1BK.A0N(emX.A02).AZk(2342164190426316772L)) {
                buildUpon.appendQueryParameter("c", str2);
            }
            buildUpon.appendQueryParameter("hc", String.valueOf(7zM.A03(1BK.A0R(((C7b) emX.A00.get()).A00), 5SH.A0B)));
            ejw = new Ejw(buildUpon.toString(), true);
            r302.ANn(new EEc(ees2, ejw));
        }
    }
}
