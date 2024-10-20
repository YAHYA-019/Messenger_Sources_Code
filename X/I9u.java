package X;

import android.os.Build;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: I9u.class */
public abstract class I9u {
    public static ArrayList A00(Hqj hqj, I9d i9d, I9e i9e, Boolean bool) {
        if (bool.booleanValue() && !i9e.A1b()) {
            return A01(i9e);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        boolean z = false;
        if (IEs.A05(hqj, i9d, new int[]{7}) && A03(i9d, i9e)) {
            z = true;
        }
        if (z) {
            A0s.addAll(i9e.A1X() ? A02(i9e, 2, -1, true) : A02(i9e, 2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, true));
        }
        if (Build.VERSION.SDK_INT >= 29 && IEs.A05(hqj, i9d, new int[]{6}) && A03(i9d, i9e) && i9e.A1C()) {
            boolean A1X = i9e.A1X();
            boolean A1D = i9e.A1D();
            A0s.addAll(A1X ? A02(i9e, 2, -1, A1D) : A02(i9e, 2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, A1D));
        }
        List asList = Arrays.asList(1024, 256, 64, 16);
        if (i9e.A1X()) {
            A0s.addAll(A02(i9e, 1, -1, false));
        } else {
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                A0s.addAll(A02(i9e, 1, DKE.A0F(it), false));
            }
        }
        A0s.addAll(A01(i9e));
        0fH.A0g(A0s, "EncoderCheck", "codec setting fallback loop: %s");
        return A0s;
    }

    public static ArrayList A01(I9e i9e) {
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (i9e.A1X()) {
            ArrayList A0s3 = AnonymousClass001.A0s();
            AnonymousClass001.A1J(A0s3, 8);
            AnonymousClass001.A1J(A0s3, 2);
            AnonymousClass001.A1J(A0s3, 1);
            Iterator it = A0s3.iterator();
            while (it.hasNext()) {
                A0s2.addAll(I6o.A00(HBJ.A0A, ((Number) it.next()).intValue(), -1, false, false));
            }
        } else {
            for (Integer num : DKD.A1a()) {
                switch (num.intValue()) {
                    case 1:
                        str = "Main";
                        break;
                    case 2:
                        str = "Baseline";
                        break;
                    default:
                        str = "High";
                        break;
                }
                A0s2.add(I4o.A00(str));
            }
        }
        Iterator it2 = A0s2.iterator();
        while (it2.hasNext()) {
            I4o i4o = (I4o) it2.next();
            if (i9e.A1J() && i4o != null) {
                List asList = Arrays.asList(8, 2);
                int i = i4o.A03;
                if (GOo.A1U(i, asList)) {
                    I4o i4o2 = new I4o(i4o.A04, i, i4o.A02, true, false);
                    i4o2.A00 = i9e.A0h();
                    A0s.add(i4o2);
                }
            }
            A0s.add(i4o);
        }
        return A0s;
    }

    public static ArrayList A02(I9e i9e, int i, int i2, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (!z) {
            try {
                HashSet A00 = I6o.A00(HBJ.A0B, i, i2, !i9e.A1N(), false);
                0fH.A0g(A00, "EncoderCheck", "encoder support for hevc? %s");
                A0s2 = 1BK.A17(A00);
            } catch (RuntimeException e) {
                0fH.A0s("EncoderCheck", "hevc support check error", e);
                A0s2 = AnonymousClass001.A0s();
            }
        } else if (i9e.A1B()) {
            try {
                HashSet A002 = I6o.A00(HBJ.A0B, i, i2, !i9e.A1F(), true);
                0fH.A0g(A002, "EncoderCheck", "encoder support for hevc? %s");
                A0s2 = 1BK.A17(A002);
            } catch (RuntimeException e2) {
                0fH.A0s("EncoderCheck", "hevc support check error", e2);
                A0s2 = AnonymousClass001.A0s();
            }
        }
        Iterator it = A0s2.iterator();
        while (it.hasNext()) {
            I4o i4o = (I4o) it.next();
            A0s.add(i4o);
            if (i9e.A1G() && i4o != null) {
                I4o i4o2 = new I4o(i4o.A04, i4o.A03, i4o.A02, true, i4o.A01);
                i4o2.A00 = i9e.A0j();
                A0s.add(i4o2);
                0fH.A0j("EncoderCheck", "using hevc bframe");
            }
        }
        return A0s;
    }

    public static boolean A03(I9d i9d, I9e i9e) {
        boolean z = true;
        if (i9e.A0L()) {
            HAy hAy = HAy.A03;
            if (IEs.A06(hAy, i9d)) {
                if (i9e.A1a()) {
                    if (i9d != null) {
                        Iterator A0x = AnonymousClass001.A0x(i9d.A07(hAy));
                        loop0: while (A0x.hasNext()) {
                            Iterator A1G = GOn.A1G(GOp.A15(A0x));
                            while (A1G.hasNext()) {
                                if (!((RSc) A1G.next()).A01.BTD()) {
                                }
                            }
                        }
                    }
                }
                z = false;
                break loop0;
            }
        }
        return z;
    }
}
