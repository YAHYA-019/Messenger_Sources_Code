package com.facebook.messaging.publicchats.prompts;

import X.06Z;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1BV;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.6Im;
import X.6In;
import X.7zL;
import X.7zN;
import X.7zO;
import X.8K2;
import X.8Xj;
import X.9KD;
import X.AZX;
import X.C9bl;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.xapp.messaging.publicchats.prompt.model.PromptArgs;

/* loaded from: PromptResponseEntryMenuBottomSheetFragment.class */
public final class PromptResponseEntryMenuBottomSheetFragment extends MigBottomSheetDialogFragment implements AZX {
    public 8K2 A00;
    public FbUserSession A01;
    public 9KD A02;
    public C9bl A03;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        1BV A0R = 7zL.A0R(requireContext(), 16979);
        8K2 r0 = this.A00;
        if (r0 != null) {
            return new 8Xj(this, 7zN.A0W(A0R), r0);
        }
        11T.A0L("responseEntry");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CGj(String str) {
        String str2;
        11T.A0F(str, 0);
        C9bl c9bl = this.A03;
        if (c9bl == null) {
            str2 = "presenter";
        } else {
            PromptArgs promptArgs = c9bl.A01;
            if (promptArgs == null) {
                str2 = "promptArgs";
            } else {
                ThreadKey threadKey = promptArgs.A01;
                if (threadKey == null) {
                    return;
                }
                9KD r0 = this.A02;
                if (r0 == null) {
                    str2 = "navigator";
                } else {
                    06Z parentFragmentManager = getParentFragmentManager();
                    FbUserSession fbUserSession = this.A01;
                    if (fbUserSession != null) {
                        6Im r02 = (6In) 1Br.A0B(r0.A00);
                        r02.A05.A00(parentFragmentManager, fbUserSession, 6Im.A03(r02, threadKey, str));
                        A0o();
                        return;
                    }
                    str2 = "fbUserSession";
                }
            }
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    public void CSP(String str) {
        String str2;
        11T.A0F(str, 0);
        C9bl c9bl = this.A03;
        if (c9bl == null) {
            str2 = "presenter";
        } else {
            FbUserSession fbUserSession = this.A01;
            if (fbUserSession != null) {
                c9bl.A00(fbUserSession, str);
                A0o();
                return;
            }
            str2 = "fbUserSession";
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (C9bl) 7zO.A0m(this, 68124);
        this.A02 = (9KD) 7zO.A0m(this, 68122);
        this.A01 = 1BM.A01(this);
    }
}
