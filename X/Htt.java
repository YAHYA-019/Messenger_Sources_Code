package X;

import java.util.Iterator;

/* loaded from: Htt.class */
public final class Htt {
    public Rau A00;
    public Iterator A01;
    public HAy A02;
    public Huc A03;
    public final I9d A04;
    public final boolean A05;

    public Htt(I9d i9d, boolean z) {
        this.A04 = i9d;
        this.A05 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        return 1.0f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float A00(java.util.concurrent.TimeUnit r302, long r303) {
        /*
            r301 = this;
            r0 = r301
            X.HAy r0 = r0.A02
            boolean r0 = X.AnonymousClass001.A1T(r0)
            r305 = r0
            java.lang.String r0 = "No track is selected"
            r306 = r0
            r0 = r305
            r1 = r306
            X.IFX.A07(r0, r1)
        L14:
            r0 = r301
            X.Rau r0 = r0.A00
            r306 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r307 = r0
            r0 = r306
            if (r0 == 0) goto La1
            r0 = r306
            X.I9V r0 = r0.A01
            r306 = r0
            r0 = r306
            r1 = r302
            long r0 = r0.A03(r1)
            r308 = r0
            r0 = r303
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = r310
            if (r0 < 0) goto La1
            r0 = r301
            X.Rau r0 = r0.A00
            r306 = r0
            r0 = r306
            X.I9V r0 = r0.A01
            r311 = r0
            r0 = r301
            boolean r0 = r0.A05
            r310 = r0
            r0 = r311
            r1 = r302
            r2 = r303
            r3 = r310
            boolean r0 = r0.A06(r1, r2, r3)
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L68
            r0 = r301
            X.Rau r0 = r0.A00
            float r0 = r0.A00
            return r0
        L68:
            r0 = r301
            java.util.Iterator r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L98
            r0 = r306
            boolean r0 = r0.hasNext()
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L98
            r0 = r301
            java.util.Iterator r0 = r0.A01
            java.lang.Object r0 = r0.next()
            X.Rau r0 = (X.Rau) r0
            r306 = r0
        L8f:
            r0 = r301
            r1 = r306
            r0.A00 = r1
            goto L14
        L98:
            r0 = 0
            r310 = r0
            r0 = 0
            r306 = r0
            goto L8f
        La1:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Htt.A00(java.util.concurrent.TimeUnit, long):float");
    }

    public void A01(HAy hAy, int i) {
        this.A02 = hAy;
        Huc A04 = this.A04.A04(hAy, i);
        this.A03 = A04;
        if (A04 == null) {
            throw AnonymousClass001.A0L("Requested Track is not available");
        }
        Iterator A1D = GOp.A1D(A04.A07);
        this.A01 = A1D;
        if (A1D.hasNext()) {
            this.A00 = (Rau) this.A01.next();
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TimelineSpeedProvider{mMediaComposition=");
        A0k.append(this.A04);
        A0k.append(", mTimelineSpeedIterator=");
        A0k.append(this.A01);
        A0k.append(", mCurrentTimelineSpeed=");
        A0k.append(this.A00);
        A0k.append(", mMediaTrackComposition=");
        A0k.append(this.A03);
        A0k.append(", mSelectedTrackType=");
        A0k.append(this.A02);
        return AnonymousClass001.A0f(A0k);
    }
}
