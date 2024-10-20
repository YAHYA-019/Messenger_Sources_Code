package X;

/* renamed from: X.4ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ao.class */
public final class C04334ao extends C04344ap implements 2IT {
    public final 2IT A00;
    public final 2IE A01;

    public C04334ao(final 2IT r302, final 2IE r303) {
        new 2IU(r302, r303) { // from class: X.4ap
            public final 2IU A00;
            public final 2IF A01;

            {
                this.A01 = r303;
                this.A00 = r302;
            }

            public void CE4(InterfaceC04374as interfaceC04374as, String str, String str2) {
                2IF r0 = this.A01;
                if (r0 != null) {
                    r0.CE3(((C04364ar) interfaceC04374as).A09, "NetworkFetchProducer", "intermediate_result");
                }
                2IU r02 = this.A00;
                if (r02 != null) {
                    r02.CE4(interfaceC04374as, "NetworkFetchProducer", "intermediate_result");
                }
            }

            public void CE6(InterfaceC04374as interfaceC04374as, String str, java.util.Map map) {
                11T.A0F(interfaceC04374as, 0);
                2IF r0 = this.A01;
                if (r0 != null) {
                    r0.CE5(((C04364ar) interfaceC04374as).A09, str, (java.util.Map) null);
                }
                2IU r02 = this.A00;
                if (r02 != null) {
                    r02.CE6(interfaceC04374as, str, (java.util.Map) null);
                }
            }

            public void CE8(InterfaceC04374as interfaceC04374as, String str, Throwable th, java.util.Map map) {
                11T.A0F(interfaceC04374as, 0);
                2IF r0 = this.A01;
                if (r0 != null) {
                    r0.CE7(((C04364ar) interfaceC04374as).A09, str, th, map);
                }
                2IU r02 = this.A00;
                if (r02 != null) {
                    r02.CE8(interfaceC04374as, str, th, map);
                }
            }

            public void CEA(InterfaceC04374as interfaceC04374as, String str, java.util.Map map) {
                11T.A0F(interfaceC04374as, 0);
                2IF r0 = this.A01;
                if (r0 != null) {
                    r0.CE9(((C04364ar) interfaceC04374as).A09, str, map);
                }
                2IU r02 = this.A00;
                if (r02 != null) {
                    r02.CEA(interfaceC04374as, str, map);
                }
            }

            public void CEC(InterfaceC04374as interfaceC04374as, String str) {
                11T.A0F(interfaceC04374as, 0);
                2IF r0 = this.A01;
                if (r0 != null) {
                    r0.CEB(((C04364ar) interfaceC04374as).A09, str);
                }
                2IU r02 = this.A00;
                if (r02 != null) {
                    r02.CEC(interfaceC04374as, str);
                }
            }

            public void CS8(InterfaceC04374as interfaceC04374as, String str, boolean z) {
                11T.A0F(interfaceC04374as, 0);
                2IF r0 = this.A01;
                if (r0 != null) {
                    r0.CS7(((C04364ar) interfaceC04374as).A09, str, z);
                }
                2IU r02 = this.A00;
                if (r02 != null) {
                    r02.CS8(interfaceC04374as, str, z);
                }
            }

            public boolean ChL(InterfaceC04374as interfaceC04374as, String str) {
                11T.A0F(interfaceC04374as, 0);
                2IF r0 = this.A01;
                Boolean bool = null;
                if (r0 != null) {
                    bool = Boolean.valueOf(r0.ChK(((C04364ar) interfaceC04374as).A09));
                }
                if (!11T.A0O(bool, true)) {
                    2IU r02 = this.A00;
                    if (r02 == null) {
                        return false;
                    }
                    bool = Boolean.valueOf(r02.ChL(interfaceC04374as, str));
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            }
        };
        this.A01 = r303;
        this.A00 = r302;
    }

    public void CGo(InterfaceC04374as interfaceC04374as) {
        2IE r0 = this.A01;
        if (r0 != null) {
            r0.CGn(((C04364ar) interfaceC04374as).A09);
        }
        this.A00.CGo(interfaceC04374as);
    }

    public void CGy(InterfaceC04374as interfaceC04374as, Throwable th) {
        2IE r0 = this.A01;
        if (r0 != null) {
            C04364ar c04364ar = (C04364ar) interfaceC04374as;
            r0.CGx(c04364ar.A07, c04364ar.A09, th, interfaceC04374as.BV1());
        }
        this.A00.CGy(interfaceC04374as, th);
    }

    public void CH6(InterfaceC04374as interfaceC04374as) {
        2IE r0 = this.A01;
        if (r0 != null) {
            C04364ar c04364ar = (C04364ar) interfaceC04374as;
            r0.CH5(c04364ar.A07, c04364ar.A08, c04364ar.A09, interfaceC04374as.BV1());
        }
        this.A00.CH6(interfaceC04374as);
    }

    public void CH8(InterfaceC04374as interfaceC04374as) {
        2IE r0 = this.A01;
        if (r0 != null) {
            C04364ar c04364ar = (C04364ar) interfaceC04374as;
            r0.CH7(c04364ar.A07, c04364ar.A09, interfaceC04374as.BV1());
        }
        this.A00.CH8(interfaceC04374as);
    }
}
