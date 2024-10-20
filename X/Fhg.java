package X;

import android.util.Pair;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhg.class */
public final class Fhg implements 1Ro {
    public static final String __redex_internal_original_name = "MemoryDumpUploadMethod";
    public final long A00;
    public final long A01;
    public final boolean A02;

    public Fhg(long j, long j2, boolean z) {
        this.A02 = z;
        this.A01 = j;
        this.A00 = j2;
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Qxb qxb = (Qxb) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Pair pair : qxb.A01) {
            A0s.add(new BasicNameValuePair((String) pair.first, ((CharSequence) pair.second).toString()));
        }
        File file = qxb.A00;
        C4C4 c4c4 = new C4C4(this.A02 ? new C2584Ghx(file, AnonymousClass000.A00(2), file.getName(), this.A01, this.A00) : new DpJ(file, AnonymousClass000.A00(2), file.getName()), "file");
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "hprofUpload");
        A0T.A0F = "me/hprof";
        A0T.A0J = A0s;
        Integer num = 0S2.A01;
        A0T.A06 = num;
        A0T.A0I = ImmutableList.of((Object) c4c4);
        A0T.A07 = num;
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return Boolean.valueOf(DKE.A1a(AbH.A0w(anonymousClass439), OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS));
    }
}
