package X;

import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import androidx.compose.ui.scrollcapture.RelativeScroller;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.account.login.helper.credentialmanager.CredentialManagerFetchHelper;
import com.facebook.account.login.helper.credentialmanager.CredentialManagerSaveHelper;
import com.facebook.acra.constants.ActionId;
import com.facebook.caa.shared.passkey.PasskeyService;
import com.facebook.fbavatar.artifacto.AvatarArtifactRepository;
import com.facebook.messaging.aibot.botpicker.ugcbot.services.UgcAiBotPickerFetchSectionService;
import com.facebook.messaging.aibot.botpicker.ugcbot.services.UgcAiBotPickerFetchService;
import com.facebook.messaging.aibot.botpicker.ugcbot.services.UgcAiBotSearchService;
import com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel;
import com.facebook.messaging.avatar.avatardetail.repository.PoseRepository;
import com.facebook.messaging.avatar.avatardetail.usecases.CreateAvatarDetailsImageHelper;
import com.facebook.messaging.avatar.avatardetail.usecases.SendAvatarDetailMessage;
import com.facebook.messaging.avatar.stickersuggestions.datasource.IntentStickerFetcher;
import com.facebook.messaging.common.bitmaps.BitmapUtil;
import com.facebook.messaging.cuckoo.thirdpartychats.mvvm.model.ThirdPartyAppsSettingsRepository;
import com.facebook.messaging.cuckoo.threadcreation.mvvm.model.InteropAppRepository;
import com.facebook.messaging.encryptedbackups.appjob.EncryptedBackupsAutoRestoreStartupJob;
import com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob;
import com.facebook.messaging.encryptedbackups.autobackup.setup.AutoBackupSetupManager;
import com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData;
import com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData;
import com.facebook.messaging.encryptedbackups.passkey.devoptions.EbPasskeyDeveloperViewData;

/* loaded from: AIe.class */
public final class AIe extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIe(int i, 0DR r303) {
        super(r303);
        this.A04 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIe(Object obj, 0DR r303, int i) {
        super(r303);
        this.A04 = i;
        this.A03 = obj;
    }

    public static AIe A01(Object obj, 0DR r302, int i) {
        return new AIe(obj, r302, i);
    }

