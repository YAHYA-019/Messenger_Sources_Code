package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.push.constants.PushProperty;
import java.util.List;

/* loaded from: Cos.class */
public final class Cos implements 7yC {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;
    public final CQo A05;

    public Cos(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 83865);
        this.A03 = AbG.A0Y();
        this.A01 = 1Bq.A00(83411);
        this.A02 = 1Bu.A03(r0, 17010);
        this.A05 = 7zR.A0a();
    }

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        C00i c00i;
        24X A0q;
        int A05 = 7zP.A05(r304, fbUserSession, 0);
        if (!AbI.A0a(this.A02).A00().A02() || (A0q = AbJ.A0q((c00i = this.A00.A00), r304)) == null) {
            return;
        }
        c00i.get();
        String A0H = JSONUtil.A0H(A0q.A0D("n"), null);
        ThreadKey A0Y = AbK.A0Y(fbUserSession, c00i, A0q);
        if (1Br.A0B(this.A03) != C0et.A0P || A0H == null) {
            return;
        }
        ((C5b4) 1Br.A0B(this.A01)).A00(A0H);
        CQo.A0F(BOn.A0J, this.A05, 7zU.A0h(A0Y), (String) null, (List) null, 04R.A05(7zO.A1b(TraceFieldType.MsgId, A0H, 1BK.A1G("recall_reason", "msg_unsend"))), ActionId.MISSED_EVENT, A05, 66, 3);
    }
}
