package X;

import android.net.Uri;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.graphql.enums.GraphQLRRTagType;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.messaging.integrity.frx.proactivewarning.model.ProactiveWarningInfo;
import com.facebook.messaging.media.download.params.response.DownloadedMedia;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: ABf.class */
public final class ABf implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ABf(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public static final int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1685223282) {
            if (hashCode == -843422361 && str.equals("IN_THREAD_BANNER")) {
                return 0;
            }
        } else if (str.equals("COMPOSER_BLOCK")) {
            return 1;
        }
        0fH.A18("ProactiveWarningNetworkDataParser", "GraphQL proactive warning style %s is unknown", new Object[]{str});
        return -1;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Uri uri;
        String str;
        Object obj2;
        ImmutableList A0c;
        2JY r0;
        Enum A0g;
        2JY A0B;
        2JY A0R;
        String A0t;
        String str2;
        String str3;
        String str4;
        int A00;
        String A0i;
        String str5;
        String A0i2;
        String A18;
        2JY A0B2;
        String A0i3;
        2JY r02;
        Enum A0g2;
        2JY A0B3;
        2JY A0R2;
        String A0t2;
        2JY A0B4;
        2JY A0B5;
        String A0i4;
        switch (this.A00) {
            case 0:
                DownloadedMedia downloadedMedia = (DownloadedMedia) obj;
                6RU r03 = (6RU) ((Reference) this.A01).get();
                if (r03 == null) {
                    return null;
                }
                InputContentInfoCompat inputContentInfoCompat = (InputContentInfoCompat) this.A02;
                if (downloadedMedia == null || (uri = downloadedMedia.A00) == null) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Error downloading commit content uri ");
                    A0k.append(inputContentInfoCompat.getContentUri());
                    A0k.append(", media result ");
                    0fH.A0k("PhotoMessageConverter", AnonymousClass001.A0d(downloadedMedia != null ? R0r.A00(downloadedMedia.A01) : "n/a", A0k));
                    return null;
                }
                if (inputContentInfoCompat.getDescription().getMimeTypeCount() > 0) {
                    str = inputContentInfoCompat.getDescription().getMimeType(0);
                    if (str == null) {
                        throw 1BK.A0h();
                    }
                } else {
                    str = "";
                }
                72H r04 = (72H) 1Bu.A06(r03.A00, 65954);
                C5fp c5fp = new C5fp();
                if (!r04.A00(c5fp)) {
                    return null;
                }
                5wW r05 = new 5wW();
                r05.A0H = 0CU.A0T(str, "gif", false);
                r05.A02(str);
                r05.A03(uri.toString());
                c5fp.A00 = 7zN.A0e(new Photo(r05));
                return c5fp;
            case 1:
                GraphQLResult graphQLResult = (GraphQLResult) obj;
                7Pz r06 = (7Pz) this.A01;
                C7Q1 c7q1 = (C7Q1) this.A02;
                synchronized (r06) {
                    6mO r07 = r06.A00;
                    if (r07 != null && graphQLResult != null) {
                        C5yl c5yl = c7q1.A02;
                        if (c5yl == C5yl.A0G) {
                            synchronized (r07) {
                                if (6mO.A00(r07) && !r07.A00) {
                                    r07.A00 = true;
                                    r07.A05.A00(graphQLResult, 7Pw.A02);
                                }
                            }
                        } else if (c5yl == C5yl.A0H) {
                            synchronized (r07) {
                                if (6mO.A00(r07) && !r07.A01) {
                                    r07.A01 = true;
                                    r07.A05.A00(graphQLResult, 7Pw.A03);
                                }
                            }
                        }
                    }
                }
                if (graphQLResult == null || (obj2 = ((AbstractC08294mh) graphQLResult).A03) == null) {
                    return null;
                }
                1Br.A0C(((9Zj) this.A03).A04);
                if (2JX.A0A(-1874306868, obj2)) {
                    ImmutableList A0c2 = ((2JY) obj2).A0c(-754814753, 2JX.class, -634702998);
                    if (A0c2 == null || (r02 = (2JY) 0QD.A0E(A0c2)) == null || (A0g2 = r02.A0g(GraphQLRRTagType.A01, 50511102)) == null || (A0B3 = 1BK.A0B(r02, 2JX.class, -2060497896, 1456241305)) == null || (A0R2 = r02.A0R(2JX.class, -1533078445)) == null || (A0t2 = r02.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerProactiveWarningStyle", 1924795214)) == null || (A0B4 = 1BK.A0B(r02, 2JX.class, 947624312, -121656581)) == null) {
                        return null;
                    }
                    str2 = null;
                    str3 = null;
                    str5 = "";
                    A00 = A00(A0t2);
                    A0i = A0R2.A0i();
                    if (A0i == null) {
                        A0i = str5;
                    }
                    A0i2 = A0B3.A0i();
                    if (A0i2 == null) {
                        A0i2 = str5;
                    }
                    String valueOf = String.valueOf(A0g2);
                    Locale locale = Locale.US;
                    11T.A0B(locale);
                    A18 = 4YU.A18(locale, valueOf);
                    str4 = A0B4.A0k();
                    if (str4 == null) {
                        str4 = str5;
                    }
                    String A0r = r02.A0r(870073906);
                    str5 = A0r != null ? A0r : "";
                    ImmutableList A0c3 = r02.A0c(241352577, 2JX.class, 137061831);
                    ArrayList A0y = 7zO.A0y(A0c3);
                    Iterator it = A0c3.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        2JY r08 = (2JY) next;
                        if (r08 != null && (A0B5 = 1BK.A0B(r08, 2JX.class, 102727412, 1537751779)) != null && (A0i4 = A0B5.A0i()) != null && A0i4.length() != 0) {
                            A0y.add(next);
                        }
                    }
                    Iterator it2 = A0y.iterator();
                    while (it2.hasNext()) {
                        2JY A0P = 7zL.A0P(it2);
                        String A0t3 = A0P.A0t(GraphQLStringDefUtil.A00(), 1BJ.A00(37), -1759391705);
                        if (A0t3 != null) {
                            int hashCode = A0t3.hashCode();
                            if (hashCode != 403216866) {
                                if (hashCode == 1968996692 && A0t3.equals("SECONDARY")) {
                                    2JY A0B6 = 1BK.A0B(A0P, 2JX.class, 102727412, 1537751779);
                                    if (A0B6 == null) {
                                        throw AnonymousClass001.A0N("Required value was null.");
                                    }
                                    str3 = A0B6.A0i();
                                }
                            } else if (A0t3.equals("PRIMARY")) {
                                2JY A0B7 = 1BK.A0B(A0P, 2JX.class, 102727412, 1537751779);
                                if (A0B7 == null) {
                                    throw AnonymousClass001.A0N("Required value was null.");
                                }
                                str2 = A0B7.A0i();
                            } else {
                                continue;
                            }
                        }
                    }
                } else {
                    if (!2JX.A0A(17896409, obj2) || (A0c = ((2JY) obj2).A0c(-2066676923, 2JX.class, -853509036)) == null || (r0 = (2JY) 0QD.A0E(A0c)) == null || (A0g = r0.A0g(GraphQLRRTagType.A01, 50511102)) == null || (A0B = 1BK.A0B(r0, 2JX.class, -2060497896, 1141017779)) == null || (A0R = r0.A0R(2JX.class, 1995960943)) == null || (A0t = r0.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerProactiveWarningStyle", 1924795214)) == null) {
                        return null;
                    }
                    str2 = null;
                    str3 = null;
                    str4 = "";
                    A00 = A00(A0t);
                    A0i = A0R.A0i();
                    str5 = str4;
                    if (A0i == null) {
                        A0i = str4;
                    }
                    A0i2 = A0B.A0i();
                    if (A0i2 == null) {
                        A0i2 = str4;
                    }
                    String valueOf2 = String.valueOf(A0g);
                    Locale locale2 = Locale.US;
                    11T.A0B(locale2);
                    A18 = 4YU.A18(locale2, valueOf2);
                    String A0r2 = r0.A0r(870073906);
                    if (A0r2 != null) {
                        str5 = A0r2;
                    }
                    ImmutableList A0c4 = r0.A0c(241352577, 2JX.class, 759194262);
                    ArrayList A0y2 = 7zO.A0y(A0c4);
                    Iterator it3 = A0c4.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        2JY r09 = (2JY) next2;
                        if (r09 != null && (A0B2 = 1BK.A0B(r09, 2JX.class, 102727412, -1589088517)) != null && (A0i3 = A0B2.A0i()) != null && A0i3.length() != 0) {
                            A0y2.add(next2);
                        }
                    }
                    Iterator it4 = A0y2.iterator();
                    while (it4.hasNext()) {
                        2JY A0P2 = 7zL.A0P(it4);
                        String A0t4 = A0P2.A0t(GraphQLStringDefUtil.A00(), 1BJ.A00(37), -1759391705);
                        if (A0t4 != null) {
                            int hashCode2 = A0t4.hashCode();
                            if (hashCode2 != 403216866) {
                                if (hashCode2 == 1968996692 && A0t4.equals("SECONDARY")) {
                                    2JY A0B8 = 1BK.A0B(A0P2, 2JX.class, 102727412, -1589088517);
                                    if (A0B8 == null) {
                                        throw AnonymousClass001.A0N("Required value was null.");
                                    }
                                    str3 = A0B8.A0i();
                                }
                            } else if (A0t4.equals("PRIMARY")) {
                                2JY A0B9 = 1BK.A0B(A0P2, 2JX.class, 102727412, -1589088517);
                                if (A0B9 == null) {
                                    throw AnonymousClass001.A0N("Required value was null.");
                                }
                                str2 = A0B9.A0i();
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return new ProactiveWarningInfo(A18, str5, str2, str4, str3, A0i2, A0i, A00);
            case 2:
                if (obj == null) {
                    return this.A03;
                }
                ((C66p) this.A01).A03.CZv(this.A02, obj);
                return obj;
            default:
                MediaResource mediaResource = (MediaResource) ((OperationResult) obj).A08();
                if (mediaResource == null) {
                    return null;
                }
                ArrayList A0s = AnonymousClass001.A0s();
                MediaResource mediaResource2 = (MediaResource) this.A02;
                A0s.add(String.valueOf(mediaResource2.A04));
                A0s.add(String.valueOf(mediaResource2.A00));
                A0s.add(String.valueOf(mediaResource.A04));
                A0s.add(String.valueOf(mediaResource.A00));
                A0s.add(String.valueOf(mediaResource2.A08));
                A0s.add(String.valueOf(mediaResource2.A07));
                Object obj3 = this.A03;
                Integer num = 0S2.A00;
                5HQ r010 = ((5Hv) this.A01).A0E;
                if (obj3 == num) {
                    r010.A03(mediaResource2, mediaResource);
                    return null;
                }
                C1ko c1ko = r010.A01;
                synchronized (c1ko) {
                    c1ko.CZv(81I.A00(mediaResource2), new HaY(mediaResource, true));
                }
                return null;
        }
    }
}
