package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.Constants;
import java.io.InputStream;

/* renamed from: X.4ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ie.class */
public final class C06944ie implements InterfaceC06954if {
    public final /* synthetic */ AbstractC06904ia A00;
    public final /* synthetic */ 4aR A01;

    public C06944ie(AbstractC06904ia abstractC06904ia, 4aR r303) {
        this.A01 = r303;
        this.A00 = abstractC06904ia;
    }

    @Override // X.InterfaceC06954if
    public void Bn2() {
        AbstractC06904ia abstractC06904ia = this.A00;
        InterfaceC04374as interfaceC04374as = abstractC06904ia.A04;
        ((C04364ar) interfaceC04374as).A05.CE6(interfaceC04374as, "NetworkFetchProducer", (java.util.Map) null);
        abstractC06904ia.A03.Bn2();
    }

    @Override // X.InterfaceC06954if
    public void CHK(InputStream inputStream, int i) {
        4dA r309;
        if (2D9.A00().BWo()) {
            2D9.A02("NetworkFetcher->onResponse");
        }
        4aR r0 = this.A01;
        AbstractC06904ia abstractC06904ia = this.A00;
        2H7 r02 = r0.A01;
        if (i > 0) {
            r309 = new 4dA(r02.A01, i);
        } else {
            2H5 r03 = r02.A01;
            r309 = new 4dA(r03, r03.A00[0]);
        }
        2Fg r04 = r0.A00;
        byte[] bArr = (byte[]) r04.get(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                if (read > 0) {
                    r309.write(bArr, 0, read);
                    InterfaceC04374as interfaceC04374as = abstractC06904ia.A04;
                    C04364ar c04364ar = (C04364ar) interfaceC04374as;
                    2Da B5E = c04364ar.A04.B5E();
                    if (B5E != null && B5E.AMA() && interfaceC04374as.BTd() && r0.A02.A07()) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (uptimeMillis - abstractC06904ia.A01 >= 100) {
                            abstractC06904ia.A01 = uptimeMillis;
                            c04364ar.A05.CE4(interfaceC04374as, "NetworkFetchProducer", "intermediate_result");
                            4aR.A00(abstractC06904ia.A02, r309, abstractC06904ia.A03, abstractC06904ia.A00);
                        }
                    }
                    abstractC06904ia.A03.CEP(i > 0 ? r309.A00 / i : 1.0f - ((float) Math.exp((-r0) / 50000.0d)));
                }
            } catch (Throwable th) {
                r04.Cci(bArr);
                r309.close();
                throw th;
            }
        }
        2DW r05 = r0.A02;
        r05.A0A(abstractC06904ia, r309.A00);
        int i2 = r309.A00;
        InterfaceC04374as interfaceC04374as2 = abstractC06904ia.A04;
        C04364ar c04364ar2 = (C04364ar) interfaceC04374as2;
        2IU r06 = c04364ar2.A05;
        r06.CEA(interfaceC04374as2, "NetworkFetchProducer", !r06.ChL(interfaceC04374as2, "NetworkFetchProducer") ? null : r05.A09(abstractC06904ia, i2));
        r06.CS8(interfaceC04374as2, "NetworkFetchProducer", true);
        c04364ar2.CaJ("network", "default");
        4aR.A00(abstractC06904ia.A02, r309, abstractC06904ia.A03, abstractC06904ia.A00 | 1);
        r04.Cci(bArr);
        r309.close();
        if (2D9.A00().BWo()) {
            2D9.A01();
        }
    }

    @Override // X.InterfaceC06954if
    public void onFailure(Throwable th) {
        AbstractC06904ia abstractC06904ia = this.A00;
        InterfaceC04374as interfaceC04374as = abstractC06904ia.A04;
        C04364ar c04364ar = (C04364ar) interfaceC04374as;
        2IU r0 = c04364ar.A05;
        r0.CE8(interfaceC04374as, "NetworkFetchProducer", th, (java.util.Map) null);
        r0.CS8(interfaceC04374as, "NetworkFetchProducer", false);
        c04364ar.CaJ("network", "default");
        abstractC06904ia.A03.onFailure(th);
    }
}
