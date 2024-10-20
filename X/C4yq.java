package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.messages.Publicity;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* renamed from: X.4yq, reason: invalid class name */
/* loaded from: 4yq.class */
public final class C4yq {
    public 1BY A00;
    public final FbUserSession A01;
    public final AnonymousClass243 A02;
    public final C00i A07;
    public final C1q7 A09;
    public final C12104yr A0A;
    public final C00i A04 = new 1BQ(84423);
    public final C00i A08 = new 1BV((1BY) null, 67808);
    public final C0et A03 = (C0et) 1Bi.A03(83604);
    public final C00i A05 = new 1BV((1BY) null, 148150);
    public final C00i A06 = new 1BV((1BY) null, 66465);

    public C4yq(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        AnonymousClass243 anonymousClass243 = (AnonymousClass243) 1Bn.A0E((Context) null, (1BY) null, 68334);
        C1q7 c1q7 = (C1q7) 1Bi.A03(16822);
        C12104yr c12104yr = (C12104yr) 1Bn.A0E((Context) null, (1BY) null, 49419);
        1BQ r0 = new 1BQ(84729);
        this.A02 = anonymousClass243;
        this.A09 = c1q7;
        this.A0A = c12104yr;
        this.A07 = r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.C1q8.A0E) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C20a A00(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.1q8 r0 = r0.A04()
            r302 = r0
            X.1q8 r0 = X.C1q8.A0D
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            X.1q8 r0 = X.C1q8.A0E
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            X.1q8 r0 = X.C1q8.A0E
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L2a
            r0 = 1
            r304 = r0
        L2a:
            r0 = 49854(0xc2be, float:6.986E-41)
            r306 = r0
            r0 = r306
            java.lang.Object r0 = X.1Bi.A03(r0)
            r0 = r301
            X.9Zt r0 = X.C5rM.A00(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4e
            r0 = r302
            boolean r0 = r0.A05
            r306 = r0
            r0 = r306
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            r0 = r302
            boolean r0 = r0.A07
            r304 = r0
        L4e:
            r0 = r305
            if (r0 == 0) goto L5f
            r0 = r304
            if (r0 == 0) goto L5b
            X.20a r0 = X.C20a.A06
            return r0
        L5b:
            X.20a r0 = X.C20a.A07
            return r0
        L5f:
            X.20a r0 = X.C20a.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4yq.A00(com.facebook.messaging.model.messages.Message):X.20a");
    }

    public static ImmutableMap A01(ImmutableSet immutableSet, Object obj, Object obj2) {
        ImmutableMap.Builder A0c = 1BK.A0c();
        if (obj2 != null) {
            A0c.put(obj, obj2);
        }
        1Du it = immutableSet.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            if (!A0z.getKey().equals(obj)) {
                A0c.put(A0z);
            }
        }
        return A0c.build();
    }

    public static boolean A02(Message message, Message message2) {
        C1q8 A04;
        C1q8 c1q8;
        if (message2 != null && ((A04 = message2.A04()) != (c1q8 = C1q8.A0M) || message.A04() != C1q8.A0A)) {
            if (A04 == C1q8.A0N && message.A04() == c1q8) {
                return false;
            }
            if (A04 == C1q8.A0A && message.A04() == c1q8 && message.A04 <= message2.A04) {
                return false;
            }
        }
        return true;
    }

    public ThreadSummary A03(Message message, MessagesCollection messagesCollection, ThreadSummary threadSummary, C7tn c7tn, Integer num, long j) {
        String str;
        String str2;
        ThreadSummary threadSummary2 = threadSummary;
        String str3 = threadSummary.A24;
        if (str3 != null && (str2 = message.A1V) != null && str2.equals(str3)) {
            C1zm c1zm = new C1zm(threadSummary);
            c1zm.A24 = null;
            c1zm.A25 = null;
            threadSummary2 = new ThreadSummary(c1zm);
        }
        ImmutableList immutableList = C1q7.A07;
        if (Publicity.A02.equals(message.A06()) || messagesCollection.A04() == null || ((str = message.A1V) != null && str.equals(messagesCollection.A04().A1V))) {
            return A04(message, threadSummary2, c7tn, num, j);
        }
        C1zm c1zm2 = new C1zm(threadSummary2);
        c1zm2.A0L = j;
        return new ThreadSummary(c1zm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0c57, code lost:
    
        if (A00(r302) != X.C20a.A03) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0ccd, code lost:
    
        if (com.google.common.base.Objects.equal(r302.A1V, r303.A1x) == false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0cfd, code lost:
    
        if (r301.A03 == X.C0et.A0U) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0d09, code lost:
    
        if (X.2Gt.A0F(r303) != false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x054c, code lost:
    
        if (r317 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05ad, code lost:
    
        if (X.1JF.A0B(r317) == false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0c31  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.model.threads.ThreadSummary A04(com.facebook.messaging.model.messages.Message r302, com.facebook.messaging.model.threads.ThreadSummary r303, X.C7tn r304, java.lang.Integer r305, long r306) {
        /*
            Method dump skipped, instructions count: 3562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4yq.A04(com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.threads.ThreadSummary, X.7tn, java.lang.Integer, long):com.facebook.messaging.model.threads.ThreadSummary");
    }
}
