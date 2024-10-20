package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.base.Objects;
import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2gh, reason: invalid class name */
/* loaded from: 2gh.class */
public final class C2gh {
    public 1BY A00;
    public final C00i A05;
    public final C1zA A03 = new ComparatorOrdering(new C3im(3));
    public final C00i A02 = new 1BQ(66656);
    public final C00i A01 = new 1BV((1BY) null, 83436);
    public final C00i A06 = new 1BQ(16385);
    public final C00i A04 = new 1BQ(46);

    public C2gh(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A05 = new 1MV(fbUserSession, (1BY) null, 49772);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r0.equals(r303.A01.get()) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(com.facebook.messaging.model.threads.ThreadParticipant r301, com.facebook.messaging.model.threads.ThreadSummary r302, X.C2gh r303) {
        /*
            r0 = r301
            long r0 = r0.A03
            r304 = r0
            r0 = r302
            long r0 = r0.A0N
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 < 0) goto L40
            r0 = r301
            com.facebook.messaging.model.messages.ParticipantInfo r0 = r0.A05
            com.facebook.user.model.UserKey r0 = r0.A0F
            r309 = r0
            r0 = r309
            X.11T.A09(r0)
            r0 = r303
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            r310 = r0
            r0 = r309
            r1 = r310
            boolean r0 = r0.equals(r1)
            r311 = r0
            r0 = 1
            r308 = r0
            r0 = r311
            if (r0 == 0) goto L46
        L40:
            r0 = 0
            r308 = r0
            r0 = 0
            r310 = r0
        L46:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2gh.A00(com.facebook.messaging.model.threads.ThreadParticipant, com.facebook.messaging.model.threads.ThreadSummary, X.2gh):boolean");
    }

    public 5Xv A01(ThreadSummary threadSummary) {
        AnonymousClass242 anonymousClass242;
        C1yg c1yg;
        5Xu r0 = (5Xu) this.A05.get();
        C00j.A05("MessengerThreadNameViewDataFactory.getThreadNameViewData", -477193704);
        try {
            ThreadKey threadKey = threadSummary.A0n;
            if (ThreadKey.A0d(threadKey)) {
                anonymousClass242 = r0.A00;
                c1yg = C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING;
            } else {
                boolean A0q = ThreadKey.A0q(threadKey);
                anonymousClass242 = r0.A00;
                c1yg = A0q ? C1yg.TINCAN : C1yg.ONE_TO_ONE;
            }
            5Xv A00 = 5Xu.A00(AnonymousClass242.A03(anonymousClass242, c1yg, threadSummary), threadSummary, r0);
            C00j.A01(-1580819318);
            return A00;
        } catch (Throwable th) {
            C00j.A01(-1371644784);
            throw th;
        }
    }

    public ImmutableList A02(ThreadSummary threadSummary) {
        ImmutableList immutableList;
        if (!((2yD) this.A06.get()).AZk(2342166660032514932L) || (immutableList = threadSummary.A1P) == null) {
            return null;
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList immutableList2 = threadSummary.A1N;
        ImmutableList immutableList3 = threadSummary.A1O;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= immutableList.size()) {
                return builder.build();
            }
            String str = (immutableList2 == null || i2 >= immutableList2.size()) ? null : (String) immutableList2.get(i2);
            String str2 = (immutableList3 == null || i2 >= immutableList3.size()) ? null : (String) immutableList3.get(i2);
            0AC r0 = (0AC) this.A04.get();
            String str3 = (String) immutableList.get(i2);
            Long l = null;
            if (str2 != null) {
                long parseLong = Long.parseLong(str2);
                if (parseLong >= 0) {
                    l = Long.valueOf(parseLong);
                }
            }
            String A03 = r0.A03(l, str3, str);
            A03.getClass();
            builder.m11011add((Object) A03);
            i = i2 + 1;
        }
    }

    public boolean A03(ThreadSummary threadSummary) {
        if (!threadSummary.A0n.A1O()) {
            ParticipantInfo participantInfo = threadSummary.A0i;
            if (participantInfo == null || !Objects.equal(participantInfo.A0F, this.A01.get())) {
                return false;
            }
            C2o8 c2o8 = (C2o8) this.A02.get();
            String str = threadSummary.A1q;
            if ((str != null && str.length() != 0) || threadSummary.A1L.size() > c2o8.A00 || 2Gt.A0E(threadSummary)) {
                return false;
            }
        }
        return true;
    }
}
