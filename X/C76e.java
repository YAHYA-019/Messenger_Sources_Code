package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.76e, reason: invalid class name */
/* loaded from: 76e.class */
public final class C76e implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final ThreadKey A02;

    public C76e(C76d c76d) {
        ThreadKey threadKey = c76d.A00;
        threadKey.getClass();
        this.A02 = threadKey;
        this.A00 = c76d.A01;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7D3.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "LinkCtaActionPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        String str;
        if (r305 instanceof 7D3) {
            if (!this.A01) {
                this.A01 = true;
            }
            ThreadKey threadKey = this.A02;
            7D3 r0 = (7D3) r305;
            11T.A0F(r304, 0);
            11T.A0F(r0, 2);
            7fE r02 = r0.A00;
            if (r02 instanceof 7fE) {
                11T.A0I(r02, "null cannot be cast to non-null type com.facebook.xapp.messaging.calltoaction.externallink.ExternalLinkCallToAction");
                7fE r03 = r02;
                String str2 = r03.A01;
                if (str2 == null || str2.length() == 0) {
                    return;
                }
                if (r03.A00.ordinal() == 9) {
                    1BV A00 = 1BV.A00(99674);
                    if (threadKey.A0w()) {
                        str = "messenger_encrypted_group_thread";
                    } else if (threadKey.A0x()) {
                        str = "messenger_encrypted_direct_thread";
                    } else if (threadKey.A19()) {
                        str = "messenger_tincan_direct_thread";
                    }
                    F4K.A00(KPP.A02, (F4K) A00.get(), (Long) null, (String) null, str, 2);
                }
                ((C68t) 1Bi.A03(49965)).A0E(r304.A00, 4YU.A0F(str2));
            }
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
