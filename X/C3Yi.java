package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3Yi, reason: invalid class name */
/* loaded from: 3Yi.class */
public final class C3Yi implements 67O {
    public static final String __redex_internal_original_name = "FriendsInboxUnitComponentSpec$onCreateLayout$itemListener$1$onMontageClicked$listener$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 1Iw A02;
    public final /* synthetic */ C2i8 A03;
    public final /* synthetic */ 2UR A04;
    public final /* synthetic */ 2kL A05;
    public final /* synthetic */ 2BQ A06;

    public C3Yi(FbUserSession fbUserSession, 1Iw r303, C2i8 c2i8, 2UR r305, 2kL r306, 2BQ r307, long j) {
        this.A06 = r307;
        this.A02 = r303;
        this.A01 = fbUserSession;
        this.A00 = j;
        this.A04 = r305;
        this.A05 = r306;
        this.A03 = c2i8;
    }

    public void Bml(Object obj) {
    }

    public void BqY(Object obj) {
        this.A06.A01("free_messenger_my_day_interstitial");
        Context context = this.A02.A0D;
        11T.A0A(context);
        FbUserSession fbUserSession = this.A01;
        long j = this.A00;
        C2i9.A01(context, fbUserSession, this.A03, this.A04, this.A05, j);
    }
}
