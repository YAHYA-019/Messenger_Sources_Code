package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.Al1, reason: case insensitive filesystem */
/* loaded from: Al1.class */
public final class C1548Al1 extends 1pK {
    public static final String __redex_internal_original_name = "UniversalSearchBlockPeoplePickerFragment";
    public BL3 A00;
    public Byt A01;
    public C00i A02;
    public LithoView A03;
    public final C00i A04 = AbH.A0c(this);
    public final C00i A05 = 1BV.A00(461);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(4LS r301, C1548Al1 c1548Al1, ImmutableList immutableList, boolean z) {
        Context context = c1548Al1.getContext();
        if (context == null) {
            7zR.A14(c1548Al1);
            return;
        }
        QDZ qdz = new QDZ(7zL.A0W(context), new QJ5());
        1LI r0 = qdz.A01;
        ((QJ5) r0).A00 = r301;
        BitSet bitSet = qdz.A02;
        bitSet.set(2);
        ((QJ5) r0).A03 = immutableList;
        bitSet.set(0);
        ((QJ5) r0).A01 = AbF.A0p(c1548Al1.A04);
        bitSet.set(1);
        ((QJ5) r0).A04 = z;
        bitSet.set(3);
        ((QJ5) r0).A02 = CxE.A00(c1548Al1, 99);
        bitSet.set(4);
        C1rs.A04(bitSet, qdz.A03);
        qdz.A0J();
        c1548Al1.A03.A0x(r0);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.Fragment, X.Al1] */
    public void A1E() {
        Object aeU;
        super.A1E();
        Byt byt = this.A01;
        if (!byt.A06) {
            byt.A03.getClass();
            byt.A03.A00.A0G(byt.A05);
            return;
        }
        ?? r0 = byt.A0D;
        A03(byt.A08, r0, ImmutableList.of(), true);
        Context A04 = AbG.A04((Fragment) r0, 148104);
        A04.getClass();
        FbUserSession fbUserSession = byt.A00;
        Cqz cqz = byt.A0C;
        CnL cnL = new CnL(byt);
        BL3 bl3 = byt.A02;
        BL3 bl32 = BL3.A01;
        byt.A01 = new C1308Adl(A04, fbUserSession, null, null, cnL, null, bl3 == bl32 ? 53M.A01 : 53M.A02, cqz, null);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(462);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            BnO bnO = new BnO(bl3);
            1Bn.A0K();
            FbInjector.A04(A01);
            Context A042 = AbG.A04((Fragment) r0, 84387);
            A042.getClass();
            CqU cqU = new CqU(A042, (LiveData) null, fbUserSession, (2YJ) null, BP5.A0R, bl3 == bl32 ? 53M.A01 : 53M.A02, (BhA) null, cqz, (Integer) null, (HashMap) null);
            DFd dFd = byt.A09;
            ImmutableList of = ImmutableList.of((Object) byt.A0B);
            Context context = r0.getContext();
            context.getClass();
            LinkedHashMap A1C = 1BK.A1C();
            CN4 cn4 = (CN4) 1Bn.A0E(context, (1BY) null, 83171);
            53M r02 = bnO.A01;
            C91 A02 = cn4.A02(r02);
            C4B c4b = (C4B) 1Bi.A03(84289);
            new B81(ClientDataSourceIdentifier.A0p);
            A1C.putAll(c4b.A00(fbUserSession, r02, A02));
            CIo cIo = new CIo(cqU, "block_people_search");
            cIo.A03(of);
            cIo.A09.m11011add((Object) B7u.A02);
            cIo.A0A.m11011add((Object) dFd);
            CIo.A00(cIo, A1C);
            bnO.A00.get();
            byt.A03 = new BnN(new C1320Ady(context, fbUserSession, cIo), bnO);
            C1F6 c1f62 = (C1F6) 1Bn.A0A(463);
            Context A012 = FbInjector.A01();
            AbL.A0y(c1f62);
            1Bn.A0K();
            FbInjector.A04(A012);
            byt.A01.getClass();
            ImmutableList of2 = ImmutableList.of((Object) byt.A0A);
            C1308Adl c1308Adl = byt.A01;
            Context context2 = r0.getContext();
            context2.getClass();
            CIo cIo2 = new CIo(c1308Adl, "block_people_search_null_state");
            cIo2.A03(of2);
            ImmutableList.Builder builder = ImmutableList.builder();
            if (bl3 == BL3.A02) {
                aeU = 1Bn.A0E(context2, (1BY) null, 147993);
            } else {
                1Bn.A0A(147994);
                aeU = new AeU(context2, fbUserSession, 53M.A01);
            }
            cIo2.A02(AbG.A0z(builder, aeU));
            1Bn.A0A(83179);
            new C1320Ady(context2, fbUserSession, cIo2).A0G(new C96(null, null, null, 0, 40, false, !AbJ.A0Z().A0O()));
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 1iF A1R() {
        return AbN.A0B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A02 = 1BV.A00(16838);
        if (bundle == null) {
            bundle = requireArguments();
        }
        String string = bundle.getString("block_people_type");
        string.getClass();
        this.A00 = BL3.valueOf(string);
        FbUserSession A0G = 1BL.A0G(this);
        C1F6 A0P = AbF.A0P(this.A05);
        BL3 bl3 = this.A00;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            Byt byt = new Byt(A0G, bl3, this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A01 = byt;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1748632366);
        FragmentActivity requireActivity = requireActivity();
        this.A03 = 7zO.A0V(requireActivity);
        Window window = requireActivity.getWindow();
        if (window != null) {
            ((1tC) 4YU.A0p(this.A02)).A03(window, AbF.A0p(this.A04));
        }
        LithoView lithoView = this.A03;
        0FI.A08(-1596366621, A02);
        return lithoView;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("block_people_type", this.A00.toString());
        super.onSaveInstanceState(bundle);
    }
}
