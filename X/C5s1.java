package X;

import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.base.Absent;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableListMultimap;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.5s1, reason: invalid class name */
/* loaded from: 5s1.class */
public final class C5s1 {
    public static final CharMatcher A06;
    public static final CharMatcher A07;
    public static final CharMatcher A08;
    public static final Joiner.MapJoiner A09;
    public static final C5s1 A0A;
    public static final C5s1 A0B;
    public static final C5s1 A0C;
    public static final C5s1 A0D;
    public static final C5s1 A0E;
    public static final C5s1 A0F;
    public static final C5s1 A0G;
    public static final C5s1 A0H;
    public static final C5s1 A0I;
    public static final C5s1 A0J;
    public static final C5s1 A0K;
    public static final C5s1 A0L;
    public static final C5s1 A0M;
    public static final C5s1 A0N;
    public static final C5s1 A0O;
    public static final C5s1 A0P;
    public static final C5s1 A0Q;
    public static final C5s1 A0R;
    public static final C5s1 A0S;
    public static final C5s1 A0T;
    public static final C5s1 A0U;
    public static final C5s1 A0V;
    public static final C5s1 A0W;
    public static final C5s1 A0X;
    public static final C5s1 A0Y;
    public static final C5s1 A0Z;
    public static final C5s1 A0a;
    public static final C5s1 A0b;
    public static final C5s1 A0c;
    public static final C5s1 A0d;
    public static final C5s1 A0e;
    public static final C5s1 A0f;
    public static final C5s1 A0g;
    public static final C5s1 A0h;
    public static final C5s1 A0i;
    public static final C5s1 A0j;
    public static final C5s1 A0k;
    public static final C5s1 A0l;
    public static final C5s1 A0m;
    public static final C5s1 A0n;
    public static final C5s1 A0o;
    public static final C5s1 A0p;
    public static final C5s1 A0q;
    public static final C5s1 A0r;
    public static final C5s1 A0s;
    public static final C5s1 A0t;
    public static final C5s1 A0u;
    public static final C5s1 A0v;
    public static final C5s1 A0w;
    public static final C5s1 A0x;
    public static final C5s1 A0y;
    public static final C5s1 A0z;
    public static final C5s1 A10;
    public static final C5s1 A11;
    public static final C5s1 A12;
    public static final C5s1 A13;
    public static final C5s1 A14;
    public static final C5s1 A15;
    public static final C5s1 A16;
    public static final C5s1 A17;
    public static final C5s1 A18;
    public static final C5s1 A19;
    public static final C5s1 A1A;
    public static final C5s1 A1B;
    public static final C5s1 A1C;
    public static final C5s1 A1D;
    public static final C5s1 A1E;
    public static final C5s1 A1F;
    public static final C5s1 A1G;
    public static final C5s1 A1H;
    public static final C5s1 A1I;
    public static final C5s1 A1J;
    public static final C5s1 A1K;
    public static final C5s1 A1L;
    public static final C5s1 A1M;
    public static final C5s1 A1N;
    public static final C5s1 A1O;
    public static final C5s1 A1P;
    public static final C5s1 A1Q;
    public static final C5s1 A1R;
    public static final C5s1 A1S;
    public static final C5s1 A1T;
    public static final C5s1 A1U;
    public static final C5s1 A1V;
    public static final C5s1 A1W;
    public static final C5s1 A1X;
    public static final C5s1 A1Y;
    public static final C5s1 A1Z;
    public static final C5s1 A1a;
    public static final C5s1 A1b;
    public static final C5s1 A1c;
    public static final C5s1 A1d;
    public static final C5s1 A1e;
    public static final C5s1 A1f;
    public static final C5s1 A1g;
    public static final C5s1 A1h;
    public static final C5s1 A1i;
    public static final C5s1 A1j;
    public static final C5s1 A1k;
    public static final C5s1 A1l;
    public static final C5s1 A1m;
    public static final C5s1 A1n;
    public static final C5s1 A1o;
    public static final C5s1 A1p;
    public static final C5s1 A1q;
    public static final C5s1 A1r;
    public static final C5s1 A1s;
    public static final C5s1 A1t;
    public static final C5s1 A1u;
    public static final C5s1 A1v;
    public static final C5s1 A1w;
    public static final C5s1 A1x;
    public static final C5s1 A1y;
    public static final C5s1 A1z;
    public static final C5s1 A20;
    public static final java.util.Map A21;
    public static final ImmutableListMultimap A22 = ImmutableListMultimap.A03(Ascii.toLowerCase(Charsets.UTF_8.name()));
    public int A00;
    public Optional A01;
    public String A02;
    public final ImmutableListMultimap A03;
    public final String A04;
    public final String A05;

