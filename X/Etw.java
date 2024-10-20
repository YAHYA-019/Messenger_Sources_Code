package X;

import com.facebook.messaging.data.repository.sharedmedia.SharedMediaDataModel;
import com.google.common.collect.ImmutableList;

/* loaded from: Etw.class */
public final class Etw {
    public final /* synthetic */ SharedMediaDataModel A00;
    public final /* synthetic */ E1E A01;
    public final /* synthetic */ String A02;

    public Etw(SharedMediaDataModel sharedMediaDataModel, E1E e1e, String str) {
        this.A01 = e1e;
        this.A00 = sharedMediaDataModel;
        this.A02 = str;
    }

    public void A00(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        E1E e1e = this.A01;
        ImmutableList A0a = 1BL.A0a(immutableList);
        String str = this.A02;
        ImmutableList.of();
        e1e.A00(new SharedMediaDataModel(A0a, str, "SUCCESS"));
    }
}
