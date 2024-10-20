package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;

/* renamed from: X.3gr, reason: invalid class name */
/* loaded from: 3gr.class */
public final class C3gr implements Runnable {
    public static final String __redex_internal_original_name = "MarkFolderSeenHelper$markFolderSeen$1";
    public final /* synthetic */ 6EM A00;
    public final /* synthetic */ 1F9 A01;

    public C3gr(6EM r302, 1F9 r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final 6EM r0 = this.A00;
        final 1F9 r02 = this.A01;
        ((1FP) 1Br.A0B(r0.A02)).D3D(3Ds.A02, 0S2.A00, new Runnable() { // from class: X.3gs
            public static final String __redex_internal_original_name = "MarkFolderSeenHelper$submitMarkFolderSeen$1";

            @Override // java.lang.Runnable
            public final void run() {
                6EM r03 = r0;
                1F9 r04 = r02;
                0fH.A0j("MarkFolderSeenHelper", "markFolderSeenInternal");
                Bundle A05 = 1BK.A05();
                A05.putString("folderName", r04.dbName);
                1IB A00 = 1Ho.A00(((BlueServiceOperationFactory) 1Br.A0B(r03.A03)).newInstance_DEPRECATED("mark_folder_seen", A05, CallerContext.A06(r03.getClass())), true);
                11T.A0A(A00);
                1Br.A0D(r03.A05, new AC8(r03, 30), A00);
            }
        }, "markFolderSeen");
    }
}
