package X;

import com.facebook.common.dextricks.DexStore;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: Ftj.class */
public final class Ftj implements GGj {
    public final 1Q7 A00;

    public Ftj(1Q7 r302) {
        this.A00 = r302;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EDc eDc = (AbstractC10314t5) obj;
        if (eDc instanceof EDc) {
            EDc eDc2 = eDc;
            try {
                1Q7 r0 = this.A00;
                EoF eoF = eDc2.A00;
                Ezt ezt = new Ezt();
                EgM egM = eoF.A00;
                if (egM != null) {
                    Ezt ezt2 = new Ezt();
                    1Pr r02 = egM.A00;
                    1Pr r03 = new 1Pr();
                    Iterator it = r02.iterator();
                    while (it.hasNext()) {
                        EmU emU = (EmU) it.next();
                        Ezt ezt3 = new Ezt();
                        String str = emU.A01;
                        if (str != null) {
                            ezt3.A05("key", str);
                        }
                        String str2 = emU.A02;
                        if (str2 != null) {
                            ezt3.A05("url", str2);
                        }
                        ezt3.A04("cooldownSec", Long.valueOf(emU.A00));
                        r03.A00(new F9f(ezt3.A00().nodeInner));
                    }
                    ezt2.A02(r03, "urlConfigs");
                    ezt.A01(ezt2.A00(), DexStore.CONFIG_FILENAME);
                }
                1QC r04 = eoF.A01;
                if (r04 != null) {
                    Ezt ezt4 = new Ezt();
                    Iterator A00 = Fue.A00(r04);
                    while (A00.hasNext()) {
                        ET7 et7 = (ET7) A00.next();
                        ezt4.A04((String) et7.A00, (Long) et7.A01);
                    }
                    ezt.A01(ezt4.A00(), "lastPingStartTimeMap");
                }
                ezt.A03("carrierSignalEnabled", Boolean.valueOf(eoF.A02));
                ezt.A03("periodicPingActionNotPersisted", Boolean.valueOf(eoF.A03));
                r0.A01("cs_key", 11T.A02(ezt.A00().nodeInner));
            } catch (IOException unused) {
            }
        }
    }
}
