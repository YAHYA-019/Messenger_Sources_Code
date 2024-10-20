package X;

/* renamed from: X.4gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gp.class */
public final class C06404gp {
    public static final C06404gp A01 = new Object();
    public static final 1Br A00 = 1Bq.A00(16385);

    public static void A00(2yD r301, String str, StringBuilder sb, long j) {
        sb.append(0Pz.A1C(str, r301.AZk(j)));
    }

    public final boolean A01() {
        return ((2yD) A00.A00.get()).AZk(36322675861505793L);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("-----Hera Mobile Config-----");
        1Br r0 = A00;
        C00i c00i = r0.A00;
        A00(1BK.A0M(c00i), "killSwitch:", A0k, 36322675862554384L);
        4YV.A1P("hnvcEnabled:", A0k, 1Br.A07(r0).AZk(36322675862685458L));
        A00(1BK.A0M(c00i), "icaEnabled:", A0k, 36322675862619921L);
        4YV.A1P("enableForStella:", A0k, A01());
        A00(1BK.A0M(c00i), "enableToggleButton:", A0k, 36322675861767940L);
        A00(1BK.A0M(c00i), "enableDebugView:", A0k, 36322675861636867L);
        4YV.A1O("getTcpOutgoingBwLimit:", A0k, 1BK.A0M(c00i).Auy(36604137953303023L));
        4YU.A1S("getTcpListenHost:", 2yD.A02(1BK.A0M(c00i), 36885612929877581L), A0k);
        4YV.A1O("getTcpListenPort:", A0k, 1BK.A0M(c00i).Auy(36604137953237486L));
        A00(1BK.A0M(c00i), "enableHammerhead:", A0k, 36322675862095625L);
        A00(1BK.A0M(c00i), "enableAudio:", A0k, 36322675862357773L);
        A00(1BK.A0M(c00i), "enableMockAudio:", A0k, 36322675862226699L);
        A00(1BK.A0M(c00i), "enableAudioLoopback:", A0k, 36322675862292236L);
        A00(1BK.A0M(c00i), "enableRsysAudio:", A0k, 36322675862161162L);
        A00(1BK.A0M(c00i), "bypassAccountCheck:", A0k, 36322675862423310L);
        return 11T.A02(A0k);
    }
}
