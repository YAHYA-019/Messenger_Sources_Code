package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.user.model.User;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.text.BetterTextView;
import com.google.common.collect.ImmutableList;

/* loaded from: E62.class */
public final class E62 extends Ezy {
    public Context A00;
    public View A01;
    public ViewGroup A02;
    public BetterTextView A03;
    public 1BY A04;
    public final C00i A05 = 7zN.A0D(16979);

    public E62(1BO r302) {
        this.A04 = 7zL.A0Q(r302);
    }

    public static void A00(E62 e62, P2pPaymentData p2pPaymentData) {
        ImmutableList immutableList;
        ViewGroup viewGroup = e62.A02;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            int i = 0;
            while (true) {
                int i2 = i;
                immutableList = p2pPaymentData.A06;
                if (i2 >= immutableList.size()) {
                    break;
                }
                User user = (User) immutableList.get(i2);
                int i3 = 2qN.A0W;
                UserTileView userTileView = new UserTileView(e62.A00, null, C2qg.A0C, i3);
                userTileView.A03(2qZ.A04(user.A0k));
                int dimension = (int) e62.A00.getResources().getDimension(2132279399);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension);
                if (i2 != immutableList.size() - 1) {
                    int dimension2 = (int) e62.A00.getResources().getDimension(2132279298);
                    layoutParams.setMargins(0, 0, dimension2, 0);
                    layoutParams.setMarginEnd(dimension2);
                }
                userTileView.setLayoutParams(layoutParams);
                e62.A02.addView(userTileView);
                i = i2 + 1;
            }
            if (immutableList.size() != 1) {
                e62.A03.setVisibility(8);
                return;
            }
            e62.A03.setVisibility(0);
            e62.A03.setText(((User) immutableList.get(0)).A0X.A00());
            e62.A03.setTextColor(AbF.A0p(e62.A05).B4h());
        }
    }
}
