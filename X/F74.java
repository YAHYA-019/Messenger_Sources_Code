package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: F74.class */
public final class F74 {
    public static void A00(C1790AsO c1790AsO, Integer num, Integer num2, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new 8Le(num, num2, str, c1790AsO.A01));
    }

    public ArrayList A01(8Ls r302, 8Ls r303) {
        Iterable A03;
        AbstractMap abstractMap = (AbstractMap) r302.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0x = AnonymousClass001.A0x(abstractMap);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            DqE dqE = (DqE) ((AbstractMap) r303.A00).get(A0z.getKey());
            DqE dqE2 = (DqE) A0z.getValue();
            if (dqE != null) {
                boolean A0O = 11T.A0O(dqE.A05, dqE2.A05);
                boolean z = !11T.A0O(dqE.A06, dqE2.A06);
                if (A0O) {
                    A03 = C0ty.A00;
                } else if (z) {
                    String str = dqE2.A02;
                    String str2 = dqE2.A03;
                    String str3 = dqE2.A04;
                    String str4 = dqE2.A07;
                    java.util.Map map = (java.util.Map) dqE2.A01;
                    ArrayList A0t = AnonymousClass001.A0t(map.size());
                    Iterator A0y = AnonymousClass001.A0y(map);
                    while (A0y.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(A0y);
                        A00((C1790AsO) A0z2.getValue(), 0S2.A00, (Integer) ((C1790AsO) A0z2.getValue()).A00, ((C1790AsO) A0z2.getValue()).A02, A0t);
                    }
                    DqM dqM = new DqM(str, str2, str3, str4, A0t);
                    String str5 = dqE.A02;
                    String str6 = dqE.A03;
                    String str7 = dqE.A04;
                    String str8 = dqE.A07;
                    java.util.Map map2 = (java.util.Map) dqE.A01;
                    ArrayList A0t2 = AnonymousClass001.A0t(map2.size());
                    Iterator A0y2 = AnonymousClass001.A0y(map2);
                    while (A0y2.hasNext()) {
                        Map.Entry A0z3 = AnonymousClass001.A0z(A0y2);
                        A00((C1790AsO) A0z3.getValue(), 0S2.A01, (Integer) ((C1790AsO) A0z3.getValue()).A00, ((C1790AsO) A0z3.getValue()).A02, A0t2);
                    }
                    A03 = C0s8.A14(dqM, new DqM(str5, str6, str7, str8, A0t2));
                } else {
                    java.util.Map map3 = (java.util.Map) dqE2.A01;
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    Iterator A0y3 = AnonymousClass001.A0y(map3);
                    while (A0y3.hasNext()) {
                        Map.Entry A0z4 = AnonymousClass001.A0z(A0y3);
                        if (((java.util.Map) dqE.A01).get(A0z4.getKey()) == null) {
                            C1790AsO c1790AsO = (C1790AsO) A0z4.getValue();
                            A00(c1790AsO, 0S2.A00, (Integer) c1790AsO.A00, c1790AsO.A02, A0s2);
                        }
                    }
                    ArrayList A10 = 7zO.A10(A0s2, 0);
                    java.util.Map map4 = (java.util.Map) dqE.A01;
                    Set A06 = AnonymousClass041.A06(0QD.A0f(map3.keySet()), 0QD.A0f(map4.keySet()));
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    Iterator it = A06.iterator();
                    while (it.hasNext()) {
                        C1790AsO c1790AsO2 = (C1790AsO) map4.get(it.next());
                        if (c1790AsO2 != null) {
                            A00(c1790AsO2, 0S2.A01, (Integer) c1790AsO2.A00, c1790AsO2.A02, A0s3);
                        }
                    }
                    A10.addAll(A0s3);
                    A03 = 11T.A03(new DqM(dqE2.A02, dqE2.A03, dqE2.A04, dqE2.A07, A10));
                }
            } else {
                String str9 = dqE2.A02;
                String str10 = ((DqE) A0z.getValue()).A03;
                String str11 = ((DqE) A0z.getValue()).A04;
                String str12 = ((DqE) A0z.getValue()).A07;
                Collection<C1790AsO> values = ((java.util.Map) ((DqE) A0z.getValue()).A01).values();
                ArrayList A1E = C1A3.A1E(values);
                for (C1790AsO c1790AsO3 : values) {
                    A00(c1790AsO3, 0S2.A00, (Integer) c1790AsO3.A00, c1790AsO3.A02, A1E);
                }
                A03 = 11T.A03(new DqM(str9, str10, str11, str12, A1E));
            }
            0QU.A0t(A03, A0s);
        }
        ArrayList A102 = 7zO.A10(A0s, 0);
        AbstractMap abstractMap2 = (AbstractMap) r303.A00;
        Set keySet = abstractMap2.keySet();
        11T.A0A(keySet);
        Set A0f = 0QD.A0f(keySet);
        Set keySet2 = abstractMap.keySet();
        11T.A0A(keySet2);
        Set A062 = AnonymousClass041.A06(0QD.A0f(keySet2), A0f);
        ArrayList A0s4 = AnonymousClass001.A0s();
        Iterator it2 = A062.iterator();
        while (it2.hasNext()) {
            DqE dqE3 = (DqE) abstractMap2.get(it2.next());
            if (dqE3 != null) {
                String str13 = dqE3.A02;
                String str14 = dqE3.A03;
                String str15 = dqE3.A04;
                String str16 = dqE3.A07;
                Collection<C1790AsO> values2 = ((java.util.Map) dqE3.A01).values();
                ArrayList A1E2 = C1A3.A1E(values2);
                for (C1790AsO c1790AsO4 : values2) {
                    A00(c1790AsO4, 0S2.A01, (Integer) c1790AsO4.A00, c1790AsO4.A02, A1E2);
                }
                A0s4.add(new DqM(str13, str14, str15, str16, A1E2));
            }
        }
        A102.addAll(A0s4);
        return A102;
    }
}
