package X;

import com.google.android.material.textfield.TextInputLayout;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: Lor.class */
public final class Lor implements Runnable {
    public static final String __redex_internal_original_name = "DateFormatTextWatcher$2";
    public final /* synthetic */ long A00;
    public final /* synthetic */ K8C A01;

    public Lor(K8C k8c, long j) {
        this.A01 = k8c;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        K8C k8c = this.A01;
        TextInputLayout textInputLayout = k8c.A02;
        String str = k8c.A04;
        long j = this.A00;
        Calendar A01 = LBq.A01();
        Calendar A03 = LBq.A03((Calendar) null);
        A03.setTimeInMillis(j);
        int i = A01.get(1);
        int i2 = A03.get(1);
        textInputLayout.A0d(String.format(str, JR2.A0X(i == i2 ? "MMMd" : "yMMMd", Locale.getDefault(), j)));
        k8c.A06.A00();
    }
}
