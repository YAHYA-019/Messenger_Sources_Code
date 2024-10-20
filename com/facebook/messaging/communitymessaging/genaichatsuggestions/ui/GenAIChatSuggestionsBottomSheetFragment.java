package com.facebook.messaging.communitymessaging.genaichatsuggestions.ui;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.7zO;
import X.7zQ;
import X.7zS;
import X.7zT;
import X.9Hk;
import X.AR7;
import X.AbE;
import X.C1949Axe;
import X.CIp;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.GenAIChatSuggestion;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: GenAIChatSuggestionsBottomSheetFragment.class */
public final class GenAIChatSuggestionsBottomSheetFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public CIp A01;
    public GenAIChatSuggestion A02;
    public String A03;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        GenAIChatSuggestion genAIChatSuggestion = this.A02;
        if (genAIChatSuggestion == null) {
            str = "chatSuggestion";
        } else {
            String str2 = this.A03;
            MigColorScheme A1F = A1F();
            9Hk r0 = new 9Hk(this);
            CIp cIp = this.A01;
            if (cIp != null) {
                return new C1949Axe(cIp, r0, genAIChatSuggestion, A1F, str2, new AR7(r302, this, 17));
            }
            str = "genAIChatSuggestionsViewData";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Throwable A0v;
        int i;
        Parcelable.Creator creator;
        int A02 = 0FI.A02(863740979);
        super.onCreate(bundle);
        this.A00 = 7zT.A08(this);
        this.A01 = (CIp) 7zO.A0l(this, 67631);
        Bundle requireArguments = requireArguments();
        Object obj = GenAIChatSuggestion.class.getDeclaredField("CREATOR").get(null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            A0v = 7zS.A0v(GenAIChatSuggestion.class);
            i = 149934052;
        } else {
            Parcelable A0K = 7zQ.A0K(requireArguments, creator, GenAIChatSuggestion.class, AbE.A00(400));
            if (A0K != null) {
                this.A02 = (GenAIChatSuggestion) A0K;
                this.A03 = requireArguments().getString(AbE.A00(401));
                0FI.A08(-17302493, A02);
                return;
            }
            A0v = 1BK.A0h();
            i = 878170453;
        }
        0FI.A08(i, A02);
        throw A0v;
    }
}
