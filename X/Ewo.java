package X;

import android.content.Context;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: Ewo.class */
public final class Ewo {
    public 1BY A00;
    public final C00i A02 = AbH.A0D();
    public final Context A01 = 7zP.A0J();

    public Ewo(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(TextView textView, String str, String str2, String str3, int i) {
        A01(textView, this.A01.getResources().getString(i), str, str2, str3);
    }

    public void A01(TextView textView, String str, String str2, String str3, String str4) {
        DKC.A1P(textView);
        ImmutableList of = ImmutableList.of((Object) str2);
        ImmutableList of2 = ImmutableList.of((Object) new C5nf(str3, str4));
        Preconditions.checkArgument(AnonymousClass001.A1Q(of.size(), of2.size()));
        Context context = this.A01;
        int A00 = FHl.A00(context);
        0Dc A0F = 7zS.A0F(context, str);
        for (int i = 0; i < of.size(); i++) {
            C5nf c5nf = (C5nf) of2.get(i);
            A0F.A05(new DOF(A00, 1, c5nf, this), 1BK.A14(of, i), (String) c5nf.A00, 33);
        }
        textView.setText(7zM.A0E(A0F));
    }
}
