package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.7sV, reason: invalid class name */
/* loaded from: 7sV.class */
public final class C7sV {
    public Integer A00;
    public Long A01;
    public final 1Br A02;
    public final 1Br A03;
    public final FbUserSession A04;

    public C7sV(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A04 = fbUserSession;
        this.A03 = 1Lm.A01(fbUserSession, 81922);
        this.A02 = 1Bq.A00(68333);
    }

    public final void A00(Integer num, long j) {
        Object obj;
        synchronized (this) {
            CC4 cc4 = (CC4) 1Br.A0B(this.A03);
            switch (num.intValue()) {
                case 0:
                    obj = "subthread_xma";
                    break;
                case 1:
                    obj = "subthread_row";
                    break;
                case 2:
                    obj = "parent_message_menu";
                    break;
                case 3:
                    obj = "creation_success_followup";
                    break;
                default:
                    obj = "subthread_reply_notif";
                    break;
            }
            CC4.A00(BLu.A02, cc4).A01(1BK.A1D("entrypoint", obj), j);
            this.A01 = Long.valueOf(j);
            this.A00 = num;
        }
    }
}
