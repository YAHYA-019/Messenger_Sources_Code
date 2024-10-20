package X;

import com.facebook.messaging.communitymessaging.model.Community;

/* renamed from: X.4Mb, reason: invalid class name */
/* loaded from: 4Mb.class */
public final class C4Mb implements 4MR {
    public static final C4Mb A00 = new Object();
    public static final AnonymousClass207 A01 = C4Mc.A06;

    public AnonymousClass207 Asi() {
        return A01;
    }

    public /* bridge */ /* synthetic */ 4MT Axa(2Sh r302, int i) {
        Integer A002;
        11T.A0F(r302, 1);
        Community community = (Community) r302.A01((String) null, Community.class);
        C4Mc c4Mc = null;
        if (community != null && (A002 = 4SF.A00(Integer.valueOf(community.A05))) != null && A002 != 0S2.A00) {
            AnonymousClass207 anonymousClass207 = C4Mc.A06;
            String str = community.A0U;
            11T.A0A(str);
            long parseLong = Long.parseLong(str);
            String str2 = community.A0T;
            11T.A0A(str2);
            c4Mc = new C4Mc(A002, community.A04(), Long.valueOf(community.A0D), str2, community.A0S, parseLong);
        }
        return c4Mc;
    }
}
