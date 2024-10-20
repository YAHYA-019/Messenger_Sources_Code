package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.net.URI;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: X.4ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ta.class */
public class C10404ta {
    public static final ImmutableMap A06 = ImmutableMap.of((Object) "https", (Object) EnumC10414tb.HTTPS, (Object) "http", (Object) EnumC10414tb.HTTP, (Object) "content", (Object) EnumC10414tb.CONTENT, (Object) DGWRegionHintManager.SERVICE_KEY_MSYS, (Object) EnumC10414tb.MSYS, (Object) "file", (Object) EnumC10414tb.FILE);
    public final Uri A00;
    public final CallerContext A01;
    public final RequestPriority A02;
    public final C4j5 A03;
    public final EnumC10414tb A04;
    public final ImmutableMap A05;

    public C10404ta(Uri uri, CallerContext callerContext, C4j5 c4j5) {
        this(uri, callerContext, RequestPriority.A00, c4j5, RegularImmutableMap.A03);
    }

    public C10404ta(Uri uri, CallerContext callerContext, RequestPriority requestPriority, C4j5 c4j5, ImmutableMap immutableMap) {
        uri.getClass();
        this.A00 = uri;
        EnumC10414tb enumC10414tb = (EnumC10414tb) A06.get(uri.getScheme());
        this.A04 = enumC10414tb == null ? EnumC10414tb.UNSUPPORTED : enumC10414tb;
        this.A03 = c4j5;
        this.A01 = callerContext;
        this.A02 = requestPriority;
        this.A05 = immutableMap;
    }

    public HttpUriRequest A00() {
        try {
            return new HttpGet(URI.create(this.A00.toString()));
        } catch (IllegalArgumentException unused) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Invalid URI: ");
            throw AnonymousClass001.A0G(AnonymousClass001.A0a(this.A00, A0k));
        }
    }
}
