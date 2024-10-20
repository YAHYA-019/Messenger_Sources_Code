package X;

import java.util.List;

/* loaded from: Fxl.class */
public final class Fxl implements GOd {
    public final EoO A00;
    public final EkI A01;
    public final Object[] A02;
    public final Object[] A03;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r304.length > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Fxl(X.EoO r302, X.EkI r303, java.lang.Object[] r304, java.lang.Object[] r305) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = r304
            int r0 = r0.length
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 <= 0) goto L31
        L2e:
            r0 = 1
            r307 = r0
        L31:
            r0 = r307
            java.lang.String r1 = "boundArgs must not be empty; use null"
            X.EYu.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fxl.<init>(X.EoO, X.EkI, java.lang.Object[], java.lang.Object[]):void");
    }

    @Override // X.GJj
    public /* bridge */ /* synthetic */ GJj AIE(GJy gJy, List list) {
        EkI ekI = this.A01;
        if (ekI != null) {
            GJy gJy2 = ekI.A00;
            if (gJy != null && gJy2 != null) {
                gJy2 = gJy2.BcB(gJy);
            }
            EkI ekI2 = (null == ekI.A01 && gJy2 == gJy2) ? ekI : new EkI(gJy2, (List) null);
            if (ekI2 != ekI) {
                return new Fxl(this.A00, ekI2, this.A02, this.A03);
            }
        }
        return this;
    }

    @Override // X.GOd
    public void AQZ(EWn eWn) {
    }

    @Override // X.GJj
    public String B9C() {
        return this.A00.A03.A00;
    }

    @Override // X.GJj
    public GJy BBh() {
        EkI ekI = this.A01;
        if (ekI == null) {
            return null;
        }
        return ekI.A00;
    }

    @Override // X.GOd
    public Fxl D6L() {
        return this;
    }
}
