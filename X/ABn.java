package X;

import com.facebook.messaging.contextbanner.plugins.core.threadviewdata.ContextBannerThreadData;

/* loaded from: ABn.class */
public final class ABn implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ABn(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                ((ContextBannerThreadData) this.A02).A04.A01(C6jO.class, 6jP.A00);
                ((C7Q4) this.A01).A00(th, 0, false);
                return;
            case 1:
                11T.A0F(th, 0);
                ((1FX) this.A01).setException(th);
                return;
            case 2:
                11T.A0F(th, 0);
                ((5cB) this.A01).onFailure(th);
                return;
            case 3:
                11T.A0F(th, 0);
                ((C50o) this.A02).A03.A00();
                ((AZc) this.A01).Bxp(th, null);
                return;
            case 4:
                return;
            default:
                ((1FX) this.A01).set(new 9Pv(1BK.A0b(), (String) null));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (r0.isEmpty() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABn.onSuccess(java.lang.Object):void");
    }
}
