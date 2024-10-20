package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.foa.session.FbMetaSessionImpl;
import com.facebook.messaging.aibot.memu.intent.MemuOnboardingIntentHandler;
import com.facebook.messaging.extensions.common.ExtensionIconModel;
import com.facebook.messaging.extensions.common.ExtensionParams;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.rollcall.model.RollCallArgs;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.xapp.messaging.publicchats.prompt.model.PromptArgs;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: X.9z0, reason: invalid class name */
/* loaded from: 9z0.class */
public final class C9z0 implements 6MZ {
    public final int A00;
    public final Object A01;

    public C9z0(6MV r302, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.A01 = r302;
                return;
            default:
                this.A01 = r302;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    public final boolean CX9(View view, C7sh c7sh, Object obj) {
        ThreadKey threadKey;
        C2121Dea c2121Dea;
        int i;
        String str;
        String str2;
        RollCallArgs rollCallArgs;
        PromptArgs promptArgs;
        Executor executor;
        AFE afd;
        ThreadKey threadKey2;
        ThreadKey threadKey3;
        switch (this.A00) {
            case 0:
                6MV r0 = (6MV) this.A01;
                Message message = (Message) obj;
                String string = c7sh.A00.getString("extra_montage_message", null);
                11T.A0A(string);
                if (message == null || (threadKey = message.A0V) == null) {
                    return false;
                }
                IAa A02 = ((6uV) r0.A0C.get()).A02(r0.A06, 7Mg.A0M);
                A02.A09 = string;
                A02.A03 = threadKey;
                IAa.A02(r0.A04, r0.A05.getChildFragmentManager(), A02, (String) null);
                return true;
            case 1:
                6MV r02 = (6MV) this.A01;
                if (((Message) obj).A0V == null) {
                    return false;
                }
                SharedAlbumArgs sharedAlbumArgs = (SharedAlbumArgs) c7sh.A00.getParcelable(4YT.A00(336));
                if (sharedAlbumArgs == null) {
                    return false;
                }
                9DF.A00(r02.A04, r02.A05.getChildFragmentManager(), sharedAlbumArgs, false, false);
                return true;
            case 2:
                6MV r03 = (6MV) this.A01;
                Message message2 = (Message) obj;
                if (r03.A03 == null || message2.A0V == null) {
                    return true;
                }
                String A00 = 4YT.A00(1077);
                Bundle bundle = c7sh.A00;
                Serializable serializable = bundle.getSerializable(A00);
                Parcelable parcelable = bundle.getParcelable(4YT.A00(1078));
                6MW r04 = r03.A03;
                serializable.getClass();
                C6r6 c6r6 = (C6r6) serializable;
                parcelable.getClass();
                MontageComposerFragmentParams.Builder builder = (MontageComposerFragmentParams.Builder) parcelable;
                6F2 r05 = r04.A00;
                ImmutableSet immutableSet = 6F2.A4P;
                6QS.A0N(r05.A0b, c6r6, builder);
                return true;
            case 3:
                6MV r06 = (6MV) this.A01;
                Message message3 = (Message) obj;
                FbMetaSessionImpl A002 = 5Y9.A00(r06.A06);
                2yD A0K = 1BK.A0K();
                ThreadKey threadKey4 = message3.A0V;
                if (threadKey4 == null) {
                    return false;
                }
                boolean A0R = ThreadKey.A0R(threadKey4);
                String str3 = null;
                if (A0R || A0K.AZk(36322796132124609L)) {
                    1qK r07 = (1qK) 1Bi.A03(66421);
                    if (!r07.A0B()) {
                        Context context = r06.A04;
                        if (1XU.A00(context)) {
                            0LS.A0B(context, MemuOnboardingIntentHandler.A00);
                            return true;
                        }
                        if (A0R) {
                            str3 = "AI_BOT";
                        } else if (threadKey4.A18()) {
                            str3 = "ONE_TO_ONE";
                        } else if (threadKey4.A15()) {
                            str3 = "GROUP";
                        }
                        String A0t = 1BK.A0t();
                        EQa eQa = EQa.A06;
                        Integer num = 0S2.A01;
                        BotResponseMetadata botResponseMetadata = message3.A0k;
                        F2g.A01(context, A002, new FAB(eQa, (EQu) null, num, A0t, (String) null, str3, botResponseMetadata != null ? botResponseMetadata.A08 : null, (java.util.Map) null, false, false, false), new ACS(1, r06, message3, r07, A0R));
                        return true;
                    }
                    c2121Dea = new C2121Dea(r06.A04);
                    c2121Dea.A06(2131959488);
                    i = 2131959487;
                } else {
                    c2121Dea = new C2121Dea(r06.A04);
                    c2121Dea.A06(2131959490);
                    i = 2131959489;
                }
                c2121Dea.A05(i);
                c2121Dea.A08((DialogInterface.OnClickListener) null);
                c2121Dea.A0C(false);
                c2121Dea.A04();
                return true;
            case 4:
                6MV r08 = (6MV) this.A01;
                Fragment fragment = r08.A05;
                View view2 = fragment.mView;
                if (((Message) obj).A0V != null && view2 != null) {
                    SharedAlbumArgs sharedAlbumArgs2 = (SharedAlbumArgs) c7sh.A00.getParcelable(4YT.A00(336));
                    if (sharedAlbumArgs2 != null) {
                        9DE.A00(r08.A04, fragment.getChildFragmentManager(), 1vD.A00(view2), sharedAlbumArgs2);
                        return true;
                    }
                }
                str = "ThreadViewXmaHandlerHelper";
                str2 = "Failed to handle open shared album action";
                0fH.A0j(str, str2);
                return false;
            case 5:
                6MV r09 = (6MV) this.A01;
                ThreadKey threadKey5 = ((Message) obj).A0V;
                if (threadKey5 != null && threadKey5.A1D()) {
                    1pI A003 = 1vD.A00(view);
                    if (!A003.BVa() || (promptArgs = (PromptArgs) c7sh.A00.getParcelable("extra_prompt_args")) == null) {
                        return false;
                    }
                    8H0.A05.A00(A003, promptArgs);
                    return true;
                }
                if (r09.A03 == null || threadKey5 == null || view == null || (rollCallArgs = (RollCallArgs) c7sh.A00.getParcelable("extra_roll_call_args")) == null) {
                    str = "ThreadViewXmaHandlerHelper";
                    str2 = "Failed to handle open roll call action";
                    0fH.A0j(str, str2);
                    return false;
                }
                6F2 r010 = r09.A03.A00;
                ImmutableSet immutableSet2 = 6F2.A4P;
                r010.A0b.A1m(view, rollCallArgs);
                return true;
            case 6:
                6MV r011 = (6MV) this.A01;
                ThreadSummary threadSummary = r011.A02;
                if (threadSummary == null || threadSummary.A0n == null || r011.A01 == null || 2oI.A0A(threadSummary)) {
                    return false;
                }
                ExtensionParams extensionParams = (ExtensionParams) c7sh.A00.getParcelable(4YT.A00(ActionId.MQTT_CONNECTING));
                if (extensionParams == null) {
                    return false;
                }
                executor = (Executor) r011.A08.get();
                afd = new AFD(extensionParams, this);
                executor.execute(afd);
                return true;
            case 7:
                6MV r012 = (6MV) this.A01;
                if (r012.A01 == null) {
                    return false;
                }
                ExtensionParams extensionParams2 = (ExtensionParams) c7sh.A00.getParcelable(4YT.A00(1076));
                if (extensionParams2 == null) {
                    return false;
                }
                executor = (Executor) r012.A08.get();
                afd = new AFE(extensionParams2, this);
                executor.execute(afd);
                return true;
            case 8:
                Message message4 = (Message) obj;
                6Jd r013 = ((6MV) this.A01).A01;
                if (r013 == null || (threadKey2 = message4.A0V) == null) {
                    return false;
                }
                r013.A01(7Z5.A01(c7sh.A00.getParcelable(4YT.A00(471)), (ExtensionIconModel) null, 95I.A02, BP7.APPOINTMENT_REMINDER, threadKey2, (ThreadViewColorScheme) null, (String) null, -1, 2132346685, 2131952862, false, false, false));
                return true;
            default:
                Message message5 = (Message) obj;
                6MV r014 = (6MV) this.A01;
                if (r014.A03 == null || (threadKey3 = message5.A0V) == null) {
                    return true;
                }
                String string2 = c7sh.A00.getString(4YT.A00(335), null);
                11T.A0A(string2);
                5PI r015 = new 5PI();
                r015.A0K(ImmutableMap.of((Object) 4YT.A00(1191), (Object) ConstantsKt.CAMERA_ID_BACK));
                r015.A0E(message5.A1V);
                5PI.A00(r015, string2);
                r015.A0K = message5.A0K;
                r015.A0V = threadKey3;
                6MW r016 = r014.A03;
                Message message6 = new Message(r015);
                6F2 r017 = r016.A00;
                ImmutableSet immutableSet3 = 6F2.A4P;
                r017.A0b.A1v(message6);
                return true;
        }
    }
}
