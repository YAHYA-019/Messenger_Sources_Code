package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: J2r.class */
public final class J2r implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerContextualRepliesController$loadSuggestions$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ I3z A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public J2r(FbUserSession fbUserSession, I3z i3z, String str, String str2, String str3) {
        this.A01 = i3z;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = fbUserSession;
        this.A02 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean containsKey;
        I3z i3z = this.A01;
        Hev hev = (Hev) 1Br.A0B(i3z.A05);
        String str = this.A04;
        String str2 = this.A03;
        if (str2 == null) {
            throw 1BK.A0h();
        }
        String str3 = this.A02;
        FbUserSession fbUserSession = this.A00;
        HgB hgB = new HgB(fbUserSession, i3z, str, str3);
        11T.A0F(str, 0);
        Integer num = 1Lo.A05;
        1MV r0 = new 1MV(fbUserSession, 115421);
        if (1Br.A07(hev.A02).AZk(36311706518359291L)) {
            return;
        }
        HcK hcK = (HcK) r0.get();
        synchronized (hcK) {
            try {
                java.util.Map map = (java.util.Map) hcK.A00.get(str);
                z = true;
                if (map == null || !map.isEmpty()) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        HcK hcK2 = (HcK) r0.get();
        synchronized (hcK2) {
            java.util.Map map2 = (java.util.Map) hcK2.A00.get(str);
            containsKey = map2 == null ? false : map2.containsKey(str2);
        }
        if (containsKey) {
            return;
        }
        hcK = (HcK) r0.get();
        synchronized (hcK) {
            java.util.Map map3 = hcK.A00;
            if (!map3.containsKey(str)) {
                map3.put(str, AnonymousClass001.A0u());
            }
        }
        1Vd A09 = 7zT.A09(hev.A01);
        2yD A0c = DKE.A0c();
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("bucket_id", str);
        A0M.A05("conversation_guide_caller_id", "messenger_android_stories");
        A0M.A03("fetch_suggested_replies_cache_hash", 2yD.A01(A0c, 72339859289934203L));
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "FbStoriesConversationGuideQuery", (String) null, "fbandroid", 4979418, 0, 2657314683L, 2657314683L, false, true));
        4YU.A1J(A0L, 719684625506878L);
        1Br.A0D(hev.A00, new InK(hgB, r0.get(), str, 1), A09.A09(A0L));
    }
}
