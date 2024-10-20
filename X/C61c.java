package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.61c, reason: invalid class name */
/* loaded from: 61c.class */
public final class C61c {
    public final 1Br A00 = 1Bq.A00(16385);

    public static final 1CO A00(C61c c61c) {
        return (1CO) c61c.A00.A00.get();
    }

    public final int A01() {
        return (int) A00(this).Av9(1GD.A07, 36602265348216609L);
    }

    public final int A02() {
        return (int) A00(this).Av9(1GD.A07, 36602265348151072L);
    }

    public final String A03() {
        String BDB = A00(this).BDB(1GD.A07, 36883740324988334L);
        11T.A0A(BDB);
        return BDB;
    }

    public final String A04() {
        String BDB = A00(this).BDB(1GD.A07, 36883740324791725L);
        11T.A0A(BDB);
        return BDB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.2yD.A03(A00(r301), 36320790370664134L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0C()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r301
            X.1CO r0 = A00(r0)
            r303 = r0
            r0 = 36320790370664134(0x81099100013ec6, double:3.0327523102672565E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.2yD.A03(r0, r1)
            r306 = r0
            r0 = 1
            r302 = r0
            r0 = r306
            if (r0 != 0) goto L22
        L20:
            r0 = 0
            r302 = r0
        L22:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61c.A05():boolean");
    }

    public final boolean A06() {
        return A00(this).AZk(36323096768760056L);
    }

    public final boolean A07() {
        return 2yD.A03(A00(this), 36320790370926281L);
    }

    public final boolean A08() {
        return A00(this).AZk(36323564919868153L);
    }

    public final boolean A09() {
        return A00(this).AZk(36323096768628983L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.2yD.A03(A00(r301), 36320790371778256L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0A() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0C()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r301
            X.1CO r0 = A00(r0)
            r303 = r0
            r0 = 36320790371778256(0x81099100123ed0, double:3.032752310971832E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.2yD.A03(r0, r1)
            r306 = r0
            r0 = 1
            r302 = r0
            r0 = r306
            if (r0 != 0) goto L22
        L20:
            r0 = 0
            r302 = r0
        L22:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61c.A0A():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.2yD.A03(A00(r301), 36320790370991818L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0B() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0C()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r301
            X.1CO r0 = A00(r0)
            r303 = r0
            r0 = 36320790370991818(0x81099100063eca, double:3.032752310474485E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.2yD.A03(r0, r1)
            r306 = r0
            r0 = 1
            r302 = r0
            r0 = r306
            if (r0 != 0) goto L22
        L20:
            r0 = 0
            r302 = r0
        L22:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61c.A0B():boolean");
    }

    public final boolean A0C() {
        return A00(this).AZr(1GD.A07, 36320790370598597L);
    }

    public final boolean A0D(ThreadKey threadKey) {
        if (A0C()) {
            return 2yD.A03(A00(this), 36320790371974867L) || (threadKey != null && threadKey.A1A());
        }
        return false;
    }

    public final boolean A0E(ThreadSummary threadSummary) {
        1CO A00;
        long j;
        ThreadKey threadKey;
        Capabilities capabilities;
        Capabilities capabilities2;
        ImmutableSet immutableSet;
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType;
        int ordinal;
        boolean z = false;
        if (threadSummary != null) {
            ThreadKey threadKey2 = threadSummary.A0n;
            boolean A1A = threadKey2.A1A();
            if (A1A ? A00(this).AZr(1GD.A07, 36321297177067702L) : A0C()) {
                1CO A002 = A00(this);
                1GD r0 = 1GD.A07;
                if (A002.AZr(r0, 36320790371647183L)) {
                    z = true;
                    Capabilities capabilities3 = threadSummary.A1C;
                    if (capabilities3 == null || !4YU.A1Y(capabilities3, ActionId.APPLY_OPTIMISTICS)) {
                        z = false;
                    }
                } else if (!threadKey2.A1K() ? !(!threadKey2.A1F() ? !A1A || !A00(this).AZk(36321297176805555L) || (capabilities2 = threadSummary.A1C) == null || !4YU.A1Y(capabilities2, ActionId.APPLY_OPTIMISTICS) || ((immutableSet = threadSummary.A1T) != null && immutableSet.contains(EnumC00893pQ.A04)) : (graphQLMessengerGroupThreadSubType = threadSummary.A0Y) != null && graphQLMessengerGroupThreadSubType != GraphQLMessengerGroupThreadSubType.A0E) : A00(this).AZr(r0, 36320790371057355L)) {
                    ImmutableList immutableList = threadSummary.A1L;
                    11T.A0A(immutableList);
                    if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
                        Iterator it = immutableList.iterator();
                        while (it.hasNext()) {
                            ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
                            11T.A0D(threadParticipant);
                            ParticipantInfo participantInfo = threadParticipant.A05;
                            1Kq r02 = participantInfo.A07;
                            if (r02 == null || ((ordinal = r02.ordinal()) != 0 && ordinal != 1 && ordinal != 8 && ordinal != 9 && (ordinal != 12 || !11T.A0O(participantInfo.A00(), 1Fw.A04((1EZ) 1Bn.A0A(16428)).A02)))) {
                                break;
                            }
                        }
                    }
                    z = true;
                }
            }
        }
        boolean z2 = false;
        if (z) {
            if (threadSummary != null && (threadKey = threadSummary.A0n) != null) {
                if (!threadKey.A1A() || ((capabilities = threadSummary.A1C) != null && 4YU.A1Y(capabilities, ActionId.APPLY_OPTIMISTICS))) {
                    if (threadKey.A1A()) {
                        A00 = A00(this);
                        j = 36321297177133239L;
                        z2 = A00.AZr(1GD.A07, j);
                    }
                }
            }
            A00 = A00(this);
            j = 36320790370729671L;
            z2 = A00.AZr(1GD.A07, j);
        }
        return z2;
    }

    public final boolean A0F(ThreadSummary threadSummary) {
        ThreadKey threadKey;
        return threadSummary != null && (threadKey = threadSummary.A0n) != null && threadKey.A1A() && A0E(threadSummary) && A00(this).AZk(36323096768039155L);
    }
}
