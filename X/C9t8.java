package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9t8, reason: invalid class name */
/* loaded from: 9t8.class */
public final class C9t8 implements DEh {
    public final /* synthetic */ 8Gj A00;

    public C9t8(8Gj r302) {
        this.A00 = r302;
    }

    @Override // X.DEh
    public void C2d(8LD r302, ThreadKey threadKey, int i) {
        11T.A0F(threadKey, 0);
        11T.A0F(r302, 0);
        Integer num = r302.A0C ? 0S2.A0Y : r302.A0B ? 0S2.A0j : 0S2.A0u;
        8Gj r0 = this.A00;
        Context requireContext = r0.requireContext();
        06Z r02 = r0.mFragmentManager;
        11T.A0A(r02);
        C9d9.A00(requireContext, r02, r302, threadKey, num, i);
    }
}
