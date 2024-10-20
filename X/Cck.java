package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.marketplace.plugins.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cck.class */
public final class Cck implements 2RP {
    public MarketplaceFolderTabToolbarButtonImplementation A01;
    public Object A02;
    public final Context A03;
    public final 06Z A04;
    public final FbUserSession A05;
    public final 1pI A06;
    public final 2OO A07;
    public int A00 = -1;
    public final 1YC A08 = 1YC.A03;

    public Cck(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, 2OO r306) {
        this.A03 = context;
        this.A05 = fbUserSession;
        this.A04 = r303;
        this.A07 = r306;
        this.A06 = r305;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[Catch: Exception -> 0x009c, all -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x009c, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0074, B:16:0x007a, B:18:0x007f, B:19:0x0085, B:20:0x0089, B:20:0x0089, B:23:0x0095, B:26:0x0090, B:28:0x0068), top: B:4:0x0043, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[Catch: Exception -> 0x009c, all -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x009c, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0074, B:16:0x007a, B:18:0x007f, B:19:0x0085, B:20:0x0089, B:20:0x0089, B:23:0x0095, B:26:0x0090, B:28:0x0068), top: B:4:0x0043, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cck.A00():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r306v1 */
    /* JADX WARN: Type inference failed for: r306v4 */
    public List BEE() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A08;
        String A00 = 1BJ.A00(2);
        r0.A08(A00, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement);
        try {
            ?? r306 = this.A00;
            boolean z = r306;
            if (r306 == -1) {
                boolean A002 = A00();
                this.A00 = A002 ? 1 : 0;
                z = A002;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.marketplace.plugins.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation", "messaging.marketplace.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation", A00, andIncrement2, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", AbstractC00603o4.A00(3), "getTabToolbarButtonModel");
                    try {
                        MarketplaceFolderTabToolbarButtonImplementation marketplaceFolderTabToolbarButtonImplementation = this.A01;
                        int A01 = 4YV.A0I().A01(2MQ.A0A);
                        Context context = marketplaceFolderTabToolbarButtonImplementation.A00;
                        Drawable drawable = context.getDrawable(A01);
                        String string = context.getString(2131956671);
                        C1pq.A08("contentDescription", string);
                        if (drawable == null) {
                            throw 1BK.A0h();
                        }
                        2Rg A003 = 2Rg.A00(drawable);
                        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, A003);
                        A0t.add(new 2Rh((C2iw) null, (2QB) null, A003, (C1p8) null, (String) null, string, "Marketplace"));
                        r0.A09("messaging.marketplace.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.marketplace.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement2);
                    throw th;
                }
            }
            while (true) {
                int size = A0t.size();
                ?? r3062 = this.A00;
                boolean z2 = r3062;
                if (r3062 == -1) {
                    boolean A004 = A00();
                    this.A00 = A004 ? 1 : 0;
                    z2 = A004;
                }
                if (size >= z2) {
                    r0.A02((Exception) null, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement);
                    return A0t;
                }
                A0t.add(null);
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement);
            throw th2;
        }
    }

    public void BoY(View view, String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A08;
        String A00 = 1BJ.A00(2);
        r0.A08(A00, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onClick", andIncrement);
        Exception e = null;
        try {
            if (str.equals("Marketplace") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.marketplace.plugins.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation", "messaging.marketplace.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation", A00, andIncrement2, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", AbstractC00603o4.A00(3), "onClick");
                try {
                    try {
                        Context context = this.A01.A00;
                        ((9XC) 7zR.A0o(context, 68167)).A00(context, "https://www.facebook.com/marketplace/");
                        r0.A09("messaging.marketplace.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onClick", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.marketplace.marketplacefolder.toolbarbuttons.MarketplaceFolderTabToolbarButtonImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onClick", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onClick", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onClick", andIncrement);
            throw th2;
        }
    }

    public void C2M(1Iw r302, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A08;
        r0.A08(1BJ.A00(2), "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onInvisible", A00);
        r0.A06("messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onInvisible", A00);
    }

    public boolean C59(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A08;
        r0.A08(1BJ.A00(2), "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onLongClick", A00);
        r0.A06("messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onLongClick", A00);
        return false;
    }

    public void CUt(1Iw r302, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A08;
        r0.A08(1BJ.A00(2), "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onVisible", A00);
        r0.A06("messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onVisible", A00);
    }
}
