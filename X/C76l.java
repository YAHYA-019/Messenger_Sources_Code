package X;

import com.facebook.messaging.blocking.params.BlockUnblockParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.76l, reason: invalid class name */
/* loaded from: 76l.class */
public final class C76l implements 6xM {
    public C00i A00;
    public HashSet A01;
    public boolean A02;
    public final 06Z A03;
    public final ThreadKey A04;
    public final C6xN A05 = new C6xN();

    public C76l(C76j c76j) {
        ThreadKey threadKey = c76j.A01;
        threadKey.getClass();
        this.A04 = threadKey;
        06Z r0 = c76j.A00;
        r0.getClass();
        this.A03 = r0;
        this.A01 = c76j.A02;
    }

    private void A00(6RU r302) {
        if (this.A02) {
            return;
        }
        this.A00 = 1Bn.A06(r302.A00, 7EN.class, (Class) null);
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
        return "AboveComposerBannerBlockHandlerPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7AO) {
            Object obj = ((7AO) r305).A00;
            if (obj instanceof C5Sk) {
                A00(r304);
                C6xN c6xN = this.A05;
                11T.A0F(obj, 0);
                11T.A0F(c6xN, 1);
                c6xN.A00 = obj;
                return;
            }
        }
        if (r305 instanceof 7D3) {
            A00(r304);
            7D3 r0 = (7D3) r305;
            06Z r02 = this.A03;
            ThreadKey threadKey = this.A04;
            7EN r03 = (7EN) this.A00.get();
            C5Sk c5Sk = (C5Sk) this.A05.A00;
            11T.A0F(r0, 0);
            11T.A0F(r03, 3);
            11T.A0F(c5Sk, 4);
            C5vv AVC = r0.A00.AVC();
            if (AVC == C5vv.A08 || AVC == C5vv.A13) {
                ImmutableList immutableList = c5Sk.A04;
                11T.A0A(immutableList);
                C5fr c5fr = (C5fr) 0QD.A0D(immutableList);
                UserKey userKey = c5fr.A03;
                if (userKey == null) {
                    throw AnonymousClass001.A0N("Participant authorUserKey cannot be null");
                }
                String str = c5fr.A07;
                C1pq.A08(AbE.A00(496), str);
                String str2 = c5fr.A0A;
                if (str2 == null) {
                    str2 = "";
                }
                C1pq.A08(AbE.A00(727), str2);
                r03.A05(r02, new BlockUnblockParams(userKey, str, str2), 7lH.A00(threadKey, c5Sk), BNT.A0f);
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
