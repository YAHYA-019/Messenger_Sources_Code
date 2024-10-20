package X;

import androidx.fragment.app.Fragment;

/* loaded from: Fjd.class */
public final class Fjd implements JK0 {
    public final /* synthetic */ E96 A00;

    public Fjd(E96 e96) {
        this.A00 = e96;
    }

    @Override // X.JK0
    public 06Z AnP() {
        Fragment fragment = this.A00.A01;
        if (fragment == null) {
            throw 1BK.A0h();
        }
        06Z childFragmentManager = fragment.getChildFragmentManager();
        11T.A0A(childFragmentManager);
        return childFragmentManager;
    }

    @Override // X.JK0
    public boolean BRK() {
        return AnonymousClass001.A1T(this.A00.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r301.A00.getVisibility() != 0) goto L6;
     */
    @Override // X.JK0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BRL() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.BRK()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r301
            X.E96 r0 = r0.A00
            r303 = r0
            r0 = r303
            int r0 = r0.getVisibility()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L1d
        L19:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L1d:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fjd.BRL():boolean");
    }
}
