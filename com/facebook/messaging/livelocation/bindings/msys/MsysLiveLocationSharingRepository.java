package com.facebook.messaging.livelocation.bindings.msys;

import X.0BY;
import X.11T;
import X.1BY;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1EZ;
import X.1Fw;
import X.1Lm;
import X.1Um;
import X.2Zs;
import X.2aN;
import X.4ZJ;
import X.5fT;
import X.7Vc;
import X.7Vj;
import X.C0Bx;
import X.Iah;
import X.Iao;
import X.JOe;
import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Map;

/* loaded from: MsysLiveLocationSharingRepository.class */
public final class MsysLiveLocationSharingRepository implements 7Vc {
    public 2Zs A00;
    public 2Zs A01;
    public final 1Br A02;
    public final 1Br A03;
    public final String A04;
    public final 1De A05;

    public MsysLiveLocationSharingRepository(1De r302) {
        this.A05 = r302;
        Map map = 0BY.A03;
        this.A04 = C0Bx.A01(MsysLiveLocationSharingRepository.class);
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 16428);
        this.A02 = 1Bu.A03(r0, 82710);
        this.A00 = 2aN.A00;
        this.A01 = 4ZJ.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A00(X.C6r4 r302, X.0DR r303, int r304) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.livelocation.bindings.msys.MsysLiveLocationSharingRepository.A00(X.6r4, X.0DR, int):java.lang.Object");
    }

    public void BAO(5fT r302, String str) {
        11T.A0F(str, 0);
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A07(1Fw.A04((1EZ) this.A03.A00.get()), this.A05.A00, 68859);
        long A00 = 7Vj.A00(str);
        Iah iah = new Iah(r302, this, 5);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(iah);
        if (AQV.Cj2(new Iao(2, A00, mailboxFeature, mailboxFutureImpl))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void D8X(JOe jOe, LiveLocationSharer liveLocationSharer, String str) {
        jOe.onSuccess();
    }
}
