package X;

import android.content.Context;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbavatar.sticker.fetch.MsgrAvatarStickerDataSource;
import com.facebook.games.nativetos.GamingLoginNativeToSFragment;
import com.facebook.games.nativetos.kcomponents.GamingLoginNativeToSComponent;
import com.facebook.games.nativetos.kcomponents.GamingLoginNativeToSProfileCardComponent;
import com.facebook.messaging.aibot.botpicker.ugcbot.creation.AiBotCreationService;
import com.facebook.messaging.aibot.memory.graphql.ManageAiMemoryService;
import com.facebook.messaging.aibot.voice.viewcreator.setting.AiVoiceSettingFetchAndMutateService;
import com.facebook.messaging.avatar.avatardetail.repository.AvatarDetailConfigRepository;
import com.facebook.messaging.avatar.avatardetail.usecases.SendAvatarDetailMessage;
import com.facebook.messaging.cuckoo.thirdpartychats.mvvm.model.ThirdPartyAppsSettingsRepository;
import com.facebook.messaging.encryptedbackups.autobackup.restore.AutoBackupRestoreManager;
import com.facebook.messaging.highlightstab.immersivefeatures.plugins.immersivecardviews.birthday.BirthdayRepository;
import com.facebook.messaging.magicmessenger.threadintent.service.ThreadIntentService;
import com.facebook.messaging.msys.thread.aibot.nullstate.network.AISuggestedPromptsFetcher;
import com.facebook.messaging.msys.thread.aibot.nullstate.network.AiCardStackFetcher;
import com.facebook.messaging.msys.thread.aibot.nullstate.network.AiCardsSessionNetworkManager;
import com.facebook.messaging.msys.thread.aibot.nux.network.AiNuxConsentStatusNetworkHelper;
import com.facebook.messaging.msys.thread.writewithai.service.WriteWithAiService;
import com.facebook.payments.dcp.xapp.cache.InAppPurchaseQuoteCache;
import com.facebook.quickpromotion.ondemand.OnDemandControllerManager;
import com.facebook.rp.platform.stunconnectionchecker.StunConnectionChecker;
import com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository;
import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.promptsheet.service.PromptSheetAINetworkService;
import com.meta.metaai.shared.feedback.data.FeedbackRepository;
import com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService;

/* loaded from: AId.class */
public final class AId extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AId(int i, 0DR r303) {
        super(r303);
        this.A03 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AId(Object obj, 0DR r303, int i) {
        super(r303);
        this.A03 = i;
        this.A02 = obj;
    }

    public static Object A01(Context context, C3s4 c3s4, AId aId) {
        C00s.A00();
        1FV A09 = 1VX.A0D(context).A09(c3s4);
        aId.A00 = 1;
        return 4kH.A00(A09, aId);
    }

