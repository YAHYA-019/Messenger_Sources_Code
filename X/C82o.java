package X;

import com.facebook.messaging.avatar.stickersuggestions.datasource.TheOneStickerFetcher;
import com.facebook.messaging.communitymessaging.unread.calculator.count.CommunityListUnreadCountsFlowFactory$create$$inlined$map$1$2;
import com.facebook.messaging.composer.avatar.StickerSuggestionsController;
import com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob;
import com.facebook.messaging.msys.thread.aibot.repository.MetaAiRepository;
import com.facebook.messaging.threadview.hintcard.presenter.HintCardPresenter$startSafetyInterventionListener$1$invokeSuspend$$inlined$mapNotNull$1$2;

/* renamed from: X.82o, reason: invalid class name */
/* loaded from: 82o.class */
public final class C82o extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82o(Object obj, 0DR r303, int i) {
        super(r303);
        this.A03 = i;
        this.A04 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.C82o) r302).A03 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.C82o
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.82o r0 = (X.C82o) r0
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
        throw new UnsupportedOperationException("Method not decompiled: X.C82o.A01(int, java.lang.Object):boolean");
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        this.A02 = obj;
        this.A00 |= (-1) << (-1);
        switch (i) {
            case 0:
                return ((TheOneStickerFetcher) this.A04).ASA(this, false);
            case 1:
                return ((CommunityListUnreadCountsFlowFactory$create$$inlined$map$1$2) this.A04).emit(null, this);
            case 2:
                return ((StickerSuggestionsController) this.A04).A03(null, this);
            case 3:
                return IntegrityCheckStartupJob.A01(null, (IntegrityCheckStartupJob) this.A04, this);
            case 4:
                return IntegrityCheckStartupJob.A02(null, (IntegrityCheckStartupJob) this.A04, this);
            case 5:
                return IntegrityCheckStartupJob.A06(null, (IntegrityCheckStartupJob) this.A04, this);
            case 6:
                return ((MetaAiRepository) this.A04).A00(null, this);
            case 7:
                return ((HintCardPresenter$startSafetyInterventionListener$1$invokeSuspend$$inlined$mapNotNull$1$2) this.A04).emit(null, this);
            default:
                return 5RT.A02(this, (5RT) this.A04);
        }
    }
}
