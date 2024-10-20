package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.build.IsWorkBuild;
import com.facebook.presence.plugins.status.statusprofilesubheading.StatusProfileSubheadingImplementation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Amg, reason: case insensitive filesystem */
/* loaded from: Amg.class */
public final class C1599Amg extends 1IG {
    public final Context A00;
    public final Fragment A01;
    public final FbUserSession A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final BhX A07;
    public final DFp A08;
    public final C29 A09;
    public final 1HN A0A;
    public final 1pI A0B;

    public C1599Amg() {
    }

    public C1599Amg(Context context, Fragment fragment, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A03 = 1Bi.A02(Boolean.class, IsWorkBuild.class);
        this.A06 = 1Bn.A09(ArW.class, (Class) null);
        this.A05 = 1Bn.A09(ArX.class, (Class) null);
        this.A04 = 1Bi.A02(1X6.class, (Class) null);
        this.A09 = new C29(this);
        this.A0A = new Czs(this, 9);
        this.A01 = fragment;
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A08 = dFp;
        this.A0B = r305;
        BhX bhX = new BhX((Bb1) C1Y6.A00(context, "com_facebook_messaging_settings_plugins_interfaces_mesettings_profilesubheading_MeSettingsProfileSubheadingInterfaceSpec", "All", new Object[]{fbUserSession, dFp, r305}));
        this.A07 = bhX;
        CEj cEj = bhX.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = cEj.A02;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "init", andIncrement);
        try {
            if (CEj.A00(cEj)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.presence.plugins.status.statusprofilesubheading.StatusProfileSubheadingImplementation", "presence.status.statusprofilesubheading.StatusProfileSubheadingImplementation", "com.facebook.messaging.settings.plugins.interfaces.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", andIncrement2, "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "com.facebook.presence.plugins.status.StatusKillSwitch", "init");
                    try {
                        StatusProfileSubheadingImplementation statusProfileSubheadingImplementation = cEj.A00;
                        C00i c00i = statusProfileSubheadingImplementation.A0A.A00;
                        1FV A04 = ((2Tj) c00i.get()).A04(7zO.A0C(statusProfileSubheadingImplementation.A04));
                        1Kd.A0E(new D4o(statusProfileSubheadingImplementation.A0E, statusProfileSubheadingImplementation.A0F, 6), A04);
                        statusProfileSubheadingImplementation.A02 = A04;
                        statusProfileSubheadingImplementation.A01 = new A21(statusProfileSubheadingImplementation, 4);
                        statusProfileSubheadingImplementation.A0D.set(true);
                        2Tj r02 = (2Tj) c00i.get();
                        2Ti r03 = statusProfileSubheadingImplementation.A01;
                        if (r03 == null) {
                            11T.A0L("statusChangeListener");
                            throw 0Q8.createAndThrow();
                        }
                        r02.A05(r03);
                        r0.A09("presence.status.statusprofilesubheading.StatusProfileSubheadingImplementation", "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "init", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "presence.status.statusprofilesubheading.StatusProfileSubheadingImplementation", "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "init", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "init", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "init", andIncrement);
            throw th2;
        }
    }

    public void A05() {
        BhX bhX = this.A07;
        if (bhX != null) {
            CEj cEj = bhX.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = cEj.A02;
            r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "dispose", andIncrement);
            try {
                if (CEj.A00(cEj)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    try {
                        r0.A0A("com.facebook.presence.plugins.status.statusprofilesubheading.StatusProfileSubheadingImplementation", "presence.status.statusprofilesubheading.StatusProfileSubheadingImplementation", "com.facebook.messaging.settings.plugins.interfaces.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", andIncrement2, "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "com.facebook.presence.plugins.status.StatusKillSwitch", "dispose");
                        try {
                            StatusProfileSubheadingImplementation statusProfileSubheadingImplementation = cEj.A00;
                            statusProfileSubheadingImplementation.A0D.set(false);
                            2Tj r02 = (2Tj) 1Br.A0B(statusProfileSubheadingImplementation.A0A);
                            2Ti r03 = statusProfileSubheadingImplementation.A01;
                            if (r03 == null) {
                                11T.A0L("statusChangeListener");
                                throw 0Q8.createAndThrow();
                            }
                            r02.A06(r03);
                            ListenableFuture listenableFuture = statusProfileSubheadingImplementation.A02;
                            if (listenableFuture != null) {
                                listenableFuture.cancel(true);
                            }
                            statusProfileSubheadingImplementation.A02 = null;
                            r0.A09("presence.status.statusprofilesubheading.StatusProfileSubheadingImplementation", "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "dispose", andIncrement2);
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        r0.A04((Exception) null, "presence.status.statusprofilesubheading.StatusProfileSubheadingImplementation", "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "dispose", andIncrement2);
                        throw th;
                    }
                }
                r0.A02((Exception) null, "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "dispose", andIncrement);
            } catch (Throwable th2) {
                r0.A02((Exception) null, "messaging.settings.mesettings.profilesubheading.MeSettingsProfileSubheadingInterfaceSpec", "dispose", andIncrement);
                throw th2;
            }
        }
        ((1X6) this.A04.get()).A05(this.A0A);
    }
}