    public static void A02(Object obj, AId aId) {
        aId.A01 = obj;
        aId.A00 |= (-1) << (-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.AId) r302).A03 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.AId
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.AId r0 = (X.AId) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A03
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
        throw new UnsupportedOperationException("Method not decompiled: X.AId.A03(int, java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public final Object invokeSuspend(Object obj) {
        Object A01;
        switch (this.A03) {
            case 0:
                this.A02 = obj;
                this.A00 |= (-1) << (-1);
                return ForEachGestureKt.A00(null, this);
            case 1:
                this.A02 = obj;
                this.A00 |= (-1) << (-1);
                return TapGestureDetectorKt.A02(null, this);
            case 2:
                A02(obj, this);
                return ((NestedScrollDispatcher) this.A02).A02(this, 0L, 0L);
            case 3:
                A02(obj, this);
                return ((NestedScrollDispatcher) this.A02).A01(this, 0L);
            case 4:
                A02(obj, this);
                return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) this.A02).DAl(this, null, 0L);
            case 5:
                A02(obj, this);
                return ((MsgrAvatarStickerDataSource) this.A02).A00(null, null, null, null, this, 0, false, false, false);
            case 6:
                A02(obj, this);
                return GamingLoginNativeToSFragment.A03((GamingLoginNativeToSFragment) this.A02, this);
            case 7:
                A02(obj, this);
                return GamingLoginNativeToSComponent.A0N(null, null, null, (GamingLoginNativeToSComponent) this.A02, null, this);
            case 8:
                A02(obj, this);
                return GamingLoginNativeToSComponent.A0O(null, null, null, (GamingLoginNativeToSComponent) this.A02, null, this);
            case 9:
                A02(obj, this);
                return GamingLoginNativeToSProfileCardComponent.A01(null, null, (GamingLoginNativeToSProfileCardComponent) this.A02, this);
            case 10:
                A02(obj, this);
                return ((AiBotCreationService) this.A02).A01(null, null, null, null, null, null, null, null, null, null, null, this);
            case 11:
                A02(obj, this);
                return ((ManageAiMemoryService) this.A02).A00(null, this);
            case 12:
                A02(obj, this);
                return ((ManageAiMemoryService) this.A02).A01(null, this);
            case 13:
                A02(obj, this);
                return ((AiVoiceSettingFetchAndMutateService) this.A02).A01(null, this);
            case 14:
                A02(obj, this);
                return AvatarDetailConfigRepository.A02((AvatarDetailConfigRepository) this.A02, null, this);
            case 15:
                A02(obj, this);
                return AvatarDetailConfigRepository.A00((AvatarDetailConfigRepository) this.A02, null, null, this);
            case 16:
                A02(obj, this);
                A01 = SendAvatarDetailMessage.A01(null, null, (SendAvatarDetailMessage) this.A02, this);
                if (A01 != 0Ds.A02) {
                    return new 0DU(A01);
                }
                return A01;
            case 17:
                A02(obj, this);
                return ((ThirdPartyAppsSettingsRepository) this.A02).A02(null, this, false);
            case 18:
                A02(obj, this);
                return ((ThirdPartyAppsSettingsRepository) this.A02).A06(this);
            case 19:
                A02(obj, this);
                return AutoBackupRestoreManager.A00((AutoBackupRestoreManager) this.A02, this);
            case 20:
                A02(obj, this);
                return AutoBackupRestoreManager.A01((AutoBackupRestoreManager) this.A02, this);
            case 21:
                A02(obj, this);
                return ((BirthdayRepository) this.A02).A01(null, null, null, null, this);
            case 22:
                A02(obj, this);
                return ((BirthdayRepository) this.A02).A02(null, null, null, this);
            case 23:
                A02(obj, this);
                return ((ThreadIntentService) this.A02).A01(null, null, this);
            case 24:
                A02(obj, this);
                return ((AISuggestedPromptsFetcher) this.A02).A00(null, null, this, 0);
            case 25:
                A02(obj, this);
                return ((AiCardStackFetcher) this.A02).A01(null, this);
            case 26:
                A02(obj, this);
                return ((AiCardsSessionNetworkManager) this.A02).A01(null, this);
            case 27:
                A02(obj, this);
                return ((AiCardsSessionNetworkManager) this.A02).A00(null, null, this);
            case 28:
                A02(obj, this);
                return ((AiNuxConsentStatusNetworkHelper) this.A02).A02(null, this, 0);
            case 29:
                A02(obj, this);
                return ((AiNuxConsentStatusNetworkHelper) this.A02).A00(null, this);
            case 30:
                A02(obj, this);
                return ((AiNuxConsentStatusNetworkHelper) this.A02).A01(null, this);
            case 31:
                A02(obj, this);
                return WriteWithAiService.A02(null, null, null, null, (WriteWithAiService) this.A02, this);
            case 32:
                A02(obj, this);
                return WriteWithAiService.A03(null, null, (WriteWithAiService) this.A02, this);
            case 33:
                A02(obj, this);
                return ((InAppPurchaseQuoteCache) this.A02).A01(null, this);
            case 34:
                A02(obj, this);
                return ((OnDemandControllerManager) this.A02).A00(null, null, null, this, null);
            case 35:
                this.A02 = obj;
                this.A00 |= (-1) << (-1);
                return AJf.A01(null, this);
            case 36:
                A02(obj, this);
                return StunConnectionChecker.A00((StunConnectionChecker) this.A02, this, 0, 0);
            case 37:
                A02(obj, this);
                return ((ECPCheckoutSetupMutationAPI) this.A02).A00((String) null, (String) null, (String) null, (String) null, this);
            case 38:
                A02(obj, this);
                return ((ImagineGenerationImageRepository) this.A02).A00(null, null, null, this);
            case 39:
                A02(obj, this);
                return ((MEmuDataRepository) this.A02).A01(null, null, null, this, false, false);
            case 40:
                A02(obj, this);
                return ((MEmuDataRepository) this.A02).A00(null, this);
            case 41:
                A02(obj, this);
                return ((MEmuNetworkService) this.A02).A03(this, null);
            case 42:
                A02(obj, this);
                return ((MEmuNetworkService) this.A02).A01(null, this);
            case 43:
                A02(obj, this);
                return ((ImagineNetworkService) this.A02).A07(null, this);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A02(obj, this);
                return ((ImagineNetworkService) this.A02).A08(null, this);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A02(obj, this);
                return ((ImagineNetworkService) this.A02).A09(null, this);
            case 46:
                A02(obj, this);
                return ((ImagineNetworkService) this.A02).A01(null, this);
            case ActionId.ON_START_END /* 47 */:
                A02(obj, this);
                return ((PromptSheetAINetworkService) this.A02).A00(null, this);
            case ActionId.QUEUED /* 48 */:
                A02(obj, this);
                return ((FeedbackRepository) this.A02).A00(null, null, null, this);
            default:
                A02(obj, this);
                A01 = ((MetaAIFeedbackNetworkService) this.A02).A00(null, null, null, null, null, this);
                return A01;
        }
    }
}
