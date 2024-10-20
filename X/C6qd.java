package X;

import com.facebook.messaging.followup.plugins.metadataloader.followup.InboxFollowupsMetadataLoader;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.List;

/* renamed from: X.6qd, reason: invalid class name */
/* loaded from: 6qd.class */
public final class C6qd {
    public 3JI A00;
    public final 1Br A02 = 1Bq.A00(66803);
    public final 1Br A01 = 1Bq.A00(33013);
    public final 1Br A03 = 1Bq.A00(66351);

    private final 1G2 A00(String str, boolean z) {
        1G2 A0D = ((1M0) 1Lm.A06(((1Fv) this.A03.A00.get()).A04(), 100241)).A00("inbox_follow_up_tag/").A0D(z ? "sender/" : "receiver/").A0D(str);
        11T.A0A(A0D);
        return A0D;
    }

    private final 03Y A01(String str, boolean z) {
        String BD0 = ((FbSharedPreferences) this.A01.A00.get()).BD0(A00(str, z));
        if (BD0 == null) {
            BD0 = "";
        }
        List A0M = 0CU.A0M(BD0, new String[]{"_"}, 0);
        if (A0M.size() == 2) {
            return new 03Y(A0M.get(0), Integer.valueOf(Integer.parseInt((String) A0M.get(1))));
        }
        return null;
    }

    private final void A02(ThreadKey threadKey, boolean z) {
        String A0u = threadKey.A0u();
        11T.A0A(A0u);
        03Y A01 = A01(A0u, z);
        if (A01 != null) {
            1Ql edit = ((FbSharedPreferences) this.A01.A00.get()).edit();
            String A0u2 = threadKey.A0u();
            11T.A0A(A0u2);
            edit.CaL(A00(A0u2, z), 0Pz.A0W((String) A01.first, "_100"));
            edit.commit();
        }
    }

    public final void A03(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        A02(threadKey, true);
        A02(threadKey, false);
        3JI r0 = this.A00;
        if (r0 != null) {
            InboxFollowupsMetadataLoader inboxFollowupsMetadataLoader = r0.A00;
            AnonymousClass207 anonymousClass207 = InboxFollowupsMetadataLoader.A07;
            java.util.Map map = inboxFollowupsMetadataLoader.A04;
            C2ik c2ik = C2ik.A03;
            ThreadSummary threadSummary = (ThreadSummary) map.get(c2ik);
            if (11T.A0O(threadSummary != null ? threadSummary.A0n : null, threadKey)) {
                map.put(c2ik, null);
            }
            C2ik c2ik2 = C2ik.A02;
            ThreadSummary threadSummary2 = (ThreadSummary) map.get(c2ik2);
            if (11T.A0O(threadSummary2 != null ? threadSummary2.A0n : null, threadKey)) {
                map.put(c2ik2, null);
            }
            inboxFollowupsMetadataLoader.A02.A00(1BJ.A00(766), 11T.A03(threadKey));
        }
    }

    public final boolean A04(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        if (!threadKey.A0x() && !threadKey.A1K() && !threadKey.A1F()) {
            return false;
        }
        int A01 = ((C2gd) this.A02.A00.get()).A01();
        String A0u = threadKey.A0u();
        11T.A0A(A0u);
        boolean z = true;
        03Y A012 = A01(A0u, true);
        int i = 100;
        if ((A012 != null ? ((Number) A012.second).intValue() : 100) > A01) {
            String A0u2 = threadKey.A0u();
            11T.A0A(A0u2);
            03Y A013 = A01(A0u2, false);
            if (A013 != null) {
                i = ((Number) A013.second).intValue();
            }
            if (i > A01) {
                z = false;
            }
        }
        return z;
    }
}
