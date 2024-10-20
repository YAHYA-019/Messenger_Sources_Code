package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.3Qa, reason: invalid class name */
/* loaded from: 3Qa.class */
public final class C3Qa {
    public static final SimpleDateFormat A0A = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
    public final long A00;
    public final long A01;
    public final long A02;
    public final 3Kb A03;
    public final ThreadKey A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C3Qa(3Kb r302, ThreadKey threadKey, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3) {
        this.A00 = j;
        this.A04 = threadKey;
        this.A01 = j2;
        this.A08 = str4;
        this.A05 = str;
        this.A03 = r302;
        this.A02 = j3;
        this.A09 = str5;
        this.A06 = str2;
        this.A07 = str3;
    }
}
