package X;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Ln8.class */
public final class Ln8 implements Runnable {
    public static final String __redex_internal_original_name = "BondiBottomToolbar$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ L2k A01;

    public Ln8(View view, L2k l2k) {
        this.A01 = l2k;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        View view = this.A00;
        TextView A0F = DKF.A0F(view, 2131366951);
        View requireViewById = view.requireViewById(2131366950);
        View requireViewById2 = view.requireViewById(2131361995);
        LEJ.A00();
        A0F.setText(LEJ.A04());
        LEJ.A00();
        int i = 0;
        if (!LEJ.A03().booleanValue()) {
            i = 4;
        }
        requireViewById2.setVisibility(i);
        LEJ.A00();
        String str2 = "";
        if (Kbt.A00.A02() && (str = LEJ.A08) != null) {
            str2 = str;
        }
        Uri parse = Uri.parse(str2);
        C07004ik A0J = 7zR.A0J();
        ((C07014il) A0J).A03 = new C5em(2.0f, 0.0f, 2Me.A02.A03(requireViewById.getContext(), 2MR.A0p), false);
        C7uL.A00(parse, requireViewById, new C06974ih(A0J), CallerContext.A0B("BondiBottomToolbar"));
    }
}
