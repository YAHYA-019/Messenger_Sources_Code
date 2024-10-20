package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.aibot.handlers.initparams.OnThreadOpenSendMessageParamsMetadata;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.io.Serializable;

/* loaded from: A7b.class */
public final class A7b implements 1Vf {
    public final Context A00;
    public final 1pI A01;
    public final ThreadKey A02;
    public final 2Oh A03;
    public final 2Of A04;
    public final HeterogeneousMap A05;
    public final 2Og A06;

    public A7b(Context context, 1pI r303, ThreadKey threadKey, 2Oh r305, 2Of r306, HeterogeneousMap heterogeneousMap, 2Og r308) {
        this.A00 = context;
        this.A02 = threadKey;
        this.A05 = heterogeneousMap;
        this.A04 = r306;
        this.A06 = r308;
        this.A01 = r303;
        this.A03 = r305;
    }

    /* JADX WARN: Type inference failed for: r0v178, types: [X.5fq, X.5qu] */
    /* JADX WARN: Type inference failed for: r0v46, types: [com.facebook.messaging.aibot.nux.AiBotNuxFragment, androidx.fragment.app.Fragment, X.2Ov] */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        OnThreadOpenSendMessageParamsMetadata onThreadOpenSendMessageParamsMetadata;
        String str2;
        boolean A1W = 1BL.A1W(r302, str);
        int hashCode = str.hashCode();
        if (hashCode != -2096525347) {
            if (hashCode != -1261602635) {
                if (hashCode == -1027586847 && str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
                    C9ah c9ah = (C9ah) 1Bi.A03(68702);
                    ThreadKey threadKey = this.A02;
                    String A0y = 4YU.A0y(threadKey);
                    java.util.Map map = c9ah.A01;
                    if (!map.containsKey(A0y)) {
                        map.put(A0y, 7zR.A0s());
                    }
                    1qI A0U = 7zR.A0U();
                    Context context = this.A00;
                    C77c c77c = (C77c) 1Bu.A06(context, 68283);
                    if ((threadKey.A0y() && 1qI.A00().A01() == 0S2.A0N && !c77c.A0I(context) && A0U.A08()) || (onThreadOpenSendMessageParamsMetadata = (OnThreadOpenSendMessageParamsMetadata) this.A05.A00(OnThreadOpenSendMessageParamsMetadata.A0C)) == null || (str2 = onThreadOpenSendMessageParamsMetadata.A07) == null) {
                        return;
                    }
                    7fO r0 = new 7fO(onThreadOpenSendMessageParamsMetadata.A00, onThreadOpenSendMessageParamsMetadata.A05, onThreadOpenSendMessageParamsMetadata.A01, onThreadOpenSendMessageParamsMetadata.A02, onThreadOpenSendMessageParamsMetadata.A03, onThreadOpenSendMessageParamsMetadata.A06, onThreadOpenSendMessageParamsMetadata.A04, onThreadOpenSendMessageParamsMetadata.A08, onThreadOpenSendMessageParamsMetadata.A09, onThreadOpenSendMessageParamsMetadata.A0B, onThreadOpenSendMessageParamsMetadata.A0A);
                    2Of r02 = this.A04;
                    ?? c5fq = new C5fq();
                    c5fq.A02 = str2;
                    c5fq.A02(A9k.A00, r0);
                    r02.AQN(new 7Ad((C5fq) c5fq, "unknown", (String) null));
                    return;
                }
            } else if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnDestroy")) {
                ((C9ah) 1Bi.A03(68702)).A01.remove(4YU.A0y(this.A02));
                return;
            }
        } else if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnStart")) {
            1qI A0U2 = 7zR.A0U();
            Context context2 = this.A00;
            1BV A0R = 7zL.A0R(context2, 68283);
            ThreadKey threadKey2 = this.A02;
            if (A0U2.A0S(4YU.A0y(threadKey2))) {
                if (A0U2.A08()) {
                    ((C77c) A0R.get()).A0G(context2, AnonymousClass969.A06, AV1.A00(this, 18), A1W);
                    return;
                }
                return;
            }
            C77c c77c2 = (C77c) A0R.get();
            if (threadKey2.A0y() && 1qI.A00().A01() == 0S2.A0N && !c77c2.A0I(context2)) {
                if (!1qI.A01(A0U2).A01() || !A0U2.A00.AZk(72340430520192719L)) {
                    1pI r03 = this.A01;
                    Serializable serializable = BOj.A01;
                    AQk A01 = AQk.A01(this, 21);
                    ?? r04 = new 2Ov();
                    Bundle A05 = 1BK.A05();
                    A05.putBoolean("AiBotNuxFragment.finish_activity_on_picker_close", A1W);
                    A05.putBoolean("AiBotNuxFragment.skip_bot_picker", A1W);
                    A05.putSerializable("AiBotNuxFragment.entry_point", serializable);
                    A05.putParcelable("AiBotNuxFragment.thread_key", threadKey2);
                    r04.setArguments(A05);
                    r04.A02 = A01;
                    r03.Czz((Fragment) r04, 0S2.A0j, "AiBotNuxFragment");
                    return;
                }
                Object A03 = 1Bi.A03(66421);
                06Z BdK = this.A06.BdK();
                if (BdK != null) {
                    2qR r05 = BaseMigBottomSheetDialogFragment.A06;
                    1pI r06 = this.A01;
                    Serializable serializable2 = BOj.A01;
                    AQk A012 = AQk.A01(A03, 20);
                    0D2 baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                    baseMigBottomSheetDialogFragment.A02 = A012;
                    baseMigBottomSheetDialogFragment.A00 = r06;
                    Bundle A052 = 1BK.A05();
                    A052.putBoolean("AiBotNuxFragment.finish_activity_on_picker_close", A1W);
                    A052.putBoolean("AiBotNuxFragment.skip_bot_picker", A1W);
                    A052.putSerializable("AiBotNuxBottomsheetFragment.entry_point", serializable2);
                    A052.putParcelable("AiBotNuxBottomsheetFragment.thread_key", threadKey2);
                    baseMigBottomSheetDialogFragment.setArguments(A052);
                    baseMigBottomSheetDialogFragment.A0m(BdK, "AiBotNuxBottomsheetFragment");
                    return;
                }
                return;
            }
            return;
        }
        throw 4YV.A0f(str);
    }
}
