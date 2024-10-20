package X;

import java.util.ArrayList;

/* renamed from: X.Ggm, reason: case insensitive filesystem */
/* loaded from: Ggm.class */
public final class C2538Ggm extends ETq {
    public final Hqj A00;
    public final I9d A01;
    public final Hqo A02;
    public final RM5 A03;
    public final JJL A04;
    public final JNB A05;
    public final java.util.Map A06;

    public C2538Ggm(RM5 rm5, Hqj hqj, I9d i9d, Hqo hqo, JJL jjl, JNB jnb, java.util.Map map) {
        this.A00 = hqj;
        this.A04 = jjl;
        this.A02 = hqo;
        this.A01 = i9d;
        this.A03 = rm5;
        this.A05 = jnb;
        this.A06 = map;
    }

    public void A00() {
        this.A04.onFailure(new Exception("settings call canceled"));
    }

    public void A02(Exception exc, java.util.Map map, int i, boolean z) {
        ArrayList A0z = 7zO.A0z(exc, 0);
        if (A0z.isEmpty()) {
            RM5 rm5 = this.A03;
            JIC jic = rm5.A01;
            HLd.A00(jic, exc, "media_upload_fetch_upload_settings_failure", rm5.A02, jic.now() - rm5.A00);
        }
        Hqo hqo = this.A02;
        A0z.addAll(hqo.A00.Agu(this.A00, this.A01, hqo));
        this.A04.Bpt(A0z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r313 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.String r302, int r303, java.util.Map r304) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2538Ggm.A03(java.lang.String, int, java.util.Map):void");
    }
}
