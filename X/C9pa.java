package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9pa, reason: invalid class name */
/* loaded from: 9pa.class */
public final class C9pa implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C9pa(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A02 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = 0FI.A05(138937125);
                3vU.A06((BOj) this.A02, (3vU) this.A03, "learn_more", 11);
                C77c c77c = (C77c) this.A04;
                Context A06 = 7zN.A06(this.A01);
                String BCz = 1qI.A02(C77c.A03(c77c)).BCz(36885746074584664L, "https://www.facebook.com/help/messenger-app/667776101667447?ref=ipl");
                11T.A0A(BCz);
                C77c.A06(A06, c77c, null, BCz, false);
                i = 899884198;
                break;
            case 1:
                A05 = 0FI.A05(-2144643874);
                ((6Il) this.A03).CX7((FbUserSession) this.A04, (Context) this.A02);
                i = -1097011154;
                break;
            case 2:
                A05 = 0FI.A05(442269718);
                ((6Il) this.A03).CX7((FbUserSession) this.A04, (Context) this.A02);
                i = 1838475884;
                break;
            default:
                A05 = 0FI.A05(1453750148);
                ((6Il) this.A03).CX7((FbUserSession) this.A04, (Context) this.A02);
                i = 1507510966;
                break;
        }
        0FI.A0B(i, A05);
    }
}
