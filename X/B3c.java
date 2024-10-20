package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.user.tiles.UserTileView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: B3c.class */
public final class B3c extends AbstractC1377Afj {
    public MessengerAccountInfo A00;
    public final Context A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final 0CS A05;
    public final C1370Afc A06;
    public final UserTileView A07;
    public final List A08;
    public final 1GU A09;

    public B3c(Context context, View view, 1GU r304, C1370Afc c1370Afc, List list, List list2) {
        super(view);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A08 = A0s;
        this.A01 = context;
        this.A06 = c1370Afc;
        this.A05 = new ArrayList(list);
        this.A09 = r304;
        A0s.addAll(list2);
        this.A04 = AbF.A06(view, 2131365919);
        this.A03 = AbF.A06(view, 2131366085);
        this.A07 = (UserTileView) view.findViewById(2131365484);
        this.A02 = view.findViewById(2131366621);
    }
}
