package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4Nl, reason: invalid class name */
/* loaded from: 4Nl.class */
public final class C4Nl {
    public C4Px A00;
    public boolean A01;
    public final 1Br A02;
    public final Set A03;
    public final Set A04;
    public final ExecutorService A05;
    public final FbUserSession A06;
    public final 1De A07;

    public C4Nl(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A06 = fbUserSession;
        this.A02 = 1Bu.A03(r303.A00, 82123);
        this.A05 = (ExecutorService) 1Bi.A03(16477);
        this.A03 = new 0WH(0);
        this.A04 = new 0WH(0);
    }

    public final void A00() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        C4Nm c4Nm = (C4Nm) this.A02.A00.get();
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        graphQlQueryParamSet.A04("first", 30);
        graphQlQueryParamSet.A04("picture_size", 300);
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "MsgrFriendRequestsQuery", (String) null, "fbandroid", 675619681, 0, 2338915128L, 2338915128L, false, true);
        r0.A00 = graphQlQueryParamSet;
        C3sa A00 = C3sa.A00(r0);
        Context context = (Context) c4Nm.A00.A00.get();
        C00s.A00();
        1Kd.A0F(new 4WX(this, 1), 2FP.A02(new Function() { // from class: X.4Nn
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0233, code lost:
            
                if (r0 != null) goto L35;
             */
            @Override // com.google.common.base.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r302) {
                /*
                    Method dump skipped, instructions count: 569
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4Nn.apply(java.lang.Object):java.lang.Object");
            }
        }, 1VX.A0D(context).A09(A00), (Executor) c4Nm.A01.A00.get()), this.A05);
    }

    public final void A01(8Ka r302, 8Ka r303) {
        ImmutableList immutableList;
        Integer num;
        ArrayList A0s = AnonymousClass001.A0s();
        C4Px c4Px = this.A00;
        if (c4Px == null || (immutableList = c4Px.A00) == null) {
            return;
        }
        1Du it = immutableList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (!11T.A0O(next, r302) || r302.equals(r303)) {
                11T.A0D(next);
                A0s.add(next);
            } else {
                A0s.add(r303);
                z = true;
            }
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
        11T.A0A(copyOf);
        C4Px c4Px2 = this.A00;
        Integer num2 = null;
        if (c4Px2 != null) {
            num = c4Px2.A01;
            num2 = c4Px2.A02;
        } else {
            num = null;
        }
        this.A00 = new C4Px(copyOf, num, num2);
        if (z) {
            Iterator it2 = this.A03.iterator();
            while (it2.hasNext()) {
                8HA.A06(((C9J0) it2.next()).A00);
            }
        }
    }
}
