package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.messaging.groups.plugins.core.threadsettings.memberssurface.GroupMembersSurface;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.facebook.xapp.messaging.profile.logging.ContextualProfileLoggingData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* loaded from: Cuh.class */
public final class Cuh implements 6HK {
    public final /* synthetic */ AmL A00;
    public final /* synthetic */ ThreadSummary A01;

    public Cuh(AmL amL, ThreadSummary threadSummary) {
        this.A00 = amL;
        this.A01 = threadSummary;
    }

    public void Bln(User user) {
        11T.A0F(user, 0);
        AmL amL = this.A00;
        ImmutableList immutableList = AmL.A0X;
        Bph bph = amL.A06;
        if (bph != null) {
            GroupMembersSurface groupMembersSurface = bph.A02;
            if (!5PC.A00((5PC) 1Br.A0B(groupMembersSurface.A01)).AZk(36318466793288335L)) {
                groupMembersSurface.A06.CWB(user.A0k, 3);
            } else {
                LiveData A08 = AbH.A08((C5xl) 1Br.A0B(groupMembersSurface.A02), groupMembersSurface.A03);
                A08.observe(bph.A00.getViewLifecycleOwner(), new Ca2(3, A08, bph.A01, user, groupMembersSurface));
            }
        }
    }

    public void C3O() {
    }

    public void C9x(User user) {
        11T.A0F(user, 0);
        AmL amL = this.A00;
        ImmutableList immutableList = AmL.A0X;
        C9Y c9y = amL.A05;
        if (c9y == null) {
            11T.A0L("groupMembersViewData");
            throw 0Q8.createAndThrow();
        }
        ThreadKey A01 = c9y.A01();
        11T.A0A(A01);
        ImmutableMap of = ImmutableMap.of((Object) "group_member_tab_type", (Object) ((BMH) AmL.A0X.get(amL.A00)).contactRowsType.name());
        C1pq.A08("metadata", of);
        ContextualProfileLoggingData contextualProfileLoggingData = new ContextualProfileLoggingData(A01, of, "thread_setting_member_list", "user_list_item", false);
        7XU r0 = (7XU) 1Br.A0B(amL.A0P);
        Context context = amL.getContext();
        7XU.A00(context, amL.getParentFragmentManager(), 4YV.A0D(context), (1pI) null, this.A01.A0g, A01, r0, user, (ParcelableSecondaryData) null, contextualProfileLoggingData, true);
    }
}
