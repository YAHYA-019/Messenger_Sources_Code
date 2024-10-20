package com.facebook.messaging.wellbeing.selfremediation.restrict.nux;

import X.0FI;
import X.0Q8;
import X.1BM;
import X.1Br;
import X.1iF;
import X.7zM;
import X.AbF;
import X.AbK;
import X.AbN;
import X.AeX;
import X.B5N;
import X.Bx5;
import X.C01g;
import X.C01i;
import X.CZF;
import X.CjX;
import X.CxE;
import X.DCl;
import X.DCy;
import X.DG4;
import X.DGE;
import X.DIi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* loaded from: RestrictNuxFragment.class */
public final class RestrictNuxFragment extends SlidingSheetFullScreenDialogFragment implements DG4 {
    public DGE A00;
    public B5N A01;
    public final C01i A02 = DCy.A00(this, 46);
    public final C01i A03 = C01g.A01(DCl.A00);

    public 1iF A17() {
        return AbN.A0B();
    }

    public boolean Bkd() {
        B5N b5n = this.A01;
        if (b5n == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        B5N.A01(b5n, false);
        return false;
    }

    @Override // X.DG4
    public void ClX(DIi dIi) {
        if (dIi != null) {
            dIi.CuY(false);
            B5N b5n = this.A01;
            if (b5n == null) {
                AbF.A1H();
                throw 0Q8.createAndThrow();
            }
            b5n.A02 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment, com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1871482702);
        super.onCreate(bundle);
        this.A01 = new B5N(7zM.A0C(this, 82772), 1BM.A01(this));
        0FI.A08(939257149, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1645448616);
        LithoView A0O = AbK.A0O(this);
        Bx5 bx5 = (Bx5) this.A02.getValue();
        CxE A00 = CxE.A00(this, 100);
        CZF A002 = CZF.A00(this, 81);
        CZF A003 = CZF.A00(this, 82);
        bx5.A02 = A0O;
        bx5.A03 = A00;
        bx5.A01 = A002;
        bx5.A00 = A003;
        0FI.A08(1121818579, A02);
        return A0O;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-618646848);
        super.onDestroyView();
        B5N b5n = this.A01;
        if (b5n == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        b5n.A04();
        0FI.A08(672855842, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(448743254);
        super/*X.0D2*/.onStart();
        B5N b5n = this.A01;
        if (b5n == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        User user = (User) requireArguments().getParcelable("args_user");
        UserKey userKey = (UserKey) requireArguments().getParcelable("args_user_key");
        if (user == null) {
            if (userKey != null) {
                ((AeX) 1Br.A0B(b5n.A05)).A02(new CjX(b5n, 6), userKey);
                0FI.A08(-689157825, A02);
            }
            user = null;
        }
        B5N.A00(b5n, user);
        0FI.A08(-689157825, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        if (r306 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r1 = r302
            r2 = r303
            super.onViewCreated(r1, r2)
            r0 = r301
            X.B5N r0 = r0.A01
            r305 = r0
            java.lang.String r0 = "presenter"
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L25
            r0 = r306
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L25:
            r0 = r305
            r1 = r301
            r0.A00 = r1
            r0 = r301
            X.DGE r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3d
            r0 = r305
            r1 = r306
            r0.A00 = r1
        L3d:
            r0 = r302
            android.content.Context r0 = X.4YU.A08(r0)
            r307 = r0
            r0 = 16979(0x4253, float:2.3793E-41)
            r308 = r0
            r0 = r307
            r1 = 0
            r2 = r308
            java.lang.Object r0 = X.1Bn.A0E(r0, r1, r2)
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = (com.facebook.mig.scheme.interfaces.MigColorScheme) r0
            r307 = r0
            r0 = 16838(0x41c6, float:2.3595E-41)
            r304 = r0
            r0 = r304
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.1tC r0 = (X.1tC) r0
            r305 = r0
            r0 = r301
            android.app.Dialog r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L83
            r0 = r306
            android.view.Window r0 = r0.getWindow()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L83
        L79:
            r0 = r305
            r1 = r306
            r2 = r307
            r0.A03(r1, r2)
        L82:
            return
        L83:
            r0 = r301
            boolean r0 = r0.A1B()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L82
            r0 = r301
            android.app.Activity r0 = r0.A16()
            android.view.Window r0 = r0.getWindow()
            r306 = r0
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.restrict.nux.RestrictNuxFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
