package com.facebook.messaging.groups.create.dialog;

import X.06Z;
import X.0D2;
import X.1BK;
import X.1iF;
import X.2Ov;
import X.4YT;
import X.4YU;
import X.7zO;
import X.AbF;
import X.AbJ;
import X.AnonymousClass001;
import X.C0D1;
import X.C2121Dea;
import X.CSG;
import X.DF8;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: CreateGroupWithoutBlockersDialog.class */
public class CreateGroupWithoutBlockersDialog extends 2Ov {
    public DF8 A00;
    public ArrayList A01;

    public static void A05(06Z r301, DF8 df8, ImmutableList immutableList) {
        if (C0D1.A01(r301)) {
            String A00 = 4YT.A00(569);
            if (r301.A0b(A00) == null) {
                ArrayList<? extends Parcelable> A17 = 1BK.A17(immutableList);
                0D2 r0 = new 2Ov();
                Bundle A05 = 1BK.A05();
                A05.putParcelableArrayList("blocker", A17);
                r0.setArguments(A05);
                r0.A00 = df8;
                r0.A0m(r301, A00);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        String A0d;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = bundle2.getParcelableArrayList("blocker");
        }
        this.A01.getClass();
        C2121Dea c2121Dea = new C2121Dea(getContext());
        ArrayList arrayList = this.A01;
        c2121Dea.A0B(arrayList.size() == 1 ? 4YU.A0u(7zO.A0D(this), AbF.A1B((User) arrayList.get(0)), 2131957411) : 7zO.A0D(this).getString(2131957409));
        ArrayList arrayList2 = this.A01;
        if (arrayList2.size() == 1) {
            A0d = 4YU.A0u(7zO.A0D(this), AbF.A1B((User) arrayList2.get(0)), 2131957410);
        } else {
            StringBuilder A0k = AnonymousClass001.A0k();
            for (int i = 0; i < arrayList2.size() && i < 3; i++) {
                A0k.append(AbF.A1B((User) arrayList2.get(i)));
                A0k.append("\n");
            }
            if (arrayList2.size() > 3) {
                A0k.append("…");
                A0k.append("\n");
            }
            A0d = AnonymousClass001.A0d(7zO.A0D(this).getString(2131957408), A0k);
        }
        c2121Dea.A0A(A0d);
        CSG.A06(c2121Dea, this, 73, 2131955209);
        c2121Dea.A0D((DialogInterface.OnClickListener) null, 2131953782);
        c2121Dea.A0C(false);
        return c2121Dea.A0I();
    }

    public 1iF A17() {
        return AbJ.A0D();
    }
}
