package com.facebook.messaging.emoji.composerwithtext;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.1Lo;
import X.1iF;
import X.2cK;
import X.2cM;
import X.7zL;
import X.7zT;
import X.9Z7;
import X.AbF;
import X.AwW;
import X.B0y;
import X.C00g;
import X.C0uA;
import X.C3R7;
import X.DF1;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.HashSet;

/* loaded from: EmojiPickerBottomSheet.class */
public final class EmojiPickerBottomSheet extends MigBottomSheetDialogFragment implements C00g {
    public DF1 A00;
    public FbUserSession A01;
    public final 1Br A02 = 1Bu.A02(this, 68066);

    public 1iF A17() {
        return AbF.A0C(442780740380519L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String string;
        11T.A0F(r302, 0);
        Context A0A = 7zL.A0A(r302);
        FbUserSession fbUserSession = this.A01;
        String str = "fbUserSession";
        if (fbUserSession != null) {
            C3R7 c3r7 = (C3R7) 1Lo.A04(A0A, fbUserSession, (1BY) null, 67391);
            C0uA c0uA = C0uA.A00;
            ReactionsSet reactionsSet = new ReactionsSet(c0uA, c0uA);
            Bundle bundle = this.mArguments;
            if (bundle != null && (string = bundle.getString("selected_emoji")) != null) {
                reactionsSet = new ReactionsSet(11T.A04(string), 11T.A04(string));
            }
            2cM A01 = 2cK.A01(r302, (String) null, 0);
            AwW A00 = B0y.A00(r302);
            FbUserSession fbUserSession2 = this.A01;
            if (fbUserSession2 != null) {
                A00.A2X(fbUserSession2);
                A00.A2Z(A1F());
                A00.A2a(((9Z7) 1Br.A0B(this.A02)).A00(1BK.A0b(), 1BK.A0b(), (HashSet) null, false));
                B0y b0y = A00.A01;
                b0y.A05 = reactionsSet;
                b0y.A0B = true;
                b0y.A0C = true;
                b0y.A00 = c3r7.A01();
                DF1 df1 = this.A00;
                if (df1 != null) {
                    A00.A2Y(df1);
                    A01.A2d(A00);
                    A01.A0Q();
                    return A01.A00;
                }
                str = "emojiPickerListener";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1125964528);
        super.onCreate(bundle);
        this.A01 = 7zT.A08(this);
        0FI.A08(159484298, A02);
    }
}
