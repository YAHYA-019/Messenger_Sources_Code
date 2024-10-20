package X;

/* renamed from: X.2sP, reason: invalid class name */
/* loaded from: 2sP.class */
public final class C2sP implements 2Qy {
    public final /* synthetic */ 2sO A00;

    public C2sP(2sO r302) {
        this.A00 = r302;
    }

    public void Bo5() {
        0fH.A0j("StoriesTabBadgeController", "Should remove badge on Stories Tab for Stories.");
        0fH.A0j("StoriesTabBadgeController", "Don't show badge on Stories Tab");
        this.A00.A04(2QC.A03);
    }

    public void CLQ(int i) {
        0fH.A0j("StoriesTabBadgeController", "Should show badge on Stories Tab due to new stories");
        2sO r0 = this.A00;
        0fH.A0j("StoriesTabBadgeController", "Show badge on Stories Tab");
        r0.A00.A00.get();
        r0.A04(new 2QC(i, "RED_DOT"));
    }
}
