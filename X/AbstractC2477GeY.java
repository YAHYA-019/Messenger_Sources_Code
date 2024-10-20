package X;

/* renamed from: X.GeY, reason: case insensitive filesystem */
/* loaded from: GeY.class */
public abstract class AbstractC2477GeY extends 1RM {
    public final /* synthetic */ IF4 A00;

    public AbstractC2477GeY(IF4 if4) {
        this.A00 = if4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fa, code lost:
    
        if (r312 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2477GeY.A02(java.lang.Object):void");
    }

    public void A03(Throwable th) {
        11T.A0F(th, 0);
        IF4 if4 = this.A00;
        0fH.A0z("LiveStatusPoller", "video broadcast poll failed for video %s", th, new Object[]{if4.A0c});
        String str = if4.A0c;
        if (str != null) {
            ((Hs6) 1Br.A0B(if4.A0W)).A01(0S2.A0C, str, "Live status polling failed", new Object[0]);
        }
        if4.A0D = "error";
        IF4.A05(if4);
    }
}
