package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.emoji.composerwithtext.EmojiPickerBottomSheet;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.api.model.RichStatusTimestamp;
import com.facebook.presence.status.suggestions.StatusSuggestion;
import com.facebook.presence.status.ui.creation.StatusSuggestionLongClickBottomSheet;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.Emoji;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.All, reason: case insensitive filesystem */
/* loaded from: All.class */
public final class C1566All extends 1pK implements 1pN {
    public static final String __redex_internal_original_name = "SetStatusFragment";
    public InputMethodManager A00;
    public FbUserSession A01;
    public LithoView A02;
    public RichStatus A03;
    public RichStatusTimestamp A04;
    public StatusSuggestionLongClickBottomSheet A05;
    public Emoji A06;
    public Integer A07;
    public String A09;
    public final C2iw A0A = new Object();
    public final C2iw A0B = new Object();
    public String A08 = "user_created";

    public static final long A03(RichStatusTimestamp richStatusTimestamp) {
        return richStatusTimestamp.A01 == 0S2.A0C ? ((C90) 1Bn.A0A(83582)).A01(richStatusTimestamp.A00) : richStatusTimestamp.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CP2 A06(C1566All c1566All) {
        FbUserSession fbUserSession = c1566All.A01;
        if (fbUserSession != null) {
            return (CP2) 7zN.A0m(c1566All, fbUserSession, 83643);
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(View view, C1566All c1566All, int i) {
        1Bn.A0A(67527);
        DR6 A01 = C5ic.A01(4YU.A08(view), 7zS.A0j(c1566All));
        A01.A0D((DialogInterface.OnClickListener) null, 2131962839);
        A01.A06(i);
        7zN.A13(A01);
    }

    public static final void A08(LithoView lithoView, RichStatus richStatus, C1566All c1566All, String str) {
        A07(lithoView, c1566All, 2131954196);
        A06(c1566All).A05(c1566All.A04, richStatus.A0G, richStatus.A0A.A07(), c1566All.A08, "update", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A09(C1566All c1566All) {
        String str;
        String A07;
        LithoView lithoView = c1566All.A02;
        if (lithoView != null) {
            InputMethodManager inputMethodManager = c1566All.A00;
            if (inputMethodManager == null) {
                11T.A0L("inputMethodManager");
                throw 0Q8.createAndThrow();
            }
            7zR.A12(lithoView, inputMethodManager);
            Emoji emoji = c1566All.A06;
            if (emoji == null && c1566All.A09 == null) {
                1vD.A00(lithoView).CeH(__redex_internal_original_name);
                return;
            }
            String str2 = c1566All.A09;
            if (emoji != null && (A07 = emoji.A07()) != null && A07.length() != 0 && str2 != null && str2.length() != 0) {
                RZx rZx = RZx.A00;
                Resources A0D = 7zO.A0D(c1566All);
                11T.A0A(A0D);
                List<StatusSuggestion> A00 = rZx.A00(A0D);
                if (!(A00 instanceof Collection) || !A00.isEmpty()) {
                    for (StatusSuggestion statusSuggestion : A00) {
                        if (11T.A0O(statusSuggestion.A01.A07(), emoji.A07()) && 11T.A0O(statusSuggestion.A02, str2)) {
                            str = "recommended";
                            break;
                        }
                    }
                }
            }
            str = "user_created";
            c1566All.A08 = str;
            1Bn.A0A(67527);
            DR6 A01 = C5ic.A01(4YU.A08(lithoView), 7zS.A0j(c1566All));
            A01.A00(2131967648);
            A01.A06(2131967647);
            CSG.A04(A01, c1566All, ActionId.NOTIFY_SUBSCRIBERS, 2131955697);
            CSF.A00(A01, c1566All, lithoView, 38, 2131955711);
            7zN.A13(A01);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.Bnn, java.lang.Object] */
    public static final void A0A(C1566All c1566All) {
        RichStatusTimestamp richStatusTimestamp = c1566All.A04;
        if (richStatusTimestamp != null) {
            C2iw c2iw = c1566All.A0B;
            long A03 = A03(richStatusTimestamp);
            boolean A1V = 1BK.A1V(richStatusTimestamp.A01, 0S2.A00);
            C2ko A0G = 1LI.A0G(c2iw, -442606815);
            if (A0G != null) {
                ?? obj = new Object();
                obj.A00 = A03;
                obj.A01 = A1V;
                7zO.A1P(A0G, (Object) obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0B(C1566All c1566All, boolean z) {
        FbUserSession fbUserSession = c1566All.A01;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        Bnk bnk = (Bnk) 7zN.A0m(c1566All, fbUserSession, 83645);
        1FV A0j = 4YU.A0j();
        FbUserSession fbUserSession2 = bnk.A00;
        CM0 cm0 = (CM0) 1Lm.A06(fbUserSession2, 83644);
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray A01 = CM0.A01(cm0);
        int length = A01.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = A01.getJSONObject(i);
            1Br.A0C(cm0.A01);
            A0C(A0s, jSONObject);
        }
        ArrayList A10 = 7zO.A10(A0s, 0);
        for (StatusSuggestion statusSuggestion : RZx.A00.A00(4YV.A09(bnk.A01))) {
            if (!BXf.A00(statusSuggestion, A10)) {
                CM0 cm02 = (CM0) 1Lm.A06(fbUserSession2, 83644);
                ArrayList A0s2 = AnonymousClass001.A0s();
                JSONArray A00 = CM0.A00(cm02);
                int length2 = A00.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = A00.getJSONObject(i2);
                    1Br.A0C(cm02.A01);
                    A0C(A0s2, jSONObject2);
                }
                if (!BXf.A00(statusSuggestion, A0s2)) {
                    A10.add(statusSuggestion);
                }
            }
        }
        A0j.set(A10);
        1Kd.A0F(new D47(2, c1566All, z), A0j, 7zQ.A14());
    }

    public static void A0C(AbstractCollection abstractCollection, JSONObject jSONObject) {
        BasicEmoji basicEmoji = new BasicEmoji(jSONObject.getString("emoji"));
        String string = jSONObject.getString("text");
        11T.A0A(string);
        abstractCollection.add(new StatusSuggestion(basicEmoji, string, jSONObject.getLong("expirationTimeMs"), jSONObject.getBoolean("isAbsoluteTime")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1M(Bundle bundle, LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        super.A1M(bundle, layoutInflater, view, viewGroup);
        if (bundle != null) {
            this.A06 = (Emoji) bundle.getParcelable("current_emoji");
            this.A09 = bundle.getString("current_text");
            if (bundle.containsKey("current_status_timestamp")) {
                this.A04 = (RichStatusTimestamp) bundle.getParcelable("current_status_timestamp");
                return;
            }
            return;
        }
        FbUserSession fbUserSession = this.A01;
        if (fbUserSession != null) {
            2Tj r0 = (2Tj) 7zN.A0m(this, fbUserSession, 33122);
            FbUserSession fbUserSession2 = this.A01;
            if (fbUserSession2 != null) {
                D4q.A02(r0.A04(7zO.A0C(fbUserSession2)), this, 7zQ.A14(), 94);
                return;
            }
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }

    public boolean Bkd() {
        A09(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.onAttachFragment(fragment);
        if (fragment instanceof EmojiPickerBottomSheet) {
            ((EmojiPickerBottomSheet) fragment).A00 = new CkS(fragment, this, 1);
        }
        if (fragment instanceof StatusSuggestionLongClickBottomSheet) {
            StatusSuggestionLongClickBottomSheet statusSuggestionLongClickBottomSheet = (StatusSuggestionLongClickBottomSheet) fragment;
            statusSuggestionLongClickBottomSheet.A01 = new Bnm(this, statusSuggestionLongClickBottomSheet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1965434894);
        this.A01 = 1BM.A01(this);
        LithoView lithoView = new LithoView(7zP.A0T(this));
        7zR.A11(lithoView);
        this.A02 = lithoView;
        this.A00 = 7zS.A0C(requireContext());
        LithoView lithoView2 = this.A02;
        0FI.A08(-1307053885, A02);
        return lithoView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-2060760797);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A02 = null;
        0FI.A08(-789627683, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1972811783);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A0B(this, true);
        0FI.A08(-1434083014, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("current_emoji", this.A06);
        bundle.putString("current_text", this.A09);
        bundle.putParcelable("current_status_timestamp", this.A04);
    }
}
