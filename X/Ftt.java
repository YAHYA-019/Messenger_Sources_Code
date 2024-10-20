package X;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: Ftt.class */
public final class Ftt implements GGj {
    public final 1Q7 A00;

    public Ftt(1Q7 r302) {
        this.A00 = r302;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EDg eDg = (AbstractC10314t5) obj;
        if (eDg instanceof EDg) {
            EDg eDg2 = eDg;
            1Q7 r0 = this.A00;
            F6v f6v = eDg2.A00;
            Ezt ezt = new Ezt();
            ezt.A04("cooldownOnSuccess", Long.valueOf(f6v.A03));
            ezt.A04("cooldownOnFailure", Long.valueOf(f6v.A02));
            ezt.A04("lastRunAt", Long.valueOf(f6v.A05));
            ezt.A03("wasLastRunSuccessful", Boolean.valueOf(f6v.A0P));
            Ezt ezt2 = new Ezt();
            Iterator A00 = Fue.A00(f6v.A08);
            while (A00.hasNext()) {
                ET7 et7 = (ET7) A00.next();
                String str = (String) et7.A00;
                ETV etv = (ETV) et7.A01;
                Ezt ezt3 = new Ezt();
                ezt3.A04("createdAt", Long.valueOf(etv.A01));
                ezt3.A05("encrypted", etv.A02);
                ezt3.A05("masked", etv.A03);
                ezt3.A04("entryTtlDays", 1BK.A0l(etv.A00));
                ezt2.A01(ezt3.A00(), str);
            }
            ezt.A01(ezt2.A00(), "entries");
            ezt.A04("transparencyContentType", 1BK.A0l(f6v.A01));
            1QC r02 = f6v.A09;
            Ezt ezt4 = new Ezt();
            Iterator A002 = Fue.A00(r02);
            while (A002.hasNext()) {
                ET7 et72 = (ET7) A002.next();
                ezt4.A05((String) et72.A00, (String) et72.A01);
            }
            ezt.A01(ezt4.A00(), 1BJ.A00(2087));
            ezt.A03("consentRequired", Boolean.valueOf(f6v.A0L));
            ezt.A03("userSignalRequired", Boolean.valueOf(f6v.A0O));
            ezt.A04("carrierID", 1BK.A0l(f6v.A00));
            ezt.A03("useServerOptinState", Boolean.valueOf(f6v.A0N));
            String str2 = f6v.A0G;
            if (str2 != null) {
                ezt.A05("headwindCursor", str2);
            }
            String str3 = f6v.A0B;
            if (str3 != null) {
                ezt.A05("carrierName", str3);
            }
            String str4 = f6v.A0C;
            if (str4 != null) {
                ezt.A05("cursor", str4);
            }
            String str5 = f6v.A0J;
            if (str5 != null) {
                ezt.A05("useForLoginKey", str5);
            }
            String str6 = f6v.A0I;
            if (str6 != null) {
                ezt.A05("useForFOSKey", str6);
            }
            String str7 = f6v.A0K;
            if (str7 != null) {
                ezt.A05("useHeadwindStorageKey", str7);
            }
            String str8 = f6v.A0H;
            if (str8 != null) {
                ezt.A05("transparencyDesign", str8);
            }
            ETU etu = f6v.A06;
            if (etu != null) {
                Ezt ezt5 = new Ezt();
                ezt5.A03("wifiBannerEnabled", Boolean.valueOf(etu.A02));
                ezt5.A05("wifiBannerText", etu.A01);
                ezt5.A05("bannerPromotionText", etu.A00);
                ezt.A01(ezt5.A00(), "wifiBannerConfig");
            }
            1Pr r03 = f6v.A07;
            if (r03 != null) {
                try {
                    ezt.A02(F2N.A01(r03), "deferredStringReasons");
                } catch (IOException unused) {
                }
            }
            String str9 = f6v.A0F;
            if (str9 != null) {
                ezt.A05("deferredPingURL", str9);
            }
            String str10 = f6v.A0D;
            if (str10 != null) {
                ezt.A05("deferredHeadwindProgram", str10);
            }
            String str11 = f6v.A0E;
            if (str11 != null) {
                ezt.A05("deferredHeadwindStorage", str11);
            }
            ezt.A04("deferredDataTTLSec", Long.valueOf(f6v.A04));
            r0.A01("headers", 11T.A02(ezt.A00().nodeInner));
        }
    }
}
