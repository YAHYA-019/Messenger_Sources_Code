package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.resources.ui.FbLinearLayout;

/* loaded from: E98.class */
public final class E98 extends FbLinearLayout {
    public final TextView A00;
    public final TextView A01;

    public E98(Context context) {
        super(context, null, 0);
        View.inflate(context, 2132543089, this);
        this.A00 = (TextView) 7zM.A0H(this, 2131365719);
        this.A01 = (TextView) 7zM.A0H(this, 2131365720);
    }

    public final void A00(String str) {
        Context context;
        2MR r307;
        TextView textView = this.A01;
        textView.setText(str);
        if (str.equals("DISCONNECTED")) {
            context = getContext();
            r307 = 2MR.A1B;
        } else {
            boolean equals = str.equals("CONNECTED");
            context = getContext();
            r307 = equals ? 2MR.A1Q : 2MR.A04;
        }
        DKF.A14(context, textView, r307, 2Me.A02);
    }
}
