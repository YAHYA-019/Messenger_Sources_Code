package X;

import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Evb.class */
public final class Evb {
    public final int A00;
    public final int A01;
    public final File A02;
    public final InputStream A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final java.util.Map A0A;

    public Evb(File file, InputStream inputStream, String str, String str2, String str3, String str4, java.util.Map map, int i, int i2, boolean z, boolean z2) {
        this.A05 = str;
        this.A06 = str2;
        this.A02 = file;
        this.A03 = inputStream;
        this.A00 = i;
        this.A01 = i2;
        this.A0A = map;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = str3;
        this.A04 = str4;
    }

    public ImmutableList A00() {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator A0y = AnonymousClass001.A0y(this.A0A);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            builder.m11011add((Object) new BasicNameValuePair(AnonymousClass001.A0j(A0z), 1BK.A16(A0z)));
        }
        return builder.build();
    }
}
