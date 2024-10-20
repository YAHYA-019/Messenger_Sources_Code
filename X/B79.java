package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;

/* loaded from: B79.class */
public final class B79 extends AbstractC1522Aka {
    public static final String __redex_internal_original_name = "M4OmnipickerNameYourChatFragment";
    public int A00;
    public 1Iw A01;
    public LithoView A02;
    public Bg3 A03;
    public M4OmnipickerParam A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public 5xF A08;
    public final DI6 A0B = new Co9(this, 4);
    public final 9Ae A0C = new BCu(this);
    public final Bg4 A0A = new Bg4(this);
    public final C00i A09 = new 1HH(this, 100189);
    public final ArrayList A0D = AnonymousClass001.A0s();

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(B79 b79) {
        LithoView lithoView = b79.A02;
        C1841Aue c1841Aue = new C1841Aue(b79.A01, new C1997Ayq());
        ImmutableList copyOf = ImmutableList.copyOf((Collection) b79.A0D);
        C1997Ayq c1997Ayq = c1841Aue.A01;
        c1997Ayq.A05 = copyOf;
        BitSet bitSet = c1841Aue.A02;
        bitSet.set(6);
        int A01 = b79.A04.A01();
        C1qo c1qo = ((C1rs) c1841Aue).A02;
        c1997Ayq.A07 = c1qo.A0D(A01);
        bitSet.set(3);
        c1997Ayq.A06 = c1qo.A0D(b79.A04.A00());
        bitSet.set(1);
        c1997Ayq.A02 = b79.A0B;
        bitSet.set(2);
        c1997Ayq.A03 = b79.A0C;
        bitSet.set(7);
        String str = b79.A05;
        c1997Ayq.A08 = str;
        bitSet.set(4);
        c1997Ayq.A0A = b79.A04.A0T;
        int i = 0;
        c1997Ayq.A09 = !1JF.A0A(str) || (!b79.A07 && b79.A04.A0T);
        bitSet.set(5);
        c1997Ayq.A04 = AbK.A0h(b79);
        bitSet.set(0);
        if (b79.A07) {
            i = b79.A00;
        }
        c1997Ayq.A00 = i;
        c1997Ayq.A01 = b79.A0A;
        7zP.A17(c1841Aue, bitSet, c1841Aue.A03);
        lithoView.A0x(c1997Ayq);
    }

    public 1iF A1R() {
        return AbJ.A0D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A04 = (M4OmnipickerParam) requireArguments().getParcelable("omnipicker_param");
        this.A0D.addAll(requireArguments().getParcelableArrayList("prepicked_users"));
        this.A05 = bundle != null ? bundle.getString("group_name_key") : this.A04.A0B;
        this.A07 = bundle != null ? bundle.getBoolean("is_tincan_mode_on") : this.A04.A0L;
        FbUserSession A0G = 1BL.A0G(this);
        C25e c25e = (C25e) 7zN.A0m(this, A0G, 16892);
        if (c25e != null) {
            1Kd.A0F(D4q.A00(this, 66), c25e.A04(), 2eQ.A01);
        } else {
            0fH.A0j("OmnipickrNameChatFrag", "SecureMessageOverWAMailbox is null");
            this.A00 = 25;
        }
        1Bn.A0A(83616);
        this.A08 = new 5xF(requireContext(), A0G, 53M.A0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1686706997);
        Context context = getContext();
        this.A01 = 7zL.A0W(context);
        this.A02 = 7zO.A0V(context);
        A06(this);
        this.A02.setImportantForAccessibility(1);
        LithoView lithoView = this.A02;
        0FI.A08(-262704295, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-372370991);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(-1845310711, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("group_name_key", this.A05);
        bundle.putBoolean("is_tincan_mode_on", this.A07);
    }
}
