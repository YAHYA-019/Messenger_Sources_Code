package X;

import androidx.lifecycle.MutableLiveData;

/* loaded from: Fv2.class */
public final class Fv2 implements GIx {
    public Ek0 A00;
    public EzS A01;
    public final MutableLiveData A02;
    public final Rh9 A03;
    public final F4T A04;
    public final Object A05;
    public final String A06;
    public final java.util.Map A07;
    public final DSM A08;

    public Fv2(MutableLiveData mutableLiveData, DSM dsm, Rh9 rh9, F4T f4t, Object obj, String str) {
        7zR.A1O(f4t, dsm);
        11T.A0F(obj, 6);
        this.A03 = rh9;
        this.A04 = f4t;
        this.A08 = dsm;
        this.A02 = mutableLiveData;
        this.A06 = str;
        this.A05 = obj;
        this.A07 = 1BK.A1C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01dd, code lost:
    
        X.11T.A0L(r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01e5, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(X.RMC r302) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fv2.A00(X.RMC):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r0.code == 10) goto L12;
     */
    @Override // X.GIx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BkH(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fv2.BkH(java.lang.Throwable):void");
    }

    @Override // X.GIx
    public void BkI(RMC rmc) {
        11T.A0F(rmc, 0);
        FGo fGo = rmc.A01;
        if (fGo != null) {
            String str = fGo.A04;
            EzS ezS = this.A01;
            if (ezS != null) {
                if (!11T.A0O(str, ezS.A00)) {
                    throw AnonymousClass001.A0N("Auth Ticket type and current in progress auth factor can not be different.");
                }
            }
            11T.A0L("inProgressAuthFactor");
            throw 0Q8.createAndThrow();
        }
        java.util.Map map = this.A07;
        EzS ezS2 = this.A01;
        if (ezS2 != null) {
            map.put(ezS2, rmc);
            A00(rmc);
            return;
        }
        11T.A0L("inProgressAuthFactor");
        throw 0Q8.createAndThrow();
    }
}
