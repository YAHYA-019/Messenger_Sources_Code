package X;

import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import com.facebook.acra.constants.ActionId;
import com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment;
import com.facebook.browser.lite.search.utils.security.SearchSecurityGSB;
import com.facebook.fbavatar.sticker.repository.messaging.artifacto.AvatarStickerArtifactoMediator;
import com.facebook.messaging.aibot.voice.viewcreator.setting.AiVoiceSettingFetchAndMutateService;
import com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel;
import com.facebook.messaging.avatar.avatardetail.repository.AvatarDetailConfigRepository;
import com.facebook.messaging.avatar.avatardetail.repository.PoseRepository;
import com.facebook.messaging.cuckoo.thirdpartychats.mvvm.model.ThirdPartyAppsSettingsRepository;
import com.facebook.messaging.encryptedbackups.appjob.EncryptedBackupsAutoRestoreStartupJob;
import com.facebook.messaging.encryptedbackups.autobackup.restore.AutoBackupRestoreManager;
import com.facebook.messaging.encryptedbackups.autobackup.setup.AutoBackupSetupManager;
import com.facebook.messaging.encryptedbackups.blockstore.setup.BlockStoreSetupManager;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata.EbOneTimeCodeRestoreViewData;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi;
import com.facebook.messaging.highlightstab.xsharelibraries.creation.loader.HTMomentCardMetadataGraphQLFetcher;
import com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController;
import com.facebook.messaging.montage.composer.magicmod.service.MagicModGenerateImageService;
import com.facebook.messaging.montage.composer.magicmod.service.MagicModUploadImageService;
import com.facebook.messaging.wearable.callengine.RsysBridge;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController;
import com.facebook.rp.platform.metaai.messenger.MessengerMetaAiRsysDelegate;
import com.facebook.wearable.common.util.queue.JobQueue;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: AIg.class */
public final class AIg extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIg(0DR r302) {
        super(r302);
        this.A05 = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIg(Object obj, 0DR r303, int i) {
        super(r303);
        this.A05 = i;
        this.A04 = obj;
    }

    public static AIg A01(Object obj, 0DR r302, int i) {
        return new AIg(obj, r302, i);
    }

    public static void A02(Object obj, Object obj2, AIg aIg, int i) {
        aIg.A01 = obj;
        aIg.A02 = obj2;
        aIg.A00 = i;
    }

    public static void A03(Object obj, AIg aIg) {
        aIg.A03 = obj;
        aIg.A00 |= (-1) << (-1);
    }

