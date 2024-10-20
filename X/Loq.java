package X;

import android.content.Context;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* loaded from: Loq.class */
public final class Loq implements Runnable {
    public static final String __redex_internal_original_name = "DateFormatTextWatcher$1";
    public final /* synthetic */ K8C A00;
    public final /* synthetic */ String A01;

    public Loq(K8C k8c, String str) {
        this.A00 = k8c;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        K8C k8c = this.A00;
        TextInputLayout textInputLayout = k8c.A02;
        DateFormat dateFormat = k8c.A05;
        Context context = textInputLayout.getContext();
        textInputLayout.A0d(0Pz.A0z(context.getString(2131961868), "\n", String.format(context.getString(2131961870), this.A01), "\n", String.format(context.getString(2131961869), AbI.A1E(dateFormat, LBq.A01().getTimeInMillis()))));
        k8c.A06.A00();
    }
}
