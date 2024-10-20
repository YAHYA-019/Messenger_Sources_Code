package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.service.model.FetchThreadParams;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.user.model.User;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* renamed from: X.Apn, reason: case insensitive filesystem */
/* loaded from: Apn.class */
public final class C1681Apn extends C4r3 {
    public static final String __redex_internal_original_name = "FetchThreadGQLMethod";
    public 1BY A00;
    public final C15h A01;
    public final CQV A02;

    public C1681Apn(1BO r302) {
        super(AbI.A0G(), AbI.A0s());
        this.A02 = (CQV) 1Bn.A0B(84373);
        this.A01 = DBe.A00(this, ActionId.CONTROLLER_INITIATED);
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        FetchThreadParams fetchThreadParams = (FetchThreadParams) obj;
        ThreadCriteria threadCriteria = fetchThreadParams.A05;
        ImmutableSet immutableSet = threadCriteria.A00;
        1BY r0 = this.A00;
        CQW cqw = (CQW) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 84501);
        boolean isEmpty = immutableSet.isEmpty();
        Boolean A0K = AnonymousClass001.A0K();
        if (!isEmpty) {
            return cqw.A08(A0K, Boolean.valueOf(fetchThreadParams.A09), immutableSet, fetchThreadParams.A01);
        }
        String str = threadCriteria.A01;
        str.getClass();
        ImmutableList of = ImmutableList.of((Object) str);
        int i = fetchThreadParams.A01;
        Boolean valueOf = Boolean.valueOf(fetchThreadParams.A09);
        C30G A0H = AbF.A0H(51);
        cqw.A0E(A0H, of, A0K, valueOf, i);
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        return A08((List) obj2);
    }

    public FetchThreadResult A08(List list) {
        list.getClass();
        Preconditions.checkState(4YV.A1U(list.size()), "Expected 1 result. size = %s", list.size());
        2JX r0 = (2JX) list.get(0);
        C15h c15h = this.A01;
        User A0x = AbF.A0x(c15h);
        FbUserSession A05 = 1Fw.A05(this.A00);
        try {
            CQV cqv = this.A02;
            ThreadKey A08 = cqv.A08(r0, A0x);
            A08.getClass();
            return cqv.A0B(A05, r0, A08, (User) c15h.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
