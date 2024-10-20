package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.nativepagereply.plugins.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation;
import com.facebook.messaging.nativepagereply.plugins.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccl.class */
public final class Ccl implements 2RP {
    public CameraButtonLoadingScreenImplementation A01;
    public ComposerButtonLoadingScreenImplementation A02;
    public Object A03;
    public Object A04;
    public final Context A05;
    public final 06Z A06;
    public final FbUserSession A07;
    public final 1pI A08;
    public final 2OO A09;
    public int A00 = -1;
    public final 1YC A0A = 1YC.A03;

    public Ccl(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, 2OO r306) {
        this.A05 = context;
        this.A07 = fbUserSession;
        this.A06 = r303;
        this.A09 = r306;
        this.A08 = r305;
    }

    private boolean A00() {
        Object obj;
        if (this.A03 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0A;
            r0.A0B("com.facebook.messaging.nativepagereply.plugins.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", "messaging.nativepagereply.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", 1BJ.A00(2), "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1S(r0, atomicInteger)) {
                        this.A01 = new CameraButtonLoadingScreenImplementation(this.A05);
                        obj = C1Y6.A02;
                    } else {
                        obj = C1Y6.A03;
                    }
                    this.A03 = obj;
                    r0.A07("messaging.nativepagereply.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A03 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.nativepagereply.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", andIncrement, 1BL.A1U(this.A03));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.nativepagereply.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", andIncrement, 1BL.A1U(this.A03));
                throw th;
            }
        }
        return 1BK.A1U(this.A03);
    }

    private boolean A01() {
        Object obj;
        if (this.A04 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0A;
            r0.A0B("com.facebook.messaging.nativepagereply.plugins.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", "messaging.nativepagereply.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", 1BJ.A00(2), "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1S(r0, atomicInteger)) {
                        this.A02 = new ComposerButtonLoadingScreenImplementation(this.A05);
                        obj = C1Y6.A02;
                    } else {
                        obj = C1Y6.A03;
                    }
                    this.A04 = obj;
                    r0.A07("messaging.nativepagereply.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A04 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.nativepagereply.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", andIncrement, 1BL.A1U(this.A04));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.nativepagereply.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", andIncrement, 1BL.A1U(this.A04));
                throw th;
            }
        }
        return 1BK.A1U(this.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v133, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int] */
    /* JADX WARN: Type inference failed for: r0v90, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r311v0 */
    /* JADX WARN: Type inference failed for: r311v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    public List BEE() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0A;
        String A00 = 1BJ.A00(2);
        r0.A08(A00, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement);
        try {
            ?? r311 = this.A00;
            boolean z = r311;
            if (r311 == -1) {
                boolean A002 = A00();
                boolean z2 = A002;
                if (A01()) {
                    z2 = (A002 ? 1 : 0) + 1;
                }
                this.A00 = z2 ? 1 : 0;
                z = z2;
            }
            ArrayList A0t = AnonymousClass001.A0t(z ? 1 : 0);
            try {
                if (A00()) {
                    z = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", "messaging.nativepagereply.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", A00, z ? 1 : 0, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", "getTabToolbarButtonModel");
                    try {
                        CameraButtonLoadingScreenImplementation cameraButtonLoadingScreenImplementation = this.A01;
                        int A01 = 4YV.A0I().A01(2MQ.A0i);
                        Context context = cameraButtonLoadingScreenImplementation.A00;
                        String string = context.getString(2131953738);
                        C1pq.A08("contentDescription", string);
                        Drawable drawable = context.getDrawable(A01);
                        if (drawable == null) {
                            throw 1BK.A0h();
                        }
                        2Rg A003 = 2Rg.A00(drawable);
                        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, A003);
                        A0t.add(new 2Rh((C2iw) null, (2QB) null, A003, (C1p8) null, (String) null, string, "CameraButton"));
                        r0.A09("messaging.nativepagereply.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", z ? 1 : 0);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A01()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", "messaging.nativepagereply.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", A00, andIncrement2, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", "getTabToolbarButtonModel");
                    ComposerButtonLoadingScreenImplementation composerButtonLoadingScreenImplementation = this.A02;
                    int A012 = 4YV.A0I().A01(2MQ.A2P);
                    Context context2 = composerButtonLoadingScreenImplementation.A00;
                    String string2 = context2.getString(2131954682);
                    C1pq.A08("contentDescription", string2);
                    Drawable drawable2 = context2.getDrawable(A012);
                    if (drawable2 == null) {
                        throw 1BK.A0h();
                    }
                    2Rg A004 = 2Rg.A00(drawable2);
                    C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, A004);
                    A0t.add(new 2Rh((C2iw) null, (2QB) null, A004, (C1p8) null, (String) null, string2, "ComposerButton"));
                    r0.A09("messaging.nativepagereply.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement2);
                }
                while (true) {
                    int size = A0t.size();
                    ?? r3112 = this.A00;
                    boolean z3 = r3112;
                    if (r3112 == -1) {
                        boolean A005 = A00();
                        boolean z4 = A005;
                        if (A01()) {
                            z4 = (A005 ? 1 : 0) + 1;
                        }
                        this.A00 = z4 ? 1 : 0;
                        z3 = z4;
                    }
                    if (size >= z3) {
                        r0.A02((Exception) null, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement);
                        return A0t;
                    }
                    A0t.add(null);
                }
            } catch (Throwable th) {
                r0.A04((Exception) null, "messaging.nativepagereply.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", z);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "getTabToolbarButtonModel", andIncrement);
            throw th2;
        }
    }

    public void BoY(View view, String str) {
        int andIncrement;
        String str2;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0A;
        String A00 = 1BJ.A00(2);
        r0.A08(A00, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onClick", andIncrement2);
        try {
            if (!str.equals("CameraButton") || !A00()) {
                if (str.equals("ComposerButton") && A01()) {
                    andIncrement = atomicInteger.getAndIncrement();
                    str2 = "messaging.nativepagereply.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation";
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.core.tabtoolbarbuttons.composerbutton.ComposerButtonLoadingScreenImplementation", str2, A00, andIncrement, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", "onClick");
                }
            }
            andIncrement = atomicInteger.getAndIncrement();
            str2 = "messaging.nativepagereply.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation";
            r0.A0A("com.facebook.messaging.nativepagereply.plugins.core.tabtoolbarbuttons.camerabutton.CameraButtonLoadingScreenImplementation", str2, A00, andIncrement, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", "onClick");
            r0.A09(str2, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onClick", andIncrement);
        } finally {
            r0.A02((Exception) null, "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onClick", andIncrement2);
        }
    }

    public void C2M(1Iw r302, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0A;
        r0.A08(1BJ.A00(2), "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onInvisible", A00);
        r0.A06("messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onInvisible", A00);
    }

    public boolean C59(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0A;
        r0.A08(1BJ.A00(2), "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onLongClick", A00);
        r0.A06("messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onLongClick", A00);
        return false;
    }

    public void CUt(1Iw r302, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0A;
        r0.A08(1BJ.A00(2), "messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onVisible", A00);
        r0.A06("messaging.navigation.home.tabs.tabtoolbarbutton.TabToolbarButtonInterfaceSpec", "onVisible", A00);
    }
}
