package X;

import android.content.SharedPreferences;
import com.facebook.papaya.log.LogSink;

/* renamed from: X.5h1, reason: invalid class name */
/* loaded from: 5h1.class */
public final class C5h1 extends LogSink {
    public final String A04;
    public final C00i A01 = new 1BQ(16634);
    public final C00i A02 = new 1BQ(16385);
    public final C00i A03 = new 1BV(49822);
    public final C00i A00 = new 1BQ(99390);

    public C5h1(String str) {
        this.A04 = str;
    }

    @Override // com.facebook.papaya.log.LogSink
    public void event(long j, long j2, long j3, int i, java.util.Map map, String str) {
    }

    @Override // com.facebook.papaya.log.LogSink
    public void log(long j, long j2, long j3, int i, String str, int i2, String str2) {
        String str3;
        1UG A00 = 1UD.A00((04J) this.A01.get(), 1ZG.A01, "papaya_client");
        if (A00.isSampled()) {
            A00.A7R("message", str2);
            A00.A7R("precise_time_str", String.valueOf(j2));
            5hQ r0 = (5hQ) this.A03.get();
            synchronized (r0) {
                str3 = r0.A00;
                if (str3 == null) {
                    SharedPreferences sharedPreferences = r0.A01;
                    1G9 r02 = 5hQ.A02;
                    String string = sharedPreferences.getString(r02.A08(), null);
                    r0.A00 = string;
                    if (string == null) {
                        r0.A00 = 1BK.A0t();
                        sharedPreferences.edit().putString(r02.A08(), r0.A00).commit();
                    }
                    str3 = r0.A00;
                }
            }
            A00.A7R(AnonymousClass000.A00(179), str3);
            A00.A7R(JQw.A00(19), 1BK.A0N(this.A02).BCy(36880703782978559L));
            A00.A7R("population_name", this.A04);
            A00.A6H("level", 1BK.A0l(i));
            A00.BZL();
        }
    }
}
