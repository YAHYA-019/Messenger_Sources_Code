package X;

import android.widget.LinearLayout;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;
import com.facebook.user.model.User;

/* loaded from: A1y.class */
public final class A1y implements Aag {
    public final /* synthetic */ 8Gm A00;

    public A1y(8Gm r302) {
        this.A00 = r302;
    }

    @Override // X.Aag
    public void BNy() {
        8Gm r0 = this.A00;
        r0.A0B = false;
        8Gm.A03(r0);
        7zT.A1A(r0);
        LinearLayout linearLayout = r0.A01;
        if (linearLayout != null) {
            linearLayout.setPadding(0, 0, 0, 0);
        }
    }

    @Override // X.Aag
    public void Bez(User user) {
        8Gm r0 = this.A00;
        C9f2.A00().markerEnd(91365879, (short) 2);
        r0.A0A = true;
        r0.A09.invoke();
    }

    @Override // X.Aag
    public void Bx3() {
        8Gm r0 = this.A00;
        8Gm.A03(r0);
        r0.A1X();
    }

    @Override // X.Aag
    public void C7F() {
        String str;
        8Gm r0 = this.A00;
        C03513yC c03513yC = r0.A05;
        if (c03513yC == null) {
            str = "notesLogger";
        } else {
            EnumC03533yL enumC03533yL = EnumC03533yL.NOTE_CONSUMPTION_MIMICRY;
            8Kc r02 = r0.A06;
            str = "consumptionViewDataModel";
            if (r02 != null) {
                RichStatus richStatus = r02.A03;
                c03513yC.A08(enumC03533yL, richStatus.A09, Long.valueOf(richStatus.A04), 3, false, false);
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.Aag
    public void C8C() {
    }

    @Override // X.Aag
    public void C8F() {
    }

    @Override // X.Aag
    public void CW3() {
        String str;
        8Gm r0 = this.A00;
        C03513yC c03513yC = r0.A05;
        if (c03513yC == null) {
            str = "notesLogger";
        } else {
            EnumC03533yL enumC03533yL = EnumC03533yL.NOTE_CONSUMPTION_MIMICRY;
            c03513yC.A08(enumC03533yL, null, null, 0, true, true);
            9Wa r02 = NotesCreationFragment.A0V;
            1pI r03 = r0.A03;
            if (r03 != null) {
                r02.A00(enumC03533yL, r03);
                return;
            }
            str = "contentViewManager";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
