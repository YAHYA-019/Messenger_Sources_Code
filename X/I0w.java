package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: I0w.class */
public final class I0w {
    public static final CallerContext A00 = CallerContext.A0B("[MP] LegacyAttachmentFrescoDelegator");

    public 1xH A00(Uri uri, HB4 hb4, JIG jig) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("trying to load from cache for ");
        A0k.append(uri);
        0fH.A0j("[MP] LegacyAttachmentFrescoDelegator", AnonymousClass001.A0Z(hb4, ", cacheLevel: ", A0k));
        int ordinal = hb4.ordinal();
        C2r8 c2r8 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? C2r8.BITMAP_MEMORY_CACHE : C2r8.ENCODED_MEMORY_CACHE : C2r8.DISK_CACHE : C2r8.FULL_FETCH;
        2IA A01 = 2IA.A01(uri);
        A01.A0B = c2r8;
        2Dp A04 = A01.A04();
        11T.A0D(A04);
        1xH r0 = new 1xH();
        2Cb.A01().A0B().A0A(A04, A00).D3K(new C2500Gfg(r0, jig), 1JU.A01);
        return r0;
    }
}
