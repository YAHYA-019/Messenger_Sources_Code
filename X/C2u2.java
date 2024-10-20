package X;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;

/* renamed from: X.2u2, reason: invalid class name */
/* loaded from: 2u2.class */
public class C2u2 {
    public final Context A00;
    public final C2ty A01;
    public final C2u1 A02;
    public final C2tx A03;
    public final C2tz A04;
    public final C00i A05;
    public final C4Eo A06;
    public final String A07;

    public C2u2(Context context, C2ty c2ty, C2u1 c2u1, C2tx c2tx, C2tz c2tz, C00i c00i, C4Eo c4Eo, String str) {
        this.A00 = context;
        this.A03 = c2tx;
        this.A07 = str;
        this.A01 = c2ty;
        this.A05 = c00i;
        this.A04 = c2tz;
        this.A02 = c2u1;
        this.A06 = c4Eo;
    }

    public C2u2(Context context, C2ty c2ty, C2u1 c2u1, C2tx c2tx, C2tz c2tz, C00i c00i, String str) {
        this(context, c2ty, c2u1, c2tx, c2tz, c00i, null, str);
    }

    public static AnonymousClass409 A00(C10404ta c10404ta, C2u2 c2u2) {
        HttpUriRequest A00 = c10404ta.A00();
        1Du it = c10404ta.A05.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            A00.addHeader(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
        }
        HttpClientParams.setRedirecting(A00.getParams(), true);
        final C2ty c2ty = c2u2.A01;
        final Uri uri = c10404ta.A00;
        c2ty.A07(uri.toString());
        final C4j5 c4j5 = c10404ta.A03;
        final C00i c00i = c2u2.A05;
        final C2tz c2tz = c2u2.A04;
        final C2u1 c2u1 = c2u2.A02;
        final boolean z = false;
        AnonymousClass407 A002 = AnonymousClass409.A00(c2u2.A07, new ResponseHandler(uri, c2ty, c2u1, c2tz, c00i, c4j5, z) { // from class: X.4j6
            public final C00i A00;
            public final Uri A01;
            public final C2ty A02;
            public final C2u1 A03;
            public final C2tz A04;
            public final C07194j4 A05;
            public final C4j5 A06;
            public final boolean A07;

            {
                this.A01 = uri;
                this.A06 = c4j5;
                this.A05 = c4j5 instanceof C07194j4 ? (C07194j4) c4j5 : null;
                this.A02 = c2ty;
                this.A00 = c00i;
                this.A04 = c2tz;
                this.A03 = c2u1;
                this.A07 = z;
            }

            @Override // org.apache.http.client.ResponseHandler
            public Object handleResponse(HttpResponse httpResponse) {
                Object BMZ;
                3xY r308;
                Integer num = 0S2.A0u;
                String obj = this.A01.toString();
                StatusLine statusLine = httpResponse.getStatusLine();
                int statusCode = statusLine.getStatusCode();
                HttpEntity entity = httpResponse.getEntity();
                boolean z2 = statusCode == 200 || (this.A07 && statusCode == 206);
                if (!z2 || entity == null) {
                    URI create = URI.create(obj);
                    StringBuilder sb = new StringBuilder();
                    sb.append(create.getScheme());
                    sb.append('_');
                    sb.append(create.getHost());
                    sb.append('_');
                    sb.append("MediaDownloader (HTTP code)");
                    sb.append('_');
                    sb.append(statusCode);
                    ((5UX) this.A00.get()).A00(sb.toString());
                    if (z2) {
                        throw new ClientProtocolException("Missing HTTP entity");
                    }
                    throw new HttpResponseException(statusCode, statusLine.getReasonPhrase());
                }
                C2ty c2ty2 = this.A02;
                if (C2ty.A00(c2ty2)) {
                    c2ty2.A05("total_succeed", 1L);
                    Number number = (Number) c2ty2.A00.remove(obj);
                    if (number != null) {
                        int intValue = number.intValue();
                        c2ty2.A05(intValue != 1 ? intValue != 2 ? intValue != 3 ? "succeed_on_fourth_onward_try" : "succeed_on_third_try" : "succeed_on_second_try" : "succeed_on_first_try", 1L);
                    }
                }
                InputStream content = entity.getContent();
                try {
                    if (this.A07) {
                        C07194j4 c07194j4 = this.A05;
                        if (c07194j4 != null) {
                            if (statusCode == 206) {
                                String value = httpResponse.getFirstHeader("Content-Range").getValue();
                                if (value == null) {
                                    r308 = null;
                                } else {
                                    try {
                                        Object value2 = 3xY.A02.getValue();
                                        11T.A0A(value2);
                                        String[] split = ((Pattern) value2).split(value);
                                        1BK.A1S(AnonymousClass001.A1Q(split.length, 4));
                                        1BK.A1S(11T.A0O(split[0], "bytes"));
                                        String str = split[1];
                                        11T.A07(str);
                                        int parseInt = Integer.parseInt(str);
                                        String str2 = split[2];
                                        11T.A07(str2);
                                        int parseInt2 = Integer.parseInt(str2);
                                        String str3 = split[3];
                                        11T.A07(str3);
                                        int parseInt3 = Integer.parseInt(str3);
                                        1BK.A1S(4YV.A1X(parseInt2, parseInt));
                                        1BK.A1S(4YV.A1X(parseInt3, parseInt2));
                                        if (parseInt2 < parseInt3 - 1) {
                                            new 3xY(parseInt, parseInt2);
                                        } else {
                                            new 3xY(parseInt, (-1) >>> 1);
                                        }
                                    } catch (IllegalArgumentException e) {
                                        String format = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{value}, 1));
                                        11T.A0A(format);
                                        throw new IllegalArgumentException(format, e);
                                    }
                                }
                            } else {
                                r308 = null;
                            }
                            C07194j4.A00(r308, c07194j4, content, num, C2tz.A00(httpResponse));
                            BMZ = 04S.A00;
                            content.close();
                            return BMZ;
                        }
                    }
                    BMZ = this.A06.BMZ(content, num, C2tz.A00(httpResponse));
                    content.close();
                    return BMZ;
                } catch (Throwable th) {
                    content.close();
                    throw th;
                }
            }
        }, A00);
        A002.A04 = c10404ta.A01;
        A002.A09 = "MediaDownloader";
        A002.A08 = 0S2.A01;
        A002.A06 = c10404ta.A02;
        return A002.A00();
    }

    public static InputStream A01(Uri uri, C2u2 c2u2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Downloading media from generic content resolver: ");
        sb.append(uri);
        0fH.A0A(C2u2.class, sb.toString());
        InputStream openInputStream = c2u2.A00.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            return openInputStream;
        }
        throw new FileNotFoundException(AnonymousClass001.A0Z(uri, "Media not found: ", AnonymousClass001.A0k()));
    }

    public Object A02(C10404ta c10404ta) {
        InputStream A01;
        Object BMZ;
        int ordinal = c10404ta.A04.ordinal();
        try {
            if (ordinal == 2) {
                Uri uri = c10404ta.A00;
                if ("com.android.contacts".equals(uri.getAuthority())) {
                    0fH.A0A(C2u2.class, AnonymousClass001.A0Z(uri, "Downloading contact photo from: ", AnonymousClass001.A0k()));
                    if (!uri.getPath().startsWith(ContactsContract.DisplayPhoto.CONTENT_URI.getPath())) {
                        A01 = ContactsContract.Contacts.openContactPhotoInputStream(this.A00.getContentResolver(), uri);
                        if (A01 == null) {
                            throw new FileNotFoundException(AnonymousClass001.A0Z(uri, "Contact photo not found: ", AnonymousClass001.A0k()));
                        }
                        BMZ = c10404ta.A03.BMZ(A01, 0S2.A0u, -1);
                    }
                }
                A01 = A01(uri, this);
                BMZ = c10404ta.A03.BMZ(A01, 0S2.A0u, -1);
            } else {
                if (ordinal == 3) {
                    Uri uri2 = c10404ta.A00;
                    0fH.A07(C2u2.class, uri2, "Downloading media from encrypted image pipeline: %s");
                    C4Eo c4Eo = this.A06;
                    if (c4Eo == null) {
                        throw new FileNotFoundException(AnonymousClass001.A0Z(uri2, "Media manager is not available for downloadResultFromEncryptedImagePipeline: ", AnonymousClass001.A0k()));
                    }
                    1xH A00 = c4Eo.A00(uri2);
                    try {
                        A00.A01.await(5, TimeUnit.SECONDS);
                    } catch (InterruptedException unused) {
                    }
                    Uri uri3 = (Uri) A00.A00;
                    if (uri3 == null) {
                        throw new FileNotFoundException(AnonymousClass001.A0m(uri2, "Media not found: ").toString());
                    }
                    A01 = this.A00.getContentResolver().openInputStream(uri3);
                    try {
                        if (A01 == null) {
                            throw new FileNotFoundException(AnonymousClass001.A0m(uri2, "Media not found: ").toString());
                        }
                        BMZ = c10404ta.A03.BMZ(A01, 0S2.A0u, -1);
                        A01.close();
                        return BMZ;
                    } catch (Throwable th) {
                        th = th;
                        if (A01 != null) {
                            try {
                                A01.close();
                                throw th;
                            } catch (Throwable th2) {
                                7kF.A00(th, th2);
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                if (ordinal != 4) {
                    return this.A03.A02(A00(c10404ta, this));
                }
                File file = new File(c10404ta.A00.getPath());
                A01 = new FileInputStream(file);
                BMZ = c10404ta.A03.BMZ(A01, 0S2.A0u, file.length());
            }
            A01.close();
            return BMZ;
        } catch (Throwable th3) {
            th = th3;
            A01.close();
        }
    }
}
