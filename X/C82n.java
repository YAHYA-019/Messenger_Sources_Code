package X;

import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.messaging.avatar.stickersuggestions.repository.StickerSuggestionsRepository;

/* renamed from: X.82n, reason: invalid class name */
/* loaded from: 82n.class */
public final class C82n extends 0DP {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82n(Object obj, 0DR r303, int i) {
        super(r303);
        this.A02 = i;
        this.A03 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        Object A01;
        int i = this.A02;
        this.A01 = obj;
        this.A00 |= (-1) << (-1);
        if (i != 0) {
            A01 = ((StickerSuggestionsRepository) this.A03).A00(null, null, this);
        } else {
            A01 = ((AvatarConfigRepository) this.A03).A01(this);
            if (A01 != 0Ds.A02) {
                return new 0DU(A01);
            }
        }
        return A01;
    }
}
