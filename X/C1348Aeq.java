package X;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.view.View;
import com.facebook.messaging.wellbeing.selfremediation.globalblock.redesign.BlockPeopleActivityV2;
import java.io.Serializable;

/* renamed from: X.Aeq, reason: case insensitive filesystem */
/* loaded from: Aeq.class */
public final class C1348Aeq extends Preference implements DFo {
    public C00i A00;
    public BL3 A01;

    @Override // X.DFo
    public void ACE() {
        if (getTitle() == null) {
            setTitle(2131963521);
        }
        this.A00.get();
        Context context = getContext();
        BL3 bl3 = this.A01;
        Intent A0D = C3o5.A0D(context, BlockPeopleActivityV2.class);
        A0D.putExtra("block_people_type", (Serializable) bl3);
        setIntent(A0D);
        setOnPreferenceClickListener(new CYZ(A0D, this, 12));
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        ACE();
    }
}
