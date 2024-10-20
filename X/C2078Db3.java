package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.litho.LithoView;
import com.facebook.xapp.messaging.emoji.service.FetchRecentEmojiResult;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Db3, reason: case insensitive filesystem */
/* loaded from: Db3.class */
public final class C2078Db3 extends 1RM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ LithoView A02;
    public final /* synthetic */ 9Z7 A03;
    public final /* synthetic */ Fci A04;
    public final /* synthetic */ boolean A05;

    public C2078Db3(FbUserSession fbUserSession, LithoView lithoView, 9Z7 r304, Fci fci, int i, boolean z) {
        this.A04 = fci;
        this.A02 = lithoView;
        this.A01 = fbUserSession;
        this.A03 = r304;
        this.A05 = z;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        Fci fci = this.A04;
        ImmutableList immutableList = ((FetchRecentEmojiResult) ((OperationResult) obj).A07()).A00;
        CallerContext callerContext = Fci.A0f;
        if (immutableList.size() > 18) {
            immutableList = immutableList.subList(0, 18);
        }
        fci.A0G = immutableList;
        LithoView lithoView = this.A02;
        lithoView.A0y(Fci.A00(this.A01, lithoView, this.A03, fci, this.A00, this.A05));
        fci.A03 = null;
    }

    public void A03(Throwable th) {
        0fH.A0K(Fci.class, "Failed to load recent emojis.", th);
        Fci fci = this.A04;
        fci.A0G = ImmutableList.of();
        LithoView lithoView = this.A02;
        lithoView.A0y(Fci.A00(this.A01, lithoView, this.A03, fci, this.A00, this.A05));
        fci.A03 = null;
    }
}
