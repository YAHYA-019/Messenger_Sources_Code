package X;

/* loaded from: D5d.class */
public final class D5d implements Runnable {
    public static final String __redex_internal_original_name = "ChannelListResource$groupMobileConfigObserver$1$1$1";
    public final /* synthetic */ C1337Aed A00;

    public D5d(C1337Aed c1337Aed) {
        this.A00 = c1337Aed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1337Aed c1337Aed = this.A00;
        Bd8 bd8 = (Bd8) 1Br.A0B(c1337Aed.A0K);
        String str = c1337Aed.A0P;
        11T.A0F(str, 0);
        Long A0e = 0CW.A0e(str);
        if (A0e == null) {
            0fH.A0j("TestBedGroupMcReader", 0Pz.A0j("Invalid groupId: ", str, " -- skipping"));
            return;
        }
        long longValue = A0e.longValue();
        1CO A0Q = AbL.A0Q(bd8.A00, longValue);
        0fH.A0j("TestBedGroupMcReader", 0Pz.A0W("Reading MC params for group: ", longValue > 0 ? "FB Group" : longValue == 0 ? "Zero Group Id (SMC?)" : "Negative Group Id (SMC?)"));
        0fH.A0j("TestBedGroupMcReader", "Reading MC static params");
        0fH.A0j("TestBedGroupMcReader", 0Pz.A1C("isEnabled: ", A0Q.AZk(108367926163210271L)));
        double Ai7 = A0Q.Ai7(109212351093407744L);
        StringBuilder A0n = AnonymousClass001.A0n("myDouble: ");
        A0n.append(Ai7);
        0fH.A0j("TestBedGroupMcReader", A0n.toString());
        double Ai72 = A0Q.Ai7(109212351093604353L);
        StringBuilder A0n2 = AnonymousClass001.A0n("myDouble2: ");
        A0n2.append(Ai72);
        0fH.A0j("TestBedGroupMcReader", A0n2.toString());
        0fH.A0j("TestBedGroupMcReader", 0Pz.A0U("myInt: ", A0Q.Auy(108649401140051969L)));
        0fH.A0j("TestBedGroupMcReader", 0Pz.A0W("myString: ", 2yD.A02(A0Q, 108930876116828160L)));
        0fH.A0j("TestBedGroupMcReader", "Reading MC GK params");
        0fH.A0j("TestBedGroupMcReader", 0Pz.A1C("gk_bool_param: ", A0Q.AZk(108367926163669025L)));
        double Ai73 = A0Q.Ai7(109212351093932034L);
        StringBuilder A0n3 = AnonymousClass001.A0n("gk_double_param: ");
        A0n3.append(Ai73);
        0fH.A0j("TestBedGroupMcReader", A0n3.toString());
        0fH.A0j("TestBedGroupMcReader", 0Pz.A0U("gk_int_param: ", A0Q.Auy(108649401140314114L)));
        0fH.A0j("TestBedGroupMcReader", 0Pz.A0W("gk_string_param: ", 2yD.A02(A0Q, 108930876117286913L)));
        0fH.A0j("TestBedGroupMcReader", "Reading MC QE params");
        0fH.A0j("TestBedGroupMcReader", 0Pz.A1C("QE bool_param: ", A0Q.AZk(108367926163734562L)));
        double Ai74 = A0Q.Ai7(109212351094128643L);
        StringBuilder A0n4 = AnonymousClass001.A0n("QE double_param: ");
        A0n4.append(Ai74);
        0fH.A0j("TestBedGroupMcReader", A0n4.toString());
        0fH.A0j("TestBedGroupMcReader", 0Pz.A0U("QE int_param: ", A0Q.Auy(108649401140641795L)));
        0fH.A0j("TestBedGroupMcReader", 0Pz.A0W("QE string_param: ", 2yD.A02(A0Q, 108930876117483522L)));
    }
}
