package X;

/* renamed from: X.4au, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4au.class */
public abstract class AbstractC04394au extends 1OV {
    public final C04354aq A00;
    public final 2IT A01;

    public AbstractC04394au(2IT r302, 4aT r303, C04354aq c04354aq) {
        InterfaceC04444az interfaceC04444az;
        11T.A0F(r303, 1);
        this.A00 = c04354aq;
        this.A01 = r302;
        try {
            if (2D9.A00().BWo()) {
                2D9.A02("AbstractProducerToDataSourceAdapter()");
                ((1OV) this).A04 = c04354aq.A0C;
                if (2D9.A00().BWo()) {
                    2D9.A02("AbstractProducerToDataSourceAdapter()->onRequestStart");
                    try {
                        r302.CH6(c04354aq);
                        2D9.A01();
                    } catch (Throwable th) {
                        th = th;
                        2D9.A01();
                        throw th;
                    }
                } else {
                    r302.CH6(c04354aq);
                }
                if (2D9.A00().BWo()) {
                    2D9.A02("AbstractProducerToDataSourceAdapter()->produceResult");
                    try {
                        r303.CZW(new C04424ax(this), c04354aq);
                        2D9.A01();
                        2D9.A01();
                    } catch (Throwable th2) {
                        th = th2;
                        2D9.A01();
                        throw th;
                    }
                }
                new C04424ax(this);
            } else {
                ((1OV) this).A04 = c04354aq.A0C;
                if (2D9.A00().BWo()) {
                    2D9.A02("AbstractProducerToDataSourceAdapter()->onRequestStart");
                    r302.CH6(c04354aq);
                    2D9.A01();
                } else {
                    r302.CH6(c04354aq);
                }
                if (!2D9.A00().BWo()) {
                    r303.CZW(new C04424ax(this), c04354aq);
                    return;
                } else {
                    2D9.A02("AbstractProducerToDataSourceAdapter()->produceResult");
                    new C04424ax(this);
                }
            }
            r303.CZW(interfaceC04444az, c04354aq);
            2D9.A01();
        } catch (Throwable th3) {
            2D9.A01();
            throw th3;
        }
    }

    public static final void A02(AbstractC04394au abstractC04394au, Throwable th) {
        C04354aq c04354aq = abstractC04394au.A00;
        if (super.A09(th, c04354aq.AlR())) {
            abstractC04394au.A01.CGy(c04354aq, th);
        }
    }

    public void A0A(InterfaceC04374as interfaceC04374as, Object obj, int i) {
        boolean z = true;
        if ((i & 1) != 1) {
            z = false;
        }
        if (super.A07(obj, interfaceC04374as.AlR(), z) && z) {
            this.A01.CH8(this.A00);
        }
    }

    public boolean AGD() {
        if (!super.AGD()) {
            return false;
        }
        if (super.BSj()) {
            return true;
        }
        2IT r0 = this.A01;
        C04354aq c04354aq = this.A00;
        r0.CGo(c04354aq);
        c04354aq.A03();
        return true;
    }
}
