package X;

/* loaded from: Cp2.class */
public final class Cp2 implements DI8 {
    public final /* synthetic */ 1Iw A00;
    public final /* synthetic */ QAd A01;
    public final /* synthetic */ BmZ A02;
    public final /* synthetic */ IFc A03;
    public final /* synthetic */ CPV A04;

    public Cp2(1Iw r302, QAd qAd, BmZ bmZ, IFc iFc, CPV cpv) {
        this.A04 = cpv;
        this.A01 = qAd;
        this.A02 = bmZ;
        this.A03 = iFc;
        this.A00 = r302;
    }

    @Override // X.DI8
    public void Bpg() {
        1Iw r0 = this.A00;
        if (r0.A02 != null) {
            r0.A0G(7zQ.A0V(false, 0), "updateState:OnlyActiveAdminLobbyLayout.updateInvitedListExpanded");
        }
    }

    @Override // X.DI8
    public void Bx8() {
        1Iw r0 = this.A00;
        if (r0.A02 != null) {
            r0.A0G(7zS.A0N(true), "updateState:OnlyActiveAdminLobbyLayout.updateInvitedListExpanded");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw r0;
     */
    @Override // X.DI8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CTO(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cp2.CTO(java.lang.String):void");
    }
}
