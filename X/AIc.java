package X;

import com.facebook.messaging.aibot.botpicker.ugcbot.creation.AiBotCreationService;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi;
import com.facebook.messaging.highlightstab.immersivefeatures.plugins.immersivecardviews.birthday.BirthdayRepository;
import com.facebook.messaging.highlightstab.immersivefeatures.plugins.immersivecardviews.birthday.BirthdayViewModel$queryBirthdaySuggestions$2$invokeSuspend$$inlined$map$1$2;
import com.facebook.messaging.highlightstab.xsharelibraries.creation.loader.HTMomentCardMetadataManager;
import com.facebook.messaging.magicmessenger.threadintent.service.ThreadIntentService;
import com.facebook.messaging.msys.advancedcrypto.threadsettings.AdvancedCryptoThreadOpener;
import com.facebook.messaging.msys.thread.writewithai.service.WriteWithAiService;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;

/* loaded from: AIc.class */
public final class AIc extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIc(Object obj, 0DR r303, int i) {
        super(r303);
        this.A06 = i;
        this.A07 = obj;
    }

    public static void A01(Object obj, Object obj2, Object obj3, Object obj4, AIc aIc) {
        aIc.A01 = obj;
        aIc.A02 = obj2;
        aIc.A03 = obj3;
        aIc.A04 = obj4;
    }

    public static void A02(Object obj, AIc aIc) {
        aIc.A05 = obj;
        aIc.A00 |= (-1) << (-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.AIc) r302).A06 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.AIc
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.AIc r0 = (X.AIc) r0
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
        throw new UnsupportedOperationException("Method not decompiled: X.AIc.A03(int, java.lang.Object):boolean");
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        A02(obj, this);
        switch (i) {
            case 0:
                return ((AI1) this.A07).emit(null, this);
            case 1:
                return ((AiBotCreationService) this.A07).A00(null, null, null, null, this);
            case 2:
                return GoogleAuthController.A02(null, null, (GoogleAuthController) this.A07, this);
            case 3:
                return GoogleAuthController.A05(null, null, (GoogleAuthController) this.A07, null, this, false);
            case 4:
                return GoogleAuthController.A03(null, null, null, (GoogleAuthController) this.A07, this);
            case 5:
                return GoogleAuthController.A04(null, null, null, (GoogleAuthController) this.A07, this);
            case 6:
                return ((EbPasskeyRestoreApi) this.A07).A08(null, null, this);
            case 7:
                return ((BirthdayRepository) this.A07).A00(null, null, null, null, this);
            case 8:
                return ((BirthdayViewModel$queryBirthdaySuggestions$2$invokeSuspend$$inlined$map$1$2) this.A07).emit(null, this);
            case 9:
                return ((HTMomentCardMetadataManager) this.A07).A00(null, null, this);
            case 10:
                return ((ThreadIntentService) this.A07).A00(null, null, null, this);
            case 11:
                return AdvancedCryptoThreadOpener.A00(null, (AdvancedCryptoThreadOpener) this.A07, null, null, null, this);
            case 12:
                return WriteWithAiService.A00(null, null, null, null, null, (WriteWithAiService) this.A07, this);
            case 13:
                return WriteWithAiService.A01(null, null, null, null, null, (WriteWithAiService) this.A07, this);
            case 14:
                return NotesCreationFragment.A03((NotesCreationFragment) this.A07, null, this);
            case 15:
                return ECPRepositoryImpl.A00((ECPRepositoryImpl) this.A07, null, null, null, null, this);
            case 16:
                return ((WriteSuggestionsRepository) this.A07).A02(null, null, null, null, this);
            case 17:
                return ((WriteSuggestionsRepository) this.A07).A03(null, null, null, null, this);
            case 18:
                return ((WriteSuggestionsRepository) this.A07).A05(this);
            default:
                return LA4.A00((0rY) null, this, (LA4) this.A07);
        }
    }
}
