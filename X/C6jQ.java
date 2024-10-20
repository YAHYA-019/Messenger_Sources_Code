package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.6jQ, reason: invalid class name */
/* loaded from: 6jQ.class */
public final class C6jQ {
    public final int A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final 1De A0N;
    public final 1Br A0O = 1Bq.A00(16385);

    public C6jQ(1De r302) {
        this.A0N = r302;
        1Br A03 = 1Bu.A03(r302.A00, 16428);
        this.A02 = A03;
        this.A01 = 1Fw.A04((1EZ) A03.A00.get());
        this.A0D = A00().AZk(36322521243600512L);
        this.A0I = A00().AZk(36322521242748532L);
        this.A0B = A00().AZk(36322521243797123L);
        this.A05 = A00().AZk(36322521242879606L);
        this.A07 = A00().AZk(36322521242814069L);
        this.A0H = A00().AZk(36322521242945143L);
        this.A09 = A00().AZk(36322521243010680L);
        this.A0C = A00().AZk(36322521243076217L);
        this.A08 = A00().AZk(36322521243338365L);
        this.A06 = A00().AZk(36322521243666049L);
        this.A0F = A00().AZk(36322521243403902L);
        this.A00 = (int) A00().Auy(36603996220168628L);
        this.A04 = A00().AZk(2342165530456245873L);
        this.A0J = A00().AZk(36322521243141754L);
        this.A0A = A00().AZk(36322521243731586L);
        this.A0M = A00().AZk(36322521243862660L);
        this.A03 = A00().AZk(36322521243928197L);
        this.A0E = A00().AZk(36322521244059270L);
        this.A0G = A00().AZk(36322521244255879L);
        this.A0K = A00().AZk(36322521244649098L);
        this.A0L = A00().AZk(36322521244714635L);
    }

    private final 1CO A00() {
        return (1CO) this.A0O.A00.get();
    }

    public final boolean A01(ThreadKey threadKey, ThreadSummary threadSummary) {
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType;
        if (threadKey.A1F() && threadSummary != null && (((graphQLMessengerGroupThreadSubType = threadSummary.A0Y) == null || graphQLMessengerGroupThreadSubType == GraphQLMessengerGroupThreadSubType.A0E) && 5OA.A05(threadSummary, this.A01.A02) && A00().AZk(36322521242420847L))) {
            return true;
        }
        if (threadKey.A1K() && A00().AZk(36322521243207291L)) {
            return true;
        }
        return threadKey.A0z() && A00().AZk(36322521242682995L);
    }
}
