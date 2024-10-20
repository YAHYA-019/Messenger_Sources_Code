package com.facebook.messaging.avatar.stickersuggestions.repository;

import X.03Y;
import X.0DE;
import X.0DR;
import X.11T;
import X.1Br;
import X.1Bu;
import X.2Zo;
import X.2Zs;
import X.2Zy;
import X.2aK;
import X.7N2;
import X.AJG;
import X.AnonymousClass831;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0ty;
import X.C1A3;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: StickerSuggestionsRepository.class */
public final class StickerSuggestionsRepository {
    public final FbUserSession A00;
    public final 1Br A01;
    public final C01i A02;
    public final 2Zs A03;

    public StickerSuggestionsRepository(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        this.A03 = 2Zo.A03(true);
        this.A01 = 1Bu.A00(66486);
        this.A02 = C01g.A00(C03i.A02, new AnonymousClass831(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A00(com.facebook.messaging.model.threadkey.ThreadKey r302, java.util.List r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.stickersuggestions.repository.StickerSuggestionsRepository.A00(com.facebook.messaging.model.threadkey.ThreadKey, java.util.List, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r310v0 */
    /* JADX WARN: Type inference failed for: r310v1 */
    /* JADX WARN: Type inference failed for: r310v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List A01(ThreadKey threadKey, List list) {
        List list2;
        11T.A0F(threadKey, 0);
        11T.A0F(list, 1);
        C01i c01i = this.A02;
        if (!((7N2) c01i.getValue()).BSf()) {
            boolean A0z = threadKey.A0z();
            List BCb = ((7N2) c01i.getValue()).BCb(list);
            if (!(BCb instanceof Collection) || !BCb.isEmpty()) {
                Iterator it = BCb.iterator();
                while (it.hasNext()) {
                    if (((Boolean) ((03Y) it.next()).second).booleanValue()) {
                        2aK.A03((Integer) null, (0DE) null, new AJG(this, (0DR) null, 1, A0z), 2Zy.A01(this.A03), 3);
                    }
                }
            }
            list2 = new ArrayList(C1A3.A1D(BCb, 10));
            Iterator it2 = BCb.iterator();
            while (it2.hasNext()) {
                list2.add(((03Y) it2.next()).first);
            }
            return list2;
        }
        list2 = C0ty.A00;
        return list2;
    }
}
