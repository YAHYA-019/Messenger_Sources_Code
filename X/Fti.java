package X;

/* loaded from: Fti.class */
public final class Fti implements GGj {
    public final F5z A00;

    public Fti(F5z f5z) {
        this.A00 = f5z;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EE2 ee2 = (AbstractC10314t5) obj;
        if (ee2 instanceof EE2) {
            F5z f5z = this.A00;
            EE2 ee22 = ee2;
            1UG A08 = 1BK.A08(1BK.A07(f5z.A00), 4YT.A00(338));
            if (A08.isSampled()) {
                String A00 = ((1Pz) f5z.A01.get()).A02() ? ee22.A06 : F5z.A00(f5z);
                Integer num = ee22.A05;
                A08.A6H("count_all", 1BK.A0l(ee22.A02));
                A08.A6H("count_error", 1BK.A0l(ee22.A00));
                A08.A6H(4YT.A00(1023), 1BK.A0l(ee22.A04));
                A08.A5H("was_state_changed", Boolean.valueOf(AnonymousClass001.A1P(ee22.A03)));
                A08.A6H(4YT.A00(1022), 1BK.A0l(ee22.A01));
                long j = 0;
                if (A00 != null) {
                    try {
                        j = Long.parseLong(A00);
                    } catch (NumberFormatException unused) {
                    }
                }
                DKD.A1D(A08, j);
                A08.A7R("state", num.intValue() != 0 ? "SUCCESS" : AbstractC00603o4.A00(95));
                A08.BZL();
            }
        }
        if (ee2 instanceof EE3) {
            F5z f5z2 = this.A00;
            EE3 ee3 = (EE3) ee2;
            1UG A082 = 1BK.A08(1BK.A07(f5z2.A00), 1BJ.A00(409));
            if (A082.isSampled()) {
                String A002 = ((1Pz) f5z2.A01.get()).A02() ? ee3.A01 : F5z.A00(f5z2);
                A082.A5H("is_success", Boolean.valueOf(ee3.A06));
                A082.A7R("key", ee3.A03);
                A082.A7R("url", ee3.A04);
                long j2 = 0;
                if (A002 != null) {
                    try {
                        j2 = Long.parseLong(A002);
                    } catch (NumberFormatException unused2) {
                    }
                }
                DKD.A1D(A082, j2);
                A082.A7R("error", ee3.A02);
                A082.A6H(4YT.A00(1161), 1BK.A0l(ee3.A00));
                A082.A5H("was_state_changed", Boolean.valueOf(ee3.A05));
                A082.BZL();
            }
        }
        if (ee2 instanceof EEW) {
            F5z f5z3 = this.A00;
            EEW eew = (EEW) ee2;
            1UG A083 = 1BK.A08(1BK.A07(f5z3.A00), "carrier_signal_ping_funnel_client_ping_start");
            if (A083.isSampled()) {
                A083.A7R("ping_group_id", eew.A02);
                A083.A7R("ping_id", eew.A03);
                A083.A7R("carrier_signal_url", eew.A01.A02);
                long j3 = 0;
                try {
                    j3 = Long.parseLong(F5z.A00(f5z3));
                } catch (NumberFormatException unused3) {
                }
                DKD.A1D(A083, j3);
                A083.BZL();
            }
        }
        if (ee2 instanceof EEf) {
            F5z f5z4 = this.A00;
            EEf eEf = (EEf) ee2;
            EEW eew2 = ((EDN) eEf).A00;
            1UG A084 = 1BK.A08(1BK.A07(f5z4.A00), "carrier_signal_ping_funnel_client_ping_end");
            if (A084.isSampled()) {
                A084.A7R("ping_group_id", eew2.A02);
                A084.A7R("ping_id", eew2.A03);
                A084.A7R("carrier_signal_url", eew2.A01.A02);
                long j4 = 0;
                try {
                    j4 = Long.parseLong(F5z.A00(f5z4));
                } catch (NumberFormatException unused4) {
                }
                DKD.A1D(A084, j4);
                A084.A6H("ping_response_status", 1BK.A0l(eEf.A00));
                A084.BZL();
            }
        }
    }
}
