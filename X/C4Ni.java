package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ni, reason: invalid class name */
/* loaded from: 4Ni.class */
public final class C4Ni {
    public final HashMap A03 = new HashMap();
    public final 1Br A01 = 1Bq.A00(16634);
    public final 1Br A00 = 1Bq.A00(16387);
    public final 1Br A02 = 1Bq.A00(16385);

    public static final List A00(ImmutableList immutableList) {
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            String str = ((User) it.next()).A13;
            11T.A0A(str);
            A0z.add(1BK.A0n(str));
        }
        return A0z;
    }

    public static final void A01(EnumC03583yg enumC03583yg, BOq bOq, C4Re c4Re, BOP bop, BO3 bo3, C4Ni c4Ni, Boolean bool, Long l, Long l2, String str, String str2, List list, boolean z) {
        1UG A00 = 1UD.A00((04J) c4Ni.A01.A00.get(), 1ZG.A01, 1BJ.A00(1676));
        if (A00.isSampled()) {
            if (((2yD) c4Ni.A00.A00.get()).AZk(72340881490841861L) || 1Br.A07(c4Ni.A02).AZk(36318999369627182L)) {
                A00.A5c(c4Re, "event_name");
                A00.A5H(AnonymousClass000.A00(226), Boolean.valueOf(z));
                A00.A6H("group_size_at_creation", Long.valueOf(list.size()));
                A00.A7h("participant_ids_at_creation", list);
                A00.A5c(enumC03583yg, "thread_type");
                A00.A5c(bOq, "entry_point");
                A00.A6H("thread_fbid", l);
                A00.A6H("offline_threading_id", l2);
                A00.A5c(bo3, "target_area");
                A00.A5c(bop, 1BJ.A00(560));
                A00.A5H("user_entered_group_name", bool);
                A00.A7R(TraceFieldType.ErrorCode, str);
                A00.A7R("error_code_description", str2);
                A00.BZL();
            }
        }
    }

    public final void A02(EnumC03583yg enumC03583yg, BOq bOq, ImmutableList immutableList, Long l, Long l2, String str, Throwable th) {
        11T.A0F(bOq, 0);
        1BL.A1F(immutableList, enumC03583yg);
        11T.A0F(th, 4);
        if (1Br.A07(this.A00).AZk(72340881490972935L)) {
            C4Re c4Re = C4Re.GROUP_THREAD_CREATED_OPTIMISTICALLY;
            List A00 = A00(immutableList);
            boolean A1T = AnonymousClass001.A1T(str);
            A01(enumC03583yg, bOq, c4Re, null, null, this, Boolean.valueOf(A1T), l2, l, C3Oo.A01(th).toString(), th.getMessage(), A00, false);
        }
    }

    public final void A03(EnumC03583yg enumC03583yg, BOq bOq, ImmutableList immutableList, String str, long j) {
        11T.A0F(bOq, 0);
        11T.A0G(immutableList, 1, enumC03583yg);
        if (1Br.A07(this.A00).AZk(72340881490972935L)) {
            C4Re c4Re = C4Re.GROUP_THREAD_CREATED_OPTIMISTICALLY;
            List A00 = A00(immutableList);
            A01(enumC03583yg, bOq, c4Re, null, null, this, Boolean.valueOf(AnonymousClass001.A1T(str)), null, Long.valueOf(j), null, null, A00, true);
        }
    }

    public final void A04(BOq bOq, long j) {
        11T.A0F(bOq, 1);
        this.A03.put(Long.valueOf(j), bOq);
    }

    public final void A05(BOq bOq, BOP bop, BO3 bo3) {
        if (((2yD) this.A00.A00.get()).AZk(72340881491038472L)) {
            A01(EnumC03583yg.A0M, bOq, C4Re.GROUP_THREAD_IMPRESSION, bop, bo3, this, null, null, null, null, null, C0ty.A00, true);
        }
    }

    public final void A06(BOq bOq, BOP bop, BO3 bo3, ImmutableList immutableList, String str) {
        if (1Br.A07(this.A00).AZk(72340881491104009L)) {
            C4Re c4Re = C4Re.GROUP_THREAD_CLICK;
            if (immutableList == null) {
                immutableList = 1BK.A0b();
            }
            List A00 = A00(immutableList);
            A01(EnumC03583yg.A0M, bOq, c4Re, bop, bo3, this, Boolean.valueOf(AnonymousClass001.A1T(str)), null, null, null, null, A00, true);
        }
    }
}
