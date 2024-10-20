package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.integrity.plugins.core.privacysettings.PrivacySettingsBlockPeople;
import com.facebook.messaging.wellbeing.plugins.core.privacysettings.PrivacySettingsMessageRow;
import com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.privacysettings.RestrictedListPrivacySettings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccc.class */
public final class Ccc implements DIK {
    public CG8 A01;
    public ArR A02;
    public ArR A03;
    public PrivacySettingsBlockPeople A04;
    public C1v5 A05;
    public RestrictedListPrivacySettings A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public final Context A0B;
    public final LifecycleOwner A0C;
    public final DFp A0E;
    public int A00 = -1;
    public final 1YC A0D = 1YC.A03;

    public Ccc(Context context, LifecycleOwner lifecycleOwner, DFp dFp) {
        this.A0B = context;
        this.A0C = lifecycleOwner;
        this.A0E = dFp;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A0A) {
                if (this.A0B == null) {
                    throw AnonymousClass001.A0Q("The context passed in the PrivacySettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A05 = C1v5.A01;
                this.A0A = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: Exception -> 0x00ba, all -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ba, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:16:0x0093, B:17:0x0098, B:17:0x0098, B:20:0x009d, B:21:0x00a3, B:22:0x00a7, B:22:0x00a7, B:25:0x00b3, B:28:0x00ae, B:29:0x005c, B:30:0x0061, B:33:0x006d, B:36:0x0075, B:38:0x0081), top: B:4:0x003f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[Catch: Exception -> 0x00ba, all -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ba, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:16:0x0093, B:17:0x0098, B:17:0x0098, B:20:0x009d, B:21:0x00a3, B:22:0x00a7, B:22:0x00a7, B:25:0x00b3, B:28:0x00ae, B:29:0x005c, B:30:0x0061, B:33:0x006d, B:36:0x0075, B:38:0x0081), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccc.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[Catch: Exception -> 0x00d6, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d6, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x0090, B:17:0x00cf, B:20:0x0097, B:21:0x009d, B:25:0x00ad, B:26:0x00b3, B:28:0x00b9, B:30:0x00bf, B:33:0x00ca, B:34:0x005c, B:35:0x0061, B:38:0x006d, B:41:0x0075, B:43:0x0081), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccc.A02():boolean");
    }

    private boolean A03() {
        boolean A1U;
        Object obj;
        if (this.A09 == null) {
            A00();
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0D;
            r0.A0B("com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.privacysettings.RestrictedListPrivacySettings", "messaging.wellbeing.selfremediation.restrict.privacysettings.RestrictedListPrivacySettings", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.WellbeingSelfremediationRestrictKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A05;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.WellbeingSelfremediationRestrictKillSwitch");
                        if (A00 != null) {
                            A1U = A00.booleanValue();
                            if (A1U || !((5PC) 1Bn.A0A(82526)).A01()) {
                                obj = C1Y6.A03;
                            } else {
                                this.A06 = new RestrictedListPrivacySettings(this.A0B);
                                obj = C1Y6.A02;
                            }
                            this.A09 = obj;
                            r0.A07("messaging.wellbeing.selfremediation.restrict.privacysettings.RestrictedListPrivacySettings", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A1U = AbL.A1U(r0, atomicInteger);
                    if (A1U) {
                    }
                    obj = C1Y6.A03;
                    this.A09 = obj;
                    r0.A07("messaging.wellbeing.selfremediation.restrict.privacysettings.RestrictedListPrivacySettings", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A09 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.wellbeing.selfremediation.restrict.privacysettings.RestrictedListPrivacySettings", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement, 1BL.A1U(this.A09));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.wellbeing.selfremediation.restrict.privacysettings.RestrictedListPrivacySettings", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement, 1BL.A1U(this.A09));
                throw th;
            }
        }
        return 1BK.A1U(this.A09);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r311v0 */
    public List AKc(0Da r302) {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
        try {
            A00();
            ?? r311 = this.A00;
            boolean z = r311;
            if (r311 == -1) {
                boolean A02 = A02();
                boolean z2 = A02;
                if (A03()) {
                    z2 = (A02 ? 1 : 0) + 1;
                }
                boolean z3 = z2;
                if (A01()) {
                    z3 = (z2 ? 1 : 0) + 1;
                }
                this.A00 = z3 ? 1 : 0;
                z = z3;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            try {
                if (A02()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.wellbeing.core.privacysettings.PrivacySettingsMessageRow";
                    r0.A0A("com.facebook.messaging.wellbeing.plugins.core.privacysettings.PrivacySettingsMessageRow", str, "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", i, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.wellbeing.plugins.core.WellbeingCoreKillSwitch", "createPrivacySettingsRowItem");
                    try {
                        Context context = this.A0B;
                        CG8 cg8 = this.A01;
                        if (cg8 == null) {
                            cg8 = (CG8) 1Bn.A0E(context, (1BY) null, 83042);
                            this.A01 = cg8;
                        }
                        ArR arR = this.A02;
                        if (arR == null) {
                            arR = (ArR) 1Bn.A0E(context, (1BY) null, 83146);
                            this.A02 = arR;
                        }
                        AbJ.A1I(r302, PrivacySettingsMessageRow.A00(context, cg8, arR), A0t);
                        r0.A09(str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A03()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.privacysettings.RestrictedListPrivacySettings", "messaging.wellbeing.selfremediation.restrict.privacysettings.RestrictedListPrivacySettings", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement2, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.WellbeingSelfremediationRestrictKillSwitch", "createPrivacySettingsRowItem");
                    AbJ.A1I(r302, this.A06.A00(), A0t);
                    r0.A09("messaging.wellbeing.selfremediation.restrict.privacysettings.RestrictedListPrivacySettings", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement2);
                }
                if (A01()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.integrity.core.privacysettings.PrivacySettingsBlockPeople";
                    r0.A0A("com.facebook.messaging.integrity.plugins.core.privacysettings.PrivacySettingsBlockPeople", str, "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", i, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.integrity.plugins.core.IntegrityCoreKillSwitch", "createPrivacySettingsRowItem");
                    AbJ.A1I(r302, this.A04.A00(), A0t);
                    r0.A09(str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", i);
                }
                r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
                return A0t;
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
            throw th2;
        }
    }

    public void BbQ() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "logRowImpression", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "logRowImpression", A00);
        }
    }

    public void D3I() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", A00);
        }
    }

    public void D6F() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "unsubscribe", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "unsubscribe", A00);
        }
    }
}
