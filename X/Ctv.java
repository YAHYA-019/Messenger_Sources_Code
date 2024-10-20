package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.games.interfaces.GamesStartConfig;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Ctv.class */
public final class Ctv implements 2iH {
    public final /* synthetic */ C2g8 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public Ctv(C2g8 c2g8, String str, String str2) {
        this.A00 = c2g8;
        this.A01 = str;
        this.A02 = str2;
    }

    public void BmO(Context context, C2ql c2ql, C2gi c2gi) {
        11T.A0F(context, 0);
        C2g8 c2g8 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        ThreadSummary threadSummary = c2gi.A01;
        11T.A0A(threadSummary);
        if (str2 == null || str2.length() == 0) {
            if (str == null || str.length() == 0) {
                return;
            }
            ((C53) c2g8.A05.get()).A00(context, new GamesStartConfig(null, threadSummary.A0n, null, null, null, null, null, null, null, null, null, null, str, null, "game_thread_row_cta", null, null, null, null, true));
            return;
        }
        GamesStartConfig gamesStartConfig = new GamesStartConfig(null, threadSummary.A0n, null, null, null, null, null, null, null, null, null, null, null, null, "game_thread_row_cta", null, null, null, null, true);
        C0a c0a = (C0a) c2g8.A06.get();
        Uri uri = null;
        try {
            uri = C0A2.A03(str2);
        } catch (SecurityException unused) {
        }
        c0a.A00(context, uri, gamesStartConfig);
    }
}
