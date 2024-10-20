package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.75y, reason: invalid class name */
/* loaded from: 75y.class */
public final class C75y implements 6xM {
    public C00i A00;
    public HashSet A01;
    public boolean A02;
    public final Context A03;
    public final FbUserSession A04;
    public final ThreadKey A05;
    public final C6xN A06 = new C6xN();

    public C75y(C75x c75x) {
        ThreadKey threadKey = c75x.A02;
        threadKey.getClass();
        this.A05 = threadKey;
        Context context = c75x.A00;
        context.getClass();
        this.A03 = context;
        FbUserSession fbUserSession = c75x.A01;
        fbUserSession.getClass();
        this.A04 = fbUserSession;
        this.A01 = c75x.A03;
    }

    private void A00(6RU r302) {
        if (this.A02) {
            return;
        }
        this.A00 = 1Bn.A06(r302.A00, C5y6.class, (Class) null);
        this.A02 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A01;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7AO.class, 7D3.class));
            this.A01 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "RestrictorComposerActionMenuPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7AO) {
            Object obj = ((7AO) r305).A00;
            if (obj instanceof C5Sk) {
                A00(r304);
                ThreadKey threadKey = this.A05;
                FbUserSession fbUserSession = this.A04;
                Context context = this.A03;
                Object obj2 = this.A00.get();
                C6xN c6xN = this.A06;
                11T.A0F(obj, 0);
                11T.A0F(obj2, 4);
                11T.A0F(c6xN, 5);
                c6xN.A00 = obj;
                new C5y7(context, fbUserSession).A00(threadKey);
                return;
            }
        }
        if (r305 instanceof 7D3) {
            A00(r304);
            7D3 r0 = (7D3) r305;
            FbUserSession fbUserSession2 = this.A04;
            ThreadKey threadKey2 = this.A05;
            C5Sk c5Sk = (C5Sk) this.A06.A00;
            11T.A0F(r304, 0);
            11T.A0F(r0, 1);
            if (c5Sk == null || r0.A00.AVC() != C5vv.A15) {
                return;
            }
            ImmutableList immutableList = c5Sk.A04;
            11T.A0A(immutableList);
            C5fr c5fr = (C5fr) 0QD.A0E(immutableList);
            if (c5fr != null) {
                String str = c5fr.A06;
                11T.A0A(str);
                Long A0e = 0CW.A0e(str);
                if (A0e != null) {
                    long longValue = A0e.longValue();
                    String str2 = c5fr.A07;
                    11T.A0A(str2);
                    ((I9B) 1Lm.A05(r304.A00, fbUserSession2, 82499)).A03(new C2623GjD(BOp.A0S, threadKey2, null, str2, ActionId.MISSED_EVENT, longValue));
                }
            }
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(r303);
    }
}
