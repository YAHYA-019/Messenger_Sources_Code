package X;

import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.data.communitymessaging.memberlist.model.CommunityMemberListSource;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Cl8.class */
public final class Cl8 implements DGz {
    public final /* synthetic */ AlU A00;
    public final /* synthetic */ ArrayList A01;

    public Cl8(AlU alU, ArrayList arrayList) {
        this.A00 = alU;
        this.A01 = arrayList;
    }

    @Override // X.DGz
    public void BoP(D55 d55) {
        String str;
        if (d55 != null) {
            AlU alU = this.A00;
            if (!alU.A0L) {
                ArrayList arrayList = this.A01;
                int indexOf = arrayList.indexOf(d55);
                C00i c00i = alU.A0Y.A00;
                ((CQ4) c00i.get()).A06((DK4) null, AbF.A1A(d55.A04), "", indexOf, indexOf);
                if (indexOf >= alU.A00) {
                    CQ4 cq4 = (CQ4) c00i.get();
                    int i = alU.A00;
                    int i2 = indexOf + 1;
                    List subList = arrayList.subList(i, i2);
                    11T.A0A(subList);
                    ArrayList A0z = 1BL.A0z(subList);
                    Iterator it = subList.iterator();
                    while (it.hasNext()) {
                        A0z.add(((D55) it.next()).A04.A13);
                    }
                    cq4.A09(A0z, alU.A00);
                    alU.A00 = i2;
                }
            }
            User user = d55.A04;
            11T.A09(user);
            AlU.A0D(alU, d55.A03, user);
            return;
        }
        C3R9 c3r9 = new C3R9();
        AlU alU2 = this.A00;
        CommunityExtraData A1X = alU2.A1X();
        if (A1X == null) {
            throw 1BK.A0h();
        }
        c3r9.A01(A1X);
        CommunityMemberListSource communityMemberListSource = CommunityMemberListSource.A02;
        ParcelableSecondaryData A0w = AbG.A0w(communityMemberListSource, c3r9);
        1pI r0 = alU2.A03;
        if (r0 == null) {
            str = "contentViewManager";
        } else {
            ThreadKey threadKey = alU2.A0C;
            if (threadKey == null) {
                str = "threadKey";
            } else {
                1F9 r02 = alU2.A0B;
                if (r02 != null) {
                    AlU A00 = CFu.A00(r02, threadKey, A0w, true);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append('_');
                    r0.Czy(A00, 0Pz.A0W("CommunityMemberFragment", AnonymousClass001.A0a(communityMemberListSource, A0k)));
                    return;
                }
                str = "folderName";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.DGz
    public boolean C58(D55 d55) {
        return false;
    }
}
