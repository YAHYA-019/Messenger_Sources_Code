package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.AbstractCollection;

/* loaded from: D3o.class */
public final class D3o implements 2eF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public D3o(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj3;
        this.A03 = obj5;
        this.A02 = obj;
        this.A05 = obj2;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Bsu bsu;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                if (!abstractCollection.isEmpty()) {
                    Context context = (Context) this.A02;
                    C4Dl c4Dl = (C4Dl) this.A03;
                    Intent intent = (Intent) this.A04;
                    Bundle A05 = 1BK.A05();
                    A05.putBoolean(AbstractC00603o4.A00(97), true);
                    A05.putParcelableArrayList(1BJ.A00(259), 1BK.A17(abstractCollection));
                    return c4Dl.A09(context, intent, A05, 0);
                }
                bsu = (Bsu) this.A01;
                break;
            case 1:
                bsu = (Bsu) this.A01;
                1BK.A09(bsu.A02).softReport("OmnipickerIntentHandler", "Error loading users for omnipicker intent", (Throwable) obj);
                break;
            default:
                C5nf c5nf = (C5nf) obj;
                if (c5nf == null || (obj2 = c5nf.A00) == null || (obj3 = c5nf.A01) == null || AnonymousClass001.A1V(obj3)) {
                    return ((C7S) ((4VJ) this.A01).A0H.get()).A01();
                }
                ImmutableList of = ImmutableList.of(obj2);
                ImmutableList of2 = ImmutableList.of((Object) "REQUEST", (Object) "SEND");
                4VJ r0 = (4VJ) this.A01;
                FFd fFd = (FFd) r0.A0C.get();
                FbUserSession fbUserSession = (FbUserSession) this.A04;
                TriState triState = TriState.UNSET;
                Intent A02 = fFd.A02(fbUserSession, triState, triState, of, of2, (String) null, (String) null, (String) null, "p2p_personal_deeplink", "USD", (String) null, false);
                if (!of.isEmpty() && !1JF.A0B((CharSequence) of.get(0)) && A02 != null) {
                    return ((C4Dl) this.A03).A05((Context) this.A02, (Intent) this.A05, A02);
                }
                1BK.A09(r0.A06).D0v("personal-payment-deeplink-request-failed", A02.toString());
                return C3o5.A0K(false);
        }
        return ((C4Dl) this.A03).A0B((Context) this.A02, (Intent) this.A04, AbH.A0l((4iI) bsu.A03.get(), (UserKey) ((ImmutableList) this.A05).get(0)));
    }
}
