package X;

import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* renamed from: X.60b, reason: invalid class name */
/* loaded from: 60b.class */
public final class C60b {
    public static final boolean A00(Message message, boolean z) {
        String str;
        boolean z2 = true;
        if (z) {
            GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
            if (genericAdminMessageInfo == null || !"CHANGE_THREAD_NICKNAME".equals(genericAdminMessageInfo.A0I) || (str = genericAdminMessageInfo.A0L) == null) {
                return false;
            }
            String str2 = null;
            ParticipantInfo participantInfo = message.A0K;
            if (participantInfo != null) {
                str2 = participantInfo.A00();
            }
            UserKey userKey = (UserKey) 1Bn.A0A(83436);
            if (!11T.A0O(userKey.id, str) && !11T.A0O(userKey.id, str2)) {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r305 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C1zL A01(com.facebook.messaging.model.threads.ThreadSummary r302, com.facebook.user.model.UserKey r303) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L26
            r0 = r301
            r1 = r302
            boolean r0 = r0.A03(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L26
            r0 = r302
            r1 = r303
            com.facebook.messaging.model.threads.ThreadParticipant r0 = X.2Gt.A02(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L26
            r0 = r305
            X.1zL r0 = r0.A00()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2b
        L26:
            X.1zL r0 = X.C1zL.A04
            r305 = r0
        L2b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60b.A01(com.facebook.messaging.model.threads.ThreadSummary, com.facebook.user.model.UserKey):X.1zL");
    }

    public final boolean A02(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        if (threadSummary.AoK().A04 != null || (A03(threadSummary) && !A06(threadSummary))) {
            return A08(threadSummary);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r0.A06 != X.C1yg.CARRIER_MESSAGING_GROUP) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L6a
            r0 = r302
            com.facebook.messaging.model.threads.GroupThreadData r0 = r0.AoK()
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0D
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L68
            r0 = r301
            r1 = r302
            boolean r0 = r0.A06(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L68
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r306 = r0
            r0 = r306
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0a(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L68
            r0 = r306
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0T(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L68
            r0 = r302
            boolean r0 = X.2oI.A06(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L68
            r0 = r306
            boolean r0 = r0.A0w()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L68
            r0 = r306
            X.1yg r0 = r0.A06
            r306 = r0
            X.1yg r0 = X.C1yg.CARRIER_MESSAGING_GROUP
            r304 = r0
            r0 = r306
            r1 = r304
            if (r0 != r1) goto L6a
        L68:
            r0 = 1
            r303 = r0
        L6a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60b.A03(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }

    public final boolean A04(ThreadSummary threadSummary) {
        boolean z = false;
        if (threadSummary != null && A03(threadSummary)) {
            ImmutableList immutableList = threadSummary.A1L;
            11T.A0A(immutableList);
            if (!C7l2.A00(immutableList).isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (((r302 == null || (r0 = r302.AoK()) == null) ? null : r0.A05) != X.21E.A02) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = r0.A06(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2b
            r0 = r302
            if (r0 == 0) goto L31
            r0 = r302
            com.facebook.messaging.model.threads.GroupThreadData r0 = r0.AoK()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L31
            r0 = r304
            X.21E r0 = r0.A05
            r305 = r0
        L1d:
            X.21E r0 = X.21E.A02
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L2f
        L2b:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L2f:
            r0 = r303
            return r0
        L31:
            r0 = 0
            r305 = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60b.A05(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A06(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L51
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r303 = r0
            r0 = r303
            boolean r0 = r0.A1F()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2d
            r0 = r303
            boolean r0 = r0.A1I()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2d
            r0 = r303
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0a(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2d
            r0 = r303
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0T(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L51
        L2d:
            r0 = r302
            com.facebook.messaging.model.threads.GroupThreadData r0 = r0.AoK()
            r305 = r0
            r0 = r305
            X.6jR r0 = r0.A00()
            r306 = r0
            r0 = r305
            boolean r0 = r0.A0E
            r307 = r0
            r0 = 0
            r305 = r0
            r0 = r306
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = 1
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L56
        L51:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L56:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60b.A06(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }

    public final boolean A07(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        boolean z = false;
        if (!A03(threadSummary)) {
            return false;
        }
        ImmutableList immutableList = threadSummary.A1L;
        11T.A0A(immutableList);
        if (C7l2.A00(immutableList).size() == 1 && A08(threadSummary)) {
            z = true;
        }
        return z;
    }

    public final boolean A08(ThreadSummary threadSummary) {
        boolean z = false;
        if (A01(threadSummary, (UserKey) 1Bn.A0A(83436)) == C1zL.A04) {
            z = true;
        }
        return !z;
    }
}
