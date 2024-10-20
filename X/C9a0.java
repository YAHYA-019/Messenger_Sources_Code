package X;

import android.content.Context;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.xapp.messaging.composer.theme.customization.model.ThemeCustomizationPickerParams;
import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9a0, reason: invalid class name */
/* loaded from: 9a0.class */
public final class C9a0 {
    public final Context A00;
    public final Fragment A01;
    public final 06Z A02;
    public final 1Br A04;
    public final 1Br A05;
    public final String A07;
    public final C00m A08;
    public final 1Br A06 = 7zM.A0O();
    public final 1Br A03 = 7zM.A0Q();

    public C9a0(Context context, Fragment fragment, 06Z r304, String str, C00m c00m) {
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = r304;
        this.A07 = str;
        this.A08 = c00m;
        this.A05 = 1Bu.A01(context, 67784);
        this.A04 = 7zM.A0f(context);
    }

    public final void A00(8Lu r302) {
        Window window;
        FragmentActivity activity = this.A01.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            1tJ.A06(window, 0);
        }
        ImmutableList.of();
        ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) r302.A00;
        C1pq.A08("currentTheme", threadThemeInfo);
        ImmutableList immutableList = (ImmutableList) r302.A01;
        C1pq.A08("themeOptions", immutableList);
        9Ck.A00(new ThemeCustomizationPickerParams(null, threadThemeInfo, immutableList), this.A07, false, true, true).A0m(this.A02, "MessengerAccountThemePickerLauncherActivity");
    }
}
