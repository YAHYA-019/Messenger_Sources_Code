package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.omnipicker.OmnipickerActivity;
import com.facebook.messaging.omnipicker.OmnipickerMultiSelectActivity;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;

/* loaded from: Bzc.class */
public final class Bzc {
    public Intent A00(Context context, M4OmnipickerParam m4OmnipickerParam, ImmutableList immutableList) {
        BLj bLj = m4OmnipickerParam.A01;
        if (bLj == BLj.A03 || bLj == BLj.A04) {
            Intent A0D = C3o5.A0D(context, OmnipickerActivity.class);
            A0D.putExtra("prepicked_users", immutableList);
            A0D.putExtra("entry_point", (Serializable) bLj);
            return A0D;
        }
        Intent A0D2 = C3o5.A0D(context, OmnipickerMultiSelectActivity.class);
        A0D2.putExtra("prepicked_users", immutableList);
        A0D2.putExtra("omnipicker_param", m4OmnipickerParam);
        return A0D2;
    }
}
