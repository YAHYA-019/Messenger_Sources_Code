package X;

import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: X.4af, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4af.class */
public final class C04244af implements 4aT {
    public final 1iL A00;
    public final 2ER A01;
    public final 30B A02;
    public final 2DS A03;
    public final Runnable A04;
    public final Executor A05;
    public final boolean A06;
    public final 2Da A07;
    public final 2Fg A08;
    public final 4aT A09;
    public final boolean A0A;

    public C04244af(1iL r302, 2ER r303, 30B r304, 2DS r305, 2Da r306, 2Fg r307, 4aT r308, Runnable runnable, Executor executor, boolean z, boolean z2) {
        11T.A0F(executor, 2);
        11T.A0F(r305, 3);
        11T.A0F(r306, 4);
        11T.A0F(r304, 5);
        11T.A0F(r303, 10);
        11T.A0F(r302, 12);
        this.A08 = r307;
        this.A05 = executor;
        this.A03 = r305;
        this.A07 = r306;
        this.A02 = r304;
        this.A06 = z;
        this.A0A = z2;
        this.A09 = r308;
        this.A01 = r303;
        this.A04 = runnable;
        this.A00 = r302;
    }

    public void CZW(final InterfaceC04444az interfaceC04444az, final InterfaceC04374as interfaceC04374as) {
        InterfaceC04444az interfaceC04444az2;
        InterfaceC04444az c04804c0;
        11T.A0F(interfaceC04444az, 0);
        11T.A0F(interfaceC04374as, 1);
        if (!2D9.A00().BWo()) {
            Uri uri = ((C04364ar) interfaceC04374as).A07.A05;
            if (0CO.A04(uri) || 2IA.A03(uri)) {
                c04804c0 = new C04804c0(this.A07, new C04784by(this.A08), interfaceC04444az, this, interfaceC04374as, this.A0A);
            } else {
                final boolean z = this.A0A;
                c04804c0 = new AbstractC04814c1(interfaceC04444az, this, interfaceC04374as, z) { // from class: X.4ht
                    public final /* synthetic */ C04244af A00;

                    {
                        this.A00 = this;
                    }
                };
            }
            this.A09.CZW(c04804c0, interfaceC04374as);
            return;
        }
        2D9.A02("DecodeProducer#produceResults");
        try {
            Uri uri2 = ((C04364ar) interfaceC04374as).A07.A05;
            if (0CO.A04(uri2) || 2IA.A03(uri2)) {
                new C04804c0(this.A07, new C04784by(this.A08), interfaceC04444az, this, interfaceC04374as, this.A0A);
            } else {
                final boolean z2 = this.A0A;
                new AbstractC04814c1(interfaceC04444az, this, interfaceC04374as, z2) { // from class: X.4ht
                    public final /* synthetic */ C04244af A00;

                    {
                        this.A00 = this;
                    }
                };
            }
            this.A09.CZW(interfaceC04444az2, interfaceC04374as);
        } finally {
            2D9.A01();
        }
    }
}
