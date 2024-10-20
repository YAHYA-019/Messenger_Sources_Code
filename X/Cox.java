package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* loaded from: Cox.class */
public final class Cox implements 2JM {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ B7c A02;

    public Cox(B7c b7c) {
        this.A02 = b7c;
    }

    public String BGe() {
        return "LobbySharedViewModelImpl";
    }

    public void C7K(2JS r302) {
        11T.A0F(r302, 0);
        CallModel A02 = GS1.A02(r302);
        boolean A0G = IFr.A0G(A02);
        if (A0G != this.A00) {
            this.A00 = A0G;
            B7c b7c = this.A02;
            MutableLiveData mutableLiveData = b7c.A00;
            C1796At5 A00 = B7c.A00(b7c);
            boolean z = A00.A0K;
            boolean z2 = A00.A0R;
            boolean z3 = A00.A0T;
            boolean z4 = A00.A0W;
            int i = A00.A01;
            String str = A00.A0D;
            UserKey userKey = A00.A07;
            String str2 = A00.A0B;
            ImmutableList immutableList = A00.A08;
            java.util.Map map = A00.A0J;
            int i2 = A00.A00;
            String str3 = A00.A0C;
            String str4 = A00.A0F;
            String str5 = A00.A0E;
            boolean z5 = A00.A0S;
            int i3 = A00.A02;
            2JX r0 = A00.A03;
            boolean z6 = A00.A0U;
            2JX r02 = A00.A04;
            boolean z7 = A00.A0L;
            boolean z8 = A00.A0Q;
            mutableLiveData.postValue(new C1796At5(r0, r02, A00.A06, A00.A05, userKey, immutableList, A00.A09, A00.A0A, str, str2, str3, str4, str5, A00.A0I, A00.A0G, A00.A0H, map, i, i2, i3, z, z2, z3, z4, z5, z6, z7, z8, A00.A0O, A00.A0P, A0G, A00.A0M, A00.A0V));
        }
        boolean z9 = !IFr.A0F(A02);
        if (z9 != this.A01) {
            this.A01 = z9;
            B7c b7c2 = this.A02;
            MutableLiveData mutableLiveData2 = b7c2.A00;
            C1796At5 A002 = B7c.A00(b7c2);
            boolean z10 = A002.A0K;
            boolean z11 = A002.A0R;
            boolean z12 = A002.A0W;
            int i4 = A002.A01;
            String str6 = A002.A0D;
            UserKey userKey2 = A002.A07;
            String str7 = A002.A0B;
            ImmutableList immutableList2 = A002.A08;
            java.util.Map map2 = A002.A0J;
            int i5 = A002.A00;
            String str8 = A002.A0C;
            String str9 = A002.A0F;
            String str10 = A002.A0E;
            boolean z13 = A002.A0S;
            int i6 = A002.A02;
            2JX r03 = A002.A03;
            boolean z14 = A002.A0U;
            2JX r04 = A002.A04;
            boolean z15 = A002.A0L;
            boolean z16 = A002.A0Q;
            mutableLiveData2.postValue(new C1796At5(r03, r04, A002.A06, A002.A05, userKey2, immutableList2, A002.A09, A002.A0A, str6, str7, str8, str9, str10, A002.A0I, A002.A0G, A002.A0H, map2, i4, i5, i6, z10, z11, z9, z12, z13, z14, z15, z16, A002.A0O, A002.A0P, A002.A0N, A002.A0M, A002.A0V));
        }
    }
}
