package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3Yj, reason: invalid class name */
/* loaded from: 3Yj.class */
public final class C3Yj implements 67O {
    public static final String __redex_internal_original_name = "FriendsInboxUnitComponentSpec$onCreateLayout$itemListener$1$onInboxItemSharedViewerClick$listener$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ C2i8 A02;
    public final /* synthetic */ 2UR A03;
    public final /* synthetic */ 2kL A04;
    public final /* synthetic */ 2BQ A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;

    public C3Yj(FbUserSession fbUserSession, 1Iw r303, C2i8 c2i8, 2UR r305, 2kL r306, 2BQ r307, Integer num, String str) {
        this.A05 = r307;
        this.A01 = r303;
        this.A00 = fbUserSession;
        this.A07 = str;
        this.A06 = num;
        this.A03 = r305;
        this.A04 = r306;
        this.A02 = c2i8;
    }

    public void Bml(Object obj) {
    }

    public void BqY(Object obj) {
        this.A05.A01("free_messenger_my_day_interstitial");
        Context context = this.A01.A0D;
        11T.A0A(context);
        FbUserSession fbUserSession = this.A00;
        String str = this.A07;
        Integer num = this.A06;
        C2i9.A0L(context, fbUserSession, this.A02, this.A03, this.A04, num, str);
    }
}
