package X;

/* loaded from: GP7.class */
public final class GP7 {
    public final 1Br A00 = 1BK.A0D();

    public static final EnumC03583yg A00(C1yg c1yg) {
        int ordinal = c1yg.ordinal();
        return ordinal != 13 ? ordinal != 14 ? ordinal != 0 ? ordinal != 1 ? ordinal != 23 ? EnumC03583yg.A0M : EnumC03583yg.A0E : EnumC03583yg.A0D : EnumC03583yg.A0G : EnumC03583yg.A02 : EnumC03583yg.A03;
    }

    public void A01(C1yg c1yg, Integer num, Integer num2, Integer num3, String str) {
        HCf hCf;
        int i;
        1BL.A11(1, num, num3, c1yg);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1786));
        if (A08.isSampled()) {
            EnumC03583yg A00 = A00(c1yg);
            HCc hCc = null;
            A08.A6H("thread_id", (Long) null);
            GOn.A1Q(A08, str);
            A08.A5c(A00, "thread_type");
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 0) {
                    hCc = HCc.A04;
                } else if (intValue == 1) {
                    hCc = HCc.A01;
                } else if (intValue == 2) {
                    hCc = HCc.A02;
                } else {
                    if (intValue != 3) {
                        throw 1BK.A1F();
                    }
                    hCc = HCc.A03;
                }
            }
            A08.A5c(hCc, "view_name");
            switch (num.intValue()) {
                case 0:
                    hCf = HCf.A0D;
                    break;
                case 1:
                    hCf = HCf.A02;
                    break;
                case 2:
                    hCf = HCf.A05;
                    break;
                case 3:
                    hCf = HCf.A01;
                    break;
                case 4:
                    hCf = HCf.A06;
                    break;
                case 5:
                    hCf = HCf.A09;
                    break;
                case 6:
                    hCf = HCf.A0A;
                    break;
                case 7:
                    hCf = HCf.A03;
                    break;
                case 8:
                    hCf = HCf.A0C;
                    break;
                case 9:
                    hCf = HCf.A0B;
                    break;
                case 10:
                    hCf = HCf.A07;
                    break;
                case 11:
                    hCf = HCf.A04;
                    break;
                default:
                    hCf = HCf.A08;
                    break;
            }
            A08.A5c(hCf, AbstractC00603o4.A00(293));
            int intValue2 = num3.intValue();
            if (intValue2 == 0) {
                i = 999;
            } else if (intValue2 != 1) {
                i = 18;
                if (intValue2 != 2) {
                    i = 20;
                }
            } else {
                i = 17;
            }
            4YU.A1I(A08, "major_entry_point", i);
            A08.BZL();
        }
    }

    public void A02(C1yg c1yg, Integer num, Integer num2, String str) {
        int i;
        1BK.A1J(num2, 2, c1yg);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1787));
        if (A08.isSampled()) {
            EnumC03583yg A00 = A00(c1yg);
            A08.A6H("thread_id", (Long) null);
            GOn.A1Q(A08, str);
            A08.A5c(A00, "thread_type");
            int intValue = num.intValue();
            A08.A5c(intValue != 1 ? intValue != 2 ? HCc.A03 : HCc.A02 : HCc.A01, "view_name");
            int intValue2 = num2.intValue();
            if (intValue2 == 0) {
                i = 999;
            } else if (intValue2 != 1) {
                i = 18;
                if (intValue2 != 2) {
                    i = 20;
                }
            } else {
                i = 17;
            }
            4YU.A1I(A08, "major_entry_point", i);
            A08.BZL();
        }
    }
}
