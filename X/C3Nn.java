package X;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.3Nn, reason: invalid class name */
/* loaded from: 3Nn.class */
public final class C3Nn {
    public final AnonymousClass335 A00;
    public final AnonymousClass335 A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.335] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.335] */
    public C3Nn(final Context context) {
        this.A00 = new TextView(context) { // from class: X.335
            public 3TX A00;

            {
                super(context);
                setTextColor(context.getColor(R.color.white));
                AbH.A1K(this, context.getColor(R.color.darker_gray));
                setTextSize(11.0f);
                setEllipsize(TextUtils.TruncateAt.END);
                setMaxLines(1);
                this.A00 = new 3TX();
            }

            public final void A00(boolean z) {
                3TX r303;
                StringBuilder A00;
                String str;
                if (z) {
                    r303 = this.A00;
                    A00 = AnonymousClass001.A0k();
                    3TX.A01(r303, A00);
                    str = " (p90 dur)=";
                } else {
                    setMaxLines(3);
                    r303 = this.A00;
                    A00 = 3TX.A00(r303);
                    3TX.A02(r303, A00);
                    str = " (90th %tile duration)=";
                }
                A00.append(str);
                ArrayList arrayList = r303.A0A;
                double size = ((arrayList.size() - 1) * 0.9d) + 1.0d;
                double d = size % 1.0d;
                int i = (int) (size - d);
                Object obj = arrayList.get(i - 1);
                11T.A0A(obj);
                int A03 = AnonymousClass001.A03(obj);
                double d2 = 0.0d;
                if (d != 0.0d && i < arrayList.size()) {
                    d2 = d * (JQy.A0H(arrayList, i) - A03);
                }
                double d3 = A03 + d2;
                NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
                numberFormat.setMaximumFractionDigits(2);
                String format = numberFormat.format(d3 / 1000.0d);
                11T.A0A(format);
                A00.append(format);
                setText(AnonymousClass001.A0g(A00, 's'));
            }
        };
        this.A01 = new TextView(context) { // from class: X.335
            public 3TX A00;

            {
                super(context);
                setTextColor(context.getColor(R.color.white));
                AbH.A1K(this, context.getColor(R.color.darker_gray));
                setTextSize(11.0f);
                setEllipsize(TextUtils.TruncateAt.END);
                setMaxLines(1);
                this.A00 = new 3TX();
            }

            public final void A00(boolean z) {
                3TX r303;
                StringBuilder A00;
                String str;
                if (z) {
                    r303 = this.A00;
                    A00 = AnonymousClass001.A0k();
                    3TX.A01(r303, A00);
                    str = " (p90 dur)=";
                } else {
                    setMaxLines(3);
                    r303 = this.A00;
                    A00 = 3TX.A00(r303);
                    3TX.A02(r303, A00);
                    str = " (90th %tile duration)=";
                }
                A00.append(str);
                ArrayList arrayList = r303.A0A;
                double size = ((arrayList.size() - 1) * 0.9d) + 1.0d;
                double d = size % 1.0d;
                int i = (int) (size - d);
                Object obj = arrayList.get(i - 1);
                11T.A0A(obj);
                int A03 = AnonymousClass001.A03(obj);
                double d2 = 0.0d;
                if (d != 0.0d && i < arrayList.size()) {
                    d2 = d * (JQy.A0H(arrayList, i) - A03);
                }
                double d3 = A03 + d2;
                NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
                numberFormat.setMaximumFractionDigits(2);
                String format = numberFormat.format(d3 / 1000.0d);
                11T.A0A(format);
                A00.append(format);
                setText(AnonymousClass001.A0g(A00, 's'));
            }
        };
    }

    public final void A00(boolean z) {
        AnonymousClass335 anonymousClass335 = this.A00;
        Context context = anonymousClass335.getContext();
        int i = 17170432;
        if (z) {
            i = 17170454;
        }
        AbH.A1K(anonymousClass335, context.getColor(i));
        AnonymousClass335 anonymousClass3352 = this.A01;
        Context context2 = anonymousClass3352.getContext();
        int i2 = 17170432;
        if (z) {
            i2 = 17170454;
        }
        AbH.A1K(anonymousClass3352, context2.getColor(i2));
    }
}
