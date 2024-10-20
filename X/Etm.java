package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Etm.class */
public final class Etm {
    public final String A00;
    public final String A01;
    public final java.util.Map A02;

    public Etm(String str, String str2, java.util.Map map) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = map;
    }

    public ImmutableList A00() {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator A0y = AnonymousClass001.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            builder.m11011add((Object) new BasicNameValuePair(AnonymousClass001.A0j(A0z), 1BK.A16(A0z)));
        }
        return builder.build();
    }
}