    public static void A02(Object obj, AIe aIe) {
        aIe.A02 = obj;
        aIe.A00 |= (-1) << (-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.AIe) r302).A04 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.AIe
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.AIe r0 = (X.AIe) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A04
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
        throw new UnsupportedOperationException("Method not decompiled: X.AIe.A03(int, java.lang.Object):boolean");
    }

    public final Object invokeSuspend(Object obj) {
        Object fetchCredential;
        switch (this.A04) {
            case 0:
                A02(obj, this);
                return HoverableNode.A01((HoverableNode) this.A03, this);
            case 1:
                A02(obj, this);
                return DragGestureNode.A02((DragGestureNode) this.A03, this);
            case 2:
                A02(obj, this);
                return ((PressGestureScopeImpl) this.A03).A00(this);
            case 3:
                A02(obj, this);
                return ((PressGestureScopeImpl) this.A03).D5G(this);
            case 4:
                this.A03 = obj;
                this.A00 |= (-1) << (-1);
                return ScrollableKt.A00(null, this, 0L);
            case 5:
                A02(obj, this);
                return ((ScrollingLogic) this.A03).A05(this, 0L);
            case 6:
                this.A03 = obj;
                this.A00 |= (-1) << (-1);
                return TapGestureDetectorKt.A00(null, null, this);
            case 7:
                A02(obj, this);
                return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) this.A03).DAk(this, null, 0L);
            case 8:
                A02(obj, this);
                return RelativeScroller.A00((RelativeScroller) this.A03, this, 0.0f);
            case 9:
                A02(obj, this);
                return ((CoroutineLiveData) this.A03).clearSource$lifecycle_livedata_release(this);
            case 10:
                A02(obj, this);
                fetchCredential = ((CredentialManagerFetchHelper) this.A03).fetchCredential(this);
                return fetchCredential;
            case 11:
                A02(obj, this);
                return CredentialManagerSaveHelper.A00((CredentialManagerSaveHelper) this.A03, null, null, this);
            case 12:
                A02(obj, this);
                return PasskeyService.A01((PasskeyService) this.A03, this, null);
            case 13:
                A02(obj, this);
                return ((AvatarArtifactRepository) this.A03).A02(null, null, null, this, 0);
            case 14:
            case 15:
            case 18:
            case 19:
            case 31:
                A02(obj, this);
                return ((AI6) this.A03).emit(null, this);
            case 16:
            case 17:
            default:
                A02(obj, this);
                return ((AI7) this.A03).emit(null, this);
            case 20:
                A02(obj, this);
                return ((UgcAiBotPickerFetchSectionService) this.A03).A00(null, null, this, false);
            case 21:
                A02(obj, this);
                return ((UgcAiBotPickerFetchService) this.A03).A00(null, this);
            case 22:
                A02(obj, this);
                return ((UgcAiBotSearchService) this.A03).A00(null, null, this);
            case 23:
                A02(obj, this);
                return AvatarDetailActivityViewModel.A03((AvatarDetailActivityViewModel) this.A03, this);
            case 24:
                A02(obj, this);
                return PoseRepository.A00((PoseRepository) this.A03, null, this);
            case 25:
                A02(obj, this);
                return ((CreateAvatarDetailsImageHelper) this.A03).A00(null, null, this);
            case 26:
                A02(obj, this);
                return SendAvatarDetailMessage.A00(null, null, (SendAvatarDetailMessage) this.A03, null, this);
            case 27:
                A02(obj, this);
                return ((IntentStickerFetcher) this.A03).ASA(this, false);
            case 28:
                A02(obj, this);
                return ((IntentStickerFetcher) this.A03).ASH(null, this, false);
            case 29:
                A02(obj, this);
                return ((AI7) this.A03).A01(this);
            case 30:
                A02(obj, this);
                return ((BitmapUtil) this.A03).A07(null, this);
            case 32:
                A02(obj, this);
                return ((ThirdPartyAppsSettingsRepository) this.A03).A03(this);
            case 33:
                A02(obj, this);
                return ((ThirdPartyAppsSettingsRepository) this.A03).A04(this);
            case 34:
                A02(obj, this);
                return ((ThirdPartyAppsSettingsRepository) this.A03).A05(this);
            case 35:
                A02(obj, this);
                return ((ThirdPartyAppsSettingsRepository) this.A03).A08(this);
            case 36:
                A02(obj, this);
                return ((AI7) this.A03).A02(this, false);
            case 37:
                A02(obj, this);
                return ((InteropAppRepository) this.A03).A01(this);
            case 38:
                A02(obj, this);
                return ((EncryptedBackupsAutoRestoreStartupJob) this.A03).A00(this);
            case 39:
                A02(obj, this);
                return IntegrityCheckStartupJob.A07(null, (IntegrityCheckStartupJob) this.A03, this);
            case 40:
                A02(obj, this);
                return AutoBackupSetupManager.A02((AutoBackupSetupManager) this.A03, this);
            case 41:
                A02(obj, this);
                return ((AutoBackupSetupManager) this.A03).A03(this);
            case 42:
                A02(obj, this);
                return ((AutoBackupSetupManager) this.A03).A04(this);
            case 43:
                A02(obj, this);
                return ((GoogleDriveViewData) this.A03).A0D(null, this);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A02(obj, this);
                return GoogleDriveViewData.A03(null, (GoogleDriveViewData) this.A03, this);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A02(obj, this);
                return GoogleDriveViewData.A02(null, (GoogleDriveViewData) this.A03, this);
            case 46:
                A02(obj, this);
                return ((GoogleDriveViewData) this.A03).A0E(null, this);
            case ActionId.ON_START_END /* 47 */:
                A02(obj, this);
                return ((EncryptedBackupsNuxViewData) this.A03).A01(this, null, 0L);
            case ActionId.QUEUED /* 48 */:
                A02(obj, this);
                return ((EbPasskeyDeveloperViewData) this.A03).A00(null, this);
        }
    }
}
