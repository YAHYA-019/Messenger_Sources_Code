package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.Jgm, reason: case insensitive filesystem */
/* loaded from: Jgm.class */
public final class C3023Jgm extends MutableLiveData {
    public final /* synthetic */ LA9 A00;

    public C3023Jgm(LA9 la9) {
        this.A00 = la9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x011f, code lost:
    
        if (X.1BK.A0W().A08(r0, r0, r0.A01, 1) != false) goto L87;
     */
    @Override // androidx.lifecycle.LiveData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActive() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3023Jgm.onActive():void");
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        LA9 la9 = this.A00;
        LA9.A01(la9.A01, la9);
        la9.A01 = null;
        la9.A03 = null;
    }
}
