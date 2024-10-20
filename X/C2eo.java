package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2eo, reason: invalid class name */
/* loaded from: 2eo.class */
public final class C2eo {
    public int A00;
    public 1BY A01;
    public final FbUserSession A02;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final 1qH A09;
    public final C21N A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final C00i A08 = new 1BQ(16826);
    public final C00i A03 = new 1BQ(84840);

    public C2eo(1BO r302, FbUserSession fbUserSession) {
        1BQ r0 = new 1BQ(66630);
        this.A07 = r0;
        this.A0B = new 1BQ(99390);
        1BQ r02 = new 1BQ(16385);
        this.A0C = r02;
        this.A00 = 0;
        this.A01 = new 1BY(r302);
        this.A02 = fbUserSession;
        this.A0A = (C21N) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 33124);
        this.A09 = (1qH) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84335);
        this.A04 = new 1MV(fbUserSession, (1BY) null, 33148);
        this.A06 = new 1MV(fbUserSession, (1BY) null, 67629);
        this.A05 = new 1MV(fbUserSession, (1BY) null, 33134);
        this.A0E = Boolean.valueOf(((2yD) r02.get()).AZk(36320674406547063L));
        this.A0D = Boolean.valueOf(((2yD) r02.get()).AZk(36319935673481678L));
        if (C1gb.A02((C1gb) r0.get()).AZk(36323242796992881L)) {
            MailboxFeature mailboxFeature = (MailboxFeature) this.A06.get();
            int i = C1gb.A02((C1gb) this.A07.get()).AZk(36323242797517175L) ? 2 : 1;
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            if (!AQV.Cj2(new C1251Abt(i, 2, mailboxFeature, mailboxFutureImpl))) {
                mailboxFutureImpl.cancel(false);
            }
            mailboxFutureImpl.addResultCallback(new Cxb(this, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.Future, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static ImmutableList A00(C2es c2es, C2eo c2eo, C1qy c1qy) {
        ?? obj = new Object();
        A03(c2es, c2eo, new C02103tz(c2es, c2eo, c1qy, obj));
        try {
            return (ImmutableList) obj.get();
        } catch (InterruptedException | ExecutionException e) {
            throw 1BK.A0s("Error during orca contact list load: ", e);
        }
    }

    public static ImmutableList A01(C1qy c1qy, MailboxNullable mailboxNullable) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (mailboxNullable.value != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= ((1qX) mailboxNullable.value).mResultSet.getCount()) {
                    break;
                }
                builder.m11011add(c1qy.Anc(mailboxNullable.value, i2));
                i = i2 + 1;
            }
        }
        return builder.build();
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static SettableFuture A02(C2eo c2eo, C1qy c1qy, ImmutableList immutableList, long j) {
        ((C0dp) c2eo.A0B.get()).now();
        HashSet hashSet = new HashSet();
        C1pq.A08("contactIdsToInclude", immutableList);
        if (!hashSet.contains("contactIdsToInclude")) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet = hashSet2;
            hashSet2.add("contactIdsToInclude");
        }
        C2es c2es = new C2es(null, null, immutableList, null, -1, 60, null, null, null, hashSet, false, false, false, false, false, false, false, false);
        ?? obj = new Object();
        C1qM ju1 = new JU1(c2es, c2eo, c1qy, immutableList, (SettableFuture) obj);
        ((ScheduledExecutorService) 1Bi.A03(16465)).schedule(new JU0(c2es, c2eo, c1qy, ju1, (SettableFuture) obj), j, TimeUnit.MILLISECONDS);
        c2eo.A0A.A00(ju1);
        A04(c2eo, immutableList);
        return obj;
    }

    public static void A03(C2es c2es, C2eo c2eo, MailboxCallback mailboxCallback) {
        C2et c2et = (C2et) c2eo.A05.get();
        ImmutableList A00 = c2es.A00();
        ImmutableList A01 = c2es.A01();
        boolean z = c2es.A0A;
        ImmutableList A02 = c2es.A02();
        boolean z2 = c2es.A0B;
        boolean z3 = c2es.A09;
        boolean z4 = c2es.A07;
        boolean z5 = c2es.A08;
        boolean z6 = c2es.A06;
        Integer num = c2es.A00;
        Long l = c2es.A04;
        boolean booleanValue = c2eo.A0E.booleanValue();
        int intValue = c2es.A02.intValue();
        int intValue2 = c2es.A01.intValue();
        String str = c2es.A05;
        Integer num2 = c2es.A03;
        int i = 0;
        if (c2es.A0C) {
            i = 1000;
        }
        1Um AQV = c2et.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new C2eu(mailboxFutureImpl, c2et, num, l, num2, str, A00, A01, A02, i, intValue, intValue2, z, z2, z3, z4, z5, z6, booleanValue))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback((Executor) 1Bi.A03(16457), mailboxCallback);
    }

    public static void A04(C2eo c2eo, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            MailboxFeature mailboxFeature = (MailboxFeature) c2eo.A04.get();
            long longValue = number.longValue();
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(2);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            if (!AQV.Cj2(new Iav(mailboxFeature, mailboxFutureImpl, null, 1, longValue))) {
                mailboxFutureImpl.cancel(false);
            }
        }
    }

    public 2FT A05(String str, String str2, Collection collection) {
        1qH r0 = this.A09;
        r0.A00(str2 == null ? null : (5O6) r0.A01.get(str2), "msys fetch started");
        Object obj = str2 == null ? null : r0.A01.get(str2);
        C00683ob c00683ob = (C00683ob) this.A06.get();
        String A00 = 5O7.A00(str);
        ArrayList A0s = AnonymousClass001.A0s();
        Boolean A0d = 1BK.A0d();
        Boolean valueOf = Boolean.valueOf(collection.contains(C1r4.A0B));
        Boolean valueOf2 = Boolean.valueOf(collection.contains(C1r4.A09));
        Boolean valueOf3 = Boolean.valueOf(!collection.contains(C1r4.A0C));
        Boolean valueOf4 = Boolean.valueOf(!this.A0D.booleanValue());
        Boolean bool = this.A0E;
        C00i c00i = this.A07;
        Boolean A01 = 2yD.A01(C1gb.A01(c00i), 36319935674530262L);
        Boolean valueOf5 = Boolean.valueOf(collection.contains(C1r4.A08));
        Boolean A012 = 2yD.A01(C1gb.A01(c00i), 2342166200471144770L);
        Boolean A013 = 2yD.A01(C1gb.A01(c00i), 36323242797517175L);
        1Um AQV = c00683ob.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new Cz2(A0P, c00683ob, true, A0d, valueOf, A0d, A0d, A0d, valueOf2, valueOf3, A0d, A0d, valueOf4, A0d, A0d, A0d, A0d, A0d, A0d, A0d, A0d, bool, A0d, A01, A0d, valueOf5, A012, A013, 1, -1, A0s, A00), A0P, false);
        return 2FP.A02(new 31Y(this, obj, 2), new C3e7(A0P), (Executor) 1Bi.A03(16457));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public SettableFuture A06(C2es c2es) {
        0fH.A0g("", "MsysContactAdapterImpl", "loadContactListAsUsersAsync \"%s\" called");
        C1qy c1qy = (C1qy) this.A08.get();
        ?? obj = new Object();
        A03(c2es, this, new C02103tz(c2es, this, c1qy, obj));
        return obj;
    }

    public void A07(5Vz r302, ImmutableList immutableList) {
        A08(r302, immutableList, false);
    }

    public void A08(5Vz r302, ImmutableList immutableList, boolean z) {
        C2et c2et = (C2et) this.A05.get();
        ImmutableList of = ImmutableList.of();
        ImmutableList of2 = ImmutableList.of();
        boolean booleanValue = this.A0E.booleanValue();
        int i = 0;
        if (z) {
            i = 1000;
        }
        1Um AQV = c2et.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new C2eu(mailboxFutureImpl, c2et, null, null, null, null, of, of2, immutableList, i, 0, -1, false, false, false, false, false, false, booleanValue))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback((Executor) 1Bi.A03(16457), new Cxe(this, r302, 11));
    }

    public void A09(String str, Long l) {
        MailboxFeature mailboxFeature = (MailboxFeature) this.A04.get();
        long longValue = l.longValue();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new Iav(mailboxFeature, mailboxFutureImpl, str, 1, longValue))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
