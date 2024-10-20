package com.facebook.pages.common.requesttime.widget;

import X.0Q8;
import X.11T;
import X.Eef;
import X.FXq;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.widget.CustomLinearLayout;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: WeekView.class */
public final class WeekView extends CustomLinearLayout {
    public Eef A00;
    public Date A01;
    public Date A02;
    public Locale A03;
    public Context A04;
    public Resources A05;
    public Drawable A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekView(Context context) {
        super(context);
        11T.A0F(context, 1);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(context);
    }

    private final void A00(Context context) {
        int i = 0;
        setOrientation(0);
        A0D(2132543577);
        this.A04 = context;
        Resources resources = getResources();
        11T.A0A(resources);
        this.A05 = resources;
        Locale locale = resources.getConfiguration().locale;
        11T.A09(locale);
        this.A03 = locale;
        Resources resources2 = this.A05;
        if (resources2 == null) {
            11T.A0L("resources");
        } else {
            Drawable drawable = resources2.getDrawable(2132410633);
            11T.A0A(drawable);
            this.A06 = drawable;
            FXq A00 = FXq.A00(this, 7);
            do {
                getChildAt(i).setOnClickListener(A00);
                i++;
            } while (i < 7);
            Locale locale2 = this.A03;
            if (locale2 != null) {
                Date time = Calendar.getInstance(locale2).getTime();
                11T.A0A(time);
                this.A01 = time;
                return;
            }
            11T.A0L("locale");
        }
        throw 0Q8.createAndThrow();
    }

    private final boolean A01(Date date, Date date2) {
        Locale locale = this.A03;
        if (locale != null) {
            Calendar calendar = Calendar.getInstance(locale);
            Locale locale2 = this.A03;
            if (locale2 != null) {
                Calendar calendar2 = Calendar.getInstance(locale2);
                calendar.setTime(date);
                calendar2.setTime(date2);
                return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
            }
        }
        11T.A0L("locale");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pages.common.requesttime.widget.WeekView.A0E():void");
    }
}
