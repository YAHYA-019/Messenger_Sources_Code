package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.msys.thread.aibot.nullstate.cardstack.layoutmanager.AiBotGroupedCardStackLayoutManager;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.mapbox.mapboxsdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8uR, reason: invalid class name */
/* loaded from: 8uR.class */
public final class C8uR extends 8E2 {
    public final View A00;
    public final FbUserSession A01;
    public final C1u2 A02;
    public final AiBotGroupedCardStackLayoutManager A03;
    public final Aaf A04;
    public final MigColorScheme A05;
    public final C00m A06;
    public final int A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8uR(View view, FbUserSession fbUserSession, AiBotGroupedCardStackLayoutManager aiBotGroupedCardStackLayoutManager, Aaf aaf, MigColorScheme migColorScheme, C00m c00m) {
        super(view, fbUserSession, aiBotGroupedCardStackLayoutManager, aaf, migColorScheme);
        7zT.A1U(migColorScheme, aaf, view);
        this.A01 = fbUserSession;
        this.A05 = migColorScheme;
        this.A04 = aaf;
        this.A00 = view;
        this.A03 = aiBotGroupedCardStackLayoutManager;
        this.A06 = c00m;
        this.A02 = 4YV.A0I();
        ((8E2) this).A00 = (ImageView) view.findViewById(2131362914);
        ((8E2) this).A02 = (TextView) view.findViewById(2131362915);
        ((8E2) this).A03 = (TextView) view.findViewById(2131362880);
        ((8E2) this).A08 = (RecyclerView) view.findViewById(2131367739);
        ((8E2) this).A09 = 7zL.A0b(view, 2131362890);
        ((8E2) this).A0A = 7zL.A0b(view, 2131362898);
        ((8E2) this).A0B = 7zL.A0b(view, 2131362906);
        ((8E2) this).A0C = 7zL.A0b(view, 2131362913);
        int AZL = ((8E2) this).A0G.A00() ? migColorScheme.AZL() : migColorScheme.BKf();
        this.A07 = AZL;
        View view2 = this.A0I;
        11T.A0I(view2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        ((CardView) view2).A02(AZL);
    }

    public static final 2rR A00(1Iw r301, C8uR c8uR, List list, boolean z) {
        Resources A0E;
        int i;
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0z.add(it.next().toString());
        }
        2rQ r0 = new 2rQ(A0z, (List) null);
        if (list.size() > 4 || z) {
            A0E = 4YU.A0E(r301);
            i = 2132279306;
        } else {
            A0E = 4YU.A0E(r301);
            i = 2132279314;
        }
        float A01 = 7zL.A01(A0E, i);
        2rS A00 = 2rR.A00(r301);
        A00.A2c(r0);
        A00.A2b(c8uR.A05);
        A00.A2Z(A01);
        A00.A2Y(7zL.A01(A0E, R.dimen.mapbox_four_dp));
        A00.A2a(4);
        A00.A2d(true);
        2rR r02 = A00.A01;
        r02.A09 = true;
        r02.A01 = c8uR.A07;
        return A00.A2W();
    }
}
