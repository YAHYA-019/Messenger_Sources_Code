package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: X.2eq, reason: invalid class name */
/* loaded from: 2eq.class */
public final class C2eq {
    public final 1Br A00;
    public final FbUserSession A01;

    public C2eq(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A00 = 1Bq.A00(33103);
    }

    public final C2es A00(2eW r302) {
        int i;
        Collection collection = r302.A05;
        ImmutableList immutableList = null;
        Integer num = null;
        HashSet hashSet = new HashSet();
        boolean z = true;
        ImmutableList A01 = ((C1r3) this.A00.A00.get()).A01(collection);
        C1pq.A08("contactExactTypes", A01);
        if (!hashSet.contains("contactExactTypes")) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet = hashSet2;
            hashSet2.add("contactExactTypes");
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (r302.A07) {
            builder.m11011add((Object) Long.valueOf(Long.parseLong(this.A01.A02)));
        }
        ImmutableList build = builder.build();
        C1pq.A08("contactIdsToExclude", build);
        if (!hashSet.contains("contactIdsToExclude")) {
            HashSet hashSet3 = new HashSet(hashSet);
            hashSet = hashSet3;
            hashSet3.add("contactIdsToExclude");
        }
        boolean z2 = r302.A0B;
        boolean z3 = r302.A0C;
        Collection<UserKey> collection2 = r302.A06;
        if (collection2 != null) {
            z = false;
            if (collection2.isEmpty()) {
                immutableList = ImmutableList.of();
            } else {
                ImmutableList.Builder builder2 = ImmutableList.builder();
                for (UserKey userKey : collection2) {
                    1Js r0 = userKey.type;
                    if (r0 == 1Js.A03 || r0 == 1Js.A04) {
                        String str = userKey.id;
                        11T.A0A(str);
                        builder2.m11011add((Object) Long.valueOf(Long.parseLong(str)));
                    } else {
                        0fH.A0k("MsysQueryConverter", "Unsupported user type to include in OrcaContact query.");
                    }
                }
                immutableList = builder2.build();
            }
            C1pq.A08("contactIdsToInclude", immutableList);
            if (!hashSet.contains("contactIdsToInclude")) {
                HashSet hashSet4 = new HashSet(hashSet);
                hashSet = hashSet4;
                hashSet4.add("contactIdsToInclude");
            }
        }
        boolean z4 = r302.A0E ? false : true;
        boolean z5 = r302.A08;
        boolean z6 = r302.A0D;
        2eX r02 = 2eX.A06;
        2eX r03 = 2eX.A03;
        ImmutableList of = ImmutableList.of((Object) r02, (Object) r03);
        11T.A0A(of);
        String name = of.contains(r302.A01) ? r302.A01.name() : null;
        2eX r04 = r302.A01;
        if (r04 != r03) {
            if (r04 == 2eX.A04) {
                num = 1;
            } else if (r04 == 2eX.A08) {
                i = 3;
            } else if (r04 == 2eX.A02) {
                i = 34;
            }
            Integer valueOf = Integer.valueOf(r302.A00);
            C1pq.A08("maxResults", valueOf);
            return new C2es(A01, build, immutableList, null, valueOf, 0, num, null, name, hashSet, z6, z4, z5, z3, z, z2, r302.A0I, r302.A0J);
        }
        i = 21;
        num = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(r302.A00);
        C1pq.A08("maxResults", valueOf2);
        return new C2es(A01, build, immutableList, null, valueOf2, 0, num, null, name, hashSet, z6, z4, z5, z3, z, z2, r302.A0I, r302.A0J);
    }
}
