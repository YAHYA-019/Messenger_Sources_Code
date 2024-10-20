package X;

import android.content.Context;
import com.facebook.messaging.communitymessaging.plugins.participation.participationcomposer.ParticipationComposerImplementation;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.payments.p2p.messenger.plugins.bloksactions.acceptrequestarmadillo.AcceptRequestArmadilloImplementation;
import java.util.concurrent.Executor;

/* loaded from: A0x.class */
public final class A0x implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public A0x(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A05 = obj;
        this.A03 = obj5;
        this.A07 = obj4;
        this.A06 = obj6;
        this.A04 = obj7;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        int integer;
        Executor A11;
        SBl sBk;
        Object obj2;
        if (this.A00 == 0) {
            ((CfG) this.A05).D2v();
            if (((5Qb) obj).A00 == 0 && ((22F) 7zO.A0p(this.A02)).A00(70, AnonymousClass001.A05(this.A03))) {
                DKT dkt = (DKT) 7zO.A0p(this.A01);
                ParticipationComposerImplementation participationComposerImplementation = (ParticipationComposerImplementation) this.A07;
                Context context = participationComposerImplementation.A00;
                06Z r0 = participationComposerImplementation.A01;
                CP0 cp0 = new CP0("com.bloks.www.bloks.messenger.groups.questionnaire");
                cp0.A05("thread_id", this.A06.toString());
                cp0.A05("group_id", String.valueOf(this.A04));
                DKT.A05(context, r0, dkt, cp0.A03(), 50, 100);
                return;
            }
            return;
        }
        1qX A0t = 7zL.A0t(obj);
        if (A0t == null || 1qX.A00(A0t) == 0 || (integer = A0t.mResultSet.getInteger(0, 1)) == 1) {
            return;
        }
        AcceptRequestArmadilloImplementation acceptRequestArmadilloImplementation = (AcceptRequestArmadilloImplementation) this.A07;
        1Uj r02 = (1Uj) this.A05;
        C21h c21h = acceptRequestArmadilloImplementation.A00;
        if (integer != 2) {
            if (c21h != null) {
                C21S.A01(c21h, r02);
                acceptRequestArmadilloImplementation.A00 = null;
            }
            String A0k = 7zP.A0k(A0t, 0);
            if (A0k != null) {
                if (02L.A0C(A0k, new String[]{"1834126", "1834025", "1834115"})) {
                    obj2 = this.A02;
                } else if (02L.A0C(A0k, new String[]{"1834105"})) {
                    obj2 = this.A04;
                }
                A11 = 4YV.A11(acceptRequestArmadilloImplementation.A01);
                sBk = new SBl((FHh) this.A01, (GJj) obj2);
            }
            obj2 = this.A03;
            A11 = 4YV.A11(acceptRequestArmadilloImplementation.A01);
            sBk = new SBl((FHh) this.A01, (GJj) obj2);
        } else {
            if (c21h != null) {
                C21S.A01(c21h, r02);
                acceptRequestArmadilloImplementation.A00 = null;
            }
            A11 = 4YV.A11(acceptRequestArmadilloImplementation.A01);
            sBk = new SBk((FHh) this.A01, (GJj) this.A06);
        }
        A11.execute(sBk);
    }
}
