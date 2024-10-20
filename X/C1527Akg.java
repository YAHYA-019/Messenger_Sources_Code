package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.customthreads.threadsettings.nicknames.SetNicknameLiveDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashSet;

/* renamed from: X.Akg, reason: case insensitive filesystem */
/* loaded from: Akg.class */
public final class C1527Akg extends 1pK {
    public static final String __redex_internal_original_name = "ThreadNicknamesFragment";
    public 1pI A00;
    public LithoView A01;
    public SetNicknameLiveDialogFragment A02;
    public Bwe A03;
    public final C00i A05 = 1BQ.A02(83099);
    public final C00i A06 = AbF.A0S(this, 83162);
    public final C00i A04 = 1BQ.A02(50079);

    public 1iF A1R() {
        return AbF.A0C(442780740380519L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof SetNicknameLiveDialogFragment) {
            SetNicknameLiveDialogFragment setNicknameLiveDialogFragment = (SetNicknameLiveDialogFragment) fragment;
            0fH.A0j(__redex_internal_original_name, "setCallbacks for SetNicknameLiveDialogFragment");
            setNicknameLiveDialogFragment.A03 = new CjS(this);
            setNicknameLiveDialogFragment.A02 = new CjQ(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-110632872);
        LithoView A0M = 7zR.A0M(this);
        this.A01 = A0M;
        A0M.setId(2131365978);
        FbUserSession A0G = 1BL.A0G(this);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(401);
        Context context = getContext();
        Parcelable A0B = AbM.A0B(this);
        A0B.getClass();
        ThreadKey threadKey = (ThreadKey) A0B;
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Bwe bwe = new Bwe(context, threadKey);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = bwe;
            bwe.A01.observe(this, new CaD(this, A0G, 29));
            LithoView lithoView = this.A01;
            0FI.A08(-1024478349, A02);
            return lithoView;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(91591087);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        C6pD c6pD = (C6pD) this.A05.get();
        BLl bLl = BLl.A06;
        HashSet hashSet = c6pD.A01;
        if (hashSet.contains(bLl) && !hashSet.contains(BLl.A05)) {
            hashSet.add(BLl.A04);
            synchronized (1Br.A0B(c6pD.A00)) {
            }
        }
        0FI.A08(-2044121167, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = 1vD.A00(view);
    }
}
