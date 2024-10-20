package com.facebook.messaging.sharing.broadcastflow.view.rooms;

import X.0FI;
import X.1iF;
import X.2Ov;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AnonymousClass001;
import X.C00i;
import X.C5ic;
import X.CSG;
import X.DR6;
import X.JZj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;

/* loaded from: SpeakeasyDeleteRoomDialogFragment.class */
public class SpeakeasyDeleteRoomDialogFragment extends 2Ov {
    public int A00;
    public boolean A01;
    public C00i A02;
    public String A03;
    public String A04;
    public final C00i A05 = AbH.A0c(this);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Context context;
        int i;
        C00i c00i = this.A02;
        c00i.getClass();
        c00i.get();
        DR6 A01 = C5ic.A01(getContext(), AbF.A0p(this.A05));
        A01.A00(2131966136);
        int i2 = this.A00;
        if (i2 == 0) {
            context = getContext();
            i = 2131966134;
        } else if (i2 == 1) {
            boolean z = this.A01;
            context = getContext();
            i = 2131966133;
            if (z) {
                i = 2131966131;
            }
        } else {
            if (i2 != 2) {
                throw AnonymousClass001.A0N("Discard text not found");
            }
            context = getContext();
            i = 2131966135;
        }
        A01.A0J(context.getString(i));
        CSG.A05(A01, this, ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE, 2131966132);
        CSG.A04(A01, this, 150, 2131966139);
        JZj A04 = A01.A04();
        A04.show();
        return A04;
    }

    public 1iF A17() {
        return AbF.A0C(1231747217564692L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-962525017);
        super.onCreate(bundle);
        this.A02 = AbI.A0L();
        if (bundle == null) {
            bundle = this.mArguments;
            bundle.getClass();
        }
        this.A01 = bundle.getBoolean("key_can_copy_link");
        String string = bundle.getString("key_room_link_url");
        string.getClass();
        this.A04 = string;
        String string2 = bundle.getString("key_room_id");
        string2.getClass();
        this.A03 = string2;
        this.A00 = bundle.getInt("key_discard_room_text");
        0FI.A08(409805540, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putBoolean("key_can_copy_link", this.A01);
        bundle.putString("key_room_link_url", this.A04);
        bundle.putString("key_room_id", this.A03);
        bundle.putInt("key_discard_room_text", this.A00);
    }
}
