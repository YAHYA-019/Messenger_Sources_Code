package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.media.folder.LoadFolderParams;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.Ao0, reason: case insensitive filesystem */
/* loaded from: Ao0.class */
public final class C1622Ao0 extends 2UV implements CallerContextable {
    public static final CallerContext A04 = CallerContext.A06(C1622Ao0.class);
    public static final String __redex_internal_original_name = "LocalMediaFolderLoader";
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final D2f A03;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.D2f] */
    public C1622Ao0(1BO r302) {
        super(AbJ.A1D());
        this.A01 = 7zN.A0D(33031);
        this.A02 = 1BQ.A02(16476);
        this.A03 = new Object();
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ 2UW A02(Object obj) {
        2UW r0 = 2UV.A03;
        11T.A0I(r0, 4YT.A00(26));
        return r0;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A03(2UW r302, Object obj) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("load_folder_params_key", (LoadFolderParams) obj);
        1IB A0M = 4YU.A0M(A05, A04, 4YU.A0L(this.A01), "load_local_folders", true);
        return AbJ.A0t(this.A02, this.A03, A0M);
    }
}
