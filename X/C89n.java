package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.89n, reason: invalid class name */
/* loaded from: 89n.class */
public final class C89n extends C1rj {
    public 5zD A00;
    public C89m A01;
    public AnonymousClass898 A02;
    public Capabilities A03;

    public C89n() {
        super("AdminMessageWithLinkComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A02, this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5zD r0 = this.A00;
        final C89m c89m = this.A01;
        C22a c22a = (C22a) 1Bi.A03(66067);
        Context context = r302.A0D;
        Resources resources = context.getResources();
        0Dc r02 = new 0Dc(resources, new SpannableStringBuilder());
        String str = c89m.A03;
        if (str != null) {
            r02.A02(str);
        }
        Drawable drawable = c89m.A00;
        if (drawable != null) {
            int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, ((Resources) 7zM.A19()).getDisplayMetrics());
            drawable.setBounds(0, 0, applyDimension, applyDimension);
            r02.A04(new 4ER(drawable, 8, 8, 1), 33);
            r02.A02(" ");
            r02.A00();
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(r0.BKZ());
        7Ks r03 = new 7Ks() { // from class: X.89u
            public void onClick(View view) {
                View.OnClickListener onClickListener = C89m.this.A01;
                onClickListener.getClass();
                onClickListener.onClick(view);
            }
        };
        StyleSpan styleSpan = new StyleSpan(1);
        String str2 = c89m.A02;
        if (str2 == null) {
            str2 = resources.getString(2131960510);
        }
        if (!c89m.A04 && c89m.A01 != null) {
            r02.A02(" ");
            r02.A04(foregroundColorSpan, 18);
            r02.A04(r03, 18);
            r02.A04(styleSpan, 18);
            r02.A02(str2);
            r02.A00();
            r02.A00();
            r02.A00();
        }
        SpannableString A0E = 7zM.A0E(r02);
        c22a.A7O(A0E, context.getResources().getDimensionPixelSize(2132279337));
        2KD A00 = 2K3.A00(r302);
        7zN.A1V(r0, A00);
        A00.A2z(A0E);
        int BKa = r0.BKa();
        A00.A2w(new 3yK(BKa, BKa));
        A00.A2i();
        A00.A2X();
        A00.A1C(56.0f);
        A00.A2K("admin_message");
        A00.A30(true);
        return 7zL.A0U(7zM.A0j(r302, 2132606994), A00);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        View.OnClickListener onClickListener = ((C89n) r0).A01.A01;
        if (onClickListener == null) {
            return null;
        }
        onClickListener.onClick(view);
        return null;
    }
}
