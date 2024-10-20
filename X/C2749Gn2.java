package X;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Gn2, reason: case insensitive filesystem */
/* loaded from: Gn2.class */
public final class C2749Gn2 extends GXs {
    public static final String __redex_internal_original_name = "ListFolderItemViewHolder";
    public MigColorScheme A00;
    public Integer A01;
    public final C00i A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final CallerContext A06;
    public final FbDraweeView A07;
    public final C02353ux A08;

    public C2749Gn2(View view, C02353ux c02353ux, MigColorScheme migColorScheme, Integer num) {
        super(view);
        this.A06 = CallerContext.A0A(C2749Gn2.class, "folder_item", "folder_item");
        this.A02 = FbInjector.A00;
        this.A03 = view;
        this.A00 = migColorScheme;
        this.A01 = num;
        this.A08 = c02353ux;
        this.A07 = (FbDraweeView) C09s.A01(view, 2131364178);
        this.A04 = DKF.A0E(view, 2131364181);
        this.A05 = DKF.A0E(view, 2131364182);
        A01(this);
    }

    public static void A00(Uri uri, C2749Gn2 c2749Gn2, String str, int i) {
        2IA A01 = 2IA.A01(uri);
        A01.A06 = c2749Gn2.A08;
        c2749Gn2.A07.A0L(c2749Gn2.A06, A01.A04());
        View view = c2749Gn2.A03;
        view.setOnClickListener(new IJV(c2749Gn2));
        view.setContentDescription(1BL.A0B(c2749Gn2.A02).getQuantityString(2131820642, i, AnonymousClass001.A1b(str, i)));
        c2749Gn2.A04.setText(str);
        c2749Gn2.A05.setText(String.valueOf(i));
    }

    public static void A01(C2749Gn2 c2749Gn2) {
        c2749Gn2.A07.A04(1.0f);
        View view = c2749Gn2.A03;
        Integer num = c2749Gn2.A01;
        AbH.A1K(view, num != null ? num.intValue() : c2749Gn2.A00.BDl());
        AbH.A1M(c2749Gn2.A04, c2749Gn2.A00);
        AbG.A1J(c2749Gn2.A05, c2749Gn2.A00);
    }
}
