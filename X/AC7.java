package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.leadgen.plugins.quickreplydataloader.leadform.LeadFormIceBreakerDataLoaderImplementation;
import com.facebook.messaging.media.download.params.response.DownloadedMedia;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.lang.ref.Reference;
import java.util.concurrent.TimeUnit;

/* loaded from: AC7.class */
public final class AC7 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AC7(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public static 1Ql A00(2kS r301) {
        return 2kS.A00(r301).edit();
    }

    public static void A01(1Ql r301, 1G9 r302, String str, double d) {
        r301.Ca7(r302.A0F(str), d);
        r301.commit();
    }

    public void onFailure(Throwable th) {
        Object obj;
        switch (this.A00) {
            case 0:
                0fH.A0k("MessengerInboxTrayValueModelWeightsFetcher", "Failed to fetch value model weights");
                return;
            case 1:
                6Ry.A00(((LeadFormIceBreakerDataLoaderImplementation) this.A02).A05.A00);
                return;
            case 2:
                6JH r0 = (6JH) this.A01;
                ((6Ii) r0.A03.get()).A02(0S2.A03, this.A03);
                DR6 A02 = ((C5ic) r0.A02.get()).A02((Context) this.A02);
                A02.A00(2131959143);
                A02.A06(2131959142);
                A02.A0A((DialogInterface.OnClickListener) null);
                7zN.A13(A02);
                return;
            case 3:
                7zQ.A16((Context) this.A02, 2131960165);
                return;
            default:
                11T.A0F(th, 0);
                Integer num = (Integer) this.A02;
                switch (num.intValue()) {
                    case 0:
                        obj = "DOWNLOADED_STICKER_PACKS";
                        break;
                    case 1:
                        obj = "STICKERS_FOR_STICKER_PACK";
                        break;
                    case 2:
                        obj = "RECENT_STICKERS";
                        break;
                    case 3:
                        obj = "RECENT_STICKERS_INITIAL";
                        break;
                    case 4:
                        obj = "FAVORITE_STICKERS";
                        break;
                    case 5:
                        obj = "STICKER_SEARCH_TAGS";
                        break;
                    case 6:
                        obj = "AVATAR_STICKERS";
                        break;
                    case 7:
                        obj = "UNSEEN_STICKER_PACKS";
                        break;
                    default:
                        obj = "TRENDING_STICKERS";
                        break;
                }
                0fH.A11("StickerFetchProviderImpl", "Fetching %s failed", th, new Object[]{obj});
                6RU r02 = (6RU) ((Reference) this.A01).get();
                if (r02 != null) {
                    7FI.A02(r02, R40.A00(num, ImmutableList.of(), this.A03));
                    return;
                }
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Resources resources;
        int i;
        Object obj2;
        2JY A0B;
        TreeJNI A0L;
        2JY r0;
        2JY A0U;
        ImmutableList A0c;
        String A0r;
        String A0r2;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                0fH.A0j("MessengerInboxTrayValueModelWeightsFetcher", "Successfully fetched value model weights");
                if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0B = 1BK.A0B((2JY) obj2, 2JX.class, -144621570, -1327592472)) == null || (A0L = A0B.A0L(1230441723, 2JX.class, 1852160846)) == null) {
                    return;
                }
                0fH.A0g(abstractC08294mh.A01, "MessengerInboxTrayValueModelWeightsFetcher", "Freshness: %s");
                if (A0B.hasFieldValue(-1173501914)) {
                    2kS r02 = (2kS) this.A02;
                    String str = this.A03;
                    long millis = TimeUnit.SECONDS.toMillis(A0B.getTimeValue(-1173501914));
                    1Ql A00 = A00(r02);
                    A00.CaH(2kS.A09.A0F(str), millis);
                    A00.commit();
                    A01(A00(r02), 2kS.A08, str, A0L.getDoubleValue(-308731332));
                    A01(A00(r02), 2kS.A05, str, A0L.getDoubleValue(-1098879691));
                    A01(A00(r02), 2kS.A02, str, A0L.getDoubleValue(-34839492));
                    A01(A00(r02), 2kS.A06, str, A0L.getDoubleValue(-238115686));
                    A01(A00(r02), 2kS.A04, str, A0L.getDoubleValue(1460421217));
                    A01(A00(r02), 2kS.A03, str, A0L.getDoubleValue(-1566679829));
                    A01(A00(r02), 2kS.A01, str, A0L.getDoubleValue(1588276954));
                    A01(A00(r02), 2kS.A0C, str, A0L.getDoubleValue(1785673986));
                    A01(A00(r02), 2kS.A0B, str, A0L.getDoubleValue(-2007839052));
                    A01(A00(r02), 2kS.A07, str, A0L.getDoubleValue(1705325163));
                    String A0r3 = A0B.A0r(37109963);
                    if (A0r3 != null) {
                        1Ql A002 = A00(r02);
                        A002.CaL(2kS.A0A.A0F(str), A0r3);
                        A002.commit();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                ThreadKey threadKey = null;
                if (abstractC08294mh2 == null || (r0 = (2JY) abstractC08294mh2.A03) == null || (A0U = r0.A0U(2JX.class, 1224167242)) == null || (A0c = A0U.A0c(-2076062838, 2JX.class, 837367121)) == null || A0c.isEmpty() || (A0r = ((2JY) A0c.get(0)).A0r(-605411181)) == null || A0r.length() == 0 || (A0r2 = ((2JY) A0c.get(0)).A0r(-605411181)) == null) {
                    return;
                }
                LeadFormIceBreakerDataLoaderImplementation leadFormIceBreakerDataLoaderImplementation = (LeadFormIceBreakerDataLoaderImplementation) this.A02;
                ThreadSummary threadSummary = (ThreadSummary) this.A01;
                if (LeadFormIceBreakerDataLoaderImplementation.A00(leadFormIceBreakerDataLoaderImplementation, threadSummary)) {
                    return;
                }
                C9a9 c9a9 = new C9a9();
                c9a9.A0C = ((2JY) A0c.get(0)).A0r(-1165870106);
                c9a9.A02 = 8AN.A04;
                c9a9.A03 = 8AJ.A02;
                2DM r03 = new 2DM(C26T.A00);
                r03.A0o("lead_form_id", A0r2);
                c9a9.A06 = r03;
                c9a9.A08 = 0S2.A0C;
                QuickReplyItem quickReplyItem = new QuickReplyItem(c9a9);
                6Rz r04 = 6Rz.A02;
                ImmutableList copyOf = ImmutableList.copyOf(new QuickReplyItem[]{quickReplyItem});
                11T.A0A(copyOf);
                if (threadSummary != null) {
                    threadKey = threadSummary.A0n;
                }
                6Rz r05 = new 6Rz(threadKey, copyOf);
                String str2 = this.A03;
                1UG A08 = 1BK.A08(1Br.A02(leadFormIceBreakerDataLoaderImplementation.A02), "in_thread_lead_form_icebreaker_impression");
                if (A08.isSampled()) {
                    4YU.A1H(A08, Long.parseLong(str2));
                    A08.A6H(4YT.A00(344), 1BK.A0n(A0r2));
                    A08.BZL();
                }
                6S0 r06 = leadFormIceBreakerDataLoaderImplementation.A05;
                r06.A01(r05);
                r06.A00();
                return;
            case 2:
                return;
            case 3:
                DownloadedMedia downloadedMedia = (DownloadedMedia) obj;
                String str3 = this.A03;
                if (str3 == null) {
                    int intValue = downloadedMedia.A01.intValue();
                    if (intValue == 0) {
                        resources = ((Context) this.A02).getResources();
                        i = 2131960166;
                    } else if (intValue == 1) {
                        resources = ((Context) this.A02).getResources();
                        i = 2131960164;
                    } else if (intValue != 2) {
                        str3 = "";
                    } else {
                        resources = ((Context) this.A02).getResources();
                        i = 2131960165;
                    }
                    str3 = resources.getString(i);
                }
                7zR.A0z((Context) this.A02, str3);
                return;
            default:
                6RU r07 = (6RU) ((Reference) this.A01).get();
                if (r07 != null) {
                    7FI.A02(r07, R40.A00((Integer) this.A02, obj, this.A03));
                    return;
                }
                return;
        }
    }
}
