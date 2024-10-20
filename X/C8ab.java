package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8ab, reason: invalid class name */
/* loaded from: 8ab.class */
public final class C8ab extends 1LH {
    public final 06Z A00;
    public final 5zD A01;
    public final ThreadKey A02;
    public final 63D A03;
    public final ImmutableList A04;

    public C8ab(06Z r302, 5zD r303, ThreadKey threadKey, 63D r305, ImmutableList immutableList) {
        this.A01 = r303;
        this.A02 = threadKey;
        this.A04 = immutableList;
        this.A03 = r305;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1ro c1ro = C1ro.FLEX_END;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A04.iterator();
        int i = 0;
        while (true) {
            final int i2 = i;
            if (!it.hasNext()) {
                return new 2cL((C1ro) null, c1ro, (C1rp) null, (EnumC00743oh) null, A0s, false);
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            final QuickReplyItem quickReplyItem = (QuickReplyItem) next;
            final 5zD r0 = this.A01;
            final ThreadKey threadKey = this.A02;
            11T.A0D(quickReplyItem);
            final 63D r02 = this.A03;
            final 06Z r03 = this.A00;
            A0s.add(new 1LH(r03, r0, quickReplyItem, threadKey, r02, i2) { // from class: X.8bq
                public final int A00;
                public final 06Z A01;
                public final QuickReplyItem A02;
                public final ThreadKey A03;
                public final 63D A04;
                public final 5zD A05;

                {
                    1BL.A1H(r0, threadKey, quickReplyItem);
                    1BL.A1G(r02, r03);
                    this.A05 = r0;
                    this.A03 = threadKey;
                    this.A02 = quickReplyItem;
                    this.A00 = i2;
                    this.A04 = r02;
                    this.A01 = r03;
                }

                public 1LI A0s(C2k5 c2k52) {
                    11T.A0F(c2k52, 0);
                    C2lh A00 = C2lc.A00(c2k52, ALr.A00);
                    1Iw r04 = c2k52.A05;
                    FbUserSession A01 = 1Fw.A01(r04.A0D);
                    2lQ r05 = 2lO.A02;
                    2lO A0Z = 7zQ.A0Z(7zS.A0b(7zS.A0g(0S2.A06, 3yH.A02(c2k52)), 0S2.A1G, new ARN(18, this, c2k52, A01, A00)), 0S2.A00, new AVI(46, c2k52, A00, this));
                    C2sn A0U = 7zQ.A0U(r04);
                    2KD A0r = 7zL.A0r(A0U, 0);
                    7zN.A1V(this.A05, A0r);
                    A0r.A2z(this.A02.A0B);
                    A0r.A2b();
                    A0r.A2n();
                    7zN.A1Q(A0U, A0r);
                    return C2so.A0L(A0U, c2k52, A0Z);
                }
            });
            i = i3;
        }
    }
}
