package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BrT.class */
public final class BrT {
    public final LiveData A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1De A03;

    public BrT(FbUserSession fbUserSession, 1De r303) {
        this.A03 = r303;
        this.A01 = fbUserSession;
        1Br A0S = 7zL.A0S(fbUserSession, r303, 65848);
        this.A02 = A0S;
        5dQ r0 = (5dQ) 1Br.A0B(A0S);
        MutableLiveData mutableLiveData = r0.A00;
        r0.A00 = mutableLiveData == null ? 7zL.A0H() : mutableLiveData;
        1Br.A0D(r0.A04, D4q.A00(r0, 13), (20V) 4YU.A0o(fbUserSession, r0.A01, 16891));
        MutableLiveData mutableLiveData2 = r0.A00;
        11T.A0I(mutableLiveData2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<com.facebook.advancedcryptotransport.model.PeerDevice>>");
        this.A00 = mutableLiveData2;
    }
}
