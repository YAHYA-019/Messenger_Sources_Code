package X;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: Fj0.class */
public final class Fj0 implements 6KF {
    public final 04J A00;
    public final List A01;
    public final C00m A02;
    public final C00m A03;
    public final Function1 A04;

    public Fj0(04J r302) {
        11T.A0F(r302, 1);
        G99 g99 = G99.A00;
        G9d g9d = G9d.A00;
        G9e g9e = G9e.A00;
        7zT.A1U(g99, g9d, g9e);
        this.A00 = r302;
        this.A04 = g99;
        this.A03 = g9d;
        this.A02 = g9e;
        this.A01 = AnonymousClass001.A0s();
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((81E) it.next()).A01);
    }

    public boolean CUk(6KL r302, 81G r303, AnonymousClass814 anonymousClass814, String str, boolean z) {
        long j;
        Long valueOf;
        Bbe[] bbeArr;
        Bbe[] bbeArr2;
        Bbe[] bbeArr3;
        11T.A0F(r302, 4);
        if (str == null) {
            0fH.A0k("MerlinLoggerV2", "No origin provided to merlin logger");
            return false;
        }
        if (!z) {
            0fH.A0j("MerlinLoggerV2", "Logger called but not ready for logging");
            return false;
        }
        0D7 r0 = (0D7) this.A04.invoke(this.A00);
        if (!4YU.A1X(r0)) {
            return false;
        }
        r0.A0E("origin", str);
        81G r02 = anonymousClass814.A00;
        java.util.Map map = r02.A00.A00;
        List A0V = 0QD.A0V(map.values());
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            it.next();
            Iterator it2 = A0V.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AnonymousClass001.A0Q("attachToEvent");
            }
        }
        0DA r03 = (0DA) this.A03.invoke();
        List list = r02.A06;
        ArrayList A1E = C1A3.A1E(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            A00(A1E, it3);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it4 = A1E.iterator();
        while (it4.hasNext()) {
            0QU.A0t(((DLt) it4.next()).A07, A0s);
        }
        r03.A08("t_0", 9B9.A00(A0s, GB8.A00));
        ArrayList A1E2 = C1A3.A1E(list);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            A00(A1E2, it5);
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it6 = A1E2.iterator();
        while (it6.hasNext()) {
            0QU.A0t(((DLt) it6.next()).A02, A0s2);
        }
        r03.A08("t_50", 9B9.A00(A0s2, GBA.A00));
        if (!anonymousClass814.A00().isEmpty()) {
            r03.A08("t_75", anonymousClass814.A00());
        }
        ArrayList A1E3 = C1A3.A1E(list);
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            A00(A1E3, it7);
        }
        ArrayList A0s3 = AnonymousClass001.A0s();
        Iterator it8 = A1E3.iterator();
        while (it8.hasNext()) {
            0QU.A0t(((DLt) it8.next()).A04, A0s3);
        }
        r03.A08("t_100", 9B9.A00(A0s3, GB9.A00));
        0DA r04 = (0DA) this.A02.invoke();
        ArrayList A1E4 = C1A3.A1E(list);
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            A00(A1E4, it9);
        }
        ArrayList A0s4 = AnonymousClass001.A0s();
        Iterator it10 = A1E4.iterator();
        while (it10.hasNext()) {
            0QU.A0t(((DLt) it10.next()).A03, A0s4);
        }
        r04.A08("t_50", 9B9.A00(A0s4, GB7.A00));
        ArrayList A1E5 = C1A3.A1E(list);
        Iterator it11 = list.iterator();
        while (it11.hasNext()) {
            A00(A1E5, it11);
        }
        ArrayList A0s5 = AnonymousClass001.A0s();
        Iterator it12 = A1E5.iterator();
        while (it12.hasNext()) {
            0QU.A0t(((DLt) it12.next()).A05, A0s5);
        }
        r04.A08("t_100", 9B9.A00(A0s5, GB6.A00));
        0DA r05 = new 0DA();
        String str2 = anonymousClass814.A01;
        boolean A0O = 11T.A0O(str2, "fb_newsfeed") ? true : 11T.A0O(str2, "fb_mostRecentTab");
        81J r06 = r02.A01;
        String str3 = "";
        if (r06 != null && (((bbeArr = r06.A00) != null && bbeArr.length != 0) || (((bbeArr2 = r06.A02) != null && bbeArr2.length != 0) || ((bbeArr3 = r06.A01) != null && bbeArr3.length != 0)))) {
            HashMap A0u = AnonymousClass001.A0u();
            if (bbeArr != null && bbeArr.length != 0) {
                0AR r07 = new 0AR(bbeArr);
                while (r07.hasNext()) {
                    A0u.putAll(((Bbe) r07.next()).A00);
                }
            }
            Bbe[] bbeArr4 = r06.A02;
            if (bbeArr4 != null && bbeArr4.length != 0) {
                0AR r08 = new 0AR(bbeArr4);
                while (r08.hasNext()) {
                    A0u.putAll(((Bbe) r08.next()).A00);
                }
            }
            Bbe[] bbeArr5 = r06.A01;
            if (bbeArr5 != null && bbeArr5.length != 0) {
                0AR r09 = new 0AR(bbeArr5);
                while (r09.hasNext()) {
                    A0u.putAll(((Bbe) r09.next()).A00);
                }
            }
            try {
                AnonymousClass243 A00 = AnonymousClass243.A00();
                2DM A0K = A00.A0K();
                Iterator A0x = AnonymousClass001.A0x(A0u);
                while (A0x.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0x);
                    String A0j = AnonymousClass001.A0j(A0z);
                    String A16 = 1BK.A16(A0z);
                    if (A16 == null) {
                        A16 = str3;
                    }
                    if (A0O) {
                        A0K.A0e(A00.A0I(A16), A0j);
                    } else {
                        A0K.A0o(A0j, A16);
                    }
                }
                String A0W = A00.A0W(A0K);
                0fH.A0j("MerlinInternal", A0W);
                11T.A0D(A0W);
                str3 = A0W;
            } catch (2LD | IOException e) {
                0fH.A0r("MerlinInternal", "Error while creating the json string", e);
            }
        }
        r05.A07("placeholder_payload", str3);
        AnonymousClass815 anonymousClass815 = AnonymousClass815.A07;
        if (map.containsKey(anonymousClass815) && map.containsKey(anonymousClass815)) {
            map.get(anonymousClass815);
        }
        ArrayList A1E6 = C1A3.A1E(list);
        Iterator it13 = list.iterator();
        while (it13.hasNext()) {
            A1E6.add(((81E) it13.next()).A00);
        }
        ArrayList<DLv> A0s6 = AnonymousClass001.A0s();
        Iterator it14 = A1E6.iterator();
        while (it14.hasNext()) {
            0QU.A0t(((DLt) it14.next()).A07, A0s6);
        }
        ArrayList<DLv> A0s7 = AnonymousClass001.A0s();
        Iterator it15 = A1E6.iterator();
        while (it15.hasNext()) {
            0QU.A0t(((DLt) it15.next()).A02, A0s7);
        }
        ArrayList<DLv> A0s8 = AnonymousClass001.A0s();
        Iterator it16 = A1E6.iterator();
        while (it16.hasNext()) {
            0QU.A0t(((DLt) it16.next()).A06, A0s8);
        }
        ArrayList<DLv> A0s9 = AnonymousClass001.A0s();
        Iterator it17 = A1E6.iterator();
        while (it17.hasNext()) {
            0QU.A0t(((DLt) it17.next()).A04, A0s9);
        }
        if (!A0s6.isEmpty() || !A0s8.isEmpty() || !A0s7.isEmpty() || !A0s9.isEmpty()) {
            0DA r010 = new 0DA();
            ArrayList A1E7 = C1A3.A1E(A0s6);
            for (DLv dLv : A0s6) {
                0DA r011 = new 0DA();
                DLv.A00(r011, dLv);
                A1E7.add(r011);
            }
            r010.A08("t_0", A1E7);
            ArrayList A1E8 = C1A3.A1E(A0s9);
            for (DLv dLv2 : A0s9) {
                0DA r012 = new 0DA();
                DLv.A00(r012, dLv2);
                A1E8.add(r012);
            }
            r010.A08("t_100", A1E8);
            ArrayList A1E9 = C1A3.A1E(A0s7);
            for (DLv dLv3 : A0s7) {
                0DA r013 = new 0DA();
                DLv.A00(r013, dLv3);
                A1E9.add(r013);
            }
            r010.A08("t_50", A1E9);
            if (!A0s8.isEmpty()) {
                ArrayList A1E10 = C1A3.A1E(A0s8);
                for (DLv dLv4 : A0s8) {
                    0DA r014 = new 0DA();
                    DLv.A00(r014, dLv4);
                    A1E10.add(r014);
                }
                r010.A08("t_75", A1E10);
            }
            r0.A0A(r010, "nested_item_visibility_percent_ts");
        }
        if (!list.isEmpty() && (valueOf = Long.valueOf((j = ((81E) list.get(0)).A01.A00))) != null && j > 0) {
            r0.A0D("full_impression_ts", valueOf);
        }
        Boolean bool = false;
        if (bool.equals(true)) {
            r0.A0B("is_double_logging", bool);
        }
        r0.A0E(7zK.A00(27), r02.A03);
        r0.A0A(r03, "element_visibility_percent_ts");
        r0.A0A(r04, "screen_coverage_percent_ts");
        r0.A0A(r05, "payload");
        r0.A09(r302, "purpose");
        r0.BZL();
        return true;
    }
}
