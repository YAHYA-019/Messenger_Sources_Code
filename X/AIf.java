package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.facebook.messaging.avatar.avatardetail.repository.PoseRepository;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi;
import com.facebook.messaging.media.send.MediaMessageFactory;
import com.facebook.messaging.montage.composer.magicmod.service.MagicModGenerateImageService;
import com.facebook.messaging.montage.composer.magicmod.service.MagicModUploadImageService;
import com.facebook.messaging.msys.thread.writewithai.service.WriteWithAiService;
import com.facebook.messaging.threads.intents.intentskt.ArmadilloGroupThreadIntentHandler;
import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import com.facebook.rtc.screenshare.casttofriends.StartCastCallUseCase;
import com.facebook.wearable.mediastream.ul.voltron.loader.MediaStreamLibraryLoader;
import com.facebook.xapp.messaging.powerups.avatars.repository.datasource.AvatarPowerUpDownloader;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;

/* loaded from: AIf.class */
public final class AIf extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIf(0DR r302) {
        super(r302);
        this.A06 = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIf(Object obj, 0DR r303, int i) {
        super(r303);
        this.A06 = i;
        this.A05 = obj;
    }

    public static void A01(Object obj, Object obj2, Object obj3, AIf aIf, int i) {
        aIf.A01 = obj;
        aIf.A02 = obj2;
        aIf.A03 = obj3;
        aIf.A00 = i;
    }

    public static void A02(Object obj, AIf aIf) {
        aIf.A04 = obj;
        aIf.A00 |= (-1) << (-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.AIf) r302).A06 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.AIf
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.AIf r0 = (X.AIf) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A06
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r301
            if (r0 == r1) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIf.A03(int, java.lang.Object):boolean");
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                this.A05 = obj;
                this.A00 |= (-1) << (-1);
                return SuspendAnimationKt.A01(null, null, this, null, 0L);
            case 1:
                A02(obj, this);
                return DragGestureNode.A00(null, (DragGestureNode) this.A05, this);
            case 2:
                A02(obj, this);
                return ((LazyListState) this.A05).Cjp(null, this, null);
            case 3:
                A02(obj, this);
                return ((AndroidComposeViewAccessibilityDelegateCompat) this.A05).A0c(this);
            case 4:
                A02(obj, this);
                return ((PoseRepository) this.A05).A01(null, null, this);
            case 5:
                A02(obj, this);
                return GoogleAuthController.A06(null, null, (GoogleAuthController) this.A05, null, this, false);
            case 6:
                A02(obj, this);
                return ((GoogleAuthController) this.A05).A0A(null, this, false);
            case 7:
                A02(obj, this);
                return ((GoogleAuthController) this.A05).A09(null, null, this);
            case 8:
                A02(obj, this);
                return EbPasskeyRestoreApi.A01(null, null, (EbPasskeyRestoreApi) this.A05, null, this);
            case 9:
                A02(obj, this);
                return ((EbPasskeySetupApi) this.A05).A05(null, null, null, this);
            case 10:
                A02(obj, this);
                return EbPasskeySetupApi.A04(null, (EbPasskeySetupApi) this.A05, this);
            case 11:
                A02(obj, this);
                return EbPasskeySetupApi.A02(null, null, null, (EbPasskeySetupApi) this.A05, this);
            case 12:
                A02(obj, this);
                return ((MediaMessageFactory) this.A05).A03(null, null, null, null, null, null, null, null, null, null, null, null, this, 0);
            case 13:
                A02(obj, this);
                return MagicModGenerateImageService.A01(null, null, null, (MagicModGenerateImageService) this.A05, this);
            case 14:
                A02(obj, this);
                return ((MagicModUploadImageService) this.A05).A02(null, null, null, this);
            case 15:
                A02(obj, this);
                return ((WriteWithAiService) this.A05).A07(null, null, null, null, null, this);
            case 16:
                A02(obj, this);
                return ((ArmadilloGroupThreadIntentHandler) this.A05).A00(null, null, null, this);
            case 17:
                A02(obj, this);
                return HeraMessengerPluginImplementation.A00(null, (HeraMessengerPluginImplementation) this.A05, this);
            case 18:
                A02(obj, this);
                return ((MetaAiRsysSdk) this.A05).A00(null, this);
            case 19:
                A02(obj, this);
                return ((StartCastCallUseCase) this.A05).A00(null, null, null, null, this);
            case 20:
                A02(obj, this);
                return MediaStreamLibraryLoader.A00(null, (MediaStreamLibraryLoader) this.A05, this);
            case 21:
                A02(obj, this);
                return ((AvatarPowerUpDownloader) this.A05).A01(null, this);
            case 22:
                A02(obj, this);
                return ((ImagineNetworkService) this.A05).A02(null, null, null, null, null, this, false);
            case 23:
                A02(obj, this);
                return WriteWithAICreationViewModel.A00(null, (WriteWithAICreationViewModel) this.A05, null, null, this);
            default:
                A02(obj, this);
                return WriteWithAICreationViewModel.A01(null, (WriteWithAICreationViewModel) this.A05, null, null, this);
        }
    }
}
