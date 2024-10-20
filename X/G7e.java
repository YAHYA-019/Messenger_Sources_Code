package X;

import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;

/* loaded from: G7e.class */
public final class G7e implements 0Jf, 0zU {
    public final int A00;
    public final Object A01;

    public G7e(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static FA7 A00(Object obj, int i) {
        G9D g9d = new G9D(obj, i);
        return new FA7(CdsBottomSheetDimmingBehaviour.Default.A00, EP2.A06, 0S2.A0C, (Integer) null, g9d, 48, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x05e3, code lost:
    
        if (r0.A01 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x036c, code lost:
    
        if (((X.C9i8) ((X.FGA) r0).A03.getValue()).A09 != false) goto L61;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0478  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 3132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G7e.emit(java.lang.Object, X.0DR):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof 0zU) && (obj instanceof 0Jf)) {
            z = 11T.A0O(getFunctionDelegate(), ((0Jf) obj).getFunctionDelegate());
        }
        return z;
    }

    public final C00l getFunctionDelegate() {
        Class cls;
        int i;
        String str;
        String str2;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                cls = C9ma.class;
                i = 2;
                str = "handleMetaAIVoiceUiEffect";
                str2 = "handleMetaAIVoiceUiEffect(Lcom/meta/metaai/components/voice/uieffect/MetaAIMultimodalComponentUIEffect;)V";
                break;
            case 1:
                cls = 9Ry.class;
                i = 2;
                str = "handleAudioLevelEffect";
                str2 = "handleAudioLevelEffect(Lcom/meta/metaai/components/voice/uieffect/MetaAIVoiceAudioLevelEffect;)V";
                break;
            case 2:
            case 3:
            default:
                cls = EKK.class;
                i = 2;
                str = "handleNavigation";
                str2 = "handleNavigation(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineTopLevelNavigationState;)V";
                break;
            case 4:
                cls = EKK.class;
                i = 2;
                str = "handleCreationHeader";
                str2 = "handleCreationHeader(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineScreenNavigationState;)V";
                break;
            case 5:
                cls = EKK.class;
                i = 2;
                str = "handleFeedbackUiEffect";
                str2 = "handleFeedbackUiEffect(Lcom/meta/metaai/imagine/creation/impl/viewmodel/FeedbackUiEffect;)V";
                break;
            case 6:
                cls = EKI.class;
                i = 2;
                str = "handleNavigation";
                str2 = "handleNavigation(Lcom/meta/metaai/imagine/memu/impl/viewmodel/MEmuOnboardingNavigationState;)V";
                break;
            case 7:
                cls = EKI.class;
                i = 2;
                str = "handleBackgroundConfig";
                str2 = "handleBackgroundConfig(Lcom/meta/metaai/imagine/memu/impl/viewmodel/BackgroundConfig;)V";
                break;
            case 8:
                cls = EKH.class;
                i = 2;
                str = "updateBottomSheetConfig";
                str2 = "updateBottomSheetConfig(Lcom/meta/metaai/shared/litho/ui/bottomsheet/MetaAiBottomSheetConfig;)V";
                break;
            case 9:
                cls = EKH.class;
                i = 2;
                str = "handleUiUpdate";
                str2 = "handleUiUpdate(Lcom/meta/metaai/imagine/memu/impl/viewmodel/MEmuOnboardingUiState;)V";
                break;
            case 10:
                cls = EKH.class;
                i = 2;
                str = "handleBottomSheetAction";
                str2 = "handleBottomSheetAction(Lcom/meta/metaai/imagine/memu/impl/viewmodel/MEmuBottomSheetAction;)V";
                break;
        }
        return new 19S(i, obj, cls, str, str2, 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
