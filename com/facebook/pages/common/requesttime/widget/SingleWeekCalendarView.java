package com.facebook.pages.common.requesttime.widget;

import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BL;
import X.C09s;
import X.DKC;
import X.Eef;
import X.FXq;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: SingleWeekCalendarView.class */
public final class SingleWeekCalendarView extends CustomLinearLayout {
    public int A00;
    public Animation A01;
    public Animation A02;
    public Animation A03;
    public Animation A04;
    public ViewSwitcher A05;
    public WeekView A06;
    public Date A07;
    public Date A08;
    public Locale A09;
    public TimeZone A0A;
    public int A0B;
    public GlyphButton A0C;
    public GlyphButton A0D;
    public Eef A0E;
    public WeekView A0F;
    public BetterTextView A0G;
    public SimpleDateFormat A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleWeekCalendarView(Context context) {
        super(context);
        11T.A0F(context, 1);
        A01(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleWeekCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        1BL.A1F(context, attributeSet);
        A01(context);
    }

    public static final Date A00(SingleWeekCalendarView singleWeekCalendarView, Date date, int i) {
        String str;
        TimeZone timeZone = singleWeekCalendarView.A0A;
        if (timeZone == null) {
            str = "timeZone";
        } else {
            Locale locale = singleWeekCalendarView.A09;
            if (locale != null) {
                Calendar calendar = Calendar.getInstance(timeZone, locale);
                calendar.setTime(date);
                calendar.add(5, i);
                Date time = calendar.getTime();
                11T.A0A(time);
                return time;
            }
            str = "locale";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    private final void A01(Context context) {
        setOrientation(1);
        A0D(2132543359);
        Resources resources = getResources();
        Locale locale = resources.getConfiguration().locale;
        String str = "locale";
        11T.A09(locale);
        this.A09 = locale;
        TimeZone timeZone = TimeZone.getDefault();
        11T.A0A(timeZone);
        this.A0A = timeZone;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_in_left);
        11T.A0A(loadAnimation);
        this.A01 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, 2130772099);
        11T.A0A(loadAnimation2);
        this.A02 = loadAnimation2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, 2130772103);
        11T.A0A(loadAnimation3);
        this.A03 = loadAnimation3;
        Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.slide_out_right);
        11T.A0A(loadAnimation4);
        this.A04 = loadAnimation4;
        this.A0B = resources.getColor(2132214292);
        resources.getColor(2132214269);
        Locale locale2 = this.A09;
        if (locale2 != null) {
            this.A0H = new SimpleDateFormat(1BJ.A00(292), locale2);
            this.A0G = DKC.A0g(this, 2131365826);
            this.A05 = (ViewSwitcher) C09s.A01(this, 2131368434);
            this.A0D = (GlyphButton) C09s.A01(this, 2131365200);
            this.A0C = (GlyphButton) C09s.A01(this, 2131366978);
            GlyphButton glyphButton = this.A0D;
            if (glyphButton == null) {
                str = "prevButton";
            } else {
                FXq.A01(glyphButton, this, 5);
                GlyphButton glyphButton2 = this.A0C;
                if (glyphButton2 == null) {
                    str = "nextButton";
                } else {
                    FXq.A01(glyphButton2, this, 6);
                    this.A0E = new Eef(this);
                    this.A06 = (WeekView) C09s.A01(this, 2131363494);
                    WeekView weekView = (WeekView) C09s.A01(this, 2131362349);
                    this.A0F = weekView;
                    WeekView weekView2 = this.A06;
                    if (weekView2 != null) {
                        Eef eef = this.A0E;
                        String str2 = "internalDayTappedListener";
                        if (eef != null) {
                            weekView2.A00 = eef;
                            if (weekView == null) {
                                str = "backupWeekView";
                            } else {
                                weekView.A00 = eef;
                                Locale locale3 = this.A09;
                                if (locale3 != null) {
                                    String[] shortWeekdays = new DateFormatSymbols(locale3).getShortWeekdays();
                                    TimeZone timeZone2 = this.A0A;
                                    str2 = "timeZone";
                                    if (timeZone2 != null) {
                                        Locale locale4 = this.A09;
                                        if (locale4 != null) {
                                            this.A00 = Calendar.getInstance(timeZone2, locale4).getFirstDayOfWeek();
                                            ViewGroup viewGroup = (ViewGroup) C09s.A01(this, 2131365149);
                                            for (int i = 0; i < 7; i++) {
                                                View childAt = viewGroup.getChildAt(i);
                                                11T.A0I(childAt, "null cannot be cast to non-null type com.facebook.widget.text.BetterTextView");
                                                ((TextView) childAt).setText(shortWeekdays[(((this.A00 + i) + 6) % 7) + 1]);
                                            }
                                            TimeZone timeZone3 = this.A0A;
                                            if (timeZone3 != null) {
                                                Locale locale5 = this.A09;
                                                if (locale5 != null) {
                                                    Date time = Calendar.getInstance(timeZone3, locale5).getTime();
                                                    11T.A0A(time);
                                                    TimeZone timeZone4 = this.A0A;
                                                    if (timeZone4 != null) {
                                                        Locale locale6 = this.A09;
                                                        if (locale6 != null) {
                                                            Calendar calendar = Calendar.getInstance(timeZone4, locale6);
                                                            calendar.setTime(time);
                                                            calendar.set(11, 0);
                                                            calendar.set(12, 0);
                                                            calendar.set(13, 0);
                                                            calendar.set(14, 0);
                                                            Date time2 = calendar.getTime();
                                                            11T.A0A(time2);
                                                            this.A08 = time2;
                                                            TimeZone timeZone5 = this.A0A;
                                                            if (timeZone5 != null) {
                                                                Locale locale7 = this.A09;
                                                                if (locale7 != null) {
                                                                    Calendar calendar2 = Calendar.getInstance(timeZone5, locale7);
                                                                    calendar2.setTime(time);
                                                                    int i2 = calendar2.get(7);
                                                                    int i3 = this.A00;
                                                                    if (i3 > i2) {
                                                                        i2 += 7;
                                                                    }
                                                                    this.A07 = A00(this, time, i3 - i2);
                                                                    WeekView weekView3 = this.A06;
                                                                    if (weekView3 != null) {
                                                                        A04(weekView3);
                                                                        A02(this);
                                                                        return;
                                                                    }
                                                                    str2 = "currentWeekView";
                                                                }
                                                            }
                                                        }
                                                        str2 = str;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        11T.A0L(str2);
                        throw 0Q8.createAndThrow();
                    }
                    str = "currentWeekView";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r304 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        r309.setText(r302.format(r304));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r304 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.widget.TextView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(com.facebook.pages.common.requesttime.widget.SingleWeekCalendarView r301) {
        /*
            r0 = r301
            java.util.Date r0 = r0.A08
            r302 = r0
            java.lang.String r0 = "selectedDate"
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L77
            r0 = r301
            java.util.Date r0 = r0.A07
            r304 = r0
            java.lang.String r0 = "currentStartDate"
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L9c
            r0 = r302
            r1 = r304
            boolean r0 = r0.before(r1)
            r306 = r0
            java.lang.String r0 = "monthYearFormat"
            r307 = r0
            java.lang.String r0 = "monthYearTitle"
            r308 = r0
            r0 = r306
            if (r0 != 0) goto L7f
            r0 = r301
            java.util.Date r0 = r0.A08
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L77
            r0 = r301
            java.util.Date r0 = r0.A07
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L9c
            r0 = r301
            r1 = r302
            r2 = 6
            java.util.Date r0 = A00(r0, r1, r2)
            r304 = r0
            r0 = r309
            r1 = r304
            boolean r0 = r0.after(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L7f
            r0 = r301
            com.facebook.widget.text.BetterTextView r0 = r0.A0G
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Lac
            r0 = r301
            java.text.SimpleDateFormat r0 = r0.A0H
            r302 = r0
            r0 = r302
            if (r0 == 0) goto La4
            r0 = r301
            java.util.Date r0 = r0.A08
            r304 = r0
            r0 = r304
            if (r0 != 0) goto Lb4
        L77:
            r0 = r303
            X.11T.A0L(r0)
        L7b:
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L7f:
            r0 = r301
            com.facebook.widget.text.BetterTextView r0 = r0.A0G
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Lac
            r0 = r301
            java.text.SimpleDateFormat r0 = r0.A0H
            r302 = r0
            r0 = r302
            if (r0 == 0) goto La4
            r0 = r301
            java.util.Date r0 = r0.A07
            r304 = r0
            r0 = r304
            if (r0 != 0) goto Lb4
        L9c:
            r0 = r305
            X.11T.A0L(r0)
            goto L7b
        La4:
            r0 = r307
            X.11T.A0L(r0)
            goto L7b
        Lac:
            r0 = r308
            X.11T.A0L(r0)
            goto L7b
        Lb4:
            r0 = r302
            r1 = r304
            java.lang.String r0 = r0.format(r1)
            r304 = r0
            r0 = r309
            r1 = r304
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pages.common.requesttime.widget.SingleWeekCalendarView.A02(com.facebook.pages.common.requesttime.widget.SingleWeekCalendarView):void");
    }

    public static final void A03(SingleWeekCalendarView singleWeekCalendarView) {
        WeekView weekView = singleWeekCalendarView.A0F;
        String str = "backupWeekView";
        if (weekView != null) {
            singleWeekCalendarView.A04(weekView);
            ViewSwitcher viewSwitcher = singleWeekCalendarView.A05;
            if (viewSwitcher == null) {
                str = "weekSwitcher";
            } else {
                viewSwitcher.showNext();
                WeekView weekView2 = singleWeekCalendarView.A06;
                if (weekView2 == null) {
                    str = "currentWeekView";
                } else {
                    WeekView weekView3 = singleWeekCalendarView.A0F;
                    if (weekView3 != null) {
                        singleWeekCalendarView.A06 = weekView3;
                        singleWeekCalendarView.A0F = weekView2;
                        A02(singleWeekCalendarView);
                        return;
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    private final void A04(WeekView weekView) {
        String str;
        Date date = this.A07;
        String str2 = "currentStartDate";
        if (date != null) {
            weekView.A02 = date;
            Date date2 = this.A08;
            if (date2 == null) {
                str = "selectedDate";
            } else {
                weekView.A01 = date2;
                GlyphButton glyphButton = this.A0D;
                str = "prevButton";
                if (glyphButton != null) {
                    glyphButton.A02(this.A0B);
                    GlyphButton glyphButton2 = this.A0D;
                    if (glyphButton2 != null) {
                        glyphButton2.setEnabled(true);
                        GlyphButton glyphButton3 = this.A0D;
                        if (glyphButton3 != null) {
                            Resources resources = getResources();
                            glyphButton3.setContentDescription(resources.getString(2131953680));
                            GlyphButton glyphButton4 = this.A0C;
                            str2 = "nextButton";
                            if (glyphButton4 != null) {
                                glyphButton4.A02(this.A0B);
                                GlyphButton glyphButton5 = this.A0C;
                                if (glyphButton5 != null) {
                                    glyphButton5.setEnabled(true);
                                    GlyphButton glyphButton6 = this.A0C;
                                    if (glyphButton6 != null) {
                                        glyphButton6.setContentDescription(resources.getString(2131953679));
                                        weekView.A0E();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }
}
