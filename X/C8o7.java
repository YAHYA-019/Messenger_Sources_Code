package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.8o7, reason: invalid class name */
/* loaded from: 8o7.class */
public final class C8o7 extends C1rj {
    public static final TextUtils.TruncateAt A07 = TextUtils.TruncateAt.END;
    public int A00;
    public int A01;
    public int A02;
    public Typeface A03;
    public TextUtils.TruncateAt A04;
    public View.OnLongClickListener A05;
    public CharSequence A06;

    public C8o7() {
        super("ColorTransitionText");
        this.A04 = A07;
        this.A00 = 1;
    }

    public static 8TQ A00(1Iw r301) {
        return new 8TQ(r301, new C8o7());
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new TextView(context);
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        CharSequence charSequence = this.A06;
        int i3 = this.A02;
        int i4 = this.A01;
        Typeface typeface = this.A03;
        int i5 = this.A00;
        TextUtils.TruncateAt truncateAt = this.A04;
        View.OnLongClickListener onLongClickListener = this.A05;
        1BK.A1K(r302, 0, c23p);
        11T.A0F(truncateAt, 10);
        TextView textView = new TextView(r302.A0D);
        textView.setText(charSequence);
        textView.setTextColor(i4);
        textView.setTypeface(typeface);
        textView.setTextSize(0, i3);
        textView.setMaxLines(i5);
        textView.setEllipsize(truncateAt);
        textView.measure(C2ra.A00(i), C2ra.A00(i2));
        c23p.A01 = textView.getMeasuredWidth();
        c23p.A00 = textView.getMeasuredHeight();
        if (onLongClickListener != null) {
            textView.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        TextView textView = (TextView) obj;
        CharSequence charSequence = this.A06;
        int i = this.A02;
        int i2 = this.A01;
        Typeface typeface = this.A03;
        int i3 = this.A00;
        TextUtils.TruncateAt truncateAt = this.A04;
        View.OnLongClickListener onLongClickListener = this.A05;
        4YV.A1M(textView, 1, truncateAt);
        1Br A0X = 7zM.A0X();
        if (charSequence != null) {
            charSequence = ((C22a) A0X.get()).BdF(i, charSequence);
        }
        textView.setText(charSequence);
        textView.setTextColor(i2);
        textView.setTypeface(typeface);
        textView.setTextSize(0, i);
        textView.setMaxLines(i3);
        textView.setEllipsize(truncateAt);
        if (onLongClickListener != null) {
            textView.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8o7 c8o7 = (C8o7) r302;
            TextUtils.TruncateAt truncateAt = this.A04;
            TextUtils.TruncateAt truncateAt2 = c8o7.A04;
            if (truncateAt != null) {
                if (!truncateAt.equals(truncateAt2)) {
                    return false;
                }
            } else if (truncateAt2 != null) {
                return false;
            }
            if (this.A00 != c8o7.A00) {
                return false;
            }
            View.OnLongClickListener onLongClickListener = this.A05;
            View.OnLongClickListener onLongClickListener2 = c8o7.A05;
            if (onLongClickListener != null) {
                if (!onLongClickListener.equals(onLongClickListener2)) {
                    return false;
                }
            } else if (onLongClickListener2 != null) {
                return false;
            }
            CharSequence charSequence = this.A06;
            CharSequence charSequence2 = c8o7.A06;
            if (charSequence != null) {
                if (!charSequence.equals(charSequence2)) {
                    return false;
                }
            } else if (charSequence2 != null) {
                return false;
            }
            if (this.A01 != c8o7.A01 || this.A02 != c8o7.A02) {
                return false;
            }
            Typeface typeface = this.A03;
            Typeface typeface2 = c8o7.A03;
            if (typeface != null) {
                if (!typeface.equals(typeface2)) {
                    return false;
                }
            } else if (typeface2 != null) {
                return false;
            }
        }
        return true;
    }
}
