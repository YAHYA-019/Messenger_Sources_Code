package X;

import android.os.Looper;

/* renamed from: X.4aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4aj.class */
public final class C04284aj implements 4aT {
    public final 4aT A00;
    public final 2EQ A01;

    public C04284aj(4aT r302, 2EQ r303) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A01 = r303;
    }

    public void CZW(InterfaceC04444az interfaceC04444az, InterfaceC04374as interfaceC04374as) {
        11T.A0F(interfaceC04444az, 0);
        11T.A0F(interfaceC04374as, 1);
        if (!2D9.A00().BWo()) {
            C04364ar c04364ar = (C04364ar) interfaceC04374as;
            2IU r0 = c04364ar.A05;
            if (!c04364ar.A04.Al7().A06 || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                AbstractC04524b8 abstractC04524b8 = new AbstractC04524b8(interfaceC04374as, r0, this) { // from class: X.4b7
                    public static final String __redex_internal_original_name = "ThreadHandoffProducer$produceResults$1$statefulRunnable$1";
                    public final /* synthetic */ InterfaceC04374as A01;
                    public final /* synthetic */ 2IU A02;
                    public final /* synthetic */ C04284aj A03;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(InterfaceC04444az.this, interfaceC04374as, r0, "BackgroundThreadHandoffProducer");
                        this.A02 = r0;
                        this.A01 = interfaceC04374as;
                        this.A03 = this;
                    }

                    @Override // X.AbstractC04524b8, X.AbstractRunnableC04534b9
                    public void A06(Object obj) {
                        2IU r02 = this.A02;
                        InterfaceC04374as interfaceC04374as2 = this.A01;
                        r02.CEA(interfaceC04374as2, "BackgroundThreadHandoffProducer", (java.util.Map) null);
                        this.A03.A00.CZW(InterfaceC04444az.this, interfaceC04374as2);
                    }
                };
                interfaceC04374as.A5P(new C2586GiN(this, abstractC04524b8, 5));
                this.A01.A7Z(1OS.A02(abstractC04524b8, (1OS.A00 == null || C0jy.A00() != C0jw.FINE) ? null : 0Pz.A0W("ThreadHandoffProducer_produceResults_", c04364ar.A09)));
                return;
            } else {
                r0.CEC(interfaceC04374as, "BackgroundThreadHandoffProducer");
                r0.CEA(interfaceC04374as, "BackgroundThreadHandoffProducer", (java.util.Map) null);
                this.A00.CZW(interfaceC04444az, interfaceC04374as);
                return;
            }
        }
        2D9.A02("ThreadHandoffProducer#produceResults");
        try {
            C04364ar c04364ar2 = (C04364ar) interfaceC04374as;
            2IU r02 = c04364ar2.A05;
            if (!c04364ar2.A04.Al7().A06 || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                AbstractC04524b8 abstractC04524b82 = new AbstractC04524b8(interfaceC04374as, r02, this) { // from class: X.4b7
                    public static final String __redex_internal_original_name = "ThreadHandoffProducer$produceResults$1$statefulRunnable$1";
                    public final /* synthetic */ InterfaceC04374as A01;
                    public final /* synthetic */ 2IU A02;
                    public final /* synthetic */ C04284aj A03;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(InterfaceC04444az.this, interfaceC04374as, r02, "BackgroundThreadHandoffProducer");
                        this.A02 = r02;
                        this.A01 = interfaceC04374as;
                        this.A03 = this;
                    }

                    @Override // X.AbstractC04524b8, X.AbstractRunnableC04534b9
                    public void A06(Object obj) {
                        2IU r022 = this.A02;
                        InterfaceC04374as interfaceC04374as2 = this.A01;
                        r022.CEA(interfaceC04374as2, "BackgroundThreadHandoffProducer", (java.util.Map) null);
                        this.A03.A00.CZW(InterfaceC04444az.this, interfaceC04374as2);
                    }
                };
                interfaceC04374as.A5P(new C2586GiN(this, abstractC04524b82, 5));
                this.A01.A7Z(1OS.A02(abstractC04524b82, (1OS.A00 == null || C0jy.A00() != C0jw.FINE) ? null : 0Pz.A0W("ThreadHandoffProducer_produceResults_", c04364ar2.A09)));
            } else {
                r02.CEC(interfaceC04374as, "BackgroundThreadHandoffProducer");
                r02.CEA(interfaceC04374as, "BackgroundThreadHandoffProducer", (java.util.Map) null);
                this.A00.CZW(interfaceC04444az, interfaceC04374as);
            }
        } finally {
            2D9.A01();
        }
    }
}
