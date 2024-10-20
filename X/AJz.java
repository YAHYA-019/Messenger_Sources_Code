package X;

import android.content.Context;
import android.widget.Toast;
import kotlin.jvm.functions.Function2;

/* loaded from: AJz.class */
public final class AJz extends 19S implements Function2 {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AJz(java.lang.Object r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r304 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r303
            if (r0 == 0) goto L2d
            java.lang.Class<X.8hP> r0 = X.8hP.class
            r305 = r0
            r0 = 2
            r306 = r0
            java.lang.String r0 = "onMoreButtonClicked"
            r307 = r0
            java.lang.String r0 = "onMoreButtonClicked(Lcom/meta/metaai/imagine/creation/impl/data/ImagineGeneratedImageWithStatus;Lcom/meta/metaai/shared/litho/ui/tooltip/AnchorHandle;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V"
            r308 = r0
            r0 = 0
            r309 = r0
        L1d:
            r0 = r304
            r1 = r306
            r2 = r302
            r3 = r305
            r4 = r307
            r5 = r308
            r6 = r309
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L2d:
            java.lang.Class<X.8vA> r0 = X.C8vA.class
            r305 = r0
            r0 = 2
            r306 = r0
            java.lang.String r0 = "handleEvent"
            r307 = r0
            java.lang.String r0 = "handleEvent(Lcom/facebook/messaging/encryptedbackups/setting/viewdata/EncryptedBackupsSettingFragmentViewData$SettingViewEvent;)V"
            r308 = r0
            r0 = 4
            r309 = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJz.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.8vA, androidx.fragment.app.Fragment] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Context requireContext;
        int i;
        if (this.A00 != 0) {
            9cN r0 = (9cN) obj2;
            11T.A0F(r0, 1);
            8hP.A01((F9y) obj, (8hP) ((19S) this).receiver, r0, (Integer) null, AQM.A00);
        } else {
            ?? r02 = (C8vA) ((19S) this).receiver;
            int ordinal = ((C95g) obj).ordinal();
            if (ordinal == 0) {
                requireContext = r02.requireContext();
                i = 2131956524;
            } else {
                if (ordinal == 1) {
                    9lL r03 = r02.A01;
                    if (r03 != null) {
                        4YV.A0Z(r03.A06).flowMarkPoint(r03.A03, "SETTING_GOOGLE_STORAGE_TURN_OFF_SUCCESS");
                        9lL r04 = r02.A01;
                        if (r04 != null) {
                            4YV.A0Z(r04.A06).flowEndSuccess(r04.A03);
                            requireContext = r02.requireContext();
                            i = 2131956522;
                        }
                    }
                    11T.A0L("settingFlowLogger");
                    throw 0Q8.createAndThrow();
                }
                if (ordinal == 2) {
                    requireContext = r02.requireContext();
                    i = 2131956523;
                }
            }
            Toast.makeText(requireContext, r02.getText(i), 0).show();
        }
        return 04S.A00;
    }
}
