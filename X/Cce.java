package X;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.readreceiptcontrol.PrivacySettingsReadReceiptControlRow;
import com.facebook.messaging.graph.plugins.sharecontact.privacycontrol.privacysettings.ContactSharePrivacyControlSettingsRow;
import com.facebook.messaging.montage.plugins.core.privacysettings.storycontrols.PrivacySettingsStoryControls;
import com.facebook.messaging.montage.prefs.MontagePreferenceActivity;
import com.facebook.messaging.presence.plugins.core.privacysettingsrow.ActiveStatusPrivacySettingsRow;
import com.facebook.messaging.typingindicatorcontrol.plugins.core.privacysettings.PrivacySettingsTypingIndicatorControlRow;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cce.class */
public final class Cce implements DIK {
    public 20L A01;
    public PrivacySettingsReadReceiptControlRow A02;
    public ContactSharePrivacyControlSettingsRow A03;
    public PrivacySettingsStoryControls A04;
    public C1v5 A05;
    public ActiveStatusPrivacySettingsRow A06;
    public PrivacySettingsTypingIndicatorControlRow A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public boolean A0D;
    public final Context A0E;
    public final LifecycleOwner A0F;
    public final DFp A0H;
    public final String A0I;
    public int A00 = -1;
    public final 1YC A0G = 1YC.A03;

