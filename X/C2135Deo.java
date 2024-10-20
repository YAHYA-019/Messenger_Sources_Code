package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.Deo, reason: case insensitive filesystem */
/* loaded from: Deo.class */
public final class C2135Deo extends FIU {
    public ImageView A00;
    public LinearLayout A01;
    public View A02;
    public LinearLayout A03;
    public MigColorScheme A04;
    public 2Wo A05;
    public final Context A06;

    public C2135Deo(Context context, C62j c62j, boolean z) {
        super(context, 0);
        this.A04 = LightColorScheme.A00();
        this.A06 = context;
        C66i c66i = new C66i(c62j);
        c66i.A03();
        c66i.A02();
        A0F(c66i);
        ((FIU) this).A0I.setBackgroundDrawable(7zL.A0D(0));
        ((FIU) this).A0I.setPadding(0, 0, 0, 0);
        if (((FIU) this).A00 != 0.0f) {
            ((FIU) this).A00 = 0.0f;
        }
        View A0B = DKF.A0B(LayoutInflater.from(((FIU) this).A0F), 2132541923);
        this.A02 = A0B;
        this.A01 = (LinearLayout) A0B.findViewById(2131363324);
        this.A03 = (LinearLayout) this.A02.findViewById(2131363856);
        this.A00 = (ImageView) this.A02.findViewById(2131363857);
        2Wo A00 = 2Wo.A00((ViewStub) this.A02.findViewById(2131363863));
        this.A05 = A00;
        if (z) {
            A00.A03();
        }
        A0B(this.A02);
        this.A02.setOnTouchListener(new FY5(this, 2));
    }

    public void A0K(Drawable drawable, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnTouchListener onTouchListener, String str, int i, boolean z) {
        Drawable A00;
        ImageView imageView = (ImageView) this.A03.getChildAt(i);
        Context context = this.A06;
        int A02 = DKH.A02(context);
        int A01 = 7zN.A01(context.getResources());
        if (z) {
            A00 = C2cn.A02(A01, this.A04.B9e());
        } else {
            A00 = C2cn.A00(A01, 0, this.A04.AmV());
        }
        imageView.setBackground(A00);
        imageView.setOnClickListener(onClickListener);
        imageView.setImageDrawable(drawable);
        imageView.setPadding(A02, A02, A02, A02);
        imageView.setContentDescription(str);
        if (onLongClickListener != null) {
            imageView.setOnLongClickListener(onLongClickListener);
        }
        if (onTouchListener != null) {
            imageView.setOnTouchListener(onTouchListener);
        }
    }

    public void A0L(MigColorScheme migColorScheme) {
        TextView textView;
        this.A04 = migColorScheme;
        LinearLayout linearLayout = this.A01;
        Drawable drawable = ((FIU) this).A0F.getDrawable(2132410671);
        int Abp = migColorScheme.Abp();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(Abp, mode);
        linearLayout.setBackground(drawable);
        ImageView imageView = this.A00;
        Drawable drawable2 = ((FIU) this).A0F.getDrawable(2132345649);
        drawable2.setColorFilter(migColorScheme.Abp(), mode);
        imageView.setBackground(drawable2);
        2Wo r0 = this.A05;
        if (!r0.A04() || (textView = (TextView) r0.A01()) == null) {
            return;
        }
        AbG.A1J(textView, migColorScheme);
    }
}
