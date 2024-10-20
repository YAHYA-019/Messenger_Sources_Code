package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.google.common.collect.ImmutableList;

/* loaded from: Bas.class */
public final class Bas {
    public final DEV A00;

    public Bas(Context context, FbUserSession fbUserSession, 1Iw r304, BME bme, Bcn bcn, ThreadKey threadKey, ThreadSummary threadSummary, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        Ccm rmu;
        if (str.equals("PublicChannel")) {
            rmu = new Rmu(context, fbUserSession, r304, bme, bcn, threadKey, threadSummary, migColorScheme, parcelableSecondaryData, immutableList, str2, str3, str4, str5, i);
        } else {
            if (!str.equals("CommunityMessaging")) {
                throw 1BL.A0l(str);
            }
            rmu = new Ccm(context, fbUserSession, r304, bme, bcn, threadKey, threadSummary, migColorScheme, parcelableSecondaryData, immutableList, str2, str3, str4, str5, str6, i);
        }
        this.A00 = rmu;
    }
}
