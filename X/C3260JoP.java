package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: X.JoP, reason: case insensitive filesystem */
/* loaded from: JoP.class */
public final class C3260JoP extends JwS implements MFS {
    public C00i A00;
    public boolean A01;
    public ExecutorService A02;
    public ExecutorService A03;
    public final ImageView A04;
    public final TextView A05;
    public final C00i A06;
    public final 1CO A07;

    /* JADX WARN: Multi-variable type inference failed */
    public C3260JoP(Context context) {
        super(context);
        this.A06 = 1BQ.A02(98768);
        this.A07 = AbJ.A0e();
        this.A00 = 1BV.A00(84850);
        this.A03 = (ExecutorService) 1Bi.A03(16456);
        this.A02 = (ExecutorService) 1Bi.A03(16477);
        A0U(2132541687);
        setId(2131362971);
        this.A05 = (TextView) C09s.A01(this, 2131362350);
        ImageView A0I = GOn.A0I(this, 2131364519);
        this.A04 = A0I;
        A0I.setImageDrawable(JQy.A0X(this).A00(2MQ.A1u));
    }

    public void A0Y() {
        TextView textView = this.A05;
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            textView.setText("");
            ((GradientDrawable) textView.getBackground().mutate()).setColor(-16743169);
        }
    }

    public void CmN(boolean z) {
        this.A04.setSelected(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(822854049);
        super/*com.facebook.widget.CustomFrameLayout*/.onAttachedToWindow();
        C2rp.A01(this);
        GOo.A16(getContext(), this, 2131954094);
        1Kd.A0F(new LfN(this, 9), (ListenableFuture) this.A02.submit((Callable) new J5U(this, 5)), this.A03);
        0FI.A0C(-1250897012, A06);
    }
}
