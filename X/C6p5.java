package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.EphemeralMediaData;
import com.facebook.messaging.model.attachment.EphemeralMediaState;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6p5, reason: invalid class name */
/* loaded from: 6p5.class */
public final class C6p5 {
    public static final CallerContext A04 = CallerContext.A0B("EphemeralMediaOptimisticWriteHelper");
    public final 1Br A00;
    public final 1De A03;
    public final 1Br A02 = 1Bq.A00(16432);
    public final 1Br A01 = 1Bq.A00(16688);

    public C6p5(1De r302) {
        this.A03 = r302;
        this.A00 = 1Bu.A03(r302.A00, 33031);
    }

    public static final ImmutableList A00(EphemeralMediaState ephemeralMediaState, Collection collection) {
        Attachment attachment;
        EphemeralMediaData ephemeralMediaData;
        11T.A0F(collection, 0);
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ImmutableList immutableList = 4YU.A0V(it).A0r;
            if (immutableList != null && !immutableList.isEmpty() && (ephemeralMediaData = (attachment = (Attachment) 4YU.A0q(immutableList, 0)).A06) != null) {
                EphemeralMediaState ephemeralMediaState2 = ephemeralMediaData.A01;
                11T.A0A(ephemeralMediaState2);
                if (ephemeralMediaState2 != ephemeralMediaState && ((EphemeralMediaState.UNSEEN == ephemeralMediaState2 && EphemeralMediaState.SEEN == ephemeralMediaState) || EphemeralMediaState.EXPIRED == ephemeralMediaState)) {
                    48O r0 = new 48O(attachment);
                    r0.A06 = new EphemeralMediaData(ephemeralMediaState, ephemeralMediaData.A02, ephemeralMediaData.A00);
                    A0h.m11011add((Object) new Attachment(r0));
                }
            }
        }
        return 1Fj.A01(A0h);
    }

    public final void A01(FbUserSession fbUserSession, EphemeralMediaState ephemeralMediaState, ThreadKey threadKey, ImmutableList immutableList) {
        11T.A0F(fbUserSession, 0);
        11T.A0F(immutableList, 1);
        if (09K.A00(immutableList)) {
            Bundle A05 = 1BK.A05();
            A05.putStringArrayList(AbE.A00(770), 1BK.A17(immutableList));
            A05.putParcelable("thread_key", threadKey);
            A05.putString(AbE.A00(771), ephemeralMediaState.toString());
            1IB A00 = 1Ho.A00(((BlueServiceOperationFactory) 1Br.A0B(this.A00)).newInstance_DEPRECATED(1BJ.A00(2119), A05, 0, A04), true);
            11T.A0A(A00);
            1Br.A0D(this.A02, new D44(fbUserSession, this), A00);
        }
    }
}
