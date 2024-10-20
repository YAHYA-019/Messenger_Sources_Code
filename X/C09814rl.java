package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.4rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rl.class */
public final class C09814rl implements InterfaceC03993zi, InterfaceC04003zj, InterfaceC09784ri {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A0A;
    public final C04013zk A0C;
    public final C15h A0D;
    public final boolean A0E;
    public final 1Br A0B = 1Bq.A00(83604);
    public final 1Br A09 = 1Bq.A00(49315);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008d, code lost:
    
        if (com.facebook.endtoend.EndToEnd.A05("fetch_all_interstitials_data") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C09814rl(X.1De r302) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09814rl.<init>(X.1De):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0173, code lost:
    
        if (r0.getBoolean("data_stored", false) != false) goto L24;
     */
    @Override // X.InterfaceC03993zi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A7p() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09814rl.A7p():void");
    }

    @Override // X.InterfaceC03993zi
    public void ABa(EnC enC, boolean z) {
        if (this.A0E) {
            C15h c15h = this.A0D;
            Object obj = c15h.get();
            11T.A0A(obj);
            String str = (String) obj;
            C00i c00i = this.A08.A00;
            1Fi A00 = ((1Fe) c00i.get()).A00(0Pz.A0W("interstitial_", str));
            11T.A0A(A00);
            InterfaceC00051a0 AP5 = A00.AP5();
            AP5.AFD();
            Set stringSet = ((1Fe) c00i.get()).A00("interstitial").getStringSet("interstitial_retained_data_id_list", new TreeSet());
            11T.A0A(stringSet);
            Object obj2 = c15h.get();
            11T.A0A(obj2);
            stringSet.add(obj2);
            InterfaceC00051a0 AP52 = ((1Fe) c00i.get()).A00("interstitial").AP5();
            AP52.CaO("interstitial_retained_data_id_list", stringSet);
            AP52.commit();
            Collection A02 = ((2tY) 1Br.A0B(this.A04)).A02();
            if (!A02.isEmpty()) {
                Iterator it = A02.iterator();
                while (it.hasNext()) {
                    String A0i = AnonymousClass001.A0i(it);
                    1Br.A0C(this.A06);
                    1Br A002 = 2tQ.A00();
                    1G2 A01 = ((2tR) A002.get()).A01(A0i);
                    1G2 A022 = ((2tR) A002.get()).A02(A0i);
                    C00i c00i2 = this.A02.A00;
                    String A0r = 4YV.A0r(1BK.A0S(c00i2), A01);
                    int ArU = 1BK.A0S(c00i2).ArU(A022, 0);
                    if (A0r.length() == 0) {
                        AP5.Cdi(A0i);
                    } else {
                        AP5.CaK(A0i, A0r);
                        AP5.CaD(0Pz.A0W("data_type/", A0i), ArU);
                        1G2 A03 = ((2tR) A002.get()).A03(A0i);
                        if (1BK.A0S(c00i2).BNM(A03)) {
                            AP5.CaG(0Pz.A0W("last_impression/", A0i), 1BL.A0A(1BK.A0S(c00i2), A03));
                        }
                    }
                }
            }
            AP5.Ca2("data_stored", true);
            AP5.commit();
        }
    }

    @Override // X.InterfaceC03993zi
    public 4qU AZ2() {
        return new C09824rm(this, true);
    }

    @Override // X.InterfaceC04003zj
    public 4qU AZ3() {
        return new C09824rm(this, false);
    }

    @Override // X.InterfaceC03993zi
    public String Asw() {
        return "InterstitialConfigurationComponent";
    }

    @Override // X.InterfaceC04003zj
    public long Axo() {
        return 7200000L;
    }

    @Override // X.InterfaceC03993zi
    public boolean BX1() {
        if (!this.A0E) {
            return false;
        }
        1Br.A0C(this.A06);
        return 1Br.A09(this.A02).AZn((1G2) ((2tR) 2tQ.A00().get()).A04.getValue(), false);
    }

    @Override // X.InterfaceC09784ri
    public void Bo9() {
        C00i c00i = this.A08.A00;
        Set stringSet = ((1Fe) c00i.get()).A00("interstitial").getStringSet("interstitial_retained_data_id_list", new TreeSet());
        11T.A0A(stringSet);
        Iterator it = stringSet.iterator();
        while (it.hasNext()) {
            1Fi A00 = ((1Fe) c00i.get()).A00(0Pz.A0W("interstitial_", AnonymousClass001.A0i(it)));
            11T.A0A(A00);
            InterfaceC00051a0 AP5 = A00.AP5();
            AP5.AFD();
            AP5.commit();
        }
        InterfaceC00051a0 AP52 = ((1Fe) c00i.get()).A00("interstitial").AP5();
        AP52.Cdi("interstitial_retained_data_id_list");
        AP52.commit();
    }

    @Override // X.InterfaceC03993zi
    public boolean Cy8() {
        return false;
    }
}
