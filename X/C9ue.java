package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.reactions.customreactions.views.CustomReactionEditorDialogFragment;
import com.facebook.ui.emoji.model.Emoji;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.9ue, reason: invalid class name */
/* loaded from: 9ue.class */
public final class C9ue implements DF1 {
    public final int A00;
    public final Object A01;

    public C9ue(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.DF1
    public final void Bvq(EMe eMe, Emoji emoji, String str, boolean z) {
        switch (this.A00) {
            case 0:
                11T.A0F(emoji, 0);
                DIl dIl = ((C1967Axw) this.A01).A03;
                String A07 = emoji.A07();
                11T.A0A(A07);
                dIl.Bvp(A07);
                return;
            case 1:
                11T.A0F(emoji, 0);
                C9bf c9bf = ((C8hw) this.A01).A02;
                if (c9bf != null) {
                    if (11T.A0O(emoji.A07(), "HOTLIKE")) {
                        emoji = null;
                    }
                    c9bf.A00(emoji, null);
                    return;
                }
                return;
            case 2:
                Fci fci = (Fci) this.A01;
                CallerContext callerContext = Fci.A0f;
                BottomSheetBehavior bottomSheetBehavior = fci.A0F;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.A0B(4);
                }
                String A072 = emoji.A07();
                FbUserSession A05 = 1Fw.A05(fci.A04);
                int ordinal = fci.A09.ordinal();
                int i = 0;
                if (ordinal == 0) {
                    int i2 = fci.A00;
                    String[] strArr = fci.A0O;
                    int length = strArr.length;
                    if (i2 < length) {
                        while (true) {
                            if (i < length) {
                                if (A072.equals(strArr[i])) {
                                    strArr[i] = strArr[i2];
                                } else {
                                    i++;
                                }
                            }
                        }
                        strArr[i2] = A072;
                        fci.A0Q[i2] = z;
                        fci.A0N[i2] = eMe;
                        Fci.A03(A05, fci);
                    }
                } else if (ordinal == 1) {
                    fci.A0Q[0] = z;
                    fci.A0I = A072;
                    fci.A0N[0] = eMe;
                    EeE eeE = fci.A0B;
                    if (eeE != null) {
                        CustomReactionEditorDialogFragment customReactionEditorDialogFragment = eeE.A00;
                        if (!customReactionEditorDialogFragment.A02) {
                            customReactionEditorDialogFragment.A0o();
                        }
                    }
                }
                if (fci.A0A.A01()) {
                    Bundle A052 = 1BK.A05();
                    A052.putParcelable("emoji", emoji);
                    1Ho.A00(((BlueServiceOperationFactory) fci.A0T.get()).newInstance_DEPRECATED("update_recent_emoji", A052, 1, Fci.A0f), true);
                    return;
                }
                return;
            default:
                11T.A0F(emoji, 0);
                C9Oq c9Oq = ((8cF) this.A01).A01;
                8iN r0 = c9Oq.A00;
                1Ho.A00(((BlueServiceOperationFactory) 1Br.A0B(r0.A07)).newInstance_DEPRECATED("update_recent_emoji", 0PK.A00(7zQ.A1b("emoji", emoji)), 1, 9FI.A00), true);
                1Br.A0C(r0.A06);
                HvX.A00(c9Oq.A01, 11T.A02(emoji), 1, 2);
                ((JOS) 1Br.A0B(r0.A00)).Cgp();
                return;
        }
    }
}
