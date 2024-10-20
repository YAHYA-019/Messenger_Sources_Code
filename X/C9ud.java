package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.stickers.model.Sticker;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9ud, reason: invalid class name */
/* loaded from: 9ud.class */
public final class C9ud implements 6Gp {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ 06Z A03;
    public final /* synthetic */ C6wd A04;
    public final /* synthetic */ Sticker A05;
    public final /* synthetic */ 6tM A06;
    public final /* synthetic */ 96D A07;
    public final /* synthetic */ EnumMap A08;
    public final /* synthetic */ List A09;

    public C9ud(Context context, View view, Fragment fragment, 06Z r305, C6wd c6wd, Sticker sticker, 6tM r308, 96D r309, EnumMap enumMap, List list) {
        this.A00 = context;
        this.A01 = view;
        this.A07 = r309;
        this.A02 = fragment;
        this.A04 = c6wd;
        this.A05 = sticker;
        this.A03 = r305;
        this.A06 = r308;
        this.A08 = enumMap;
        this.A09 = list;
    }

    public final boolean C6c(MenuDialogItem menuDialogItem, Object obj) {
        Object obj2;
        Context context = this.A00;
        InputMethodManager A0C = 7zS.A0C(context);
        View view = this.A01;
        7zR.A12(view, A0C);
        if (!1XU.A00(view.getRootView().getContext()) && this.A07 != 96D.A04) {
            view = 7zM.A0F(this.A02.requireActivity());
            11T.A0D(view);
        }
        C6wd c6wd = this.A04;
        Sticker sticker = this.A05;
        06Z r0 = this.A03;
        6tM r02 = this.A06;
        11T.A0D(menuDialogItem);
        EnumMap enumMap = this.A08;
        List list = this.A09;
        6wB r03 = c6wd.A00;
        if (r03 != null) {
            r03.AQW();
        }
        view.getRootView().getOverlay().clear();
        C6we[] values = C6we.values();
        int i = menuDialogItem.A01;
        C6wg c6wg = (C6wg) enumMap.get(values[i]);
        if (c6wg == null) {
            C6we c6we = C6we.values()[i];
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((C6wh) obj2).A02 == c6we) {
                    break;
                }
            }
            C6wh c6wh = (C6wh) obj2;
            if (c6wh == null) {
                return true;
            }
            c6wg = c6wh.A01;
            if (c6wg == null) {
                return true;
            }
        }
        c6wg.C6f(context, view, r0, sticker, r02);
        return true;
    }
}
