package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ExecutionException;

/* loaded from: Cv9.class */
public final class Cv9 implements DHg {
    public static final Function A01 = new D3I(32);
    public 1BY A00;

    @Override // X.DHg
    public 2FT Ahh(FbUserSession fbUserSession, ThreadKey threadKey, String str) {
        Cbd cbd = (Cbd) 1Lo.A04((Context) null, fbUserSession, this.A00, 84719);
        long parseLong = Long.parseLong(str);
        1FV A0j = 4YU.A0j();
        ImmutableList.Builder builder = ImmutableList.builder();
        try {
            5Xd A00 = Cbd.A00(cbd);
            long A0r = threadKey.A0r();
            Long valueOf = Long.valueOf(parseLong);
            1Um AQV = A00.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new Czh(A0P, A00, valueOf, 34, A0r), A0P, false);
            1qX A0t = 7zL.A0t(A0P.get());
            if (A0t == null) {
                0fH.A0k(Cbd.__redex_internal_original_name, "devices is null");
            } else {
                for (int i = 0; i < 1qX.A00(A0t); i++) {
                    if (A0t.mResultSet.getString(i, 1) == null) {
                        0fH.A0k(Cbd.__redex_internal_original_name, StringFormatUtil.formatStrLocaleSafe("no device instance id in row: %d", Integer.valueOf(i)));
                    } else {
                        byte[] A012 = CBF.A01(new D14(4YU.A11(A0t, i, 1), valueOf));
                        A012.getClass();
                        builder.m11011add((Object) A012);
                    }
                }
            }
            AbG.A1V(builder, A0j);
            return 2FP.A01(A01, A0j);
        } catch (InterruptedException | ExecutionException e) {
            C1UI.A01(Cbd.__redex_internal_original_name, "Failed to load secure message devices from msys db");
            throw new RuntimeException("Failed to load secure message devices from msys db", e);
        }
    }

    @Override // X.DHg
    public Integer Apo() {
        return 0S2.A01;
    }
}
