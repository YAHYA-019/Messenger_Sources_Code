package com.facebook.browser.lite.chrome.widgets.menu;

import X.L3E;
import X.LKM;
import X.MF7;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.util.Locale;

/* loaded from: MenuItemNavigationView.class */
public class MenuItemNavigationView extends LinearLayout {
    public MenuItemNavigationView(Context context) {
        this(context, null);
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void A00(ImageButton imageButton, L3E l3e, MF7 mf7, MenuItemNavigationView menuItemNavigationView) {
        imageButton.setEnabled(l3e.A05);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            imageButton.setScaleX(-1.0f);
        }
        if (l3e.A05) {
            imageButton.setOnClickListener(new LKM(0, mf7, menuItemNavigationView, l3e));
        }
    }
}
