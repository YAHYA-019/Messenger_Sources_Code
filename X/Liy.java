package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: Liy.class */
public abstract class Liy implements Iterable {
    public static void A00(Context context, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw AnonymousClass001.A0N("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        context.startActivities(intentArr, null);
    }
}
