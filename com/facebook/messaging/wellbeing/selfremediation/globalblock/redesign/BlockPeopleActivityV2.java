package com.facebook.messaging.wellbeing.selfremediation.globalblock.redesign;

import X.06Z;
import X.1BK;
import X.7zL;
import X.7zU;
import X.8GZ;
import X.C06c;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.io.Serializable;

/* loaded from: BlockPeopleActivityV2.class */
public class BlockPeopleActivityV2 extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        C06c A0D;
        super.A2y(bundle);
        setContentView(2132541568);
        Serializable serializableExtra = getIntent().getSerializableExtra("block_people_type");
        06Z BDe = BDe();
        if (bundle == null) {
            A0D = 7zL.A0G(BDe);
            8GZ r0 = new 8GZ();
            Bundle A05 = 1BK.A05();
            A05.putSerializable("block_people_type", serializableExtra);
            r0.setArguments(A05);
            A0D.A0P(r0, "BLOCK_PEOPLE_FRAGMENT", 2131363324);
        } else {
            8GZ A0b = BDe.A0b("BLOCK_PEOPLE_FRAGMENT");
            A0D = 7zU.A0D(this);
            if (A0b == null) {
                A0b = new 8GZ();
                Bundle A052 = 1BK.A05();
                A052.putSerializable("block_people_type", serializableExtra);
                A0b.setArguments(A052);
            }
            A0D.A0M(A0b, 2131363324);
        }
        A0D.A05();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }
}
