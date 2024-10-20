package X;

import com.facebook.mantle.messenger.manager.MessengerRecommendationProvider;
import com.facebook.messaging.composer.avatar.StickerSuggestionsController$onStart$1$invokeSuspend$$inlined$filter$1$2;
import com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob;

/* renamed from: X.82p, reason: invalid class name */
/* loaded from: 82p.class */
public final class C82p extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82p(Object obj, 0DR r303, int i) {
        super(r303);
        this.A04 = i;
        this.A05 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A00 |= (-1) << (-1);
        Object obj2 = this.A05;
        switch (i) {
            case 0:
                return ((MessengerRecommendationProvider) obj2).BPD(null, this);
            case 1:
                return ((StickerSuggestionsController$onStart$1$invokeSuspend$$inlined$filter$1$2) obj2).emit(null, this);
            case 2:
                return IntegrityCheckStartupJob.A04(null, (IntegrityCheckStartupJob) obj2, this);
            default:
                return IntegrityCheckStartupJob.A05(null, (IntegrityCheckStartupJob) obj2, this);
        }
    }
}
