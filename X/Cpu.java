package X;

import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;

/* loaded from: Cpu.class */
public final class Cpu implements DIW {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public Cpu(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 16428);
        this.A01 = 1Bu.A03(r0, 99945);
        this.A02 = 1Bu.A03(r0, 33205);
        this.A00 = 1Bu.A03(r0, 82623);
    }

    public void A5L(DFe dFe) {
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        int i;
        2Tz r307;
        2To r308;
        ImmutableList build;
        C96 c96 = (C96) obj;
        if (c96 != null && (i = c96.A01) > 0) {
            BP5 bp5 = c96.A02;
            if (BP5.A02(bp5) || bp5 == BP5.A0U) {
                0fH.A0m("SmsSuggestedSectionDataSource", "Fetching section data");
                1Fw.A04((1EZ) 1Br.A0B(this.A03));
                C00i c00i = this.A01.A00;
                CIM cim = (CIM) c00i.get();
                Integer num = 0S2.A01;
                ImmutableList A00 = cim.A00();
                11T.A0A(A00);
                if (A00.isEmpty()) {
                    A00 = ((CIM) c00i.get()).A00();
                    11T.A0A(A00);
                    r307 = (2Tz) 1Br.A0B(this.A02);
                    r308 = 2To.A07;
                } else {
                    r307 = (2Tz) 1Br.A0B(this.A02);
                    r308 = 2To.A08;
                }
                String A02 = r307.A02(r308);
                ImmutableList.Builder builder = ImmutableList.builder();
                1Du it = A00.iterator();
                while (it.hasNext()) {
                    User A0t = AbG.A0t(it);
                    if (!A0t.A1n) {
                        builder.m11011add((Object) A0t);
                    }
                }
                ImmutableList A01 = 1Fj.A01(builder);
                if (A01.isEmpty()) {
                    build = ImmutableList.of();
                } else {
                    ImmutableList.Builder A0h = 4YU.A0h();
                    1Du it2 = A01.iterator();
                    while (it2.hasNext()) {
                        User A0t2 = AbG.A0t(it2);
                        7Yv r0 = (7Yv) 1Br.A0B(this.A00);
                        11T.A0D(A0t2);
                        if (!r0.A00(A0t2)) {
                            A0h.m11011add((Object) A0t2);
                        }
                    }
                    build = A0h.build();
                }
                11T.A0A(build);
                ImmutableList A04 = 1qE.A00(build).A03(Predicates.ObjectPredicate.NOT_NULL).A02(new D2h(A02)).A04();
                11T.A0D(A04);
                EnumC1297Ada enumC1297Ada = EnumC1297Ada.A0e;
                ImmutableList subList = A04.subList(0, Math.min(i, A04.size()));
                11T.A0A(subList);
                C1333AeN c1333AeN = new C1333AeN(enumC1297Ada, subList, null);
                C1323Ae1 c1323Ae1 = C1323Ae1.A03;
                return new C1323Ae1(ImmutableList.of((Object) c1333AeN), num, c1333AeN.A01.size());
            }
        }
        return AbK.A0b();
    }

    public String getFriendlyName() {
        return "SmsSuggestedSectionDataSource";
    }
}
