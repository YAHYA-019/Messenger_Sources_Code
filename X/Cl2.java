package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Cl2.class */
public final class Cl2 implements Aab {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C1553Al8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public Cl2(Uri uri, C1553Al8 c1553Al8, String str, String str2, String str3, boolean z) {
        this.A01 = c1553Al8;
        this.A03 = str;
        this.A00 = uri;
        this.A02 = str2;
        this.A04 = str3;
        this.A05 = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Al8] */
    @Override // X.Aab
    public void Bri(View view, String str) {
        ?? r0 = this.A01;
        C1553Al8.A03(r0, "copy_link");
        if (str != null) {
            CQN.A03(r0.requireContext(), view, 7zQ.A0m(r0.A05), str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, X.Al8] */
    @Override // X.Aab
    public void CF3(String str) {
        if (str != null) {
            C5xl A0V = AbK.A0V();
            ?? r0 = this.A01;
            ThreadKey threadKey = r0.A04;
            if (threadKey == null) {
                AbM.A17();
                throw 0Q8.createAndThrow();
            }
            AbH.A08(A0V, threadKey).observe(r0.getViewLifecycleOwner(), new Ca1(r0, this.A02, this.A04, str, this.A05));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Al8, java.lang.Object] */
    @Override // X.Aab
    public void CHB() {
        ?? r0 = this.A01;
        C1553Al8.A03(r0, "reset_link_button");
        String str = this.A02;
        C5ic A0l = 7zQ.A0l();
        Object A0l2 = 7zO.A0l((Fragment) r0, 16979);
        DR6 A02 = A0l.A02(r0.requireContext());
        AbG.A1E(7zO.A0D((Fragment) r0), A02, 2131954514);
        AbM.A1A(7zO.A0D((Fragment) r0), A02, 2131954511);
        A02.A0K(true);
        A02.A0G(new CR2(str, (Object) r0, 0), 7zO.A0D((Fragment) r0).getString(2131954512));
        CSG.A01(A02, 7zO.A0D((Fragment) r0).getString(2131954513), (Object) r0, 51);
        JZj A04 = A02.A04();
        A04.setOnShowListener(new CSN(1, A04, A0l2, (Object) r0));
        A04.show();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Al8] */
    @Override // X.Aab
    public void CKO(String str) {
        ?? r0 = this.A01;
        C1553Al8.A03(r0, "invite_button");
        if (str != null) {
            Context requireContext = r0.requireContext();
            C96j c96j = C96j.A03;
            11T.A0D(requireContext);
            String str2 = this.A03;
            CQN.A01(requireContext, this.A00, c96j, (ThreadKey) null, 4YV.A0j(), str, str2, "messenger", "community_invite_link_screen", this.A02, this.A04, (String) null, false, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Al8] */
    @Override // X.Aab
    public void CLD(String str) {
        ?? r0 = this.A01;
        C1553Al8.A03(r0, "share_link_button");
        if (str != null) {
            CQN.A04(r0.requireContext(), str);
        }
    }

    @Override // X.Aab
    public void CQl(boolean z) {
    }
}
