package X;

/* loaded from: AGk.class */
public final class AGk implements Runnable {
    public static final String __redex_internal_original_name = "PeopleYouMayKnowHscrollComponent$onHscrollButtonClicked$newItem$1$sendFriendRequest$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2k6 A02;
    public final /* synthetic */ 9cG A03;

    public AGk(C2k6 c2k6, 9cG r303, int i, int i2) {
        this.A03 = r303;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c2k6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        9cG r0 = this.A03;
        int i = this.A00 + 1;
        int i2 = this.A01 - 1;
        if (i > i2) {
            i = i2;
        }
        r0.A02(0S2.A0C, i, 7zO.A06(this.A02, 4YV.A06(2RH.A04)) * 3);
    }
}
