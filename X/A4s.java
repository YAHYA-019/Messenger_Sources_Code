package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Preconditions;

/* loaded from: A4s.class */
public final class A4s implements 76D {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Context A04;
    public final 1De A05;

    public A4s(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 16428);
        this.A00 = 1Bu.A03(r0, 67778);
        Context A0I = 7zQ.A0I(r0);
        this.A04 = A0I;
        this.A02 = 1HG.A00(A0I, 65898);
        this.A01 = 1Bq.A00(67858);
    }

    public Message A4v(ThreadKey threadKey, C5fv c5fv) {
        11T.A0H(c5fv, threadKey);
        FbUserSession A03 = 1Br.A03(this.A03);
        if (c5fv instanceof 5gP) {
            5gP r0 = (5gP) c5fv;
            String str = r0.A01;
            if (!6Bl.A04(str)) {
                return null;
            }
            CQl cQl = (CQl) 1Br.A0B(this.A02);
            String str2 = r0.A0B;
            if (str2 == null) {
                str2 = 53F.A00(this.A01);
            }
            Preconditions.checkNotNull(str2, "Attempting to create without offline threading id");
            return cQl.A0G(A03, threadKey, new Bv5(null, null, str, str2, null));
        }
        if (!(c5fv instanceof 5gC)) {
            return null;
        }
        5gC r02 = (5gC) c5fv;
        if (!r02.A04) {
            return null;
        }
        CQl cQl2 = (CQl) 1Br.A0B(this.A02);
        String str3 = r02.A03;
        String str4 = r02.A0B;
        if (str4 == null) {
            str4 = 53F.A00(this.A01);
        }
        String str5 = ((5uJ) 1Br.A0B(this.A00)).A01(r02.A00).textSize;
        Preconditions.checkNotNull(str4, "Attempting to create without offline threading id");
        return CQl.A06(A03, threadKey, cQl2, new Bv5(str5, str3, null, str4, null));
    }
}
