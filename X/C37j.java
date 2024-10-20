package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;

/* renamed from: X.37j, reason: invalid class name */
/* loaded from: 37j.class */
public final class C37j extends C1yc {
    public final 1De A00;
    public final 1Br A01;
    public final C15h A02;

    public C37j(1De r302) {
        super((0AC) 1Bi.A03(46), (1Ih) 1Bi.A03(67196), new DBe(r302, 69));
        this.A00 = r302;
        this.A01 = 1Bu.A03(r302.A00, 83018);
        this.A02 = new DBe(this, 70);
    }

    public static final ThreadKey A00(C37j c37j, String str, int i) {
        if (i == 7) {
            long parseLong = Long.parseLong(str);
            String str2 = ((User) ((C1yc) c37j).A02.get()).A13;
            11T.A0A(str2);
            return ThreadKey.A0J(parseLong, Long.parseLong(str2));
        }
        if (i != 13) {
            throw AnonymousClass001.A0q("Thread type not supported:");
        }
        long abs = Math.abs(Long.parseLong(str));
        String str3 = ((User) ((C1yc) c37j).A02.get()).A13;
        11T.A0A(str3);
        return ThreadKey.A0G(abs, Long.parseLong(str3));
    }

    @Override // X.C1yc
    public 21G A08(C1yd c1yd) {
        21G A08 = super.A08(c1yd);
        1qW r0 = c1yd.A01;
        int i = c1yd.A00;
        Integer nullableInteger = ((1qX) r0).mResultSet.getNullableInteger(i, 2);
        if (nullableInteger == null) {
            nullableInteger = 0;
        }
        int intValue = nullableInteger.intValue();
        C1zm c1zm = new C1zm(A08.A00);
        c1zm.A20 = null;
        c1zm.A2A = ((1qX) r0).mResultSet.getString(i, 21);
        c1zm.A0F = intValue;
        return new 21G(new ThreadSummary(c1zm), A08.A01, A08.A02);
    }

    @Override // X.C1yc
    public 21G A09(5pK r302, java.util.Map map) {
        if (1qX.A00(r302.A0R) != 0) {
            21G A09 = super.A09(r302, map);
            long intValue = r302.A0f != null ? r0.intValue() * 1000 : 0L;
            C1zm c1zm = new C1zm(A09.A00);
            c1zm.A0F = intValue;
            return new 21G(new ThreadSummary(c1zm), A09.A01, A09.A02);
        }
        ThreadKey A07 = A07(r302);
        11T.A0F(A07, 0);
        if (!A07.A19()) {
            throw 1BK.A0g();
        }
        User user = (User) super.A02.get();
        C2x c2x = (C2x) 1Br.A0B(this.A01);
        User A00 = c2x.A00(1Fw.A05(c2x.A00), String.valueOf(A07.A02));
        HeterogeneousMap heterogeneousMap = HeterogeneousMap.A02;
        11T.A0I(heterogeneousMap, "null cannot be cast to non-null type com.facebook.xapp.messaging.map.HeterogeneousMap<T of com.facebook.xapp.messaging.map.HeterogeneousMap.Companion.empty>");
        long j = -1;
        ThreadParticipant A03 = C1z0.A03(user, heterogeneousMap, 0, null, null, null, 0L, 0L, j, 0L, 0L, false, false, false);
        11T.A0I(heterogeneousMap, "null cannot be cast to non-null type com.facebook.xapp.messaging.map.HeterogeneousMap<T of com.facebook.xapp.messaging.map.HeterogeneousMap.Companion.empty>");
        ThreadParticipant A032 = C1z0.A03(A00, heterogeneousMap, 0, null, null, null, 0L, 0L, j, 0L, 0L, false, false, false);
        C1zm c1zm2 = new C1zm();
        c1zm2.A03(A07);
        c1zm2.A0g = 1F9.A0I;
        c1zm2.A2i = true;
        c1zm2.A2H = true;
        c1zm2.A20 = A00.A0X.toString();
        c1zm2.A0E(ImmutableList.of((Object) A03, (Object) A032));
        c1zm2.A2b = true;
        return new 21G(new ThreadSummary(c1zm2), ImmutableList.of((Object) A00, (Object) user));
    }
}
