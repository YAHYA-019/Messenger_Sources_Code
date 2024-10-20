package com.facebook.browser.lite.chrome.container.defaultchrome;

import X.0FI;
import X.11T;
import X.1BK;
import X.AbF;
import X.AbH;
import X.AbstractC3252Jnp;
import X.AnonymousClass001;
import X.DKB;
import X.DKC;
import X.DKG;
import X.GOn;
import X.JZN;
import X.JZY;
import X.JgX;
import X.Kpb;
import X.LDF;
import X.LKF;
import X.LKL;
import X.LKO;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: DefaultBrowserLiteChrome.class */
public class DefaultBrowserLiteChrome extends JZY {
    public Context A00;
    public Intent A01;
    public Drawable A02;
    public Bundle A03;
    public View.OnClickListener A04;
    public View A05;
    public ImageView A06;
    public ImageView A07;
    public LinearLayout A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public JgX A0C;
    public JgX A0D;
    public LDF A0E;
    public JZN A0F;
    public Kpb A0G;
    public AbstractC3252Jnp A0H;
    public String A0I;
    public boolean A0J;
    public final HashMap A0K;

    public DefaultBrowserLiteChrome(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.A0K = AnonymousClass001.A0u();
        this.A00 = context;
        Intent intent = ((Activity) context).getIntent();
        this.A01 = intent;
        this.A03 = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        Kpb kpb = Kpb.A02;
        if (kpb == null) {
            kpb = new Kpb();
            Kpb.A02 = kpb;
        }
        this.A0G = kpb;
        this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_REPORT_SHOULD_INCLUDE_CLOAKING_DATA", false);
        this.A0J = this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_FBLITE_IAB_IN_FB4A_MODE", false);
        this.A0I = this.A01.getStringExtra("BrowserLiteIntent.EXTRA_STATIC_TITLE_TEXT");
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(2132541618, (ViewGroup) this);
        this.A0B = AbF.A06(this, 2131367971);
        this.A0A = AbF.A06(this, 2131367969);
        this.A04 = LKO.A00(this, 25);
        ImageView A0I = GOn.A0I(this, 2131363049);
        this.A06 = A0I;
        A0I.setClickable(true);
        this.A06.setBackground(getResources().getDrawable(2132410597));
        this.A06.setOnClickListener(this.A04);
        ImageView imageView = this.A06;
        Context context3 = this.A00;
        11T.A0F(context3, 0);
        imageView.setContentDescription(1BK.A0u(context3, 2131951690));
        this.A09 = AbF.A06(this, 2131362633);
        this.A07 = GOn.A0I(this, 2131362656);
        this.A05 = findViewById(2131365173);
        Drawable drawable = context3.getResources().getDrawable(2132344957);
        this.A02 = drawable;
        if (this.A0J) {
            drawable.setColorFilter(context3.getResources().getColor(2132214238, null), PorterDuff.Mode.SRC_ATOP);
        } else {
            drawable.setAlpha(127);
        }
        this.A08 = (LinearLayout) findViewById(2131365174);
        if (this.A0J && this.A0I != null) {
            this.A0B.setVisibility(0);
            this.A0B.setText(this.A0I);
        }
        Bundle bundleExtra = this.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
        if (bundleExtra != null) {
            String string = bundleExtra.getString("KEY_LABEL");
            String string2 = bundleExtra.getString("action");
            if (!TextUtils.isEmpty(string) && string2 != null) {
                this.A09.setText(string);
                this.A09.setVisibility(0);
                this.A09.setOnClickListener(new LKF(string2, this, 0));
            }
        }
        ArrayList parcelableArrayListExtra = this.A01.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            ImageView imageView2 = this.A07;
            11T.A0F(context2, 0);
            imageView2.setContentDescription(1BK.A0u(context2, 2131951800));
            this.A07.setImageDrawable(this.A00.getResources().getDrawable(this.A01.getIntExtra("extra_menu_button_icon", 2132410943), null));
            LKL.A00(this.A07, this, parcelableArrayListExtra, 5);
            this.A07.setVisibility(DKG.A00(this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_MENU_ITEM", true) ? 1 : 0));
        }
        if (this.A07.getVisibility() == 8 && this.A09.getVisibility() != 8) {
            TextView textView = this.A09;
            textView.setPadding(textView.getPaddingLeft(), this.A09.getPaddingTop(), this.A00.getResources().getDimensionPixelSize(2132279327), this.A09.getPaddingBottom());
        }
        this.A06.setVisibility(DKG.A00(this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_CLOSE_BUTTON", true) ? 1 : 0));
        String stringExtra = this.A01.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
        if (DKB.A00(282).equals(stringExtra)) {
            this.A06.setImageDrawable(this.A00.getResources().getDrawable(this.A01.getDoubleExtra(DKB.A00(65), 1.0d) == 1.0d ? 2132345178 : 2132345301, null));
        } else {
            ImageView imageView3 = this.A06;
            Context context4 = this.A00;
            imageView3.setImageDrawable(context4.getResources().getDrawable(2132345301, null));
            if ("THEME_MESSENGER_FB4A".equals(stringExtra)) {
                i = 2132214206;
            } else if ("THEME_WORK_CHAT".equals(stringExtra)) {
                i = 2132214133;
            } else if ("THEME_INSTAGRAM".equals(stringExtra)) {
                this.A0A.getLayoutParams().height = -1;
                this.A0A.setTextSize(0, this.A0B.getTextSize());
                ViewGroup.MarginLayoutParams A0I2 = DKC.A0I(this.A05);
                A0I2.setMargins(context4.getResources().getDimensionPixelOffset(0), A0I2.topMargin, 0, A0I2.bottomMargin);
            }
            Context context5 = this.A00;
            AbH.A1K(this, context5.getResources().getColor(i, null));
            this.A0B.setTextColor(context5.getResources().getColor(2132213766, null));
            this.A06.setColorFilter(context5.getResources().getColor(2132213766, null));
        }
        this.A0E = LDF.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(126264480);
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        0FI.A0C(-2080620137, A06);
    }
}
