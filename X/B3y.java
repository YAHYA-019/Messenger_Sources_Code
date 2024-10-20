package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: B3y.class */
public final class B3y extends 2QB {
    public int A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C01i A05;
    public final C01i A06;
    public final DFS A07;
    public final MigColorScheme A08;
    public final ImmutableList A09;

    public B3y(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A03 = 1BK.A0E();
        this.A04 = 1Bu.A00(33059);
        this.A05 = C01g.A01(new AQq(this, 0));
        this.A08 = 7zR.A0c(context);
        this.A02 = 1Bu.A00(83722);
        this.A07 = new CnG();
        this.A06 = C01g.A01(new AQq(this, 1));
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(A00("BusinessTools"));
        builder.addAll(A00("Catalog"));
        this.A09 = AbJ.A0s(builder, A00("AdsEntryPoint"));
    }

    private final ArrayList A00(String str) {
        return ((Bap) C1Y6.A00(this.A01, "com_facebook_messaging_nativepagereply_plugins_interfaces_toolstabiteminterface_ToolsTabItemInterfaceSpec", str, new Object[]{this.A05.getValue(), this.A07, this.A08, 1Br.A0B(this.A02)})).A00.AJy();
    }

    public void A06() {
        1Br.A09(this.A03).CcV((1HO) this.A06.getValue(), C2bv.A03(((FbUserSession) this.A05.getValue()).A02, ((ViewerContext) 1Br.A0B(this.A04)).mUserId));
        A04(new 2QC(A08(), "RED_WITH_TEXT"));
    }

    public void A07() {
        1Br.A09(this.A03).D63((1HO) this.A06.getValue(), C2bv.A03(((FbUserSession) this.A05.getValue()).A02, ((ViewerContext) 1Br.A0B(this.A04)).mUserId));
    }

    public final int A08() {
        1Du it = this.A09.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!1Br.A09(this.A03).AZn(C2bv.A04(((FbUserSession) this.A05.getValue()).A02, ((ViewerContext) 1Br.A0B(this.A04)).mUserId, ((BMC) it.next()).keyName), false)) {
                i++;
            }
        }
        this.A00 = i;
        return i;
    }
}
