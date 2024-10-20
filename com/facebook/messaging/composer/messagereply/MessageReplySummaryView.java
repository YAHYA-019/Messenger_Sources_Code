package com.facebook.messaging.composer.messagereply;

import X.1BQ;
import X.1Hv;
import X.2KE;
import X.2KK;
import X.2Wo;
import X.7zN;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AnonymousClass470;
import X.C00i;
import X.C09s;
import X.C0A8;
import X.C2cn;
import X.C5hs;
import X.D1d;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.base.Objects;

/* loaded from: MessageReplySummaryView.class */
public class MessageReplySummaryView extends CustomLinearLayout implements CallerContextable {
    public static final CallerContext A0A = CallerContext.A08(MessageReplySummaryView.class, "sticker_thread_view");
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public C00i A04;
    public MigColorScheme A05;
    public 2Wo A06;
    public 2Wo A07;
    public 2Wo A08;
    public final C00i A09;

    public MessageReplySummaryView(Context context) {
        super(context);
        this.A05 = LightColorScheme.A00();
        this.A09 = 1BQ.A00();
        A00();
    }

    public MessageReplySummaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = LightColorScheme.A00();
        this.A09 = 1BQ.A00();
        A00();
    }

    private void A00() {
        this.A04 = 1BQ.A02(66067);
        Context context = getContext();
        this.A00 = context.getResources().getDimensionPixelSize(2132279312);
        this.A01 = context.getResources().getDimensionPixelSize(2132279429);
        A0D(2132541742);
        setOrientation(0);
        setGravity(16);
        TextView A09 = AbG.A09(this, 2131365649);
        this.A03 = A09;
        2KE r0 = 2KE.A05;
        A09.setTextSize(7zN.A00(r0));
        this.A03.setTypeface(2KK.A04(r0).A00(context));
        2Wo A0v = AbK.A0v(this, 2131365645);
        this.A08 = A0v;
        A0v.A02 = new D1d(this, 0);
        ImageView imageView = (ImageView) C09s.A01(this, 2131365641);
        this.A02 = imageView;
        imageView.setImageResource(2132345795);
        A01();
        this.A07 = AbK.A0v(this, 2131365647);
        this.A06 = AbK.A0v(this, 2131365646);
    }

    private void A01() {
        MigColorScheme migColorScheme = this.A05;
        if (migColorScheme != null) {
            this.A02.setColorFilter(migColorScheme.B4h());
            this.A02.setBackground(C2cn.A00(C0A8.A00(getContext(), C5hs.SMALL.sizeDp) / 2, this.A05.AmV(), this.A05.AYw()));
        }
    }

    public static void A02(MessageReplySummaryView messageReplySummaryView, String str) {
        TextView textView = (TextView) messageReplySummaryView.A08.A01();
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(((AnonymousClass470) 1Hv.A02(messageReplySummaryView.getContext(), 32912)).A07(str, (int) (((TextView) messageReplySummaryView.A08.A01()).getTextSize() + 0.5f)));
            messageReplySummaryView.A08.A03();
        }
    }

    public void A0E(ThreadViewColorScheme threadViewColorScheme) {
        MigColorScheme migColorScheme = threadViewColorScheme.A0F;
        if (Objects.equal(migColorScheme, this.A05)) {
            return;
        }
        this.A05 = migColorScheme;
        AbH.A1M(this.A03, migColorScheme);
        if (this.A05 != null) {
            2Wo r0 = this.A08;
            if (r0.A00 != null) {
                AbG.A1J((TextView) r0.A01(), this.A05);
            }
        }
        A01();
    }
}
