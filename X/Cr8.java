package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: Cr8.class */
public final class Cr8 implements DFi {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cr8(AcQ acQ, BP5 bp5, int i) {
        this.A00 = i;
        this.A01 = acQ;
        this.A02 = bp5;
    }

    @Override // X.DFi
    public void Cfa(ByH byH, ImmutableList immutableList, ImmutableList immutableList2) {
        C00i c00i;
        Object obj;
        AlE alE;
        C9I c9i;
        String str;
        if (this.A00 == 0) {
            if (byH != null) {
                if (byH.A00 != ((AcQ) this.A01).A1X()) {
                    return;
                }
            }
            AcQ acQ = (AcQ) this.A01;
            if (acQ.A0U != null && acQ.A1Y() == BP5.A0S) {
                if (immutableList2 != null) {
                    1Du it = immutableList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof 5O6) {
                            AbK.A0S(acQ).A0F(next);
                        }
                    }
                }
                acQ.A0U.A1Z((ByH) null, immutableList, (ImmutableList) null);
                int size = immutableList.size();
                if (immutableList2 != null) {
                    1Du it2 = immutableList2.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (next2 instanceof 5O6) {
                            AcP A0S = AbK.A0S(acQ);
                            if (A0S.A0I()) {
                                5O6 r0 = (5O6) next2;
                                r0.A00 = size;
                                AbF.A0Y(A0S.A09).A01(r0, "render ended");
                            }
                        }
                    }
                }
            }
            if (this.A02 != acQ.A1Y() || (c00i = acQ.A0A) == null || ((AcP) c00i.get()).A04 == null || byH == null || byH.A02 == null || !acQ.A0f.isEmpty()) {
                return;
            }
            AbI.A0T(acQ).A04.cacheQueryRender(byH.A02.intValue(), immutableList.size());
            return;
        }
        AcQ acQ2 = (AcQ) this.A01;
        if (1JF.A0B(acQ2.A0f)) {
            return;
        }
        if (acQ2.A0l && C1gb.A01(acQ2.A14).AZk(36321322947723468L)) {
            return;
        }
        C00i c00i2 = acQ2.A14;
        if ((!C1gb.A01(c00i2).AZk(36321322949230810L) || byH == null || (str = byH.A05) == null || acQ2.A0f.equals(str)) && (obj = this.A02) == acQ2.A1Y()) {
            if ((byH == null || byH.A00 == acQ2.A1X()) && (alE = (AlE) acQ2.A0u.get(obj)) != null) {
                alE.A08 = AbK.A0S(acQ2);
                alE.A0K = acQ2.A0n;
                if (immutableList2 != null) {
                    Boolean bool = false;
                    1Du it3 = immutableList2.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        if (next3 instanceof Btt) {
                            alE.A07 = (Btt) next3;
                            bool = true;
                        } else if (next3 instanceof 5O6) {
                            AbK.A0S(acQ2).A0F(next3);
                        }
                    }
                    if (!bool.booleanValue()) {
                        alE.A07 = null;
                    }
                }
                acQ2.A1Y();
                alE.A1Z(byH, immutableList, immutableList2);
                if (immutableList2 == null || obj != acQ2.A1Y()) {
                    return;
                }
                Boolean bool2 = false;
                1Du it4 = immutableList2.iterator();
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    if (next4 instanceof Btt) {
                        alE.A07 = (Btt) next4;
                        bool2 = true;
                    } else if (next4 instanceof 5O6) {
                        C00i c00i3 = acQ2.A0A;
                        if (c00i3 != null && ((AcP) c00i3.get()).A03 != null && byH != null && byH.A02 != null) {
                            DataSourceIdentifier dataSourceIdentifier = ((5O6) next4).A04;
                            int size2 = immutableList.size();
                            if (ClientDataSourceIdentifier.A02(dataSourceIdentifier)) {
                                AbI.A0T(acQ2).A03.cacheQueryRender(byH.A02.intValue(), size2);
                            } else if (dataSourceIdentifier.equals(ClientDataSourceIdentifier.A06)) {
                                AbI.A0T(acQ2).A03.networkQueryRender(byH.A02.intValue(), size2);
                            }
                        }
                        if (!C1gb.A01(c00i2).AZk(36326914994100096L)) {
                            AcP A0S2 = AbK.A0S(acQ2);
                            int size3 = immutableList.size();
                            if (A0S2.A0I()) {
                                5O6 r02 = (5O6) next4;
                                r02.A00 = size3;
                                AbF.A0Y(A0S2.A09).A01(r02, "render ended");
                            }
                        }
                        if (acQ2.A0O != null && !immutableList.isEmpty() && (c9i = acQ2.A0O.A00.A06) != null) {
                            c9i.A02(true);
                        }
                    }
                }
                if (bool2.booleanValue()) {
                    return;
                }
                alE.A07 = null;
            }
        }
    }
}
