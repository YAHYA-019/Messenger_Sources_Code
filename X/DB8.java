package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.contacts.picker.SingleTapActionConfig;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: DB8.class */
public final class DB8 implements Callable {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ SingleTapActionConfig A02;
    public final /* synthetic */ Cbm A03;
    public final /* synthetic */ ImmutableList A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public DB8(View.OnClickListener onClickListener, FbUserSession fbUserSession, SingleTapActionConfig singleTapActionConfig, Cbm cbm, ImmutableList immutableList, List list, boolean z) {
        this.A03 = cbm;
        this.A05 = list;
        this.A00 = onClickListener;
        this.A01 = fbUserSession;
        this.A06 = z;
        this.A02 = singleTapActionConfig;
        this.A04 = immutableList;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        Set A0v;
        ImmutableList.Builder builder = ImmutableList.builder();
        List list = this.A05;
        if (09K.A00(list)) {
            Cbm cbm = this.A03;
            CallerContext callerContext = Cbm.A0A;
            C00i c00i = cbm.A08;
            CN7 cn7 = (CN7) c00i.get();
            View.OnClickListener onClickListener = this.A00;
            Resources A0B = 1BL.A0B(cn7.A03);
            builder.m11011add((Object) new Cey(onClickListener, A0B.getString(2131960554), A0B.getString(2131960551)));
            FbUserSession fbUserSession = this.A01;
            if (09K.A01(list)) {
                A0v = AnonymousClass001.A0v();
            } else {
                HashSet hashSet = new HashSet(list.size());
                HashSet A0v2 = AnonymousClass001.A0v();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserKey A0L = ThreadKey.A0L(AbG.A0k(it));
                    A0L.getClass();
                    User A00 = ((C8b) 1Lo.A04((Context) null, fbUserSession, cbm.A02, 84457)).A00(A0L);
                    if (A00 == null) {
                        A0v2.add(A0L.id);
                    } else {
                        hashSet.add(A00);
                    }
                }
                Pair pair = new Pair(hashSet, A0v2);
                Object obj = pair.first;
                A0v = obj == null ? AnonymousClass001.A0v() : (Set) obj;
                Set set = (Set) pair.second;
                if (09K.A00(set)) {
                    HashSet A1E = AbF.A1E(((CbR) cbm.A04.get()).A00(1BK.A17(set)));
                    Preconditions.checkArgument(AnonymousClass001.A1Q(A1E.size(), set.size()), "the graph ql fetch for fbids didn't return the same # of results as passed in");
                    if (09K.A00(A1E)) {
                        A0v.addAll(A1E);
                    }
                }
            }
            Iterator it2 = A0v.iterator();
            ArrayList A0s = AnonymousClass001.A0s();
            C1Jp.A02(A0s, it2);
            Collections.sort(A0s, new DAg());
            Iterator it3 = A0s.iterator();
            while (it3.hasNext()) {
                builder.m11011add((Object) ((CN7) c00i.get()).A02(53N.A05, BP6.A0X, (User) it3.next(), this.A06));
            }
        }
        ImmutableList immutableList = this.A04;
        if (09K.A00(immutableList)) {
            ArrayList A02 = 1JW.A02(immutableList);
            Cbm cbm2 = this.A03;
            CallerContext callerContext2 = Cbm.A0A;
            CN7 cn72 = (CN7) cbm2.A08.get();
            boolean z = this.A06;
            53N r0 = 53N.A05;
            Collections.sort(A02, new DAg());
            ImmutableList.Builder builder2 = ImmutableList.builder();
            1Du it4 = ((CGj) cn72.A01.get()).A00(A02).iterator();
            while (it4.hasNext()) {
                BlL blL = (BlL) it4.next();
                String A1A = AbK.A1A(blL.A01, "…");
                builder2.m11011add((Object) new Cey(A1A, A1A));
                1Du it5 = blL.A00.iterator();
                while (it5.hasNext()) {
                    builder2.m11011add((Object) cn72.A02(r0, BP6.A0X, AbG.A0t(it5), z));
                }
            }
            AbG.A1U(builder2, builder);
        }
        return builder.build();
    }
}
