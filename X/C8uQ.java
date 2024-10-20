package X;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.msys.thread.aibot.nullstate.cardstack.layoutmanager.AiBotGroupedCardStackLayoutManager;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8uQ, reason: invalid class name */
/* loaded from: 8uQ.class */
public final class C8uQ extends 8E2 {
    public LithoView A00;
    public final MigColorScheme A01;
    public final View A02;
    public final FbUserSession A03;
    public final Aaf A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8uQ(View view, FbUserSession fbUserSession, Aaf aaf, MigColorScheme migColorScheme) {
        super(view, fbUserSession, (AiBotGroupedCardStackLayoutManager) null, aaf, migColorScheme);
        7zT.A1U(migColorScheme, aaf, view);
        this.A03 = fbUserSession;
        this.A01 = migColorScheme;
        this.A04 = aaf;
        this.A02 = view;
        this.A00 = 7zL.A0b(view, 2131365302);
        int AZL = ((8E2) this).A0G.A00() ? migColorScheme.AZL() : migColorScheme.BKf();
        View view2 = this.A0I;
        11T.A0I(view2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        ((CardView) view2).A02(AZL);
    }
}
