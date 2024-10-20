package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.widget.listview.EmptyListViewItem;

/* loaded from: B2f.class */
public abstract class B2f extends AlJ {
    public static final String __redex_internal_original_name = "AccountLoginBaseLayoutFragment";

    public static void A0E(View view) {
        ((EmptyListViewItem) view.requireViewById(2131367400)).A0F(true);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A08;
        int i;
        int A02 = 0FI.A02(845024215);
        if ((this instanceof B2d) || (this instanceof B2c) || !(this instanceof B2b)) {
            A08 = AbG.A08(layoutInflater, viewGroup, 2132542918);
            i = 1240363114;
        } else {
            A08 = null;
            i = -2001169505;
        }
        0FI.A08(i, A02);
        return A08;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this instanceof B2d) {
            A0E(view);
            return;
        }
        if (this instanceof B2c) {
            A0E(view);
        } else {
            if (this instanceof B2b) {
                return;
            }
            if (this instanceof B2a) {
                A0E(view);
            } else {
                A0E(view);
            }
        }
    }
}
