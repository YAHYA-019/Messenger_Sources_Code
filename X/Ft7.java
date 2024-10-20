package X;

/* loaded from: Ft7.class */
public final class Ft7 implements GGh {
    @Override // X.GGh
    public /* bridge */ /* synthetic */ Object Cbo(Object obj, Object obj2) {
        1QC r319;
        boolean z;
        String str;
        F6s f6s;
        Fue fue;
        1Pr r312;
        1Pr r313;
        F6V f6v = (F6V) obj;
        EER eer = (AbstractC10314t5) obj2;
        if (eer instanceof EER) {
            EER eer2 = eer;
            1QC r0 = f6v.A03;
            z = f6v.A06;
            str = f6v.A05;
            f6s = f6v.A00;
            fue = f6v.A04;
            r312 = f6v.A02;
            r313 = f6v.A01;
            String str2 = eer2.A01;
            long j = eer2.A00 + eer2.A00;
            r319 = new 1QC(r0);
            DKC.A1T(r319, str2, new EmV(eer2, f6v, j));
        } else {
            if (!(eer instanceof EDf)) {
                if (eer instanceof C10304t4) {
                    str = ((C10304t4) eer).A01;
                    if (!str.equals(f6v.A05)) {
                        r319 = f6v.A03;
                        z = f6v.A06;
                        f6s = f6v.A00;
                        fue = f6v.A04;
                        r312 = f6v.A02;
                        r313 = f6v.A01;
                    }
                } else if (eer instanceof EDQ) {
                    if (f6v.A06) {
                        r319 = f6v.A03;
                        str = f6v.A05;
                        f6s = f6v.A00;
                        fue = f6v.A04;
                        r312 = f6v.A02;
                        r313 = f6v.A01;
                        z = false;
                    }
                } else if (eer instanceof EDR) {
                    if (!f6v.A06) {
                        r319 = f6v.A03;
                        str = f6v.A05;
                        f6s = f6v.A00;
                        fue = f6v.A04;
                        r312 = f6v.A02;
                        r313 = f6v.A01;
                        z = true;
                    }
                } else if (eer instanceof EDe) {
                    r319 = f6v.A03;
                    z = f6v.A06;
                    str = f6v.A05;
                    fue = f6v.A04;
                    r312 = f6v.A02;
                    r313 = f6v.A01;
                    f6s = ((EDe) eer).A00;
                } else if (eer instanceof EDw) {
                    EDw eDw = (EDw) eer;
                    r319 = f6v.A03;
                    z = f6v.A06;
                    str = f6v.A05;
                    f6s = f6v.A00;
                    fue = eDw.A02;
                    r312 = eDw.A01;
                    r313 = eDw.A00;
                } else if (eer instanceof EDx) {
                    EDx eDx = (EDx) eer;
                    r319 = f6v.A03;
                    z = f6v.A06;
                    str = f6v.A05;
                    f6s = f6v.A00;
                    fue = eDx.A02;
                    r312 = eDx.A01;
                    r313 = eDx.A00;
                }
                return f6v;
            }
            EDf eDf = (EDf) eer;
            1QC r02 = f6v.A03;
            z = f6v.A06;
            str = f6v.A05;
            f6s = f6v.A00;
            fue = f6v.A04;
            r312 = f6v.A02;
            r313 = f6v.A01;
            String str3 = eDf.A00;
            r319 = new 1QC(r02);
            r319.A00.remove(str3);
        }
        f6v = new F6V(f6s, r312, r313, r319, fue, str, z);
        return f6v;
    }
}