    public Cce(Context context, LifecycleOwner lifecycleOwner, DFp dFp, String str) {
        this.A0E = context;
        this.A0F = lifecycleOwner;
        this.A0H = dFp;
        this.A0I = str;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A0D) {
                if (this.A0E == null) {
                    throw AnonymousClass001.A0Q("The context passed in the PrivacySettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A05 = C1v5.A01;
                this.A0D = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0 A[Catch: Exception -> 0x00ef, all -> 0x00fb, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ef, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00a9, B:17:0x00e8, B:20:0x00b0, B:22:0x00ba, B:25:0x00c8, B:26:0x00cd, B:27:0x00d3, B:29:0x00d9, B:30:0x00df, B:31:0x00e3, B:31:0x00e3, B:33:0x005c, B:34:0x0061, B:37:0x006d, B:40:0x0075, B:41:0x007e, B:44:0x0087, B:45:0x008c, B:47:0x0092, B:50:0x009a), top: B:4:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cce.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00dc A[Catch: Exception -> 0x0129, all -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0129, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00dc, B:17:0x010b, B:19:0x00e3, B:20:0x00e9, B:21:0x00ee, B:22:0x00f4, B:24:0x00fc, B:25:0x0102, B:26:0x0106, B:26:0x0106, B:28:0x005c, B:29:0x0061, B:32:0x006d, B:35:0x0075, B:36:0x007e, B:41:0x00ca, B:41:0x00ca, B:43:0x00ce, B:44:0x008d, B:46:0x009d, B:56:0x00c5, B:59:0x0117, B:61:0x0121, B:63:0x0128), top: B:4:0x003f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3 A[Catch: Exception -> 0x0129, all -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0129, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00dc, B:17:0x010b, B:19:0x00e3, B:20:0x00e9, B:21:0x00ee, B:22:0x00f4, B:24:0x00fc, B:25:0x0102, B:26:0x0106, B:26:0x0106, B:28:0x005c, B:29:0x0061, B:32:0x006d, B:35:0x0075, B:36:0x007e, B:41:0x00ca, B:41:0x00ca, B:43:0x00ce, B:44:0x008d, B:46:0x009d, B:56:0x00c5, B:59:0x0117, B:61:0x0121, B:63:0x0128), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cce.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cce.A03():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[Catch: Exception -> 0x00cf, all -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cf, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x0090, B:17:0x00c8, B:20:0x0097, B:22:0x00a3, B:25:0x00ae, B:26:0x00b4, B:28:0x00b9, B:29:0x00bf, B:30:0x00c3, B:30:0x00c3, B:32:0x005c, B:33:0x0061, B:36:0x006d, B:39:0x0075, B:41:0x0081), top: B:4:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cce.A04():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00d9, all -> 0x00e5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d9, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00d2, B:20:0x009a, B:22:0x00a4, B:25:0x00b2, B:26:0x00b7, B:27:0x00bd, B:29:0x00c3, B:30:0x00c9, B:31:0x00cd, B:31:0x00cd, B:33:0x005f, B:34:0x0064, B:37:0x0070, B:40:0x0078, B:42:0x0084), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A05() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cce.A05():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v186, types: [int] */
    /* JADX WARN: Type inference failed for: r0v231, types: [int] */
    /* JADX WARN: Type inference failed for: r0v233, types: [int] */
    /* JADX WARN: Type inference failed for: r0v235, types: [int] */
    /* JADX WARN: Type inference failed for: r0v237, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r312v0 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    public List AKc(0Da r302) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0G;
        String str = "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec";
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
        try {
            A00();
            ?? r312 = this.A00;
            boolean z = r312;
            if (r312 == -1) {
                boolean A01 = A01();
                boolean z2 = A01;
                if (A05()) {
                    z2 = (A01 ? 1 : 0) + 1;
                }
                boolean z3 = z2;
                if (A04()) {
                    z3 = (z2 ? 1 : 0) + 1;
                }
                boolean z4 = z3;
                if (A03()) {
                    z4 = (z3 ? 1 : 0) + 1;
                }
                boolean z5 = z4;
                if (A02()) {
                    z5 = (z4 ? 1 : 0) + 1;
                }
                this.A00 = z5 ? 1 : 0;
                z = z5;
            }
            ArrayList A0t = AnonymousClass001.A0t(z ? 1 : 0);
            try {
                if (A01()) {
                    z = atomicInteger.getAndIncrement();
                    str = "messaging.advancedcrypto.core.privacysettings.readreceiptcontrol.PrivacySettingsReadReceiptControlRow";
                    r0.A0A("com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.readreceiptcontrol.PrivacySettingsReadReceiptControlRow", str, "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", z ? 1 : 0, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.advancedcrypto.plugins.core.ArmadilloCoreKillSwitch", "createPrivacySettingsRowItem");
                    try {
                        PrivacySettingsReadReceiptControlRow privacySettingsReadReceiptControlRow = this.A02;
                        1Bn.A0A(83042);
                        Context context = privacySettingsReadReceiptControlRow.A00;
                        AbJ.A1I(r302, CG8.A00(new C9ye(privacySettingsReadReceiptControlRow, 0), 1BK.A0u(context, 2131963711), 1BK.A0u(context, 2131963710), "read_receipt"), A0t);
                        r0.A09(str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", z ? 1 : 0);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A05()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.typingindicatorcontrol.plugins.core.privacysettings.PrivacySettingsTypingIndicatorControlRow", "messaging.typingindicatorcontrol.core.privacysettings.PrivacySettingsTypingIndicatorControlRow", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement2, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.typingindicatorcontrol.plugins.core.TypingindicatorcontrolCoreKillSwitch", "createPrivacySettingsRowItem");
                    PrivacySettingsTypingIndicatorControlRow privacySettingsTypingIndicatorControlRow = this.A07;
                    1Bn.A0A(83042);
                    Context context2 = privacySettingsTypingIndicatorControlRow.A00;
                    AbJ.A1I(r302, CG8.A00(new C9ye(privacySettingsTypingIndicatorControlRow, 73), 1BK.A0u(context2, 2131963736), 1BK.A0u(context2, 2131963735), "typing_indicator"), A0t);
                    r0.A09("messaging.typingindicatorcontrol.core.privacysettings.PrivacySettingsTypingIndicatorControlRow", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement2);
                }
                if (A04()) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.presence.plugins.core.privacysettingsrow.ActiveStatusPrivacySettingsRow", "messaging.presence.core.privacysettingsrow.ActiveStatusPrivacySettingsRow", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement3, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.presence.plugins.core.PresenceCoreKillSwitch", "createPrivacySettingsRowItem");
                    ActiveStatusPrivacySettingsRow activeStatusPrivacySettingsRow = this.A06;
                    CH1 ch1 = (CH1) 1Bn.A0A(83669);
                    Context context3 = activeStatusPrivacySettingsRow.A00;
                    1Bn.A0A(83042);
                    AbJ.A1I(r302, CG8.A00(new Cvm(context3, ch1, 30), 1BK.A0u(context3, 2131952300), AbG.A17(context3, new Object[]{CH1.A00(context3, ch1)}, 2131952294), "active_status"), A0t);
                    r0.A09("messaging.presence.core.privacysettingsrow.ActiveStatusPrivacySettingsRow", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement3);
                }
                if (A03()) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.montage.plugins.core.privacysettings.storycontrols.PrivacySettingsStoryControls", "messaging.montage.core.privacysettings.storycontrols.PrivacySettingsStoryControls", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement4, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", 4YT.A00(22), "createPrivacySettingsRowItem");
                    PrivacySettingsStoryControls privacySettingsStoryControls = this.A04;
                    CG8 cg8 = (CG8) 1Bn.A0A(83042);
                    Context context4 = privacySettingsStoryControls.A00;
                    String A0u = 1BK.A0u(context4, 2131966452);
                    String A0u2 = 1BK.A0u(context4, 2131966451);
                    Intent A0D = C3o5.A0D(context4, MontagePreferenceActivity.class);
                    A0D.putExtra("is_from_privacy_controls", true);
                    AbH.A1H(A0D, "fb-messenger://settings/montage");
                    AbJ.A1I(r302, cg8.A01(A0D, (C5ww) null, A0u, A0u2, "story_controls"), A0t);
                    r0.A09("messaging.montage.core.privacysettings.storycontrols.PrivacySettingsStoryControls", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement4);
                }
                if (A02()) {
                    z = atomicInteger.getAndIncrement();
                    str = "messaging.graph.sharecontact.privacycontrol.privacysettings.ContactSharePrivacyControlSettingsRow";
                    r0.A0A("com.facebook.messaging.graph.plugins.sharecontact.privacycontrol.privacysettings.ContactSharePrivacyControlSettingsRow", str, "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", z ? 1 : 0, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.graph.plugins.sharecontact.privacycontrol.GraphSharecontactPrivacycontrolKillSwitch", "createPrivacySettingsRowItem");
                    ContactSharePrivacyControlSettingsRow contactSharePrivacyControlSettingsRow = this.A03;
                    Context context5 = contactSharePrivacyControlSettingsRow.A00;
                    String A0u3 = 1BK.A0u(context5, 2131954828);
                    String A0u4 = 1BK.A0u(context5, 2131954827);
                    1Br.A0C(contactSharePrivacyControlSettingsRow.A02);
                    AbJ.A1I(r302, CG8.A00(new Fjz(contactSharePrivacyControlSettingsRow, 16), A0u3, A0u4, "contact_card"), A0t);
                    r0.A09(str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", z ? 1 : 0);
                }
                r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
                return A0t;
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", z);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
            throw th2;
        }
    }

    public void BbQ() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0G;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "logRowImpression", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "logRowImpression", A00);
        }
    }

    public void D3I() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0G;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement);
        try {
            A00();
            if (A02()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.graph.plugins.sharecontact.privacycontrol.privacysettings.ContactSharePrivacyControlSettingsRow", "messaging.graph.sharecontact.privacycontrol.privacysettings.ContactSharePrivacyControlSettingsRow", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement2, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.graph.plugins.sharecontact.privacycontrol.GraphSharecontactPrivacycontrolKillSwitch", "subscribe");
                    try {
                        ContactSharePrivacyControlSettingsRow contactSharePrivacyControlSettingsRow = this.A03;
                        contactSharePrivacyControlSettingsRow.A01.getLifecycle().addObserver(new Rky(contactSharePrivacyControlSettingsRow));
                        r0.A09("messaging.graph.sharecontact.privacycontrol.privacysettings.ContactSharePrivacyControlSettingsRow", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.graph.sharecontact.privacycontrol.privacysettings.ContactSharePrivacyControlSettingsRow", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement);
            throw th2;
        }
    }

    public void D6F() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0G;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "unsubscribe", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "unsubscribe", A00);
        }
    }
}