    public static void A04(Object obj, AIg aIg, int i) {
        aIg.A01 = obj;
        aIg.A02 = obj;
        aIg.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.AIg) r302).A05 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.AIg
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.AIg r0 = (X.AIg) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A05
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
        throw new UnsupportedOperationException("Method not decompiled: X.AIg.A05(int, java.lang.Object):boolean");
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                A03(obj, this);
                return HoverableNode.A00((HoverableNode) this.A04, this);
            case 1:
                A03(obj, this);
                return DragGestureNode.A01(null, (DragGestureNode) this.A04, this);
            case 2:
                A03(obj, this);
                return ((AwaitFirstLayoutModifier) this.A04).A00(this);
            case 3:
                A03(obj, this);
                return ((PausableMonotonicFrameClock) this.A04).DAh(this, null);
            case 4:
                A03(obj, this);
                return ((AndroidContentCaptureManager) this.A04).A07(this);
            case 5:
                A03(obj, this);
                return ((9Wb) this.A04).A00(this, (Function2) null);
            case 6:
                this.A04 = obj;
                this.A00 |= (-1) << (-1);
                return 9Ar.A00((AnonymousClass998) null, (Throwable) null, (List) null, this);
            case 7:
                A03(obj, this);
                return ((9aC) this.A04).A00((9Wb) null, this);
            case 8:
                A03(obj, this);
                return ((9aC) this.A04).A01(this, (Function2) null, (C0Bd) null);
            case 9:
                A03(obj, this);
                return SearchBottomSheetFragment.A05((SearchBottomSheetFragment) this.A04, null, this);
            case 10:
                A03(obj, this);
                return SearchSecurityGSB.A00(this);
            case 11:
                A03(obj, this);
                return ((AvatarStickerArtifactoMediator) this.A04).A01(null, this);
            case 12:
                A03(obj, this);
                return AiVoiceSettingFetchAndMutateService.A00(null, null, (AiVoiceSettingFetchAndMutateService) this.A04, this);
            case 13:
                A03(obj, this);
                return AvatarDetailActivityViewModel.A01((AvatarDetailActivityViewModel) this.A04, this);
            case 14:
                A03(obj, this);
                return AvatarDetailActivityViewModel.A02((AvatarDetailActivityViewModel) this.A04, this);
            case 15:
                A03(obj, this);
                return AvatarDetailActivityViewModel.A04((AvatarDetailActivityViewModel) this.A04, this);
            case 16:
                A03(obj, this);
                return ((AvatarDetailConfigRepository) this.A04).A03(null, this);
            case 17:
                A03(obj, this);
                return ((AvatarDetailConfigRepository) this.A04).A04(null, this);
            case 18:
                A03(obj, this);
                return AvatarDetailConfigRepository.A01((AvatarDetailConfigRepository) this.A04, null, this);
            case 19:
                A03(obj, this);
                return ((PoseRepository) this.A04).A02(this);
            case 20:
            case 37:
                A03(obj, this);
                return ((AI7) this.A04).emit(null, this);
            case 21:
                A03(obj, this);
                return ((ThirdPartyAppsSettingsRepository) this.A04).A07(this);
            case 22:
                A03(obj, this);
                return ((EncryptedBackupsAutoRestoreStartupJob) this.A04).A01(this);
            case 23:
                A03(obj, this);
                return ((AutoBackupRestoreManager) this.A04).A02(this);
            case 24:
                A03(obj, this);
                return AutoBackupSetupManager.A01((AutoBackupSetupManager) this.A04, null, this);
            case 25:
                A03(obj, this);
                return AutoBackupSetupManager.A00((AutoBackupSetupManager) this.A04, null, null, this);
            case 26:
                A03(obj, this);
                return BlockStoreSetupManager.A00((BlockStoreSetupManager) this.A04, null, null, this, null);
            case 27:
                A03(obj, this);
                return BlockStoreSetupManager.A01((BlockStoreSetupManager) this.A04, this, null);
            case 28:
                A03(obj, this);
                return BlockStoreSetupManager.A02((BlockStoreSetupManager) this.A04, this, null);
            case 29:
                A03(obj, this);
                return GoogleAuthController.A08(null, null, (GoogleAuthController) this.A04, this);
            case 30:
                A03(obj, this);
                return GoogleDriveViewData.A04(null, (GoogleDriveViewData) this.A04, null, this);
            case 31:
                A03(obj, this);
                return GoogleDriveViewData.A05(null, (GoogleDriveViewData) this.A04, this);
            case 32:
                A03(obj, this);
                return ((GoogleDriveViewData) this.A04).A0B(null, this);
            case 33:
                A03(obj, this);
                return ((GoogleDriveViewData) this.A04).A0A(null, null, this, null, false);
            case 34:
                A03(obj, this);
                return EbOneTimeCodeRestoreViewData.A00((EbOneTimeCodeRestoreViewData) this.A04, this, null);
            case 35:
                A03(obj, this);
                return ((EbPasskeyRestoreApi) this.A04).A09(null, this);
            case 36:
                A03(obj, this);
                return EbPasskeySetupApi.A03(null, null, (EbPasskeySetupApi) this.A04, this);
            case 38:
                A03(obj, this);
                return ((AI6) this.A04).A01(null, this);
            case 39:
                A03(obj, this);
                return ((HTMomentCardMetadataGraphQLFetcher) this.A04).A00(null, null, this);
            case 40:
                A03(obj, this);
                return OnDeviceMemoriesController.A00(null, (OnDeviceMemoriesController) this.A04, null, this);
            case 41:
                A03(obj, this);
                return MagicModGenerateImageService.A00(null, null, null, (MagicModGenerateImageService) this.A04, null, this);
            case 42:
                A03(obj, this);
                return MagicModUploadImageService.A01(null, null, (MagicModUploadImageService) this.A04, null, this);
            case 43:
                A03(obj, this);
                return ((AI1) this.A04).emit(null, this);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A03(obj, this);
                return RsysBridge.A00((RsysBridge) this.A04, null, this);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A03(obj, this);
                return ((AI6) this.A04).emit(null, this);
            case 46:
                A03(obj, this);
                return InAppPurchaseControllerCoro.A03((InAppPurchaseControllerCoro) this.A04, null, this);
            case ActionId.ON_START_END /* 47 */:
                A03(obj, this);
                return ((QPSdkOnDemandSurfaceController) this.A04).A04(null, null, null, null, null, this);
            case ActionId.QUEUED /* 48 */:
                A03(obj, this);
                return ((MessengerMetaAiRsysDelegate) this.A04).A00(null, this);
            default:
                A03(obj, this);
                return ((JobQueue) this.A04).A00(this, null);
        }
    }
}