    static {
        CharMatcher charMatcher = CharMatcher.Ascii.INSTANCE;
        A08 = charMatcher.and(CharMatcher.JavaIsoControl.INSTANCE.negate()).and(new CharMatcher.IsNot(' ')).and(CharMatcher.anyOf("()<>@,;:\\\"/[]?=").negate());
        A07 = charMatcher.and(CharMatcher.anyOf("\"\\\r").negate());
        A06 = CharMatcher.anyOf(" \t\r\n");
        A21 = new HashMap();
        A0G = A00("*", "*");
        A0F = A00("text", "*");
        A0E = A00("image", "*");
        A0C = A00("audio", "*");
        A0H = A00("video", "*");
        A0B = A00("application", "*");
        A0D = A00("font", "*");
        A0Q = A01("text", "cache-manifest");
        A0S = A01("text", "css");
        A0T = A01("text", "csv");
        A0k = A01("text", "html");
        A0m = A01("text", "calendar");
        A1P = A01("text", "plain");
        A1d = A01("text", "javascript");
        A1h = A01("text", "tab-separated-values");
        A1i = A01("text", "vcard");
        A1t = A01("text", "vnd.wap.wml");
        A1y = A01("text", "xml");
        A1m = A01("text", "vtt");
        A0O = A00("image", "bmp");
        A0R = A00("image", "x-canon-crw");
        A0g = A00("image", "gif");
        A0l = A00("image", "vnd.microsoft.icon");
        A0r = A00("image", "jpeg");
        A1Q = A00("image", "png");
        A1T = A00("image", "vnd.adobe.photoshop");
        A1b = A01("image", "svg+xml");
        A1g = A00("image", "tiff");
        A1r = A00("image", "webp");
        A0j = A00("image", "heif");
        A0q = A00("image", "jp2");
        A16 = A00("audio", "mp4");
        A18 = A00("audio", "mpeg");
        A1D = A00("audio", "ogg");
        A1p = A00("audio", "webm");
        A0x = A00("audio", "l16");
        A0y = A00("audio", "l24");
        A0N = A00("audio", "basic");
        A0A = A00("audio", "aac");
        A1l = A00("audio", "vorbis");
        A1s = A00("audio", "x-ms-wma");
        A1o = A00("audio", "x-ms-wax");
        A1j = A00("audio", "vnd.rn-realaudio");
        A1k = A00("audio", "vnd.wave");
        A17 = A00("video", "mp4");
        A19 = A00("video", "mpeg");
        A1F = A00("video", "ogg");
        A1U = A00("video", "quicktime");
        A1q = A00("video", "webm");
        A1u = A00("video", "x-ms-wmv");
        A0X = A00("video", "x-flv");
        A1f = A00("video", "3gpp");
        A1e = A00("video", "3gpp2");
        A0L = A01("application", "xml");
        A0M = A01("application", "atom+xml");
        A0P = A00("application", "x-bzip2");
        A0U = A01("application", "dart");
        A0J = A00("application", "vnd.apple.pkpass");
        A0V = A00("application", "vnd.ms-fontobject");
        A0W = A00("application", "epub+zip");
        A0e = A00("application", "x-www-form-urlencoded");
        A0u = A00("application", "pkcs12");
        A0K = A00("application", HttpRequestMultipart.CONTENT_TRANSFER_ENCODING_BINARY);
        A0f = A00("application", "geo+json");
        A0h = A00("application", "x-gzip");
        A0i = A00("application", "hal+json");
        A0n = A01("application", "javascript");
        A0o = A00("application", "jose");
        A0p = A00("application", "jose+json");
        A0s = A01("application", "json");
        A0t = A00("application", "jwt");
        A0z = A01("application", "manifest+json");
        A0v = A00("application", "vnd.google-earth.kml+xml");
        A0w = A00("application", "vnd.google-earth.kmz");
        A10 = A00("application", "mbox");
        A0I = A00("application", "x-apple-aspen-config");
        A12 = A00("application", "vnd.ms-excel");
        A13 = A00("application", "vnd.ms-outlook");
        A14 = A00("application", "vnd.ms-powerpoint");
        A15 = A00("application", "msword");
        A11 = A00("application", "dash+xml");
        A1n = A00("application", "wasm");
        A1A = A00("application", "x-nacl");
        A1B = A00("application", "x-pnacl");
        A1C = A00("application", "octet-stream");
        A1E = A00("application", "ogg");
        A1G = A00("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        A1H = A00("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        A1I = A00("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        A1J = A00("application", "vnd.oasis.opendocument.graphics");
        A1K = A00("application", "vnd.oasis.opendocument.presentation");
        A1L = A00("application", "vnd.oasis.opendocument.spreadsheet");
        A1M = A00("application", "vnd.oasis.opendocument.text");
        A1N = A01("application", "opensearchdescription+xml");
        A1O = A00("application", "pdf");
        A1R = A00("application", "postscript");
        A1S = A00("application", "protobuf");
        A1V = A01("application", "rdf+xml");
        A1W = A01("application", "rtf");
        A1X = A00("application", "font-sfnt");
        A1Y = A00("application", "x-shockwave-flash");
        A1Z = A00("application", "vnd.sketchup.skp");
        A1a = A01("application", "soap+xml");
        A1c = A00("application", "x-tar");
        A1v = A00("application", "font-woff");
        A1w = A00("application", "font-woff2");
        A1x = A01("application", "xhtml+xml");
        A1z = A01("application", "xrd+xml");
        A20 = A00("application", ServerW3CShippingAddressConstants.POSTAL_CODE);
        A0Y = A00("font", "collection");
        A0Z = A00("font", "otf");
        A0a = A00("font", "sfnt");
        A0b = A00("font", "ttf");
        A0c = A00("font", "woff");
        A0d = A00("font", "woff2");
        A09 = new Joiner.MapJoiner(new Joiner("; "), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
    }

    public C5s1(ImmutableListMultimap immutableListMultimap, String str, String str2) {
        this.A05 = str;
        this.A04 = str2;
        this.A03 = immutableListMultimap;
    }

    public static C5s1 A00(String str, String str2) {
        C5s1 c5s1 = new C5s1(ImmutableListMultimap.A00(), str, str2);
        A21.put(c5s1, c5s1);
        c5s1.A01 = Absent.INSTANCE;
        return c5s1;
    }

    public static C5s1 A01(String str, String str2) {
        C5s1 c5s1 = new C5s1(A22, str, str2);
        A21.put(c5s1, c5s1);
        c5s1.A01 = Optional.of(Charsets.UTF_8);
        return c5s1;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C5s1)) {
                return false;
            }
            C5s1 c5s1 = (C5s1) obj;
            if (!this.A05.equals(c5s1.A05) || !this.A04.equals(c5s1.A04)) {
                return false;
            }
            if (!new 5sE(new 5sC(new 7wW()), this.A03.A01).equals(new 5sE(new 5sC(new 7wW()), c5s1.A03.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = Arrays.hashCode(new Object[]{this.A05, this.A04, new 5sE(new 5sC(new 7wW()), this.A03.A01)});
            this.A00 = i;
        }
        return i;
    }

    public String toString() {
        String str = this.A02;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.A05);
            sb.append('/');
            sb.append(this.A04);
            ImmutableListMultimap immutableListMultimap = this.A03;
            if (!immutableListMultimap.isEmpty()) {
                sb.append("; ");
                A09.appendTo(sb, new K9X(immutableListMultimap, new 5sC(new D2i(32))).AQp().iterator());
            }
            str = sb.toString();
            this.A02 = str;
        }
        return str;
    }
}
