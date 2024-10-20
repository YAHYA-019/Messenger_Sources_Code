package X;

import android.content.Context;
import com.facebook.messaging.business.search.model.PlatformSearchData;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Cro.class */
public final class Cro implements DIp {
    public final /* synthetic */ Cpc A00;

    public Cro(Cpc cpc) {
        this.A00 = cpc;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9J(Btt btt) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9L(PlatformSearchGameData platformSearchGameData) {
        return Cpc.A00(this.A00, ((PlatformSearchData) platformSearchGameData).A01);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9N(PlatformSearchUserData platformSearchUserData) {
        return Cpc.A00(this.A00, ((PlatformSearchData) platformSearchUserData).A01);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9W(ThreadSummary threadSummary) {
        Cpc cpc = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        String str = threadSummary.A20;
        if (!1JF.A0A(str)) {
            A0k.append(str);
            A0k.append(" ");
        }
        String str2 = (String) 1Bn.A0E((Context) null, cpc.A00, 83433);
        ImmutableList immutableList = threadSummary.A1L;
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                ThreadParticipant A0W = 4YU.A0W(it);
                if (!1JF.A0C(str2, C28p.A01(A0W).id)) {
                    String A02 = C28p.A02(A0W);
                    if (!1JF.A0A(A02)) {
                        A0k.append(A02);
                        A0k.append(" ");
                    }
                }
            }
        }
        return cpc.A02.A00(A0k.toString());
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9Y(C1772As6 c1772As6) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9g(MessageSearchMessageModel messageSearchMessageModel) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9i(MessageSearchThreadModel messageSearchThreadModel) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9o(User user) {
        Cpc cpc = this.A00;
        Name name = user.A0X;
        String str = name.firstName;
        if (str == null) {
            str = "";
        }
        String str2 = name.lastName;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = name.displayName;
        if (str3 == null) {
            str3 = "";
        }
        return cpc.A02.A00(0Pz.A0z(str, " ", str2, " ", str3));
    }
}
