package X;

import android.widget.TextView;

/* loaded from: Llm.class */
public final class Llm implements Runnable {
    public static final String __redex_internal_original_name = "ECPBottomSheetContentFragment$updateLoadingTextRunnable$1";
    public final /* synthetic */ JxS A00;

    public Llm(JxS jxS) {
        this.A00 = jxS;
    }

    @Override // java.lang.Runnable
    public void run() {
        JxS jxS = this.A00;
        TextView textView = jxS.A02;
        if (textView != null) {
            textView.setText(jxS.A0X[jxS.A00].intValue());
        }
        jxS.A00 = (jxS.A00 + 1) % jxS.A0X.length;
        jxS.A0F.postDelayed(this, 3000L);
    }
}
