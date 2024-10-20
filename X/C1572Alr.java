package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.Alr, reason: case insensitive filesystem */
/* loaded from: Alr.class */
public final class C1572Alr extends 1pK implements C00g, JGT {
    public static final String __redex_internal_original_name = "BugReporterConfirmationFragment";
    public FbUserSession A00;
    public JMS A01;
    public String A02;
    public final C01i A04 = C01g.A01(new J9p(this, 43));
    public List A03 = AnonymousClass001.A0s();

    public 1iF A1R() {
        return AbF.A0C(594492937905231L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BM.A01(this);
        Bundle requireArguments = requireArguments();
        ArrayList parcelableArrayList = requireArguments.getParcelableArrayList("RtcBugNubScreenshotUriKey");
        if (parcelableArrayList == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = parcelableArrayList;
        String string = requireArguments.getString("RtcBugNubCallKey");
        if (string == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = string;
    }

    public void ATi() {
        FEs.A01(FEs.A00((FEs) this.A04.getValue(), 0Pz.A0W("RTC", this.A02)));
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        this.A01 = HKy.A00(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        float floatValue;
        int A02 = 0FI.A02(-1073768627);
        1Iw A0T = 7zP.A0T(this);
        AvP avP = new AvP(A0T, new B0W());
        List list = this.A03;
        B0W b0w = avP.A01;
        b0w.A02 = list;
        BitSet bitSet = avP.A02;
        bitSet.set(2);
        Pair A022 = 2Dt.A02((Uri) list.get(0));
        if (A022 == null) {
            floatValue = 0.5625f;
        } else {
            float A03 = AnonymousClass001.A03(A022.first);
            Object obj = A022.second;
            11T.A09(obj);
            floatValue = A03 / ((Number) obj).floatValue();
        }
        b0w.A00 = floatValue;
        bitSet.set(0);
        b0w.A01 = new RH8(this);
        bitSet.set(1);
        C1rs.A03(bitSet, avP.A03);
        avP.A0J();
        LithoView A0I = AbN.A0I(b0w, A0T);
        0FI.A08(-1600697023, A02);
        return A0I;
    }
}
