package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fbui.widget.glyph.GlyphView;

/* renamed from: X.Deh, reason: case insensitive filesystem */
/* loaded from: Deh.class */
public class C2128Deh extends DSk {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C00i A07;

    public C2128Deh(Context context) {
        super(context);
        this.A07 = 1BQ.A00();
        this.A01 = 0;
        this.A04 = false;
        this.A02 = 0;
        this.A05 = true;
        this.A00 = context.getResources().getDimensionPixelSize(2132279310);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.CharSequence] */
    public static void A00(FXN fxn, DTH dth, C2128Deh c2128Deh) {
        StringBuilder A0k;
        boolean z = c2128Deh.A05;
        GlyphView glyphView = dth.A01;
        if (z) {
            glyphView.setVisibility(0);
            Drawable icon = fxn.getIcon();
            if (icon != null) {
                glyphView.setImageDrawable(icon);
            }
        } else {
            glyphView.setVisibility(8);
        }
        GlyphView glyphView2 = dth.A00;
        if (glyphView2 != null) {
            ViewGroup.LayoutParams layoutParams = glyphView2.getLayoutParams();
            int i = c2128Deh.A00;
            layoutParams.width = i;
            layoutParams.height = i;
            if (fxn.A00 != null) {
                glyphView2.setVisibility(0);
                glyphView2.setImageDrawable(fxn.A00);
                glyphView2.setBackgroundDrawable(fxn.A01);
            } else {
                glyphView2.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(fxn.getTitle())) {
            dth.A02.setText(fxn.getTitle());
        }
        View view = dth.A0I;
        FXs.A01(view, fxn, c2128Deh, 77);
        Integer num = fxn.A07;
        if (num == null) {
            num = 0S2.A01;
        }
        C2rp.A02(view, num);
        if (TextUtils.isEmpty(fxn.getContentDescription())) {
            A0k = AnonymousClass001.A0k();
            if (!TextUtils.isEmpty(fxn.getTitle())) {
                C2cd.A07(fxn.getTitle(), A0k, true);
            }
            if (!TextUtils.isEmpty(fxn.A05)) {
                C2cd.A07(fxn.A05, A0k, true);
            }
            if (!TextUtils.isEmpty(null)) {
                C2cd.A07(null, A0k, true);
            }
        } else {
            A0k = fxn.getContentDescription();
        }
        view.setContentDescription(A0k);
    }

    public void A0Q(int i) {
        this.A04 = true;
        this.A03 = ((DSk) this).A03.getResources().getString(i);
    }

    public int getItemViewType(int i) {
        int i2 = 2;
        if (!this.A04 || i != 0) {
            getItem(i);
            FXN item = getItem(i);
            if (item != null && TextUtils.isEmpty(item.getTitle()) && item.getIcon() == null) {
                return 6;
            }
            getItem(i);
            i2 = 1;
            if (this.A01 != 1) {
                i2 = 4;
                if (!1BK.A0N(this.A07).AZk(36313927012916478L)) {
                    return 0;
                }
            }
        } else if (this.A06) {
            i2 = 5;
        }
        return i2;
    }
}
