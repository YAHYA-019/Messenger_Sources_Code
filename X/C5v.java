package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.publicchats.memberlist.model.ParticipantsListSource;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: C5v.class */
public final class C5v {
    public final Observer A00;
    public final 1Br A02;
    public final ThreadKey A03;
    public final AfS A04;
    public final Bgd A05;
    public final C01i A07 = C01g.A01(SHU.A00);
    public final C01i A06 = C01g.A01(SHT.A00);
    public final 1Br A01 = 7zM.A0Z();

    public C5v(Context context, ThreadKey threadKey) {
        this.A03 = threadKey;
        1Br A01 = 1Bu.A01(context, 147685);
        this.A02 = A01;
        1Br.A0C(A01);
        this.A04 = new AfS(context, 7zP.A0O(this.A01), threadKey);
        this.A00 = CaE.A00(this, ActionId.RTMP_CONNECTION_REQUESTED);
        this.A05 = new Bgd(this);
    }

    public final void A00(int i) {
        MutableLiveData mutableLiveData = this.A04;
        ParticipantsListSource participantsListSource = ((AfS) mutableLiveData).A00;
        ParticipantsListSource participantsListSource2 = i == 1 ? ParticipantsListSource.A02 : ParticipantsListSource.A03;
        if (participantsListSource != participantsListSource2) {
            ((AfS) mutableLiveData).A02 = "";
            ((AfS) mutableLiveData).A03 = true;
            ((AfS) mutableLiveData).A04 = false;
            ((AfS) mutableLiveData).A07.A00(mutableLiveData, C0ty.A00);
        }
        ((AfS) mutableLiveData).A00 = participantsListSource2;
        if (((AfS) mutableLiveData).A04 || !((AfS) mutableLiveData).A03) {
            return;
        }
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(((AfS) mutableLiveData).A05, 1Fw.A04(((AfS) mutableLiveData).A06), 68468);
        long A0r = ((AfS) mutableLiveData).A08.A0r();
        String str = ((AfS) mutableLiveData).A02;
        int i2 = ((AfS) mutableLiveData).A00.value;
        Rso rso = Rso.A00;
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, rso);
        1Um.A02(AQV, new Cza(A0Q, mailboxFeature, str, i2, 0, A0r), A0Q, false);
    }
}
