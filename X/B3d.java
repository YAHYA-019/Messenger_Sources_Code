package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.tiles.UserTileView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: B3d.class */
public final class B3d extends AbstractC1377Afj {
    public MessengerAccountInfo A00;
    public 1G2 A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final 1GU A05;
    public final 0CS A06;
    public final C1370Afc A07;
    public final C2S A08;
    public final 1HN A09;
    public final FbSharedPreferences A0A;
    public final UserTileView A0B;
    public final List A0C;
    public final Context A0D;
    public final TextView A0E;

    public B3d(Context context, View view, 1GU r304, C1370Afc c1370Afc, C2S c2s, FbSharedPreferences fbSharedPreferences, List list, List list2) {
        super(view);
        this.A09 = new Czs(this, 0);
        this.A0D = context;
        this.A08 = c2s;
        this.A0A = fbSharedPreferences;
        this.A05 = r304;
        this.A07 = c1370Afc;
        this.A06 = new ArrayList(list);
        this.A0C = list2;
        this.A04 = AbF.A06(view, 2131365919);
        this.A03 = AbF.A06(view, 2131366085);
        this.A0B = (UserTileView) view.findViewById(2131365484);
        this.A0E = AbF.A06(view, 2131368253);
        View findViewById = view.findViewById(2131366621);
        this.A02 = findViewById;
        CZD.A01(findViewById, this, 16);
    }

    public static void A00(B3d b3d, int i) {
        TextView textView;
        if (i <= 0) {
            b3d.A0E.setVisibility(8);
            return;
        }
        if (i > 9) {
            int dimensionPixelSize = b3d.A0D.getResources().getDimensionPixelSize(2132279332);
            textView = b3d.A0E;
            textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            textView = b3d.A0E;
            textView.setPadding(0, 0, 0, 0);
        }
        textView.setText(6Pt.A00(b3d.A0D, i));
        textView.setVisibility(0);
    }
}
