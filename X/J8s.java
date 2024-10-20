package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.video.exoserviceclient.FbVpsController;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* loaded from: J8s.class */
public final class J8s extends C00q implements C00m {
    public final /* synthetic */ Context $c;
    public final /* synthetic */ Function1 $callback;
    public final /* synthetic */ boolean $suppressErrorToast;
    public final /* synthetic */ Uri $uri;
    public final /* synthetic */ String $videoId;
    public final /* synthetic */ IDb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8s(Context context, Uri uri, IDb iDb, String str, Function1 function1, boolean z) {
        super(0);
        this.this$0 = iDb;
        this.$c = context;
        this.$uri = uri;
        this.$videoId = str;
        this.$suppressErrorToast = z;
        this.$callback = function1;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        5Ly r0;
        final IDb iDb = this.this$0;
        final Context context = this.$c;
        final Uri uri = this.$uri;
        final String str = this.$videoId;
        final boolean z = this.$suppressErrorToast;
        final Function1 function1 = this.$callback;
        11T.A0H(context, uri);
        11T.A0F(function1, 4);
        if (11T.A0O(uri.getScheme(), DGWRegionHintManager.SERVICE_KEY_MSYS)) {
            5L4 r02 = ((FbVpsController) 1Br.A0B(iDb.A01)).A0S;
            if (r02 == null || (r0 = r02.A02) == null || r0.A03 == null) {
                ((C4Eo) 1Br.A0B(iDb.A05)).A01(uri, new ITp(context, uri, iDb, str, function1, z));
            } else {
                File A0C = ((AnonymousClass536) 1Br.A0B(iDb.A08)).A0C("backing_file_copy", ".tmp");
                if (A0C == null) {
                    if (!z) {
                        IDb.A03(context, iDb);
                    }
                    function1.invoke(4YW.A0A("reason for failure", "Unable to create temp file", 1BK.A1G("save result", "false")));
                } else {
                    iDb.A0A.A00(uri, new Ihe(context, iDb, A0C, str, function1, z), A0C);
                }
            }
        } else {
            ListenableFuture A01 = J5V.A01(AbJ.A0u(iDb.A06), iDb, uri, 39);
            11T.A0A(A01);
            final int i = 1;
            1Kd.A0E(new 1K9(context, uri, iDb, function1, str, i, z) { // from class: X.4Wd
                public final int A00;
                public final Object A01;
                public final Object A02;
                public final Object A03;
                public final Object A04;
                public final String A05;
                public final boolean A06;

                {
                    this.A00 = i;
                    this.A04 = iDb;
                    this.A01 = context;
                    this.A03 = uri;
                    this.A05 = str;
                    this.A06 = z;
                    this.A02 = function1;
                }

                public void onFailure(Throwable th) {
                    if (this.A00 != 0) {
                        if (this.A06) {
                            return;
                        }
                        IDb.A03((Context) this.A01, (IDb) this.A04);
                    } else {
                        0fH.A14(C4QQ.__redex_internal_original_name, "RegisterPushToken %s failed %s with view context override is %b", new Object[]{this.A05, th.getMessage(), Boolean.valueOf(this.A06)});
                        C4QQ c4qq = (C4QQ) this.A01;
                        c4qq.A01.C2v(c4qq.A05((1OZ) this.A04, (4rF) c4qq.A04.get(), C4QQ.__redex_internal_original_name, th));
                    }
                }

                public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    if (this.A00 != 0) {
                        IDb.A00((Context) this.A01, (Uri) this.A03, (HnA) obj, (IDb) this.A04, this.A05, (Function1) this.A02, this.A06, false);
                        return;
                    }
                    0fH.A0d(this.A05, Boolean.valueOf(this.A06), C4QQ.__redex_internal_original_name, "RegisterPushToken %s succeed with view context override is %b.");
                    C4QQ c4qq = (C4QQ) this.A01;
                    FbUserSession fbUserSession = (FbUserSession) this.A03;
                    4rF r03 = (4rF) c4qq.A04.get();
                    c4qq.A01.C2v(!4AY.A02(fbUserSession, (OperationResult) obj, (4AN) this.A02, (1OZ) this.A04, r03, C4QQ.__redex_internal_original_name));
                }
            }, A01);
        }
        return 04S.A00;
    }
}
