package X;

import com.facebook.messaging.sharing.contentdiscovery.model.LifeEvent;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: Cts.class */
public final class Cts implements NAL {
    public final /* synthetic */ C1f A00;
    public final /* synthetic */ Bt9 A01;
    public final /* synthetic */ N4B A02;
    public final /* synthetic */ ImmutableList A03;

    public Cts(C1f c1f, Bt9 bt9, N4B n4b, ImmutableList immutableList) {
        this.A01 = bt9;
        this.A03 = immutableList;
        this.A00 = c1f;
        this.A02 = n4b;
    }

    @Override // X.NAL
    public void C49(Throwable th) {
        0fH.A0r("FriendUpdatesHelper", "Unable to load fb friend updates.", th);
        this.A02.A04();
    }

    @Override // X.NAL
    public void C98(8Kl r302) {
        ImmutableList immutableList;
        List list;
        HashMap A0u = AnonymousClass001.A0u();
        ArrayList A0s = AnonymousClass001.A0s();
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!11T.A0O(r302, 8Kl.A02)) {
            1Du it = r302.A01.iterator();
            while (it.hasNext()) {
                LifeEvent lifeEvent = (LifeEvent) it.next();
                String str = lifeEvent.A06;
                11T.A0A(str);
                String str2 = lifeEvent.A04;
                String str3 = lifeEvent.A05;
                String str4 = lifeEvent.A0B;
                11T.A0A(str4);
                String str5 = lifeEvent.A07;
                11T.A0A(str5);
                String str6 = lifeEvent.A09;
                11T.A0A(str6);
                Long l = lifeEvent.A02;
                if (str2 == null || str3 == null || l == null) {
                    A0u.put(str4, 1BK.A0b());
                } else if (!A0u.containsKey(str4) || (list = (List) A0u.get(str4)) == null || list.size() < 4 || Long.parseLong(1BK.A14(list, 93)) <= l.longValue()) {
                    ImmutableList of = ImmutableList.of((Object) str, (Object) str2, (Object) str3, (Object) AbH.A1B(l));
                    11T.A0A(of);
                    A0u.put(str4, of);
                    1Kh A0l = AbM.A0l(str4);
                    AbH.A1U(A0l, str5);
                    A0l.A1R = str6;
                    A0l.A13 = str;
                    A0s.add(AbF.A0w(A0l));
                }
            }
        }
        if (7zM.A1b(A0s)) {
            Bt9 bt9 = this.A01;
            C00i c00i = bt9.A03.A00;
            if (AbK.A0l(c00i).AZk(36321322949492955L)) {
                1Br.A0C(bt9.A01);
                immutableList = CB8.A00(this.A03, A0u, A0s, 2yD.A00(AbK.A0l(c00i), 36602797926127494L), 2yD.A00(AbK.A0l(c00i), 36602797926061957L));
            } else {
                immutableList = this.A03;
            }
            builder.addAll(immutableList);
        }
        ImmutableList build = builder.build();
        C1f c1f = this.A00;
        11T.A0D(build);
        c1f.A00(build);
        this.A02.A04();
    }
}
