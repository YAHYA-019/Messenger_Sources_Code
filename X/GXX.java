package X;

import com.facebook.messaging.montage.viewer.seensheet.MontageSeenByListItemView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: GXX.class */
public final class GXX extends C2lb {
    public final /* synthetic */ GWe A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXX(MontageSeenByListItemView montageSeenByListItemView, GWe gWe, MigColorScheme migColorScheme) {
        super(montageSeenByListItemView);
        this.A00 = gWe;
        IKC.A00(montageSeenByListItemView, this, gWe, 25);
        montageSeenByListItemView.A09 = new HeJ(4YV.A0C(gWe.A08), this, gWe);
        montageSeenByListItemView.setBackgroundColor(migColorScheme.AjC());
        montageSeenByListItemView.A01.getClass();
        montageSeenByListItemView.A02.getClass();
        montageSeenByListItemView.A08.getClass();
        montageSeenByListItemView.A08.A01(migColorScheme.AjC());
        AbH.A1M(montageSeenByListItemView.A01, migColorScheme);
        AbH.A1M(montageSeenByListItemView.A02, migColorScheme);
    }
}
