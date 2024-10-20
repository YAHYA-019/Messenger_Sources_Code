package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFeature;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8v6, reason: invalid class name */
/* loaded from: 8v6.class */
public final class C8v6 extends BJB {
    public static final String __redex_internal_original_name = "TypingIndicatorControlFragment";
    public FbUserSession A00;
    public By5 A01;
    public C8yr A02;
    public boolean A03;
    public String A04;
    public final 1Br A05 = 7zM.A0O();
    public final 1Br A06 = 7zM.A0T();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r304 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.A1S(r1)
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = X.1BM.A01(r0)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r304 = r0
            java.lang.String r0 = "session_id"
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L25
            r0 = r304
            r1 = r303
            java.lang.String r0 = r0.getString(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L29
        L25:
            java.lang.String r0 = X.1BK.A0t()
            r304 = r0
        L29:
            r0 = r304
            X.11T.A0D(r0)
            r0 = r302
            if (r0 == 0) goto L3d
            r0 = r302
            r1 = r303
            java.lang.String r0 = r0.getString(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r303
            r304 = r0
        L3d:
            r0 = r301
            r1 = r304
            r0.A04 = r1
            X.9bw r0 = new X.9bw
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r304
            r1 = 2131963736(0x7f132f58, float:1.9564234E38)
            r0.A01 = r1
            r0 = r304
            r1 = r301
            r2 = 102(0x66, float:1.43E-43)
            X.By5 r0 = X.C9zj.A00(r0, r1, r2)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8v6.A1S(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        Context context = getContext();
        if (lithoView == null || context == null) {
            return;
        }
        A1b();
        1Iw A0W = 7zL.A0W(context);
        MigColorScheme migColorScheme = ((BJB) this).A01;
        11T.A0A(migColorScheme);
        QGf qGf = new QGf(C9ye.A01(this, 74), migColorScheme, this.A03);
        By5 by5 = this.A01;
        if (by5 != null) {
            lithoView.A0x(A1Z(qGf, A0W, by5));
        } else {
            11T.A0L("titleBarParams");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -954990529);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        new MailboxFeature((1Uj) 7zN.A0m(this, fbUserSession, 16686)).A00().addResultCallback(4YV.A11(this.A05), new A1d((Function1) new AVE(this, 1), ActionId.MQTT_CONNECTING));
        A1c();
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(2060784845, A04);
        return A0J;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-15765946);
        super/*X.DZJ*/.onDestroyView();
        C8yr c8yr = this.A02;
        if (c8yr != null) {
            c8yr.D5r();
        }
        this.A02 = null;
        0FI.A08(1942776479, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.DZJ*/.onSaveInstanceState(bundle);
        String str = this.A04;
        if (str == null) {
            11T.A0L("sessionId");
            throw 0Q8.createAndThrow();
        }
        bundle.putString("session_id", str);
    }
}
