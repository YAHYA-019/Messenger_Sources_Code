package X;

import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: A4x.class */
public final class A4x implements 72G {
    public final 9XK A00;
    public final Context A01;
    public final 2JX A02;

    public A4x(Context context, 2JX r303, 9XK r304) {
        this.A01 = context;
        this.A02 = r303;
        this.A00 = r304;
    }

    public void CiX(C5fv c5fv) {
    }

    public void Ckr(AnonymousClass539 anonymousClass539, C5fv c5fv, String str, String str2) {
        String A0r;
        11T.A0F(c5fv, 0);
        Context context = this.A01;
        9Tp r0 = (9Tp) 1Lm.A05(context, 4YV.A0F(context), 67689);
        String str3 = ((5gC) c5fv).A03;
        int length = str3.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1Z = 7zT.A1Z(str3, i2);
            if (z) {
                if (!A1Z) {
                    break;
                } else {
                    length--;
                }
            } else if (A1Z) {
                i++;
            } else {
                z = true;
            }
        }
        String obj = str3.subSequence(i, length + 1).toString();
        this.A00.A00.onBackPressed();
        2JX r02 = this.A02;
        AC8 A00 = AC8.A00(this, 39);
        11T.A0F(obj, 2);
        String A0k = r02.A0k();
        if (A0k == null || (A0r = r02.A0r(-1315071412)) == null) {
            return;
        }
        9RA r03 = r0.A04;
        7zV.A13(r03, 1BK.A0n(A0k), 1Br.A02(r03.A01), "biim_private_reply_send_click");
        GraphQlQueryParamSet A0M = 7zL.A0M();
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, A0r, "comment_id");
        07S.A00(A0J, A0r, "activity_id");
        07S.A00(A0J, obj, "message_body");
        4YV.A1A(A0J, A0M, "input");
        5Dh A002 = 5Dh.A00(A0M, new C01643sd(Q8V.class, "PrivateReplyCommentReplyMutation", null, "input", "fbandroid", 1165681781, 384, 3823756330L, 3823756330L, false, true));
        C9fd c9fd = (C9fd) 4YU.A0n(r0.A00, r0.A01, 68276);
        c9fd.A02.add(A0k);
        C9fd.A00(c9fd);
        1Br.A0D(r0.A02, new AC5(A00, r0, c9fd, A0k, 0), ((AbstractC05414dq) 1Hv.A02(context, 49184)).A06(A002));
    }
}
