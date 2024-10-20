package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.MontageBucket;
import com.facebook.messaging.montage.model.MontageBucketKey;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: IV6.class */
public final class IV6 implements C5d8 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MontageViewerFragment A01;

    public IV6(MontageViewerFragment montageViewerFragment, long j) {
        this.A01 = montageViewerFragment;
        this.A00 = j;
    }

    @Override // X.C5d8
    public void C7S(6BY r302) {
        ICk iCk;
        ImmutableList immutableList = r302.A00.A00;
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            MontageBucketPreview montageBucketPreview = (MontageBucketPreview) immutableList.get(i);
            if (montageBucketPreview.A02.A00 != this.A00 && !montageBucketPreview.A0A) {
                this.A01.A0Y.m11011add((Object) montageBucketPreview);
            }
        }
        MontageViewerFragment montageViewerFragment = this.A01;
        ImmutableList build = montageViewerFragment.A0Y.build();
        if (build.isEmpty() || (iCk = montageViewerFragment.A0M) == null) {
            return;
        }
        iCk.A0A(new IAR(), iCk.A03());
        ArrayList A0s = AnonymousClass001.A0s();
        int size2 = build.size();
        for (int i2 = 0; i2 < size2; i2++) {
            4YU.A1W(A0s, ((MontageBucketPreview) build.get(i2)).A02.A00);
        }
        ICk iCk2 = montageViewerFragment.A0M;
        if (09K.A00(A0s)) {
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                C00i c00i = iCk2.A06;
                CIt cIt = (CIt) c00i.get();
                long longValue = number.longValue();
                FbUserSession fbUserSession = iCk2.A00;
                UserKey A01 = cIt.A01(fbUserSession, (MontageCard) null, longValue);
                iCk2.A09.add(new IAR(new MontageBucket(new MontageBucketKey(longValue), A01, null, ((CIt) c00i.get()).A03(fbUserSession, (MontageCard) null, A01, longValue), -1, false), 1));
            }
        }
        iCk2.A07();
        montageViewerFragment.A0h = false;
        montageViewerFragment.A0I.A09();
        C2803Gog c2803Gog = montageViewerFragment.A0H;
        if (c2803Gog != null) {
            c2803Gog.A1k(build);
        }
    }

    @Override // X.C5d8
    public void C7U(6BY r302) {
    }
}
