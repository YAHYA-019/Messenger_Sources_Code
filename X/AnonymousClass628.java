package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.secure.secrettypes.SecretString;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.reactions.reactors.model.Reactor;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.628, reason: invalid class name */
/* loaded from: 628.class */
public abstract class AnonymousClass628 {
    public static final 5vV A00(Context context, FbUserSession fbUserSession, AnonymousClass622 anonymousClass622) {
        Object obj;
        C5fq A4n;
        Long l;
        boolean z;
        String str;
        String str2;
        C5fr c5fr;
        boolean z2;
        C5fr c5fr2;
        1MV A00 = 1Lo.A00(context, fbUserSession, 49938);
        1BQ r0 = new 1BQ(16385);
        0OI A1B = C13m.A1B();
        A1B.add(1Lo.A04(context, fbUserSession, (1BY) null, 66329));
        if (((2yD) r0.get()).AZk(36317607801007580L)) {
            C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 607);
            Context A002 = 1Bf.A00(c1f6);
            try {
                A9g a9g = new A9g(new 1De(c1f6, new int[0]), anonymousClass622);
                1Bn.A0K();
                FbInjector.A04(A002);
                A1B.add(a9g);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A002);
                throw th;
            }
        }
        A1B.add(1Lo.A04(context, fbUserSession, (1BY) null, 66328));
        if (((2yD) r0.get()).AZk(36317607800810971L)) {
            A1B.add(1Lo.A04(context, fbUserSession, (1BY) null, 68244));
        }
        if (((2yD) r0.get()).AZk(36317607801269728L)) {
            A1B.add(1Lo.A04(context, fbUserSession, (1BY) null, 67777));
        }
        0OI A1C = C13m.A1C(A1B);
        Message message = anonymousClass622.A03;
        11T.A09(message);
        Iterator it = A1C.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!((62A) obj).BQi(message));
        62A r02 = (62A) obj;
        if (r02 == null || (A4n = r02.A4n(message)) == null) {
            return null;
        }
        C62C c62c = (C62C) A00.get();
        ThreadSummary threadSummary = anonymousClass622.A05;
        if (threadSummary != null) {
            l = threadSummary.A1e;
            z = threadSummary.A2X;
        } else {
            l = null;
            z = false;
        }
        ParticipantInfo participantInfo = message.A0K;
        participantInfo.getClass();
        FbUserSession fbUserSession2 = c62c.A01;
        1BY r03 = c62c.A00;
        23F r04 = (23F) 1Lo.A04((Context) null, fbUserSession2, r03, 33102);
        UserKey userKey = participantInfo.A0F;
        User A003 = r04.A00(userKey);
        String A004 = participantInfo.A00();
        A004.getClass();
        if (A003 != null) {
            str = A003.A07();
        } else {
            SecretString secretString = participantInfo.A0B;
            str = secretString != null ? secretString.A00 : null;
        }
        C1q8 A04 = message.A04();
        if (A04 == C1q8.A0A) {
            A4n.A04 = message.A08().A02 == 5PN.A0F ? C2o9.A04 : C2o9.A03;
        } else if (A04 == C1q8.A0M) {
            A4n.A01(C2o9.A07);
        } else {
            A4n.A01(C2o9.A05);
        }
        if (A003 != null) {
            str2 = A003.A0X.A01();
        } else {
            str2 = participantInfo.A09.A00;
            if (str2 == null) {
                str2 = "";
            }
        }
        C00i c00i = c62c.A03;
        62D r320 = (62D) c00i.get();
        synchronized (r320) {
            try {
                c5fr = (C5fr) r320.A00.get(A004);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c5fr == null) {
            HashSet hashSet = new HashSet();
            C1pq.A08("authorName", str2);
            if (str == null) {
                str = "";
            }
            long j = message.A05;
            c5fr = new C5fr(null, null, userKey, null, null, null, null, A004, str2, null, str, null, hashSet, j, 0L, j);
            62D r05 = (62D) c00i.get();
            synchronized (r05) {
                r05.A00.put(A004, c5fr);
            }
        }
        ImmutableMultimap immutableMultimap = message.A00().A01;
        HashMultimap hashMultimap = new HashMultimap();
        1Du it2 = immutableMultimap.AQp().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            User A005 = ((23F) 1Lo.A04((Context) null, fbUserSession2, r03, 33102)).A00((UserKey) entry.getValue());
            Object A0E = 1Bn.A0E((Context) null, r03, 83433);
            if (A005 != null) {
                r320 = (62D) c00i.get();
                String str3 = ((UserKey) entry.getValue()).id;
                synchronized (r320) {
                    11T.A0F(str3, 0);
                    c5fr2 = (C5fr) r320.A00.get(str3);
                }
                if (c5fr2 == null) {
                    HashSet hashSet2 = new HashSet();
                    String str4 = A005.A13;
                    C1pq.A08("authorId", str4);
                    String A01 = A005.A0X.A01();
                    C1pq.A08("authorName", A01);
                    String A07 = A005.A07() == null ? "" : A005.A07();
                    C1pq.A08("authorProfPicUrl", A07);
                    c5fr2 = new C5fr(null, null, null, null, null, null, null, str4, A01, null, A07, null, hashSet2, 0L, 0L, 0L);
                    62D r06 = (62D) c00i.get();
                    String str5 = ((UserKey) entry.getValue()).id;
                    synchronized (r06) {
                        11T.A0F(str5, 0);
                        r06.A00.put(str5, c5fr2);
                    }
                }
                String str6 = c5fr2.A07;
                String str7 = c5fr2.A06;
                hashMultimap.CZw(entry.getKey(), new Reactor(str6, str7, c5fr2.A09, str7.equals(A0E)));
            }
        }
        ImmutableListMultimap A02 = ImmutableListMultimap.A02(hashMultimap);
        Object A0E2 = 1Bn.A0E((Context) null, r03, 83433);
        A4n.A04(message.A1V);
        A4n.A0B = message.A1g;
        A4n.A05 = c5fr;
        A4n.A0I = A004.equals(A0E2);
        long j2 = message.A05;
        A4n.A02 = j2;
        A4n.A01 = j2;
        C5lh c5lh = C5lh.A00;
        1Du it3 = A02.A0G().iterator();
        while (true) {
            if (!it3.hasNext()) {
                z2 = false;
                break;
            }
            if (((Reactor) it3.next()).A03) {
                z2 = true;
                break;
            }
        }
        A4n.A02(c5lh, new 5uV(A02, (Long) null, z2));
        A4n.A02(5mM.A00, new C5wl(Boolean.valueOf(z), null, null, null, null, null, l, null, null, null));
        c62c.A02.get();
        C5fv A006 = A4n.A00();
        Capabilities capabilities = Capabilities.A02;
        5vH r07 = 5vH.A05;
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        return new 5vV(A006, new 5vU(capabilities, C1zz.A02(), r07, false, false, false, false));
    }
}
