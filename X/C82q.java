package X;

import com.facebook.mantle.messenger.manager.MessengerRecommendationProvider;
import com.facebook.messaging.composer.avatar.StickerSuggestionsController;
import com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob;

/* renamed from: X.82q, reason: invalid class name */
/* loaded from: 82q.class */
public final class C82q extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82q(Object obj, 0DR r303, int i) {
        super(r303);
        this.A05 = i;
        this.A06 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        this.A04 = obj;
        this.A00 |= (-1) << (-1);
        switch (i) {
            case 0:
                return ((MessengerRecommendationProvider) this.A06).BCa(null, this);
            case 1:
                return StickerSuggestionsController.A00((StickerSuggestionsController) this.A06, null, this);
            case 2:
                return ((StickerSuggestionsController) this.A06).A02(null, null, null, null, this);
            default:
                return IntegrityCheckStartupJob.A03(null, (IntegrityCheckStartupJob) this.A06, this);
        }
    }
}
