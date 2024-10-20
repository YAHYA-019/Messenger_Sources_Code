package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: F9e.class */
public final class F9e {
    public final C00i A00 = 1Bu.A00(67527);

    public static void A00(E1S e1s) {
        ((F9e) e1s.A09.get()).A02(e1s.getContext(), e1s.A06, ((BJB) e1s).A01, null);
    }

    public final void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, 2JX r305, MigColorScheme migColorScheme) {
        DialogInterface.OnClickListener onClickListener3 = onClickListener2;
        1BK.A1K(r305, 2, onClickListener2);
        String A0o = r305.A0o();
        String A0r = r305.A0r(3029410);
        2JY A0B = 1BK.A0B(r305, 2JX.class, -1817464817, 731666098);
        String str = null;
        String A0q = A0B != null ? A0B.A0q() : null;
        String A0t = A0B != null ? A0B.A0t(GraphQLStringDefUtil.A00(), "GraphQLFXCalFlowErrorDialogActionType", -1422950858) : null;
        2JY A0B2 = 1BK.A0B(r305, 2JX.class, 40167517, -760765151);
        String A0q2 = A0B2 != null ? A0B2.A0q() : null;
        String A0t2 = A0B2 != null ? A0B2.A0t(GraphQLStringDefUtil.A00(), "GraphQLFXCalFlowErrorDialogActionType", -1422950858) : null;
        2JY A0B3 = 1BK.A0B(r305, 2JX.class, -431758724, 354605114);
        if (A0B3 != null) {
            str = A0B3.A0q();
        }
        if (A0o == null || A0q == null || "UNSET_OR_UNRECOGNIZED_ENUM_VALUE".equals(A0t)) {
            A02(context, onClickListener3, migColorScheme, A0r);
            return;
        }
        boolean equals = "WEB_AUTH".equals(A0t);
        DialogInterface.OnClickListener onClickListener4 = onClickListener3;
        if (equals) {
            onClickListener4 = onClickListener;
        }
        if ("WEB_AUTH".equals(A0t2)) {
            onClickListener3 = onClickListener;
        }
        1BK.A1M(context, migColorScheme);
        this.A00.get();
        DR6 dr6 = new DR6(context, migColorScheme);
        dr6.A03(A0o);
        dr6.A0F(onClickListener4, A0q);
        if (A0r != null) {
            dr6.A0J(A0r);
        }
        if (A0q2 != null && onClickListener3 != null) {
            dr6.A0E(onClickListener3, A0q2);
        }
        if (str != null && onClickListener3 != null) {
            dr6.A0G(onClickListener3, str);
        }
        dr6.A0K(false);
        dr6.A05();
    }

    public final void A02(Context context, DialogInterface.OnClickListener onClickListener, MigColorScheme migColorScheme, String str) {
        11T.A0H(context, migColorScheme);
        A03(context, onClickListener, migColorScheme, context.getString(2131957335), str, DKF.A0o(context));
    }

    public final void A03(Context context, DialogInterface.OnClickListener onClickListener, MigColorScheme migColorScheme, String str, String str2, String str3) {
        1BK.A1M(context, migColorScheme);
        this.A00.get();
        DR6 dr6 = new DR6(context, migColorScheme);
        if (str3 != null) {
            dr6.A03(str);
            dr6.A0F(onClickListener, str3);
        }
        if (str2 != null) {
            dr6.A0J(str2);
        }
        dr6.A0K(false);
        dr6.A05();
    }
}
