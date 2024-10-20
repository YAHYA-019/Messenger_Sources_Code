package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: C3d.class */
public final class C3d {
    public final Context A00;
    public final FbUserSession A01;
    public final C00i A02 = AbH.A0N();

    public C3d(FbUserSession fbUserSession, Context context) {
        this.A01 = fbUserSession;
        this.A00 = context;
    }

    public void A00(BOx bOx, DataSourceIdentifier dataSourceIdentifier, 53M r304, Long l, String str, String str2, int i, long j, long j2, boolean z) {
        C11894xu c11894xu = (C11894xu) 1Lo.A04(this.A00, this.A01, (1BY) null, 84564);
        Object obj = r304.loggingName;
        Object Aus = dataSourceIdentifier.Aus();
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        c11894xu.A00("DataSourceLoadedLogger", "logDataSourceLoaded search_surface: %s search_funnel_id: %s query_string: %s data_source: %s start_time_ms: %d end_time_ms: %d load_status: %s results_count: %d is_result_used: %b", obj, l, str, Aus, valueOf, valueOf2, bOx._loggingName, Integer.valueOf(i), Boolean.valueOf(z));
        1UG A08 = 1BK.A08(1BK.A07(this.A02), AbstractC00603o4.A00(242));
        if (A08.isSampled()) {
            A08.A6H("end_time_ms", valueOf2);
            A08.A0E("is_result_used", Integer.valueOf(z ? 1 : 0));
            A08.A7R("load_status", bOx._loggingName);
            A08.A6H("results_count", 1BK.A0l(i));
            A08.A7R("search_surface", r304.loggingName);
            A08.A6H("start_time_ms", valueOf);
            A08.A7R("data_source", dataSourceIdentifier.Aus());
            A08.A7R("query_string", (String) null);
            A08.A6H("search_funnel_id", l);
            A08.A7R("error_msg", str2);
            A08.A6H("query_string_length", Long.valueOf(str == null ? 0L : str.length()));
            A08.BZL();
        }
    }
}
